package com.firstlinecode.basalt.xeps.muc.admin;

import java.util.ArrayList;
import java.util.List;

import com.firstlinecode.basalt.oxm.convention.annotations.Array;
import com.firstlinecode.basalt.oxm.convention.annotations.ProtocolObject;
import com.firstlinecode.basalt.protocol.core.Protocol;
import com.firstlinecode.basalt.xeps.muc.user.Item;

@ProtocolObject(namespace="http://jabber.org/protocol/muc#admin", localName="query")
public class MucAdmin {
	public static final Protocol PROTOCOL = new Protocol("http://jabber.org/protocol/muc#admin", "query");
	
	@Array(Item.class)
	private List<Item> items;

	public List<Item> getItems() {
		if (items == null)
			items = new ArrayList<>();
		
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
