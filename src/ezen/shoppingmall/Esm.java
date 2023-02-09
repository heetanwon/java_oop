package ezen.shoppingmall;



public class Esm {
	public static void main(String[] args) {
		Cart myCart = new Cart(100);
		Album album = new Album(10,"Dynarmite",10000,"bts");
		
		
		//카트에 상품 담기 
		myCart.addItem(album);
		Movie movie = new Movie(11,"아바타2",15000,"제임스 카메론","김기정");
		myCart.addItem(movie);
		
		//카트 상품 목록 조회
		Item[] myItems= myCart.getItems();
		
		
		for (int i = 0; i < myCart.getCount(); i++) {
			System.out.println(myItems[i]);
		}
		
		System.out.println("-----검색 리스트-----");
		
		//카트 상품 검색
		String searchName = "Dynarmite";
		Item searchItem = myCart.findByName(searchName);
		if(searchItem != null) {
			//System.out.println(searchItem.toString());
			System.out.println(searchItem);
		Album al =(Album)searchItem;
		 System.out.println(al.getArtist());
		}else {
			System.out.println("해당 상품이 없습니다");
		}
		
		
		
		
		//상품 삭제 테스트 
	    System.out.println("----상품삭제 하나만-----");
	    boolean result = myCart.removeItem(searchName);
	    if(result) {
	    	System.out.println("정상삭제되었습니다");
	    }else{
	    	System.out.println("삭제되지 않았습니다");
	    }
	    
	    
	   
	    
	    //상품 계좌 삭제 
	   myCart.removeAll(); 
	   System.out.println(myCart.getCount());
	   
	 
	    
	   
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
	
	}
}
