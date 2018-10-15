package om.banat.karawan.karawantaskmngr2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity {
    private EditText etfirstname;
    private EditText etlastname;
    private  EditText etphone;
    private  EditText etemail;
    private EditText etpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        etfirstname=(EditText)findViewById(R.id.etfirstname);
        etlastname=(EditText)findViewById(R.id.etlastname);
        etphone=(EditText)findViewById(R.id.etphone);
        etemail=(EditText)findViewById(R.id.etemail);
        etpassword=(EditText)findViewById(R.id.etPassword);


    }
}
