
	 
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

public class settings_about_page_activity extends Activity {

	
	private View _bg__settings_about_page_ek2;
	private View rectangle_1_ek6;
	private ImageView union_ek5;
	private TextView settings_ek2;
	private ImageView vector_ek30;
	private ImageView rectangle_13_ek1;
	private View ellipse_2;
	private TextView coinbank_wallet_ek6;
	private TextView version_1_0__beta_;
	private TextView __2022__starter_pack_three;
	private TextView about_ek1;
	private TextView _settings_ek3;
	private ImageView vector_ek31;
	private View ellipse_1_ek6;
	private TextView coinbank_wallet_ek7;
	private ImageView ellipse_3_ek5;
	private ImageView vector_ek32;
	private ImageView _vector_ek33;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings_about_page);

		
		_bg__settings_about_page_ek2 = (View) findViewById(R.id._bg__settings_about_page_ek2);
		rectangle_1_ek6 = (View) findViewById(R.id.rectangle_1_ek6);
		union_ek5 = (ImageView) findViewById(R.id.union_ek5);
		settings_ek2 = (TextView) findViewById(R.id.settings_ek2);
		vector_ek30 = (ImageView) findViewById(R.id.vector_ek30);
		rectangle_13_ek1 = (ImageView) findViewById(R.id.rectangle_13_ek1);
		ellipse_2 = (View) findViewById(R.id.ellipse_2);
		coinbank_wallet_ek6 = (TextView) findViewById(R.id.coinbank_wallet_ek6);
		version_1_0__beta_ = (TextView) findViewById(R.id.version_1_0__beta_);
		__2022__starter_pack_three = (TextView) findViewById(R.id.__2022__starter_pack_three);
		about_ek1 = (TextView) findViewById(R.id.about_ek1);
		_settings_ek3 = (TextView) findViewById(R.id._settings_ek3);
		vector_ek31 = (ImageView) findViewById(R.id.vector_ek31);
		ellipse_1_ek6 = (View) findViewById(R.id.ellipse_1_ek6);
		coinbank_wallet_ek7 = (TextView) findViewById(R.id.coinbank_wallet_ek7);
		ellipse_3_ek5 = (ImageView) findViewById(R.id.ellipse_3_ek5);
		vector_ek32 = (ImageView) findViewById(R.id.vector_ek32);
		_vector_ek33 = (ImageView) findViewById(R.id._vector_ek33);
	
		
		_settings_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_vector_ek33.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	