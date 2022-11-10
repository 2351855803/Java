package 方法.String常用方法;

public class Test2 {
    public static void main(String[] args) {


        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //   判断字符串和判断数组长度的区别
        //  数组   [].length     字符串     .length()

        //  char charArt(int index)方法
        char c = "中国人".charAt(2);
        System.out.println(c);   //人


        //int compareTo(String anotherString)         通过字典顺序比较
        int reslut = "abc".compareTo("abc");  //0    10-10
        int reslut2 = "abcd".compareTo("abce");  //-1   7-8
        int reslut3 = "abce".compareTo("abcd");   //1   8-7
        int reslut4 = "abcd".compareTo("abcg");   //-3
        int result5 = "aaabbb".compareTo("aaabbb");
        System.out.println(result5 + "-----------");



        // boolean contains(charSequence s)
        //判断前面字符串是否包含后面的字符串，返回布尔类型
        System.out.println("java.lang".contains("java"));   //true
        System.out.println("java.lang".contains("jjjjjjj"));//false


        // boolean endsWith()
        //判断当前字符串是否以某个字符串结尾
        System.out.println("java.lang".endsWith("lang"));
        System.out.println("java.lang".endsWith("g"));
        System.out.println("java.lang".endsWith("lang1"));
        System.out.println("java.lang" + "4456" .endsWith("4456"));

        //  startWith()   //判断是否以某个子字符串开始的


       //equals    比较两个字符串


        //equalsIgnoreCase()  比较两个字符串 忽略大小写
        System.out.println("abc".equalsIgnoreCase("aBc"));
        System.out.println("abc".equalsIgnoreCase("aBcc"));


        //吧字符串转换为byte数组
        byte[] bytes = "abcde".getBytes();
        for(int i = 0; i < bytes.length; i++){
            System.out.println(bytes[i]);
        }



        //"".indexOf("")  判断子字符串在当前字符串的下标
        System.out.println("abcdefghijklmn".indexOf("a"));
        System.out.println("abcdefghijklmn".indexOf("ijk"));
        //   lastIndexOf("")   判断字符串最后出现的下标


        //   "".isEmpty()  判断字符是否为空  不是null


        //String.repalce(目标字符串，老字符串)

        String newString = "qqdddwwwweeqqsdddddeee".replace("w","i");
        System.out.println(newString);


        //以 - 分开数组
        String[] s = "abc-aaa-assaas-assaasas".split("-");
        for(int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }


        //subString()    以下标截取字符串
        //两种重载  subString(索引)   subString(开始索引，结束索引)
        String s1 = "abcdddddfff".substring(2);
        String s2 = "abcdddddfff".substring(2,10);   //2包括  10不包括
        System.out.println(s1);
        System.out.println(s2);


        //  toCharArray()   把字符串转换成char类型数组
        char[] s4 = "我是中国人".toCharArray();
        for(int i = 0; i < s4.length; i++){
            System.out.println(s4[i]);
        }


        //toLowCase   转为小写
        //toUpCase   转为大写
        //trim  去除前后空白


        //valueOf  把任何类型转换为String类型    唯一一个静态方法，不用new对象
        String q = String.valueOf(555);
        System.out.println(q);







    }
}
