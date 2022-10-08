package OnlineBankaSistemi;

public class kullanıcı {
    private int tc;
    private String pass;
    private int money;
    private int kredi;
    private int ekstre;

    public kullanıcı(int tc, String pass, int money, int kredi, int ekstre) {
        this.tc = tc;
        this.pass = pass;
        this.money = money;
        this.kredi = kredi;
        this.ekstre = ekstre;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getKredi() {
        return kredi;
    }

    public void setKredi(int kredi) {
        this.kredi = kredi;
    }

    public int getEkstre() {
        return ekstre;
    }

    public void setEkstre(int ekstre) {
        this.ekstre = ekstre;
    }


}
