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

public class ModifyRecordStatusRequest extends AbstractModel {

    /**
    * Domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The record ID. You can view all DNS records and their IDs via the `DescribeRecordList` API.
    */
    @SerializedName("RecordId")
    @Expose
    private Long RecordId;

    /**
    * Record status. Valid values: `ENABLE`, `DISABLE`. If `DISABLE` is passed in, the DNS record won't take effect, and the limit on round-robin DNS won't be verified.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
     * Get The record ID. You can view all DNS records and their IDs via the `DescribeRecordList` API. 
     * @return RecordId The record ID. You can view all DNS records and their IDs via the `DescribeRecordList` API.
     */
    public Long getRecordId() {
        return this.RecordId;
    }

    /**
     * Set The record ID. You can view all DNS records and their IDs via the `DescribeRecordList` API.
     * @param RecordId The record ID. You can view all DNS records and their IDs via the `DescribeRecordList` API.
     */
    public void setRecordId(Long RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get Record status. Valid values: `ENABLE`, `DISABLE`. If `DISABLE` is passed in, the DNS record won't take effect, and the limit on round-robin DNS won't be verified. 
     * @return Status Record status. Valid values: `ENABLE`, `DISABLE`. If `DISABLE` is passed in, the DNS record won't take effect, and the limit on round-robin DNS won't be verified.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Record status. Valid values: `ENABLE`, `DISABLE`. If `DISABLE` is passed in, the DNS record won't take effect, and the limit on round-robin DNS won't be verified.
     * @param Status Record status. Valid values: `ENABLE`, `DISABLE`. If `DISABLE` is passed in, the DNS record won't take effect, and the limit on round-robin DNS won't be verified.
     */
    public void setStatus(String Status) {
        this.Status = Status;
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

    public ModifyRecordStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRecordStatusRequest(ModifyRecordStatusRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RecordId != null) {
            this.RecordId = new Long(source.RecordId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

