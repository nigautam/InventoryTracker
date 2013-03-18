package com.example.inventorytracker;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class orderReview extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.review);
		final Context c = this;
        Intent intent = getIntent();
		//int amount[] = intent.getIntArrayExtra("value");
		String t1 = intent.getStringExtra("t1");
		
		TextView display = (TextView) findViewById(R.id.textView2);
		Button confirm = (Button) findViewById(R.id.button1);
		Button edit = (Button) findViewById(R.id.button2);
		//String order=amount[0]+" Wifi N router\n"+ amount[1]+" Wireless N card\n" + amount[2]+" 6 ft ethernet cable\n" + amount[3]+" Signal booster\n"+ amount[4]+" 120 GB Solid Sate Drive\n"+ amount[5]+" 4 GB RAM\n"+amount[6]+" 19\" LED Monitors";
		display.setText(t1);
		
		confirm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	showOtherActivity1();
            }});
		
		edit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	showOtherActivity();
            }});
		
     
        
	}
	 public void showOtherActivity(){
			Intent intent = new Intent(this, sales.class);
			startActivity(intent);
		}
	 public void showOtherActivity1(){
			Intent intent = new Intent(this, shipping.class);
			startActivity(intent);
		}
	
	
}
