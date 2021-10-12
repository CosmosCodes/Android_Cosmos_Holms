package com.example.cosmosholms;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textview.MaterialTextView;

public class sort_by_age extends AppCompatActivity {

    ConstraintLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_by_age);

        root = findViewById(R.id.root_element);
    }


    public void backToActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void logIn(View view) {
        EditText email = (EditText) findViewById(R.id.textEmailAddress);
        EditText pass = (EditText) findViewById(R.id.textPassword);
        String getEmail = email.getText().toString();

        if (isValidEmail(getEmail) && !pass.getText().toString().equals("")) {
            Snackbar.make(root, "Вход выполнен!", Snackbar.LENGTH_LONG).show();
        }
        else{
            ShowLogInCheckWindow();
        }
    }

    private void ShowLogInCheckWindow() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("хз зачем это");
        Snackbar.make(root, "Неверные данные", Snackbar.LENGTH_LONG).show();
    }

    public final static boolean isValidEmail(CharSequence target) {
        return !TextUtils.isEmpty(target) && android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }
}