
package com.portfolio.proyect.Security;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Message {
    private String message;

    public Message() {
    }

    public Message(String menssage) {
        this.message = menssage;
    }  
    
}