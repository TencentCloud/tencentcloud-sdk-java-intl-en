/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertificateInput extends AbstractModel{

    /**
    * Authentication type. Value range: UNIDIRECTIONAL (unidirectional authentication), MUTUAL (mutual authentication)
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * ID of a server certificate. If you leave this parameter empty, you must upload the certificate, including CertContent, CertKey, and CertName.
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
    * Name of the uploaded client CA certificate. When SSLMode = mutual, if there is no CertCaId, this parameter is required.
    */
    @SerializedName("CertCaName")
    @Expose
    private String CertCaName;

    /**
    * Content of the uploaded client certificate. When SSLMode = mutual, if there is no CertCaId, this parameter is required.
    */
    @SerializedName("CertCaContent")
    @Expose
    private String CertCaContent;

    /**
     * Get Authentication type. Value range: UNIDIRECTIONAL (unidirectional authentication), MUTUAL (mutual authentication) 
     * @return SSLMode Authentication type. Value range: UNIDIRECTIONAL (unidirectional authentication), MUTUAL (mutual authentication)
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set Authentication type. Value range: UNIDIRECTIONAL (unidirectional authentication), MUTUAL (mutual authentication)
     * @param SSLMode Authentication type. Value range: UNIDIRECTIONAL (unidirectional authentication), MUTUAL (mutual authentication)
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * Get ID of a server certificate. If you leave this parameter empty, you must upload the certificate, including CertContent, CertKey, and CertName. 
     * @return CertId ID of a server certificate. If you leave this parameter empty, you must upload the certificate, including CertContent, CertKey, and CertName.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set ID of a server certificate. If you leave this parameter empty, you must upload the certificate, including CertContent, CertKey, and CertName.
     * @param CertId ID of a server certificate. If you leave this parameter empty, you must upload the certificate, including CertContent, CertKey, and CertName.
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
     * Get Name of the uploaded client CA certificate. When SSLMode = mutual, if there is no CertCaId, this parameter is required. 
     * @return CertCaName Name of the uploaded client CA certificate. When SSLMode = mutual, if there is no CertCaId, this parameter is required.
     */
    public String getCertCaName() {
        return this.CertCaName;
    }

    /**
     * Set Name of the uploaded client CA certificate. When SSLMode = mutual, if there is no CertCaId, this parameter is required.
     * @param CertCaName Name of the uploaded client CA certificate. When SSLMode = mutual, if there is no CertCaId, this parameter is required.
     */
    public void setCertCaName(String CertCaName) {
        this.CertCaName = CertCaName;
    }

    /**
     * Get Content of the uploaded client certificate. When SSLMode = mutual, if there is no CertCaId, this parameter is required. 
     * @return CertCaContent Content of the uploaded client certificate. When SSLMode = mutual, if there is no CertCaId, this parameter is required.
     */
    public String getCertCaContent() {
        return this.CertCaContent;
    }

    /**
     * Set Content of the uploaded client certificate. When SSLMode = mutual, if there is no CertCaId, this parameter is required.
     * @param CertCaContent Content of the uploaded client certificate. When SSLMode = mutual, if there is no CertCaId, this parameter is required.
     */
    public void setCertCaContent(String CertCaContent) {
        this.CertCaContent = CertCaContent;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertCaId", this.CertCaId);
        this.setParamSimple(map, prefix + "CertName", this.CertName);
        this.setParamSimple(map, prefix + "CertKey", this.CertKey);
        this.setParamSimple(map, prefix + "CertContent", this.CertContent);
        this.setParamSimple(map, prefix + "CertCaName", this.CertCaName);
        this.setParamSimple(map, prefix + "CertCaContent", this.CertCaContent);

    }
}

