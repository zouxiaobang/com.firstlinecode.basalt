package com.firstlinecode.basalt.oxm.xep.xdata;

import java.util.ArrayList;
import java.util.List;

import com.firstlinecode.basalt.oxm.convention.annotations.Array;
import com.firstlinecode.basalt.oxm.convention.annotations.ProtocolObject;
import com.firstlinecode.basalt.oxm.convention.annotations.TextOnly;
import com.firstlinecode.basalt.oxm.convention.validation.annotations.ValidationClass;
import com.firstlinecode.basalt.oxm.conversion.converters.TString2XDataType;
import com.firstlinecode.basalt.oxm.conversion.validators.TXDataValidationClass;

@ValidationClass(TXDataValidationClass.class)
@ProtocolObject(namespace="jabber:x:data", localName="x")
public class TXData {
	public static final com.firstlinecode.basalt.protocol.core.Protocol PROTOCOL = new com.firstlinecode.basalt.protocol.core.Protocol("jabber:x:data", "x");
	
	public enum Type {
		FORM,
		SUBMIT,
		CANCEL,
		RESULT
	}
	
	@TextOnly
	private String title;
	@TString2XDataType
	private Type type;
	@Array(value = String.class, elementName="instructions")
	@TextOnly
	private List<String> instructions;
	private TReported reported;
	@Array(value = TField.class, elementName = "field")
	private List<TField> fields;
	@Array(value=TItem.class, elementName="item")
	private List<TItem> items;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public List<String> getInstructions() {
		if (instructions == null)
			instructions = new ArrayList<>();
		
		return instructions;
	}
	
	public void setInstructions(List<String> instructions) {
		this.instructions = instructions;
	}
	
	public TReported getReported() {
		return reported;
	}
	
	public void setReported(TReported reported) {
		this.reported = reported;
	}
	
	public List<TField> getFields() {
		if (fields == null) {
			fields = new ArrayList<>();
		}
		
		return fields;
	}
	
	public void setFields(List<TField> fields) {
		this.fields = fields;
	}
	
	public List<TItem> getItems() {
		if (items == null) {
			items = new ArrayList<>();
		}
		
		return items;
	}
	
	public void setItems(List<TItem> items) {
		this.items = items;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
}
