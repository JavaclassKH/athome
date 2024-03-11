package homework_0308;

public class BunsikService {
	BunsikRun bunsikrun = new BunsikRun();
	WoojuBunsik priceWooju = new WoojuBunsik();
	WangjaBunsik priceWangja = new WangjaBunsik();
	SeoulBunsik priceSeoul = new SeoulBunsik();
	
	public void seoul() {
		System.out.println("===================================");
		System.out.println(" 김치찌개의 가격 : " + priceSeoul.getKimchiStew());
		System.out.println(" 부대찌개의 가격 : " + priceSeoul.getBudaeStew());
		System.out.println(" 비빔밥의 가격 : " + priceSeoul.getBibimBab());
		System.out.println(" 순대국의 가격 : " + priceSeoul.getSundaeStew());
		System.out.println(" 공깃밥의 가격 : " + priceSeoul.getRice());
		System.out.println("===================================");
	}
	
	public void wangja() {
		System.out.println("===================================");
		System.out.println(" 김치찌개의 가격 : " + priceWangja.getKimchiStew());
		System.out.println(" 부대찌개의 가격 : " + priceWangja.getBudaeStew());
		System.out.println(" 비빔밥의 가격 : " + priceWangja.getBibimBab());
		System.out.println(" 순대국의 가격 : " + priceWangja.getSundaeStew());
		System.out.println(" 공깃밥의 가격 : " + priceWangja.getRice());
		System.out.println("===================================");
	}
	
	public void Wooju() {
		System.out.println("===================================");
		System.out.println(" 김치찌개의 가격 : " + priceWooju.getKimchiStew());
		System.out.println(" 부대찌개의 가격 : " + priceWooju.getBudaeStew());
		System.out.println(" 비빔밥의 가격 : " + priceWooju.getBibimBab());
		System.out.println(" 순대국의 가격 : " + priceWooju.getSundaeStew());
		System.out.println(" 공깃밥의 가격 : " + priceWooju.getRice());
		System.out.println("===================================");
	}
	
}
