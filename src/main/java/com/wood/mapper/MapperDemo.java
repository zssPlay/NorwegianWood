package com.wood.mapper;


import com.wood.po.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MapperDemo {
    public List<UserProfile> demo();
}
