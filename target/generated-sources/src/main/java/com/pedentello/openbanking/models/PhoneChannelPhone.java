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
 * PhoneChannelPhone
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class PhoneChannelPhone   {
  @JsonProperty("countryCallingCode")
  private String countryCallingCode = null;

  @JsonProperty("areaCode")
  private String areaCode = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("additionalInfo")
  private String additionalInfo = null;

  public PhoneChannelPhone countryCallingCode(String countryCallingCode) {
    this.countryCallingCode = countryCallingCode;
    return this;
  }

  /**
   * Número de DDI (Discagem Direta Internacional) para telefone de acesso ao Canal - se houver.
   * @return countryCallingCode
  **/
  @ApiModelProperty(example = "55", required = true, value = "Número de DDI (Discagem Direta Internacional) para telefone de acesso ao Canal - se houver.")
      @NotNull

  @Pattern(regexp="^\\d{2}$|^NA$") @Size(max=2)   public String getCountryCallingCode() {
    return countryCallingCode;
  }

  public void setCountryCallingCode(String countryCallingCode) {
    this.countryCallingCode = countryCallingCode;
  }

  public PhoneChannelPhone areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

  /**
   * Número de DDD (Discagem Direta à Distância) para telefone de acesso ao Canal - se houver.
   * @return areaCode
  **/
  @ApiModelProperty(example = "19", required = true, value = "Número de DDD (Discagem Direta à Distância) para telefone de acesso ao Canal - se houver.")
      @NotNull

  @Pattern(regexp="^\\d{2}$|^NA$") @Size(max=2)   public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }

  public PhoneChannelPhone number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Número de telefone de acesso ao canal.
   * @return number
  **/
  @ApiModelProperty(example = "08007787788", required = true, value = "Número de telefone de acesso ao canal.")
      @NotNull

  @Pattern(regexp="^([0-9]{8,11})$|^NA$") @Size(max=13)   public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public PhoneChannelPhone additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @ApiModelProperty(example = "Mensagem complementar necessária para o agrupamento da identificação do telefone.", value = "")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=300)   public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneChannelPhone phoneChannelPhone = (PhoneChannelPhone) o;
    return Objects.equals(this.countryCallingCode, phoneChannelPhone.countryCallingCode) &&
        Objects.equals(this.areaCode, phoneChannelPhone.areaCode) &&
        Objects.equals(this.number, phoneChannelPhone.number) &&
        Objects.equals(this.additionalInfo, phoneChannelPhone.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCallingCode, areaCode, number, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneChannelPhone {\n");
    
    sb.append("    countryCallingCode: ").append(toIndentedString(countryCallingCode)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
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
