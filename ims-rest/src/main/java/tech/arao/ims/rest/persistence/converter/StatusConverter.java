package tech.arao.ims.rest.persistence.converter;

import tech.arao.ims.rest.persistence.model.Status;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class StatusConverter implements AttributeConverter<Status, String> {

    @Override
    public String convertToDatabaseColumn(Status status) {
        if (status == null) return null;
        return status.get();
    }

    @Override
    public Status convertToEntityAttribute(String status) {
        if (status == null) return null;

        return Stream.of(Status.values())
                .filter(s -> s.get().equals(status))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);

    }
}
