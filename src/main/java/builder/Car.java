package builder;


/**
 * Author: ljf
 * CreatedAt: 2021/3/26 下午2:56
 */
public class Car {

    Engine engine;
    GearShift gearShift;
    Bed bed;
}
class Engine {
    int housePower;
    int gangCount;
    int youHao;

    public Engine(int housePower, int gangCount, int youHao) {
        this.housePower = housePower;
        this.gangCount = gangCount;
        this.youHao = youHao;
    }
}

class GearShift {
    int x;
    int y;
    String desc;

    public GearShift(int x, int y, String desc) {
        this.x = x;
        this.y = y;
        this.desc = desc;
    }
}

class Bed {
    int m;
    int y;
    int cls;

    public Bed(int m, int y, int cls) {
        this.m = m;
        this.y = y;
        this.cls = cls;
    }
}
