package com.hivetech.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBasedInjection {

    private final InjectedBean injectedBean;

    @Autowired
    public ConstructorBasedInjection(final InjectedBean injectedBean) {
        this.injectedBean = injectedBean;
    }
}
