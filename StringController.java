package basic;

import StdMethods.StdIn;
import StdMethods.StdOut;

public class StringController {
	//	�ж��ַ����Ƿ���һ������
	public static boolean isPalindrome(String s){
		int N = s.length();
		for(int i = 0; i<N/2; i++){
			if(s.charAt(i)!=s.charAt(N-1-i))
				return false;
		}
		return true;
	}
	
	//	��һ�������в�������ȡ�ļ�������չ��
	public static void readNameAndExten(String s){
		int dot = s.indexOf(".");
		String base = s.substring(0, dot);
		String extension = s.substring(dot+1, s.length());
	}
	
	//	��ӡ�ӱ�׼���������к���ָ�����ַ�������
	public static void printHaveString(String query){
		while(!StdIn.isEmpty()){
			String s = StdIn.readLine();
			if(s.contains(query)) StdOut.println(s);
		}
	}
	
}
