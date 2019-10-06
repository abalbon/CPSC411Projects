package com.example.homework1;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HorizontalScrollView hsv = new HorizontalScrollView(this);

        GridLayout grid = new GridLayout(this);
        ViewGroup.LayoutParams gridParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        grid.setLayoutParams(gridParams);
        grid.setColumnCount(4);
        grid.setRowCount(11);

        // Header
        TextView heading = new TextView(this);
        heading.setText("Rules void hello1(int hour)");
        heading.setBackgroundColor(Color.BLACK);
        heading.setTextColor(Color.WHITE);
        GridLayout.Spec row_spec = GridLayout.spec(0, 1);
        GridLayout.Spec col_spec = GridLayout.spec(0, 4);
        GridLayout.LayoutParams pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        heading.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        grid.addView(heading, pParams);

        // Row 1
        TextView prop = new TextView(this);
        prop.setText("properties");
        row_spec = GridLayout.spec(1,2);
        col_spec = GridLayout.spec(0, 1);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setMargins(20,0,20,0);
        pParams.setGravity(Gravity.CENTER_VERTICAL);
        prop.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("Name");
        row_spec = GridLayout.spec(1, 1);
        col_spec = GridLayout.spec(1,  2);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("Day Hour Classification");
        row_spec = GridLayout.spec(1);
        col_spec = GridLayout.spec(3, 1);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        // Row 2
        prop = new TextView(this);
        prop.setText("Category");
        row_spec = GridLayout.spec(2, 1);
        col_spec = GridLayout.spec(1, 2);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("Day and Time");
        row_spec = GridLayout.spec(2, 1);
        col_spec = GridLayout.spec(3, 1);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        // Row 3
        prop = new TextView(this);
        prop.setText("Rule");
        row_spec = GridLayout.spec(3,1);
        col_spec = GridLayout.spec(0, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#00ffff"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("C1");
        row_spec = GridLayout.spec(3, 1);
        col_spec = GridLayout.spec(1, 2, 2f);
        pParams = new GridLayout.LayoutParams(row_spec,col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#00ffff"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("A1");
        row_spec = GridLayout.spec(3,1);
        col_spec = GridLayout.spec(3,1, 2f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#00ffff"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        // Row 4
        prop = new TextView(this);
        prop.setText("");
        row_spec = GridLayout.spec(4,1);
        col_spec = GridLayout.spec(0, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#00ffff"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("min <= hour && hour <= max");
        row_spec = GridLayout.spec(4,1);
        col_spec = GridLayout.spec(1, 2, 2f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#00ffff"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("System.out.printIn(greeting+ ', World!'");
        row_spec = GridLayout.spec(4,1);
        col_spec = GridLayout.spec(3, 1, 2f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#00ffff"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        // Row 5
        prop = new TextView(this);
        prop.setText("");
        row_spec = GridLayout.spec(5,1);
        col_spec = GridLayout.spec(0, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#00ffff"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("");
        row_spec = GridLayout.spec(5,1);
        col_spec = GridLayout.spec(1, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#00ffff"));
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("int min");
        row_spec = GridLayout.spec(5,1);
        col_spec = GridLayout.spec(1, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        pParams.setMargins(0, 0, 120, 0);
        prop.setBackgroundColor(Color.parseColor("#00ffff"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("int max");
        row_spec = GridLayout.spec(5,1);
        col_spec = GridLayout.spec(2, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#00ffff"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("String greeting");
        row_spec = GridLayout.spec(5,1);
        col_spec = GridLayout.spec(3, 1, 2f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#00ffff"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        // Row 6
        prop = new TextView(this);
        prop.setText("Rule");
        row_spec = GridLayout.spec(6,1);
        col_spec = GridLayout.spec(0, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        prop.setTypeface(Typeface.DEFAULT_BOLD);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("From");
        row_spec = GridLayout.spec(6,1);
        col_spec = GridLayout.spec(1, 1, 2f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL);
        prop.setBackgroundColor(Color.parseColor("#ffffe0"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        prop.setTypeface(Typeface.DEFAULT_BOLD);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("To");
        row_spec = GridLayout.spec(6,1);
        col_spec = GridLayout.spec(2, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#ffffe0"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        prop.setTypeface(Typeface.DEFAULT_BOLD);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("Greeting");
        row_spec = GridLayout.spec(6,1);
        col_spec = GridLayout.spec(3, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#ffbf80"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        prop.setTypeface(Typeface.DEFAULT_BOLD);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        // Row 7
        prop = new TextView(this);
        prop.setText("R10");
        row_spec = GridLayout.spec(7,1);
        col_spec = GridLayout.spec(0, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("0");
        row_spec = GridLayout.spec(7,1);
        col_spec = GridLayout.spec(1, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#ffffe0"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("0");
        row_spec = GridLayout.spec(7,1);
        col_spec = GridLayout.spec(2, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#ffffe0"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("Good Morning");
        row_spec = GridLayout.spec(7, 1);
        col_spec = GridLayout.spec(3, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#ffbf80"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        // Row 8
        prop = new TextView(this);
        prop.setText("R20");
        row_spec = GridLayout.spec(8,1);
        col_spec = GridLayout.spec(0, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("12");
        row_spec = GridLayout.spec(8,1);
        col_spec = GridLayout.spec(1, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#ffffe0"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("17");
        row_spec = GridLayout.spec(8,1);
        col_spec = GridLayout.spec(2, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#ffffe0"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("Good Afternoon");
        row_spec = GridLayout.spec(8, 1);
        col_spec = GridLayout.spec(3, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#ffbf80"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        // Row 9
        prop = new TextView(this);
        prop.setText("R30");
        row_spec = GridLayout.spec(9,1);
        col_spec = GridLayout.spec(0, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("18");
        row_spec = GridLayout.spec(9,1);
        col_spec = GridLayout.spec(1, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#ffffe0"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("21");
        row_spec = GridLayout.spec(9,1);
        col_spec = GridLayout.spec(2, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#ffffe0"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("Good Evening");
        row_spec = GridLayout.spec(9, 1);
        col_spec = GridLayout.spec(3, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#ffbf80"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        // Row 10
        prop = new TextView(this);
        prop.setText("R40");
        row_spec = GridLayout.spec(10,1);
        col_spec = GridLayout.spec(0, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("22");
        row_spec = GridLayout.spec(10,1);
        col_spec = GridLayout.spec(1, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#ffffe0"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("23");
        row_spec = GridLayout.spec(10,1);
        col_spec = GridLayout.spec(2, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#ffffe0"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        prop = new TextView(this);
        prop.setText("Good Night");
        row_spec = GridLayout.spec(10, 1);
        col_spec = GridLayout.spec(3, 1, 1f);
        pParams = new GridLayout.LayoutParams(row_spec, col_spec);
        pParams.setGravity(Gravity.FILL_HORIZONTAL);
        prop.setBackgroundColor(Color.parseColor("#ffbf80"));
        prop.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        prop.setLayoutParams(pParams);
        grid.addView(prop);

        hsv.addView(grid);
        setContentView(hsv);
    }
}
