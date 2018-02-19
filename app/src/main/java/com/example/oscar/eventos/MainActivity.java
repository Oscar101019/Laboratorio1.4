package com.example.oscar.eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLog=(TextView)findViewById(R.id.textView);
        mLog.setMovementMethod(new ScrollingMovementMethod());
        mLog.setText("");
        logMessage("onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        logMessage("En el metodo onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logMessage("En el metodo onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logMessage("En el metodo onDestroy");
    }


    public void runCode(View view) {
        logMessage("runCode");
    }

    public void clearLog(View view) {
        mLog.setText("");
        mLog.scrollTo(0, 0);
    }

    private void logMessage(String message){
        //final d = Log.d(message + "\n");
    }

}
