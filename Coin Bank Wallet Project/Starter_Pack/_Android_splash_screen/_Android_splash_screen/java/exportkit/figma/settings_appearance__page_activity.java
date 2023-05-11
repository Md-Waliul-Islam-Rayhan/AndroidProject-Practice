
	 
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

public class settings_appearance__page_activity extends Activity {

	
	private View _bg__settings_appearance__page_ek2;
	private View rectangle_1_ek10;
	private ImageView union_ek9;
	private ImageView vector_ek82;
	private ImageView vector_ek83;
	private ImageView vector_ek84;
	private ImageView vector_ek85;
	private ImageView vector_ek86;
	private ImageView vector_ek87;
	private ImageView vector_ek88;
	private ImageView vector_ek89;
	private ImageView vector_ek90;
	private ImageView vector_ek91;
	private ImageView vector_ek92;
	private ImageView vector_ek93;
	private ImageView vector_ek94;
	private ImageView vector_ek95;
	private ImageView vector_ek96;
	private ImageView vector_ek97;
	private ImageView vector_ek98;
	private ImageView vector_ek99;
	private TextView settings_ek10;
	private ImageView vector_ek100;
	private ImageView rectangle_13_ek5;
	private TextView appearance_ek1;
	private TextView _settings_ek11;
	private ImageView vector_ek101;
	private View ellipse_1_ek10;
	private TextView coinbank_wallet_ek11;
	private ImageView ellipse_3_ek9;
	private ImageView vector_ek102;
	private ImageView _vector_ek103;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings_appearance__page);

		
		_bg__settings_appearance__page_ek2 = (View) findViewById(R.id._bg__settings_appearance__page_ek2);
		rectangle_1_ek10 = (View) findViewById(R.id.rectangle_1_ek10);
		union_ek9 = (ImageView) findViewById(R.id.union_ek9);
		vector_ek82 = (ImageView) findViewById(R.id.vector_ek82);
		vector_ek83 = (ImageView) findViewById(R.id.vector_ek83);
		vector_ek84 = (ImageView) findViewById(R.id.vector_ek84);
		vector_ek85 = (ImageView) findViewById(R.id.vector_ek85);
		vector_ek86 = (ImageView) findViewById(R.id.vector_ek86);
		vector_ek87 = (ImageView) findViewById(R.id.vector_ek87);
		vector_ek88 = (ImageView) findViewById(R.id.vector_ek88);
		vector_ek89 = (ImageView) findViewById(R.id.vector_ek89);
		vector_ek90 = (ImageView) findViewById(R.id.vector_ek90);
		vector_ek91 = (ImageView) findViewById(R.id.vector_ek91);
		vector_ek92 = (ImageView) findViewById(R.id.vector_ek92);
		vector_ek93 = (ImageView) findViewById(R.id.vector_ek93);
		vector_ek94 = (ImageView) findViewById(R.id.vector_ek94);
		vector_ek95 = (ImageView) findViewById(R.id.vector_ek95);
		vector_ek96 = (ImageView) findViewById(R.id.vector_ek96);
		vector_ek97 = (ImageView) findViewById(R.id.vector_ek97);
		vector_ek98 = (ImageView) findViewById(R.id.vector_ek98);
		vector_ek99 = (ImageView) findViewById(R.id.vector_ek99);
		settings_ek10 = (TextView) findViewById(R.id.settings_ek10);
		vector_ek100 = (ImageView) findViewById(R.id.vector_ek100);
		rectangle_13_ek5 = (ImageView) findViewById(R.id.rectangle_13_ek5);
		appearance_ek1 = (TextView) findViewById(R.id.appearance_ek1);
		_settings_ek11 = (TextView) findViewById(R.id._settings_ek11);
		vector_ek101 = (ImageView) findViewById(R.id.vector_ek101);
		ellipse_1_ek10 = (View) findViewById(R.id.ellipse_1_ek10);
		coinbank_wallet_ek11 = (TextView) findViewById(R.id.coinbank_wallet_ek11);
		ellipse_3_ek9 = (ImageView) findViewById(R.id.ellipse_3_ek9);
		vector_ek102 = (ImageView) findViewById(R.id.vector_ek102);
		_vector_ek103 = (ImageView) findViewById(R.id._vector_ek103);
	
		
		_settings_ek11.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), settings_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_vector_ek103.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), home_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	