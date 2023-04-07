package seleniumSessions;

public class CustomXpath {

	public static void main(String[] args) {
		
		
		//htmltag[attr='value']
		//input[@id='input-email']
		
		//and--input[@id='input-email' and @name='email'
		//or--input[@id='input-email' or @name='email']
		// using *--//*[@id='input-email' or @name='email']
		//index based xpath-(//input[@class='form-control'])[2]
		// using position method=(//input[@class='form-control'])[position()=2]
		// last()--(//input[@class='form-control'])[last()]
		 //last()--((//div[@class='navFooterVerticalRow navAccessibility']//ul)[4]//a)[last()]
		//last()--((//div[@class='navFooterVerticalRow navAccessibility']//ul)[last()]//a)[last()]
		// text():-
		   // html[text()='value']
		// html[text()='value'],//label[text()='First Name'],//h1[text()='Register Account'],//a[@href and text()='login page']
		
		
		
		//contains()with attr--it will take two parameter @attribute and value
		////input[contains(@id,'firstname')]--for dynamic change value
		////contains()with attr--and attr2 with no contains
		//input[contains(@id,'firstname') and @name='firstname']
	////contains()with text()-//a[contains(text(),'Today')]amazon today deal
		
		// starts-with()
		//a[starts-with(text(),'Today')]
		
		//parent to child
		//select[@id='Form_getForm_Country']/option
		//select[@id='Form_getForm_Country']//child::option
		//select[@id='Form_getForm_Country']/*
		
		//child to parent
		//option[@value='Afghanistan']/../../../../../../../
		////option[@value='Afghanistan']/parent::select/parent::div
		//input[@id='Form_submitForm_Name']/ancestor::form[@id='Form_submitForm']
		
	}

}
