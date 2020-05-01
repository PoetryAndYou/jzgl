package com.ytmj.jzgl.service.impl;

import com.ytmj.jzgl.domain.Viewdepartment;
import com.ytmj.jzgl.mapper.DepartmentMapper;
import com.ytmj.jzgl.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author rui
 * @create 2020-04-26 23:47
 */
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public void deleteDepartment(Integer id) {
        departmentMapper.deleteDepartment(id);
    }

    @Override
    public void addDepartment(Viewdepartment viewdepartment) {
        departmentMapper.addDepartment(viewdepartment);
    }

    @Override
    public void updateDepartment(Viewdepartment viewdepartment) {
        departmentMapper.updateDepartment(viewdepartment);
    }
}
