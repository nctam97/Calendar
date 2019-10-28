package com.example.calendar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_nhap, btn_luu, btn_capnhat, btn_xoa, btn_thoat;
    Dialog dialog;
    EditText edt_tieude, edt_noidung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_luu=(Button) findViewById(R.id.btn_luu);
        btn_capnhat=(Button) findViewById(R.id.btn_capnhat);
        btn_xoa=(Button) findViewById(R.id.btn_xoa);
        btn_thoat=(Button) findViewById(R.id.btn_thoat);
        edt_tieude=(EditText) findViewById(R.id.edt_tieude);
        edt_noidung=(EditText) findViewById(R.id.edt_noidung);
        btn_nhap=(Button) findViewById(R.id.btn_nhaptt);

        btn_nhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenuDialog();
            }
        });
    }
    private void showMenuDialog(){
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.activity_thongtin);
        dialog.setTitle("GHI CHÚ");

        dialog.show();
    }
}
