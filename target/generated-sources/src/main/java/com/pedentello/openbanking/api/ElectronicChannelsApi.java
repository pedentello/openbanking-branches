/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.pedentello.openbanking.api;

import com.pedentello.openbanking.models.ResponseElectronicChannelsList;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-01-05T11:32:28.793787-03:00[America/Sao_Paulo]")
@Api(value = "electronic-channels", description = "the electronic-channels API")
public interface ElectronicChannelsApi {

    @ApiOperation(value = "Obtém a lista de canais eletrônicos de atendimento da instituição financeira.", nickname = "getElectronicChannels", notes = "Método para obter a lista de canais eletrônicos de atendimento da instituição financeira.", response = ResponseElectronicChannelsList.class, tags={ "Channels", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Lista de canais eletrônicos de atendimento obtida com sucesso.", response = ResponseElectronicChannelsList.class) })
    @RequestMapping(value = "/electronic-channels",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ResponseElectronicChannelsList> getElectronicChannels();

}
