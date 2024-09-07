package com.divideandconquer;

public class Longestpalindromicsubsequence {
	private int longestlengthsubsequence(String s, int startindex, int endindex) {
		if(startindex>endindex) 
			return 0;
		if(startindex==endindex)
			return 1;
		int c1=0;
		if(s.charAt(startindex)==s.charAt(endindex))
			c1=2+longestlengthsubsequence(s, startindex+1,endindex-1);
		int c2=longestlengthsubsequence(s, startindex,endindex-1);
		int c3=longestlengthsubsequence(s, startindex+1,endindex);
		return Math.max(c1,Math.max(c2, c3));
	}
	public int longestpalindrome(String s) {
		return longestlengthsubsequence(s,0,s.length()-1);
	}
	public static void main(String[] args) {
		Longestpalindromicsubsequence lps=new Longestpalindromicsubsequence();
		String s="elrmenmet";
		System.out.println(lps.longestpalindrome(s));
	}
}
