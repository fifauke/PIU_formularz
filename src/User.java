/**@authors: Agata Zatorska, Filip Wojda**/

public class User {

    private String imie;
    private String nazwisko;
    private String email;
    private String dataUrodzenia;
    private String plec;
    private String pesel;
    public User(String imie, String nazwisko, String email, String plec, String dataUrodzenia, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.plec = plec;
        this.dataUrodzenia = dataUrodzenia;
        this.pesel = pesel;
    }
    public String getImie(){

        return imie;
    }
    public String getNazwisko() {

        return nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public String getPlec() {
        return plec;
    }

    public String getPesel() {
        return pesel;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
