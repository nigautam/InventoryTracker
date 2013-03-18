package com.example.inventorytracker;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;



public class Login extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        final EditText userName = (EditText) findViewById(R.id.editText1);
        final EditText password = (EditText) findViewById(R.id.editText2);
        Button submit = (Button) findViewById(R.id.button1);
        final CheckBox remember= (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox forget= (CheckBox) findViewById(R.id.checkBox2);
        
      
        //read in the username from the file
        final File dir = new File(Environment.getExternalStorageDirectory(), "Inventory Tracker");
        String getUserName = "";
        String getPass ="";
        if(dir.exists()) {                                 
  		  File input = new File(dir, "0.dat");
  		  try{
  			TripleDes d = new TripleDes();
  			
			FileInputStream fIn = new FileInputStream(input);
			BufferedReader br = new BufferedReader(
					new InputStreamReader(fIn));
			
			getUserName =br.readLine();
			getPass =br.readLine();
			br.close();
			fIn.close();
  		  	userName.setText(d.decrypt(getUserName));
  		  	password.setText(d.decrypt(getPass));
  		  	remember.setChecked(true);
  		  	forget.setChecked(false);
  		  }catch(IOException e){
  			  
  		  }catch(Exception e){
  			  
  		  }
        }
        
        //write file to remember the username
        remember.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if(remember.isChecked()){
            		if(checkLetters(userName.getText().toString()) && userName.getText().toString().length()>4){
	            	if(dir.exists()) {                                 
		    		  File out = new File(dir, "0.dat");
		    		  try{TripleDes d = new TripleDes();
		    			
		    			  FileOutputStream fos = new FileOutputStream(out);
							fos.write(d.encrypt(userName.getText().toString()).getBytes());
							fos.write(d.encrypt(password.getText().toString()).getBytes());
							fos.close();
							Toast.makeText(getApplicationContext(), "User name remembered", Toast.LENGTH_LONG).show();
							if(forget.isChecked())forget.setChecked(false);
		    		  }catch(IOException e){
	      			  
		    		  }catch(Exception e){
		    			  
		    		  }
	            	}}
            	else{remember.setChecked(false);
            	Toast.makeText(getApplicationContext(), "Please enter a username longer than 4 characters containing of letters only", Toast.LENGTH_LONG).show();
            		
            	}}
        }});
        
        //delete the file once the forget username check box is clicked
        forget.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if(forget.isChecked()){
            		 File dir = new File(Environment.getExternalStorageDirectory(), "Inventory Tracker");
            		 if(dir.exists()) {
            			 File input = new File(dir, "0.dat");
            			 if(input.exists()){
            			 input.delete();}
            			 userName.setText("");
            			 forget.setChecked(false);
            			 Toast.makeText(getApplicationContext(), "User name has been forgotten", Toast.LENGTH_LONG).show();
            			 if(remember.isChecked())remember.setChecked(false);
            			 
            		 }
            		
            	}
            }
        });
        
        
        
        //do stuff once the button is clicked
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if(isNetworkAvailable()){
            		
            	String name =userName.getText().toString();
            	String pwd = password.getText().toString();
            	boolean checkName = false;
            	if(userName.getText().toString().length()<5){
            	
            		Toast.makeText(getApplicationContext(), "Please enter a username longer than 4 characters", Toast.LENGTH_LONG).show();
            		checkName = true;
            	}
            	if(password.getText().toString().length()<8){
            		Toast.makeText(getApplicationContext(), "Please enter a password longer than 7 characters", Toast.LENGTH_LONG).show();
            		
            	}else{
            	if(checkLetters(name)==false){
            		
            		Toast.makeText(getApplicationContext(), "Please enter a username consisting of letters only", Toast.LENGTH_LONG).show();
            	}else{
            		
            		
            	if(remember.isChecked() && (checkName==false)){
            		File myDirectory = new File(Environment.getExternalStorageDirectory(), "Inventory Tracker");

            		if(!myDirectory.exists()) {                                 
            		  myDirectory.mkdirs();
            		}
            		File outputFile = new File(myDirectory, "0.dat");
            		try {
            			TripleDes d = new TripleDes();
              			
						FileOutputStream fos = new FileOutputStream(outputFile);
						fos.write(d.encrypt(name).getBytes());
						fos.write(d.encrypt(pwd).getBytes());
						fos.close();
						
						
						//******************    check the login info with server ***********************//
						
						
						showOtherActivity();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch(IOException e){
						e.printStackTrace();
					}catch(Exception e){
						
					}
            		
            	}}
            	
            }}else{
            	
            	Toast.makeText(getApplicationContext(), "Please make sure internet on your phone is working", Toast.LENGTH_LONG).show();
            }
            	
            }
            
        });
    }
    public static boolean checkLetters(String s){
    	char [] letter = s.toCharArray();
    	for(int i=0;i<letter.length;i++){
    		if(Character.isLetter(letter[i]) ==false)return false;
    	}
    	return true;
    }
    public void showOtherActivity(){
		Intent intent = new Intent(this, sales.class);
		startActivity(intent);
	}
    public boolean isNetworkAvailable() {
        ConnectivityManager cm = (ConnectivityManager) 
          getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        // if no network is available networkInfo will be null
        // otherwise check if we are connected
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    } 
}
