package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.CNPJ;
import com.pedentello.openbanking.models.PhoneChannel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PhoneChannelsCompany
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class PhoneChannelsCompany extends CNPJ  {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("urlComplementaryList")
  private String urlComplementaryList = null;

  @JsonProperty("phoneChannels")
  @Valid
  private List<PhoneChannel> phoneChannels = new ArrayList<PhoneChannel>();

  public PhoneChannelsCompany name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome da Instituição, pertencente à organização, responsável pelo Canal Telefônico.
   * @return name
  **/
  @ApiModelProperty(example = "Empresa da Marca A", required = true, value = "Nome da Instituição, pertencente à organização, responsável pelo Canal Telefônico.")
      @NotNull

  @Pattern(regexp="\\w*\\W*") @Size(max=80)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PhoneChannelsCompany urlComplementaryList(String urlComplementaryList) {
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

  public PhoneChannelsCompany phoneChannels(List<PhoneChannel> phoneChannels) {
    this.phoneChannels = phoneChannels;
    return this;
  }

  public PhoneChannelsCompany addPhoneChannelsItem(PhoneChannel phoneChannelsItem) {
    this.phoneChannels.add(phoneChannelsItem);
    return this;
  }

  /**
   * Lista  de canais de atendimento telefônico
   * @return phoneChannels
  **/
  @ApiModelProperty(required = true, value = "Lista  de canais de atendimento telefônico")
      @NotNull
    @Valid
  @Size(min=1)   public List<PhoneChannel> getPhoneChannels() {
    return phoneChannels;
  }

  public void setPhoneChannels(List<PhoneChannel> phoneChannels) {
    this.phoneChannels = phoneChannels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneChannelsCompany phoneChannelsCompany = (PhoneChannelsCompany) o;
    return Objects.equals(this.name, phoneChannelsCompany.name) &&
        Objects.equals(this.urlComplementaryList, phoneChannelsCompany.urlComplementaryList) &&
        Objects.equals(this.phoneChannels, phoneChannelsCompany.phoneChannels) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, urlComplementaryList, phoneChannels, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneChannelsCompany {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    urlComplementaryList: ").append(toIndentedString(urlComplementaryList)).append("\n");
    sb.append("    phoneChannels: ").append(toIndentedString(phoneChannels)).append("\n");
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
