package com.ktdsuniversity.edu.simplerpg;

public class Character {
	private String nickname; // 외부에서 접근 불가
	private int health;
	private int damage;
	private boolean isDead;
	
	//void attack() {
	/*
	int attack() {
		int lucky = (int) Math.random() * 100; // 0~99 
		int attackDamage = damage;
		if (lucky > 70) {
			//attackDamage = attackDamage * 2;
			attackDamage *= 2;
		}
		System.out.println(nickname + "턴, 공격 포인트 : " + attackDamage);
		return attackDamage;
	}*/
	
	// 생성자
	public Character(String nickname, int health, int damage){
		this.nickname = nickname;
		this.health = health;
		this.damage = damage;
		this.isDead = this.health <= 0;
	}
	
	
	public String getNickname() {
		return this.nickname;
	}
	
	public boolean getIsDead() {
		return this.isDead;
	}
	
	void attackTo(Character other) { // 파라미터는 값 반드시 전달 필요
		// this : 메소드를 실행한 대상
		int lucky = (int) Math.random() * 100; // 0~99 
		int attackDamage = this.damage;
		if (lucky > 70) {
			//attackDamage = attackDamage * 2;
			attackDamage *= 2;
		}
		System.out.println(nickname + "턴, 공격 포인트 : " + attackDamage);
		
		other.hitDamage(attackDamage);
	}
	
	
	void hitDamage(int damage) { // 31번에서 other가 hitDamage를 호출하므로 hitDamage의 this는 other가 됨
		// .을 누가 썼는지 보면됨 -> . 앞에 있는 얘가 사용한 것이고 걔가 this
		this.health -= damage;
		if (this.health <= 0) {
			this.isDead = true;
		}
		System.out.println(this.nickname + " : " + this.health);
	}
	
	public void printSatus() {
		System.out.println(this.nickname);
		System.out.println(this.health);
		System.out.println(this.damage);
		System.out.println(this.isDead);
	}
	
	// setter : public void로 시작
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}
