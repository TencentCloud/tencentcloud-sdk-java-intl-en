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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomDomainInput extends AbstractModel {

    /**
    * <p>Domain name.</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Certificate ID</p>
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * <p>Verification status. Verify, Pass, Fail</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Whether not to apply for a certificate.</p>
    */
    @SerializedName("NoCertificate")
    @Expose
    private Boolean NoCertificate;

    /**
     * Get <p>Domain name.</p> 
     * @return Domain <p>Domain name.</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Domain name.</p>
     * @param Domain <p>Domain name.</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Certificate ID</p> 
     * @return CertificateId <p>Certificate ID</p>
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set <p>Certificate ID</p>
     * @param CertificateId <p>Certificate ID</p>
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get <p>Verification status. Verify, Pass, Fail</p> 
     * @return Status <p>Verification status. Verify, Pass, Fail</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Verification status. Verify, Pass, Fail</p>
     * @param Status <p>Verification status. Verify, Pass, Fail</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Whether not to apply for a certificate.</p> 
     * @return NoCertificate <p>Whether not to apply for a certificate.</p>
     */
    public Boolean getNoCertificate() {
        return this.NoCertificate;
    }

    /**
     * Set <p>Whether not to apply for a certificate.</p>
     * @param NoCertificate <p>Whether not to apply for a certificate.</p>
     */
    public void setNoCertificate(Boolean NoCertificate) {
        this.NoCertificate = NoCertificate;
    }

    public CustomDomainInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomDomainInput(CustomDomainInput source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.NoCertificate != null) {
            this.NoCertificate = new Boolean(source.NoCertificate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NoCertificate", this.NoCertificate);

    }
}

