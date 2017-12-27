package com.ngemobi.bean;

public class Oads {
	/**
	 * 编号
	 */
	private long id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 
	 */
	private int providerId;
	/**
	 * 包(使用这个字段和谷歌商店的url拼接，查看应用是否下架)
	 */
	private String pkg;
	/**
	 * 
	 */
	private String offerid;
	/**
	 * 
	 */
	private double revenue;
	/**
	 * 
	 */
	private boolean payoutType;
	/**
	 * 
	 */
	private String tracklink;
	/**
	 * 
	 */
	private String previewlink;
	/**
	 * 
	 */
	private String countries;
	/**
	 * 标记，1是安卓，2是ios
	 */
	private boolean os;
	/**
	 * 图标
	 */
	private String icon;
	/**
	 * 
	 */
	private String creativeFiles;
	/**
	 * 
	 */
	private boolean incentive;
	/**
	 * 
	 */
	private boolean osMinVersion;
	/**
	 * 
	 */
	private String carriers;
	/**
	 * 
	 */
	private int cap;
	/**
	 * 
	 */
	private String status;
	/**
	 * 应用描述
	 */
	private String description;

	public Oads() {
		super();
	}

	public Oads(long id, String name, int providerId, String pkg, String offerid, double revenue, boolean payoutType,
			String tracklink, String previewlink, String countries, boolean os, String icon, String creativeFiles,
			boolean incentive, boolean osMinVersion, String carriers, int cap, String status, String description) {
		super();
		this.id = id;
		this.name = name;
		this.providerId = providerId;
		this.pkg = pkg;
		this.offerid = offerid;
		this.revenue = revenue;
		this.payoutType = payoutType;
		this.tracklink = tracklink;
		this.previewlink = previewlink;
		this.countries = countries;
		this.os = os;
		this.icon = icon;
		this.creativeFiles = creativeFiles;
		this.incentive = incentive;
		this.osMinVersion = osMinVersion;
		this.carriers = carriers;
		this.cap = cap;
		this.status = status;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProviderId() {
		return providerId;
	}

	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}

	public String getPkg() {
		return pkg;
	}

	public void setPkg(String pkg) {
		this.pkg = pkg;
	}

	public String getOfferid() {
		return offerid;
	}

	public void setOfferid(String offerid) {
		this.offerid = offerid;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public boolean isPayoutType() {
		return payoutType;
	}

	public void setPayoutType(boolean payoutType) {
		this.payoutType = payoutType;
	}

	public String getTracklink() {
		return tracklink;
	}

	public void setTracklink(String tracklink) {
		this.tracklink = tracklink;
	}

	public String getPreviewlink() {
		return previewlink;
	}

	public void setPreviewlink(String previewlink) {
		this.previewlink = previewlink;
	}

	public String getCountries() {
		return countries;
	}

	public void setCountries(String countries) {
		this.countries = countries;
	}

	public boolean isOs() {
		return os;
	}

	public void setOs(boolean os) {
		this.os = os;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getCreativeFiles() {
		return creativeFiles;
	}

	public void setCreativeFiles(String creativeFiles) {
		this.creativeFiles = creativeFiles;
	}

	public boolean isIncentive() {
		return incentive;
	}

	public void setIncentive(boolean incentive) {
		this.incentive = incentive;
	}

	public boolean isOsMinVersion() {
		return osMinVersion;
	}

	public void setOsMinVersion(boolean osMinVersion) {
		this.osMinVersion = osMinVersion;
	}

	public String getCarriers() {
		return carriers;
	}

	public void setCarriers(String carriers) {
		this.carriers = carriers;
	}

	public int getCap() {
		return cap;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Oads [id=" + id + ", name=" + name + ", providerId=" + providerId + ", pkg=" + pkg + ", offerid="
				+ offerid + ", revenue=" + revenue + ", payoutType=" + payoutType + ", tracklink=" + tracklink
				+ ", previewlink=" + previewlink + ", countries=" + countries + ", os=" + os + ", icon=" + icon
				+ ", creativeFiles=" + creativeFiles + ", incentive=" + incentive + ", osMinVersion=" + osMinVersion
				+ ", carriers=" + carriers + ", cap=" + cap + ", status=" + status + ", description=" + description
				+ "]";
	}

}
