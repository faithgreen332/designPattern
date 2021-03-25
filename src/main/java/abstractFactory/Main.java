package abstractFactory;

/**
 * Author: ljf
 * CreatedAt: 2021/3/25 下午4:22
 */
public class Main {
    public static void main(String[] args) {
        TerroristFactory terroristFactory = new TerroristFactory();
        terroristFactory.vehicleFactory().runrun();
        terroristFactory.weaponFactory().shoot();

        Counter_TerroristFactory counter_terroristFactory = new Counter_TerroristFactory();
        counter_terroristFactory.vehicleFactory().runrun();
        counter_terroristFactory.weaponFactory().shoot();
    }
}
