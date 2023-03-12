package com.BHC.TRAVEL.HYEN_SHAN.USER;

import com.BHC.TRAVEL.HYEN_SHAN.USER.MODEL.USER;
import com.BHC.TRAVEL.HYEN_SHAN.USER.PARAMS.Create_account_param;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/User")
public class UserController {
    @Autowired
    MongoTemplate mongoTemplate;
    ObjectMapper objectMapper = new ObjectMapper();
    @ResponseBody
    @PostMapping("Create_Account")
    public String mapping_Test(@RequestBody Create_account_param param) throws JsonProcessingException {
        USER user = USER.builder().ID(param.getId()).password(param.getPw()).nickname(param.getNick()).build();
        mongoTemplate.insert(user);
        String tempText = objectMapper.writeValueAsString(user);
        return tempText;
    }

}


