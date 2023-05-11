
	 
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

public class settings_notifications_page_activity extends Activity {

	
	private View _bg__settings_notifications_page_ek2;
	private View rectangle_1_ek9;
	private ImageView union_ek8;
	private ImageView vector_ek60;
	private ImageView vector_ek61;
	private ImageView vector_ek62;
	private ImageView vector_ek63;
	private ImageView vector_ek64;
	private ImageView vector_ek65;
	private ImageView vector_ek66;
	private ImageView vector_ek67;
	private ImageView vector_ek68;
	private ImageView vector_ek69;
	private ImageView vector_ek70;
	private ImageView vector_ek71;
	private ImageView vector_ek72;
	private ImageView vector_ek73;
	private ImageView vector_ek74;
	private ImageView vector_ek75;
	private ImageView vector_ek76;
	private ImageView vector_ek77;
	private TextView settings_ek8;
	private ImageView vector_ek78;
	private ImageView rectangle_13_ek4;
	private TextView notifications_ek1;
	private TextView _settings_ek9;
	private ImageView vector_ek79;
	private View ellipse_1_ek9;
	private TextView coinbank_wallet_ek10;
	private ImageView ellipse_3_ek8;
	private ImageView vector_ek80;
	private ImageView _vector_ek81;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings_notifications_page);

		
		_bg__settings_notifications_page_ek2 = (View) findViewById(R.id._bg__settings_notifications_page_ek2);
		rectangle_1_ek9 = (View) findViewById(R.id.rectangle_1_ek9);
		union_ek8 = (ImageView) findViewById(R.id.union_ek8);
		vector_ek60 = (ImageView) findViewById(R.id.vector_ek60);
		vector_ek61 = (ImageView) findViewById(R.id.vector_ek61);
		vector_ek62 = (ImageView) findViewById(R.id.vector_ek62);
		vector_ek63 = (ImageView) findViewById(R.id.vector_ek63);
		vector_ek64 = (ImageView) findViewById(R.id.vector_ek64);
		vector_ek65 = (ImageView) findViewById(R.id.vector_ek65);
		vector_ek66 = (ImageView) findViewById(R.id.vector_ek66);
		vector_ek67 = (ImageView) findViewById(R.id.vector_ek67);
		vector_ek68 = (ImageView) findViewById(R.id.vector_ek68);
		vector_ek69 = (ImageView) findViewById(R.id.vector_ek69);
		vector_ek70 = (ImageView) findViewById(R.id.vector_ek70);
		vector_ek71 = (ImageView) findViewById(R.id.vector_ek71);
		vector_ek72 = (ImageView) findViewById(R.id.vector_ek72);
		vector_ek73 = (ImageView) findViewById(R.id.vector_ek73);
		vector_ek74 = (ImageView) findViewById(R.id.vector_ek74);
		vector_ek75 = (ImageView) findViewById(R.id.vector_ek75);
		vector_ek76 = (ImageView) findViewById(R.id.vector_ek76);
		vector_ek77 = (ImageView) findViewById(R.id.vector_ek77);
		settings_ek8 = (TextView) findViewById(R.id.settings_ek8);
		vector_ek78 = (ImageView) findViewById(R.id.vector_ek78);
		rectangle_13_ek4 = (ImageView) findViewById(R.id.rectangle_13_ek4);
		notifications_ek1 = (TextView) findViewById(R.id.notifications_ek1);
		_settings_ek9 = (TextView) findViewById(R.id._settings_ek9);
		vector_ek79 = (ImageView) findViewById(R.id.vector_ek79);
		ellipse_1_ek9 = (View) findViewById(R.id.ellipse_1_ek9);
		coinbank_wallet_ek10 = (TextView) findViewById(R.id.coinbank_wallet_ek10);
		ellipse_3_ek8 = (ImageView) findViewById(R.id.ellipse_3_ek8);
		vector_ek80 = (ImageView) findViewById(R.id.vector_ek80);
		_vector_ek81 = (ImageView) findViewById(R.id._vector_ek81);
	
		
		_settings_ek9.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_vector_ek81.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	