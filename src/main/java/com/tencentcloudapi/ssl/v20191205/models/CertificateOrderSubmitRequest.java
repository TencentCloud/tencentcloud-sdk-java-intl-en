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

public class CertificateOrderSubmitRequest extends AbstractModel {

    /**
    * Paid SSL certificate ID of materials to be submitted.	
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Whether to delete automatic DNS validation: 0, do not delete; 1, delete; default is do not delete.
    */
    @SerializedName("DeleteDnsAutoRecord")
    @Expose
    private Long DeleteDnsAutoRecord;

    /**
    * Domain validation method of the certificate
DNS: Manually add domain DNS validation. The user needs to manually add the verification value at the DNS service provider.
FILE: Manual domain addition via FILE verification. Users are advised to manually add the specified path FILE to the root directory of the domain site for FILE verification. Either http or https access is sufficient. The domain site must be accessible by overseas certificate authorities. For the specific access allowlist, refer to the console page.
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
     * Get Paid SSL certificate ID of materials to be submitted.	 
     * @return CertId Paid SSL certificate ID of materials to be submitted.	
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set Paid SSL certificate ID of materials to be submitted.	
     * @param CertId Paid SSL certificate ID of materials to be submitted.	
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Whether to delete automatic DNS validation: 0, do not delete; 1, delete; default is do not delete. 
     * @return DeleteDnsAutoRecord Whether to delete automatic DNS validation: 0, do not delete; 1, delete; default is do not delete.
     */
    public Long getDeleteDnsAutoRecord() {
        return this.DeleteDnsAutoRecord;
    }

    /**
     * Set Whether to delete automatic DNS validation: 0, do not delete; 1, delete; default is do not delete.
     * @param DeleteDnsAutoRecord Whether to delete automatic DNS validation: 0, do not delete; 1, delete; default is do not delete.
     */
    public void setDeleteDnsAutoRecord(Long DeleteDnsAutoRecord) {
        this.DeleteDnsAutoRecord = DeleteDnsAutoRecord;
    }

    /**
     * Get Domain validation method of the certificate
DNS: Manually add domain DNS validation. The user needs to manually add the verification value at the DNS service provider.
FILE: Manual domain addition via FILE verification. Users are advised to manually add the specified path FILE to the root directory of the domain site for FILE verification. Either http or https access is sufficient. The domain site must be accessible by overseas certificate authorities. For the specific access allowlist, refer to the console page. 
     * @return VerifyType Domain validation method of the certificate
DNS: Manually add domain DNS validation. The user needs to manually add the verification value at the DNS service provider.
FILE: Manual domain addition via FILE verification. Users are advised to manually add the specified path FILE to the root directory of the domain site for FILE verification. Either http or https access is sufficient. The domain site must be accessible by overseas certificate authorities. For the specific access allowlist, refer to the console page.
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set Domain validation method of the certificate
DNS: Manually add domain DNS validation. The user needs to manually add the verification value at the DNS service provider.
FILE: Manual domain addition via FILE verification. Users are advised to manually add the specified path FILE to the root directory of the domain site for FILE verification. Either http or https access is sufficient. The domain site must be accessible by overseas certificate authorities. For the specific access allowlist, refer to the console page.
     * @param VerifyType Domain validation method of the certificate
DNS: Manually add domain DNS validation. The user needs to manually add the verification value at the DNS service provider.
FILE: Manual domain addition via FILE verification. Users are advised to manually add the specified path FILE to the root directory of the domain site for FILE verification. Either http or https access is sufficient. The domain site must be accessible by overseas certificate authorities. For the specific access allowlist, refer to the console page.
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    public CertificateOrderSubmitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateOrderSubmitRequest(CertificateOrderSubmitRequest source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.DeleteDnsAutoRecord != null) {
            this.DeleteDnsAutoRecord = new Long(source.DeleteDnsAutoRecord);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "DeleteDnsAutoRecord", this.DeleteDnsAutoRecord);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);

    }
}

