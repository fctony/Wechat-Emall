package org.web.emall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.emall.mappers.CategoryMapper;
import org.web.emall.models.Category;
import org.web.emall.service.CategoryService;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getAll() {
        return categoryMapper.selectByExample(null);
    }

    @Override
    public Category findById(Integer id) {
        return null;
    }
}
