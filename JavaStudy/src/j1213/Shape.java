package j1213;

//원의 면적을 구해서 출력시켜주는 역할(=추상클래스) 설계+메서드 제공
public abstract class Shape {
	public double res = 0.0; //모든 도형에서 사용할 변수
	
//	원의 면적
	public abstract double area(int r); //추상메서드
	
//	ex 직사각형의 면적 (오버로딩 기법- 자료형이 다름)
//	public abstract int area(int x, int y);
//	일반메서드 -> 자식클래스에서 사용이 가능(상속 기법을 사용)
	public void printArea() {
		System.out.println("도형의 면적은 "+ res + "입니다.");
	}
	
}
