package com.example.fintrack.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.bumptech.glide.Glide;
import com.example.fintrack.Adapters.TransactionAdapter;
import com.example.fintrack.Database.DBhelper;
import com.example.fintrack.Model.Person;
import com.example.fintrack.Model.Transactions;
import com.example.fintrack.R;
import com.example.fintrack.Utils.AlertDialog;
import com.example.fintrack.Utils.SharepreferenceUtils;
import com.example.fintrack.databinding.HomescreenBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.core.widget.NestedScrollView;

import java.util.ArrayList;
import java.util.List;

public class HomeScreenActivity extends AppCompatActivity implements View.OnClickListener {

    private DBhelper dbHelper;
    AlertDialog logoutDialog;
    Context mcontext;
    private TransactionAdapter adapter;
    private HomescreenBinding binding;
    boolean doubleBackToExitPressedOnce = false;
    SharepreferenceUtils sharepreferenceUtils;
    Person personData;
    private ArrayList<Transactions> transactionList = new ArrayList<>();
    private double totalIncome = 0;
    private double totalExpense = 0;
    private double net = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = HomescreenBinding.inflate(getLayoutInflater());

        mcontext=this;
        dbHelper=new DBhelper(this);

        logoutDialog=new AlertDialog(mcontext);
        sharepreferenceUtils=new SharepreferenceUtils(mcontext);
        personData=sharepreferenceUtils.getPerson();

        binding.lnMenu.txtName.setText(personData.getFirstname()+" "+personData.getLastname());

        View view = binding.getRoot();
        setContentView(view);

        final FloatingActionButton extendedFloatingActionButton = findViewById(R.id.imgAddTrans);

        NestedScrollView nestedScrollView = findViewById(R.id.nestedScrollView);

        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if (scrollY > oldScrollY + 12 && extendedFloatingActionButton.isShown()) {
                    extendedFloatingActionButton.hide();
                }

                if (scrollY < oldScrollY - 12 && !extendedFloatingActionButton.isShown()) {
                    extendedFloatingActionButton.show();
                }

                if (scrollY == 0) {
                    extendedFloatingActionButton.show();
                }
            }
        });

        dbHelper = new DBhelper(this);

        binding.imgMenu.setOnClickListener(this);
        binding.lnMenu.lnProfile.setOnClickListener(this);
        binding.lnMenu.txthome.setOnClickListener(this);
        binding.lnMenu.ChangePass.setOnClickListener(this);
        binding.lnMenu.Contactus.setOnClickListener(this);
        binding.lnMenu.Aboutus.setOnClickListener(this);
        binding.lnMenu.logout.setOnClickListener(this);
        binding.imgAddTrans.setOnClickListener(this);

        new FetchTransactionsTask().execute();
    }

    @Override
    public void onClick(View view) {
        if (view == binding.imgMenu) {
            if (binding.drawerlayout.isDrawerOpen(GravityCompat.START)) {
                binding.drawerlayout.closeDrawer(GravityCompat.START);
            } else {
                binding.drawerlayout.openDrawer(GravityCompat.START);
            }
        } else if (view == binding.lnMenu.lnProfile) {
            binding.drawerlayout.closeDrawer(GravityCompat.START);
            Intent profile = new Intent(HomeScreenActivity.this, ProfilescreenActivity.class);
            startActivity(profile);
        } else if (view == binding.lnMenu.txthome) {
            binding.drawerlayout.closeDrawer(GravityCompat.START);
        } else if (view == binding.lnMenu.ChangePass) {
            binding.drawerlayout.closeDrawer(GravityCompat.START);
            Intent ChangePass = new Intent(HomeScreenActivity.this, ChangepasswordActivity.class);
            startActivity(ChangePass);
        } else if (view == binding.lnMenu.Contactus) {
            binding.drawerlayout.closeDrawer(GravityCompat.START);
            Intent contactus = new Intent(HomeScreenActivity.this, ContactusActivity.class);
            startActivity(contactus);
        } else if (view == binding.lnMenu.Aboutus) {
            binding.drawerlayout.closeDrawer(GravityCompat.START);
            Intent Aboutus = new Intent(HomeScreenActivity.this, AboutusActivity.class);
            startActivity(Aboutus);
        } else if (view == binding.lnMenu.logout) {
            binding.drawerlayout.closeDrawer(GravityCompat.START);
            logoutDialog.ShowLogoutAlertDialog(mcontext);
        } else if (view == binding.imgAddTrans) {
            Intent trans = new Intent(this, TransactionActivity.class);
            startActivityForResult(trans, 1001);
        }
    }

    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Glide.with(this).load(sharepreferenceUtils.getStringData("photo")).placeholder(R.drawable.profile).into(binding.lnMenu.profileImage);
        personData=sharepreferenceUtils.getPerson();
        binding.lnMenu.txtName.setText(personData.getFirstname()+" "+personData.getLastname());
    }

    private class FetchTransactionsTask extends AsyncTask<Void, Void, List<Transactions>> {
        @Override
        protected List<Transactions> doInBackground(Void... voids) {
            return dbHelper.getAllTransactions();
        }

        @Override
        protected void onPostExecute(List<Transactions> transactions) {
            super.onPostExecute(transactions);
            if (transactions != null && transactions.size() > 0) {
                transactionList.clear();
                transactionList.addAll(transactions);
                updateRecyclerView();
                calculateTotals(transactionList);
                binding.totalIncomeTextView.setText("" + totalIncome);
                binding.totalExpenseTextView.setText("" + totalExpense);
                binding.netTextView.setText("" + net);
            } else {
                Toast.makeText(HomeScreenActivity.this, "No transactions found", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void updateRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recTransactions.setLayoutManager(layoutManager);
        adapter = new TransactionAdapter(this, transactionList);
        binding.recTransactions.setAdapter(adapter);
    }

    private void calculateTotals(List<Transactions> transactions) {
        totalIncome = 0;
        totalExpense = 0;
        for (Transactions transaction : transactions) {
            if (transaction.getTrans_type().equals("1")) {
                totalIncome += transaction.getTrans_amount();
            } else {
                totalExpense += transaction.getTrans_amount();
            }
        }
        net = totalIncome - totalExpense;
        if (net >= 0) {
            binding.netTextView.setTextColor(getResources().getColor(R.color.green));
        } else {
            binding.netTextView.setTextColor(getResources().getColor(R.color.red));
        }
    }
}