package j1214;
//예외처리 =>메서드와 연관(caller ----> worker method)
public class HelloTest2 {
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		// TODO Auto-generated method stub
/*		 int i=0; //첨자                  [0]          [1]          [2]
		 String greetings[] = {"객체형변환","예외처리","예외처리 방법"};
		 
		 while (i<4) { //3<4
			 System.out.println(greetings[i]); //greetings[3]이 없어서 에러가 뜸
			 i++;
		 }//while
*/		 
		try {
		HelloTest2 ht =new HelloTest2();
		ht.go();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자의 계산이 잘못되었습니다.");
			//에러메세지를 내보낸다.
			System.out.println(e.getMessage()); //간단한 메세지
			System.out.println(e); //e.toString() => 중간정도의 메세지
			e.printStackTrace(); // 추적한다.(에러의 관련된 모든 클래스를 추적)
		}
		
	}//main
	public void go() throws ArrayIndexOutOfBoundsException {
		int i=0; //첨자                  [0]          [1]          [2]
		 String greetings[] = {"객체형변환","예외처리","예외처리 방법"};
		 
		 while (i<4) { //3<4
			 System.out.println(greetings[i]); //greetings[3]이 없어서 에러가 뜸
			 i++;
		 }//while
	}

	
}
