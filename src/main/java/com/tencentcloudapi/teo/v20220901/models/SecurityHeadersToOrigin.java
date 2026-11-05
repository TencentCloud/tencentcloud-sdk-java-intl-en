/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityHeadersToOrigin extends AbstractModel {

    /**
    * <p>Configuration of origin request headers for Bot identification information. Valid values:<ul><li>`EO-Bot-Botnet-ID`: Identifier generated based on Bot request characteristics.</li></ul></p>
    */
    @SerializedName("BotIdentificationHeaders")
    @Expose
    private String [] BotIdentificationHeaders;

    /**
    * <p>Configuration of origin request headers for identification results from the Advanced Bot Management module. Valid values:<ul><li>`EO-Bot-Client-Attestation`: Advanced Bot Management - Authentication ticket verification result from the Client Attestation module;</li><li>`EO-Bot-Client-Risk`: Advanced Bot Management - Device risk assessment result from the Client Attestation module;</li><li>`EO-Bot-Intelligence`: Advanced Bot Management - Identification result from the Bot Intelligence Analysis module;</li><li>`EO-Bot-IP-Reputation`: Advanced Bot Management - Identification result from Client Reputation module;</li><li>`EO-Bot-Known-Tool`: Advanced Bot Management - Basic Feature Management - Identification result from the UA Feature Rule module;</li><li>`EO-Bot-Search-Engine`: Advanced Bot Management - Basic Feature Management - Identification result from the Search Engine Rule module;</li><li>`EO-Bot-Source-IDC`: Advanced Bot Management - Basic Feature Management - Identification result from the IDC Rule module;</li><li>`EO-Bot-User-Risk`: Advanced Bot Management - Account risk assessment result from the Client Attestation module.</li></ul></p>
    */
    @SerializedName("BotManagementHeaders")
    @Expose
    private String [] BotManagementHeaders;

    /**
    * <p>Configuration of origin request headers for client fingerprint information. Valid values:<ul><li>`EO-Bot-Fingerprint`: Client fingerprint information.</li></ul></p>
    */
    @SerializedName("ClientFingerprintHeaders")
    @Expose
    private String [] ClientFingerprintHeaders;

    /**
     * Get <p>Configuration of origin request headers for Bot identification information. Valid values:<ul><li>`EO-Bot-Botnet-ID`: Identifier generated based on Bot request characteristics.</li></ul></p> 
     * @return BotIdentificationHeaders <p>Configuration of origin request headers for Bot identification information. Valid values:<ul><li>`EO-Bot-Botnet-ID`: Identifier generated based on Bot request characteristics.</li></ul></p>
     */
    public String [] getBotIdentificationHeaders() {
        return this.BotIdentificationHeaders;
    }

    /**
     * Set <p>Configuration of origin request headers for Bot identification information. Valid values:<ul><li>`EO-Bot-Botnet-ID`: Identifier generated based on Bot request characteristics.</li></ul></p>
     * @param BotIdentificationHeaders <p>Configuration of origin request headers for Bot identification information. Valid values:<ul><li>`EO-Bot-Botnet-ID`: Identifier generated based on Bot request characteristics.</li></ul></p>
     */
    public void setBotIdentificationHeaders(String [] BotIdentificationHeaders) {
        this.BotIdentificationHeaders = BotIdentificationHeaders;
    }

    /**
     * Get <p>Configuration of origin request headers for identification results from the Advanced Bot Management module. Valid values:<ul><li>`EO-Bot-Client-Attestation`: Advanced Bot Management - Authentication ticket verification result from the Client Attestation module;</li><li>`EO-Bot-Client-Risk`: Advanced Bot Management - Device risk assessment result from the Client Attestation module;</li><li>`EO-Bot-Intelligence`: Advanced Bot Management - Identification result from the Bot Intelligence Analysis module;</li><li>`EO-Bot-IP-Reputation`: Advanced Bot Management - Identification result from Client Reputation module;</li><li>`EO-Bot-Known-Tool`: Advanced Bot Management - Basic Feature Management - Identification result from the UA Feature Rule module;</li><li>`EO-Bot-Search-Engine`: Advanced Bot Management - Basic Feature Management - Identification result from the Search Engine Rule module;</li><li>`EO-Bot-Source-IDC`: Advanced Bot Management - Basic Feature Management - Identification result from the IDC Rule module;</li><li>`EO-Bot-User-Risk`: Advanced Bot Management - Account risk assessment result from the Client Attestation module.</li></ul></p> 
     * @return BotManagementHeaders <p>Configuration of origin request headers for identification results from the Advanced Bot Management module. Valid values:<ul><li>`EO-Bot-Client-Attestation`: Advanced Bot Management - Authentication ticket verification result from the Client Attestation module;</li><li>`EO-Bot-Client-Risk`: Advanced Bot Management - Device risk assessment result from the Client Attestation module;</li><li>`EO-Bot-Intelligence`: Advanced Bot Management - Identification result from the Bot Intelligence Analysis module;</li><li>`EO-Bot-IP-Reputation`: Advanced Bot Management - Identification result from Client Reputation module;</li><li>`EO-Bot-Known-Tool`: Advanced Bot Management - Basic Feature Management - Identification result from the UA Feature Rule module;</li><li>`EO-Bot-Search-Engine`: Advanced Bot Management - Basic Feature Management - Identification result from the Search Engine Rule module;</li><li>`EO-Bot-Source-IDC`: Advanced Bot Management - Basic Feature Management - Identification result from the IDC Rule module;</li><li>`EO-Bot-User-Risk`: Advanced Bot Management - Account risk assessment result from the Client Attestation module.</li></ul></p>
     */
    public String [] getBotManagementHeaders() {
        return this.BotManagementHeaders;
    }

    /**
     * Set <p>Configuration of origin request headers for identification results from the Advanced Bot Management module. Valid values:<ul><li>`EO-Bot-Client-Attestation`: Advanced Bot Management - Authentication ticket verification result from the Client Attestation module;</li><li>`EO-Bot-Client-Risk`: Advanced Bot Management - Device risk assessment result from the Client Attestation module;</li><li>`EO-Bot-Intelligence`: Advanced Bot Management - Identification result from the Bot Intelligence Analysis module;</li><li>`EO-Bot-IP-Reputation`: Advanced Bot Management - Identification result from Client Reputation module;</li><li>`EO-Bot-Known-Tool`: Advanced Bot Management - Basic Feature Management - Identification result from the UA Feature Rule module;</li><li>`EO-Bot-Search-Engine`: Advanced Bot Management - Basic Feature Management - Identification result from the Search Engine Rule module;</li><li>`EO-Bot-Source-IDC`: Advanced Bot Management - Basic Feature Management - Identification result from the IDC Rule module;</li><li>`EO-Bot-User-Risk`: Advanced Bot Management - Account risk assessment result from the Client Attestation module.</li></ul></p>
     * @param BotManagementHeaders <p>Configuration of origin request headers for identification results from the Advanced Bot Management module. Valid values:<ul><li>`EO-Bot-Client-Attestation`: Advanced Bot Management - Authentication ticket verification result from the Client Attestation module;</li><li>`EO-Bot-Client-Risk`: Advanced Bot Management - Device risk assessment result from the Client Attestation module;</li><li>`EO-Bot-Intelligence`: Advanced Bot Management - Identification result from the Bot Intelligence Analysis module;</li><li>`EO-Bot-IP-Reputation`: Advanced Bot Management - Identification result from Client Reputation module;</li><li>`EO-Bot-Known-Tool`: Advanced Bot Management - Basic Feature Management - Identification result from the UA Feature Rule module;</li><li>`EO-Bot-Search-Engine`: Advanced Bot Management - Basic Feature Management - Identification result from the Search Engine Rule module;</li><li>`EO-Bot-Source-IDC`: Advanced Bot Management - Basic Feature Management - Identification result from the IDC Rule module;</li><li>`EO-Bot-User-Risk`: Advanced Bot Management - Account risk assessment result from the Client Attestation module.</li></ul></p>
     */
    public void setBotManagementHeaders(String [] BotManagementHeaders) {
        this.BotManagementHeaders = BotManagementHeaders;
    }

    /**
     * Get <p>Configuration of origin request headers for client fingerprint information. Valid values:<ul><li>`EO-Bot-Fingerprint`: Client fingerprint information.</li></ul></p> 
     * @return ClientFingerprintHeaders <p>Configuration of origin request headers for client fingerprint information. Valid values:<ul><li>`EO-Bot-Fingerprint`: Client fingerprint information.</li></ul></p>
     */
    public String [] getClientFingerprintHeaders() {
        return this.ClientFingerprintHeaders;
    }

    /**
     * Set <p>Configuration of origin request headers for client fingerprint information. Valid values:<ul><li>`EO-Bot-Fingerprint`: Client fingerprint information.</li></ul></p>
     * @param ClientFingerprintHeaders <p>Configuration of origin request headers for client fingerprint information. Valid values:<ul><li>`EO-Bot-Fingerprint`: Client fingerprint information.</li></ul></p>
     */
    public void setClientFingerprintHeaders(String [] ClientFingerprintHeaders) {
        this.ClientFingerprintHeaders = ClientFingerprintHeaders;
    }

    public SecurityHeadersToOrigin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityHeadersToOrigin(SecurityHeadersToOrigin source) {
        if (source.BotIdentificationHeaders != null) {
            this.BotIdentificationHeaders = new String[source.BotIdentificationHeaders.length];
            for (int i = 0; i < source.BotIdentificationHeaders.length; i++) {
                this.BotIdentificationHeaders[i] = new String(source.BotIdentificationHeaders[i]);
            }
        }
        if (source.BotManagementHeaders != null) {
            this.BotManagementHeaders = new String[source.BotManagementHeaders.length];
            for (int i = 0; i < source.BotManagementHeaders.length; i++) {
                this.BotManagementHeaders[i] = new String(source.BotManagementHeaders[i]);
            }
        }
        if (source.ClientFingerprintHeaders != null) {
            this.ClientFingerprintHeaders = new String[source.ClientFingerprintHeaders.length];
            for (int i = 0; i < source.ClientFingerprintHeaders.length; i++) {
                this.ClientFingerprintHeaders[i] = new String(source.ClientFingerprintHeaders[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BotIdentificationHeaders.", this.BotIdentificationHeaders);
        this.setParamArraySimple(map, prefix + "BotManagementHeaders.", this.BotManagementHeaders);
        this.setParamArraySimple(map, prefix + "ClientFingerprintHeaders.", this.ClientFingerprintHeaders);

    }
}

