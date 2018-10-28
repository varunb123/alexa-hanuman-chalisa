package com.varun.alexa.hanumanchalisa.handler;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;

import java.util.Optional;
import static com.amazon.ask.request.Predicates.requestType;

public class LaunchRequestHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Welcome, You can listen to hanuman chalisa by saying, recite hanuman chalisa";
        String repromptText = "You can listen to hanuman chalisa by saying, recite hanuman chalisa";
        return input.getResponseBuilder()
                .withSimpleCard("Story", speechText)
                .withSpeech(speechText)
                .withReprompt(repromptText)
                .build();
    }

}
