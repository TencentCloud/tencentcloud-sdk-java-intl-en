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

public class CdnInstanceDetail extends AbstractModel {

    /**
    * The domain.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The ID of the deployed certificate.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Domain name status: rejected - the domain name failed the review or its registration has expired/been canceled; processing - deploying; online - started; offline - closed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Domain billing status, where on indicates enable and off indicates disable.
    */
    @SerializedName("HttpsBillingSwitch")
    @Expose
    private String HttpsBillingSwitch;

    /**
     * Get The domain. 
     * @return Domain The domain.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain.
     * @param Domain The domain.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The ID of the deployed certificate. 
     * @return CertId The ID of the deployed certificate.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set The ID of the deployed certificate.
     * @param CertId The ID of the deployed certificate.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Domain name status: rejected - the domain name failed the review or its registration has expired/been canceled; processing - deploying; online - started; offline - closed. 
     * @return Status Domain name status: rejected - the domain name failed the review or its registration has expired/been canceled; processing - deploying; online - started; offline - closed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Domain name status: rejected - the domain name failed the review or its registration has expired/been canceled; processing - deploying; online - started; offline - closed.
     * @param Status Domain name status: rejected - the domain name failed the review or its registration has expired/been canceled; processing - deploying; online - started; offline - closed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Domain billing status, where on indicates enable and off indicates disable. 
     * @return HttpsBillingSwitch Domain billing status, where on indicates enable and off indicates disable.
     */
    public String getHttpsBillingSwitch() {
        return this.HttpsBillingSwitch;
    }

    /**
     * Set Domain billing status, where on indicates enable and off indicates disable.
     * @param HttpsBillingSwitch Domain billing status, where on indicates enable and off indicates disable.
     */
    public void setHttpsBillingSwitch(String HttpsBillingSwitch) {
        this.HttpsBillingSwitch = HttpsBillingSwitch;
    }

    public CdnInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdnInstanceDetail(CdnInstanceDetail source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.HttpsBillingSwitch != null) {
            this.HttpsBillingSwitch = new String(source.HttpsBillingSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "HttpsBillingSwitch", this.HttpsBillingSwitch);

    }
}

