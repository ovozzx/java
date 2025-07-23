package com.ktdsuniversity.edu.cartoon;

/**
 * 만화카페 실행 클래스
 */
public class CartoonMain {
	public static void main(String[] args) {
		
		Cartoon[] playCartoonBooks = new Cartoon[3];
		playCartoonBooks[0] = new Cartoon("슬램덩크 1화", false, 500);
		playCartoonBooks[1] = new Cartoon("슬램덩크 2화", false, 600);
		playCartoonBooks[2] = new Cartoon("슬램덩크 3화", false, 1500);
		
		Cafe playCartoon = new Cafe(playCartoonBooks, 50_000);
		playCartoon.printAllCartoons();
		
		playCartoon.rent("슬램덩크 1화");
		playCartoon.rent("슬램덩크 2화");
		playCartoon.rent("슬램덩크 3화");
		
		playCartoon.returnBook("슬램덩크 1화");
		playCartoon.returnBook("슬램덩크 2화");
		playCartoon.returnBook("슬램덩크 3화");
	}
}

// 깃허브 옮기기
// 코드 보면서 일일 학습일지 정리