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

public class DescribeCDNUsageDataRequest extends AbstractModel {

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
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("DataInterval")
    @Expose
    private Long DataInterval;

    /**
    * 
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

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
     * @return DataType 
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set 
     * @param DataType 
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
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
     * @return DataInterval 
     */
    public Long getDataInterval() {
        return this.DataInterval;
    }

    /**
     * Set 
     * @param DataInterval 
     */
    public void setDataInterval(Long DataInterval) {
        this.DataInterval = DataInterval;
    }

    /**
     * Get  
     * @return DomainNames 
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set 
     * @param DomainNames 
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    public DescribeCDNUsageDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCDNUsageDataRequest(DescribeCDNUsageDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.DataInterval != null) {
            this.DataInterval = new Long(source.DataInterval);
        }
        if (source.DomainNames != null) {
            this.DomainNames = new String[source.DomainNames.length];
            for (int i = 0; i < source.DomainNames.length; i++) {
                this.DomainNames[i] = new String(source.DomainNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "DataInterval", this.DataInterval);
        this.setParamArraySimple(map, prefix + "DomainNames.", this.DomainNames);

    }
}

