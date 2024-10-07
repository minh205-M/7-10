import java.util.ArrayList;
import java.util.List;

abstract class Dongvat {
    String ten;

    Dongvat(String ten) {
        this.ten = ten;
    }

    abstract boolean boi();
    abstract boolean dibo();
}

class Lon extends Dongvat {
    Lon(String ten) {
        super(ten);
    }

    boolean boi() {
        return false;
    }

    boolean dibo() {
        return true;
    }
}

class Vit extends Dongvat {
    Vit(String ten) {
        super(ten);
    }

    @Override
    boolean boi() {
        return true;
    }

    @Override
    boolean dibo() {
        return true;
    }
}

class Ca extends Dongvat {
    Ca(String ten) {
        super(ten);
    }

    boolean boi() {
        return true;
    }

    boolean dibo() {
        return false;
    }
}

public class QLTrangtrai {
    public static void main(String[] args) {
        List<Dongvat> animals = new ArrayList<>();
        animals.add(new Lon("Piggy"));
        animals.add(new Vit("Ducky"));
        animals.add(new Ca("Goldie"));

        printAnimalsThatCanSwimOrWalk(animals);
    }

    public static void printAnimalsThatCanSwimOrWalk(List<Dongvat> animals) {
        System.out.println("Animals that can swim or walk:");
        for (Dongvat animal : animals) {
            if (animal.boi() || animal.dibo()) {
                System.out.println(animal.ten);
            }
        }
    }
}
