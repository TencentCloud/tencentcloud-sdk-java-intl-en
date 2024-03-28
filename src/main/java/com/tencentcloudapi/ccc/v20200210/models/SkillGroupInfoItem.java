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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillGroupInfoItem extends AbstractModel {

    /**
    * Skill group ID.
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
    * (Deprecated) Type: IM, TEL, ALL (full media).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Session allocation policy.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RoutePolicy")
    @Expose
    private String RoutePolicy;

    /**
    * Whether the session is allocated to the last serviced agent first.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UsingLastSeat")
    @Expose
    private Long UsingLastSeat;

    /**
    * Maximum concurrency number of single client service (default 1 for telephone type).
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MaxConcurrency")
    @Expose
    private Long MaxConcurrency;

    /**
    * Last modification time.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastModifyTimestamp")
    @Expose
    private Long LastModifyTimestamp;

    /**
    * Skill group type 0-phone, 1-online, 3-audio, 4-video.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SkillGroupType")
    @Expose
    private Long SkillGroupType;

    /**
     * Get Skill group ID. 
     * @return SkillGroupId Skill group ID.
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set Skill group ID.
     * @param SkillGroupId Skill group ID.
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
     * Get (Deprecated) Type: IM, TEL, ALL (full media). 
     * @return Type (Deprecated) Type: IM, TEL, ALL (full media).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set (Deprecated) Type: IM, TEL, ALL (full media).
     * @param Type (Deprecated) Type: IM, TEL, ALL (full media).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Session allocation policy.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RoutePolicy Session allocation policy.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRoutePolicy() {
        return this.RoutePolicy;
    }

    /**
     * Set Session allocation policy.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RoutePolicy Session allocation policy.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRoutePolicy(String RoutePolicy) {
        this.RoutePolicy = RoutePolicy;
    }

    /**
     * Get Whether the session is allocated to the last serviced agent first.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return UsingLastSeat Whether the session is allocated to the last serviced agent first.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getUsingLastSeat() {
        return this.UsingLastSeat;
    }

    /**
     * Set Whether the session is allocated to the last serviced agent first.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param UsingLastSeat Whether the session is allocated to the last serviced agent first.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setUsingLastSeat(Long UsingLastSeat) {
        this.UsingLastSeat = UsingLastSeat;
    }

    /**
     * Get Maximum concurrency number of single client service (default 1 for telephone type).
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MaxConcurrency Maximum concurrency number of single client service (default 1 for telephone type).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMaxConcurrency() {
        return this.MaxConcurrency;
    }

    /**
     * Set Maximum concurrency number of single client service (default 1 for telephone type).
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MaxConcurrency Maximum concurrency number of single client service (default 1 for telephone type).
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMaxConcurrency(Long MaxConcurrency) {
        this.MaxConcurrency = MaxConcurrency;
    }

    /**
     * Get Last modification time.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastModifyTimestamp Last modification time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getLastModifyTimestamp() {
        return this.LastModifyTimestamp;
    }

    /**
     * Set Last modification time.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastModifyTimestamp Last modification time.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastModifyTimestamp(Long LastModifyTimestamp) {
        this.LastModifyTimestamp = LastModifyTimestamp;
    }

    /**
     * Get Skill group type 0-phone, 1-online, 3-audio, 4-video.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SkillGroupType Skill group type 0-phone, 1-online, 3-audio, 4-video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSkillGroupType() {
        return this.SkillGroupType;
    }

    /**
     * Set Skill group type 0-phone, 1-online, 3-audio, 4-video.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SkillGroupType Skill group type 0-phone, 1-online, 3-audio, 4-video.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSkillGroupType(Long SkillGroupType) {
        this.SkillGroupType = SkillGroupType;
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

    }
}

