public class Main {
    public static void main(String[] args) {
        Mother mother = new Mother("Nazgul",35,"Black");
        Mother mother2 = new Mother("Jazgul",30,"Gray");

        Mother daughter = new Daugther("Asiya",15,"black","Yellow",130);
        Daugther daughter1 = new Daugther("Aisha",16,"black","Black",143);

        Mother[] daugthers = {daughter,daughter1,mother,mother2};
        for (Mother a:daugthers) {
            System.out.println(a.gettName());

        }
    }
}