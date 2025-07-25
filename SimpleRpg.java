package oop;

public class SimpleRpg {

	public static void main(String[] args) {
		
		Character player = new Character();
		player.nickname = "플레이어";
		player.health = 1000;
		player.damage = 70;
		player.isDead = player.health <= 0;
		
		Character enemy = new Character();
		enemy.nickname = "적";
		enemy.health = 500;
		enemy.damage = 140;
		enemy.isDead = enemy.health <= 0;
		
		while(!player.isDead && !enemy.isDead) {
			int damage = player.attack(); // int value = consoleInput.nextInt();
			//enemy.health -= 140; attack의 결과를 알아야 함
			enemy.health -= damage;
			enemy.isDead = enemy.health <= 0;
			
			damage = enemy.attack();
			//player.health-=280;
			player.health -= damage;
			player.isDead = player.health <= 0;
			
			System.out.println(player.nickname + " : " + player.health);
			System.out.println(enemy.nickname + " : " + enemy.health);
		}
		
	
	}
}
