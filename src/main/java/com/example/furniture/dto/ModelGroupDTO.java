package com.example.furniture.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModelGroupDTO {


    private Integer parentModel;
    private Integer childModel;

    public ModelGroupDTO() {
    }

    public ModelGroupDTO(Integer parentModel, Integer childModel) {
        this.parentModel = parentModel;
        this.childModel = childModel;
    }

    public Integer getParentModel() {
        return parentModel;
    }

    public void setParentModel(Integer parentModel) {
        this.parentModel = parentModel;
    }

    public Integer getChildModel() {
        return childModel;
    }

    public void setChildModel(Integer childModel) {
        this.childModel = childModel;
    }
}
