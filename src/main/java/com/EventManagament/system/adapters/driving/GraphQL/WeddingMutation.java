package com.EventManagament.system.adapters.driving.GraphQL;

import com.EventManagament.system.adapters.driving.WeddingRequestDto;
import com.EventManagament.system.adapters.driving.dto.request.AvailableWeddingRequestDto;
import com.EventManagament.system.adapters.driving.handler.IWeddingMutationHandler;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
@Component
public class WeddingMutation implements GraphQLMutationResolver {
    @Autowired
    private IWeddingMutationHandler weddingHandler;
    @PreAuthorize("hasRole('MANAGER')")
    public void createWedding(WeddingRequestDto weddingRequestDto){
        weddingHandler.createWedding(weddingRequestDto);
    }
    @PreAuthorize("hasRole('MANAGER')")
    public void availableWedding(AvailableWeddingRequestDto availableWeddingRequest) { weddingHandler.availableWedding(availableWeddingRequest);}
}
