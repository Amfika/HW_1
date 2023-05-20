import java.util.Locale;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        /*Запросить на ввод строку, ввести произвольный текст с клавиатуры и вывести на экран результат работы
        всех рассмотренных методов работы со строками*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите произвольный текст с клавиатуры: ");
        String str = scanner.nextLine();

        System.out.print("Введите произвольное число с клавиатуры: ");
        String str2 = scanner.nextLine();

        int length = str.length();
        System.out.println(length);

        boolean empty = str.isEmpty();
        System.out.println(empty);

        char index = str.charAt(2);
        System.out.println(index);

        boolean eq = str.equals(str2);
        System.out.println(eq);

        boolean equ = str.equalsIgnoreCase(str2);
        System.out.println(equ);

        boolean start = str.startsWith("a",3);
        System.out.println(start);

        boolean star = str.startsWith("a");
        System.out.println(star);

        boolean ends = str.endsWith("a");
        System.out.println(ends);

        boolean contains = str.contains("a");
        System.out.println(contains);


        if (str.startsWith("А")){
            System.out.println(str.replace("А","Е"));
        }else {
            System.out.println(str.replace("а", "е"));
        }

        String lowerCase = str.toLowerCase(Locale.ROOT);
        System.out.println(lowerCase);

        String upperCase = str.toUpperCase(Locale.ROOT);
        System.out.println(upperCase);

        StringBuffer sb = new StringBuffer("Hi ");
        sb.append("Me");
        System.out.println(sb);

        String format = String.format("В моём детстве было %s игрушек", str2);
        System.out.println(format);
    }
}
