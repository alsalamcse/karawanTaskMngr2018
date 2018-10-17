package om.banat.karawan.karawantaskmngr2018;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignInActivity extends AppCompatActivity {
    //private EditText etfirstname;
    // private EditText etlastname;
    // private  EditText etphone;
    //  private  EditText etemail;
    // private EditText etpassword;
    //1.
    private FirebaseAuth auth;
    private FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        //  etfirstname=(EditText)findViewById(R.id.etfirstname);
        // etlastname=(EditText)findViewById(R.id.etlastname);
        //  etphone=(EditText)findViewById(R.id.etphone);
        //  etemail=(EditText)findViewById(R.id.etemail);
        //  etpassword=(EditText)findViewById(R.id.etPassword);
        auth = FirebaseAuth.getInstance();
        FirebaseUser firebaseUser = auth.getCurrentUser();
        if (firebaseUser == null) {
            startActivity(new Intent(this, SignInActivity.class));
            finish();
            return;
        } else {
            String userName = firebaseUser.getDisplayName();
            if (firebaseUser.getPhotoUrl() != null) {
                String photoUrl = firebaseUser.getPhotoUrl().toString();
            }
        }
        FirebaseAuth.AuthStateListener authStateListener = new FirebaseAuth.AuthStateListener() {

            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                //4.
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    //user is signed in
                    Toast.makeText(SignInActivity.this, "user is signed in.", Toast.LENGTH_SHORT).show();

                } else {
                    //user signed out
                    Toast.makeText(SignInActivity.this, "user signed out.", Toast.LENGTH_SHORT).show();


                }
            }
        };



        }

    }













