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

public class ReplaceCertForLoadBalancersRequest extends AbstractModel {

    /**
    * ID of the certificate to be replaced, which can be a server certificate or a client certificate.
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
    * Information such as the content of the new certificate
    */
    @SerializedName("Certificate")
    @Expose
    private CertificateInput Certificate;

    /**
     * Get ID of the certificate to be replaced, which can be a server certificate or a client certificate. 
     * @return OldCertificateId ID of the certificate to be replaced, which can be a server certificate or a client certificate.
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set ID of the certificate to be replaced, which can be a server certificate or a client certificate.
     * @param OldCertificateId ID of the certificate to be replaced, which can be a server certificate or a client certificate.
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    /**
     * Get Information such as the content of the new certificate 
     * @return Certificate Information such as the content of the new certificate
     */
    public CertificateInput getCertificate() {
        return this.Certificate;
    }

    /**
     * Set Information such as the content of the new certificate
     * @param Certificate Information such as the content of the new certificate
     */
    public void setCertificate(CertificateInput Certificate) {
        this.Certificate = Certificate;
    }

    public ReplaceCertForLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceCertForLoadBalancersRequest(ReplaceCertForLoadBalancersRequest source) {
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
        if (source.Certificate != null) {
            this.Certificate = new CertificateInput(source.Certificate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);

    }
}

