/**@authors: Agata Zatorska, Filip Wojda**/

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class MyTextField extends JTextField implements FocusListener {
    private String type;

    public MyTextField(String type) {
        this.type = type;
        setBackground(new Color(0xC6CCD0));
        setForeground(Color.BLACK);
        setFont(new Font("Arial", Font.PLAIN, 14));
        addFocusListener(this);
    }

    @Override
    protected void paintBorder(Graphics g) {

    }

    @Override
    public void focusGained(FocusEvent e) {
        setBackground(new Color(0x707F8C));
    }

    @Override
    public void focusLost(FocusEvent e) {
        switch (type) {
            case "imie":
            case "nazwisko":
                String[] words = getText().split(" ");
                StringBuilder result = new StringBuilder();
                for (String word : words) {
                    if (!word.isEmpty()) {
                        if (CheckData.isFirstLetterSmall(word)) {
                            word = CheckData.changeToUpperLetter(word);
                        }
                        result.append(word).append(" ");
                    }
                }
                setText(result.toString().trim());
                if (getText().matches("[A-ZĆŻŹŁŚ][a-zA-Ząćęłńóżźś\\-\\s]*")) {
                    setForeground(new Color(0x000000));
                    setBackground(new Color(0x8CB458));
                } else {
                    setForeground(new Color(0x000000));
                    setBackground(new Color(0xFFDC3636, true));
                }
                break;

            case "email":
                if (getText().matches(".+@.+\\.(pl|org|net|com|eu|)")) {
                    setForeground(new Color(0x000000));
                    setBackground(new Color(0x8CB458));
                } else {
                    setForeground(new Color(0x000000));
                    setBackground(new Color(0xFFDC3636, true));
                }
                break;

            case "pesel":
                if (getText().matches("\\d{11}") && CheckData.isValidPesel(getText())) {
                    setForeground(new Color(0x000000));
                    setBackground(new Color(0x8CB458));
                } else {
                    setForeground(new Color(0x000000));
                    setBackground(new Color(0xFFDC3636, true));
                }
                break;
        }
    }

    public boolean isValidInput() {
        switch (type) {
            case "imie":
            case "nazwisko":
                return getText().matches("[A-ZĆŻŹŁŚ][a-zA-Ząćęłńóżźś\\-\\s]*");

            case "email":
                return getText().matches(".+@.+\\.(pl|org|net|com|eu|)");

            case "pesel":
                return getText().matches("\\d{11}") && CheckData.isValidPesel(getText());

            default:
                return false;
        }
    }
}