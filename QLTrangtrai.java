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

    @Override
    boolean dibo() {
        return true;
    }
}

class Vit extends Dongvat {
    Vit(String ten) {
        super(ten);
    }

    boolean boi() {
        return true;
    }
    
    boolean dibo() {
        return true;
    }
}

class Ca extends Dongvat {
    Ca(String ten) {
        super(ten);
    }

    @Override
    boolean boi() {
        return true;
    }

    boolean dibo() {
        return false;
    }
}

public class QLTrangtrai {
    public static void main(String[] args) {
        List<Dongvat> dongvat = new ArrayList<>();
        dongvat.add(new Lon("Piggy"));
        dongvat.add(new Vit("Ducky"));
        dongvat.add(new Ca("Goldie"));

        printAnimalsThatCanSwimOrWalk(dongvat);
    }

    public static void printAnimalsThatCanSwimOrWalk(List<Dongvat> dongvat) {
        System.out.println("Animals that can swim or walk:");
        for (Dongvat dongvat : dongvat) {
            if (dongvat.boi() || dongvat.dibo()) {
                System.out.println(dongvat.ten);
            }
        }
    }
}
