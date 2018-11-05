package om.banat.karawan.karawantaskmngr2018;

import android.app.DatePickerDialog;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Calendar;

public class AddTaskActivity extends AppCompatActivity {
    private EditText edTitle,edText,etDueDate;
    private SeekBar skbrImportant,skbrNecceary;
    private TextView tvImportant,tvNecceary;
    private Button btnSave,btnDatePicker;
    private int mYear,mMonth,mDay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        edTitle=findViewById(R.id.edTitle);
        edText=findViewById(R.id.edText);
        etDueDate=findViewById(R.id.etDuetDate);
        skbrImportant=findViewById(R.id.skbrImportant);
        skbrNecceary=findViewById(R.id.skbrNecceary);
        tvImportant=findViewById(R.id.tvImportant);
        tvNecceary=findViewById(R.id.tvNecceary);
        btnSave=findViewById(R.id.btnSave);
        btnDatePicker=findViewById(R.id.btnDatePicker);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataHandler();
            }
        });
         btnDatePicker.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

             }
         });

    }

    private void dataHandler() {
        boolean isok=true;
        String title=edTitle.getText().toString();
        String text= edText.getText().toString();
        String DueDate=etDueDate.getText().toString();
        int Important=skbrImportant.getProgress();
        int Necceary=skbrNecceary.getProgress();
        if (title.length()<4){
            edTitle.setError("title have to be more than 4 char");
            isok=false;}
            if (text.length()<4) {
                edText.setError("text have to be more than 4 char");
                isok = false;
                {
                    if (DueDate.length() < 4) ;
                    etDueDate.setError(" DueDate have to be more than 4 char");
                }

            }

    }

    public void onClick(View v){
        if (v==btnDatePicker){
            final Calendar c=Calendar.getInstance();
          mYear=c.get(Calendar.YEAR);
          mMonth=c.get(Calendar.MONTH);
          mDay=c.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog datePickerDialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfyear, int dayOfMonth) {
                    etDueDate.setText(dayOfMonth+"-"+(monthOfyear+1)+"-"+year);
                }
            },mYear,mMonth,mDay);
            datePickerDialog.show();
        }
        }
    }

