package com.EventManagament.system.adapters.driving.GraphQL;

import com.EventManagament.system.adapters.driving.dto.response.WeddingResponseDto;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class WeddingQuery implements GraphQLQueryResolver {

    public Optional<WeddingResponseDto> getWedding(final int id){

    }
}
