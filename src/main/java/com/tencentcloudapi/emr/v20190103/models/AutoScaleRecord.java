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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScaleRecord extends AbstractModel {

    /**
    * Name of the scale-in or scale-out rule.
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * "SCALE_OUT" and "SCALE_IN", representing expansion and reduction respectively.
    */
    @SerializedName("ScaleAction")
    @Expose
    private String ScaleAction;

    /**
    * The values are "SUCCESS", "FAILED", "PART_SUCCESS", "IN_PROCESS", which indicate success, failure, partial success, and in-progress, respectively.
    */
    @SerializedName("ActionStatus")
    @Expose
    private String ActionStatus;

    /**
    * Process initiation time.
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

    /**
    * Description related to auto-scaling.
    */
    @SerializedName("ScaleInfo")
    @Expose
    private String ScaleInfo;

    /**
    * Valid only when ScaleAction is SCALE_OUT.
    */
    @SerializedName("ExpectScaleNum")
    @Expose
    private Long ExpectScaleNum;

    /**
    * Process termination time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Policy type. Valid values: 1 (load-based scaling), 2 (time-based scaling).
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * Specification information used during scale-out.
    */
    @SerializedName("SpecInfo")
    @Expose
    private String SpecInfo;

    /**
    * Compensatory scale-out. Valid values: 0 (disabled), 1 (enabled).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompensateFlag")
    @Expose
    private Long CompensateFlag;

    /**
    * Number of compensations
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CompensateCount")
    @Expose
    private Long CompensateCount;

    /**
    * 
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * 
    */
    @SerializedName("RetryInfo")
    @Expose
    private String RetryInfo;

    /**
     * Get Name of the scale-in or scale-out rule. 
     * @return StrategyName Name of the scale-in or scale-out rule.
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Name of the scale-in or scale-out rule.
     * @param StrategyName Name of the scale-in or scale-out rule.
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get "SCALE_OUT" and "SCALE_IN", representing expansion and reduction respectively. 
     * @return ScaleAction "SCALE_OUT" and "SCALE_IN", representing expansion and reduction respectively.
     */
    public String getScaleAction() {
        return this.ScaleAction;
    }

    /**
     * Set "SCALE_OUT" and "SCALE_IN", representing expansion and reduction respectively.
     * @param ScaleAction "SCALE_OUT" and "SCALE_IN", representing expansion and reduction respectively.
     */
    public void setScaleAction(String ScaleAction) {
        this.ScaleAction = ScaleAction;
    }

    /**
     * Get The values are "SUCCESS", "FAILED", "PART_SUCCESS", "IN_PROCESS", which indicate success, failure, partial success, and in-progress, respectively. 
     * @return ActionStatus The values are "SUCCESS", "FAILED", "PART_SUCCESS", "IN_PROCESS", which indicate success, failure, partial success, and in-progress, respectively.
     */
    public String getActionStatus() {
        return this.ActionStatus;
    }

    /**
     * Set The values are "SUCCESS", "FAILED", "PART_SUCCESS", "IN_PROCESS", which indicate success, failure, partial success, and in-progress, respectively.
     * @param ActionStatus The values are "SUCCESS", "FAILED", "PART_SUCCESS", "IN_PROCESS", which indicate success, failure, partial success, and in-progress, respectively.
     */
    public void setActionStatus(String ActionStatus) {
        this.ActionStatus = ActionStatus;
    }

    /**
     * Get Process initiation time. 
     * @return ActionTime Process initiation time.
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * Set Process initiation time.
     * @param ActionTime Process initiation time.
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

    /**
     * Get Description related to auto-scaling. 
     * @return ScaleInfo Description related to auto-scaling.
     */
    public String getScaleInfo() {
        return this.ScaleInfo;
    }

    /**
     * Set Description related to auto-scaling.
     * @param ScaleInfo Description related to auto-scaling.
     */
    public void setScaleInfo(String ScaleInfo) {
        this.ScaleInfo = ScaleInfo;
    }

    /**
     * Get Valid only when ScaleAction is SCALE_OUT. 
     * @return ExpectScaleNum Valid only when ScaleAction is SCALE_OUT.
     */
    public Long getExpectScaleNum() {
        return this.ExpectScaleNum;
    }

    /**
     * Set Valid only when ScaleAction is SCALE_OUT.
     * @param ExpectScaleNum Valid only when ScaleAction is SCALE_OUT.
     */
    public void setExpectScaleNum(Long ExpectScaleNum) {
        this.ExpectScaleNum = ExpectScaleNum;
    }

    /**
     * Get Process termination time. 
     * @return EndTime Process termination time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Process termination time.
     * @param EndTime Process termination time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Policy type. Valid values: 1 (load-based scaling), 2 (time-based scaling). 
     * @return StrategyType Policy type. Valid values: 1 (load-based scaling), 2 (time-based scaling).
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set Policy type. Valid values: 1 (load-based scaling), 2 (time-based scaling).
     * @param StrategyType Policy type. Valid values: 1 (load-based scaling), 2 (time-based scaling).
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get Specification information used during scale-out. 
     * @return SpecInfo Specification information used during scale-out.
     */
    public String getSpecInfo() {
        return this.SpecInfo;
    }

    /**
     * Set Specification information used during scale-out.
     * @param SpecInfo Specification information used during scale-out.
     */
    public void setSpecInfo(String SpecInfo) {
        this.SpecInfo = SpecInfo;
    }

    /**
     * Get Compensatory scale-out. Valid values: 0 (disabled), 1 (enabled).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CompensateFlag Compensatory scale-out. Valid values: 0 (disabled), 1 (enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCompensateFlag() {
        return this.CompensateFlag;
    }

    /**
     * Set Compensatory scale-out. Valid values: 0 (disabled), 1 (enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CompensateFlag Compensatory scale-out. Valid values: 0 (disabled), 1 (enabled).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompensateFlag(Long CompensateFlag) {
        this.CompensateFlag = CompensateFlag;
    }

    /**
     * Get Number of compensations
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CompensateCount Number of compensations
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCompensateCount() {
        return this.CompensateCount;
    }

    /**
     * Set Number of compensations
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CompensateCount Number of compensations
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCompensateCount(Long CompensateCount) {
        this.CompensateCount = CompensateCount;
    }

    /**
     * Get  
     * @return RetryCount 
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set 
     * @param RetryCount 
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get  
     * @return RetryInfo 
     */
    public String getRetryInfo() {
        return this.RetryInfo;
    }

    /**
     * Set 
     * @param RetryInfo 
     */
    public void setRetryInfo(String RetryInfo) {
        this.RetryInfo = RetryInfo;
    }

    public AutoScaleRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScaleRecord(AutoScaleRecord source) {
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.ScaleAction != null) {
            this.ScaleAction = new String(source.ScaleAction);
        }
        if (source.ActionStatus != null) {
            this.ActionStatus = new String(source.ActionStatus);
        }
        if (source.ActionTime != null) {
            this.ActionTime = new String(source.ActionTime);
        }
        if (source.ScaleInfo != null) {
            this.ScaleInfo = new String(source.ScaleInfo);
        }
        if (source.ExpectScaleNum != null) {
            this.ExpectScaleNum = new Long(source.ExpectScaleNum);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.SpecInfo != null) {
            this.SpecInfo = new String(source.SpecInfo);
        }
        if (source.CompensateFlag != null) {
            this.CompensateFlag = new Long(source.CompensateFlag);
        }
        if (source.CompensateCount != null) {
            this.CompensateCount = new Long(source.CompensateCount);
        }
        if (source.RetryCount != null) {
            this.RetryCount = new Long(source.RetryCount);
        }
        if (source.RetryInfo != null) {
            this.RetryInfo = new String(source.RetryInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "ScaleAction", this.ScaleAction);
        this.setParamSimple(map, prefix + "ActionStatus", this.ActionStatus);
        this.setParamSimple(map, prefix + "ActionTime", this.ActionTime);
        this.setParamSimple(map, prefix + "ScaleInfo", this.ScaleInfo);
        this.setParamSimple(map, prefix + "ExpectScaleNum", this.ExpectScaleNum);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "SpecInfo", this.SpecInfo);
        this.setParamSimple(map, prefix + "CompensateFlag", this.CompensateFlag);
        this.setParamSimple(map, prefix + "CompensateCount", this.CompensateCount);
        this.setParamSimple(map, prefix + "RetryCount", this.RetryCount);
        this.setParamSimple(map, prefix + "RetryInfo", this.RetryInfo);

    }
}

