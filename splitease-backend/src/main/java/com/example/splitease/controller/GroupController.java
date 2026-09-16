package com.example.splitease.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.splitease.dto.AddGroupDTO;
import com.example.splitease.model.Group;
import com.example.splitease.service.GroupService;

@RestController
@RequestMapping("/api/group")
public class GroupController {

    private final GroupService groupService;

    public GroupController(GroupService groupService){
        this.groupService = groupService;
    }

    @PostMapping("/create")
    public Group addGroup(@RequestBody AddGroupDTO addGroupDTO){
        return groupService.createGroup(addGroupDTO);
    }
    
}
