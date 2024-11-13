package com.hkx.mongo.mongodemo;

import com.hkx.mongo.mongodemo.domain.User;
import com.hkx.mongo.mongodemo.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootTest
class MongoDemoApplicationTests {
    @Autowired
    private IUserService userService;

    @Test
    public void testSave() {
        User user = new User();
        user.setName("xiaohuang");
        user.setAge(22);
        user.setHobbies(Arrays.asList("dddd", "ffff","fffff"))   ;
        userService.save(user);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId("67282292de8a663abffe1e24");
        user.setName("update");
        user.setAge(18);
        userService.update(user);
    }

    @Test
    public void testDelete() {
        userService.delete("67282292de8a663abffe1e24");
    }

    @Test
    public void testGet() {
        System.out.println(userService.get("672706b90d4d1a5f340b6f39"));
    }

    @Test
    public void testList() {
        System.out.println(userService.list());
    }

}
