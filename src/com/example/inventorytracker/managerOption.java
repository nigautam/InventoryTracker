package com.example.inventorytracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class managerOption extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manageroption);
        final RadioGroup option =(RadioGroup) findViewById(R.id.radioOption);
        Button submit = (Button) findViewById(R.id.button1);
        submit.setOnClickListener(new OnClickListener() {
        	 
    		

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int selectedId = option.getCheckedRadioButtonId();
				RadioButton r = (RadioButton) findViewById(selectedId);
				if(r.getText().toString().toLowerCase().contains("sale")){
					showOtherActivity();
				}
				if(r.getText().toString().toLowerCase().contains("reporting")){ 
					showOtherActivity1();
				}
			}});
        
        
	}
	public void showOtherActivity(){
		Intent intent = new Intent(this, sales.class);
		startActivity(intent);
		
	}
	public void showOtherActivity1(){
		Intent intent = new Intent(this, reporting.class);
		startActivity(intent);
		
	}
	
}
