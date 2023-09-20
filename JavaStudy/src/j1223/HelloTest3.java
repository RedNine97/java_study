package j1223;

public class HelloTest3 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		HelloTest3 ht=new HelloTest3();
		ht.go();
	}
	public void go() {
                           
			int i=0;
	       String greetings[]= {"객체형변환","예외처리","예외처리방법"};
	       try {
	       while(i<4) { 
	    	  System.out.println(greetings[i]);
	    	  i++;
	       }
	       }catch(Exception e) {
	    	   System.out.println("배열첨자의 계산이 잘못되었습니다.");
	    	   e.printStackTrace();
	       }
	}
}
