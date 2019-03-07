
public class PackageFilter extends AbstractFilter {
	public PackageFilter(String name) {
		super(name);
	}
	
	@Override
	public ChairInProgress operate(ChairInProgress in) {
		if (in == null) {
			return new ChairInProgress("Chair was packed by " + name + ".\n");
		} else {
			return new ChairInProgress(in + "Chair was packed by " + name + ".\n");
		}
	}
}
