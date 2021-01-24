package com.smn947.platformadventure;

import android.app.*;
import android.os.*;
import android.view.*;
import android.content.*;
import android.widget.*;
import android.util.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		findViewById(R.id.play).setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					System.out.println("BTN Clicked");
					startActivity(new Intent(MainActivity.this, GameActivity.class));
				}
			});

        TextView highScoreTxt = findViewById(R.id.highScoreTxt);
        final SharedPreferences prefs = getSharedPreferences("game", MODE_PRIVATE);
        highScoreTxt.setText("HighScore: " + prefs.getInt("highscore", 0));
    }
}
