package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.ElectronicChannelsCompanies;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ElectronicChannelsBrand
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class ElectronicChannelsBrand   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("companies")
  @Valid
  private List<ElectronicChannelsCompanies> companies = new ArrayList<ElectronicChannelsCompanies>();

  public ElectronicChannelsBrand name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome da marca selecionada pela Organização proprietária da dependência (titular).
   * @return name
  **/
  @ApiModelProperty(example = "Marca A", required = true, value = "Nome da marca selecionada pela Organização proprietária da dependência (titular).")
      @NotNull

  @Pattern(regexp="\\w*\\W*") @Size(max=80)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ElectronicChannelsBrand companies(List<ElectronicChannelsCompanies> companies) {
    this.companies = companies;
    return this;
  }

  public ElectronicChannelsBrand addCompaniesItem(ElectronicChannelsCompanies companiesItem) {
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
  @Size(min=1)   public List<ElectronicChannelsCompanies> getCompanies() {
    return companies;
  }

  public void setCompanies(List<ElectronicChannelsCompanies> companies) {
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
    ElectronicChannelsBrand electronicChannelsBrand = (ElectronicChannelsBrand) o;
    return Objects.equals(this.name, electronicChannelsBrand.name) &&
        Objects.equals(this.companies, electronicChannelsBrand.companies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, companies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectronicChannelsBrand {\n");
    
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
