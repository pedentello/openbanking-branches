package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.Branch;
import com.pedentello.openbanking.models.CNPJ;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BranchesCompany
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class BranchesCompany extends CNPJ  {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("cnpjNumber")
  private String cnpjNumber = null;

  @JsonProperty("urlComplementaryList")
  private String urlComplementaryList = null;

  @JsonProperty("branches")
  @Valid
  private List<Branch> branches = null;

  public BranchesCompany name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

  @Pattern(regexp="\\w*\\W*") @Size(max=80)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BranchesCompany cnpjNumber(String cnpjNumber) {
    this.cnpjNumber = cnpjNumber;
    return this;
  }

  /**
   * Número completo do CNPJ da instituição responsável pela dependência - o CNPJ corresponde ao número de inscrição no Cadastro de Pessoa Jurídica. Deve-se ter apenas os números do CNPJ, sem máscara 
   * @return cnpjNumber
  **/
  @ApiModelProperty(example = "45086338000178", required = true, value = "Número completo do CNPJ da instituição responsável pela dependência - o CNPJ corresponde ao número de inscrição no Cadastro de Pessoa Jurídica. Deve-se ter apenas os números do CNPJ, sem máscara ")
      @NotNull

  @Pattern(regexp="^(\\d{14})$|^NA$") @Size(min=14,max=14)   public String getCnpjNumber() {
    return cnpjNumber;
  }

  public void setCnpjNumber(String cnpjNumber) {
    this.cnpjNumber = cnpjNumber;
  }

  public BranchesCompany urlComplementaryList(String urlComplementaryList) {
    this.urlComplementaryList = urlComplementaryList;
    return this;
  }

  /**
   * Get urlComplementaryList
   * @return urlComplementaryList
  **/
  @ApiModelProperty(example = "https://example.com/mobile-banking", value = "")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=1024)   public String getUrlComplementaryList() {
    return urlComplementaryList;
  }

  public void setUrlComplementaryList(String urlComplementaryList) {
    this.urlComplementaryList = urlComplementaryList;
  }

  public BranchesCompany branches(List<Branch> branches) {
    this.branches = branches;
    return this;
  }

  public BranchesCompany addBranchesItem(Branch branchesItem) {
    if (this.branches == null) {
      this.branches = new ArrayList<Branch>();
    }
    this.branches.add(branchesItem);
    return this;
  }

  /**
   * Lista de Dependências de uma Instituição
   * @return branches
  **/
  @ApiModelProperty(value = "Lista de Dependências de uma Instituição")
      @Valid
  @Size(min=1)   public List<Branch> getBranches() {
    return branches;
  }

  public void setBranches(List<Branch> branches) {
    this.branches = branches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchesCompany branchesCompany = (BranchesCompany) o;
    return Objects.equals(this.name, branchesCompany.name) &&
        Objects.equals(this.cnpjNumber, branchesCompany.cnpjNumber) &&
        Objects.equals(this.urlComplementaryList, branchesCompany.urlComplementaryList) &&
        Objects.equals(this.branches, branchesCompany.branches) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, cnpjNumber, urlComplementaryList, branches, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchesCompany {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cnpjNumber: ").append(toIndentedString(cnpjNumber)).append("\n");
    sb.append("    urlComplementaryList: ").append(toIndentedString(urlComplementaryList)).append("\n");
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
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
