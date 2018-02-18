package fikri6998.fikrialfitrarahadi_1202150086_modul2;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.format.DateFormat;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * Created by fikri6998 on 2/18/2018.
 */

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {
    @Override
    public void onTimeSet(TimePicker view, int i, int i1) {

        // Melakukan set pada Take Away Activity
        TakeAway activity = (TakeAway) getActivity();

        activity.processTimePickerResult(i, i1);

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Melakukan waktu default
        final Calendar c = Calendar.getInstance();
        int jam = c.get(Calendar.HOUR_OF_DAY);
        int menit = c.get(Calendar.MINUTE);

        // Membuat Time PickerDialog
        return new TimePickerDialog(getActivity(), this, jam, menit,
                DateFormat.is24HourFormat(getActivity()));
    }
}
