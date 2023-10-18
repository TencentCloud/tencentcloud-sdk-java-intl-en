/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class LiveInstanceDetail extends AbstractModel {

    /**
    * The domain.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The ID of the associated certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * The status. Valid values: `-1`: No certificate is associated with the domain.
`1`: HTTPS is enabled for the domain.
`0`: HTTPS is disabled for the domain.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get The ID of the associated certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CertId The ID of the associated certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set The ID of the associated certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CertId The ID of the associated certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get The status. Valid values: `-1`: No certificate is associated with the domain.
`1`: HTTPS is enabled for the domain.
`0`: HTTPS is disabled for the domain. 
     * @return Status The status. Valid values: `-1`: No certificate is associated with the domain.
`1`: HTTPS is enabled for the domain.
`0`: HTTPS is disabled for the domain.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set The status. Valid values: `-1`: No certificate is associated with the domain.
`1`: HTTPS is enabled for the domain.
`0`: HTTPS is disabled for the domain.
     * @param Status The status. Valid values: `-1`: No certificate is associated with the domain.
`1`: HTTPS is enabled for the domain.
`0`: HTTPS is disabled for the domain.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public LiveInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveInstanceDetail(LiveInstanceDetail source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

