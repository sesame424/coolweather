package com.example.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		String str = "我以前的号码是18712345678, 现在的号码是13423145768";
		String regex = "1[35678]\\d{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		boolean b = m.matches();
		
		System.out.println(b);
		
		
		
	}

}
