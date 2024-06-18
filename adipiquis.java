import java.util.HashMap;

HashMap<String, Integer> my_map = new HashMap<>();
my_map.put("foo", 1);
my_map.put("bar", 2);
my_map.put("baz", 3);
my_map.put("qux", 4);
my_map.remove("foo");
System.out.println(my_map); // {bar=2, qux=4, baz=3}
