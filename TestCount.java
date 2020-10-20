public class TestCount{
	public static void count(){
		int[] counts = new int[10];
        int n = 1;
		while (n <= 100){
			int number = (int)(Math.random() * 10);
			counts[number] ++;
			n ++;
		}
		for (int i = 0; i < counts.length; i ++){
			System.out.println(i + " appears " + counts[i] + " times.");
		}
	}
	public static void main(String[] args) {
		count();
	}
}