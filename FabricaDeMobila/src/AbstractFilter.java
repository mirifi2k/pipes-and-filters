
public abstract class AbstractFilter implements Filter {
	protected String name;
	private int time;
	
	public AbstractFilter(String name, int time) {
		this.name = name;
		this.time = time;
	}
	
	public int getExecutionTime() {
		return time;
	}
	
	@Override
	public abstract ChairInProgress operate(ChairInProgress in);
}
