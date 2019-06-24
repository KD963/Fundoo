package com.bridgelabz.fundoo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Label {

	@Id
	private String labelId;
	private String userId;
	private String createTime;
	private String updateTime;
	private List<Note> notes;
	
	public Label() {
		
	}

	public Label(String labelId, String userId, String createTime, String updateTime, List<Note> notes) {
		super();
		this.labelId = labelId;
		this.userId = userId;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.notes = notes;
	}

	public String getLabelId() {
		return labelId;
	}

	public void setLabelId(String labelId) {
		this.labelId = labelId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Label [labelId=" + labelId + ", userId=" + userId + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", notes=" + notes + "]";
	}
	
	
}

