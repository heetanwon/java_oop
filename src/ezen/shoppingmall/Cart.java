package ezen.shoppingmall;

/**
 * 쇼핑몰에서 취급하는 모든 상품들을 담고,제거하고, 검색하고 등의 기능 제공
 * @author 김희원
 * @date  2023. 1. 5.
 */
public class Cart {
	//필드의 다형성
	private Item[] items;
	private int count;
	
	public Cart() {}
	
	public Cart(int capacity) {
		/*this.Capacity = Capacity;*/
		items = new Item[capacity];
	}
	
	//카트에 담긴 전체 상품 목록 반환
	public Item[] getItems() {
		return items;
	}


	public int getCount() {
		return count;
	}
	
	//카트에 상품 담기
	//매개변수의 다양성 
	
	
	public void addItem(Item item) {
		items[count++]=item;
		
	}
	
	//상품 이름으로 상품 검색 
	public Item findByName(String name) { 
		for (int i = 0; i < count; i++) {
		  Item item= items[i];
		  boolean exist = item.getName().equals(name);
		  if(exist) {
			  return item;
		  }
		  //if(items[i].getName().equals(name)){return items[i]; }
		  //현업에 나가면 이렇게 씀
		}
		return null;
	
	}
	
	
	
	//카트에서 상품 제거하기
	
	public boolean removeItem(String name) {
		for (int i = 0; i < count; i++) {
			String ab = items[i].getName();
			if(ab.equals(name) ) {
				for (int j = i; j < count-1; j++) {
					items[j] = items[j+1];
				}
				count --;
				return true;
			}
			
		}
		
		 		return false;
	}
	
	//카트에서 모든 상품 제거하기
	
		public void removeAll() {
		 for (int i = 0; i < count; i++) {
			items[i] = null;
		
		 /*items =  new Item[capacity];
		 count = 0;*/
			
		}
			 
				  
			   
			
				
			}
			
		
}
			
		







	


	
	

