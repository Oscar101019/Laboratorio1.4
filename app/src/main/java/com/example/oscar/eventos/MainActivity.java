package com.example.oscar.eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mLog;
    Button  runButton,clearButton;
    String cad="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        runButton=(Button)findViewById(R.id.run_button);
        clearButton= (Button)findViewById(R.id.clear_button);

        runButton.setOnClickListener(view -> runCode(view));

        clearButton.setOnClickListener(view -> clearLog(view));


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


    @Override
    protected void onPause() {
        super.onPause();
        logMessage("En el metodo onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logMessage("En el metodo onResume");
    }

    public void runCode(View view) {
        logMessage("runCode");
    }

    public void clearLog(View view) {
        mLog.setText("");
        mLog.scrollTo(0, 0);
        cad="";

    }

    private void logMessage(String message){
        Log.d(message,message + "\n");
        cad = cad+message+"\n";
        mLog.setText(cad);
    }

}
