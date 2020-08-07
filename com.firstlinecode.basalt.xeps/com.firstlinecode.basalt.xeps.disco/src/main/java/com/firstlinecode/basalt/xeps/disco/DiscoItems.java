package com.firstlinecode.basalt.xeps.disco;

import java.util.ArrayList;
import java.util.List;

import com.firstlinecode.basalt.oxm.convention.annotations.Array;
import com.firstlinecode.basalt.oxm.convention.annotations.ProtocolObject;
import com.firstlinecode.basalt.protocol.core.Protocol;
import com.firstlinecode.basalt.xeps.rsm.Set;

@ProtocolObject(namespace="http://jabber.org/protocol/disco#items", localName="query")
public class DiscoItems {
	public static final Protocol PROTOCOL = new Protocol("http://jabber.org/protocol/disco#items", "query");
	
	private String node;
	@Array(Item.class)
	private List<Item> items;
	
	private Set set;
	
	public DiscoItems() {}
	
	public DiscoItems(String node) {
		this(node, null);
	}
	
	public DiscoItems(Set set) {
		this(null, set);
	}
	
	public DiscoItems(String node, Set set) {
		this.node = node;
		this.set = set;
	}
	
	public String getNode() {
		return node;
	}
	
	public void setNode(String node) {
		this.node = node;
	}
	
	public List<Item> getItems() {
		if(items == null)
			items = new ArrayList<>();
		
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Set getSet() {
		return set;
	}

	public void setSet(Set set) {
		this.set = set;
	}
	
}
