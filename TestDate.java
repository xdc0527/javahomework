import java.util.Date;
public class TestDate{
    public static void main(String[] args) {
    	for (long i = 10000; i <= 100000000000L; i *= 10){
    		Date date = new Date(i);
    		System.out.println(date.toString());
    	}
    }	 
}