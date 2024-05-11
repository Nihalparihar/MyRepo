import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		
		String str="helloooo";
		char [] ch=str.toCharArray();
	
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(char i:ch)		{
			
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
