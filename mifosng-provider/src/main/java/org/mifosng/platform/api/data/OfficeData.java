package org.mifosng.platform.api.data;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;

public class OfficeData {

	private Long id;
	private String name;
	private String nameDecorated;
	private String externalId;
	private LocalDate openingDate;
	private String hierarchy;
	private Long parentId;
	private String parentName;
	
	private List<OfficeLookup> allowedParents = new ArrayList<OfficeLookup>();

	public OfficeData() {
		//
	}

	public OfficeData(final Long id, final String name,
			final String nameDecorated, final String externalId,
			final LocalDate openingDate, String hierarchy, final Long parentId,
			final String parentName) {
		this.id = id;
		this.name = name;
		this.nameDecorated = nameDecorated;
		this.externalId = externalId;
		this.openingDate = openingDate;
		this.hierarchy = hierarchy;
		this.parentName = parentName;
		this.parentId = parentId;
	}

	public Long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getNameDecorated() {
		return nameDecorated;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public LocalDate getOpeningDate() {
		return this.openingDate;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public String getParentName() {
		return this.parentName;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setNameDecorated(String nameDecorated) {
		this.nameDecorated = nameDecorated;
	}

	public void setExternalId(final String externalId) {
		this.externalId = externalId;
	}

	public void setOpeningDate(final LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	public void setParentName(final String parentName) {
		this.parentName = parentName;
	}

	public void setParentId(final Long parentId) {
		this.parentId = parentId;
	}

	public String getHierarchy() {
		return hierarchy;
	}

	public void setHierarchy(String hierarchy) {
		this.hierarchy = hierarchy;
	}

	public List<OfficeLookup> getAllowedParents() {
		return allowedParents;
	}

	public void setAllowedParents(List<OfficeLookup> allowedParents) {
		this.allowedParents = allowedParents;
	}
}