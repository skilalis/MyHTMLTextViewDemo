package com.example.myhtmltextviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    String myText = "<h1> This is heading 1 </h1>\n"+
            "<h2> This is heading 2</h2>\n"+
            "<h3> This is heading 3</h3>\n"+
            "<p> This is a paragraph </p>\n"+
            "<p><u> This is a underline</u></p>\n"+
            "<p><b> This is a bold text </b></p>\n"+
            "Programming language ordered list \n"+
            "<ol>\n"+
            "<li>c</li>\n"+
            "<li>c++</li>\n"+
            "<li>Java</li>\n"+
            "</ol>\n\n"+
            "(a+b)<sup>2</sup>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewId);
        textView.setText(Html.fromHtml(myText));

    }
}