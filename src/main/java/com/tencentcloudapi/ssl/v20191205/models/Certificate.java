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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Certificate extends AbstractModel {

    /**
    * The certificate ID.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * The list of domains bound to the certificate.
    */
    @SerializedName("DnsNames")
    @Expose
    private String [] DnsNames;

    /**
    * Root certificate id.
    */
    @SerializedName("CertCaId")
    @Expose
    private String CertCaId;

    /**
    * Certificate authentication mode: unidirectional one-way authentication, mutual mutual authentication.
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
     * Get The certificate ID. 
     * @return CertId The certificate ID.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set The certificate ID.
     * @param CertId The certificate ID.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get The list of domains bound to the certificate. 
     * @return DnsNames The list of domains bound to the certificate.
     */
    public String [] getDnsNames() {
        return this.DnsNames;
    }

    /**
     * Set The list of domains bound to the certificate.
     * @param DnsNames The list of domains bound to the certificate.
     */
    public void setDnsNames(String [] DnsNames) {
        this.DnsNames = DnsNames;
    }

    /**
     * Get Root certificate id. 
     * @return CertCaId Root certificate id.
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * Set Root certificate id.
     * @param CertCaId Root certificate id.
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * Get Certificate authentication mode: unidirectional one-way authentication, mutual mutual authentication. 
     * @return SSLMode Certificate authentication mode: unidirectional one-way authentication, mutual mutual authentication.
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set Certificate authentication mode: unidirectional one-way authentication, mutual mutual authentication.
     * @param SSLMode Certificate authentication mode: unidirectional one-way authentication, mutual mutual authentication.
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    public Certificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Certificate(Certificate source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.DnsNames != null) {
            this.DnsNames = new String[source.DnsNames.length];
            for (int i = 0; i < source.DnsNames.length; i++) {
                this.DnsNames[i] = new String(source.DnsNames[i]);
            }
        }
        if (source.CertCaId != null) {
            this.CertCaId = new String(source.CertCaId);
        }
        if (source.SSLMode != null) {
            this.SSLMode = new String(source.SSLMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamArraySimple(map, prefix + "DnsNames.", this.DnsNames);
        this.setParamSimple(map, prefix + "CertCaId", this.CertCaId);
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);

    }
}

