package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinVal {
public static void main(String[] args) {
	List<Integer> data = Arrays.asList(10,32,25,89,157,452,463);
	Optional<Integer> minVal = data.stream().min(Integer::compareTo);
	if(minVal.isPresent()) {
		Integer val=minVal.get();
		System.out.println(val);
	}
}
}
