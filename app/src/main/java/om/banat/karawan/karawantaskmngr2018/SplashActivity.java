package om.banat.karawan.karawantaskmngr2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
    @Override
    protected void onResume() {
        MyThread myThred = new MyThread();
        myThred.start();
        super.onResume();
    }

    public class MyThread extends Thread
    {
        @Override
        public void run() {
            try {
                sleep(3000);
                Intent i  = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    }

