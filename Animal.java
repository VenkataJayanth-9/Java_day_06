public class Animal {
    private String type;
    private String height;
    private String weight;

    public Animal(String type, String height, String weight)
    {
        this.type = type;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public void move(String speed)
    {
        System.out.println(type + "moves" + speed);
    }

    public void makeNoise() {
        System.out.println(type + "makes some kind of noise");
    }
}
