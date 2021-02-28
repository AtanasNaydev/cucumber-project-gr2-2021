package uni.pl.fmi.services;

import java.util.ArrayList;
import java.util.List;



import uni.pl.fmi.User;

public class CommentService {
	
	public static String addComment(String comment) {
		final boolean isEmpty;
		if(comment== "" ) {
			isEmpty=true;
		}else {
			isEmpty=false;
		}
		return isEmpty ? "Не може да се качи празен коментар!" : "Коментарът е качен успешно!";
	}

}


