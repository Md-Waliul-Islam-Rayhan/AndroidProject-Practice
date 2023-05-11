
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		splash_screen
	 *	@date 		Wednesday 10th of August 2022 03:40:25 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class splash_screen_activity extends Activity {

	
	private View _bg__splash_screen_ek2;
	private View rectangle_1;
	private View ellipse_1;
	private TextView _sign_up;
	private View rectangle_2;
	private View rectangle_3;
	private View _rectangle_4;
	private TextView log_in;
	private TextView coinbank_wallet;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);

		
		_bg__splash_screen_ek2 = (View) findViewById(R.id._bg__splash_screen_ek2);
		rectangle_1 = (View) findViewById(R.id.rectangle_1);
		ellipse_1 = (View) findViewById(R.id.ellipse_1);
		_sign_up = (TextView) findViewById(R.id._sign_up);
		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		_rectangle_4 = (View) findViewById(R.id._rectangle_4);
		log_in = (TextView) findViewById(R.id.log_in);
		coinbank_wallet = (TextView) findViewById(R.id.coinbank_wallet);
	
		
		_sign_up.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), signup_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	