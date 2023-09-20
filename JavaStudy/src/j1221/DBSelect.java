package j1221;

import java.sql.*; //DB에 관련된 클래스, 인터페이스

public class DBSelect {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. DB에 접속을 성공한 상태 => Connection 객체를 얻어왔다 표현
		Connection con =null;
//		2. 형식) jdbc:oracle:thin:@.원격ip주소(=localhost):포트번호:sid(orcl)
//		XE버전은 								,,										  :xe(xe버전 설치)
//		----- 추가 -----------------------------------
		Statement stmt =null;  				//create table ~
		PreparedStatement pstmt = null; //insert into     (Prepared)***
		Statement stmt2 = null;  				//select
		ResultSet rs =null; 						//select의 결과를 표형태로 담을 객체 필요
		String sql = ""; 							//sql구문 저장
		
//		접속하고자 하는 컴퓨터의 위치 localhost = 아이피주소
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
//			1. 접속할 드라이버를 메모리에 올리기
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			2. 접속하기 위해서 getConnection(1. 접속할 위치 2. 계정명 3. 암호)
			con=DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("con (DB자~)=> "+ con);
			
//			3. 테이블 생성
			stmt = con.createStatement(); //문장을 만들어주는 메서드
			sql="create table MyTest(name varchar2(20),age number)";
			int create = stmt.executeUpdate(sql); //0 <-- 테이블&데이터 아직 안들어감
			System.out.println("테이블 성공 유무(create) => "+create);
			
//			4. insert into ~
			pstmt = con.prepareStatement
					("insert into mytest values(?,?)"); //? => 입력받아서 값을 넣겠다는 의미
//			형식) pstmt 객체명.setString(or setInt, setDouble,,?순서, 저장할 값)
			pstmt.setString(1, "hong"); //name
			pstmt.setInt(2, 23);            //age
			int insert = pstmt.executeUpdate();
			System.out.println("데이터 입력 성공 유무(insert) => "+ insert); //1 <- 테이블&데이터가 들어갔다
			
//			5. select
			stmt2=con.createStatement();
			rs=stmt2.executeQuery("select * from mytest");
			
			while(rs.next()) { //rs.next()==true (보여줄 레코드가 있다면)
				String name = rs.getString("name");
				int age = rs.getInt(2); //rs.getInt("age")
				System.out.println("name => "+name+"  age => "+age);
			}
//			6. 메모리 해제 -> 에러유발과 상관없이 받드시 처리하고 프로그램 종료
//			생성된 객체의 역순으로 메모리를 해제
//			con -> stmt -> pstmt -> stmt2 -> rs
			rs.close();
			stmt2.close();
			pstmt.close();
			stmt.close();
			con.close();
			
		}catch(Exception e) {
			System.out.println("DB연결~~ 실패 => "+ e); //이유?
		}finally {
			//try{rs.close()} catch(SQLException e) {} <-- 여기다 close() 쓰면 예외처리 해야함
		}
		
	}//main
}//class DBTest
