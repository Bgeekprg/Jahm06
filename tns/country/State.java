package tns.country;

public class State {
	private String state;
	public State() {
		this.state = "";
	}

	public State(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "State [state=" + state + "]";
	}
	
}
