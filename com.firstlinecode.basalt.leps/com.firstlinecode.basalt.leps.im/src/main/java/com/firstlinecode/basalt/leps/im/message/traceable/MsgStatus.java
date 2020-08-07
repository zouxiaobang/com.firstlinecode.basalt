package com.firstlinecode.basalt.leps.im.message.traceable;

import com.firstlinecode.basalt.oxm.convention.conversion.annotations.String2DateTime;
import com.firstlinecode.basalt.oxm.convention.conversion.annotations.String2Enum;
import com.firstlinecode.basalt.oxm.convention.conversion.annotations.String2JabberId;
import com.firstlinecode.basalt.protocol.core.JabberId;
import com.firstlinecode.basalt.protocol.datetime.DateTime;

public class MsgStatus {
	public enum Status {
		SERVER_REACHED,
		PEER_REACHED
	};
	
	private String id;
	@String2Enum(Status.class)
	private Status status;
	@String2JabberId
	private JabberId from;
	@String2DateTime
	private DateTime stamp;
	
	public MsgStatus() {}
	
	public MsgStatus(String id) {
		this.id = id;
	}
	
	public MsgStatus(String id, Status status, JabberId from, DateTime stamp) {
		this.id = id;
		this.status = status;
		this.from = from;
		this.stamp = stamp;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}

	public JabberId getFrom() {
		return from;
	}

	public void setFrom(JabberId from) {
		this.from = from;
	}

	public DateTime getStamp() {
		return stamp;
	}

	public void setStamp(DateTime stamp) {
		this.stamp = stamp;
	}
	
}
