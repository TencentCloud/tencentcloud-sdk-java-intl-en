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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoundPlaysRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("RoundPlayIds")
    @Expose
    private String [] RoundPlayIds;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

    /**
    * 
    */
    @SerializedName("UpdateTime")
    @Expose
    private TimeRange UpdateTime;

    /**
    * 
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * 
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return RoundPlayIds 
     */
    public String [] getRoundPlayIds() {
        return this.RoundPlayIds;
    }

    /**
     * Set 
     * @param RoundPlayIds 
     */
    public void setRoundPlayIds(String [] RoundPlayIds) {
        this.RoundPlayIds = RoundPlayIds;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public TimeRange getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(TimeRange CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return UpdateTime 
     */
    public TimeRange getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 
     * @param UpdateTime 
     */
    public void setUpdateTime(TimeRange UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get  
     * @return ScrollToken 
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set 
     * @param ScrollToken 
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get  
     * @return Offset 
     * @deprecated
     */
    @Deprecated
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 
     * @param Offset 
     * @deprecated
     */
    @Deprecated
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get  
     * @return Limit 
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 
     * @param Limit 
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRoundPlaysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoundPlaysRequest(DescribeRoundPlaysRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.RoundPlayIds != null) {
            this.RoundPlayIds = new String[source.RoundPlayIds.length];
            for (int i = 0; i < source.RoundPlayIds.length; i++) {
                this.RoundPlayIds[i] = new String(source.RoundPlayIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new TimeRange(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new TimeRange(source.UpdateTime);
        }
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArraySimple(map, prefix + "RoundPlayIds.", this.RoundPlayIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "CreateTime.", this.CreateTime);
        this.setParamObj(map, prefix + "UpdateTime.", this.UpdateTime);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

