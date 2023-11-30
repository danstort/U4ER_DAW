
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Pattern p = Pattern.compile("[a-zA-Z]{2}[0-9]{20}");
        Matcher m = p.matcher(tec.nextLine());
        if (m.matches()) {
            System.out.println("CC válida");
        } else {
            System.out.println("CC no válida");
        }
    }

}
