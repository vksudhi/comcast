package comcast;

public class TaxItem {

	
	public abstract class Item {
		
		private int price;

		Item(int price) {
			this.price = price;
		}
		
		public double taxRate() {
			return 0;
		}
		
		public int calculateTax() {
			return (int) (price * (1 + this.taxRate()));
		}
	}
	
	public class LuxuryItem extends Item {
		LuxuryItem(int price) {
			super(price);
		}

		public double taxRate() {
			return 0.09;
		}
	}
	
	public class NecessaryItem extends Item {
		NecessaryItem(int price) {
			super(price);
		}

		public double taxRate() {
			return 0.01;
		}
	}

	public static void main(String[] args) {
		
		TaxItem taxPerson = new TaxItem(); 
		LuxuryItem item = taxPerson.new LuxuryItem(100);

		System.out.println(item.calculateTax());
				
	}
	
}

