
public class BackRestAssemblerFilter extends AbstractFilter {
	public BackRestAssemblerFilter(String name) {
		super(name);
	}
	
	@Override
	public ChairInProgress operate(ChairInProgress in) {
		if (in == null) {
			return new ChairInProgress("Backrest was assembled by " + name + ".\n");
		} else {
			return new ChairInProgress(in + "Backrest was assembled by " + name + ".\n");
		}
	}
}
