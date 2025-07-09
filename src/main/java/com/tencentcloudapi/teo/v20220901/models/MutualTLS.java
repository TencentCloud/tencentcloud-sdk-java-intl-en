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

public class MutualTLS extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Mutual authentication certificate list.
Note: When using MutualTLS as an input parameter in ModifyHostsCertificate, you only need to provide the CertId of the corresponding certificate. You can check the CertId from the [SSL Certificate List](https://console.cloud.tencent.com/ssl).
    */
    @SerializedName("CertInfos")
    @Expose
    private CertificateInfo [] CertInfos;

    /**
     * Get  
     * @return Switch 
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 
     * @param Switch 
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Mutual authentication certificate list.
Note: When using MutualTLS as an input parameter in ModifyHostsCertificate, you only need to provide the CertId of the corresponding certificate. You can check the CertId from the [SSL Certificate List](https://console.cloud.tencent.com/ssl). 
     * @return CertInfos Mutual authentication certificate list.
Note: When using MutualTLS as an input parameter in ModifyHostsCertificate, you only need to provide the CertId of the corresponding certificate. You can check the CertId from the [SSL Certificate List](https://console.cloud.tencent.com/ssl).
     */
    public CertificateInfo [] getCertInfos() {
        return this.CertInfos;
    }

    /**
     * Set Mutual authentication certificate list.
Note: When using MutualTLS as an input parameter in ModifyHostsCertificate, you only need to provide the CertId of the corresponding certificate. You can check the CertId from the [SSL Certificate List](https://console.cloud.tencent.com/ssl).
     * @param CertInfos Mutual authentication certificate list.
Note: When using MutualTLS as an input parameter in ModifyHostsCertificate, you only need to provide the CertId of the corresponding certificate. You can check the CertId from the [SSL Certificate List](https://console.cloud.tencent.com/ssl).
     */
    public void setCertInfos(CertificateInfo [] CertInfos) {
        this.CertInfos = CertInfos;
    }

    public MutualTLS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MutualTLS(MutualTLS source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.CertInfos != null) {
            this.CertInfos = new CertificateInfo[source.CertInfos.length];
            for (int i = 0; i < source.CertInfos.length; i++) {
                this.CertInfos[i] = new CertificateInfo(source.CertInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "CertInfos.", this.CertInfos);

    }
}

