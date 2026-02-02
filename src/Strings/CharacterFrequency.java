package Strings;
//Find frequency of each character in a string
//Ex: Input:"programming" -> Output: p-1 r-2 o-1 g-2 a-1 m-2 i-1 n-1

//Traditional Approach - Without Any Collections
public class CharacterFrequency {
	public static void main(String[] args) {
		String str = "programming";
		
		str = str.toLowerCase().replaceAll("\\s+", "");
		
		int[] count = new int[256];
		
		for(char c : str.toCharArray()) {
			count[c]++;
		}
		
		for(int i=0; i<count.length;i++) {
			if(count[i]>0) {
				System.out.println((char)i + "-" + count[i]);
			}
		}
		
	}
}
