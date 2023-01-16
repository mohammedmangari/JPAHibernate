package com.med.jpaExample;


@javax.persistence.Entity
public class developer {

	@javax.persistence.Id
	private int id;
	private String name ;
    private String langauge;


	public String getLangauge() {
		return langauge;
	}

	public void setLangauge(String language) {
		this.langauge = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}




}
