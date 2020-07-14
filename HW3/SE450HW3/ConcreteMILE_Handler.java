package SE450HW3;

// Ximan Liu

public class ConcreteMILE_Handler extends Handler {
	
	public void HandleRequest(String request)
	{
		if (request.equals("Mile")) 
		{
			System.out.println(this.getClass().getName() + "  " + request);
		}
		else if (successor != null)
		{   
			successor.HandleRequest(request);
		}
	}
}

