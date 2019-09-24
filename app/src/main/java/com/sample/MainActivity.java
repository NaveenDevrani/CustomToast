package com.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.devcoder.toast.CustomToast;
import com.devcoder.toast.FA;
import com.devcoder.toast.ToastBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_error_toast).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(1);
            }
        });
    }

    public void showToast(int number){
        String text="Just Some Text";
        CustomToast.makeText(this,text,CustomToast.LENGTH_SHORT,number,false).show();
        CustomToast.makeText(this,text,CustomToast.LENGTH_SHORT,number).show();
        CustomToast customToast=new ToastBuilder(this)
                .textSize(16)
                .leftIcon(R.drawable.confusing_shape)
                .textColor(Color.WHITE)
                .showTopIcon(true)
                .topIcon(FA.FA_ANGELLIST)
                .text("That's An Easy Toast")
                .type(CustomToast.SUCCESS)
                .build();
        customToast.show();
    }

}
