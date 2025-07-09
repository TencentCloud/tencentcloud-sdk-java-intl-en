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

public class WafInstanceDetail extends AbstractModel {

    /**
    * The domain.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * Whether to keep the persistent connection.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Keepalive")
    @Expose
    private Long Keepalive;

    /**
     * Get The domain. 
     * @return Domain The domain.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain.
     * @param Domain The domain.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The certificate ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CertId The certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set The certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CertId The certificate ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get Whether to keep the persistent connection.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Keepalive Whether to keep the persistent connection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getKeepalive() {
        return this.Keepalive;
    }

    /**
     * Set Whether to keep the persistent connection.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Keepalive Whether to keep the persistent connection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKeepalive(Long Keepalive) {
        this.Keepalive = Keepalive;
    }

    public WafInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafInstanceDetail(WafInstanceDetail source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Keepalive != null) {
            this.Keepalive = new Long(source.Keepalive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Keepalive", this.Keepalive);

    }
}

