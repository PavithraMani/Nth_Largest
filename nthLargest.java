import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class nthLargest{

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String a[]=line.split(" ");
		Set<String> st = new HashSet<String>();
		List<String> list=new ArrayList<String>();
		List<String> list1=new ArrayList<String>();
		
		for(String i : a)
			list1.add(i);	
		
		int nth=Integer.parseInt(list1.remove(list1.size()-1));
		
		st.addAll(list1); //To remove duplicates
		list.addAll(st);
		
		Collections.sort(list);
		Collections.reverse(list);
		
		System.out.println(list);
		String nthLargest=list.get(nth-1);
		System.out.println(nthLargest);
	}
}