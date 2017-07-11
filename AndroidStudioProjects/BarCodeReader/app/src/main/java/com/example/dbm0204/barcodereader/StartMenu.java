package com.example.dbm0204.barcodereader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dbm0204.barcodereader.R;

import java.math.BigDecimal;

/**
 * Created by dbm0204 on 1/15/17.
 */

public class StartMenu extends Activity {
    static final class ProductData{
        String barCode;
        String format;
        String title;
        String Others;
        BigDecimal Price;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /*
        Button addButton =(Button) findViewById(R.id.);
         addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StartMenu.this,AddProduct.class))
            }
        });
        */
    }

}
