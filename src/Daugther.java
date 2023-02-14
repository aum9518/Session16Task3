public class Daugther extends Mother{
    private String hairColor;
    private int heigh;

    public Daugther(String name, int age, String eyeColor) {
        super(name, age, eyeColor);
    }

    public Daugther() {
    }

    public Daugther(String name, int age, String eyeColor, String hairColor, int heigh) {
        super(name, age, eyeColor);
        this.hairColor = hairColor;
        this.heigh = heigh;
    }

    public Daugther(String hairColor, int heigh) {
        this.hairColor = hairColor;
        this.heigh = heigh;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    @Override
    public String gettName() {
        return getName() + " this is daughter ";

    }

    @Override
    public String toString() {
        return "Daugther{" +
                "hairColor='" + hairColor + '\'' +
                ", heigh=" + heigh +
                '}';
    }
}
