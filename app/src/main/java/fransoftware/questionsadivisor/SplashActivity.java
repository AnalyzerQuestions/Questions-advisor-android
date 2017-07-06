package fransoftware.questionsadivisor;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class SplashActivity extends Activity implements Runnable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler SplashScreen = new Handler();
        SplashScreen.postDelayed(SplashActivity.this, 3000);
    }

    public void run(){
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }
}
