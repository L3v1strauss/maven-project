package com.cattest.dao;

import com.cattest.api.dao.ICatDao;
import com.cattest.entities.Cat;

import java.util.ArrayList;
import java.util.List;

public class CatDao implements ICatDao {
    public List<Cat> cats() {
        return null;
    }

    public List<Cat> getCats() {
         List<Cat> cats = new ArrayList<>();
         Cat cat = new Cat("Tom");
         cats.add(cat);
         return cats;

    }
}
