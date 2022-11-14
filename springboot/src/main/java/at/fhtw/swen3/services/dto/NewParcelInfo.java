package at.fhtw.swen3.services.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.extern.slf4j.Slf4j;


import javax.annotation.Generated;

/**
 * NewParcelInfo
 */
@Slf4j
@JsonTypeName("newParcelInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-24T14:48:00.085786Z[Etc/UTC]")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class NewParcelInfo {

  @JsonProperty("trackingId")
  private String trackingId;

  public NewParcelInfo trackingId(String trackingId) {
    this.trackingId = trackingId;
    log.info("tracking id set to {}", this.trackingId);
    return this;
  }

  /**
   * The tracking ID of the parcel. 
   * @return trackingId
  */
  @Pattern(regexp = "^[A-Z0-9]{9}$") 
  @Schema(name = "trackingId", example = "PYJRB4HZ6", description = "The tracking ID of the parcel. ", required = false)
  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
    log.info("tracking id set to {}", this.trackingId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewParcelInfo newParcelInfo = (NewParcelInfo) o;
    return Objects.equals(this.trackingId, newParcelInfo.trackingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewParcelInfo {\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("}");
    log.info("string builder:\n{}", sb);
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

