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

public class DescribeVirusSummaryResponse extends AbstractModel{

    /**
    * ID of the last scan task
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Number of containers affected by the trojan
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskContainerCnt")
    @Expose
    private Long RiskContainerCnt;

    /**
    * Number of pending risks
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * Update time of the virus library
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VirusDataBaseModifyTime")
    @Expose
    private String VirusDataBaseModifyTime;

    /**
    * Increase in the number of containers affected by trojans from yesterday
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskContainerIncrease")
    @Expose
    private Long RiskContainerIncrease;

    /**
    * Increase in the number of pending risks from yesterday
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RiskIncrease")
    @Expose
    private Long RiskIncrease;

    /**
    * Increase in the number of isolated events from yesterday
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolateIncrease")
    @Expose
    private Long IsolateIncrease;

    /**
    * Total number of isolated events
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsolateCnt")
    @Expose
    private Long IsolateCnt;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ID of the last scan task 
     * @return TaskId ID of the last scan task
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set ID of the last scan task
     * @param TaskId ID of the last scan task
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Number of containers affected by the trojan
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskContainerCnt Number of containers affected by the trojan
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRiskContainerCnt() {
        return this.RiskContainerCnt;
    }

    /**
     * Set Number of containers affected by the trojan
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskContainerCnt Number of containers affected by the trojan
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskContainerCnt(Long RiskContainerCnt) {
        this.RiskContainerCnt = RiskContainerCnt;
    }

    /**
     * Get Number of pending risks
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskCnt Number of pending risks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set Number of pending risks
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskCnt Number of pending risks
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get Update time of the virus library
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VirusDataBaseModifyTime Update time of the virus library
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVirusDataBaseModifyTime() {
        return this.VirusDataBaseModifyTime;
    }

    /**
     * Set Update time of the virus library
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VirusDataBaseModifyTime Update time of the virus library
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVirusDataBaseModifyTime(String VirusDataBaseModifyTime) {
        this.VirusDataBaseModifyTime = VirusDataBaseModifyTime;
    }

    /**
     * Get Increase in the number of containers affected by trojans from yesterday
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskContainerIncrease Increase in the number of containers affected by trojans from yesterday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRiskContainerIncrease() {
        return this.RiskContainerIncrease;
    }

    /**
     * Set Increase in the number of containers affected by trojans from yesterday
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskContainerIncrease Increase in the number of containers affected by trojans from yesterday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskContainerIncrease(Long RiskContainerIncrease) {
        this.RiskContainerIncrease = RiskContainerIncrease;
    }

    /**
     * Get Increase in the number of pending risks from yesterday
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RiskIncrease Increase in the number of pending risks from yesterday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRiskIncrease() {
        return this.RiskIncrease;
    }

    /**
     * Set Increase in the number of pending risks from yesterday
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RiskIncrease Increase in the number of pending risks from yesterday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRiskIncrease(Long RiskIncrease) {
        this.RiskIncrease = RiskIncrease;
    }

    /**
     * Get Increase in the number of isolated events from yesterday
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsolateIncrease Increase in the number of isolated events from yesterday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsolateIncrease() {
        return this.IsolateIncrease;
    }

    /**
     * Set Increase in the number of isolated events from yesterday
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsolateIncrease Increase in the number of isolated events from yesterday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolateIncrease(Long IsolateIncrease) {
        this.IsolateIncrease = IsolateIncrease;
    }

    /**
     * Get Total number of isolated events
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsolateCnt Total number of isolated events
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIsolateCnt() {
        return this.IsolateCnt;
    }

    /**
     * Set Total number of isolated events
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsolateCnt Total number of isolated events
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsolateCnt(Long IsolateCnt) {
        this.IsolateCnt = IsolateCnt;
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

    public DescribeVirusSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusSummaryResponse(DescribeVirusSummaryResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RiskContainerCnt != null) {
            this.RiskContainerCnt = new Long(source.RiskContainerCnt);
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new Long(source.RiskCnt);
        }
        if (source.VirusDataBaseModifyTime != null) {
            this.VirusDataBaseModifyTime = new String(source.VirusDataBaseModifyTime);
        }
        if (source.RiskContainerIncrease != null) {
            this.RiskContainerIncrease = new Long(source.RiskContainerIncrease);
        }
        if (source.RiskIncrease != null) {
            this.RiskIncrease = new Long(source.RiskIncrease);
        }
        if (source.IsolateIncrease != null) {
            this.IsolateIncrease = new Long(source.IsolateIncrease);
        }
        if (source.IsolateCnt != null) {
            this.IsolateCnt = new Long(source.IsolateCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RiskContainerCnt", this.RiskContainerCnt);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "VirusDataBaseModifyTime", this.VirusDataBaseModifyTime);
        this.setParamSimple(map, prefix + "RiskContainerIncrease", this.RiskContainerIncrease);
        this.setParamSimple(map, prefix + "RiskIncrease", this.RiskIncrease);
        this.setParamSimple(map, prefix + "IsolateIncrease", this.IsolateIncrease);
        this.setParamSimple(map, prefix + "IsolateCnt", this.IsolateCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

