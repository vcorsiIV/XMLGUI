package com.cooksys.assessment;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class XMLParts {

	@XmlElement(name = "Parts")
	private List<String> part;
	
	public List<String> getPart() { 
		return part;
	}
	public void setPart(List<String> part) {
		this.part = part;
	}
}

