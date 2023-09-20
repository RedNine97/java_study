package j1220;

import java.net.*; 	//Socket클래스
import java.io.*;   	//입출력
//--------------------------------------
import java.awt.*;	//GUI
import java.awt.event.*;	//event
//---------------------------------------

//추가
import javax.swing.*;	//JFrame(윈도우 창), JTextArea, JTextField

class ChatGUIClient extends JFrame  implements ActionListener, Runnable
{
	JTextArea ta;		//클라이언트의 대화를 출력
	JTextField tf;			//입력
//	추가
	JScrollPane js;		//스크롤바
//    ---추가--------------------------------
	Socket s;  			//서버와 통신하기 위해서
	BufferedReader br; //입력 (대용량)
	PrintWriter pw; 	//출력 -> BufferedWriter(X)
	String str,str1;		 //서버(str), 대화에 출력할(str1) 문자열
//	   -------------------------------------------
	
	public ChatGUIClient(){
//    객체생성 및 배치
	   ta = new JTextArea();		//채팅창
	   tf = new JTextField(); 		//입력창
//	 추가 => NullPointerException
	   js=new JScrollPane(ta); 	//JTextAreA가 결합된 스크롤바 생성
	   
	   add(js,"Center");		//가운데
	   add(tf,"South");			//아래
	   tf.addActionListener(this); 	//이벤트 연결구문
	   setBounds(200,200,500,350);//x, y, w, h
	   setVisible(true); 		// 화면에 출력하라(창)
	   tf.requestFocus();		//커서입력
	   
//	   종료
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	   서버와 연결하는 구문
	   try{
//		1.접속할 컴퓨터ip주소,포트번호
		   s= new Socket("192.168.0.38",5432);
		   System.out.println("s=> "+s);
//		   추가 ------
		   br=new BufferedReader(				 //System.in대신에 상대방 정보
					new InputStreamReader(s.getInputStream()));
//			autoflush 버퍼에 쌓아놓지 말고 바로바로 출력하라
			pw=new PrintWriter(s.getOutputStream(),true);
	   }catch(Exception e){
		   System.out.println("접속오류="+e);
	   }
//	   Thread 객체를 생성->run()호출
	   Thread ct=new Thread(this); 	//Runnable 객체
	   ct.start();			//run()
	}
    //run
	public void run() {
//	더 이상 입력받을 수 없을때까지 ->JTextArea ta
		try {
//			서버가 보내준 글자를 출력 => TextArea(채팅창에 출력)
			while((str1=br.readLine())!=null) {
				ta.append(str1+"\n"); 		//상대방이 보내준 문자(str1) 세로로 출력
			}
		}catch(Exception e) {e.printStackTrace();}
	}
//	입력을 하고 enter => 상대방에게 전송해주는 메서드
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		str=tf.getText(); 	//입력창에 써준 글자
		tf.setText("");		 //새로 입력을 받기 위해서
		pw.println(str);		 //내가 입력한 글자(str)
		pw.flush(); 			//버퍼에 있는 데이터를 비운다.
	}
	public static void main(String[] args) 
	{
		new ChatGUIClient();
	}
}
