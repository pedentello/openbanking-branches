package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.CNPJ;
import com.pedentello.openbanking.models.ElectronicChannel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ElectronicChannelsCompanies
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class ElectronicChannelsCompanies extends CNPJ  {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("urlComplementaryList")
  private String urlComplementaryList = null;

  @JsonProperty("electronicChannels")
  @Valid
  private List<ElectronicChannel> electronicChannels = new ArrayList<ElectronicChannel>();

  public ElectronicChannelsCompanies name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome da marca selecionada pela Organização proprietária da dependência (titular).
   * @return name
  **/
  @ApiModelProperty(example = "Empresa da Marca A", required = true, value = "Nome da marca selecionada pela Organização proprietária da dependência (titular).")
      @NotNull

  @Pattern(regexp="\\w*\\W*") @Size(max=80)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ElectronicChannelsCompanies urlComplementaryList(String urlComplementaryList) {
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

  public ElectronicChannelsCompanies electronicChannels(List<ElectronicChannel> electronicChannels) {
    this.electronicChannels = electronicChannels;
    return this;
  }

  public ElectronicChannelsCompanies addElectronicChannelsItem(ElectronicChannel electronicChannelsItem) {
    this.electronicChannels.add(electronicChannelsItem);
    return this;
  }

  /**
   * Lista  de canais de atendimento eltrônico
   * @return electronicChannels
  **/
  @ApiModelProperty(required = true, value = "Lista  de canais de atendimento eltrônico")
      @NotNull
    @Valid
  @Size(min=1,max=4)   public List<ElectronicChannel> getElectronicChannels() {
    return electronicChannels;
  }

  public void setElectronicChannels(List<ElectronicChannel> electronicChannels) {
    this.electronicChannels = electronicChannels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElectronicChannelsCompanies electronicChannelsCompanies = (ElectronicChannelsCompanies) o;
    return Objects.equals(this.name, electronicChannelsCompanies.name) &&
        Objects.equals(this.urlComplementaryList, electronicChannelsCompanies.urlComplementaryList) &&
        Objects.equals(this.electronicChannels, electronicChannelsCompanies.electronicChannels) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, urlComplementaryList, electronicChannels, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectronicChannelsCompanies {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    urlComplementaryList: ").append(toIndentedString(urlComplementaryList)).append("\n");
    sb.append("    electronicChannels: ").append(toIndentedString(electronicChannels)).append("\n");
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
