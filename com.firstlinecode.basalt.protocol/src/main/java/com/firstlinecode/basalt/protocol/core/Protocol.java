package com.firstlinecode.basalt.protocol.core;

public final class Protocol {
	private String localName;
	private String namespace;
	
	public Protocol(String localName) {
		this(null, localName);
	}
	
	public Protocol(String namespace, String localName) {
		if (localName == null) {
			throw new IllegalArgumentException("Null local name");
		}
		
		if ("".equals(namespace)) {
			namespace = null;
		}
		
		this.namespace = namespace;
		this.localName = localName;
	}
	
	public String getLocalName() {
		return localName;
	}
	
	public String getNamespace() {
		return namespace;
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
		
		if (namespace != null)
			hash += 31 * hash + namespace.hashCode();
		
		hash += 31 * hash + localName.hashCode();
		
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		if (obj == this)
			return true;
		
		if (obj instanceof Protocol) {
			Protocol other = (Protocol)obj;
			if (!localName.equals(other.localName))
				return false;
			
			if (namespace == null) {
				if (other.namespace != null)
					return false;
			} else {
				if (!namespace.equals(other.namespace))
					return false;
			}
			
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Protocol[");
		sb.append(namespace == null ? "null" : namespace);
		sb.append(",");
		sb.append(localName == null ? "null" : localName);
		sb.append("]");
		
		return sb.toString();
	}
}
