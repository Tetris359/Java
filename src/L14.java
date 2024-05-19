import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с IP-адресом:");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([0-9]{1,3}[\\.]){3}[0-9]{1,3}");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Найден IP-адрес: " + matcher.group());
        } else {
            System.out.println("IP-адрес не найден.");
        }
    }
}