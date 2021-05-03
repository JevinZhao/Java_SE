package com.Jevin;

/**
 * 总结的一些String API使用方法
 */
public class StringAPI {
    /**
     * 测试主入口
     * @param args 无
     */
    public static void main(String[] args) {
      //  construction();
      //  API01();
      //  API02();
        // API03();
       // API04();
        //API05();
        //API06();
        //API07();
        API08();

    }
    /**
     * 构造方法
     */
    public static void construction(){
        //直接初始化
        String str = "abc";
        //使用带参构造方法初始化
        char data[] = {'a', 'b', 'c'};
        String str1 = new String("abc");
        String str2 = new String(str);
        String str3 = new String(data);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

    /**
     * 获取字符串长度，以及某个位置的字符
     */
    public static void API01(){
        String str = new String("abcdef");
        int length = str.length();
        char ch = str.charAt(4);//index 从0 开始，取第五个字符
        System.out.println(length);
        System.out.println(ch);
    }

    /**
     * 获取子串
     */
    public static void API02(){
        String str1 = new String("abcdef");
        String str2 = str1.substring(2);//index 从0 开始
        String str3 = str1.substring(2,5);
        System.out.println(str2);//str2 = "cdef"
        System.out.println(str3);//str3 = "cde"
    }
    /**
     * 字符串比较
     */
    public static void API03(){
        String str1 = new String("abc");
        String str2 = new String("ABC");
        int a = str1.compareTo(str2);//a>0
        int b = str1.compareToIgnoreCase(str2);//b=0
        boolean c = str1.equals(str2);//c=false
        boolean d = str1.equalsIgnoreCase(str2);//d=true
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    /**
     * 字符串拼接
     */
    public static void API04(){
        String str = "aa".concat("bb").concat("cc");
        //相当于String str = "aa"+"bb"+"cc";
        System.out.println(str);
    }
    /**
     * 字符串查找
     */
    public static void API05(){
        String str = "I really miss you !";
        int a = str.indexOf('a');//a = 4
        int b = str.indexOf("really");//b = 2
        int c = str.indexOf("gg",2);//c = -1
        int d = str.lastIndexOf('s');//d = 12
        int e = str.lastIndexOf('s',11);//e = 11
        //注意所有索引位置都是从前向后计算的，lastIndexOf只是方向是从后向前
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
    /**
     * 字符串替换
     */
    public static void API06(){
        String str = "asdzxcasd";
        String str1 = str.replace('a','g');//str1 = "gsdzxcgsd"
        String str2 = str.replace("asd","fgh");//str2 = "fghzxcfgh"
        String str3 = str.replaceFirst("asd","fgh");//str3 = "fghzxcasd"
        String str4 = str.replaceAll("asd","fgh");//str4 = "fghzxcfgh"
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
    /**
     * 字符串大小写转换
     */
    public static void API07(){
        String str = new String("abCD");
        String str1 = str.toLowerCase();//str1 = "abcd"
        String str2 = str.toUpperCase();//str2 = "ABCD"
        System.out.println(str1);
        System.out.println(str2);
    }
    /**
     * 字符串两端去空格
     */
    public static void API08(){
        String str = " a bc ";
        String str1 = str.trim();
        int a = str.length();//a = 6
        int b = str1.length();//b = 4
        System.out.println(a);
        System.out.println(b);
    }
}
