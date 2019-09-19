package replPractice;

import java.util.ArrayList;

public class replPractice189 {
public static void main(String[] args) {
	ArrayList<Integer> nums = new ArrayList<>();
	nums.add(10);
	nums.add(20);
	nums.add(30);
	nums.add(40);
	nums.add(50);
	for (int i = 0; i < nums.size(); i++) {
		
		nums.set(i, nums.get(i)*2);
		
	}
	//System.out.println(nums(i));
	System.out.println(nums);
	System.out.println(nums.get(4));
}
}
