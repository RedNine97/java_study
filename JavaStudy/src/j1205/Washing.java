package j1205;

public class Washing {
    String maker;      //제조사
    String name;        //모델명
    String type;        //종류
    int size;                //크기
    boolean power=false;   //전원
    
    //세탁기 전원 On
    void buttonOn() {
        power = !power;
        System.out.println("띠로링 세탁기 On");
    }
    
    //세탁기 전원 Off
    void buttonOff( ) {
        power = !power;
        System.out.println("띠로리 세탁기 Off!!");
    }
    
//    예약모드
    void book(int b) {
        if (b==30) {
            System.out.println("(예약) "+b+"분 후에 세탁이 완료됩니다.");
        }else if (b<=10) {
            System.out.println("(예약) "+b+"시간 후에 세탁이 완료됩니다.");
        }
     }
    
//    빨래모드
    void mode(String mo ) {
        if (mo.contentEquals("애벌") ) {
            System.out.println(mo+"세탁 모드를 시작합니다.");
        }else if (mo.contentEquals("표준")) {
            System.out.println("탈수 강, 행굼 2회 "+mo+"모드를 시작합니다.");
        }else if(mo.contentEquals("급속")) {
            System.out.println(mo+"세탁 모드를 시작합니다.");
        }
    }
//    세탁기 정보
    void washingInfoPrint() {
        System.out.println("==== 세탁기 정보 출력 ====");
        System.out.println("제조사 => " + maker);
        System.out.println("모델명 => " + name);
        System.out.println("세탁기 종류 => " +type);
        System.out.println("전원 상태 => " + power);
        System.out.println("세탁기 크기 => "+size+"kg");
    }
}