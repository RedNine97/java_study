package j1214;
//예외처리 
public class HelloTest {
	//Exception 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i=0; //첨자                  [0]          [1]          [2]
		 String greetings[] = {"객체형변환","예외처리","예외처리 방법"};
		 
		 while (i<4) { //3<4
			 System.out.println(greetings[i]); //greetings[3]이 없어서 에러가 뜸
			 i++;
		 }//while
	}//main
}
