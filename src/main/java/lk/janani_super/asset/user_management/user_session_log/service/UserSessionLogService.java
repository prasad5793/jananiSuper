package lk.janani_super.asset.user_management.user_session_log.service;

import lk.janani_super.asset.user_management.user.entity.User;
import lk.janani_super.asset.user_management.user_session_log.dao.UserSessionLogDao;
import lk.janani_super.asset.user_management.user_session_log.entity.UserSessionLog;
import lk.janani_super.asset.user_management.user_session_log.entity.enums.UserSessionLogStatus;
import lk.janani_super.util.interfaces.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig( cacheNames = {"userSessionLog"} )
public class UserSessionLogService implements AbstractService<UserSessionLog, Integer > {
    private final UserSessionLogDao userSessionLogDao;

    @Autowired
    public UserSessionLogService(UserSessionLogDao userSessionLogDao) {
        this.userSessionLogDao = userSessionLogDao;
    }

    @Override

    public List< UserSessionLog > findAll() {
        return userSessionLogDao.findAll();
    }

    @Override

    public UserSessionLog findById(Integer id) {
        return userSessionLogDao.getOne(id);
    }

    @Override
    @Caching( evict = {@CacheEvict( value = "userSessionLog", allEntries = true )},
            put = {@CachePut( value = "userSessionLog", key = "#userSessionLog.id" )} )
    public UserSessionLog persist(UserSessionLog userSessionLog) {
        return userSessionLogDao.save(userSessionLog);
    }

    @Override
    public boolean delete(Integer id) {
        // can not be implement

        return true;
    }

    public void delete(UserSessionLog userSessionLog){
         userSessionLogDao.delete(userSessionLog);
    }

    @Override
    public List< UserSessionLog > search(UserSessionLog userSessionLog) {
        return null;
    }


    public UserSessionLog findByUserAndUserSessionLogStatus(User user, UserSessionLogStatus userSessionLogStatus) {
        return userSessionLogDao.findByUserAndUserSessionLogStatus(user, userSessionLogStatus);
    }
}
