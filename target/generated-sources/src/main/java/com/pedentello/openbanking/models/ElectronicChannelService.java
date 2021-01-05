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
 * ElectronicChannelService
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
public class ElectronicChannelService   {
  /**
   * Nome dos Serviços efetivamente prestados pelo Canal de Atendimento
   */
  public enum NameEnum {
    ABERTURA_CONTAS_DEPOSITOS_OU_PAGAMENTO_PRE_PAGA("ABERTURA_CONTAS_DEPOSITOS_OU_PAGAMENTO_PRE_PAGA"),
    
    SAQUE_MOEDA_EM_ESPECIE("SAQUE_MOEDA_EM_ESPECIE"),
    
    RECEBIMENTOS_PAGAMENTOS_QUALQUER_NATUREZA("RECEBIMENTOS_PAGAMENTOS_QUALQUER_NATUREZA"),
    
    TRANSFERENCIAS_ELETRONICAS_VISANDO_MOVIMENTACAO_CONTAS_DEPOSITOS_OU_PAGAMENTO_TITULARIDADE_CLIENTES("TRANSFERENCIAS_ELETRONICAS_VISANDO_MOVIMENTACAO_CONTAS_DEPOSITOS_OU_PAGAMENTO_TITULARIDADE_CLIENTES"),
    
    CONSULTA_SALDOS_EXTRATOS_CONTAS_DEPOSITOS_CONTAS_PAGAMENTOS("CONSULTA_SALDOS_EXTRATOS_CONTAS_DEPOSITOS_CONTAS_PAGAMENTOS"),
    
    APLICACOES_RESGATES_INVESTIMENTOS("APLICACOES_RESGATES_INVESTIMENTOS"),
    
    EXECUCAO_ATIVA_PASSIVA_ORDENS_PAGAMENTO_SOLICITACAO_CLIENTES_USUARIOS("EXECUCAO_ATIVA_PASSIVA_ORDENS_PAGAMENTO_SOLICITACAO_CLIENTES_USUARIOS"),
    
    DEPOSITOS_MOEDA_ESPECIE_CHEQUE("DEPOSITOS_MOEDA_ESPECIE_CHEQUE"),
    
    OPERACOES_CREDITO_BEM_COMO_OUTROS_SERVICOS_PRESTADOS_ACOMPANHAMENTO_OPERACAO("OPERACOES_CREDITO_BEM_COMO_OUTROS_SERVICOS_PRESTADOS_ACOMPANHAMENTO_OPERACAO"),
    
    CARTAO_CREDITO("CARTAO_CREDITO"),
    
    SEGUROS("SEGUROS"),
    
    OPERACOES_ARRENDAMENTO_MERCANTIL("OPERACOES_ARRENDAMENTO_MERCANTIL"),
    
    ABERTURA_CONTA_PAGAMENTO_POS_PAGA("ABERTURA_CONTA_PAGAMENTO_POS_PAGA"),
    
    COMPRA_VENDA_MOEDA_ESTRANGEIRA_ESPECIE("COMPRA_VENDA_MOEDA_ESTRANGEIRA_ESPECIE"),
    
    COMPRA_VENDA_CHEQUE_CHEQUE_VIAGEM_BEM_COMO_CARGA_MOEDA_ESTRANGEIRA_CARTAO_PRE_PAGO("COMPRA_VENDA_CHEQUE_CHEQUE_VIAGEM_BEM_COMO_CARGA_MOEDA_ESTRANGEIRA_CARTAO_PRE_PAGO"),
    
    COMPRA_VENDA_OURO("COMPRA_VENDA_OURO"),
    
    OUTROS_PRODUTOS_SERVICOS("OUTROS_PRODUTOS_SERVICOS"),
    
    CANCELAMENTO("CANCELAMENTO"),
    
    INFORMACOES("INFORMACOES"),
    
    RECLAMACOES("RECLAMACOES");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NameEnum fromValue(String text) {
      for (NameEnum b : NameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("name")
  private NameEnum name = null;

  /**
   * Código dos Serviços efetivamente prestados pelo Canal de Atendimento
   */
  public enum CodeEnum {
    ABRE_CONTA_DEPOSITO_OU_PRE_PAGA("ABRE_CONTA_DEPOSITO_OU_PRE_PAGA"),
    
    SAQUE_MOEDA_ESPECIE("SAQUE_MOEDA_ESPECIE"),
    
    RECEBE_PAGA_QUALQUER_NATUREZA("RECEBE_PAGA_QUALQUER_NATUREZA"),
    
    TRANSFERENCIAS_ELETRONICAS_MOVIMENTA_CONTAS_DEPOSITOS_OU_PAGTO_TITULARES_CLIENTES("TRANSFERENCIAS_ELETRONICAS_MOVIMENTA_CONTAS_DEPOSITOS_OU_PAGTO_TITULARES_CLIENTES"),
    
    CONSULTA_SALDOS_EXTRATOS_CONTAS_DEPOSITOS_PAGTOS("CONSULTA_SALDOS_EXTRATOS_CONTAS_DEPOSITOS_PAGTOS"),
    
    APLICA_RESGATA_INVESTIMENTOS("APLICA_RESGATA_INVESTIMENTOS"),
    
    EXECUCAO_ATIVA_PASSIVA_ORDENS_PAGTO("EXECUCAO_ATIVA_PASSIVA_ORDENS_PAGTO"),
    
    DEPOSITO_MOEDA_ESPECIE_CHEQUE("DEPOSITO_MOEDA_ESPECIE_CHEQUE"),
    
    OPERA_CREDITO_OUTROS_SERVICOS_ACOMPANHA_OPERACAO("OPERA_CREDITO_OUTROS_SERVICOS_ACOMPANHA_OPERACAO"),
    
    CARTAO_CREDITO("CARTAO_CREDITO"),
    
    SEGUROS("SEGUROS"),
    
    OPERA_ARRENDAMENTO_MERCANTIL("OPERA_ARRENDAMENTO_MERCANTIL"),
    
    ABERTURA_CONTA_PAGAMENTO_POS_PAGA("ABERTURA_CONTA_PAGAMENTO_POS_PAGA"),
    
    COMPRA_VENDA_MOEDA_ESTRANGEIRA_ESPECIE("COMPRA_VENDA_MOEDA_ESTRANGEIRA_ESPECIE"),
    
    COMPRA_VENDA_CHEQUE_CHEQUE_VIAGEM_CARGA_MOEDA_ESTRANGEIRA_CARTAO_PRE_PAGO("COMPRA_VENDA_CHEQUE_CHEQUE_VIAGEM_CARGA_MOEDA_ESTRANGEIRA_CARTAO_PRE_PAGO"),
    
    COMPRA_VENDA_OURO("COMPRA_VENDA_OURO"),
    
    OUTROS_PRODUTOS_SERVICOS("OUTROS_PRODUTOS_SERVICOS"),
    
    CANCELAMENTO("CANCELAMENTO"),
    
    INFORMACOES("INFORMACOES"),
    
    RECLAMACOES("RECLAMACOES");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CodeEnum fromValue(String text) {
      for (CodeEnum b : CodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("code")
  private CodeEnum code = null;

  @JsonProperty("additionalInfo")
  private String additionalInfo = null;

  public ElectronicChannelService name(NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * Nome dos Serviços efetivamente prestados pelo Canal de Atendimento
   * @return name
  **/
  @ApiModelProperty(example = "ABERTURA_CONTAS_DEPOSITOS_OU_PAGAMENTO_PRE_PAGA", required = true, value = "Nome dos Serviços efetivamente prestados pelo Canal de Atendimento")
      @NotNull

    public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  public ElectronicChannelService code(CodeEnum code) {
    this.code = code;
    return this;
  }

  /**
   * Código dos Serviços efetivamente prestados pelo Canal de Atendimento
   * @return code
  **/
  @ApiModelProperty(example = "ABRE_CONTA_DEPOSITO_OU_PRE_PAGA", required = true, value = "Código dos Serviços efetivamente prestados pelo Canal de Atendimento")
      @NotNull

    public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public ElectronicChannelService additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Texto livre para complementar informação relativa ao Serviço disponível, quando for selecionada a opção 'OUTROS_PRODUTOS_SERVICOS'
   * @return additionalInfo
  **/
  @ApiModelProperty(example = "SIC", value = "Texto livre para complementar informação relativa ao Serviço disponível, quando for selecionada a opção 'OUTROS_PRODUTOS_SERVICOS'")
  
  @Pattern(regexp="\\w*\\W*") @Size(max=2000)   public String getAdditionalInfo() {
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
    ElectronicChannelService electronicChannelService = (ElectronicChannelService) o;
    return Objects.equals(this.name, electronicChannelService.name) &&
        Objects.equals(this.code, electronicChannelService.code) &&
        Objects.equals(this.additionalInfo, electronicChannelService.additionalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, additionalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectronicChannelService {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
