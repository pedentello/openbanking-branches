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
 * SharedAutomatedTellerMachinesCompany
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class SharedAutomatedTellerMachinesCompany   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("urlComplementaryList")
  private String urlComplementaryList = null;

  @JsonProperty("cnpjNumber")
  private String cnpjNumber = null;

  public SharedAutomatedTellerMachinesCompany name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome da Instituição, pertencente à Marca.
   * @return name
  **/
  @ApiModelProperty(example = "Empresa da Organização A", value = "Nome da Instituição, pertencente à Marca.")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=80)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SharedAutomatedTellerMachinesCompany urlComplementaryList(String urlComplementaryList) {
    this.urlComplementaryList = urlComplementaryList;
    return this;
  }

  /**
   * URL de link para lista complementar com os nomes e CNPJs agrupados para o caso instituições ofertantes de produtos e serviços com as mesmas características. 
   * @return urlComplementaryList
  **/
  @ApiModelProperty(example = "https://empresadaorganizacaoa.com/complementarylist", value = "URL de link para lista complementar com os nomes e CNPJs agrupados para o caso instituições ofertantes de produtos e serviços com as mesmas características. ")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=1024)   public String getUrlComplementaryList() {
    return urlComplementaryList;
  }

  public void setUrlComplementaryList(String urlComplementaryList) {
    this.urlComplementaryList = urlComplementaryList;
  }

  public SharedAutomatedTellerMachinesCompany cnpjNumber(String cnpjNumber) {
    this.cnpjNumber = cnpjNumber;
    return this;
  }

  /**
   * Número completo do CNPJ da instituição
   * @return cnpjNumber
  **/
  @ApiModelProperty(example = "50685362000135", value = "Número completo do CNPJ da instituição")
  
  @Pattern(regexp="^(\\d{14})$|^NA$") @Size(max=14)   public String getCnpjNumber() {
    return cnpjNumber;
  }

  public void setCnpjNumber(String cnpjNumber) {
    this.cnpjNumber = cnpjNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedAutomatedTellerMachinesCompany sharedAutomatedTellerMachinesCompany = (SharedAutomatedTellerMachinesCompany) o;
    return Objects.equals(this.name, sharedAutomatedTellerMachinesCompany.name) &&
        Objects.equals(this.urlComplementaryList, sharedAutomatedTellerMachinesCompany.urlComplementaryList) &&
        Objects.equals(this.cnpjNumber, sharedAutomatedTellerMachinesCompany.cnpjNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, urlComplementaryList, cnpjNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedAutomatedTellerMachinesCompany {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    urlComplementaryList: ").append(toIndentedString(urlComplementaryList)).append("\n");
    sb.append("    cnpjNumber: ").append(toIndentedString(cnpjNumber)).append("\n");
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
