package builder;

/**
 * Author: ljf
 * CreatedAt: 2021/3/26 下午3:10
 */
public class Main {

    public static void main(String[] args) {
        CarBuilder carBuilder = new ComplexCarBuilder();
        Car car = carBuilder.buildEngine().buildGearShift().buildBed().build();

        Person person = new Person.PersonBuilder()
                .buildBaseInfo(23425, "agua")
                .buildBaseInfo1(23)
                .buildBaseInfo2(345.6, 345.6)
                .buildLocation("北京路", "235")
                .build();
    }
}
