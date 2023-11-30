import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author danielsotoortiz
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        Pattern p = Pattern.compile("[0-9]{4}[a-zA-Z]{3}");
        Matcher m = p.matcher(tec.nextLine());
        if (m.matches()) {
            System.out.println("Matrícula válida");
        } else {
            System.out.println("Matrícula no válida");
        }
    }

}
