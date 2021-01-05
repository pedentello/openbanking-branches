package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.BankingAgentIdentification;
import com.pedentello.openbanking.models.BankingAgentLocation;
import com.pedentello.openbanking.models.BankingAgentService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingAgent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class BankingAgent   {
  @JsonProperty("identification")
  private BankingAgentIdentification identification = null;

  @JsonProperty("locations")
  @Valid
  private List<BankingAgentLocation> locations = new ArrayList<BankingAgentLocation>();

  @JsonProperty("services")
  @Valid
  private List<BankingAgentService> services = new ArrayList<BankingAgentService>();

  public BankingAgent identification(BankingAgentIdentification identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public BankingAgentIdentification getIdentification() {
    return identification;
  }

  public void setIdentification(BankingAgentIdentification identification) {
    this.identification = identification;
  }

  public BankingAgent locations(List<BankingAgentLocation> locations) {
    this.locations = locations;
    return this;
  }

  public BankingAgent addLocationsItem(BankingAgentLocation locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * Relação de informações referentes as localizações dos Correspondentes bancários.
   * @return locations
  **/
  @ApiModelProperty(required = true, value = "Relação de informações referentes as localizações dos Correspondentes bancários.")
      @NotNull
    @Valid
  @Size(min=1)   public List<BankingAgentLocation> getLocations() {
    return locations;
  }

  public void setLocations(List<BankingAgentLocation> locations) {
    this.locations = locations;
  }

  public BankingAgent services(List<BankingAgentService> services) {
    this.services = services;
    return this;
  }

  public BankingAgent addServicesItem(BankingAgentService servicesItem) {
    this.services.add(servicesItem);
    return this;
  }

  /**
   * Traz a relação de serviços disponbilizados pelo Canal de Atendimento
   * @return services
  **/
  @ApiModelProperty(required = true, value = "Traz a relação de serviços disponbilizados pelo Canal de Atendimento")
      @NotNull
    @Valid
  @Size(min=1,max=20)   public List<BankingAgentService> getServices() {
    return services;
  }

  public void setServices(List<BankingAgentService> services) {
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
    BankingAgent bankingAgent = (BankingAgent) o;
    return Objects.equals(this.identification, bankingAgent.identification) &&
        Objects.equals(this.locations, bankingAgent.locations) &&
        Objects.equals(this.services, bankingAgent.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, locations, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingAgent {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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
