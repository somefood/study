package mycode.chatper4;

public class AttackPower {
    static final int MIN = 0;
    final int value;

    AttackPower(int value) {
        if (value < MIN) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    /**
     * 공격력 강화하기
     * @param increment 공격력 증가량
     */
    AttackPower reinforce(AttackPower increment) {
        return new AttackPower(this.value + increment.value);
    }

    /** 무력화하기 */
    AttackPower disable() {
        return new AttackPower(MIN);
    }
}
