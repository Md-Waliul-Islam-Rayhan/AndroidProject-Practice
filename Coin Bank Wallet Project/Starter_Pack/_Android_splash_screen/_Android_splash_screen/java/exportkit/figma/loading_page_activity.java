
	 
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

public class loading_page_activity extends Activity {

	
	private View _bg__loading_page_ek2;
	private View rectangle_1_ek4;
	private ImageView union_ek3;
	private ImageView _vector_ek9;
	private TextView help_ek1;
	private View ellipse_1_ek4;
	private TextView loading_screen;
	private TextView coinbank_wallet_ek4;
	private ImageView ellipse_3_ek3;
	private ImageView vector_ek10;
	private ImageView _vector_ek11;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.loading_page);

		
		_bg__loading_page_ek2 = (View) findViewById(R.id._bg__loading_page_ek2);
		rectangle_1_ek4 = (View) findViewById(R.id.rectangle_1_ek4);
		union_ek3 = (ImageView) findViewById(R.id.union_ek3);
		_vector_ek9 = (ImageView) findViewById(R.id._vector_ek9);
		help_ek1 = (TextView) findViewById(R.id.help_ek1);
		ellipse_1_ek4 = (View) findViewById(R.id.ellipse_1_ek4);
		loading_screen = (TextView) findViewById(R.id.loading_screen);
		coinbank_wallet_ek4 = (TextView) findViewById(R.id.coinbank_wallet_ek4);
		ellipse_3_ek3 = (ImageView) findViewById(R.id.ellipse_3_ek3);
		vector_ek10 = (ImageView) findViewById(R.id.vector_ek10);
		_vector_ek11 = (ImageView) findViewById(R.id._vector_ek11);
	
		
		_vector_ek9.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_vector_ek11.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	