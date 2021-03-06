package ch.bfh.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Builder;
import lombok.Value;

import javax.json.bind.annotation.JsonbProperty;
import java.util.Set;

@Value
@Builder
@RegisterForReflection
public class FcmMessage {

    @JsonProperty("registration_ids")
    @JsonbProperty("registration_ids")
    Set<String> registrationIds;
    FcmNotificationBody notification;
}
