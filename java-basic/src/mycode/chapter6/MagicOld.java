package mycode.chapter6;

import mycode.chapter6.magic.Member;

public class MagicOld {
    final String name;
    final int costMagicPoint;
    final int attackPower;
    final int costTechnicalPoint;

    MagicOld(final MagicType magicType, final Member member) {
        switch (magicType) {
            case fire:
                name = "파이어";
                costMagicPoint = 2;
                attackPower = 20 + (int) (member.level * 0.5);
                costTechnicalPoint = 0;
                break;
            case lighting:
                name = "라이트닝";
                costMagicPoint = 5 + (int) (member.level * 0.2);
                attackPower = 50 + (int) (member.agility * 1.5);
                costTechnicalPoint = 5;
                break;
            case hellFire:
                name = "헬파이어";
                costMagicPoint = 16;
                attackPower = 200 + (int) (member.magicAttack * 0.5 + member.vitality * 2);
                costTechnicalPoint = 20 + (int) (member.level * 0.4);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
