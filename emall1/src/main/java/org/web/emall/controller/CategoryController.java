package org.web.emall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.web.emall.ResponseModel;
import org.web.emall.models.Category;
import org.web.emall.service.CategoryService;

import java.util.List;

/**
 * 汤种类接口
 */
@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping("/category/all")
    public ResponseModel getCategoryAll() {
        List<Category> categoryAll = categoryService.getAll();
        if(categoryAll != null) {
            return new ResponseModel(0,categoryAll,"success");
        }
        return ResponseModel.NotFound();
    }

}
