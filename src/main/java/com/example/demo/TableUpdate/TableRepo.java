package com.example.demo.TableUpdate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepo extends JpaRepository<Table, Long> {
    Table findByColumnName(String name);
}
