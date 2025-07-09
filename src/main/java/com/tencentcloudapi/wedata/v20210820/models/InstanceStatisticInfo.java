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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceStatisticInfo extends AbstractModel {

    /**
    * Instance Status Trend Statistics
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CountList")
    @Expose
    private Long [] CountList;

    /**
    * Instance Status Trend Time Segmentation
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TimeList")
    @Expose
    private String [] TimeList;

    /**
    * Instance Status Identification: WAITING_RUNNING, KILLING, FAILED, FAILED_TRYING, SUCCEED, respectively indicate waiting for execution, terminating, failed, trying again, successful, used for Instance Status Distribution and Instance Status Trend
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Used for Instance Status Distribution Count
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * Current Display Time
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ShowTime")
    @Expose
    private String ShowTime;

    /**
    * 1
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ReportTime")
    @Expose
    private String ReportTime;

    /**
    * 1
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Instance Status Trend Statistics
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CountList Instance Status Trend Statistics
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long [] getCountList() {
        return this.CountList;
    }

    /**
     * Set Instance Status Trend Statistics
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CountList Instance Status Trend Statistics
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCountList(Long [] CountList) {
        this.CountList = CountList;
    }

    /**
     * Get Instance Status Trend Time Segmentation
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TimeList Instance Status Trend Time Segmentation
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getTimeList() {
        return this.TimeList;
    }

    /**
     * Set Instance Status Trend Time Segmentation
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TimeList Instance Status Trend Time Segmentation
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTimeList(String [] TimeList) {
        this.TimeList = TimeList;
    }

    /**
     * Get Instance Status Identification: WAITING_RUNNING, KILLING, FAILED, FAILED_TRYING, SUCCEED, respectively indicate waiting for execution, terminating, failed, trying again, successful, used for Instance Status Distribution and Instance Status Trend 
     * @return InstanceStatus Instance Status Identification: WAITING_RUNNING, KILLING, FAILED, FAILED_TRYING, SUCCEED, respectively indicate waiting for execution, terminating, failed, trying again, successful, used for Instance Status Distribution and Instance Status Trend
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance Status Identification: WAITING_RUNNING, KILLING, FAILED, FAILED_TRYING, SUCCEED, respectively indicate waiting for execution, terminating, failed, trying again, successful, used for Instance Status Distribution and Instance Status Trend
     * @param InstanceStatus Instance Status Identification: WAITING_RUNNING, KILLING, FAILED, FAILED_TRYING, SUCCEED, respectively indicate waiting for execution, terminating, failed, trying again, successful, used for Instance Status Distribution and Instance Status Trend
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Used for Instance Status Distribution Count 
     * @return InstanceCount Used for Instance Status Distribution Count
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set Used for Instance Status Distribution Count
     * @param InstanceCount Used for Instance Status Distribution Count
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get Current Display Time
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ShowTime Current Display Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getShowTime() {
        return this.ShowTime;
    }

    /**
     * Set Current Display Time
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ShowTime Current Display Time
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setShowTime(String ShowTime) {
        this.ShowTime = ShowTime;
    }

    /**
     * Get 1
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ReportTime 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getReportTime() {
        return this.ReportTime;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ReportTime 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setReportTime(String ReportTime) {
        this.ReportTime = ReportTime;
    }

    /**
     * Get 1
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Count 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 1
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Count 1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public InstanceStatisticInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceStatisticInfo(InstanceStatisticInfo source) {
        if (source.CountList != null) {
            this.CountList = new Long[source.CountList.length];
            for (int i = 0; i < source.CountList.length; i++) {
                this.CountList[i] = new Long(source.CountList[i]);
            }
        }
        if (source.TimeList != null) {
            this.TimeList = new String[source.TimeList.length];
            for (int i = 0; i < source.TimeList.length; i++) {
                this.TimeList[i] = new String(source.TimeList[i]);
            }
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.ShowTime != null) {
            this.ShowTime = new String(source.ShowTime);
        }
        if (source.ReportTime != null) {
            this.ReportTime = new String(source.ReportTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CountList.", this.CountList);
        this.setParamArraySimple(map, prefix + "TimeList.", this.TimeList);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "ShowTime", this.ShowTime);
        this.setParamSimple(map, prefix + "ReportTime", this.ReportTime);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

