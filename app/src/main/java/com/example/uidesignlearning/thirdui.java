package com.example.uidesignlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class thirdui extends AppCompatActivity {
    SeekBar seekbar;
    TextView Text_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdui);
        Text_message
                = (TextView)findViewById(R.id.message_id);
        seekbar
                = (SeekBar)findViewById(R.id.seekbar);

        // Get the progress value of the SeekBar
        // using setOnSeekBarChangeListener() method
        seekbar.setOnSeekBarChangeListener(
                        new SeekBar
                                .OnSeekBarChangeListener() {

                            // When the progress value has changed
                            @Override
                            public void onProgressChanged(
                                    SeekBar seekBar,
                                    int progress,
                                    boolean fromUser)
                            {

                                // increment 1 in progress and
                                // increase the textsize
                                // with the value of progress
                                Text_message.setTextSize(progress + 1);
                            }

                            @Override
                            public void onStartTrackingTouch(SeekBar seekBar)
                            {

                                // This method will automatically
                                // called when the user touches the SeekBar
                            }

                            @Override
                            public void onStopTrackingTouch(SeekBar seekBar)
                            {

                                // This method will automatically
                                // called when the user
                                // stops touching the SeekBar
                            }
                        });
    }

}
