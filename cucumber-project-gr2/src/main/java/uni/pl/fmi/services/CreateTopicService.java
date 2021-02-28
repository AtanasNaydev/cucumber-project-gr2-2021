package uni.pl.fmi.services;

import java.util.List;

import uni.pl.fmi.Topic;
import uni.pl.fmi.User;

public class CreateTopicService {

	
	public static String addNewTopic(String header, String content) {
		
		if(header==null&&content==null)
		{
			return "Грешка. Не може да добавите тема без заглавна част и съдържание.";
		}
		if(header==null)
		{
			return "Грешка. Не може да добавите тема без заглавна част.";
		}
		if(content==null)
		{
			return "Грешка. Не може да добавите тема без съдържание.";
		}
		return "Темата е добавена успешно.";
	}

	
	
	
}
