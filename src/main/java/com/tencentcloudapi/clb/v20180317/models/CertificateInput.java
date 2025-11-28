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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateInput extends AbstractModel {

    /**
    * Authentication type. UNIDIRECTIONAL: one-way authentication; MUTUAL: mutual authentication.
Default value: UNIDIRECTIONAL.
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * Whether to enable client authentication for mutual authentication. ON: enable it; OPTIONAL: client certificate not required. Default value: ON.
    */
    @SerializedName("SSLVerifyClient")
    @Expose
    private String SSLVerifyClient;

    /**
    * Server certificate ID. If this parameter is not specified, you need to upload a certificate and specify CertContent (server certificate content), CertKey (server certificate key), and CertName (server certificate name).
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * ID of a client certificate. When the listener adopts mutual authentication (i.e., SSLMode = mutual), if you leave this parameter empty, you must upload the client certificate, including CertCaContent and CertCaName.
    */
    @SerializedName("CertCaId")
    @Expose
    private String CertCaId;

    /**
    * Name of the uploaded server certificate. If there is no CertId, this parameter is required.
    */
    @SerializedName("CertName")
    @Expose
    private String CertName;

    /**
    * Key of the uploaded server certificate. If there is no CertId, this parameter is required.
    */
    @SerializedName("CertKey")
    @Expose
    private String CertKey;

    /**
    * Content of the uploaded server certificate. If there is no CertId, this parameter is required.
    */
    @SerializedName("CertContent")
    @Expose
    private String CertContent;

    /**
    * Upload client CA certificate name. if SSLMode=MUTUAL and there is no CertCaId, this parameter is required.
    */
    @SerializedName("CertCaName")
    @Expose
    private String CertCaName;

    /**
    * Upload client certificate content. if SSLMode is MUTUAL and there is no CertCaId, this parameter is required.
    */
    @SerializedName("CertCaContent")
    @Expose
    private String CertCaContent;

    /**
     * Get Authentication type. UNIDIRECTIONAL: one-way authentication; MUTUAL: mutual authentication.
Default value: UNIDIRECTIONAL. 
     * @return SSLMode Authentication type. UNIDIRECTIONAL: one-way authentication; MUTUAL: mutual authentication.
Default value: UNIDIRECTIONAL.
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set Authentication type. UNIDIRECTIONAL: one-way authentication; MUTUAL: mutual authentication.
Default value: UNIDIRECTIONAL.
     * @param SSLMode Authentication type. UNIDIRECTIONAL: one-way authentication; MUTUAL: mutual authentication.
Default value: UNIDIRECTIONAL.
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * Get Whether to enable client authentication for mutual authentication. ON: enable it; OPTIONAL: client certificate not required. Default value: ON. 
     * @return SSLVerifyClient Whether to enable client authentication for mutual authentication. ON: enable it; OPTIONAL: client certificate not required. Default value: ON.
     */
    public String getSSLVerifyClient() {
        return this.SSLVerifyClient;
    }

    /**
     * Set Whether to enable client authentication for mutual authentication. ON: enable it; OPTIONAL: client certificate not required. Default value: ON.
     * @param SSLVerifyClient Whether to enable client authentication for mutual authentication. ON: enable it; OPTIONAL: client certificate not required. Default value: ON.
     */
    public void setSSLVerifyClient(String SSLVerifyClient) {
        this.SSLVerifyClient = SSLVerifyClient;
    }

    /**
     * Get Server certificate ID. If this parameter is not specified, you need to upload a certificate and specify CertContent (server certificate content), CertKey (server certificate key), and CertName (server certificate name). 
     * @return CertId Server certificate ID. If this parameter is not specified, you need to upload a certificate and specify CertContent (server certificate content), CertKey (server certificate key), and CertName (server certificate name).
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Server certificate ID. If this parameter is not specified, you need to upload a certificate and specify CertContent (server certificate content), CertKey (server certificate key), and CertName (server certificate name).
     * @param CertId Server certificate ID. If this parameter is not specified, you need to upload a certificate and specify CertContent (server certificate content), CertKey (server certificate key), and CertName (server certificate name).
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get ID of a client certificate. When the listener adopts mutual authentication (i.e., SSLMode = mutual), if you leave this parameter empty, you must upload the client certificate, including CertCaContent and CertCaName. 
     * @return CertCaId ID of a client certificate. When the listener adopts mutual authentication (i.e., SSLMode = mutual), if you leave this parameter empty, you must upload the client certificate, including CertCaContent and CertCaName.
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * Set ID of a client certificate. When the listener adopts mutual authentication (i.e., SSLMode = mutual), if you leave this parameter empty, you must upload the client certificate, including CertCaContent and CertCaName.
     * @param CertCaId ID of a client certificate. When the listener adopts mutual authentication (i.e., SSLMode = mutual), if you leave this parameter empty, you must upload the client certificate, including CertCaContent and CertCaName.
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * Get Name of the uploaded server certificate. If there is no CertId, this parameter is required. 
     * @return CertName Name of the uploaded server certificate. If there is no CertId, this parameter is required.
     */
    public String getCertName() {
        return this.CertName;
    }

    /**
     * Set Name of the uploaded server certificate. If there is no CertId, this parameter is required.
     * @param CertName Name of the uploaded server certificate. If there is no CertId, this parameter is required.
     */
    public void setCertName(String CertName) {
        this.CertName = CertName;
    }

    /**
     * Get Key of the uploaded server certificate. If there is no CertId, this parameter is required. 
     * @return CertKey Key of the uploaded server certificate. If there is no CertId, this parameter is required.
     */
    public String getCertKey() {
        return this.CertKey;
    }

    /**
     * Set Key of the uploaded server certificate. If there is no CertId, this parameter is required.
     * @param CertKey Key of the uploaded server certificate. If there is no CertId, this parameter is required.
     */
    public void setCertKey(String CertKey) {
        this.CertKey = CertKey;
    }

    /**
     * Get Content of the uploaded server certificate. If there is no CertId, this parameter is required. 
     * @return CertContent Content of the uploaded server certificate. If there is no CertId, this parameter is required.
     */
    public String getCertContent() {
        return this.CertContent;
    }

    /**
     * Set Content of the uploaded server certificate. If there is no CertId, this parameter is required.
     * @param CertContent Content of the uploaded server certificate. If there is no CertId, this parameter is required.
     */
    public void setCertContent(String CertContent) {
        this.CertContent = CertContent;
    }

    /**
     * Get Upload client CA certificate name. if SSLMode=MUTUAL and there is no CertCaId, this parameter is required. 
     * @return CertCaName Upload client CA certificate name. if SSLMode=MUTUAL and there is no CertCaId, this parameter is required.
     */
    public String getCertCaName() {
        return this.CertCaName;
    }

    /**
     * Set Upload client CA certificate name. if SSLMode=MUTUAL and there is no CertCaId, this parameter is required.
     * @param CertCaName Upload client CA certificate name. if SSLMode=MUTUAL and there is no CertCaId, this parameter is required.
     */
    public void setCertCaName(String CertCaName) {
        this.CertCaName = CertCaName;
    }

    /**
     * Get Upload client certificate content. if SSLMode is MUTUAL and there is no CertCaId, this parameter is required. 
     * @return CertCaContent Upload client certificate content. if SSLMode is MUTUAL and there is no CertCaId, this parameter is required.
     */
    public String getCertCaContent() {
        return this.CertCaContent;
    }

    /**
     * Set Upload client certificate content. if SSLMode is MUTUAL and there is no CertCaId, this parameter is required.
     * @param CertCaContent Upload client certificate content. if SSLMode is MUTUAL and there is no CertCaId, this parameter is required.
     */
    public void setCertCaContent(String CertCaContent) {
        this.CertCaContent = CertCaContent;
    }

    public CertificateInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateInput(CertificateInput source) {
        if (source.SSLMode != null) {
            this.SSLMode = new String(source.SSLMode);
        }
        if (source.SSLVerifyClient != null) {
            this.SSLVerifyClient = new String(source.SSLVerifyClient);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.CertCaId != null) {
            this.CertCaId = new String(source.CertCaId);
        }
        if (source.CertName != null) {
            this.CertName = new String(source.CertName);
        }
        if (source.CertKey != null) {
            this.CertKey = new String(source.CertKey);
        }
        if (source.CertContent != null) {
            this.CertContent = new String(source.CertContent);
        }
        if (source.CertCaName != null) {
            this.CertCaName = new String(source.CertCaName);
        }
        if (source.CertCaContent != null) {
            this.CertCaContent = new String(source.CertCaContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);
        this.setParamSimple(map, prefix + "SSLVerifyClient", this.SSLVerifyClient);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertCaId", this.CertCaId);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "CertKey", this.CertKey);
        this.setParamSimple(map, prefix + "CertContent", this.CertContent);
        this.setParamSimple(map, prefix + "CertCaName", this.CertCaName);
        this.setParamSimple(map, prefix + "CertCaContent", this.CertCaContent);

    }
}

