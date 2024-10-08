package com.scrumplateform.kante.model.constante;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "constante")
public class Constante {
    Pagination pagination;
    EtapeConstante etape;
    DevRole devRole;
    int etapeInitiale;
    int etapeFinale;
    NotificationConstante notification;
}
