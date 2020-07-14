package SE450HW2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Client {
	
	private AbstractTextBox AbstractTextBox;
	private AbstractButton AbstractButton;
	private AbstractPanel AbstractPanel;
	
	public Client(AbstractFactoryMicroOfficeCompany factory) {
		
		AbstractTextBox = factory.CreateTextBox();
		AbstractButton = factory.CreateButton();
		AbstractPanel = factory.CreatePanel();	
	}
	
	public void Run() {
		
		AbstractButton.DisplayName(AbstractButton);
		AbstractTextBox.DisplayName(AbstractTextBox);
		AbstractPanel.DisplayName(AbstractPanel);	
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("/Users/liuximan/Desktop/Eclipse/csc403/src/se450hw1/test.txt");
		
		BufferedReader br = new BufferedReader (new FileReader(file));
		
		String st;
		
		while ((st = br.readLine()) != null) {
			System.out.println(st);
			
			if (st.contentEquals("Word00")) {
		
				AbstractFactoryMicroOfficeCompany FactoryWord00 = ConcreteWord00.getInstance();
				
				if (FactoryWord00 != null) {
					Client c1 = new Client (FactoryWord00);
					c1.Run();
				}
				
				else if (st.contentEquals("Word10")) {
					
					AbstractFactoryMicroOfficeCompany FactoryWord10 = ConcreteWord10.getInstance();
					
					if (FactoryWord10 != null) {
						Client c2 = new Client (FactoryWord10);
						c2.Run();	
					}
				}
				
				else if (st.contentEquals("Word18")) {
					
					AbstractFactoryMicroOfficeCompany FactoryWord18 = ConcreteWord18.getInstance();
					
					if (FactoryWord18 != null) {
						Client c3 = new Client (FactoryWord18);
						c3.Run();	
					}
				
				else if (st.contentEquals("Word90")) {
						
					AbstractFactoryMicroOfficeCompany FactoryWord90 = ConcreteWord90.getInstance();
						
					if (FactoryWord90 != null) {	
						Client c4 = new Client (FactoryWord90);
						c4.Run();	
					}
					
				else {
					System.out.println("This line contains invalid text");
				}
				}
				}	
			}
		}
	}
}

