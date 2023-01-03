package com.example.rgr;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private Button acceptIntType;
    private Button acceptPoint2DType;
    private Button closeBtn;

    @SuppressLint("MissingInflatedId")
    public void createNewUserTypeDialog()
    {
        dialogBuilder = new AlertDialog.Builder(this);
        final View createNewUserTypePopupView = getLayoutInflater().inflate(R.layout.selectusertype_popup, null);
        acceptIntType = (Button) createNewUserTypePopupView.findViewById(R.id.selectIntPopup);
        acceptPoint2DType = (Button) createNewUserTypePopupView.findViewById(R.id.selectPoint2DPopup);
        closeBtn = (Button) createNewUserTypePopupView.findViewById(R.id.closePopup);

        dialogBuilder.setView(createNewUserTypePopupView);
        dialog = dialogBuilder.create();
        dialog.show();

        acceptIntType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // define create Int objects
            }
        });

        acceptPoint2DType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // define create Point2D objects
            }
        });

        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createNewUserTypeDialog();
    }
}