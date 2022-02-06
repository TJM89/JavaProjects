package multiLevelInheritence;

public class Main {

	public static void main(String[] args) {
		Chicken chicken = new Chicken();
		chicken.ChickenType();
		ChickenPieces chickenPieces = new ChickenPieces();
		chickenPieces.ChickenPiecescut(10);
		ChickenCurry chickenCurry = new ChickenCurry();
		chickenCurry.ChickenCurryMade("");

	}

}
