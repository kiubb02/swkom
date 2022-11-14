package at.fhtw.swen3.services.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.extern.slf4j.Slf4j;


import javax.annotation.Generated;

/**
 * Hop
 */
@Slf4j
@JsonIgnoreProperties(
  value = "hopType", // ignore manually set hopType, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the hopType to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "hopType", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Transferwarehouse.class, name = "transferwarehouse"),
  @JsonSubTypes.Type(value = Truck.class, name = "truck"),
  @JsonSubTypes.Type(value = Warehouse.class, name = "warehouse")
})

@JsonTypeName("hop")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-09-24T14:48:00.085786Z[Etc/UTC]")
public class Hop {

  @JsonProperty("hopType")
  private String hopType;

  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  @JsonProperty("processingDelayMins")
  private Integer processingDelayMins;

  @JsonProperty("locationName")
  private String locationName;

  @JsonProperty("locationCoordinates")
  private GeoCoordinate locationCoordinates;

  public Hop hopType(String hopType) {
    this.hopType = hopType;
    log.info("hop type set to {}", this.hopType);
    return this;
  }

  /**
   * Get hopType
   * @return hopType
  */
  @NotNull 
  @Schema(name = "hopType", required = true)
  public String getHopType() {
    return hopType;
  }

  public void setHopType(String hopType) {
    this.hopType = hopType;
    log.info("hop type set to {}", this.hopType);
  }

  public Hop code(String code) {
    this.code = code;
    log.info("hop code set to {}", this.code);
    return this;
  }

  /**
   * Unique CODE of the hop.
   * @return code
  */
  @NotNull @Pattern(regexp = "^[A-Z]{4}\\d{1,4}$") 
  @Schema(name = "code", description = "Unique CODE of the hop.", required = true)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
    log.info("code set to {}", this.code);
  }

  public Hop description(String description) {
    this.description = description;
    log.info("description set to {}", this.description);
    return this;
  }

  /**
   * Description of the hop.
   * @return description
  */
  @NotNull 
  @Schema(name = "description", description = "Description of the hop.", required = true)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
    log.info("description set to {}", this.description);
  }

  public Hop processingDelayMins(Integer processingDelayMins) {
    this.processingDelayMins = processingDelayMins;
    log.info("delay mins set to {}", this.processingDelayMins);
    return this;
  }

  /**
   * Delay processing takes on the hop.
   * @return processingDelayMins
  */
  @NotNull 
  @Schema(name = "processingDelayMins", description = "Delay processing takes on the hop.", required = true)
  public Integer getProcessingDelayMins() {
    return processingDelayMins;
  }

  public void setProcessingDelayMins(Integer processingDelayMins) {
    this.processingDelayMins = processingDelayMins;
    log.info("delaymins set to {}", this.processingDelayMins);
  }

  public Hop locationName(String locationName) {
    this.locationName = locationName;
    log.info("location set to {}", this.locationName);
    return this;
  }

  /**
   * Name of the location (village, city, ..) of the hop.
   * @return locationName
  */
  @NotNull 
  @Schema(name = "locationName", description = "Name of the location (village, city, ..) of the hop.", required = true)
  public String getLocationName() {
    return locationName;
  }

  public void setLocationName(String locationName) {
    this.locationName = locationName;
    log.info("location set to {}", this.locationName);
  }

  public Hop locationCoordinates(GeoCoordinate locationCoordinates) {
    this.locationCoordinates = locationCoordinates;
    log.info("location coordinates set to {}", this.locationCoordinates);
    return this;
  }

  /**
   * Get locationCoordinates
   * @return locationCoordinates
  */
  @NotNull @Valid 
  @Schema(name = "locationCoordinates", required = true)
  public GeoCoordinate getLocationCoordinates() {
    return locationCoordinates;
  }

  public void setLocationCoordinates(GeoCoordinate locationCoordinates) {
    this.locationCoordinates = locationCoordinates;
    log.info("location coordinates set to {}", this.locationCoordinates);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hop hop = (Hop) o;
    return Objects.equals(this.hopType, hop.hopType) &&
        Objects.equals(this.code, hop.code) &&
        Objects.equals(this.description, hop.description) &&
        Objects.equals(this.processingDelayMins, hop.processingDelayMins) &&
        Objects.equals(this.locationName, hop.locationName) &&
        Objects.equals(this.locationCoordinates, hop.locationCoordinates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hopType, code, description, processingDelayMins, locationName, locationCoordinates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hop {\n");
    sb.append("    hopType: ").append(toIndentedString(hopType)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    processingDelayMins: ").append(toIndentedString(processingDelayMins)).append("\n");
    sb.append("    locationName: ").append(toIndentedString(locationName)).append("\n");
    sb.append("    locationCoordinates: ").append(toIndentedString(locationCoordinates)).append("\n");
    sb.append("}");
    log.info("string builder:\n {}", sb);
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

