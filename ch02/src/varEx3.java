
public class varEx3 {

	public static void main(String[] args) {
		final int score;
		score = 100;
		System.out.println(score);
		
		boolean power = true;
		
		byte b = 127; // byte 범위 -128 ~ 127 넘어가면 에러남 
		 
		int oct = 010; // 8진수 , 10진수로 8
		int hex = 0x10; // 16진수 , 10진수로 16
		long l = 1000_000_000; // int type은 +,- 20억 넘어가는 숫자 쓸꺼면 리터럴에 L 붙여서 사용
		float d = 3.14f;
		double e = 3.14;
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		
		char ch = 'a';
		int i = 'A';
		
		String str = "";
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2+str3;
		System.out.println(""+7+7);
		System.out.println(7+7+"");
		
	}

}
