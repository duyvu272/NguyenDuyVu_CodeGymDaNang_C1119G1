public class test {
    public static void main(String[] args) {
        String st = "nguyen van a";
        String[] array = st.split(" ");
        String s2 = "";
        for(String s1 : array){
            for(int i = 0 ; i < s1.length();i++){
                if(i == 0){
                    String up  = String.valueOf(s1.charAt(0));
                    s2 += up.toUpperCase();
                }else
                    s2 += s1.charAt(i);

            }
            s2 +=" ";
        }
        System.out.println(s2);
    }
}
