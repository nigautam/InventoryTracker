package com.example.inventorytracker;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sales extends Activity {
	@Override
	public void onBackPressed() {
		System.exit(0);
	}
	static int amount[] = new int[6];
	
    
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.sales);
		final Context c = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sales);
        final TextView one = (TextView) findViewById(R.id.textView1);
        final TextView two = (TextView) findViewById(R.id.textView2);
        final TextView three = (TextView) findViewById(R.id.TextView3);
        final TextView four = (TextView) findViewById(R.id.TextView4);
        final TextView five = (TextView) findViewById(R.id.TextView5);
        final TextView six = (TextView) findViewById(R.id.TextView6);
        final TextView seven = (TextView) findViewById(R.id.TextView7);
        Button review = (Button) findViewById(R.id.button1);
        final EditText t1 = (EditText) findViewById(R.id.EditText1);
        final EditText t2 = (EditText) findViewById(R.id.editText2);
        final EditText t3 = (EditText) findViewById(R.id.EditText3);
        final EditText t4 = (EditText) findViewById(R.id.EditText4);
        final EditText t5 = (EditText) findViewById(R.id.editText5);
        final EditText t6 = (EditText) findViewById(R.id.EditText6);
        final EditText t7 = (EditText) findViewById(R.id.EditText7);
        final Intent intent = new Intent(this, orderReview.class);
		intent.putExtra("value", amount);
		intent.putExtra("t1", t1.getText());
		
        review.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	/*Toast.makeText(getApplicationContext(),t1.getText().toString(), Toast.LENGTH_SHORT).show();
            	Toast.makeText(getApplicationContext(), Integer.parseInt(t2.getText().toString()), Toast.LENGTH_SHORT).show();
            	Toast.makeText(getApplicationContext(), Integer.parseInt(t3.getText().toString()), Toast.LENGTH_SHORT).show();
            	Toast.makeText(getApplicationContext(), Integer.parseInt(t4.getText().toString()), Toast.LENGTH_SHORT).show();
            	Toast.makeText(getApplicationContext(), Integer.parseInt(t5.getText().toString()), Toast.LENGTH_SHORT).show();
            	Toast.makeText(getApplicationContext(), Integer.parseInt(t6.getText().toString()), Toast.LENGTH_SHORT).show();
            	Toast.makeText(getApplicationContext(), Integer.parseInt(t7.getText().toString()), Toast.LENGTH_SHORT).show();
            	amount[0]=t1.getText();	
            	amount[1]=Integer.parseInt(t2.getText().toString());
            	amount[2]=Integer.parseInt(t3.getText().toString());
            	amount[3]=Integer.parseInt(t4.getText().toString());
            	amount[4]=Integer.parseInt(t5.getText().toString());
            	amount[5]=Integer.parseInt(t6.getText().toString());
            	amount[6]=Integer.parseInt(t7.getText().toString());
            	*/
            	
            	startActivity(intent);
            	//showOtherActivity();
            	
            }
        });
        one.setClickable(true);
        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	alert("Enjoy a cost-effective, high performance solution for your small business network problems with the DSR-250 N Wireless N Gigabit VPN Router. Enabling clientless remote access using SSL VPN Tunnels, this router also beefs up your security options thanks to VPN Tunnels, IP Security, Point-to-Point Tunnelling Protocol and SSL.",c);
            }
        });
        two.setClickable(true);
        two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	alert("Xtreme N Dual Band PCI Express Desktop Adapter is a 802.11n wireless client that delivers unrivalled wireless performance for your PCI Express-enabled desktop computer. With support for 2.4GHz or 5GHz wireless networks, you have the freedom to choose the connectivity option that best suits your needs.",c);
            }
        });
        three.setClickable(true);
        three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	alert("Ethernet cable is CAT 7 high speed rated at 10Gbs. With data transmission rates six times faster than CAT 5e LAN cables and a short distance between the plug and its twisted pairs, quality and high speeds are guaranteed.",c);
            }
        });
        four.setClickable(true);
        four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	alert("Universal WiFi Range Extender effectively doubles the operating distance of your entire wireless network and conveniently avoids additional need for power cables or device clutter on your office desk or home theater.",c);
            }
        });
        five.setClickable(true);
        five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	alert("120 GB SSD delivers faster boot and application load times for mobile and desktop users. Low power, lightweight and durable, it empowers high-speed synchronous MLC NAND advanced controller technology, optimized NAND management and the second-gen SATA 6Gb/s interface, for vastly improved data transfers for bandwidth-demanding applications.",c);
            }
        });
        six.setClickable(true);
        six.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	alert("Add more RAM to your laptop computer and you'll enjoy faster performance for all your computing tasks",c);
            }
        });
        seven.setClickable(true);
        seven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	alert("Wide LED monitor delivers a high definition resolution with low energy consumption. Other specs include a 1000:1 contrast ratio and 5ms response time.",c);
            }
        });
	}
	

	 public void showOtherActivity(){
		 Intent intent = new Intent(this, orderReview.class);
			intent.putExtra("value", amount);
		
			startActivity(intent);
		}
	public static void alert(String msg,Context c){
		AlertDialog alertDialog = new AlertDialog.Builder(c).create();
		alertDialog.setTitle("Product Information");
		alertDialog.setMessage(msg);
		alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
		public void onClick(DialogInterface dialog, int which) {
		// here you can add functions
		}
		});
		alertDialog.setIcon(R.drawable.images);
		alertDialog.show();
			}
}
