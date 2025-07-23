package com.ktdsuniversity.edu.cartoon;

/**
 * 만화카페
 * */
public class Cafe {

	private Cartoon[] books;
	private int safe;
	
	public Cafe(Cartoon[] books, int safe) { // 배열 매개변수 올바르지 않음
		this.books = books;
		this.safe = safe;
	}
	
	public void printAllCartoons() {
		for (int i = 0 ; i <this.books.length ; i++) {
			this.books[i].printInformantion();
		}
		System.out.println(this.safe + " 원");
	}
	
	public void rent(String cartoonName) {
		for(int i = 0 ; i < this.books.length ; i++) {
			
			String eachBookName = this.books[i].getName(); // getter를 이용해서 우회해서 가져옴
			
			if(eachBookName.equals(cartoonName) && !this.books[i].isRental) {
				this.safe += this.books[i].rentalFee;
				this.books[i].isRental = true;
			}
		}
	}
	// 내일 이어서 진행
	public void returnBook(String cartoonName) {
		
	}
}
