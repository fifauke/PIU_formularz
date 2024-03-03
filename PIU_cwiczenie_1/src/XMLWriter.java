/**@authors: Agata Zatorska, Filip Wojda**/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class XMLWriter {

    public static void saveToXML(User user) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("PIU_cwiczenie_1/Resources/user_data.xml"))) {

            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            writer.write("<User>\n");

            writer.write("\t<Imie>" + user.getImie() + "</Imie>\n");
            writer.write("\t<Nazwisko>" + user.getNazwisko() + "</Nazwisko>\n");
            writer.write("\t<Email>" + user.getEmail() + "</Email>\n");
            writer.write("\t<Płeć>" + user.getPlec() + "</Płeć>\n");
            writer.write("\t<DataUrodzenia>" + user.getDataUrodzenia() + "</DataUrodzenia>\n");
            writer.write("\t<Pesel>" + user.getPesel() + "</Pesel>\n");

            writer.write("</User>");
            System.out.println("Dane użytkownika zostały zapisane do pliku user_data.xml.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}