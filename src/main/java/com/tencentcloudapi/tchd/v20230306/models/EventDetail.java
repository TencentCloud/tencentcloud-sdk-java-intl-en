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
package com.tencentcloudapi.tchd.v20230306.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventDetail extends AbstractModel{

    /**
    * Product ID.
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * Product name.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Region ID.
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Region name.
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Event start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Event end time. If the event is still ongoing and has not ended, the end time will be empty.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Current status: Normally, Informational, Degradation.
    */
    @SerializedName("CurrentStatus")
    @Expose
    private String CurrentStatus;

    /**
     * Get Product ID. 
     * @return ProductId Product ID.
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set Product ID.
     * @param ProductId Product ID.
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get Product name. 
     * @return ProductName Product name.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Product name.
     * @param ProductName Product name.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Region ID. 
     * @return RegionId Region ID.
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID.
     * @param RegionId Region ID.
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region name. 
     * @return RegionName Region name.
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region name.
     * @param RegionName Region name.
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Event start time. 
     * @return StartTime Event start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Event start time.
     * @param StartTime Event start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Event end time. If the event is still ongoing and has not ended, the end time will be empty. 
     * @return EndTime Event end time. If the event is still ongoing and has not ended, the end time will be empty.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Event end time. If the event is still ongoing and has not ended, the end time will be empty.
     * @param EndTime Event end time. If the event is still ongoing and has not ended, the end time will be empty.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Current status: Normally, Informational, Degradation. 
     * @return CurrentStatus Current status: Normally, Informational, Degradation.
     */
    public String getCurrentStatus() {
        return this.CurrentStatus;
    }

    /**
     * Set Current status: Normally, Informational, Degradation.
     * @param CurrentStatus Current status: Normally, Informational, Degradation.
     */
    public void setCurrentStatus(String CurrentStatus) {
        this.CurrentStatus = CurrentStatus;
    }

    public EventDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventDetail(EventDetail source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CurrentStatus != null) {
            this.CurrentStatus = new String(source.CurrentStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CurrentStatus", this.CurrentStatus);

    }
}

