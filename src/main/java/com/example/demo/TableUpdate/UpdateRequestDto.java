package com.example.demo.TableUpdate;

import javax.persistence.ElementCollection;
import java.util.List;

public class UpdateRequestDto {
    private Boolean isUpdate;
    private String tableName;
    @ElementCollection
    private List<String> columnName;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<String> getColumnName() {
        return columnName;
    }

    public void setColumnName(List<String> columnName) {
        this.columnName = columnName;
    }

    public Boolean getUpdate() {
        return isUpdate;
    }

    public void setUpdate(Boolean update) {
        isUpdate = update;
    }
}
