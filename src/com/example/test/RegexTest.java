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
		String str = "����ǰ�ĺ�����18712345678, ���ڵĺ�����13423145768";
		String regex = "1[35678]\\d{9}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		boolean b = m.matches();
		
		System.out.println(b);
		
		
		
	}

}
