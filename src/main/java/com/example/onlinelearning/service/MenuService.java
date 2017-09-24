package com.example.onlinelearning.service;

import com.example.onlinelearning.pojo.Model;
import com.example.onlinelearning.pojo.Role;

import java.util.List;

public interface MenuService extends BaseService<Model> {
    List<Model> getMenuByRole(Role role);
}
