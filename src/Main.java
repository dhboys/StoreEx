import java.util.Scanner;

import org.store.domain.Store;
import org.store.service.StoreService;
import org.store.ui.StoreUI;

public class Main {

	public static void main(String[] args) {
		
	
		Store[] arr = {
				new Store("멘야시노기", 37.503888, 127.020795) ,
				new Store("다시 사랑한다면", 37.4999646, 127.0440272),
				new Store("사이공리", 37.50708072, 126.939729),
				new Store("창신동 매운족발", 37.612990, 127.064718),
				new Store("홍보성", 37.484009, 127.125127),
				new Store("스시야", 37.36327968, 127.106347),
				new Store("불불이족발", 37.456393, 126.899672),
				new Store("영동족발", 37.48477547, 127.0379592)
		};
		
		StoreService service = new StoreService(arr);
		StoreUI ui = new StoreUI(new Scanner(System.in), service);
		
		ui.find();
		
 	}
}
