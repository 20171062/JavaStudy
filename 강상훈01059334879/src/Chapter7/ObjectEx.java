package Chapter7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ObjectEx {
	
	SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date now = new Date();  // << ctrl + shift + O ?ϸ? ??
	String date = "date";
	int dateCode = 100;
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return dateCode;
	}
	
	public boolean equals(ObjectEx obj) {
		// TODO Auto-generated method stub
		return date.equals(obj.date);
	}
	@Override
	public String toString() {
		
		return f.format(now);
	}
	
	public static void main(String[] args) {
		ObjectEx obj = new ObjectEx();
		ObjectEx obj2 = new ObjectEx();
		
		boolean flag = obj.equals(obj2);

		System.out.println(obj);
		System.out.println(flag);
		
		String str = "??????";
		String str2 = "??????";
		String str3 = new String("??????");
		
		boolean flag1 = str.equals(str2);
		boolean flag2 = str.equals(str3);
		boolean flag3 = str == str2;
		boolean flag4 = str == str3;
			
		System.out.println("str, str2 : " + flag1);
		System.out.println("str, str3 : " + flag2);
		System.out.println("str, str2 : " + flag3);
		System.out.println("str, str3 : " + flag4);
	}
}