package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view) {
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        EditText edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
        txtFirstName.setText("First Name: " + edtTxtFirstName.getText());

        TextView txtLastName = findViewById(R.id.txtLastName);
        EditText edtTxtLastName = findViewById(R.id.edtTxtLastName);
        txtLastName.setText("Last Name: " + edtTxtLastName.getText());

        TextView txtEmail = findViewById(R.id.txtEmail);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);
        txtEmail.setText("Email: " + edtTxtEmail.getText());

        hideKeyboard(this);
    }

    public void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}