package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ElectronicChannelIdentification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class ElectronicChannelIdentification   {
  /**
   * Tipo de canal de atendimento eletrônico
   */
  public enum TypeEnum {
    INTERNET_BANKING("INTERNET_BANKING"),
    
    MOBILE_BANKING("MOBILE_BANKING"),
    
    SAC("SAC"),
    
    OUVIDORIA("OUVIDORIA"),
    
    CHAT("CHAT"),
    
    OUTROS("OUTROS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("additionalInfo")
  private String additionalInfo = null;

  @JsonProperty("urls")
  @Valid
  private List<String> urls = new ArrayList<String>();

  public ElectronicChannelIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Tipo de canal de atendimento eletrônico
   * @return type
  **/
  @ApiModelProperty(example = "CHAT", required = true, value = "Tipo de canal de atendimento eletrônico")
      @NotNull

    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ElectronicChannelIdentification additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Campo de texto livre para descrever complementação de informações necessárias. De preenchimento obrigatório para  o tipo de canal de atendimento 'OUTROS' Restrição: Preenchimento obrigatório para o tipo de canal de atendimento 'OUTROS' 
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "Campo de texto livre para descrever complementação de informações necessárias. De preenchimento obrigatório para  o tipo de canal de atendimento 'OUTROS' Restrição: Preenchimento obrigatório para o tipo de canal de atendimento 'OUTROS' ")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=300)   public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public ElectronicChannelIdentification urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public ElectronicChannelIdentification addUrlsItem(String urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

  /**
   * Lista das URLs que atendem um tipo de canal eletrônico selecionado
   * @return urls
  **/
  @ApiModelProperty(required = true, value = "Lista das URLs que atendem um tipo de canal eletrônico selecionado")
      @NotNull

  @Size(min=1)   public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElectronicChannelIdentification electronicChannelIdentification = (ElectronicChannelIdentification) o;
    return Objects.equals(this.type, electronicChannelIdentification.type) &&
        Objects.equals(this.additionalInfo, electronicChannelIdentification.additionalInfo) &&
        Objects.equals(this.urls, electronicChannelIdentification.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, additionalInfo, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectronicChannelIdentification {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
