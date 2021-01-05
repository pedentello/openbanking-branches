package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.PhoneChannelIdentification;
import com.pedentello.openbanking.models.PhoneChannelService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PhoneChannel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class PhoneChannel   {
  @JsonProperty("identification")
  private PhoneChannelIdentification identification = null;

  @JsonProperty("services")
  @Valid
  private List<PhoneChannelService> services = new ArrayList<PhoneChannelService>();

  public PhoneChannel identification(PhoneChannelIdentification identification) {
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
    public PhoneChannelIdentification getIdentification() {
    return identification;
  }

  public void setIdentification(PhoneChannelIdentification identification) {
    this.identification = identification;
  }

  public PhoneChannel services(List<PhoneChannelService> services) {
    this.services = services;
    return this;
  }

  public PhoneChannel addServicesItem(PhoneChannelService servicesItem) {
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
  @Size(min=1,max=20)   public List<PhoneChannelService> getServices() {
    return services;
  }

  public void setServices(List<PhoneChannelService> services) {
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
    PhoneChannel phoneChannel = (PhoneChannel) o;
    return Objects.equals(this.identification, phoneChannel.identification) &&
        Objects.equals(this.services, phoneChannel.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneChannel {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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
