package com.EventManagament.system.adapters.driving.GraphQL;

import com.EventManagament.system.adapters.driving.WeddingRequestDto;
import com.EventManagament.system.adapters.driving.handler.IWeddingHandler;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class WeddingMutation implements GraphQLMutationResolver {

    @Autowired
    private IWeddingHandler weddingHandler;


    public void createWedding(WeddingRequestDto weddingRequestDto){
        weddingHandler.createWedding(weddingRequestDto);
    }
}
