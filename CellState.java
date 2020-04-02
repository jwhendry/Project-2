import java.util.Map;
import java.util.HashMap;

public enum CellState {
	
	ON('O'),
	OFF('.');
	
	private char symbol;
	private static Map<Character, CellState> SYMBOL_TO_STATE = new HashMap<Character, CellState>(){

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		{
			put('O', ON);
			put('.', OFF);
		}
		
	};
	
	
	private CellState(char symbol) {
		
		this.symbol = symbol;
	}
	
	public static CellState getState(char symbol) {
		
		return SYMBOL_TO_STATE.get(symbol);
	}
	
	public String toString() {
		return "" + symbol;
	}
	
}
