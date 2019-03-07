
public interface Filter {
	ChairInProgress operate(ChairInProgress input);
	int getExecutionTime();
}
