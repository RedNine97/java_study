package j1214;

public class ExceptionTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("매개변수 2개(동적배열)");
		try {   //    동적으로 입력받는중                     
			int a = Integer.parseInt(args[0]) ;  
			int b = Integer.parseInt(args[1]) ;    
			System.out.println("a =>"+a+" b => "+b);
			System.out.println("a를 b로 나눈 몫 "+(a/b));
		}/*catch(Exception e) {		얘는 가장 마지막에 위치해야 한다.
			System.out.println(e); 
			System.out.println("위의 예외처리 외의 나머지를 처리해줍니다.");
		}*/catch(ArithmeticException e) {
			System.out.println(e); //e.toString()
			System.out.println("어떤 수를 0으로 나눌수가 없어요");
		}catch(IndexOutOfBoundsException |
				NumberFormatException e) {// 2개를 합쳐버릴 수도 있음 Index~ | Num~
			System.out.println(e); 
			System.out.println("반드시 2개를 입력하거나 숫자만 입력해야 합니다.");
		}/*catch(NumberFormatException e) {// **숫자 대신에 문자 입력
			System.out.println(e); 
			System.out.println("반드시 숫자를 입력해야 합니다.");
		}*/catch(Exception e) {// 위의 처리하는 3개의 예외처리 외의 다른 
									      // 예외 처리를 하는 경우에 처리가 가능하다.
			System.out.println(e); 
			System.out.println("위의 예외처리 외의 나머지를 처리해줍니다.");
		}finally {// 메모리에 저장된 데이터 파일로 저장하여 종료(DB연결해제)
			System.out.println("에러발생 유무와 상관없이 무조건 반드시 처리");
		}
		
	}//main

}
