package com.example.demo.TableUpdate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TableService {
    @Autowired
    private TableRepo tableRepo;

    public List<Table> getAllTableContents() {
        return tableRepo.findAll();
    }


    public List<Table> updateTable(UpdateRequestDto tableDto) {
        List<Table> tables=new ArrayList<>();
        if(tableDto.getUpdate()==false) {
            tableDto.getColumnName().forEach(data -> {
                Table table = new Table();
                table.setTableName(tableDto.getTableName());
                table.setColumnName(data);
                tableRepo.save(table);
                tables.add(table);
            });
        }else {
            List<Table> tablesList=tableRepo.findAll();
            for(int i=0;i<tableDto.getColumnName().size();i++){
                tablesList.get(i).setColumnName(tableDto.getColumnName().get(i));
                tableRepo.save(tablesList.get(i));
                tables.add(tablesList.get(i));
            }
        }
        return tables;
    }
}
