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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRecordToGroupRequest extends AbstractModel {

    /**
    * Domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Group ID
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * Record ID. Separate multiple IDs by vertical bar ("|").
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored.
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
     * Get Group ID 
     * @return GroupId Group ID
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID
     * @param GroupId Group ID
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Record ID. Separate multiple IDs by vertical bar ("|"). 
     * @return RecordId Record ID. Separate multiple IDs by vertical bar ("|").
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Record ID. Separate multiple IDs by vertical bar ("|").
     * @param RecordId Record ID. Separate multiple IDs by vertical bar ("|").
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored. 
     * @return DomainId The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored.
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored.
     * @param DomainId The domain ID. `DomainId` takes priority over `Domain`. If `DomainId` is passed in, `Domain` is ignored.
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    public ModifyRecordToGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRecordToGroupRequest(ModifyRecordToGroupRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
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
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

