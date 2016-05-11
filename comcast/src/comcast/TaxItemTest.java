package comcast;

import static org.junit.Assert.*;

import org.junit.Test;

import comcast.TaxItem.LuxuryItem;
import comcast.TaxItem.NecessaryItem;

public class TaxItemTest {

	@Test
	public void LuxuryItemTaxTest() {
		
		TaxItem taxPerson = new TaxItem(); 
		LuxuryItem item = taxPerson.new LuxuryItem(100);

		assertEquals(item.calculateTax(), 109);
		
		item = taxPerson.new LuxuryItem(0);

		assertEquals(item.calculateTax(), 0);

	}
	
	@Test
	public void NecessaryItemTaxTest() {
		
		TaxItem taxPerson = new TaxItem(); 
		NecessaryItem item = taxPerson.new NecessaryItem(100);

		assertEquals(item.calculateTax(), 101);
		
		item = taxPerson.new NecessaryItem(0);

		assertEquals(item.calculateTax(), 0);

	}


}
