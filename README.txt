### Tips

- Scanner is in java.util and BufferedReader is in java.io
- %15s - spaces before String
- %-15s - spaces after String
- %03d - zeroes before integer
- byte (2^8) > short (2^16) > int (2^32) > long (2^64)
- to find day of the week use calendar (ref 11)
- to print currency use java.text.NumberFormat
- if `int` we can use `==` operator, if `Integer` we can only use `.equalsTo`
- text.substring for text slice
- to reverse a String, use `StringBuilder(text).reverse().toString()`
- python dict == HashMap<String, Integer> | .get() .put() | Not thread safe | no method is syncronised | null allowed
- HashTable<String, Integer> | .get() .put() | Thread safe | methods are syncronised | null not allowed
- to iterate through HashMap, use `for (Map.Entry<String, String> mapElement : map.entrySet()) {}` | mapElement.getKey() and mapElement.getValue();
- to split line with multiple characters user `[!,?._'@ ]`
- regex compile - java.util.regex.Pattern - Pattern.compile(regexPattern)
- to find prime iterate through odd numbers till square root of n
- prime - BigInteger(number).isProbablePrime(1) | instead of + or * use .add() .multiply()
- Array: int[] a = new int[n]
- List<String> list = { "Sandeep" } - Initialise directly
- General: List<String> arr = new ArrayList() | .get() .add() .remove()
- To quickly add, remove at index use: List<String> arr = new LinkedList() | .get() .add() .remove()
- Array to List -> list.toArray() | List to Array -> Arrays.asList()
- python set == HashSet<String> | .add() .remove() .contains()
- For interface use implements and for class use extends
- Sort : list.sort(Comparator.naturalOrder()) | list.sort(Comparator.reverseOrder());
- BitSet bitSet = new BitSet(setLength); .or | .and | .xor | .flip | .set
- bitSet.cardinality() - returns the number of bits set to true in this BitSet
- use int... , String... for varargs
- use instanceOf to check if the object is of instance class
- String.valueOf to convert int to string