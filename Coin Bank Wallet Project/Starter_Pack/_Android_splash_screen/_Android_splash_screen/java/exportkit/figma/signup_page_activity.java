
	 
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

public class signup_page_activity extends Activity {

	
	private View _bg__signup_page_ek2;
	private View rectangle_1_ek13;
	private TextView log_in_ek3;
	private View rectangle_2_ek2;
	private TextView name;
	private View rectangle_3_ek2;
	private TextView email_ek1;
	private View rectangle_4_ek1;
	private TextView password_ek1;
	private View rectangle_5_ek2;
	private TextView confirm_password;
	private View rectangle_5_ek3;
	private View rectangle_6_ek2;
	private View ellipse_2_ek3;
	private TextView coinbank_wallet_ek14;
	private View _rectangle_5_ek4;
	private TextView sign_up_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.signup_page);

		
		_bg__signup_page_ek2 = (View) findViewById(R.id._bg__signup_page_ek2);
		rectangle_1_ek13 = (View) findViewById(R.id.rectangle_1_ek13);
		log_in_ek3 = (TextView) findViewById(R.id.log_in_ek3);
		rectangle_2_ek2 = (View) findViewById(R.id.rectangle_2_ek2);
		name = (TextView) findViewById(R.id.name);
		rectangle_3_ek2 = (View) findViewById(R.id.rectangle_3_ek2);
		email_ek1 = (TextView) findViewById(R.id.email_ek1);
		rectangle_4_ek1 = (View) findViewById(R.id.rectangle_4_ek1);
		password_ek1 = (TextView) findViewById(R.id.password_ek1);
		rectangle_5_ek2 = (View) findViewById(R.id.rectangle_5_ek2);
		confirm_password = (TextView) findViewById(R.id.confirm_password);
		rectangle_5_ek3 = (View) findViewById(R.id.rectangle_5_ek3);
		rectangle_6_ek2 = (View) findViewById(R.id.rectangle_6_ek2);
		ellipse_2_ek3 = (View) findViewById(R.id.ellipse_2_ek3);
		coinbank_wallet_ek14 = (TextView) findViewById(R.id.coinbank_wallet_ek14);
		_rectangle_5_ek4 = (View) findViewById(R.id._rectangle_5_ek4);
		sign_up_ek1 = (TextView) findViewById(R.id.sign_up_ek1);
	
		
		_rectangle_5_ek4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), login_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	