package package1;

public class Bmi {

    int id;
    String name;
    String yob;
    int height;
    int weight;

    public Bmi(int id, String name, String yob, int height, int weight) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.height = height;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYob() {
        return yob;
    }

    public void setYob(String yob) {
        this.yob = yob;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void calculate() {
    }

    public void display() {

        System.out.print("User Id :");
        System.out.print(this.id);
        System.out.print(" , User Name :");
        System.out.print(this.name);
        System.out.print(" , User Year Of Birth :");
        System.out.print(this.yob);
        System.out.print(" , User Height :");
        System.out.print(this.height);
        System.out.print(" , User weight :");
        System.out.println(this.weight);

//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println();
    }

}
