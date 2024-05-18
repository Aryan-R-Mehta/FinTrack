package com.example.fintrack.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.fintrack.Adapters.IncomeExpenseAdapter;
import com.example.fintrack.Database.DBhelper;
import com.example.fintrack.Model.Category;
import com.example.fintrack.R;
import com.example.fintrack.databinding.IncomeBinding;

import java.util.ArrayList;

public class AddIncomeExpenseActivity extends AppCompatActivity {
    IncomeBinding binding;
    ArrayList<Category> arrayList=new ArrayList<>();
    DBhelper dBhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.income);
        dBhelper=new DBhelper(AddIncomeExpenseActivity.this);

        if(getIntent().hasExtra("isFrom")){
            if(getIntent().getStringExtra("isFrom").equals("transaction")){
                binding.imgAdd.setVisibility(View.GONE);
            }
        }
        
        binding.btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        binding.spType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                new getData().execute();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }

    private void setAdapter() {


        binding.recTypes.setLayoutManager(new GridLayoutManager(this, 4));
        binding.recTypes.setItemAnimator(new DefaultItemAnimator());

        if (arrayList.size()>0) {
            if(getIntent().hasExtra("isFrom")){
                if(getIntent().getStringExtra("isFrom").equals("transaction")){
                    IncomeExpenseAdapter adapter = new IncomeExpenseAdapter(AddIncomeExpenseActivity.this,arrayList,true);
                    binding.recTypes.setAdapter(adapter);
                }
            }else{
                IncomeExpenseAdapter adapter = new IncomeExpenseAdapter(AddIncomeExpenseActivity.this,arrayList,false);
                binding.recTypes.setAdapter(adapter);
            }
        }
    }


    public void setResultData(Category model){
        Intent intent=getIntent();
        intent.putExtra("category",model);
        setResult(RESULT_OK,intent);
        finish();

    }


    private final class getData extends AsyncTask<Void, Void, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected String doInBackground(Void... params) {

            try {
                int type=0;
                if(binding.spType.getSelectedItem().equals("Income")){
                    type=1;
                }else{
                    type=0;
                }
                arrayList=dBhelper.getCategory(dBhelper.getReadableDatabase(),type);
            }catch (Exception e){

            }

            return "Executed";
        }

        @Override
        protected void onPostExecute(String result) {
            setAdapter();

        }
    }
}