package streamAPI;

import java.util.Arrays;
import java.util.List;

public class ForEach {
public static void main(String[] args) {
	List<String> names = Arrays.asList("Bikash","Sriram","Alok","Dinesh");
	names.stream().forEach(n->System.out.println(n));
}
}
