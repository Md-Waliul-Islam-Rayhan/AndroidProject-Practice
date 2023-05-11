
	 
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

public class login_page_activity extends Activity {

	
	private View _bg__login_page_ek2;
	private View rectangle_1_ek12;
	private TextView log_in_ek1;
	private View rectangle_2_ek1;
	private TextView email;
	private View rectangle_3_ek1;
	private TextView password;
	private View rectangle_5;
	private View rectangle_6_ek1;
	private View ellipse_2_ek2;
	private TextView coinbank_wallet_ek13;
	private View _rectangle_5_ek1;
	private TextView log_in_ek2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_page);

		
		_bg__login_page_ek2 = (View) findViewById(R.id._bg__login_page_ek2);
		rectangle_1_ek12 = (View) findViewById(R.id.rectangle_1_ek12);
		log_in_ek1 = (TextView) findViewById(R.id.log_in_ek1);
		rectangle_2_ek1 = (View) findViewById(R.id.rectangle_2_ek1);
		email = (TextView) findViewById(R.id.email);
		rectangle_3_ek1 = (View) findViewById(R.id.rectangle_3_ek1);
		password = (TextView) findViewById(R.id.password);
		rectangle_5 = (View) findViewById(R.id.rectangle_5);
		rectangle_6_ek1 = (View) findViewById(R.id.rectangle_6_ek1);
		ellipse_2_ek2 = (View) findViewById(R.id.ellipse_2_ek2);
		coinbank_wallet_ek13 = (TextView) findViewById(R.id.coinbank_wallet_ek13);
		_rectangle_5_ek1 = (View) findViewById(R.id._rectangle_5_ek1);
		log_in_ek2 = (TextView) findViewById(R.id.log_in_ek2);
	
		
		_rectangle_5_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	