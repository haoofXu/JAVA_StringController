package basic;

import StdMethods.StdIn;
import StdMethods.StdOut;

public class StringController {
	//	判断字符串是否是一条回文
	public static boolean isPalindrome(String s){
		int N = s.length();
		for(int i = 0; i<N/2; i++){
			if(s.charAt(i)!=s.charAt(N-1-i))
				return false;
		}
		return true;
	}
	
	//	从一个命令行参数中提取文件名和扩展名
	public static void readNameAndExten(String s){
		int dot = s.indexOf(".");
		String base = s.substring(0, dot);
		String extension = s.substring(dot+1, s.length());
	}
	
	//	打印从标准输入中所有含有指定的字符串的行
	public static void printHaveString(String query){
		while(!StdIn.isEmpty()){
			String s = StdIn.readLine();
			if(s.contains(query)) StdOut.println(s);
		}
	}
	
}
