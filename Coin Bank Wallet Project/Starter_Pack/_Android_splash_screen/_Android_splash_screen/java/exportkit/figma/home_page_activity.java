
	 
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

public class home_page_activity extends Activity {

	
	private View _bg__home_page_ek2;
	private View rectangle_1_ek1;
	private ImageView union;
	private ImageView _vector;
	private TextView home;
	private ImageView vector_ek1;
	private View ellipse_1_ek1;
	private TextView home_screen;
	private TextView coinbank_wallet_ek1;
	private ImageView ellipse_3;
	private ImageView ellipse_4;
	private View rectangle_7;
	private View rectangle_8;
	private ImageView vector_ek2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_page);

		
		_bg__home_page_ek2 = (View) findViewById(R.id._bg__home_page_ek2);
		rectangle_1_ek1 = (View) findViewById(R.id.rectangle_1_ek1);
		union = (ImageView) findViewById(R.id.union);
		_vector = (ImageView) findViewById(R.id._vector);
		home = (TextView) findViewById(R.id.home);
		vector_ek1 = (ImageView) findViewById(R.id.vector_ek1);
		ellipse_1_ek1 = (View) findViewById(R.id.ellipse_1_ek1);
		home_screen = (TextView) findViewById(R.id.home_screen);
		coinbank_wallet_ek1 = (TextView) findViewById(R.id.coinbank_wallet_ek1);
		ellipse_3 = (ImageView) findViewById(R.id.ellipse_3);
		ellipse_4 = (ImageView) findViewById(R.id.ellipse_4);
		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		rectangle_8 = (View) findViewById(R.id.rectangle_8);
		vector_ek2 = (ImageView) findViewById(R.id.vector_ek2);
	
		
		_vector.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	