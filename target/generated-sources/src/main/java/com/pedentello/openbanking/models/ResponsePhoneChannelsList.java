package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.pedentello.openbanking.models.Links;
import com.pedentello.openbanking.models.Meta;
import com.pedentello.openbanking.models.ResponsePhoneChannelsListData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponsePhoneChannelsList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class ResponsePhoneChannelsList   {
  @JsonProperty("data")
  private ResponsePhoneChannelsListData data = null;

  @JsonProperty("links")
  private Links links = null;

  @JsonProperty("meta")
  private Meta meta = null;

  public ResponsePhoneChannelsList data(ResponsePhoneChannelsListData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public ResponsePhoneChannelsListData getData() {
    return data;
  }

  public void setData(ResponsePhoneChannelsListData data) {
    this.data = data;
  }

  public ResponsePhoneChannelsList links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public ResponsePhoneChannelsList meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsePhoneChannelsList responsePhoneChannelsList = (ResponsePhoneChannelsList) o;
    return Objects.equals(this.data, responsePhoneChannelsList.data) &&
        Objects.equals(this.links, responsePhoneChannelsList.links) &&
        Objects.equals(this.meta, responsePhoneChannelsList.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePhoneChannelsList {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
