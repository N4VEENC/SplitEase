package com.example.splitease.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.splitease.dto.AddGroupDTO;
import com.example.splitease.model.Group;
import com.example.splitease.model.User;
import com.example.splitease.repository.GroupRepository;
import com.example.splitease.repository.UserRepository;

@Service
public class GroupService {
    private final GroupRepository groupRepository;
    private final UserRepository userRepository;

    public GroupService(GroupRepository groupRepository, UserRepository userRepository){
        this.groupRepository = groupRepository;
        this.userRepository = userRepository;
    }

    public Group createGroup(AddGroupDTO addGroupDTO){
        List<User> users = new ArrayList<>();
        if(userRepository.existsById(addGroupDTO.getUserId())){
            User user = userRepository.findById(addGroupDTO.getUserId()).get();
            users.add(user);
            Group group = new Group(null,addGroupDTO.getGroupName(),user,null,users);
            return groupRepository.save(group);
        }

        return null;
        
    }
}
