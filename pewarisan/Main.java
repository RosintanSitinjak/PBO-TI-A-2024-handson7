package pewarisan;

public class Main{
    public static void main(String[] args) {
        Mobil mobilku = new Mobil("Toyota");
        Motor motorku = new Motor();

        mobilku.infoMobil();

        motorku.infoMotor();
    }
}