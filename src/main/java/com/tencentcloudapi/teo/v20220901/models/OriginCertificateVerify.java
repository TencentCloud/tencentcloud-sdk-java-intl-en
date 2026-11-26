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
    * Origin certificate verification mode. Valid values: <li>disable: Disable origin certificate verification.</li><li>custom_ca: Use a specified trusted CA certificate for verification.</li>
    */
    @SerializedName("VerificationMode")
    @Expose
    private String VerificationMode;

    /**
    * Specify the trusted CA certificate list. The origin certificate must be issued by this CA to pass verification. Note: This parameter is required only when VerificationMode is custom_ca. Specify the trusted CA certificate information.
When OriginCertificateVerify is used as an input parameter in ModifyHostsCertificate, just pass in the CertId of the corresponding certificate. You can go to the [SSL certificate list](https://console.cloud.tencent.com/ssl) to check the CertId.	

    */
    @SerializedName("CustomCACerts")
    @Expose
    private CertificateInfo [] CustomCACerts;

    /**
     * Get Origin certificate verification mode. Valid values: <li>disable: Disable origin certificate verification.</li><li>custom_ca: Use a specified trusted CA certificate for verification.</li> 
     * @return VerificationMode Origin certificate verification mode. Valid values: <li>disable: Disable origin certificate verification.</li><li>custom_ca: Use a specified trusted CA certificate for verification.</li>
     */
    public String getVerificationMode() {
        return this.VerificationMode;
    }

    /**
     * Set Origin certificate verification mode. Valid values: <li>disable: Disable origin certificate verification.</li><li>custom_ca: Use a specified trusted CA certificate for verification.</li>
     * @param VerificationMode Origin certificate verification mode. Valid values: <li>disable: Disable origin certificate verification.</li><li>custom_ca: Use a specified trusted CA certificate for verification.</li>
     */
    public void setVerificationMode(String VerificationMode) {
        this.VerificationMode = VerificationMode;
    }

    /**
     * Get Specify the trusted CA certificate list. The origin certificate must be issued by this CA to pass verification. Note: This parameter is required only when VerificationMode is custom_ca. Specify the trusted CA certificate information.
When OriginCertificateVerify is used as an input parameter in ModifyHostsCertificate, just pass in the CertId of the corresponding certificate. You can go to the [SSL certificate list](https://console.cloud.tencent.com/ssl) to check the CertId.	
 
     * @return CustomCACerts Specify the trusted CA certificate list. The origin certificate must be issued by this CA to pass verification. Note: This parameter is required only when VerificationMode is custom_ca. Specify the trusted CA certificate information.
When OriginCertificateVerify is used as an input parameter in ModifyHostsCertificate, just pass in the CertId of the corresponding certificate. You can go to the [SSL certificate list](https://console.cloud.tencent.com/ssl) to check the CertId.	

     */
    public CertificateInfo [] getCustomCACerts() {
        return this.CustomCACerts;
    }

    /**
     * Set Specify the trusted CA certificate list. The origin certificate must be issued by this CA to pass verification. Note: This parameter is required only when VerificationMode is custom_ca. Specify the trusted CA certificate information.
When OriginCertificateVerify is used as an input parameter in ModifyHostsCertificate, just pass in the CertId of the corresponding certificate. You can go to the [SSL certificate list](https://console.cloud.tencent.com/ssl) to check the CertId.	

     * @param CustomCACerts Specify the trusted CA certificate list. The origin certificate must be issued by this CA to pass verification. Note: This parameter is required only when VerificationMode is custom_ca. Specify the trusted CA certificate information.
When OriginCertificateVerify is used as an input parameter in ModifyHostsCertificate, just pass in the CertId of the corresponding certificate. You can go to the [SSL certificate list](https://console.cloud.tencent.com/ssl) to check the CertId.	

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

