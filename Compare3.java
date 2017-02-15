public class Compare3{
	
	public static Comparable largest(Comparable one, Comparable two, Comparable three){
		
		if(one.compareTo(two) > 0){
			
			if(one.compareTo(three) > 0){
				return one;
			}else{
				return three;
			}
			
		}else if(two.compareTo(three) > 0){
			return two;
		}else{
			return three;
		}
		
		
		
		
	}
	
}