package com.main;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**
 * 
 * Title:   UserMapper.java
 * Description:   
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015��12��31������2:50:19
 * @version  1.0
 */
public class UserMapper implements FieldSetMapper<User>{

	
   //�÷����������ǽ����������ݷ�װ��������
	//��װΪ����
	@Override
	public User mapFieldSet(FieldSet fs) throws BindException {
		User u = new User();
		u.setUserName(fs.readString(0));
		u.setAge(fs.readInt(1));
		return u;
	}

}
