package com.ktdsuniversity.edu.staticexam;

public class StringUtils {
	
	public static boolean isEnoughLength(String string) { // type 앞에 static
		int strLength = string.length();
		return strLength >= 5;
	}
	
	public static boolean isDecimalFormat(String string) {
		return string.matches("^[0-9]+$"); // 정규 표현식 : 형태 검사 ^ : 무언가로 시작하는가, $ : 무언가로 끝나는가, [] : 범위 그중 한글자
	}
	
	
}
