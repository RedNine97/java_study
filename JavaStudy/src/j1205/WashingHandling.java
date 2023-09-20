package j1205;

public class WashingHandling {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Washing LG =new Washing();
        
        LG.maker = "LG전자";
        LG.name = "블랙라벨 통돌이 DD모터 세탁기";
        LG.type = "드럼식 세탁기";
        LG.size = 16;
        
        LG.buttonOn();   //세탁기 전원 On
        LG.book (2);      //예약모드 (시간 or 분)
        LG.mode("표준"); //빨래 모드(급속, 표준, 애벌)
        
        LG.washingInfoPrint();  //세탁기 정보
        LG.buttonOff();   //세탁기 전원 Off
    }
}