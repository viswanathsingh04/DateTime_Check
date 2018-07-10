package uvs.bcs.com.timecheck;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int mYear, mMonth, mDay, mHour, mMinute;
    String date_time, pickupDT, slttime;
    private EditText mEditText;
    Formatter formatter;
    long now = System.currentTimeMillis() - 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mEditText = (EditText) findViewById(R.id.editText);
        mEditText.setOnClickListener(this);
        currenttimeadded();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.editText:
                datePicker();
                break;
        }
    }

    private void datePicker() {

        // Get Current Date
        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {

                    @SuppressLint("DefaultLocale")
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        //date_time = year + "-" + (monthOfYear + 1) + "-" + dayOfMonth;
                        date_time = dayOfMonth + "/" + (monthOfYear + 1) + "/" + year;
                        date_time = String.format("%02d/%02d/%04d", dayOfMonth, (monthOfYear + 1), year);
                        //*************Call Time Picker Here ********************
                        tiemPicker();
                    }
                }, mYear, mMonth, mDay);
        datePickerDialog.getDatePicker().setMinDate(now);
        c.add(Calendar.DATE, 15);
        datePickerDialog.getDatePicker().setMaxDate(c.getTimeInMillis());
        //datePickerDialog.getDatePicker().setMaxDate(now + (1000 * 60 * 60 * 24 * 7));
        datePickerDialog.show();
    }

    private void tiemPicker() {
        // Get Current Time
        final Calendar c = Calendar.getInstance();
        mHour = c.get(Calendar.HOUR_OF_DAY);
        mMinute = c.get(Calendar.MINUTE);

        // Launch Time Picker Dialog
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {

                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        mHour = hourOfDay;
                        mMinute = minute;
                        pickupDT = (date_time + " " + hourOfDay + ":" + minute);
                        Log.i("getSelecteddate:", pickupDT);
                        slttime = +hourOfDay + ":" + minute;
                        mEditText.setText(pickupDT);
                        finddatas(pickupDT);
                    }
                }, mHour, mMinute, false);
        timePickerDialog.show();
    }

    private void finddatas(String d1) {
        Calendar calender = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm", Locale.US);
        System.out.println(calender.get(Calendar.HOUR_OF_DAY) + ":" + calender.get(Calendar.MINUTE) + ":" + calender.getActualMinimum(Calendar.SECOND));
        String getCurrentDateTime = sdf.format(calender.getTime());
        Log.d("getCurrentDateTime", getCurrentDateTime);

        if (getCurrentDateTime.compareTo(d1) < 0) {
            Log.i("return date", "Greater date");
            show("current date", "Greater Date choosen");
        } else if (getCurrentDateTime.compareTo(d1) == 0) {
            Log.i("return date", "same date");
            show("current date", "Same Date choosen by customer");
            sdf = new SimpleDateFormat("HH:mm", Locale.US);
            String getCurrentDateTime1 = sdf.format(calender.getTime());
            Toast.makeText(this, getCurrentDateTime1, Toast.LENGTH_SHORT).show();
            if (getCurrentDateTime1.compareTo(slttime) < 0) {
                Log.i("get_return date", "Greater time");
            } else if (getCurrentDateTime1.compareTo(slttime) == 0) {
                Log.i("get_return date", "same time");
            } else {
                Log.d("get_Return", "getMyTime older than time ");
            }
        } else {
            show("current date", "Choosen Date is lesser then current date");
            Log.d("Return", "getMyTime older than getCurrentDateTime ");
        }
    }

    public void show(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

    public void currenttimeadded(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy HH:mm", Locale.ENGLISH);
        String currentDateandTime = sdf.format(new Date());
        Date date = null;
        try {
            date = sdf.parse(currentDateandTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, 1);

        System.out.println("Time_here "+calendar.getTime());
    }
}
