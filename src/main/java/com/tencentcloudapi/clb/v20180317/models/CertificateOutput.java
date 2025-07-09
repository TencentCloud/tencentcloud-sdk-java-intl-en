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

public class CertificateOutput extends AbstractModel {

    /**
    * Authentication type. Value range: UNIDIRECTIONAL (unidirectional authentication), MUTUAL (mutual authentication)
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * Server certificate ID.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Client certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertCaId")
    @Expose
    private String CertCaId;

    /**
    * IDs of extra server certificates
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ExtCertIds")
    @Expose
    private String [] ExtCertIds;

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
     * Get Server certificate ID. 
     * @return CertId Server certificate ID.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Server certificate ID.
     * @param CertId Server certificate ID.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Client certificate ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CertCaId Client certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * Set Client certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CertCaId Client certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * Get IDs of extra server certificates
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ExtCertIds IDs of extra server certificates
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getExtCertIds() {
        return this.ExtCertIds;
    }

    /**
     * Set IDs of extra server certificates
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ExtCertIds IDs of extra server certificates
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setExtCertIds(String [] ExtCertIds) {
        this.ExtCertIds = ExtCertIds;
    }

    public CertificateOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateOutput(CertificateOutput source) {
        if (source.SSLMode != null) {
            this.SSLMode = new String(source.SSLMode);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.CertCaId != null) {
            this.CertCaId = new String(source.CertCaId);
        }
        if (source.ExtCertIds != null) {
            this.ExtCertIds = new String[source.ExtCertIds.length];
            for (int i = 0; i < source.ExtCertIds.length; i++) {
                this.ExtCertIds[i] = new String(source.ExtCertIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertCaId", this.CertCaId);
        this.setParamArraySimple(map, prefix + "ExtCertIds.", this.ExtCertIds);

    }
}

