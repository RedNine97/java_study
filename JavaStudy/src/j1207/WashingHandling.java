package j1207;

class Washing {
    private String maker;      //제조사
    private String name;        //모델명
    private String type;        //종류
    private int size;                //크기
    private boolean power=false;   //전원
//  생성자 오버로딩
  Washing() {
          this.maker="LG전자";
          this.name="블랙라벨 통돌이 DD모터 세탁기";  
          this.type="드럼식 세탁기";        
          this.size=16;                
          this.power=false;  
   }   
  Washing(String maker, String name, String type, int size, boolean power) {
      this.maker=maker;
      this.name=name;  
      this.type=type;        
      this.size=size;                
      this.power=power;  
  }
//    Setter Method
    public void setMaker(String maker) {
        this.maker=maker;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setType(String type) {
        this.type=type;
    }
    public void setSize(int size) {
        this.size=size;
    }
    public void setPower(boolean power) {
        this.power=!power;
    }
//    Getter Method
    public String getMaker() {return this.maker;}
    public String getName() {return this.name;}
    public String getType() {return this.type;}
    public int getSize() {return this.size;}
    public boolean getPower() {return this.power;}
//    세탁기 전원 On
    void getButtonOn() {
        this.power = !this.power;
        System.out.println("띠로링 세탁기 On");
    }
//    세탁기 전원 Off
    void getButtonOff( ) {
        this.power = !this.power;
        System.out.println("띠로리 세탁기 Off!!");
    }
//    예약모드
    void getBook(int book) {
        if (book==30) {
            System.out.println("(예약) "+book+"분 후에 세탁이 완료됩니다.");
        }else if (book<=10) {
            System.out.println("(예약) "+book+"시간 후에 세탁이 완료됩니다.");
        }
     }
//    빨래모드
    void getMode(String mode ) {
        if (mode.contentEquals("애벌") ) {
            System.out.println(mode+"세탁 모드를 시작합니다.");
        }else if (mode.contentEquals("표준")) {
            System.out.println("탈수 강, 행굼 2회 "+mode+"모드를 시작합니다.");
        }else if(mode.contentEquals("급속")) {
            System.out.println(mode+"세탁 모드를 시작합니다.");
        }
    }
//    세탁기 정보
    void washingInfoPrint() {
        System.out.println("==== 세탁기 정보 출력 ====");
        System.out.println("제조사 => " + this.maker);
        System.out.println("모델명 => " + this.name);
        System.out.println("세탁기 종류 => " +this.type);
        System.out.println("전원 상태 => " + this.power);
        System.out.println("세탁기 크기 => "+this.size+"kg");
    }
}
public class WashingHandling {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Washing LG = new Washing();
        LG.washingInfoPrint();

        LG.getButtonOn();
        LG.getBook(2);
        LG.getMode("표준");
        LG.getButtonOff();
        System.out.println("--------------------------------------");
        
        Washing samsung = new Washing
        ("삼성","그랑데 세탁기 AI","그랑데 세탁기",24,false);
        samsung.washingInfoPrint();
    }
}