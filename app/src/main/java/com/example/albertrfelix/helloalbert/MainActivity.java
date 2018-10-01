 package com.example.albertrfelix.helloalbert;

 import android.os.Bundle;
 import android.support.v7.app.AppCompatActivity;
 import android.text.TextUtils;
 import android.util.Log;
 import android.view.View;
 import android.widget.EditText;
 import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Albert", "Button Clicked");
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 findViewById(R.id.rootView).setBackgroundColor(
                         getResources().getColor(R.color.burgundy));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Grab the text the user inputted
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                //Put the text into our text view once the 'change text' button is clicked
               if(TextUtils.isEmpty(newText)) {
                   ((TextView) findViewById(R.id.textView)).setText("Hello from Albert!");
               } else {
                   ((TextView) findViewById(R.id.textView)).setText(newText);
               }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //rest text color back to black
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.blackish));

                //reset background back to navy
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.navy));

                //reset text back to "Hello from Albert!"
                ((TextView) findViewById(R.id.textView)).setText("Hello from Albert!");

            }
        });

    }
}
