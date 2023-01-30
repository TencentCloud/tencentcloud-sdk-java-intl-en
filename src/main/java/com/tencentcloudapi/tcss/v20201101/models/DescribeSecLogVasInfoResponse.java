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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecLogVasInfoResponse extends AbstractModel{

    /**
    * Purchase status
`Pending`: To be purchased.
`Normal`: Purchased.
`Isolate`: Isolated.
    */
    @SerializedName("BuyStatus")
    @Expose
    private String BuyStatus;

    /**
    * Storage period in months
    */
    @SerializedName("LogSaveMonth")
    @Expose
    private Long LogSaveMonth;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Storage capacity (GB)
    */
    @SerializedName("LogCapacity")
    @Expose
    private Long LogCapacity;

    /**
    * Resource ID
    */
    @SerializedName("ResourceID")
    @Expose
    private String ResourceID;

    /**
    * Whether it has been purchased before. Valid values: `false` (no); `true` (yes).
    */
    @SerializedName("IsPurchased")
    @Expose
    private Boolean IsPurchased;

    /**
    * Trial storage capacity (GB)
    */
    @SerializedName("TrialCapacity")
    @Expose
    private Long TrialCapacity;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Purchase status
`Pending`: To be purchased.
`Normal`: Purchased.
`Isolate`: Isolated. 
     * @return BuyStatus Purchase status
`Pending`: To be purchased.
`Normal`: Purchased.
`Isolate`: Isolated.
     */
    public String getBuyStatus() {
        return this.BuyStatus;
    }

    /**
     * Set Purchase status
`Pending`: To be purchased.
`Normal`: Purchased.
`Isolate`: Isolated.
     * @param BuyStatus Purchase status
`Pending`: To be purchased.
`Normal`: Purchased.
`Isolate`: Isolated.
     */
    public void setBuyStatus(String BuyStatus) {
        this.BuyStatus = BuyStatus;
    }

    /**
     * Get Storage period in months 
     * @return LogSaveMonth Storage period in months
     */
    public Long getLogSaveMonth() {
        return this.LogSaveMonth;
    }

    /**
     * Set Storage period in months
     * @param LogSaveMonth Storage period in months
     */
    public void setLogSaveMonth(Long LogSaveMonth) {
        this.LogSaveMonth = LogSaveMonth;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Storage capacity (GB) 
     * @return LogCapacity Storage capacity (GB)
     */
    public Long getLogCapacity() {
        return this.LogCapacity;
    }

    /**
     * Set Storage capacity (GB)
     * @param LogCapacity Storage capacity (GB)
     */
    public void setLogCapacity(Long LogCapacity) {
        this.LogCapacity = LogCapacity;
    }

    /**
     * Get Resource ID 
     * @return ResourceID Resource ID
     */
    public String getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set Resource ID
     * @param ResourceID Resource ID
     */
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * Get Whether it has been purchased before. Valid values: `false` (no); `true` (yes). 
     * @return IsPurchased Whether it has been purchased before. Valid values: `false` (no); `true` (yes).
     */
    public Boolean getIsPurchased() {
        return this.IsPurchased;
    }

    /**
     * Set Whether it has been purchased before. Valid values: `false` (no); `true` (yes).
     * @param IsPurchased Whether it has been purchased before. Valid values: `false` (no); `true` (yes).
     */
    public void setIsPurchased(Boolean IsPurchased) {
        this.IsPurchased = IsPurchased;
    }

    /**
     * Get Trial storage capacity (GB) 
     * @return TrialCapacity Trial storage capacity (GB)
     */
    public Long getTrialCapacity() {
        return this.TrialCapacity;
    }

    /**
     * Set Trial storage capacity (GB)
     * @param TrialCapacity Trial storage capacity (GB)
     */
    public void setTrialCapacity(Long TrialCapacity) {
        this.TrialCapacity = TrialCapacity;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSecLogVasInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecLogVasInfoResponse(DescribeSecLogVasInfoResponse source) {
        if (source.BuyStatus != null) {
            this.BuyStatus = new String(source.BuyStatus);
        }
        if (source.LogSaveMonth != null) {
            this.LogSaveMonth = new Long(source.LogSaveMonth);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LogCapacity != null) {
            this.LogCapacity = new Long(source.LogCapacity);
        }
        if (source.ResourceID != null) {
            this.ResourceID = new String(source.ResourceID);
        }
        if (source.IsPurchased != null) {
            this.IsPurchased = new Boolean(source.IsPurchased);
        }
        if (source.TrialCapacity != null) {
            this.TrialCapacity = new Long(source.TrialCapacity);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BuyStatus", this.BuyStatus);
        this.setParamSimple(map, prefix + "LogSaveMonth", this.LogSaveMonth);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LogCapacity", this.LogCapacity);
        this.setParamSimple(map, prefix + "ResourceID", this.ResourceID);
        this.setParamSimple(map, prefix + "IsPurchased", this.IsPurchased);
        this.setParamSimple(map, prefix + "TrialCapacity", this.TrialCapacity);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

