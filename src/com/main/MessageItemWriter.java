package com.main;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

/**
 * д�뷽��
 * Title:   MessageItemWriter.java
 * Description:   
 * Company:   www.edu24ol.com
 * @author   pc-zw
 * @date     2015��12��31������2:52:42
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
