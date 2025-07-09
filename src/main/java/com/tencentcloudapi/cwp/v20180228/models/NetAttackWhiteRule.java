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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetAttackWhiteRule extends AbstractModel {

    /**
    * Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Rule description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 0: A group of Quuid 1: All hosts
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * Whether to process previous events: 0: do not process; 1: process
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DealOldEvents")
    @Expose
    private Long DealOldEvents;

    /**
    * Host QUUIDs, separated by semicolons (;).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quuids")
    @Expose
    private String Quuids;

    /**
    * Source IP. Single IP: 1.1.1.1, IP Range: 1.1.1.1-1.1.2.1, IP Range: 1.1.1.0/24, separated by semicolons (;)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SrcIP")
    @Expose
    private String SrcIP;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get Rule ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Id Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Id Rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Rule description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Rule description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Rule description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 0: A group of Quuid 1: All hosts
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Scope 0: A group of Quuid 1: All hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set 0: A group of Quuid 1: All hosts
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Scope 0: A group of Quuid 1: All hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get Whether to process previous events: 0: do not process; 1: process
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DealOldEvents Whether to process previous events: 0: do not process; 1: process
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDealOldEvents() {
        return this.DealOldEvents;
    }

    /**
     * Set Whether to process previous events: 0: do not process; 1: process
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DealOldEvents Whether to process previous events: 0: do not process; 1: process
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDealOldEvents(Long DealOldEvents) {
        this.DealOldEvents = DealOldEvents;
    }

    /**
     * Get Host QUUIDs, separated by semicolons (;).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Quuids Host QUUIDs, separated by semicolons (;).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getQuuids() {
        return this.Quuids;
    }

    /**
     * Set Host QUUIDs, separated by semicolons (;).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Quuids Host QUUIDs, separated by semicolons (;).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuuids(String Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get Source IP. Single IP: 1.1.1.1, IP Range: 1.1.1.1-1.1.2.1, IP Range: 1.1.1.0/24, separated by semicolons (;)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SrcIP Source IP. Single IP: 1.1.1.1, IP Range: 1.1.1.1-1.1.2.1, IP Range: 1.1.1.0/24, separated by semicolons (;)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSrcIP() {
        return this.SrcIP;
    }

    /**
     * Set Source IP. Single IP: 1.1.1.1, IP Range: 1.1.1.1-1.1.2.1, IP Range: 1.1.1.0/24, separated by semicolons (;)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SrcIP Source IP. Single IP: 1.1.1.1, IP Range: 1.1.1.1-1.1.2.1, IP Range: 1.1.1.0/24, separated by semicolons (;)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Modification time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Modification time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public NetAttackWhiteRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetAttackWhiteRule(NetAttackWhiteRule source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.DealOldEvents != null) {
            this.DealOldEvents = new Long(source.DealOldEvents);
        }
        if (source.Quuids != null) {
            this.Quuids = new String(source.Quuids);
        }
        if (source.SrcIP != null) {
            this.SrcIP = new String(source.SrcIP);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "DealOldEvents", this.DealOldEvents);
        this.setParamSimple(map, prefix + "Quuids", this.Quuids);
        this.setParamSimple(map, prefix + "SrcIP", this.SrcIP);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

