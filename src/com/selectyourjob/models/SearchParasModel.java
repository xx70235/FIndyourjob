package com.selectyourjob.models;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SearchParasModel implements Serializable{

	String baseUrl = "http://api.indeed.com/ads/apisearch?";
	String targetUrl = "";
	String publicID = "6861259561206009";// fixed, 6861259561206009
	String l = "";// Location. Use a postal code or a
					// "city, state/province/region" combination.
	String q = "";// Query. By default terms are ANDed
	String v = "2";// Version. Which version of the API you wish to use. All
					// publishers should be using version 2. Currently available
					// versions are 1 and 2. This parameter is required.
	String sort = "";// Sort by relevance or date. Default is relevance.
	String radius = "";// Distance from search location ("as the crow flies").
						// Default is 25.
	String st = "";// Site type. To show only jobs from job boards use
					// 'jobsite'. For jobs from direct employer websites use
					// 'employer'.
	String jt = "";// Job type. Allowed values: "fulltime", "parttime",
					// "contract", "internship", "temporary".
	String start = "";// Start results at this result number, beginning with 0.
						// Default is 0.
	String limit = "";// Maximum number of results returned per query. Default
						// is 10
	String fromage = "";// Number of days back to search.
	String highlight = "";// Setting this value to 1 will bold terms in the
							// snippet that are also present in q. Default is 0.
	String filter = "";// Filter duplicate results. 0 turns off duplicate job
						// filtering. Default is 1.
	String latlong = "1";// If latlong=1, returns latitude and longitude
							// information for each job result. Default is 0.
	String co = "us";// Search within country specified. Default is us.
	String chnl = "";// Channel Name: Group API requests to a specific channel
	String userip="";// The IP number of the end-user to whom the job results will
					// be displayed. This field is required.
	String useragent="";// Request, get from the http header

	public SearchParasModel() {

	}

	public String getPublicID() {
		return publicID;
	}

	public void setPublicID(String publicID) {
		this.publicID = publicID;
	}

	public String getL() {
		return l;
	}

	public void setL(String l) {
		this.l = l;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getRadius() {
		return radius;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	public String getSt() {
		return st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public String getJt() {
		return jt;
	}

	public void setJt(String jt) {
		this.jt = jt;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getFromage() {
		return fromage;
	}

	public void setFromage(String fromage) {
		this.fromage = fromage;
	}

	public String getHighlight() {
		return highlight;
	}

	public void setHighlight(String highlight) {
		this.highlight = highlight;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public String getLatlong() {
		return latlong;
	}

	public void setLatlong(String latlong) {
		this.latlong = latlong;
	}

	public String getCo() {
		return co;
	}

	public void setCo(String co) {
		this.co = co;
	}

	public String getChnl() {
		return chnl;
	}

	public void setChnl(String chnl) {
		this.chnl = chnl;
	}

	public String getUserip() {
		return userip;
	}

	public void setUserip(String userip) {
		this.userip = userip;
	}

	public String getUseragent() {
		return useragent;
	}

	public void setUseragent(String useragent) {
		this.useragent = useragent;
	}

	public String generateUrl() {
		targetUrl = baseUrl + "publisher=" + this.publicID + "&q="
				+ this.getQ() + "&l=" + this.getL() + "&sort=" + this.getSort()
				+ "&radius=" + this.getRadius() + "&st=" + this.getSt()
				+ "&jt=" + this.getJt() + "&start=" + this.getStart()
				+ "&limit=" + this.getLimit() + "&fromage=" + this.getFromage()
				+ "&filter=" + this.getFilter() + "&latlong="
				+ this.getLatlong() + "&co=" + this.getCo() + "&chnl="
				+ this.getChnl() + "&userip=" + this.getUserip()
				+ "&useragent=" + this.getUseragent() + "&v=" + this.getV();

		return targetUrl;
	}

}
