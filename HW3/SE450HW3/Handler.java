package SE450HW3;

// Ximan Liu

public abstract class Handler {

	protected Handler successor;
	
	public void SetSuccessor (Handler successor)
	{
		this.successor = successor;
	}

	public abstract void HandleRequest(String request);
}

