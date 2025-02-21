package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxVal {
public static void main(String[] args) {
	List<Integer> data = Arrays.asList(10,32,452,13,16,70);
	Optional<Integer> maxVal = data.stream().max(Integer::compareTo);
	if(maxVal.isPresent()) {
		Integer val = maxVal.get();
		System.out.println(val);
	}
}
}
