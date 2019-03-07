import java.util.*;

public class Fabrica {
	private List<Filter<ChairInProgress, ChairInProgress>> workers = new ArrayList<Filter<ChairInProgress, ChairInProgress>>();
	protected ChairInProgress first = new ChairInProgress("Wood was delivered.\n");
	
	public Fabrica() {
		workers.add(new CutSeatFilter("Ion"));
		workers.add(new FeetAssemblerFilter("Vasile"));
		workers.add(new BackRestAssemblerFilter("Petru"));
		workers.add(new StabilizerBarAssemblerFilter("Gheorghe"));
		workers.add(new PackageFilter("Costi"));
	}
	
	public void start() {
		for (Filter<ChairInProgress, ChairInProgress> f : workers) {
			ChairInProgress out = f.operate(first);
			first = out;
		}
	}
}
