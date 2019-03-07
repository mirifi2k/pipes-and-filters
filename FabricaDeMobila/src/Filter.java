
public interface Filter<I, O> {
	O operate(I input);
}
