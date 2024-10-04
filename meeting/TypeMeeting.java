package com.scrumplateform.kante.model.meeting;


import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "typeMeeting")
public class TypeMeeting {
    
    private String id;
    private String type;
}
