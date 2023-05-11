
	 
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

public class settings_page_activity extends Activity {

	
	private View _bg__settings_page_ek2;
	private View rectangle_1_ek5;
	private ImageView union_ek4;
	private TextView settings;
	private ImageView vector_ek12;
	private TextView settings_ek1;
	private ImageView rectangle_10;
	private ImageView rectangle_13;
	private View rectangle_11;
	private View rectangle_12;
	private View rectangle_14;
	private TextView profile;
	private ImageView vector_ek13;
	private ImageView vector_ek14;
	private ImageView vector_ek15;
	private ImageView vector_ek16;
	private ImageView vector_ek17;
	private ImageView vector_ek18;
	private ImageView vector_ek19;
	private ImageView vector_ek20;
	private TextView notifications;
	private ImageView vector_ek21;
	private TextView appearance;
	private ImageView vector_ek22;
	private ImageView vector_ek23;
	private ImageView vector_ek24;
	private TextView languages;
	private ImageView vector_ek25;
	private TextView about;
	private ImageView vector_ek26;
	private ImageView vector_ek27;
	private View ellipse_1_ek5;
	private TextView coinbank_wallet_ek5;
	private ImageView ellipse_3_ek4;
	private ImageView vector_ek28;
	private ImageView _vector_ek29;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings_page);

		
		_bg__settings_page_ek2 = (View) findViewById(R.id._bg__settings_page_ek2);
		rectangle_1_ek5 = (View) findViewById(R.id.rectangle_1_ek5);
		union_ek4 = (ImageView) findViewById(R.id.union_ek4);
		settings = (TextView) findViewById(R.id.settings);
		vector_ek12 = (ImageView) findViewById(R.id.vector_ek12);
		settings_ek1 = (TextView) findViewById(R.id.settings_ek1);
		rectangle_10 = (ImageView) findViewById(R.id.rectangle_10);
		rectangle_13 = (ImageView) findViewById(R.id.rectangle_13);
		rectangle_11 = (View) findViewById(R.id.rectangle_11);
		rectangle_12 = (View) findViewById(R.id.rectangle_12);
		rectangle_14 = (View) findViewById(R.id.rectangle_14);
		profile = (TextView) findViewById(R.id.profile);
		vector_ek13 = (ImageView) findViewById(R.id.vector_ek13);
		vector_ek14 = (ImageView) findViewById(R.id.vector_ek14);
		vector_ek15 = (ImageView) findViewById(R.id.vector_ek15);
		vector_ek16 = (ImageView) findViewById(R.id.vector_ek16);
		vector_ek17 = (ImageView) findViewById(R.id.vector_ek17);
		vector_ek18 = (ImageView) findViewById(R.id.vector_ek18);
		vector_ek19 = (ImageView) findViewById(R.id.vector_ek19);
		vector_ek20 = (ImageView) findViewById(R.id.vector_ek20);
		notifications = (TextView) findViewById(R.id.notifications);
		vector_ek21 = (ImageView) findViewById(R.id.vector_ek21);
		appearance = (TextView) findViewById(R.id.appearance);
		vector_ek22 = (ImageView) findViewById(R.id.vector_ek22);
		vector_ek23 = (ImageView) findViewById(R.id.vector_ek23);
		vector_ek24 = (ImageView) findViewById(R.id.vector_ek24);
		languages = (TextView) findViewById(R.id.languages);
		vector_ek25 = (ImageView) findViewById(R.id.vector_ek25);
		about = (TextView) findViewById(R.id.about);
		vector_ek26 = (ImageView) findViewById(R.id.vector_ek26);
		vector_ek27 = (ImageView) findViewById(R.id.vector_ek27);
		ellipse_1_ek5 = (View) findViewById(R.id.ellipse_1_ek5);
		coinbank_wallet_ek5 = (TextView) findViewById(R.id.coinbank_wallet_ek5);
		ellipse_3_ek4 = (ImageView) findViewById(R.id.ellipse_3_ek4);
		vector_ek28 = (ImageView) findViewById(R.id.vector_ek28);
		_vector_ek29 = (ImageView) findViewById(R.id._vector_ek29);
	
		
		_vector_ek29.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	