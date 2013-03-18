package com.example.inventorytracker;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class shipping extends Activity implements OnItemSelectedListener {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.shipping);
        final EditText name = (EditText)  findViewById(R.id.editText1);
        final EditText address = (EditText)  findViewById(R.id.editText2);
        final EditText phone = (EditText)  findViewById(R.id.editText3);
        final EditText email = (EditText)  findViewById(R.id.editText4);
        Button submit = (Button) findViewById(R.id.button1);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if(name.getText().toString().length()<4){
            		Toast.makeText(getApplicationContext(), "Please enter a correct name",Toast.LENGTH_LONG).show();
            	}else{if(address.getText().toString().length()<10){
            		Toast.makeText(getApplicationContext(), "Please enter a correct address",Toast.LENGTH_LONG).show();
            	}else{
            		
               		if(phone.getText().toString().length()<9){
            			Toast.makeText(getApplicationContext(), "Please enter a correct phone number",Toast.LENGTH_LONG).show();
            		}else{
            			if(email.getText().toString().length()<5){
            				Toast.makeText(getApplicationContext(), "Please enter a correct email address",Toast.LENGTH_LONG).show();
            			}else{
            				other();
            			}
            		}
            	}
            	}
            }});
        // Spinner click listener
        spinner.setOnItemSelectedListener(this);
 
        // Spinner Drop down elements
        ArrayList<String> categories = new ArrayList<String>();
        categories.add("Johnson & Johnson");
        categories.add("Samsung");
        categories.add("Apple");
        categories.add("New Client");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,long id) {
		
		EditText name = (EditText)  findViewById(R.id.editText1);
        EditText address = (EditText)  findViewById(R.id.editText2);
        EditText phone = (EditText)  findViewById(R.id.editText3);
        EditText email = (EditText)  findViewById(R.id.editText4);
		 String item = parent.getItemAtPosition(position).toString();
		 if(item.toLowerCase().contains("johnson")){
			 name.setText("Nikhil Gautam");
			 address.setText("12 Victoria street,\nToronto,Ontario");
			 phone.setText("4162569848");
			 email.setText("Nikhil@jnj.ca");
		 }else if(item.toLowerCase().contains("samsung")){
			 name.setText("Ashwin");
			 address.setText("12 Victoria street,\nToronto,Ontario");
			 phone.setText("416679585");
			 email.setText("Ashwin@Samsung.ca");
		 }else if(item.toLowerCase().contains("apple")){
			 name.setText("Mitchel");
			 address.setText("22 young street,\nToronto,Ontario");
			 phone.setText("4162782699");
			 email.setText("Mitchel@apple.ca");
		 }else if(item.toLowerCase().contains("new")){
			 name.setText("");
			 address.setText("");
			 phone.setText("");
			 email.setText("");
		 }
	        
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
public void other(){
	Intent s = new Intent(this, payment.class);
	startActivity(s);
}
}
