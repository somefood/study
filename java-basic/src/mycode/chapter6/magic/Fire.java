package mycode.chapter6.magic;

public class Fire implements Magic {

    private final Member member;

    Fire(final Member member) {
        this.member = member;
    }

    @Override
    public String name() {
        return "파이어";
    }

    @Override
    public MagicPoint costMagicPoint() {
        return new MagicPoint(2);
    }

    @Override
    public AttackPower attackPower() {
        final int value = 20 + (int) (member.level * 0.5);
        return new AttackPower(value);
    }

    @Override
    public TechnicalPoint costTechnicalPoint() {
        return new TechnicalPoint(0);
    }
}
