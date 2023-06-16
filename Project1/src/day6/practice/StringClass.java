package day6.practice;

public class StringClass {

	public static void main(String[] args) {
	
		
		//string class
		String str1=new String();
		StringBuilder sb1=new StringBuilder("Metahorizon");
		StringBuffer sbf1=new StringBuffer("Meta");
		str1="Metahorizon";
		
		char ch=str1.charAt(0);
		System.out.println(ch);
		StringBuilder sb2=sb1.append("hello");
		System.out.println(sb1);
		System.out.println(sb2);
		StringBuffer sbf2=sbf1.append("hi");
		System.out.println(sbf1);
		System.out.println(sbf2);
		
	
		

		
		
	}

}
