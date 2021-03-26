package builder;

/**
 * Author: ljf
 * CreatedAt: 2021/3/26 下午3:01
 */
public class ComplexCarBuilder implements CarBuilder {

    Car car = new Car();

    @Override
    public ComplexCarBuilder buildEngine() {
        car.engine = new Engine(299, 4, 14);
        return this;
    }

    @Override
    public CarBuilder buildGearShift() {
        car.gearShift = new GearShift(10, 10, "gearShift");
        return this;
    }

    @Override
    public CarBuilder buildBed() {
        car.bed = new Bed(10, 29, 49);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
