package abstractFactory;

/**
 * Author: ljf
 * CreatedAt: 2021/3/25 下午4:18
 */
public class TerroristFactory extends AbstractFactory {
    @Override
    Weapon weaponFactory() {
        return new Ak47();
    }

    @Override
    Vehicle vehicleFactory() {
        return new Mustang();
    }
}
