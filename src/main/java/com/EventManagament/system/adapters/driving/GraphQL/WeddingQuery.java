package com.EventManagament.system.adapters.driving.GraphQL;

import com.EventManagament.system.adapters.driving.dto.response.WeddingResponseDto;
import com.EventManagament.system.adapters.driving.handler.IWeddingQueryHandler;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class WeddingQuery implements GraphQLQueryResolver {
    @Autowired
    private IWeddingQueryHandler weddingQueryHandler;

    @PreAuthorize("hasRole('CLIENT')")
    public WeddingResponseDto getWedding(final int id){
        return weddingQueryHandler.getWedding(id);
    }
}
