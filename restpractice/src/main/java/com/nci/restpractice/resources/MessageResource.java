
package com.nci.restpractice.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nci.restpractice.models.Message;
import com.nci.restpractice.services.MessageService;

/**
 *
 * @author Wilmir-Nicanor
 */
@Path("/messages")
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public class MessageResource {
    
    MessageService messageService = new MessageService();
    /*
    @GET
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }    
    */
    
    @GET
    @Path("/{messageId}")
    public Message getMessage(@PathParam("messageId") int id) {
        return messageService.getMessage(id);
    }
    
    
    @POST
    public Message postMessage(Message m) {
    	return messageService.createMessage(m);
    }
    
    @GET
    public List<Message> getFilteredMessages(@QueryParam("message") String message, @QueryParam("author") String author) {
        if ((message != null) || (author != null)) {
                     return messageService.getSearchMessages(message, author);
        }
        return messageService.getAllMessages();
    } 
    
    
    
}

