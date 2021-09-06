import java.util.regex.Pattern;

public class Regex4 {

    void checkIp(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d) (\\.)){3} " +
                "(25[0-5] |2[0-4]\\d |[01]?\\d?\\d)";

        System.out.println("IP is OKay? :" + Pattern.matches(regex,ip));
    }
    public static void main(String[] args) {

        //0-255.0-255.0-255.0-255
        Regex4 regex4 = new Regex4();
        String ip1 = "192.168.0.1";
        String ip2 = "192.200.0.1";
        regex4.checkIp(ip1);
        regex4.checkIp(ip2);

    }
}
