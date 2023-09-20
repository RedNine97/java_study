package Check;

public class Time {
	private int year;
    private int month;
    private int day;
    
//    Setter Method 작성할것.
    public void setYear(int year) {
    	this.year=year;
    }
    public void setMonth(int month) {
    	this.month=month;
    }
    public void setDay(int day) {
    	this.day=day;
    }
    
    public int getYear() {
		return year;
	}
    public int getMonth() {
		return month;
	}
    public int getDay() {
		return day;
	}
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t=new Time();
        t.setYear(2022);
        System.out.println("올해는 "+t.getYear());
	}

}
