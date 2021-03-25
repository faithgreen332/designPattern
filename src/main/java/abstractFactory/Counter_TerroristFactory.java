package abstractFactory;

/**
 * Author: ljf
 * CreatedAt: 2021/3/25 下午4:21
 */
public class Counter_TerroristFactory extends AbstractFactory {
    @Override
    Weapon weaponFactory() {
        return new Ma41();
    }

    @Override
    Vehicle vehicleFactory() {
        return new Poresche();
    }
}
