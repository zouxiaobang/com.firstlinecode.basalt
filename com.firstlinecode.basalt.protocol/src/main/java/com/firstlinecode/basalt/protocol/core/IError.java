package com.firstlinecode.basalt.protocol.core;


public interface IError {
	public enum Type {
		STREAM,
		STANZA
	}
	
	void setDefinedCondition(String definedCondition);
	String getDefinedCondition();
	void setText(LangText text);
	LangText getText();
	void setApplicationSpecificCondition(Object applicationSpecificCondition);
	Object getApplicationSpecificCondition();	
	boolean closeStream();
}
