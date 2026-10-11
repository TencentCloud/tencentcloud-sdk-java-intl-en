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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselinePolicyDetect extends AbstractModel {

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * Detection task Id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Associated hosts
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * Policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Number of successful hosts.
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * Number of failed primary technologies
    */
    @SerializedName("FailedCount")
    @Expose
    private Long FailedCount;

    /**
    * Number of failed hosts.
    */
    @SerializedName("TimeoutCount")
    @Expose
    private Long TimeoutCount;

    /**
    * 1: Detecting 2: Detection completed
    */
    @SerializedName("PolicyDetectStatus")
    @Expose
    private Long PolicyDetectStatus;

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Detection task Id 
     * @return TaskId Detection task Id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Detection task Id
     * @param TaskId Detection task Id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Associated hosts 
     * @return HostCount Associated hosts
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Associated hosts
     * @param HostCount Associated hosts
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
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
     * @return FinishTime End time
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set End time
     * @param FinishTime End time
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get Policy name 
     * @return PolicyName Policy name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name
     * @param PolicyName Policy name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Number of successful hosts. 
     * @return SuccessCount Number of successful hosts.
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set Number of successful hosts.
     * @param SuccessCount Number of successful hosts.
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get Number of failed primary technologies 
     * @return FailedCount Number of failed primary technologies
     */
    public Long getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set Number of failed primary technologies
     * @param FailedCount Number of failed primary technologies
     */
    public void setFailedCount(Long FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get Number of failed hosts. 
     * @return TimeoutCount Number of failed hosts.
     */
    public Long getTimeoutCount() {
        return this.TimeoutCount;
    }

    /**
     * Set Number of failed hosts.
     * @param TimeoutCount Number of failed hosts.
     */
    public void setTimeoutCount(Long TimeoutCount) {
        this.TimeoutCount = TimeoutCount;
    }

    /**
     * Get 1: Detecting 2: Detection completed 
     * @return PolicyDetectStatus 1: Detecting 2: Detection completed
     */
    public Long getPolicyDetectStatus() {
        return this.PolicyDetectStatus;
    }

    /**
     * Set 1: Detecting 2: Detection completed
     * @param PolicyDetectStatus 1: Detecting 2: Detection completed
     */
    public void setPolicyDetectStatus(Long PolicyDetectStatus) {
        this.PolicyDetectStatus = PolicyDetectStatus;
    }

    public BaselinePolicyDetect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselinePolicyDetect(BaselinePolicyDetect source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailedCount != null) {
            this.FailedCount = new Long(source.FailedCount);
        }
        if (source.TimeoutCount != null) {
            this.TimeoutCount = new Long(source.TimeoutCount);
        }
        if (source.PolicyDetectStatus != null) {
            this.PolicyDetectStatus = new Long(source.PolicyDetectStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamSimple(map, prefix + "TimeoutCount", this.TimeoutCount);
        this.setParamSimple(map, prefix + "PolicyDetectStatus", this.PolicyDetectStatus);

    }
}

