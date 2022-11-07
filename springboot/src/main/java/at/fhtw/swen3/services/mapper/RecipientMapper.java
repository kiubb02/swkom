package at.fhtw.swen3.services.mapper;
import at.fhtw.swen3.persistence.entity.RecipientEntity;
import org.mapstruct.Mapper;
import at.fhtw.swen3.services.dto.Recipient;

// id, name, street, postal code, city country
@Mapper
public interface RecipientMapper {
    Recipient mapToTarget(RecipientEntity recipient);
    RecipientEntity mapToSource(Recipient recipient);
}
