package com.example.new_springboot.dto;

public class NewDTO {

    private Long id;
    private String title;
    private String content;
    private String shortDescription;
    private String categoryCode;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
}
