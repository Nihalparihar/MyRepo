import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		/*
		 * String str="helloooo"; char [] ch=str.toCharArray();
		 * 
		 * Map<Character, Integer> map=new HashMap<Character, Integer>(); for(char i:ch)
		 * {
		 * 
		 * if(map.containsKey(i)) { int value=map.get(i); map.put(i, value+1); } else {
		 * 
		 * map.put(i, 1);
		 * 
		 * } } System.out.println(map);
		 */
		
		int []arr= {2,2,3,4,5,5,5,6,6};
		//char [] ch=str.toCharArray();
	
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i:arr)		{
			
			if(map.containsKey(i))
			{
				int value=map.get(i);
				map.put(i, value+1);
			}
			else
			{
				
				map.put(i, 1);
				
			}
		}
		System.out.println(map);
	}

}
