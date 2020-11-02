import java.util.ArrayList;
public class TestSort{
	public static void sort(ArrayList<Number> list){
		
		for (int n = 0; n < list.size(); n ++){
			double min = list.get(n).doubleValue();
			int i_min = n;
			for (int i = n; i < list.size(); i ++){
                if (list.get(i).doubleValue() < min){
                	min = list.get(i).doubleValue();
                	i_min = i;
                }
		    }
		    list.set(i_min, list.get(n).doubleValue());
		    list.set(n, min);
		}	
	}

	public static void main(String[] args) {
		ArrayList<Number> L = new ArrayList<>();
		L.add(3);
		L.add(7);
		L.add(2);
		L.add(5);
		L.add(6);
		L.add(4);
        System.out.println("The list before sorting is " + L);
        sort(L);
        System.out.println("The list after sorting is " + L);
	}
}