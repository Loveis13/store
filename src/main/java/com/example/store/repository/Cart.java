package com.example.store.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Repository
@SessionScope
public class Cart {
    private List<Long> cartlist = new ArrayList<>();

    public void add(Long id) {
        cartlist.add(id);
    }

    public List<Long> get() {
        return Collections.unmodifiableList(cartlist);
    }
}
