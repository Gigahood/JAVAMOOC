
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    
    public int differenceInYears(MyDate comparedDate){
        int yearsDifference = 0;
        
        yearsDifference = differenceInDays(comparedDate) / 365;
        
        return yearsDifference;
    }
    
    public int differenceInDays(MyDate comparedDate){
        return Math.abs(totalNumberOfDays(this) - totalNumberOfDays(comparedDate));
    }
    
    public int totalNumberOfDays(MyDate date){
        int total = 0;
        
        total += date.day;
        total += ( date.year * 365 );
        total += (getMonthDays(date.month));
        
        return total;
    }
    
    // this will get total number of days for the particular month
    private int getMonthDays(int month){
        int total = 0;
        
        for(int i = 1; i <= month; i++){
            if(i == 2){
                total += 28;
            }else if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12 ){
                total += 31;
            }else{
                total += 30;
            }
        }
        
        return total;
    }

  
}
