package com.example.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Scanner input = new Scanner(System.in);
        String s = input.toString();
        int sum = 0;
        char ch = s.charAt(1);

        
        String str = "我以前的号码是18712345678, 现在的号码是13423145768";
		String regex = "1[35678]\\d{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		boolean b = m.matches();
		
		System.out.println(b);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void method(){
    	System.out.println("a");
    }
    
}
