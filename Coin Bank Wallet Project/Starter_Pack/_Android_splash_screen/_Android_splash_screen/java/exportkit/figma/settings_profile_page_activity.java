
	 
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
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class settings_profile_page_activity extends Activity {

	
	private View _bg__settings_profile_page_ek2;
	private View rectangle_1_ek7;
	private ImageView union_ek6;
	private TextView settings_ek4;
	private ImageView vector_ek34;
	private ImageView rectangle_13_ek2;
	private View ellipse_2_ek1;
	private TextView user_name;
	private TextView profile_ek1;
	private TextView _settings_ek5;
	private ImageView vector_ek35;
	private TextView email_;
	private View ellipse_1_ek7;
	private TextView coinbank_wallet_ek8;
	private ImageView ellipse_3_ek6;
	private ImageView vector_ek36;
	private ImageView _vector_ek37;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings_profile_page);

		
		_bg__settings_profile_page_ek2 = (View) findViewById(R.id._bg__settings_profile_page_ek2);
		rectangle_1_ek7 = (View) findViewById(R.id.rectangle_1_ek7);
		union_ek6 = (ImageView) findViewById(R.id.union_ek6);
		settings_ek4 = (TextView) findViewById(R.id.settings_ek4);
		vector_ek34 = (ImageView) findViewById(R.id.vector_ek34);
		rectangle_13_ek2 = (ImageView) findViewById(R.id.rectangle_13_ek2);
		ellipse_2_ek1 = (View) findViewById(R.id.ellipse_2_ek1);
		user_name = (TextView) findViewById(R.id.user_name);
		profile_ek1 = (TextView) findViewById(R.id.profile_ek1);
		_settings_ek5 = (TextView) findViewById(R.id._settings_ek5);
		vector_ek35 = (ImageView) findViewById(R.id.vector_ek35);
		email_ = (TextView) findViewById(R.id.email_);
		ellipse_1_ek7 = (View) findViewById(R.id.ellipse_1_ek7);
		coinbank_wallet_ek8 = (TextView) findViewById(R.id.coinbank_wallet_ek8);
		ellipse_3_ek6 = (ImageView) findViewById(R.id.ellipse_3_ek6);
		vector_ek36 = (ImageView) findViewById(R.id.vector_ek36);
		_vector_ek37 = (ImageView) findViewById(R.id._vector_ek37);
	
		
		_settings_ek5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_vector_ek37.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	