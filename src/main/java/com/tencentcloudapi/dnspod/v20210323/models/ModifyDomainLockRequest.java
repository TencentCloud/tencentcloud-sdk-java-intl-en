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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainLockRequest extends AbstractModel {

    /**
    * Domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Number of days to lock the domain. The maximum number of locked days can be obtained by calling the API for getting the permissions of a domain.
    */
    @SerializedName("LockDays")
    @Expose
    private Long LockDays;

    /**
    * The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. You can view all `Domain` and `DomainId` values via the `DescribeDomainList` API.
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
     * Get Domain 
     * @return Domain Domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain
     * @param Domain Domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Number of days to lock the domain. The maximum number of locked days can be obtained by calling the API for getting the permissions of a domain. 
     * @return LockDays Number of days to lock the domain. The maximum number of locked days can be obtained by calling the API for getting the permissions of a domain.
     */
    public Long getLockDays() {
        return this.LockDays;
    }

    /**
     * Set Number of days to lock the domain. The maximum number of locked days can be obtained by calling the API for getting the permissions of a domain.
     * @param LockDays Number of days to lock the domain. The maximum number of locked days can be obtained by calling the API for getting the permissions of a domain.
     */
    public void setLockDays(Long LockDays) {
        this.LockDays = LockDays;
    }

    /**
     * Get The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. You can view all `Domain` and `DomainId` values via the `DescribeDomainList` API. 
     * @return DomainId The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. You can view all `Domain` and `DomainId` values via the `DescribeDomainList` API.
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. You can view all `Domain` and `DomainId` values via the `DescribeDomainList` API.
     * @param DomainId The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. You can view all `Domain` and `DomainId` values via the `DescribeDomainList` API.
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    public ModifyDomainLockRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainLockRequest(ModifyDomainLockRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.LockDays != null) {
            this.LockDays = new Long(source.LockDays);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "LockDays", this.LockDays);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

