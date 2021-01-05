package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.PhoneChannelsCompany;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PhoneChannelsBrand
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class PhoneChannelsBrand   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("companies")
  @Valid
  private List<PhoneChannelsCompany> companies = new ArrayList<PhoneChannelsCompany>();

  public PhoneChannelsBrand name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome da Marca reportada pelo participante do Open Banking. O conceito a que se refere a 'marca' utilizada está em definição pelos participantes.
   * @return name
  **/
  @ApiModelProperty(example = "Marca A", required = true, value = "Nome da Marca reportada pelo participante do Open Banking. O conceito a que se refere a 'marca' utilizada está em definição pelos participantes.")
      @NotNull

  @Pattern(regexp="\\w*\\W*") @Size(max=80)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PhoneChannelsBrand companies(List<PhoneChannelsCompany> companies) {
    this.companies = companies;
    return this;
  }

  public PhoneChannelsBrand addCompaniesItem(PhoneChannelsCompany companiesItem) {
    this.companies.add(companiesItem);
    return this;
  }

  /**
   * Lista de instituições pertencentes à marca
   * @return companies
  **/
  @ApiModelProperty(required = true, value = "Lista de instituições pertencentes à marca")
      @NotNull
    @Valid
  @Size(min=1)   public List<PhoneChannelsCompany> getCompanies() {
    return companies;
  }

  public void setCompanies(List<PhoneChannelsCompany> companies) {
    this.companies = companies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneChannelsBrand phoneChannelsBrand = (PhoneChannelsBrand) o;
    return Objects.equals(this.name, phoneChannelsBrand.name) &&
        Objects.equals(this.companies, phoneChannelsBrand.companies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, companies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneChannelsBrand {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    companies: ").append(toIndentedString(companies)).append("\n");
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
