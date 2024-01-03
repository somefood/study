package mycode.chapter6.magic;

import mycode.chapter6.MagicType;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        final Map<MagicType, Magic> magics = new HashMap<>();
        Member member = new Member(5, 5, 5, 10);
        Fire fire = new Fire(member);
        Lighting lighting = new Lighting(member);
        HellFire hellFire = new HellFire(member);

        magics.put(MagicType.fire, fire);
        magics.put(MagicType.lighting, lighting);
        magics.put(MagicType.hellFire, hellFire);
    }
}
