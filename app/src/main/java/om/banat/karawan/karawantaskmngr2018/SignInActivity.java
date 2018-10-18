package om.banat.karawan.karawantaskmngr2018;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignInActivity extends AppCompatActivity {
    private EditText etfirstname;
     private EditText etlastname;
     private  EditText etphone;
      private  EditText etemail;
    private EditText etpassword;
    //1.
    private FirebaseAuth auth;
    private FirebaseUser user;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        etfirstname=(EditText)findViewById(R.id.etfirstname);
        etlastname=(EditText)findViewById(R.id.etlastname);
        etphone=(EditText)findViewById(R.id.etphone);
        etemail=(EditText)findViewById(R.id.etemail);
        etpassword=(EditText)findViewById(R.id.etPassword);
        auth = FirebaseAuth.getInstance();
        user=auth.getCurrentUser();
        FirebaseUser firebaseUser;
        firebaseUser = auth.getCurrentUser();
        btnSave=(Button) this.<View>findViewById(R.id.btnSave);
btnSave.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

    }
});
     dataHandler();

        }

    private void dataHandler() {
        boolean isok = true;
        String email = etemail.getText().toString();
        String password = etpassword.getText().toString();
        String firstName = etfirstname.getText().toString();
        String lastName = etlastname.getText().toString();
        String phone = etphone.getText().toString();

        if (email.length() < 4 || email.indexOf('@')<0 || email.indexOf('.')<0)
        {
            etemail.setError("wrong Email");
            {
                isok = false;

            }
            if (password.length() < 8) {
                etpassword.setError("Have to be least 8 char");
                isok = false;
            }
            if (isok) {


            }
        }

        else
            etemail.setError("wrong Email");
            {
                isok = false;

            }
            if (password.length() < 8) {
                etpassword.setError("Have to be least 8 char");
                isok = false;
            }




        }













        //* creat firebase user using email password




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



    private void creatAcount;(String email,String

    public EditText getEtpassword() {
        return etpassword;
    ) {
        String password;
        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(SignInActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(SignInActivity.this, "Authentication Successful.", Toast.LENGTH_SHORT).show();
                    //updateUserProfile(task.getResult().getUser());
                    finish();
                }
                else
                {
                    Toast.makeText(SignInActivity.this, "Authentication failed."+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    task.getException().printStackTrace();
                }
            }
        });
    }


}













