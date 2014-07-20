package com.selectyourjob.utils;

import java.util.ArrayList;
import java.util.List;

//import org.apache.xerces.parsers.XMLParser;
//import org.dom4j.io.SAXReader;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
//import org.dom4j.Document;
//import org.dom4j.DocumentException;
//import org.dom4j.Element;
//import org.dom4j.io.SAXReader;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;

import com.selectyourjob.models.ResultModel;
//import com.google.gwt.xml.client.Document;
//import com.google.gwt.xml.client.Element;
//import com.google.gwt.xml.client.Node;
//import com.google.gwt.xml.client.NodeList;
//import com.google.gwt.xml.client.XMLParser;

public class XmlUtil {

	private void parseMessage(String messageXml) {
		try {
			// parse the XML document into a DOM
			// Document messageDom = XMLParser.parse(messageXml);

			// find the sender's display name in an attribute of the <from> tag
			// Node fromNode = messageDom.getElementsByTagName("from").item(0);
			// String from = ((Element)fromNode).getAttribute("displayName");
			// fromLabel.setText(from);
			//
			// // get the subject using Node's getNodeValue() function
			// String subject =
			// messageDom.getElementsByTagName("subject").item(0).getFirstChild().getNodeValue();
			// subjectLabel.setText(subject);
			//
			// // get the message body by explicitly casting to a Text node
			// Text bodyNode =
			// (Text)messageDom.getElementsByTagName("body").item(0).getFirstChild();
			// String body = bodyNode.getData();
			// bodyLabel.setText(body);

		} catch (Exception e) {
			// Window.alert("Could not parse XML document.");
		}
	}

	public static List<ResultModel> resultParser(String result) {

		Document doc = null;
		List<ResultModel> resultModels = null;
		try {

			doc = DocumentHelper.parseText(result); // 将字符串转为XML

			Element rootElt = doc.getRootElement(); // 获取根节点
			List<Element> resultNodes = rootElt.element("results").elements(
					"result");

			resultModels = new ArrayList<ResultModel>();
			for (int i = 0; i < resultNodes.size(); i++) {
				Node resultNode = resultNodes.get(i);
				ResultModel rm = new ResultModel();
				rm.setJobtitle(((Element) resultNode).element("jobtitle")
						.getStringValue());
				rm.setCompany(((Element) resultNode).element("company")
						.getStringValue());
				rm.setCity(((Element) resultNode).element("city")
						.getStringValue());
				rm.setState(((Element) resultNode).element("state")
						.getStringValue());
				rm.setCountry(((Element) resultNode).element("country")
						.getStringValue());
				rm.setSource(((Element) resultNode).element("source")
						.getStringValue());
				rm.setSnippet(((Element) resultNode).element("snippet")
						.getStringValue());
				rm.setUrl(((Element) resultNode).element("url")
						.getStringValue());
				rm.setOnmousedown(((Element) resultNode).element("onmousedown")
						.getStringValue());
				rm.setJobkey(((Element) resultNode).element("jobkey")
						.getStringValue());
				rm.setSponsored(((Element) resultNode).element("sponsored")
						.getStringValue());
				rm.setDate(((Element) resultNode).element("date")
						.getStringValue());
				rm.setExpired(((Element) resultNode).element("expired")
						.getStringValue());
				rm.setIndeedApply(((Element) resultNode).element("indeedApply")
						.getStringValue());
				rm.setFormattedLocationFull(((Element) resultNode).element(
						"formattedLocationFull").getStringValue());
				rm.setFormattedRelativeTime(((Element) resultNode).element(
						"formattedRelativeTime").getStringValue());
				resultModels.add(rm);
			}
		} catch (DocumentException e) {

		}
		return resultModels;
	}
}
// List<ResultModel> resultModels = new ArrayList<ResultModel>();
// for (int i = 0; i < resultNodes.getLength(); i++) {
// Node resultNode = resultNodes.item(i);
// ResultModel rm = new ResultModel();
// rm.setJobtitle(((Element) resultNode)
// .getElementsByTagName("jobtitle").item(0).getChildNodes()
// .item(0).getNodeValue());
// rm.setCompany(((Element) resultNode)
// .getElementsByTagName("company").item(0).getChildNodes()
// .item(0).getNodeValue());
// rm.setCity(((Element) resultNode).getElementsByTagName("city")
// .item(0).getChildNodes().item(0).getNodeValue());
// rm.setState(((Element) resultNode).getElementsByTagName("state")
// .item(0).getChildNodes().item(0).getNodeValue());
// rm.setCountry(((Element) resultNode)
// .getElementsByTagName("country").item(0).getChildNodes()
// .item(0).getNodeValue());
// rm.setSource(((Element) resultNode).getElementsByTagName("source")
// .item(0).getChildNodes().item(0).getNodeValue());
// rm.setSnippet(((Element) resultNode)
// .getElementsByTagName("snippet").item(0).getChildNodes()
// .item(0).getNodeValue());
// rm.setUrl(((Element) resultNode).getElementsByTagName("url")
// .item(0).getChildNodes().item(0).getNodeValue());
// rm.setOnmousedown(((Element) resultNode)
// .getElementsByTagName("onmousedown").item(0)
// .getChildNodes().item(0).getNodeValue());
// rm.setJobkey(((Element) resultNode).getElementsByTagName("jobkey")
// .item(0).getChildNodes().item(0).getNodeValue());
// rm.setSponsored(((Element) resultNode)
// .getElementsByTagName("sponsored").item(0).getChildNodes()
// .item(0).getNodeValue());
// rm.setDate(((Element) resultNode).getElementsByTagName("date")
// .item(0).getChildNodes().item(0).getNodeValue());
// rm.setExpired(((Element) resultNode)
// .getElementsByTagName("expired").item(0).getChildNodes()
// .item(0).getNodeValue());
// rm.setIndeedApply(((Element) resultNode)
// .getElementsByTagName("indeedApply").item(0)
// .getChildNodes().item(0).getNodeValue());
// rm.setFormattedLocationFull(((Element) resultNode)
// .getElementsByTagName("formattedLocationFull").item(0)
// .getChildNodes().item(0).getNodeValue());
// rm.setFormattedRelativeTime(((Element) resultNode)
// .getElementsByTagName("formattedRelativeTime").item(0)
// .getChildNodes().item(0).getNodeValue());

// }

// }
