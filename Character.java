package oop;

public class Character {
	
	String nickname;
	int health;
	int damage;
	boolean isDead;
	
	//void attack() {
	int attack() {
		int lucky = (int) Math.random() * 100; // 0~99 
		int attackDamage = damage;
		if (lucky > 70) {
			//attackDamage = attackDamage * 2;
			attackDamage *= 2;
		}
		System.out.println(nickname + "턴, 공격 포인트 : " + attackDamage);
		return attackDamage;
	}
	
}
