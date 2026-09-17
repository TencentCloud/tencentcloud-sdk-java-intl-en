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

public class DescribeStorageDetailsRequest extends AbstractModel {

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
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * 
    */
    @SerializedName("Area")
    @Expose
    private String Area;

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
     * @return Interval 
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 
     * @param Interval 
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get  
     * @return StorageType 
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 
     * @param StorageType 
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get  
     * @return Area 
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 
     * @param Area 
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeStorageDetailsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStorageDetailsRequest(DescribeStorageDetailsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

