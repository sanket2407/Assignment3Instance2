package wallet;

public class EtcdResult {
	//General values
	//public String action;
	public EtcdNode node;
	//public EtcdNode prevNode;

	// For errors
	//public Integer errorCode;
	//public String message;
	//public String cause;
	//public int errorIndex;
	//public String value;
	//public int index;

	/*public boolean isError() {
		return errorCode != null;
	}*/

	@Override
	public String toString() {
		return EtcdClient.format(this);
	}
}
