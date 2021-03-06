
public class StabilizerBarAssemblerFilter extends AbstractFilter {
	public StabilizerBarAssemblerFilter(String name, int time) {
		super(name, time);
	}
	
	@Override
	public ChairInProgress operate(ChairInProgress in) {
		if (in == null) {
			return new ChairInProgress("Stabilizer bar was assembled by " + name + ".\n");
		} else {
			return new ChairInProgress(in + "Stabilizer bar was assembled by " + name + ".\n");
		}
	}
}
