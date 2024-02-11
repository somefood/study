package mycode.chapter6.magic;

import mycode.chapter6.MagicType;

import java.util.HashMap;
import java.util.Map;

public class Member {

    public final int level;
    public final int agility;
    public final int magicAttack;
    public final int vitality;

    public final Map<MagicType, Magic> magics = new HashMap<>();

    public Member(int level, int agility, int magicAttack, int vitality) {
        this.level = level;
        this.agility = agility;
        this.magicAttack = magicAttack;
        this.vitality = vitality;
    }

    public void setMagics(Map<MagicType, Magic> memberMagics) {
        magics.putAll(memberMagics);
    }

    void magicAttack(final MagicType magicType) {
        final Magic usingMagic = magics.get(magicType);

        showMagicName(usingMagic);
        consumeMagicPoint(usingMagic);
        consumeTechnicalPoint(usingMagic);
        magicDamage(usingMagic);
    }

    void showMagicName(final Magic magic) {
        final String name = magic.name();
    }

    void consumeMagicPoint(final Magic magic) {
        final int costMagicPoint = magic.costMagicPoint().point;
    }

    void consumeTechnicalPoint(final Magic magic) {
        final int costTechnicalPoint = magic.costTechnicalPoint().value;
    }

    void magicDamage(final Magic magic) {
        final int attackPower = magic.attackPower().value;
    }
}
