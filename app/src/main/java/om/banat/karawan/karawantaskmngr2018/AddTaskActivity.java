package om.banat.karawan.karawantaskmngr2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class AddTaskActivity extends AppCompatActivity {
    private EditText edTitle,edText,etDuetDate;
    private SeekBar skbrImportant,skbrNecceary;
    private TextView tvImportant,tvNecceary;
    private Button btnSave,btnDatePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        edTitle=findViewById(R.id.edTitle);
        edText=findViewById(R.id.edText);
        etDuetDate=findViewById(R.id.etDuetDate);
        skbrImportant=findViewById(R.id.skbrImportant);
        skbrNecceary=findViewById(R.id.skbrNecceary);
        tvImportant=findViewById(R.id.tvImportant);
        tvNecceary=findViewById(R.id.tvNecceary);
        btnSave=findViewById(R.id.btnSave);
        btnDatePicker=findViewById(R.id.btnDatePicker);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
         btnDatePicker.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

             }
         });









    }
}
