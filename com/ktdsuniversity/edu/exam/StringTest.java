package com.ktdsuniversity.edu.exam;

import com.ktdsuniversity.edu.staticexam.StringUtils;

public class StringTest {

	public static void main(String[] args) {
		
		boolean isEnough = StringUtils.isEnoughLength("이소영");
		System.out.println(isEnough);
		
		isEnough = StringUtils.isEnoughLength("Lee So Yeong");
		System.out.println(isEnough);
		
		boolean isDecimal = StringUtils.isDecimalFormat("adsaadfaf");
		System.out.println(isDecimal);
		
		isDecimal = StringUtils.isDecimalFormat("12134333");
		System.out.println(isDecimal);
		
	}
}
