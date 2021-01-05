package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informação referente a geolocalização informada.
 */
@ApiModel(description = "Informação referente a geolocalização informada.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class GeographicCoordinates   {
  @JsonProperty("latitude")
  private String latitude = null;

  @JsonProperty("longitude")
  private String longitude = null;

  public GeographicCoordinates latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Informação da latitude referente a geolocalização informada.
   * @return latitude
  **/
  @ApiModelProperty(example = "-90.8365180", value = "Informação da latitude referente a geolocalização informada.")
  
  @Pattern(regexp="^-?\\d{1,2}\\.\\d{1,9}$") @Size(max=13)   public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public GeographicCoordinates longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Informação da longitude referente a geolocalização informada.
   * @return longitude
  **/
  @ApiModelProperty(example = "-180.836519", value = "Informação da longitude referente a geolocalização informada.")
  
  @Pattern(regexp="^-?\\d{1,3}\\.\\d{1,8}$") @Size(max=13)   public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicCoordinates geographicCoordinates = (GeographicCoordinates) o;
    return Objects.equals(this.latitude, geographicCoordinates.latitude) &&
        Objects.equals(this.longitude, geographicCoordinates.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicCoordinates {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
