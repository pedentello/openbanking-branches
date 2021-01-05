package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.SharedAutomatedTellerMachinesAvailability;
import com.pedentello.openbanking.models.SharedAutomatedTellerMachinesIdentification;
import com.pedentello.openbanking.models.SharedAutomatedTellerMachinesPostalAddress;
import com.pedentello.openbanking.models.SharedAutomatedTellerMachinesServices;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SharedAutomatedTellerMachines
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class SharedAutomatedTellerMachines   {
  @JsonProperty("identification")
  private SharedAutomatedTellerMachinesIdentification identification = null;

  @JsonProperty("postalAddress")
  private SharedAutomatedTellerMachinesPostalAddress postalAddress = null;

  @JsonProperty("availability")
  private SharedAutomatedTellerMachinesAvailability availability = null;

  @JsonProperty("services")
  @Valid
  private List<SharedAutomatedTellerMachinesServices> services = null;

  public SharedAutomatedTellerMachines identification(SharedAutomatedTellerMachinesIdentification identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SharedAutomatedTellerMachinesIdentification getIdentification() {
    return identification;
  }

  public void setIdentification(SharedAutomatedTellerMachinesIdentification identification) {
    this.identification = identification;
  }

  public SharedAutomatedTellerMachines postalAddress(SharedAutomatedTellerMachinesPostalAddress postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Get postalAddress
   * @return postalAddress
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SharedAutomatedTellerMachinesPostalAddress getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(SharedAutomatedTellerMachinesPostalAddress postalAddress) {
    this.postalAddress = postalAddress;
  }

  public SharedAutomatedTellerMachines availability(SharedAutomatedTellerMachinesAvailability availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public SharedAutomatedTellerMachinesAvailability getAvailability() {
    return availability;
  }

  public void setAvailability(SharedAutomatedTellerMachinesAvailability availability) {
    this.availability = availability;
  }

  public SharedAutomatedTellerMachines services(List<SharedAutomatedTellerMachinesServices> services) {
    this.services = services;
    return this;
  }

  public SharedAutomatedTellerMachines addServicesItem(SharedAutomatedTellerMachinesServices servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<SharedAutomatedTellerMachinesServices>();
    }
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Get services
   * @return services
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<SharedAutomatedTellerMachinesServices> getServices() {
    return services;
  }

  public void setServices(List<SharedAutomatedTellerMachinesServices> services) {
    this.services = services;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedAutomatedTellerMachines sharedAutomatedTellerMachines = (SharedAutomatedTellerMachines) o;
    return Objects.equals(this.identification, sharedAutomatedTellerMachines.identification) &&
        Objects.equals(this.postalAddress, sharedAutomatedTellerMachines.postalAddress) &&
        Objects.equals(this.availability, sharedAutomatedTellerMachines.availability) &&
        Objects.equals(this.services, sharedAutomatedTellerMachines.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, postalAddress, availability, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedAutomatedTellerMachines {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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
