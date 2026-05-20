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

public class RevokeCertificateRequest extends AbstractModel {

    /**
    * Certificate ID.
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * Reason to revoke certificate.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get Certificate ID. 
     * @return CertificateId Certificate ID.
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set Certificate ID.
     * @param CertificateId Certificate ID.
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get Reason to revoke certificate. 
     * @return Reason Reason to revoke certificate.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason to revoke certificate.
     * @param Reason Reason to revoke certificate.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public RevokeCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RevokeCertificateRequest(RevokeCertificateRequest source) {
        if (source.CertificateId != null) {
            this.CertificateId = new String(source.CertificateId);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

