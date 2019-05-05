package edu.mum.cs.cmbk.service.impl;

import edu.mum.cs.cmbk.data.Database;
import edu.mum.cs.cmbk.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class AdviceServiceImpl implements AdviceService {
    @Autowired
    private Database database;

    public List<String> getListByType(String type) {
        return database.advice.get(type);
    }

    public Map<Integer, String> getAllRoasts() {

        return database.roasts;
    }

    public String getRoast(Integer key) {
        return database.roasts.get(key);
    }
}
