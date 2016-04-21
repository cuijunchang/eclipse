package com.it.caishuzidemo;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	int rand;

	/**
	 * 产生随机数
	 * 
	 * @param view
	 */

	public void StartGame(View view) {
		EditText num1ET = (EditText) findViewById(R.id.num1_et);
		EditText num2ET = (EditText) findViewById(R.id.num2_et);
		int num1 = Integer.parseInt(num1ET.getText().toString());
		int num2 = Integer.parseInt(num2ET.getText().toString());
		if(num1>=num2){
			Toast.makeText(this, "第一个数必须小于第二个数", 1).show();
		}
		rand = new Random().nextInt(num2 - num1) + num1;
		System.out.println(rand);
	}

	/**
	 * 用户数与目标数对比
	 * 
	 * @param view
	 */

	public void submit(View view) {
		EditText num3ET = (EditText) findViewById(R.id.num3_et);
		int res = Integer.parseInt(num3ET.getText().toString());
		if (res == rand) {
			Toast.makeText(this, "你猜对了", 1).show();
		} else if (res > rand) {
			Toast.makeText(this, "你猜大了", 1).show();
		} else {
			Toast.makeText(this, "你猜小了", 1).show();
		}
	}
}
