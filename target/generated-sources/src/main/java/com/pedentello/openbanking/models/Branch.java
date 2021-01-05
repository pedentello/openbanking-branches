package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.BranchAvailability;
import com.pedentello.openbanking.models.BranchIdentification;
import com.pedentello.openbanking.models.BranchPhone;
import com.pedentello.openbanking.models.BranchPostalAddress;
import com.pedentello.openbanking.models.BranchService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Dependência de instituições financeiras e demais instituições, autorizadas a funcionar pelo Banco Central do Brasil, destinada à prática das atividades para as quais a instituição esteja regularmente habilitada.
 */
@ApiModel(description = "Dependência de instituições financeiras e demais instituições, autorizadas a funcionar pelo Banco Central do Brasil, destinada à prática das atividades para as quais a instituição esteja regularmente habilitada.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class Branch   {
  @JsonProperty("identification")
  private BranchIdentification identification = null;

  @JsonProperty("postalAddresses")
  private BranchPostalAddress postalAddresses = null;

  @JsonProperty("availability")
  private BranchAvailability availability = null;

  @JsonProperty("phones")
  @Valid
  private List<BranchPhone> phones = null;

  @JsonProperty("services")
  @Valid
  private List<BranchService> services = new ArrayList<BranchService>();

  public Branch identification(BranchIdentification identification) {
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
    public BranchIdentification getIdentification() {
    return identification;
  }

  public void setIdentification(BranchIdentification identification) {
    this.identification = identification;
  }

  public Branch postalAddresses(BranchPostalAddress postalAddresses) {
    this.postalAddresses = postalAddresses;
    return this;
  }

  /**
   * Get postalAddresses
   * @return postalAddresses
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BranchPostalAddress getPostalAddresses() {
    return postalAddresses;
  }

  public void setPostalAddresses(BranchPostalAddress postalAddresses) {
    this.postalAddresses = postalAddresses;
  }

  public Branch availability(BranchAvailability availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public BranchAvailability getAvailability() {
    return availability;
  }

  public void setAvailability(BranchAvailability availability) {
    this.availability = availability;
  }

  public Branch phones(List<BranchPhone> phones) {
    this.phones = phones;
    return this;
  }

  public Branch addPhonesItem(BranchPhone phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<BranchPhone>();
    }
    this.phones.add(phonesItem);
    return this;
  }

  /**
   * Lista de telefones da Dependência
   * @return phones
  **/
  @ApiModelProperty(value = "Lista de telefones da Dependência")
      @Valid
  @Size(min=1)   public List<BranchPhone> getPhones() {
    return phones;
  }

  public void setPhones(List<BranchPhone> phones) {
    this.phones = phones;
  }

  public Branch services(List<BranchService> services) {
    this.services = services;
    return this;
  }

  public Branch addServicesItem(BranchService servicesItem) {
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
  @Size(min=1,max=20)   public List<BranchService> getServices() {
    return services;
  }

  public void setServices(List<BranchService> services) {
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
    Branch branch = (Branch) o;
    return Objects.equals(this.identification, branch.identification) &&
        Objects.equals(this.postalAddresses, branch.postalAddresses) &&
        Objects.equals(this.availability, branch.availability) &&
        Objects.equals(this.phones, branch.phones) &&
        Objects.equals(this.services, branch.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, postalAddresses, availability, phones, services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Branch {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    postalAddresses: ").append(toIndentedString(postalAddresses)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
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
