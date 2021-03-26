package builder;

/**
 * Author: ljf
 * CreatedAt: 2021/3/26 下午3:12
 */
public class Person {

    int id;
    String name;
    int age;
    double weight;
    double height;
    Location loc;

    private Person() {
    }

    public static class PersonBuilder {
        Person p = new Person();

        public PersonBuilder buildBaseInfo(int id, String name) {
            p.id = id;
            p.name = name;
            return this;
        }

        public PersonBuilder buildBaseInfo1(int age) {
            p.age = age;
            return this;
        }

        public PersonBuilder buildBaseInfo2(double weight, double height) {
            p.weight = weight;
            p.height = height;
            return this;
        }

        public PersonBuilder buildLocation(String street, String roomNum) {
            p.loc = new Location(street, roomNum);
            return this;
        }

        public Person build() {
            return p;
        }
    }
}

class Location {
    String street;
    String roomNum;

    public Location(String street, String roomNum) {
        this.street = street;
        this.roomNum = roomNum;
    }
}
