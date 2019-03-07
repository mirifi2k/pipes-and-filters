
public class CutSeatFilter extends AbstractFilter {
	public CutSeatFilter(String name, int time) {
		super(name, time);
	}

	@Override
	public ChairInProgress operate(ChairInProgress in) {
		if (in == null) {
			return new ChairInProgress("Seat was cut by " + name + ".\n");
		}
		
		return new ChairInProgress(in + "Seat was cut by " + name + ".\n");
	}
}
