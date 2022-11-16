public class Main
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog("Fang ", 5, "Husky", 80.0);
        Dog dog2 = new Dog("Piper", 3, "Australian Shepherd", 45.0);
        Dog dog3 = new Dog("Agam", 16, "German Shepherd", 55.0);

        System.out.println(" ");
        System.out.println("Number of dogs: " + dog1.getDogCount());
        System.out.println(" ");

        System.out.println("Fang's Breed: " + dog1.getBreed());
        System.out.println("Fang's Age: " + dog1.getAge());
        System.out.println(" ");

        System.out.println("Piper's Weight: " + dog2.getWeight());
        System.out.println(" ");

        System.out.println(dog3.toString());
        System.out.println(" ");

        System.out.println("Fang: Pounds to Kilograms: " + dog1.LBtoKilo());
        System.out.println("Piper: Pounds to Kilograms: " + dog2.LBtoKilo());
        System.out.println("Agam: Pounds to Kilograms: " + dog3.LBtoKilo());



    }

}
