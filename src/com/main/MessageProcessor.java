package com.main;

import org.springframework.batch.item.ItemProcessor;

/**
 * 处理过程
 * Title:   MessageProcessor.java
 * Description:   
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015年12月31日下午2:55:43
 * @version  1.0
 */
public class MessageProcessor implements ItemProcessor<User, Message>{
    //定义一个输入对象  一个输出对象  
	 //Spring batch定义每次只处理一个。当结果达到写的标准统一提交给Writer
	@Override
	public Message process(User item) throws Exception {
		Message m = new Message();
		m.setContent("Hello " + item.getUserName()
				+ ",please pay promptly at the end of this month.");
		return m;
	}

	
}
