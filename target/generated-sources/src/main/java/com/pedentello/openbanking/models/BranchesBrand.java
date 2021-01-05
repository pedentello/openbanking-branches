package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.BranchesCompany;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BranchesBrand
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class BranchesBrand   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("companies")
  @Valid
  private List<BranchesCompany> companies = new ArrayList<BranchesCompany>();

  public BranchesBrand name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome da Marca reportada pelo participante do Open Banking. O conceito a que se refere a 'marca' é em essência uma promessa da empresa em fornecer uma série específica de atributos, benefícios e serviços uniformes aos clientes.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nome da Marca reportada pelo participante do Open Banking. O conceito a que se refere a 'marca' é em essência uma promessa da empresa em fornecer uma série específica de atributos, benefícios e serviços uniformes aos clientes.")
      @NotNull

  @Pattern(regexp="\\w*\\W*") @Size(max=80)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BranchesBrand companies(List<BranchesCompany> companies) {
    this.companies = companies;
    return this;
  }

  public BranchesBrand addCompaniesItem(BranchesCompany companiesItem) {
    this.companies.add(companiesItem);
    return this;
  }

  /**
   * Companies traz uma lista de todas as instuituições da Marca.
   * @return companies
  **/
  @ApiModelProperty(required = true, value = "Companies traz uma lista de todas as instuituições da Marca.")
      @NotNull
    @Valid
  @Size(min=1)   public List<BranchesCompany> getCompanies() {
    return companies;
  }

  public void setCompanies(List<BranchesCompany> companies) {
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
    BranchesBrand branchesBrand = (BranchesBrand) o;
    return Objects.equals(this.name, branchesBrand.name) &&
        Objects.equals(this.companies, branchesBrand.companies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, companies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchesBrand {\n");
    
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
