public class Dog
{
    private String name;
    private int age;
    private String breed;
    private double weight;
    private static int dogCount;


    //constructor
    public Dog(String name, int age, String breed, double weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;

        //Updates Dog Count
        dogCount++;
    }
    public double LBtoKilo()
    {
        //Weight Conversion
        double onePound = 0.454;
        double kilogram = weight * onePound;
        return kilogram;
    }
    //To String
    public String toString()
    {
        String output = "Name: " + name +
                "\nAge: " + age +
                "\nBreed: " + breed +
                "\nWeight: " + weight;
        return output;
    }

    //Getters
    public String getName()
    {
        return name;
    }

    public static int getDogCount() {
        return dogCount;
    }

    public int getAge()
    {
        return age;
    }

    public String getBreed()
    {
        return breed;
    }

    public double getWeight()
    {
        return weight;
    }
}

