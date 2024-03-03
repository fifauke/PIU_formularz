/**@authors: Agata Zatorska, Filip Wojda**/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    public MyTextField imieText;
    public MyTextField nazwiskoText;
    public MyTextField emailText;
    public JComboBox<String> plecComboBox;
    public String plci[] = { "Kobieta", "Mężczyzna", "Wolę nie podawać"};

    public JComboBox<String> dzienComboBox;
    public String dni[] = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    public JComboBox<String> miesiacComboBox;
    public String miesiace[] = { "Styczeń", "Luty", "Marzec", "Kwiecień", "Maj",
            "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik",
            "Listopad", "Grudzień"};
    public JComboBox<String> rokComboBox;
    public String lata[] = {"1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942",
            "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952",
            "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962",
            "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972",
            "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982",
            "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992",
            "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012",
            "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022",
            "2023"};
    public MyTextField peselText;
    public JCheckBox warunkiCheckBox;
    public JLabel instrukcja;
    public JLabel imie;
    public JLabel nazwisko;
    public JLabel email;
    public JLabel plec;
    public JLabel data;
    public JLabel pesel;
    public JButton zatwierdz;
    public JButton reset;

    //constructor
    public MyFrame() {
        setTitle("Kwestionariusz");
        setBounds(0, 0, 500, 530);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(0x96A9BE));


        instrukcja = new JLabel("Wprowadź swoje dane, a nastęnie naciśnij przycisk \"Zatwierdź\".");
        instrukcja.setBounds(60, 10, 400, 20);
        getContentPane().add(instrukcja);

        imie = new JLabel("Imię :");
        getContentPane().add(imie);

        imieText = new MyTextField("imie");
        getContentPane().add(imieText);

        nazwisko = new JLabel("Nazwisko :");
        getContentPane().add(nazwisko);

        nazwiskoText = new MyTextField("nazwisko");
        getContentPane().add(nazwiskoText);

        email = new JLabel("Email :");
        getContentPane().add(email);

        emailText = new MyTextField("email");
        getContentPane().add(emailText);

        plec = new JLabel("Płeć :");
        getContentPane().add(plec);

        plecComboBox = new JComboBox<>(plci);
        getContentPane().add(plecComboBox);

        data = new JLabel("Data Urodzenia :");
        getContentPane().add(data);

        dzienComboBox = new JComboBox<>(dni);
        getContentPane().add(dzienComboBox);

        miesiacComboBox = new JComboBox<>(miesiace);
        getContentPane().add(miesiacComboBox);

        rokComboBox = new JComboBox<>(lata);
        getContentPane().add(rokComboBox);

        pesel = new JLabel("PESEL :");
        getContentPane().add(pesel);

        peselText = new MyTextField("pesel");
        getContentPane().add(peselText);

        warunkiCheckBox = new JCheckBox("Zaakceptuj zasady i warunki");
        getContentPane().add(warunkiCheckBox);

        zatwierdz = new JButton("Zatwierdź");
        getContentPane().add(zatwierdz);
        zatwierdz.addActionListener(this);

        reset = new JButton("Resetuj");
        getContentPane().add(reset);
        reset.addActionListener(this);


        imie.setBounds(75, 40, 80, 20);
        imieText.setBounds(75, 70, 150, 20);
        nazwisko.setBounds(275, 40, 80, 20);
        nazwiskoText.setBounds(275, 70, 150, 20);
        email.setBounds(75, 100, 80, 20);
        emailText.setBounds(75, 130, 350, 20);
        plec.setBounds(75, 160, 80, 20);
        plecComboBox.setBounds(75, 190, 150, 20);
        data.setBounds(75, 220, 160, 20);
        dzienComboBox.setBounds(75, 250, 50, 20);
        miesiacComboBox.setBounds(150, 250, 125, 20);
        rokComboBox.setBounds(300, 250, 125, 20);
        pesel.setBounds(75, 280, 80, 20);
        peselText.setBounds(75, 310, 350, 20);
        warunkiCheckBox.setBounds(75, 380, 350, 20);
        warunkiCheckBox.setBackground(new Color(0x96A9BE));
        zatwierdz.setBounds(100, 420, 150, 30);
        reset.setBounds(250, 420, 150, 30);
        setVisible(true);
    }



    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == reset) {
            String imie = imieText.getText();
            String nazwisko = nazwiskoText.getText();
            String email = emailText.getText();
            String plec = (String) plecComboBox.getSelectedItem();
            int dzienUrodzenia = (int) dzienComboBox.getSelectedIndex() + 1;
            int miesiacUrodzenia = (int) miesiacComboBox.getSelectedIndex() + 1;
            int rokUrodzenia = (int) rokComboBox.getSelectedIndex() + 1933;
            String dataUrodzenia = (String)(dzienUrodzenia + "/" + miesiacUrodzenia + "/" + rokUrodzenia);
            String pesel = peselText.getText();

            imieText.setText("");
            imieText.setBackground(new Color(0xC6CCD0));
            nazwiskoText.setText("");
            nazwiskoText.setBackground(new Color(0xC6CCD0));
            emailText.setText("");
            emailText.setBackground(new Color(0xC6CCD0));
            peselText.setText("");
            peselText.setBackground(new Color(0xC6CCD0));
            dzienComboBox.setSelectedIndex(0);
            miesiacComboBox.setSelectedIndex(0);
            rokComboBox.setSelectedIndex(0);
            plecComboBox.setSelectedIndex(0);
            warunkiCheckBox.setSelected(false);
        }
        if (e.getSource() == zatwierdz) {
            String imie = imieText.getText();
            String nazwisko = nazwiskoText.getText();
            String email = emailText.getText();
            String plec = (String) plecComboBox.getSelectedItem();
            int dzienUrodzenia = (int) dzienComboBox.getSelectedIndex() + 1;
            int miesiacUrodzenia = (int) miesiacComboBox.getSelectedIndex() + 1;
            int rokUrodzenia = (int) rokComboBox.getSelectedIndex() + 1933;
            String dataUrodzenia = (String)(dzienUrodzenia + "/" + miesiacUrodzenia + "/" + rokUrodzenia);
            String pesel = peselText.getText();

            boolean warunek = warunkiCheckBox.isSelected();
            if(!CheckData.isDateValid(dzienUrodzenia, miesiacUrodzenia, rokUrodzenia)) {

                JOptionPane.showMessageDialog(this, "Wprowadzona data nie istnieje!", "Błąd", JOptionPane.ERROR_MESSAGE);
            }
            else if (!imieText.isValidInput() || !nazwiskoText.isValidInput() || !emailText.isValidInput() || !peselText.isValidInput()) {
                JOptionPane.showMessageDialog(this, "Wprowadzone dane są nieprawidłowe!", "Błąd", JOptionPane.ERROR_MESSAGE);
            }
            else if (!warunek) {
                JOptionPane.showMessageDialog(this, "Musisz zaakceptować warunki!", "Błąd", JOptionPane.ERROR_MESSAGE);
            } else {
                User user1 = new User(imie, nazwisko, email, plec, dataUrodzenia, pesel);
                XMLWriter.saveToXML(user1);

                ImageIcon icon = new ImageIcon("Resources/img.png");
                int width = 40;
                int height = 40;
                Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
                ImageIcon resizedIcon = new ImageIcon(img);
                JOptionPane.showMessageDialog(this,"Prawidłowa rejestracja!","Sukces", JOptionPane.PLAIN_MESSAGE, resizedIcon);
            }
        }
    }
}