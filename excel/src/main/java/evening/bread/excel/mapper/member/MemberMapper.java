package evening.bread.excel.mapper.member;

import evening.bread.excel.model.member.MemberDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface MemberMapper {
    void insertMember(MemberDTO memberDTO) throws DataAccessException;
}