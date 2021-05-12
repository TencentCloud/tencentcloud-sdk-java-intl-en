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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertDomainsResponse extends AbstractModel{

    /**
    * List of domain names connected to CDN
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * List of CDN domain names with certificates configured
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertifiedDomains")
    @Expose
    private String [] CertifiedDomains;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of domain names connected to CDN
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Domains List of domain names connected to CDN
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set List of domain names connected to CDN
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Domains List of domain names connected to CDN
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get List of CDN domain names with certificates configured
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CertifiedDomains List of CDN domain names with certificates configured
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getCertifiedDomains() {
        return this.CertifiedDomains;
    }

    /**
     * Set List of CDN domain names with certificates configured
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CertifiedDomains List of CDN domain names with certificates configured
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCertifiedDomains(String [] CertifiedDomains) {
        this.CertifiedDomains = CertifiedDomains;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCertDomainsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertDomainsResponse(DescribeCertDomainsResponse source) {
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.CertifiedDomains != null) {
            this.CertifiedDomains = new String[source.CertifiedDomains.length];
            for (int i = 0; i < source.CertifiedDomains.length; i++) {
                this.CertifiedDomains[i] = new String(source.CertifiedDomains[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArraySimple(map, prefix + "CertifiedDomains.", this.CertifiedDomains);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

