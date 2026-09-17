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

public class DescribeCdnLogsRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get  
     * @return DomainName 
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 
     * @param DomainName 
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get  
     * @return StartTime 
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 
     * @param StartTime 
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get  
     * @return EndTime 
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 
     * @param EndTime 
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

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

    /**
     * Get  
     * @return Offset 
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 
     * @param Offset 
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeCdnLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCdnLogsRequest(DescribeCdnLogsRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

