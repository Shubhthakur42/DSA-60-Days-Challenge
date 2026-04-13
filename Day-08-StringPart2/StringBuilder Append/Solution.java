package StringAndStringBuilder;

public class StringBuilderAppend {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        sb.append(78);
        System.out.println(sb);
        sb.append("Hello");
        System.out.println(sb);
        sb.append('$');
        System.out.println(sb);
        char[] chars={'s','h','u','b'}; //only work for char array not int array
        sb.append(chars);
        System.out.println(sb);
        StringBuilder sb2 = new StringBuilder("shubham");
        sb.append(sb2);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
