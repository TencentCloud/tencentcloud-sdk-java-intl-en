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

public class MultiCertInfo extends AbstractModel {

    /**
    * Authentication type. Values: `UNIDIRECTIONAL` (one-way authentication), `MUTUAL` (two-way authentication)
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * List of listener or rule certificates. One-way and two-way authentication are supported. Only one certificate can be specified for one algorithm. If `SSLMode` is `MUTUAL` (two-way authentication), at least one CA certificate is required. 
    */
    @SerializedName("CertList")
    @Expose
    private CertInfo [] CertList;

    /**
     * Get Authentication type. Values: `UNIDIRECTIONAL` (one-way authentication), `MUTUAL` (two-way authentication) 
     * @return SSLMode Authentication type. Values: `UNIDIRECTIONAL` (one-way authentication), `MUTUAL` (two-way authentication)
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set Authentication type. Values: `UNIDIRECTIONAL` (one-way authentication), `MUTUAL` (two-way authentication)
     * @param SSLMode Authentication type. Values: `UNIDIRECTIONAL` (one-way authentication), `MUTUAL` (two-way authentication)
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * Get List of listener or rule certificates. One-way and two-way authentication are supported. Only one certificate can be specified for one algorithm. If `SSLMode` is `MUTUAL` (two-way authentication), at least one CA certificate is required.  
     * @return CertList List of listener or rule certificates. One-way and two-way authentication are supported. Only one certificate can be specified for one algorithm. If `SSLMode` is `MUTUAL` (two-way authentication), at least one CA certificate is required. 
     */
    public CertInfo [] getCertList() {
        return this.CertList;
    }

    /**
     * Set List of listener or rule certificates. One-way and two-way authentication are supported. Only one certificate can be specified for one algorithm. If `SSLMode` is `MUTUAL` (two-way authentication), at least one CA certificate is required. 
     * @param CertList List of listener or rule certificates. One-way and two-way authentication are supported. Only one certificate can be specified for one algorithm. If `SSLMode` is `MUTUAL` (two-way authentication), at least one CA certificate is required. 
     */
    public void setCertList(CertInfo [] CertList) {
        this.CertList = CertList;
    }

    public MultiCertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiCertInfo(MultiCertInfo source) {
        if (source.SSLMode != null) {
            this.SSLMode = new String(source.SSLMode);
        }
        if (source.CertList != null) {
            this.CertList = new CertInfo[source.CertList.length];
            for (int i = 0; i < source.CertList.length; i++) {
                this.CertList[i] = new CertInfo(source.CertList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);
        this.setParamArrayObj(map, prefix + "CertList.", this.CertList);

    }
}

