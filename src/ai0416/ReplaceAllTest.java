package ai0416;

public class ReplaceAllTest
{
    public static void main(String[] args)
    {
        String s = new String("강      민     재");
        String s2 = s.replaceAll(" ","");

        System.out.println(s);
        System.out.println(s2);

        s = "인공지능소프트웨어과 1학년";
        System.out.println("\"지능\"의 인덱스 번호" + s.indexOf("지능"));
        System.out.println("\'지능\'의 인덱스 번호" + s.indexOf("웨"));

        s = "한국에는 한국 폴리텍대학이 한국 전체에 많은 곳에 캠퍼스가 위치해 있습니다.";
        System.out.println("s1의 4번 위치부터 한국 이라는 문자열을 찾아서 인덱스 번호:" + s.indexOf("한국", 4));

        s = "서울정수";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(4));
    }
}
