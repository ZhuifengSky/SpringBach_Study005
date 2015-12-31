package com.main;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

/**
 * 写入方法
 * Title:   MessageItemWriter.java
 * Description:   
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015年12月31日下午2:52:42
 * @version  1.0
 */
public class MessageItemWriter implements ItemWriter<Message>{

	@Override
	public void write(List<? extends Message> messages) throws Exception {
		System.out.println("write results");
		for (Message m : messages) {
			System.out.println(m.getContent());
		}
		
	}

	

}
