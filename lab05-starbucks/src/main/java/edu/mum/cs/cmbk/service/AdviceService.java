package edu.mum.cs.cmbk.service;

import java.util.List;
import java.util.Map;

public interface AdviceService {
    List<String> getListByType(String type);

    Map<Integer, String> getAllRoasts();

    String getRoast(Integer key);
}
