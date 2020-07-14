package SE450HW3;

// Ximan Liu

public class ConcreteFOOT_Handler extends Handler {
	
	public void HandleRequest(String request)
	{
		if (request.equals("Foot")) 
		{
			System.out.println(this.getClass().getName() + "  " + request);
		}
		else if (successor != null)
		{   
			successor.HandleRequest(request);	
		}
	}	
}

