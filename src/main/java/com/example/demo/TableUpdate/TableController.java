package com.example.demo.TableUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TableController {

    @Autowired
    private TableService tableService;


    @GetMapping(value = "get_table")
    public List<Table> getAllTableContents() {
        return tableService.getAllTableContents();
    }

    @PostMapping(value = "update_table/")
    public List<Table> updateUser(@RequestBody UpdateRequestDto table ) {
        return tableService.updateTable(table);
    }

}
