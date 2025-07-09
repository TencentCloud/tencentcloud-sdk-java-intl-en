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

public class CommitCertificateInformationRequest extends AbstractModel {

    /**
    * Paid certificate id of materials to be submitted.	
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Certificate domain name verification method:.
DNS_AUTO: automatically adds domain dns verification, requiring user domain name resolution to be hosted on [cloud dns](https://console.cloud.tencent.com/cns) and under the same tencent cloud account as the certificate application.
DNS: manually add domain dns verification, which requires users to manually add verification values to the domain resolution service provider.
FILE: manual addition of domain name file verification. requires the user to manually add a specified path file in the root directory of the domain site for file verification, and either http or https passing is acceptable; the domain site needs to be accessible by overseas ca institutions, with the specific access allowlist being: 64.78.193.238, 216.168.247.9, 216.168.249.9, 54.189.196.217.
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
     * Get Paid certificate id of materials to be submitted.	 
     * @return CertificateId Paid certificate id of materials to be submitted.	
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Paid certificate id of materials to be submitted.	
     * @param CertificateId Paid certificate id of materials to be submitted.	
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Certificate domain name verification method:.
DNS_AUTO: automatically adds domain dns verification, requiring user domain name resolution to be hosted on [cloud dns](https://console.cloud.tencent.com/cns) and under the same tencent cloud account as the certificate application.
DNS: manually add domain dns verification, which requires users to manually add verification values to the domain resolution service provider.
FILE: manual addition of domain name file verification. requires the user to manually add a specified path file in the root directory of the domain site for file verification, and either http or https passing is acceptable; the domain site needs to be accessible by overseas ca institutions, with the specific access allowlist being: 64.78.193.238, 216.168.247.9, 216.168.249.9, 54.189.196.217. 
     * @return VerifyType Certificate domain name verification method:.
DNS_AUTO: automatically adds domain dns verification, requiring user domain name resolution to be hosted on [cloud dns](https://console.cloud.tencent.com/cns) and under the same tencent cloud account as the certificate application.
DNS: manually add domain dns verification, which requires users to manually add verification values to the domain resolution service provider.
FILE: manual addition of domain name file verification. requires the user to manually add a specified path file in the root directory of the domain site for file verification, and either http or https passing is acceptable; the domain site needs to be accessible by overseas ca institutions, with the specific access allowlist being: 64.78.193.238, 216.168.247.9, 216.168.249.9, 54.189.196.217.
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set Certificate domain name verification method:.
DNS_AUTO: automatically adds domain dns verification, requiring user domain name resolution to be hosted on [cloud dns](https://console.cloud.tencent.com/cns) and under the same tencent cloud account as the certificate application.
DNS: manually add domain dns verification, which requires users to manually add verification values to the domain resolution service provider.
FILE: manual addition of domain name file verification. requires the user to manually add a specified path file in the root directory of the domain site for file verification, and either http or https passing is acceptable; the domain site needs to be accessible by overseas ca institutions, with the specific access allowlist being: 64.78.193.238, 216.168.247.9, 216.168.249.9, 54.189.196.217.
     * @param VerifyType Certificate domain name verification method:.
DNS_AUTO: automatically adds domain dns verification, requiring user domain name resolution to be hosted on [cloud dns](https://console.cloud.tencent.com/cns) and under the same tencent cloud account as the certificate application.
DNS: manually add domain dns verification, which requires users to manually add verification values to the domain resolution service provider.
FILE: manual addition of domain name file verification. requires the user to manually add a specified path file in the root directory of the domain site for file verification, and either http or https passing is acceptable; the domain site needs to be accessible by overseas ca institutions, with the specific access allowlist being: 64.78.193.238, 216.168.247.9, 216.168.249.9, 54.189.196.217.
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    public CommitCertificateInformationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommitCertificateInformationRequest(CommitCertificateInformationRequest source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);

    }
}

