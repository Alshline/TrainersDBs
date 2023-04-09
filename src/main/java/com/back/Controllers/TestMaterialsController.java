package com.back.Controllers;

import com.back.Services.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestMaterialsController {

    @Autowired
    private MaterialService materialService;



}
