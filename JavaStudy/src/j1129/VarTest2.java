package j1129;

//실수를 지정하는 자료형 2가지 -> float, double (단답형)
public class VarTest2 {
	
	public static void main(String[] args) {
		System.out.println("실수 값을 저장");
		//byte f; int f;   자료형과 상관없이 똑같은 변수 사용 금지
		float f=5.3f;//실수는 무조건 double, float형에 맞게 저자아라(뒤에 f)
		double f2=5.3;
		System.out.println("f=>"+f+", f2=>"+f2);
		System.out.println("float,double 차이점");
		float m_float=123456.789123f;// 소수점 둘째 자리까지 저장
		double m_double=123456.789123;
		System.out.println
		("m_float=>"+m_float+
				", m_double=>"+m_double);//정밀한 값을 저장 -> double
	
	}
}
