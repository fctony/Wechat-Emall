package org.web.emall.models;

import java.io.Serializable;
import java.util.List;

public class FoodDetail implements Serializable {
    private Integer id;

    private Category category;

    private Food basicInfo;

    private String content;

    private List<FoodDetailPics> pics;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Food getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(Food basicInfo) {
        this.basicInfo = basicInfo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public List<FoodDetailPics> getPics() {
        return pics;
    }

    public void setPics(List<FoodDetailPics> pics) {
        this.pics = pics;
    }

    @Override
    public String toString() {
        return "FoodDetail{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}