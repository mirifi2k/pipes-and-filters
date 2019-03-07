
public class BackRestAssemblerFilter extends AbstractFilter {
	public BackRestAssemblerFilter(String name, int time) {
		super(name, time);
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
