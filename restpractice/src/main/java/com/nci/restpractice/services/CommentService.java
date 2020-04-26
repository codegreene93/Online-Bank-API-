package com.nci.restpractice.services;
import java.util.ArrayList;
import java.util.List;

import com.nci.restpractice.models.Comment;
import com.nci.restpractice.models.Message;


public class CommentService {
	List<Comment> list = new ArrayList<>();
    public static boolean init = true;
	
	public CommentService(){
	     if (init) {
	       Comment c1 = new Comment(1,"First", "Manuel");
	       Comment c2 = new Comment(2,"Second", "Jack");        
	       Comment c3 = new Comment(3,"Third", "Emer");
	       Comment c4 = new Comment(4,"First", "Lisa");
	       Comment c5 = new Comment(5,"Fifth", "Jack");
	       Comment c6 = new Comment(6,"Third", "Margarete");
	        
	         list.add(c1);
	         list.add(c2);
	         list.add(c3);
	         list.add(c4);
	         list.add(c5);
	         list.add(c6);
	         init = false;
	      }
	 }
	
	
	
    public List<Comment> getAllComments() {
        return list;
    }
    
    public Comment getComment(int id) {
        return list.get(id-1);
    }
	
	
}
