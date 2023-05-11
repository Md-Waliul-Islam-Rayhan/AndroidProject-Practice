
	 
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

public class settings_language_page_activity extends Activity {

	
	private View _bg__settings_language_page_ek2;
	private View rectangle_1_ek8;
	private ImageView union_ek7;
	private ImageView vector_ek38;
	private ImageView vector_ek39;
	private ImageView vector_ek40;
	private ImageView vector_ek41;
	private ImageView vector_ek42;
	private ImageView vector_ek43;
	private ImageView vector_ek44;
	private ImageView vector_ek45;
	private ImageView vector_ek46;
	private ImageView vector_ek47;
	private ImageView vector_ek48;
	private ImageView vector_ek49;
	private ImageView vector_ek50;
	private ImageView vector_ek51;
	private ImageView vector_ek52;
	private ImageView vector_ek53;
	private ImageView vector_ek54;
	private ImageView vector_ek55;
	private TextView settings_ek6;
	private ImageView vector_ek56;
	private ImageView rectangle_13_ek3;
	private TextView language;
	private TextView _settings_ek7;
	private ImageView vector_ek57;
	private View ellipse_1_ek8;
	private TextView coinbank_wallet_ek9;
	private ImageView ellipse_3_ek7;
	private ImageView vector_ek58;
	private ImageView _vector_ek59;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings_language_page);

		
		_bg__settings_language_page_ek2 = (View) findViewById(R.id._bg__settings_language_page_ek2);
		rectangle_1_ek8 = (View) findViewById(R.id.rectangle_1_ek8);
		union_ek7 = (ImageView) findViewById(R.id.union_ek7);
		vector_ek38 = (ImageView) findViewById(R.id.vector_ek38);
		vector_ek39 = (ImageView) findViewById(R.id.vector_ek39);
		vector_ek40 = (ImageView) findViewById(R.id.vector_ek40);
		vector_ek41 = (ImageView) findViewById(R.id.vector_ek41);
		vector_ek42 = (ImageView) findViewById(R.id.vector_ek42);
		vector_ek43 = (ImageView) findViewById(R.id.vector_ek43);
		vector_ek44 = (ImageView) findViewById(R.id.vector_ek44);
		vector_ek45 = (ImageView) findViewById(R.id.vector_ek45);
		vector_ek46 = (ImageView) findViewById(R.id.vector_ek46);
		vector_ek47 = (ImageView) findViewById(R.id.vector_ek47);
		vector_ek48 = (ImageView) findViewById(R.id.vector_ek48);
		vector_ek49 = (ImageView) findViewById(R.id.vector_ek49);
		vector_ek50 = (ImageView) findViewById(R.id.vector_ek50);
		vector_ek51 = (ImageView) findViewById(R.id.vector_ek51);
		vector_ek52 = (ImageView) findViewById(R.id.vector_ek52);
		vector_ek53 = (ImageView) findViewById(R.id.vector_ek53);
		vector_ek54 = (ImageView) findViewById(R.id.vector_ek54);
		vector_ek55 = (ImageView) findViewById(R.id.vector_ek55);
		settings_ek6 = (TextView) findViewById(R.id.settings_ek6);
		vector_ek56 = (ImageView) findViewById(R.id.vector_ek56);
		rectangle_13_ek3 = (ImageView) findViewById(R.id.rectangle_13_ek3);
		language = (TextView) findViewById(R.id.language);
		_settings_ek7 = (TextView) findViewById(R.id._settings_ek7);
		vector_ek57 = (ImageView) findViewById(R.id.vector_ek57);
		ellipse_1_ek8 = (View) findViewById(R.id.ellipse_1_ek8);
		coinbank_wallet_ek9 = (TextView) findViewById(R.id.coinbank_wallet_ek9);
		ellipse_3_ek7 = (ImageView) findViewById(R.id.ellipse_3_ek7);
		vector_ek58 = (ImageView) findViewById(R.id.vector_ek58);
		_vector_ek59 = (ImageView) findViewById(R.id._vector_ek59);
	
		
		_settings_ek7.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_vector_ek59.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	