package lk.jananiSuper.jananiSuper.asset.message.dao;

import lk.jananiSuper.jananiSuper.asset.message.entity.EmailMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailMessageDao extends JpaRepository<EmailMessage, Integer > {
}
