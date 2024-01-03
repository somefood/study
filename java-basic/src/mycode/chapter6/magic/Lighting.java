package mycode.chapter6.magic;

public class Lighting implements Magic {
    private final Member member;

    public Lighting(Member member) {
        this.member = member;
    }

    @Override
    public String name() {
        return "라이트닝";
    }

    @Override
    public MagicPoint costMagicPoint() {
        final int value = 5 + (int) (member.level * 0.2);
        return new MagicPoint(value);
    }

    @Override
    public AttackPower attackPower() {
        final int value = 50 + (int) (member.agility * 1.5);
        return new AttackPower(value);
    }

    @Override
    public TechnicalPoint costTechnicalPoint() {
        return new TechnicalPoint(5);
    }
}
