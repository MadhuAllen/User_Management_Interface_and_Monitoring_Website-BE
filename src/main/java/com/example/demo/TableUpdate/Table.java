package com.example.demo.TableUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Table {
    private String tableName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uniqueColumn;
    private String columnName;

    public Table(){

    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Long getUniqueColumn() {
        return uniqueColumn;
    }

    public void setUniqueColumn(Long uniqueColumn) {
        this.uniqueColumn = uniqueColumn;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableName='" + tableName + '\'' +
                ", uniqueColumn=" + uniqueColumn +
                ", columnName='" + columnName + '\'' +
                '}';
    }
}
