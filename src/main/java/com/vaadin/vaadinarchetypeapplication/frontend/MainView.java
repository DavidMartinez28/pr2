package com.vaadin.vaadinarchetypeapplication.frontend;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.*;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout{
    public MainView() {
    
        TextField name = new TextField("Hola");
        VerticalLayout layout = new VerticalLayout(name);

        add(name);
    
    }
}


