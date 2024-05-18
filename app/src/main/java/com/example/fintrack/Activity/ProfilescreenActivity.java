package com.example.fintrack.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.fintrack.Database.DBhelper;
import com.example.fintrack.Model.Person;
import com.example.fintrack.R;
import com.example.fintrack.Utils.AccessMediaUtil;
import com.example.fintrack.Utils.AlertDialog;
import com.example.fintrack.Utils.SharepreferenceUtils;
import com.example.fintrack.databinding.ActivityProfilescreenBinding;

import static com.example.fintrack.Utils.AccessMediaUtil.ACCESS_CAMERA_GALLERY;

public class ProfilescreenActivity extends AppCompatActivity {

    ActivityProfilescreenBinding binding;
    SharepreferenceUtils sharepreferenceUtils;
    private Person personData;
    private AlertDialog dialog;
    DBhelper dBhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_profilescreen);
        sharepreferenceUtils=new SharepreferenceUtils(this);
        dBhelper=new DBhelper(this);
        personData=sharepreferenceUtils.getPerson();
        dialog = new AlertDialog(ProfilescreenActivity.this);
        binding.txtfName.setText(personData.getFirstname());
        binding.txtlName.setText(personData.getLastname());
        binding.txtMobile.setText(personData.getPhone());
        binding.txtEmail.setText(personData.getEmail());


        Glide.with(this).load(sharepreferenceUtils.getStringData("photo")).placeholder(R.drawable.profile).into(binding.profileImage);

        binding.btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        binding.profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gallery_Intent = new Intent(ProfilescreenActivity.this, AccessMediaUtil.class);

                startActivityForResult(gallery_Intent, ACCESS_CAMERA_GALLERY);

            }
        });
        binding.btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.txtfName.getText().toString().trim().isEmpty()){
                    dialog.ShowValidationAlertDialog("Please enter the Firstname");
                }else if(binding.txtlName.getText().toString().trim().isEmpty()){
                    dialog.ShowValidationAlertDialog("Please enter the Lastname");
                }else if(binding.txtMobile.getText().toString().trim().isEmpty()){
                    dialog.ShowValidationAlertDialog("Please enter the mobile");
                }else{
                    Person person=personData;
                    person.setFirstname(binding.txtfName.getText().toString().trim());
                    person.setLastname(binding.txtlName.getText().toString().trim());
                    person.setPhone(binding.txtMobile.getText().toString().trim());
                    sharepreferenceUtils.setPerson(person);
                    dBhelper.updatePersonData(dBhelper.getWritableDatabase(),personData,binding.txtEmail.getText().toString());
                    Toast.makeText(ProfilescreenActivity.this,"Data Update Successfully",Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && data != null) {

            String filePath = data.getStringExtra("picturePath");
            sharepreferenceUtils.saveStringData("photo",filePath);
            Glide.with(this).load(filePath).placeholder(R.drawable.profile).into(binding.profileImage);


        }
    }
}