package com.example.autoapp;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public  class MainActivity extends Activity implements OnClickListener {
	private String[] title ={"Car Dent?","Book An Apointment","Accident Help Toolkit"};
	private String[] desc ={"Get a Free Estimate","",""};	
	private int[] image={R.drawable.option2,R.drawable.aeab,R.drawable.option4};


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		LinearLayout head=(LinearLayout) findViewById(R.id.head);
		LayoutInflater inflater=getLayoutInflater();
		head.setBackgroundResource(R.drawable.bg1);
			
		for(int i=0;i<title.length;i++){
			View view = inflater.inflate(R.layout.activity_main, null, false);
	        TextView title = (TextView) view.findViewById(R.id.title);
	        TextView desc = (TextView) view.findViewById(R.id.desc);
	        ImageView iv=(ImageView) view.findViewById(R.id.img);
	        title.setText(this.title[i]);
	        desc.setText(this.desc[i]);
	       

	        
	        iv.setImageResource(image[i]);
	        
	        view.setId(i);
	        
	        head.addView(view);
		}   
		
		View option0=findViewById(R.id.main);
		View option1=findViewById(0);
		View option2=findViewById(1);
		View option3=findViewById(2);
		option0.setOnClickListener(this);
		option1.setOnClickListener(this);
		option2.setOnClickListener(this);
		option3.setOnClickListener(this);
	}
		
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.main:goToActivity(DiscountAndGifts.class);
			break;
		case 0:goToActivity(CarDent.class);
			break;
		case 1:goToActivity(BookAnAppointment.class);
		break;
		
		case 2:goToActivity(ContactUs.class);
		break;
		default:
		
		}
	}
	
	
	
	public void goToActivity(Class cls){
		Intent in=new Intent(MainActivity.this, cls);
		startActivity(in);
	}

}
