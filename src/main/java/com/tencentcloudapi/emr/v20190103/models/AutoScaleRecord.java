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
    * <p>Scaling rule name.</p>
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * <p>&quot;SCALE_OUT&quot; and &quot;SCALE_IN&quot;, indicating scale-out and scale-in, respectively.</p>
    */
    @SerializedName("ScaleAction")
    @Expose
    private String ScaleAction;

    /**
    * <p>The value is &quot;SUCCESS&quot;, &quot;FAILED&quot;, &quot;PART_SUCCESS&quot;, or &quot;IN_PROCESS&quot;, indicating success, failure, partial success, and in-process, respectively.</p>
    */
    @SerializedName("ActionStatus")
    @Expose
    private String ActionStatus;

    /**
    * <p>Flow trigger time.</p>
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

    /**
    * <p>Scaling-related description.</p>
    */
    @SerializedName("ScaleInfo")
    @Expose
    private String ScaleInfo;

    /**
    * <p>Valid only when ScaleAction is SCALE_OUT.</p>
    */
    @SerializedName("ExpectScaleNum")
    @Expose
    private Long ExpectScaleNum;

    /**
    * <p>Flow end time.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Policy type. Load-based scaling or time-based scaling. 1 indicates load-based scaling, and 2 indicates time-based scaling.</p>
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * <p>Specifications information used during scale-out.</p>
    */
    @SerializedName("SpecInfo")
    @Expose
    private String SpecInfo;

    /**
    * <p>Compensatory scale-out. Valid values: 0 (disable) and 1 (enable).</p>
    */
    @SerializedName("CompensateFlag")
    @Expose
    private Long CompensateFlag;

    /**
    * <p>Number of compensations.</p>
    */
    @SerializedName("CompensateCount")
    @Expose
    private Long CompensateCount;

    /**
    * <p>Number of retries.</p>
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * <p>Retry information.</p>
    */
    @SerializedName("RetryInfo")
    @Expose
    private String RetryInfo;

    /**
    * <p>Retry description in English.</p>
    */
    @SerializedName("RetryEnReason")
    @Expose
    private String RetryEnReason;

    /**
    * <p>Retry description.</p>
    */
    @SerializedName("RetryReason")
    @Expose
    private String RetryReason;

    /**
    * <p>Missing category.</p>
    */
    @SerializedName("ShortageClass")
    @Expose
    private Long ShortageClass;

    /**
     * Get <p>Scaling rule name.</p> 
     * @return StrategyName <p>Scaling rule name.</p>
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set <p>Scaling rule name.</p>
     * @param StrategyName <p>Scaling rule name.</p>
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get <p>&quot;SCALE_OUT&quot; and &quot;SCALE_IN&quot;, indicating scale-out and scale-in, respectively.</p> 
     * @return ScaleAction <p>&quot;SCALE_OUT&quot; and &quot;SCALE_IN&quot;, indicating scale-out and scale-in, respectively.</p>
     */
    public String getScaleAction() {
        return this.ScaleAction;
    }

    /**
     * Set <p>&quot;SCALE_OUT&quot; and &quot;SCALE_IN&quot;, indicating scale-out and scale-in, respectively.</p>
     * @param ScaleAction <p>&quot;SCALE_OUT&quot; and &quot;SCALE_IN&quot;, indicating scale-out and scale-in, respectively.</p>
     */
    public void setScaleAction(String ScaleAction) {
        this.ScaleAction = ScaleAction;
    }

    /**
     * Get <p>The value is &quot;SUCCESS&quot;, &quot;FAILED&quot;, &quot;PART_SUCCESS&quot;, or &quot;IN_PROCESS&quot;, indicating success, failure, partial success, and in-process, respectively.</p> 
     * @return ActionStatus <p>The value is &quot;SUCCESS&quot;, &quot;FAILED&quot;, &quot;PART_SUCCESS&quot;, or &quot;IN_PROCESS&quot;, indicating success, failure, partial success, and in-process, respectively.</p>
     */
    public String getActionStatus() {
        return this.ActionStatus;
    }

    /**
     * Set <p>The value is &quot;SUCCESS&quot;, &quot;FAILED&quot;, &quot;PART_SUCCESS&quot;, or &quot;IN_PROCESS&quot;, indicating success, failure, partial success, and in-process, respectively.</p>
     * @param ActionStatus <p>The value is &quot;SUCCESS&quot;, &quot;FAILED&quot;, &quot;PART_SUCCESS&quot;, or &quot;IN_PROCESS&quot;, indicating success, failure, partial success, and in-process, respectively.</p>
     */
    public void setActionStatus(String ActionStatus) {
        this.ActionStatus = ActionStatus;
    }

    /**
     * Get <p>Flow trigger time.</p> 
     * @return ActionTime <p>Flow trigger time.</p>
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * Set <p>Flow trigger time.</p>
     * @param ActionTime <p>Flow trigger time.</p>
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

    /**
     * Get <p>Scaling-related description.</p> 
     * @return ScaleInfo <p>Scaling-related description.</p>
     */
    public String getScaleInfo() {
        return this.ScaleInfo;
    }

    /**
     * Set <p>Scaling-related description.</p>
     * @param ScaleInfo <p>Scaling-related description.</p>
     */
    public void setScaleInfo(String ScaleInfo) {
        this.ScaleInfo = ScaleInfo;
    }

    /**
     * Get <p>Valid only when ScaleAction is SCALE_OUT.</p> 
     * @return ExpectScaleNum <p>Valid only when ScaleAction is SCALE_OUT.</p>
     */
    public Long getExpectScaleNum() {
        return this.ExpectScaleNum;
    }

    /**
     * Set <p>Valid only when ScaleAction is SCALE_OUT.</p>
     * @param ExpectScaleNum <p>Valid only when ScaleAction is SCALE_OUT.</p>
     */
    public void setExpectScaleNum(Long ExpectScaleNum) {
        this.ExpectScaleNum = ExpectScaleNum;
    }

    /**
     * Get <p>Flow end time.</p> 
     * @return EndTime <p>Flow end time.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Flow end time.</p>
     * @param EndTime <p>Flow end time.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Policy type. Load-based scaling or time-based scaling. 1 indicates load-based scaling, and 2 indicates time-based scaling.</p> 
     * @return StrategyType <p>Policy type. Load-based scaling or time-based scaling. 1 indicates load-based scaling, and 2 indicates time-based scaling.</p>
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>Policy type. Load-based scaling or time-based scaling. 1 indicates load-based scaling, and 2 indicates time-based scaling.</p>
     * @param StrategyType <p>Policy type. Load-based scaling or time-based scaling. 1 indicates load-based scaling, and 2 indicates time-based scaling.</p>
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>Specifications information used during scale-out.</p> 
     * @return SpecInfo <p>Specifications information used during scale-out.</p>
     */
    public String getSpecInfo() {
        return this.SpecInfo;
    }

    /**
     * Set <p>Specifications information used during scale-out.</p>
     * @param SpecInfo <p>Specifications information used during scale-out.</p>
     */
    public void setSpecInfo(String SpecInfo) {
        this.SpecInfo = SpecInfo;
    }

    /**
     * Get <p>Compensatory scale-out. Valid values: 0 (disable) and 1 (enable).</p> 
     * @return CompensateFlag <p>Compensatory scale-out. Valid values: 0 (disable) and 1 (enable).</p>
     */
    public Long getCompensateFlag() {
        return this.CompensateFlag;
    }

    /**
     * Set <p>Compensatory scale-out. Valid values: 0 (disable) and 1 (enable).</p>
     * @param CompensateFlag <p>Compensatory scale-out. Valid values: 0 (disable) and 1 (enable).</p>
     */
    public void setCompensateFlag(Long CompensateFlag) {
        this.CompensateFlag = CompensateFlag;
    }

    /**
     * Get <p>Number of compensations.</p> 
     * @return CompensateCount <p>Number of compensations.</p>
     */
    public Long getCompensateCount() {
        return this.CompensateCount;
    }

    /**
     * Set <p>Number of compensations.</p>
     * @param CompensateCount <p>Number of compensations.</p>
     */
    public void setCompensateCount(Long CompensateCount) {
        this.CompensateCount = CompensateCount;
    }

    /**
     * Get <p>Number of retries.</p> 
     * @return RetryCount <p>Number of retries.</p>
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set <p>Number of retries.</p>
     * @param RetryCount <p>Number of retries.</p>
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get <p>Retry information.</p> 
     * @return RetryInfo <p>Retry information.</p>
     */
    public String getRetryInfo() {
        return this.RetryInfo;
    }

    /**
     * Set <p>Retry information.</p>
     * @param RetryInfo <p>Retry information.</p>
     */
    public void setRetryInfo(String RetryInfo) {
        this.RetryInfo = RetryInfo;
    }

    /**
     * Get <p>Retry description in English.</p> 
     * @return RetryEnReason <p>Retry description in English.</p>
     */
    public String getRetryEnReason() {
        return this.RetryEnReason;
    }

    /**
     * Set <p>Retry description in English.</p>
     * @param RetryEnReason <p>Retry description in English.</p>
     */
    public void setRetryEnReason(String RetryEnReason) {
        this.RetryEnReason = RetryEnReason;
    }

    /**
     * Get <p>Retry description.</p> 
     * @return RetryReason <p>Retry description.</p>
     */
    public String getRetryReason() {
        return this.RetryReason;
    }

    /**
     * Set <p>Retry description.</p>
     * @param RetryReason <p>Retry description.</p>
     */
    public void setRetryReason(String RetryReason) {
        this.RetryReason = RetryReason;
    }

    /**
     * Get <p>Missing category.</p> 
     * @return ShortageClass <p>Missing category.</p>
     */
    public Long getShortageClass() {
        return this.ShortageClass;
    }

    /**
     * Set <p>Missing category.</p>
     * @param ShortageClass <p>Missing category.</p>
     */
    public void setShortageClass(Long ShortageClass) {
        this.ShortageClass = ShortageClass;
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
        if (source.RetryEnReason != null) {
            this.RetryEnReason = new String(source.RetryEnReason);
        }
        if (source.RetryReason != null) {
            this.RetryReason = new String(source.RetryReason);
        }
        if (source.ShortageClass != null) {
            this.ShortageClass = new Long(source.ShortageClass);
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
        this.setParamSimple(map, prefix + "RetryEnReason", this.RetryEnReason);
        this.setParamSimple(map, prefix + "RetryReason", this.RetryReason);
        this.setParamSimple(map, prefix + "ShortageClass", this.ShortageClass);

    }
}

