public class string_buffer {
    public static void main(String[] args) {
        String str="Cyber";
        StringBuffer sb =new StringBuffer(str);
        sb.append("success");
        System.out.println(sb);
        String str1 =sb.toString();
        System.out.println("it is string "+str1);
        sb.insert(2,"success");
        System.out.println(sb);
        sb.replace(1,3,"big");
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}
