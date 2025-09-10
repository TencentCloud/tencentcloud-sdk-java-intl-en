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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillGroupInfoItem extends AbstractModel {

    /**
    * Skill group id.
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * Skill group name.
    */
    @SerializedName("SkillGroupName")
    @Expose
    private String SkillGroupName;

    /**
    * (Deprecated) type: im, tel, all (full media).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Session allocation policy.
    */
    @SerializedName("RoutePolicy")
    @Expose
    private String RoutePolicy;

    /**
    * Whether the session is allocated to the last serviced agent first.
    */
    @SerializedName("UsingLastSeat")
    @Expose
    private Long UsingLastSeat;

    /**
    * Maximum concurrency number of single client service (default 1 for telephone type).
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * Last modification time.
    */
    @SerializedName("LastModifyTimestamp")
    @Expose
    private Long LastModifyTimestamp;

    /**
    * Skill group type 0-cell phone, 1-online, 3-audio, 4-video.	.	
    */
    @SerializedName("SkillGroupType")
    @Expose
    private Long SkillGroupType;

    /**
    * Intra-Skill group line number.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Specifies whether to enable simultaneous ring.
    */
    @SerializedName("RingAll")
    @Expose
    private Boolean RingAll;

    /**
     * Get Skill group id. 
     * @return SkillGroupId Skill group id.
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set Skill group id.
     * @param SkillGroupId Skill group id.
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get Skill group name. 
     * @return SkillGroupName Skill group name.
     */
    public String getSkillGroupName() {
        return this.SkillGroupName;
    }

    /**
     * Set Skill group name.
     * @param SkillGroupName Skill group name.
     */
    public void setSkillGroupName(String SkillGroupName) {
        this.SkillGroupName = SkillGroupName;
    }

    /**
     * Get (Deprecated) type: im, tel, all (full media). 
     * @return Type (Deprecated) type: im, tel, all (full media).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set (Deprecated) type: im, tel, all (full media).
     * @param Type (Deprecated) type: im, tel, all (full media).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Session allocation policy. 
     * @return RoutePolicy Session allocation policy.
     */
    public String getRoutePolicy() {
        return this.RoutePolicy;
    }

    /**
     * Set Session allocation policy.
     * @param RoutePolicy Session allocation policy.
     */
    public void setRoutePolicy(String RoutePolicy) {
        this.RoutePolicy = RoutePolicy;
    }

    /**
     * Get Whether the session is allocated to the last serviced agent first. 
     * @return UsingLastSeat Whether the session is allocated to the last serviced agent first.
     */
    public Long getUsingLastSeat() {
        return this.UsingLastSeat;
    }

    /**
     * Set Whether the session is allocated to the last serviced agent first.
     * @param UsingLastSeat Whether the session is allocated to the last serviced agent first.
     */
    public void setUsingLastSeat(Long UsingLastSeat) {
        this.UsingLastSeat = UsingLastSeat;
    }

    /**
     * Get Maximum concurrency number of single client service (default 1 for telephone type). 
     * @return MaxConcurrency Maximum concurrency number of single client service (default 1 for telephone type).
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set Maximum concurrency number of single client service (default 1 for telephone type).
     * @param MaxConcurrency Maximum concurrency number of single client service (default 1 for telephone type).
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get Last modification time. 
     * @return LastModifyTimestamp Last modification time.
     */
    public Long getLastModifyTimestamp() {
        return this.LastModifyTimestamp;
    }

    /**
     * Set Last modification time.
     * @param LastModifyTimestamp Last modification time.
     */
    public void setLastModifyTimestamp(Long LastModifyTimestamp) {
        this.LastModifyTimestamp = LastModifyTimestamp;
    }

    /**
     * Get Skill group type 0-cell phone, 1-online, 3-audio, 4-video.	.	 
     * @return SkillGroupType Skill group type 0-cell phone, 1-online, 3-audio, 4-video.	.	
     */
    public Long getSkillGroupType() {
        return this.SkillGroupType;
    }

    /**
     * Set Skill group type 0-cell phone, 1-online, 3-audio, 4-video.	.	
     * @param SkillGroupType Skill group type 0-cell phone, 1-online, 3-audio, 4-video.	.	
     */
    public void setSkillGroupType(Long SkillGroupType) {
        this.SkillGroupType = SkillGroupType;
    }

    /**
     * Get Intra-Skill group line number. 
     * @return Alias Intra-Skill group line number.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Intra-Skill group line number.
     * @param Alias Intra-Skill group line number.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Specifies whether to enable simultaneous ring. 
     * @return RingAll Specifies whether to enable simultaneous ring.
     */
    public Boolean getRingAll() {
        return this.RingAll;
    }

    /**
     * Set Specifies whether to enable simultaneous ring.
     * @param RingAll Specifies whether to enable simultaneous ring.
     */
    public void setRingAll(Boolean RingAll) {
        this.RingAll = RingAll;
    }

    public SkillGroupInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillGroupInfoItem(SkillGroupInfoItem source) {
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.SkillGroupName != null) {
            this.SkillGroupName = new String(source.SkillGroupName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RoutePolicy != null) {
            this.RoutePolicy = new String(source.RoutePolicy);
        }
        if (source.UsingLastSeat != null) {
            this.UsingLastSeat = new Long(source.UsingLastSeat);
        }
        if (source.MaxConcurrency != null) {
            this.MaxConcurrency = new Long(source.MaxConcurrency);
        }
        if (source.LastModifyTimestamp != null) {
            this.LastModifyTimestamp = new Long(source.LastModifyTimestamp);
        }
        if (source.SkillGroupType != null) {
            this.SkillGroupType = new Long(source.SkillGroupType);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.RingAll != null) {
            this.RingAll = new Boolean(source.RingAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "SkillGroupName", this.SkillGroupName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RoutePolicy", this.RoutePolicy);
        this.setParamSimple(map, prefix + "UsingLastSeat", this.UsingLastSeat);
        this.setParamSimple(map, prefix + "MaxConcurrency", this.MaxConcurrency);
        this.setParamSimple(map, prefix + "LastModifyTimestamp", this.LastModifyTimestamp);
        this.setParamSimple(map, prefix + "SkillGroupType", this.SkillGroupType);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "RingAll", this.RingAll);

    }
}

