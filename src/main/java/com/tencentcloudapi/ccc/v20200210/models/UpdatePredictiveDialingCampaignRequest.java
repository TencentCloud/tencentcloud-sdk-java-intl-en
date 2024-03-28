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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdatePredictiveDialingCampaignRequest extends AbstractModel {

    /**
    * Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Generated task ID.
    */
    @SerializedName("CampaignId")
    @Expose
    private Long CampaignId;

    /**
    * Task Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Called list supporting E.164 or number formats without country code.
    */
    @SerializedName("Callees")
    @Expose
    private String [] Callees;

    /**
    * Calling list using the number formats displayed on the management side.
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * Being called sequence: 0 for random 1 for in order.
    */
    @SerializedName("CallOrder")
    @Expose
    private Long CallOrder;

    /**
    * ID of the used skill group of agents.
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * Running priority of multiple tasks in the same application, from high to low 1 - 5.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Expected call drop rate, percentage, 5 - 50.
    */
    @SerializedName("ExpectedAbandonRate")
    @Expose
    private Long ExpectedAbandonRate;

    /**
    * Call retry interval, in seconds, [60 - 86,400].
    */
    @SerializedName("RetryInterval")
    @Expose
    private Long RetryInterval;

    /**
    * Task start time. Unix timestamp. The task will automatically start after this time.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Task termination time. Unix timestamp. The task will automatically terminate after this time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Specified IVR ID.
    */
    @SerializedName("IVRId")
    @Expose
    private Long IVRId;

    /**
    * Number of call retries, 0 - 2.
    */
    @SerializedName("RetryTimes")
    @Expose
    private Long RetryTimes;

    /**
     * Get Application ID (required) can be found at https://console.cloud.tencent.com/ccc. 
     * @return SdkAppId Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     * @param SdkAppId Application ID (required) can be found at https://console.cloud.tencent.com/ccc.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Generated task ID. 
     * @return CampaignId Generated task ID.
     */
    public Long getCampaignId() {
        return this.CampaignId;
    }

    /**
     * Set Generated task ID.
     * @param CampaignId Generated task ID.
     */
    public void setCampaignId(Long CampaignId) {
        this.CampaignId = CampaignId;
    }

    /**
     * Get Task Name 
     * @return Name Task Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Task Name
     * @param Name Task Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Called list supporting E.164 or number formats without country code. 
     * @return Callees Called list supporting E.164 or number formats without country code.
     */
    public String [] getCallees() {
        return this.Callees;
    }

    /**
     * Set Called list supporting E.164 or number formats without country code.
     * @param Callees Called list supporting E.164 or number formats without country code.
     */
    public void setCallees(String [] Callees) {
        this.Callees = Callees;
    }

    /**
     * Get Calling list using the number formats displayed on the management side. 
     * @return Callers Calling list using the number formats displayed on the management side.
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set Calling list using the number formats displayed on the management side.
     * @param Callers Calling list using the number formats displayed on the management side.
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get Being called sequence: 0 for random 1 for in order. 
     * @return CallOrder Being called sequence: 0 for random 1 for in order.
     */
    public Long getCallOrder() {
        return this.CallOrder;
    }

    /**
     * Set Being called sequence: 0 for random 1 for in order.
     * @param CallOrder Being called sequence: 0 for random 1 for in order.
     */
    public void setCallOrder(Long CallOrder) {
        this.CallOrder = CallOrder;
    }

    /**
     * Get ID of the used skill group of agents. 
     * @return SkillGroupId ID of the used skill group of agents.
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set ID of the used skill group of agents.
     * @param SkillGroupId ID of the used skill group of agents.
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get Running priority of multiple tasks in the same application, from high to low 1 - 5. 
     * @return Priority Running priority of multiple tasks in the same application, from high to low 1 - 5.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Running priority of multiple tasks in the same application, from high to low 1 - 5.
     * @param Priority Running priority of multiple tasks in the same application, from high to low 1 - 5.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Expected call drop rate, percentage, 5 - 50. 
     * @return ExpectedAbandonRate Expected call drop rate, percentage, 5 - 50.
     */
    public Long getExpectedAbandonRate() {
        return this.ExpectedAbandonRate;
    }

    /**
     * Set Expected call drop rate, percentage, 5 - 50.
     * @param ExpectedAbandonRate Expected call drop rate, percentage, 5 - 50.
     */
    public void setExpectedAbandonRate(Long ExpectedAbandonRate) {
        this.ExpectedAbandonRate = ExpectedAbandonRate;
    }

    /**
     * Get Call retry interval, in seconds, [60 - 86,400]. 
     * @return RetryInterval Call retry interval, in seconds, [60 - 86,400].
     */
    public Long getRetryInterval() {
        return this.RetryInterval;
    }

    /**
     * Set Call retry interval, in seconds, [60 - 86,400].
     * @param RetryInterval Call retry interval, in seconds, [60 - 86,400].
     */
    public void setRetryInterval(Long RetryInterval) {
        this.RetryInterval = RetryInterval;
    }

    /**
     * Get Task start time. Unix timestamp. The task will automatically start after this time. 
     * @return StartTime Task start time. Unix timestamp. The task will automatically start after this time.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time. Unix timestamp. The task will automatically start after this time.
     * @param StartTime Task start time. Unix timestamp. The task will automatically start after this time.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task termination time. Unix timestamp. The task will automatically terminate after this time. 
     * @return EndTime Task termination time. Unix timestamp. The task will automatically terminate after this time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task termination time. Unix timestamp. The task will automatically terminate after this time.
     * @param EndTime Task termination time. Unix timestamp. The task will automatically terminate after this time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Specified IVR ID. 
     * @return IVRId Specified IVR ID.
     */
    public Long getIVRId() {
        return this.IVRId;
    }

    /**
     * Set Specified IVR ID.
     * @param IVRId Specified IVR ID.
     */
    public void setIVRId(Long IVRId) {
        this.IVRId = IVRId;
    }

    /**
     * Get Number of call retries, 0 - 2. 
     * @return RetryTimes Number of call retries, 0 - 2.
     */
    public Long getRetryTimes() {
        return this.RetryTimes;
    }

    /**
     * Set Number of call retries, 0 - 2.
     * @param RetryTimes Number of call retries, 0 - 2.
     */
    public void setRetryTimes(Long RetryTimes) {
        this.RetryTimes = RetryTimes;
    }

    public UpdatePredictiveDialingCampaignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePredictiveDialingCampaignRequest(UpdatePredictiveDialingCampaignRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.CampaignId != null) {
            this.CampaignId = new Long(source.CampaignId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Callees != null) {
            this.Callees = new String[source.Callees.length];
            for (int i = 0; i < source.Callees.length; i++) {
                this.Callees[i] = new String(source.Callees[i]);
            }
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.CallOrder != null) {
            this.CallOrder = new Long(source.CallOrder);
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.ExpectedAbandonRate != null) {
            this.ExpectedAbandonRate = new Long(source.ExpectedAbandonRate);
        }
        if (source.RetryInterval != null) {
            this.RetryInterval = new Long(source.RetryInterval);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.IVRId != null) {
            this.IVRId = new Long(source.IVRId);
        }
        if (source.RetryTimes != null) {
            this.RetryTimes = new Long(source.RetryTimes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "CampaignId", this.CampaignId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Callees.", this.Callees);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamSimple(map, prefix + "CallOrder", this.CallOrder);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "ExpectedAbandonRate", this.ExpectedAbandonRate);
        this.setParamSimple(map, prefix + "RetryInterval", this.RetryInterval);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IVRId", this.IVRId);
        this.setParamSimple(map, prefix + "RetryTimes", this.RetryTimes);

    }
}

