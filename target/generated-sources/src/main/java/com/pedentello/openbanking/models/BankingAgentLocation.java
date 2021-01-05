package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.BankingAgentAvailability;
import com.pedentello.openbanking.models.BankingAgentPostalAddress;
import com.pedentello.openbanking.models.Phone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingAgentLocation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class BankingAgentLocation   {
  @JsonProperty("postalAddress")
  private BankingAgentPostalAddress postalAddress = null;

  @JsonProperty("availability")
  private BankingAgentAvailability availability = null;

  @JsonProperty("phones")
  @Valid
  private List<Phone> phones = null;

  public BankingAgentLocation postalAddress(BankingAgentPostalAddress postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Get postalAddress
   * @return postalAddress
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public BankingAgentPostalAddress getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(BankingAgentPostalAddress postalAddress) {
    this.postalAddress = postalAddress;
  }

  public BankingAgentLocation availability(BankingAgentAvailability availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public BankingAgentAvailability getAvailability() {
    return availability;
  }

  public void setAvailability(BankingAgentAvailability availability) {
    this.availability = availability;
  }

  public BankingAgentLocation phones(List<Phone> phones) {
    this.phones = phones;
    return this;
  }

  public BankingAgentLocation addPhonesItem(Phone phonesItem) {
    if (this.phones == null) {
      this.phones = new ArrayList<Phone>();
    }
    this.phones.add(phonesItem);
    return this;
  }

  /**
   * Get phones
   * @return phones
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Phone> getPhones() {
    return phones;
  }

  public void setPhones(List<Phone> phones) {
    this.phones = phones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingAgentLocation bankingAgentLocation = (BankingAgentLocation) o;
    return Objects.equals(this.postalAddress, bankingAgentLocation.postalAddress) &&
        Objects.equals(this.availability, bankingAgentLocation.availability) &&
        Objects.equals(this.phones, bankingAgentLocation.phones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postalAddress, availability, phones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingAgentLocation {\n");
    
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
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
