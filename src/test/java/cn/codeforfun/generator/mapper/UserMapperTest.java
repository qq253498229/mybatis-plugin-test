package cn.codeforfun.generator.mapper;

import cn.codeforfun.generator.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class UserMapperTest {
  @Resource
  private UserMapper userMapper;

  @Test
  public void select() {
    List<User> users = userMapper.selectAll();
    log.info("user size:{}", users.size());
    Assert.assertNotNull(users);
  }

  @Test
  public void batchInsert() {
    User user1 = new User();
    user1.setName("111");
    User user2 = new User();
    user2.setName("222");
    User user3 = new User();
    user3.setName("333");
    User user4 = new User();
    user4.setName("444");
    User user5 = new User();
    user5.setName("555");
    User user6 = new User();
    user6.setName("666");
    List<User> userList = new ArrayList<>();
    userList.add(user1);
    userList.add(user2);
    userList.add(user3);
    userList.add(user4);
    userList.add(user5);
    userList.add(user6);
    int i = userMapper.insertList(userList);
    log.info("insert amount:{}", i);
    Assert.assertEquals(i, 6);
  }
}