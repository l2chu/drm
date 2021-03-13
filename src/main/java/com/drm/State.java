package com.drm;

public class State {
	private String stateId;
	private String stateName;
	
	public State(String id, String name) {
		this.stateId = id;
		this.stateName = name;
	}

	public String getStateId() {
		return stateId;
	}

	public void setStateId(String stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
