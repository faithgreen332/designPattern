package builder;

/**
 * Author: ljf
 * CreatedAt: 2021/3/26 下午2:53
 */
public interface CarBuilder {

    CarBuilder buildEngine();

    CarBuilder buildGearShift();

    CarBuilder buildBed();

    Car build();
}
