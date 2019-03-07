
public class FeetAssemblerFilter extends AbstractFilter {
	public FeetAssemblerFilter(String name, int time) {
		super(name, time);
	}
	
	@Override
	public ChairInProgress operate(ChairInProgress in) {
		if (in == null) {
			return new ChairInProgress("Feet was assembled by " + name + ".\n");
		}
		
		return new ChairInProgress(in + "Feet was assembled by " + name + ".\n");
	}
}
