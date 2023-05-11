
	 
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
import android.content.Intent;
import android.widget.TextView;

public class help_page_activity extends Activity {

	
	private View _bg__help_page_ek2;
	private View rectangle_1_ek3;
	private ImageView union_ek2;
	private ImageView _vector_ek6;
	private TextView help;
	private View ellipse_1_ek3;
	private TextView help_screen;
	private TextView coinbank_wallet_ek3;
	private ImageView ellipse_3_ek2;
	private ImageView vector_ek7;
	private ImageView _vector_ek8;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.help_page);

		
		_bg__help_page_ek2 = (View) findViewById(R.id._bg__help_page_ek2);
		rectangle_1_ek3 = (View) findViewById(R.id.rectangle_1_ek3);
		union_ek2 = (ImageView) findViewById(R.id.union_ek2);
		_vector_ek6 = (ImageView) findViewById(R.id._vector_ek6);
		help = (TextView) findViewById(R.id.help);
		ellipse_1_ek3 = (View) findViewById(R.id.ellipse_1_ek3);
		help_screen = (TextView) findViewById(R.id.help_screen);
		coinbank_wallet_ek3 = (TextView) findViewById(R.id.coinbank_wallet_ek3);
		ellipse_3_ek2 = (ImageView) findViewById(R.id.ellipse_3_ek2);
		vector_ek7 = (ImageView) findViewById(R.id.vector_ek7);
		_vector_ek8 = (ImageView) findViewById(R.id._vector_ek8);
	
		
		_vector_ek6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_vector_ek8.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	