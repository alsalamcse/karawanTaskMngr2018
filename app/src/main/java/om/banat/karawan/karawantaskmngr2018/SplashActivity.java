package om.banat.karawan.karawantaskmngr2018;

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
        MyThred myThred =new MyThread();
        super.onResume();
    }
    public class MyThread extends thread
    {


    }
}
///