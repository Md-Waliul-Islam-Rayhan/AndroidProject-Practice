
	 
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

public class error_page_activity extends Activity {

	
	private View _bg__error_page_ek2;
	private View rectangle_1_ek11;
	private ImageView vector_ek104;
	private TextView oops__something_went_wrong_;
	private View _rectangle_6;
	private TextView back_to_home;
	private View ellipse_1_ek11;
	private TextView coinbank_wallet_ek12;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.error_page);

		
		_bg__error_page_ek2 = (View) findViewById(R.id._bg__error_page_ek2);
		rectangle_1_ek11 = (View) findViewById(R.id.rectangle_1_ek11);
		vector_ek104 = (ImageView) findViewById(R.id.vector_ek104);
		oops__something_went_wrong_ = (TextView) findViewById(R.id.oops__something_went_wrong_);
		_rectangle_6 = (View) findViewById(R.id._rectangle_6);
		back_to_home = (TextView) findViewById(R.id.back_to_home);
		ellipse_1_ek11 = (View) findViewById(R.id.ellipse_1_ek11);
		coinbank_wallet_ek12 = (TextView) findViewById(R.id.coinbank_wallet_ek12);
	
		
		_rectangle_6.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	