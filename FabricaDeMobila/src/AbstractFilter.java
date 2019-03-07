
public abstract class AbstractFilter implements Filter<ChairInProgress, ChairInProgress> {
	protected String name;
	
	public AbstractFilter(String name) {
		this.name = name;
	}
	
	@Override
	public abstract ChairInProgress operate(ChairInProgress in);
}
