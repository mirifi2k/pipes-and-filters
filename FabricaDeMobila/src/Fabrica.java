import java.util.*;

public class Fabrica {
	private List<Filter> workers = new ArrayList<Filter>();
	protected ChairInProgress first = new ChairInProgress("Wood was delivered.\n");
	
	public Fabrica() {
		workers.add(new CutSeatFilter("Ion", 10));
		workers.add(new FeetAssemblerFilter("Vasile", 15));
		workers.add(new BackRestAssemblerFilter("Petru", 40));
		workers.add(new StabilizerBarAssemblerFilter("Gheorghe", 20));
		workers.add(new PackageFilter("Costi", 10));
	}
	
	public int getFiltersExecutionTime() {
		int time = 0;
		
		for (Filter f : workers) {
			time += f.getExecutionTime();
		}
		
		return time;
	}
	
	public int start(int n) {
		while (n --> 0) {
			for (Filter f : workers) {
				ChairInProgress out = f.operate(first);
				first = out;
			}	
		}
		
		return getFiltersExecutionTime() + 40 * (n - 1);
	}
}
