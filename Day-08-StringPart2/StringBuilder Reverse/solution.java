package StringAndStringBuilder;
// Not using inbuilt function
public class StringBuilderReverse {
    public static void main(String[] args) {
        String str = "Shubham Thakur";
        StringBuilder sb = new StringBuilder(str);
        int n=sb.length();
        int i=0;
        int j=n-1;
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
