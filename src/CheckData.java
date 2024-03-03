/**@authors: Agata Zatorska, Filip Wojda**/

public class CheckData {


    public static boolean isValidPesel(String pesel) {
        if (pesel.length() != 11) {
            return false;
        }

        int[] weights = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
        int sum = 0;

        for (int i = 0; i < 11; i++) {
            int digit = Character.getNumericValue(pesel.charAt(i));
            sum += digit * weights[i];
        }

        return sum % 10 == 0;
    }

    public static boolean isDateValid(int dzien, int miesiac, int rok) {
        int maxDays;
        switch (miesiac) {
            case 2:
                if (rok % 4 == 0 && (rok % 100 != 0 || rok % 400 == 0)){
                    maxDays = 29;
                }else {
                    maxDays = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
        }

        if (dzien > maxDays) {
            return false;
        }else {
            return true;
        }
    }

    public static boolean isFirstLetterSmall(String text) {
        if (text != null && !text.isEmpty()) {
            char firstLetter = text.charAt(0);
            char afterHyphen = '-';
            int hyphenIndex = text.indexOf(afterHyphen);
            if (hyphenIndex != -1 && hyphenIndex + 1 < text.length()) {
                char nextChar = text.charAt(hyphenIndex + 1);
                return Character.isLowerCase(nextChar);
            }
            return Character.isLowerCase(firstLetter);
        }
        return false;
    }

    public static String changeToUpperLetter(String text) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            } else if (c == '-') {
                capitalizeNext = true;
                result.append(c);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
