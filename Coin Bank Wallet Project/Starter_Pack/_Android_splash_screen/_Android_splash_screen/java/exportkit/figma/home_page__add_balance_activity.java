
	 
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
import android.widget.ImageView;
import android.content.Intent;

public class home_page__add_balance_activity extends Activity {

	
	private View _bg__home_page__add_balance_ek2;
	private View rectangle_1_ek2;
	private TextView home_screen_ek1;
	private TextView coinbank_wallet_ek2;
	private View ellipse_1_ek2;
	private View rectangle_9;
	private ImageView union_ek1;
	private ImageView _vector_ek3;
	private TextView home_ek1;
	private ImageView vector_ek4;
	private View rectangle_7_ek1;
	private TextView add_income;
	private View rectangle_7_ek2;
	private TextView add_expense;
	private ImageView ellipse_3_ek1;
	private ImageView ellipse_4_ek1;
	private View rectangle_7_ek3;
	private View rectangle_8_ek1;
	private ImageView vector_ek5;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_page__add_balance);

		
		_bg__home_page__add_balance_ek2 = (View) findViewById(R.id._bg__home_page__add_balance_ek2);
		rectangle_1_ek2 = (View) findViewById(R.id.rectangle_1_ek2);
		home_screen_ek1 = (TextView) findViewById(R.id.home_screen_ek1);
		coinbank_wallet_ek2 = (TextView) findViewById(R.id.coinbank_wallet_ek2);
		ellipse_1_ek2 = (View) findViewById(R.id.ellipse_1_ek2);
		rectangle_9 = (View) findViewById(R.id.rectangle_9);
		union_ek1 = (ImageView) findViewById(R.id.union_ek1);
		_vector_ek3 = (ImageView) findViewById(R.id._vector_ek3);
		home_ek1 = (TextView) findViewById(R.id.home_ek1);
		vector_ek4 = (ImageView) findViewById(R.id.vector_ek4);
		rectangle_7_ek1 = (View) findViewById(R.id.rectangle_7_ek1);
		add_income = (TextView) findViewById(R.id.add_income);
		rectangle_7_ek2 = (View) findViewById(R.id.rectangle_7_ek2);
		add_expense = (TextView) findViewById(R.id.add_expense);
		ellipse_3_ek1 = (ImageView) findViewById(R.id.ellipse_3_ek1);
		ellipse_4_ek1 = (ImageView) findViewById(R.id.ellipse_4_ek1);
		rectangle_7_ek3 = (View) findViewById(R.id.rectangle_7_ek3);
		rectangle_8_ek1 = (View) findViewById(R.id.rectangle_8_ek1);
		vector_ek5 = (ImageView) findViewById(R.id.vector_ek5);
	
		
		_vector_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	