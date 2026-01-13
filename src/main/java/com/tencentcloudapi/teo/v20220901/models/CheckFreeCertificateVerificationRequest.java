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

public class CheckFreeCertificateVerificationRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Acceleration domain name, that domain name used when [applying for free certificate](https://www.tencentcloud.com/document/product/1552/124807?from_cn_redirect=1).
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Acceleration domain name, that domain name used when [applying for free certificate](https://www.tencentcloud.com/document/product/1552/124807?from_cn_redirect=1). 
     * @return Domain Acceleration domain name, that domain name used when [applying for free certificate](https://www.tencentcloud.com/document/product/1552/124807?from_cn_redirect=1).
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Acceleration domain name, that domain name used when [applying for free certificate](https://www.tencentcloud.com/document/product/1552/124807?from_cn_redirect=1).
     * @param Domain Acceleration domain name, that domain name used when [applying for free certificate](https://www.tencentcloud.com/document/product/1552/124807?from_cn_redirect=1).
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public CheckFreeCertificateVerificationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckFreeCertificateVerificationRequest(CheckFreeCertificateVerificationRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

