package pets;

import java.util.ArrayList;

public class FishTank {
    public static void main(String[] args) {
        var fish1 = new Fish(2.5, "Red");
        var fish2 = new Fish(5, "Green");

        var fishTank = new ArrayList();
        fishTank.add(fish1);
        fishTank.add(fish2);
        for (int i = 0; i < fishTank.size(); i++) {
            Fish theFish = (Fish) fishTank.get(i);
            System.out.println(String.format("Got the %s fish that weighs %4.1f kilograms.",
                    theFish.getColor(), theFish.getWeight()));
        }
    }
}
