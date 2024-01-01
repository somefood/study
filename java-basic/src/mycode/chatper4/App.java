package mycode.chatper4;

public class App {

    public static void main(String[] args) {
        final AttackPower attackPower = new AttackPower(20);

        final AttackPower reinforced = attackPower.reinforce(new AttackPower(15));
        System.out.println("attack power : " + reinforced.value);

        final AttackPower attackPowerA = new AttackPower(20);
        final AttackPower attackPowerB = new AttackPower(20);

        final Weapon weaponA = new Weapon(attackPowerA);
        final Weapon weaponB = new Weapon(attackPowerB);

        final AttackPower increment = new AttackPower(5);
        final Weapon reinforcedWeaponA = weaponA.reinforce(increment);

        System.out.println("Weapon A attack power : " + weaponA.attackPower.value);
        System.out.println("Reinforced weapon A attack power : " + reinforcedWeaponA.attackPower.value);
        System.out.println("Weapon B attack power : " + weaponB.attackPower.value);
    }
}
