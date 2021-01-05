package com.pedentello.openbanking.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BranchIdentification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class BranchIdentification   {
  /**
   *  > Tipo da dependência, segundo a regulamentação do Bacen,  na Resolução Nº 4072, de 26 de abril de 2012: Dependência de instituições financeiras e demais instituições, autorizadas a funcionar pelo Banco Central do Brasil, destinada à prática das atividades para as quais a instituição esteja regularmente habilitada.  * `AGENCIA`: Agência é a dependência destinada ao atendimento aos clientes, ao público em geral e aos associados de cooperativas de crédito, no exercício de atividades da instituição, não podendo ser móvel ou transitória;  * `POSTO_ATENDIMENTO`: Posto de Atendimento é a dependência subordinada a agência  ou à sede da instituição financeira, destinada ao atendimento ao público no exercício de uma ou mais de suas atividades, podendo ser fixo ou móvel. Segundo Art.15. Os Postos de Atendimento Bancário (PAB), Postos Avançados de Atendimento (PAA), Postos de Atendimento Transitórios (PAT), Postos de Compra de Ouro (PCO), Postos de Atendimento Cooperativo (PAC), Postos de Atendimento de Microcrédito (PAM), Postos Bancários de Arrecadação e Pagamento (PAP) e os Postos de Câmbio atualmente em funcionamento serão considerados PA.  * `POSTO_ATENDIMENTO_ELETRONICO`: Posto de Atendimento Eletrônico é a dependência constituída por um ou mais terminais de autoatendimento, subordinada a agência ou à sede da instituição, destinada à prestação de serviços por meio eletrônico, podendo ser fixo ou móvel, permanente ou transitório  * `UNIDADE_ADMINISTRATIVA_DESMEMBRADA `: Unidade Administrativa Desmembrada (UAD) segundo a Resolução 4072 , BCB, 2012, no Art. 8º \"... é dependência destinada à execução de atividades administrativas da instituição, vedado o atendimento ao público\"
   */
  public enum TypeEnum {
    AGENCIA("AGENCIA"),
    
    POSTO_ATENDIMENTO("POSTO_ATENDIMENTO"),
    
    POSTO_ATENDIMENTO_ELETRONICO("POSTO_ATENDIMENTO_ELETRONICO"),
    
    UNIDADE_ADMINISTRATIVA_DESMEMBRADA("UNIDADE_ADMINISTRATIVA_DESMEMBRADA");

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

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("checkDigit")
  private String checkDigit = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("relatedBranch")
  private String relatedBranch = null;

  @JsonProperty("openingDate")
  private String openingDate = null;

  public BranchIdentification type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   *  > Tipo da dependência, segundo a regulamentação do Bacen,  na Resolução Nº 4072, de 26 de abril de 2012: Dependência de instituições financeiras e demais instituições, autorizadas a funcionar pelo Banco Central do Brasil, destinada à prática das atividades para as quais a instituição esteja regularmente habilitada.  * `AGENCIA`: Agência é a dependência destinada ao atendimento aos clientes, ao público em geral e aos associados de cooperativas de crédito, no exercício de atividades da instituição, não podendo ser móvel ou transitória;  * `POSTO_ATENDIMENTO`: Posto de Atendimento é a dependência subordinada a agência  ou à sede da instituição financeira, destinada ao atendimento ao público no exercício de uma ou mais de suas atividades, podendo ser fixo ou móvel. Segundo Art.15. Os Postos de Atendimento Bancário (PAB), Postos Avançados de Atendimento (PAA), Postos de Atendimento Transitórios (PAT), Postos de Compra de Ouro (PCO), Postos de Atendimento Cooperativo (PAC), Postos de Atendimento de Microcrédito (PAM), Postos Bancários de Arrecadação e Pagamento (PAP) e os Postos de Câmbio atualmente em funcionamento serão considerados PA.  * `POSTO_ATENDIMENTO_ELETRONICO`: Posto de Atendimento Eletrônico é a dependência constituída por um ou mais terminais de autoatendimento, subordinada a agência ou à sede da instituição, destinada à prestação de serviços por meio eletrônico, podendo ser fixo ou móvel, permanente ou transitório  * `UNIDADE_ADMINISTRATIVA_DESMEMBRADA `: Unidade Administrativa Desmembrada (UAD) segundo a Resolução 4072 , BCB, 2012, no Art. 8º \"... é dependência destinada à execução de atividades administrativas da instituição, vedado o atendimento ao público\"
   * @return type
  **/
  @ApiModelProperty(required = true, value = " > Tipo da dependência, segundo a regulamentação do Bacen,  na Resolução Nº 4072, de 26 de abril de 2012: Dependência de instituições financeiras e demais instituições, autorizadas a funcionar pelo Banco Central do Brasil, destinada à prática das atividades para as quais a instituição esteja regularmente habilitada.  * `AGENCIA`: Agência é a dependência destinada ao atendimento aos clientes, ao público em geral e aos associados de cooperativas de crédito, no exercício de atividades da instituição, não podendo ser móvel ou transitória;  * `POSTO_ATENDIMENTO`: Posto de Atendimento é a dependência subordinada a agência  ou à sede da instituição financeira, destinada ao atendimento ao público no exercício de uma ou mais de suas atividades, podendo ser fixo ou móvel. Segundo Art.15. Os Postos de Atendimento Bancário (PAB), Postos Avançados de Atendimento (PAA), Postos de Atendimento Transitórios (PAT), Postos de Compra de Ouro (PCO), Postos de Atendimento Cooperativo (PAC), Postos de Atendimento de Microcrédito (PAM), Postos Bancários de Arrecadação e Pagamento (PAP) e os Postos de Câmbio atualmente em funcionamento serão considerados PA.  * `POSTO_ATENDIMENTO_ELETRONICO`: Posto de Atendimento Eletrônico é a dependência constituída por um ou mais terminais de autoatendimento, subordinada a agência ou à sede da instituição, destinada à prestação de serviços por meio eletrônico, podendo ser fixo ou móvel, permanente ou transitório  * `UNIDADE_ADMINISTRATIVA_DESMEMBRADA `: Unidade Administrativa Desmembrada (UAD) segundo a Resolução 4072 , BCB, 2012, no Art. 8º \"... é dependência destinada à execução de atividades administrativas da instituição, vedado o atendimento ao público\"")
      @NotNull

    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BranchIdentification code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Código identificador da dependência
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Código identificador da dependência")
      @NotNull

  @Pattern(regexp="^\\d{4}$|^NA$") @Size(max=4)   public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BranchIdentification checkDigit(String checkDigit) {
    this.checkDigit = checkDigit;
    return this;
  }

  /**
   * Dígito verificador do código da dependência
   * @return checkDigit
  **/
  @ApiModelProperty(required = true, value = "Dígito verificador do código da dependência")
      @NotNull

  @Pattern(regexp="\\w*\\W*") @Size(max=1)   public String getCheckDigit() {
    return checkDigit;
  }

  public void setCheckDigit(String checkDigit) {
    this.checkDigit = checkDigit;
  }

  public BranchIdentification name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome da dependência
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Nome da dependência")
      @NotNull

  @Pattern(regexp="\\w*\\W*") @Size(max=100)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BranchIdentification relatedBranch(String relatedBranch) {
    this.relatedBranch = relatedBranch;
    return this;
  }

  /**
   * Código da agência vinculada ao Posto de Atendimento - se aplicável
   * @return relatedBranch
  **/
  @ApiModelProperty(value = "Código da agência vinculada ao Posto de Atendimento - se aplicável")
  
  @Pattern(regexp="^\\d{4}$") @Size(max=4)   public String getRelatedBranch() {
    return relatedBranch;
  }

  public void setRelatedBranch(String relatedBranch) {
    this.relatedBranch = relatedBranch;
  }

  public BranchIdentification openingDate(String openingDate) {
    this.openingDate = openingDate;
    return this;
  }

  /**
   * Data de abertura da dependência (uma string com data conforme especificação RFC-3339. p.ex. 2014-03-19)
   * @return openingDate
  **/
  @ApiModelProperty(value = "Data de abertura da dependência (uma string com data conforme especificação RFC-3339. p.ex. 2014-03-19)")
  
  @Pattern(regexp="^(\\d{4})-(1[0-2]|0?[1-9])-(3[01]|[12][0-9]|0?[1-9])$") @Size(max=10)   public String getOpeningDate() {
    return openingDate;
  }

  public void setOpeningDate(String openingDate) {
    this.openingDate = openingDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchIdentification branchIdentification = (BranchIdentification) o;
    return Objects.equals(this.type, branchIdentification.type) &&
        Objects.equals(this.code, branchIdentification.code) &&
        Objects.equals(this.checkDigit, branchIdentification.checkDigit) &&
        Objects.equals(this.name, branchIdentification.name) &&
        Objects.equals(this.relatedBranch, branchIdentification.relatedBranch) &&
        Objects.equals(this.openingDate, branchIdentification.openingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code, checkDigit, name, relatedBranch, openingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchIdentification {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    checkDigit: ").append(toIndentedString(checkDigit)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    relatedBranch: ").append(toIndentedString(relatedBranch)).append("\n");
    sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
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
