package com.ktdsuniversity.edu.simplerpg;

public class SimpleRpg {

	public static void main(String[] args) {
		
		Character player = new Character("플레이어", 1000, 70);
		//player.nickname = "플레이어";
		//player.health = 1000;
		//player.damage = 70;
		//player.isDead = player.health <= 0;
		
		Character enemy = new Character("적", 500, 140);
		//enemy.nickname = "적";
		//enemy.health = 500;
		//enemy.damage = 140;
		//enemy.isDead = enemy.health <= 0;
		
		while(!player.isDead && !enemy.isDead) { // enemy가 other고 other가 this, this.
			player.attackTo(enemy); // 디버깅 시 F5로 들어가면, this = player, other = enemy (id로 구분)
			// int value = consoleInput.nextInt();
			//enemy.health -= 140; attack의 결과를 알아야 함
			//enemy.health -= damage;
			//enemy.isDead = enemy.health <= 0;
			//enemy.hitDamage(playersDamage); // 위 코드 대체 (파라미터를 이용한 개선)
			
			enemy.attackTo(player);
			//player.health-=280;
			//player.health -= damage;
			//player.isDead = player.health <= 0;
			//player.hitDamage(enemysDamage); // 위 코드 대체 (파라미터를 이용한 개선)

			
			//System.out.println(player.nickname + " : " + player.health);
			//System.out.println(enemy.nickname + " : " + enemy.health);
		}
		
	
	}
}
