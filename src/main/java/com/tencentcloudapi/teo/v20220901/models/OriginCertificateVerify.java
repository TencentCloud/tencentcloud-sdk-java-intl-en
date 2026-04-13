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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginCertificateVerify extends AbstractModel {

    /**
    * Origin certificate verification mode. valid values: <li>disable: disable origin certificate verification.</li> <li>custom_ca: use designated trusted ca certificate for verification.</li>.
    */
    @SerializedName("VerificationMode")
    @Expose
    private String VerificationMode;

    /**
    * Specifies the trusted CA certificate list. the origin certificate must be issued by this CA to pass verification. note: this parameter is required only when VerificationMode is custom_CA. input this parameter to specify the trusted CA certificate information.
OriginCertificateVerify specifies CertId of the corresponding certificate as an input parameter in ModifyHostsCertificate. only need to go to the SSL certificate service list (https://console.cloud.tencent.com/SSL) to check CertId.	

    */
    @SerializedName("CustomCACerts")
    @Expose
    private CertificateInfo [] CustomCACerts;

    /**
     * Get Origin certificate verification mode. valid values: <li>disable: disable origin certificate verification.</li> <li>custom_ca: use designated trusted ca certificate for verification.</li>. 
     * @return VerificationMode Origin certificate verification mode. valid values: <li>disable: disable origin certificate verification.</li> <li>custom_ca: use designated trusted ca certificate for verification.</li>.
     */
    public String getVerificationMode() {
        return this.VerificationMode;
    }

    /**
     * Set Origin certificate verification mode. valid values: <li>disable: disable origin certificate verification.</li> <li>custom_ca: use designated trusted ca certificate for verification.</li>.
     * @param VerificationMode Origin certificate verification mode. valid values: <li>disable: disable origin certificate verification.</li> <li>custom_ca: use designated trusted ca certificate for verification.</li>.
     */
    public void setVerificationMode(String VerificationMode) {
        this.VerificationMode = VerificationMode;
    }

    /**
     * Get Specifies the trusted CA certificate list. the origin certificate must be issued by this CA to pass verification. note: this parameter is required only when VerificationMode is custom_CA. input this parameter to specify the trusted CA certificate information.
OriginCertificateVerify specifies CertId of the corresponding certificate as an input parameter in ModifyHostsCertificate. only need to go to the SSL certificate service list (https://console.cloud.tencent.com/SSL) to check CertId.	
 
     * @return CustomCACerts Specifies the trusted CA certificate list. the origin certificate must be issued by this CA to pass verification. note: this parameter is required only when VerificationMode is custom_CA. input this parameter to specify the trusted CA certificate information.
OriginCertificateVerify specifies CertId of the corresponding certificate as an input parameter in ModifyHostsCertificate. only need to go to the SSL certificate service list (https://console.cloud.tencent.com/SSL) to check CertId.	

     */
    public CertificateInfo [] getCustomCACerts() {
        return this.CustomCACerts;
    }

    /**
     * Set Specifies the trusted CA certificate list. the origin certificate must be issued by this CA to pass verification. note: this parameter is required only when VerificationMode is custom_CA. input this parameter to specify the trusted CA certificate information.
OriginCertificateVerify specifies CertId of the corresponding certificate as an input parameter in ModifyHostsCertificate. only need to go to the SSL certificate service list (https://console.cloud.tencent.com/SSL) to check CertId.	

     * @param CustomCACerts Specifies the trusted CA certificate list. the origin certificate must be issued by this CA to pass verification. note: this parameter is required only when VerificationMode is custom_CA. input this parameter to specify the trusted CA certificate information.
OriginCertificateVerify specifies CertId of the corresponding certificate as an input parameter in ModifyHostsCertificate. only need to go to the SSL certificate service list (https://console.cloud.tencent.com/SSL) to check CertId.	

     */
    public void setCustomCACerts(CertificateInfo [] CustomCACerts) {
        this.CustomCACerts = CustomCACerts;
    }

    public OriginCertificateVerify() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginCertificateVerify(OriginCertificateVerify source) {
        if (source.VerificationMode != null) {
            this.VerificationMode = new String(source.VerificationMode);
        }
        if (source.CustomCACerts != null) {
            this.CustomCACerts = new CertificateInfo[source.CustomCACerts.length];
            for (int i = 0; i < source.CustomCACerts.length; i++) {
                this.CustomCACerts[i] = new CertificateInfo(source.CustomCACerts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerificationMode", this.VerificationMode);
        this.setParamArrayObj(map, prefix + "CustomCACerts.", this.CustomCACerts);

    }
}

