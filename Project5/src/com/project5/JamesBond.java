package com.project5;

public class JamesBond {
	static String rgx = "[\\d)]*\\([\\d()]*007[\\d(]*\\)[\\d()]*";
	public static boolean FindMatch(String match) {
		return match.matches(rgx);
	}
}
