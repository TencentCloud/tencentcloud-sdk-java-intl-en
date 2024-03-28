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

public class DescribePredictiveDialingCampaignsElement extends AbstractModel {

    /**
    * Task ID
Note: This field may return null if no valid value is obtained.
    */
    @SerializedName("CampaignId")
    @Expose
    private Long CampaignId;

    /**
    * Task Name
Note: This field might return null if no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Task status 0 - Ready to start, 1 - In progress, 2 - Paused, 3 - Terminated, 4 - Completed.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Task status reasons 0 - Normal, 1 - Manually ended, 2 - Ended due to overtime.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StatusReason")
    @Expose
    private Long StatusReason;

    /**
    * Number of called numbers.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CalleeCount")
    @Expose
    private Long CalleeCount;

    /**
    * Number of completed calls.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FinishedCalleeCount")
    @Expose
    private Long FinishedCalleeCount;

    /**
    * Running priority of multiple tasks in the same application, from high to low 1 - 5.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * ID of the used skill group of agents.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
     * Get Task ID
Note: This field may return null if no valid value is obtained. 
     * @return CampaignId Task ID
Note: This field may return null if no valid value is obtained.
     */
    public Long getCampaignId() {
        return this.CampaignId;
    }

    /**
     * Set Task ID
Note: This field may return null if no valid value is obtained.
     * @param CampaignId Task ID
Note: This field may return null if no valid value is obtained.
     */
    public void setCampaignId(Long CampaignId) {
        this.CampaignId = CampaignId;
    }

    /**
     * Get Task Name
Note: This field might return null if no valid values can be obtained. 
     * @return Name Task Name
Note: This field might return null if no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Task Name
Note: This field might return null if no valid values can be obtained.
     * @param Name Task Name
Note: This field might return null if no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Task status 0 - Ready to start, 1 - In progress, 2 - Paused, 3 - Terminated, 4 - Completed.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Status Task status 0 - Ready to start, 1 - In progress, 2 - Paused, 3 - Terminated, 4 - Completed.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status 0 - Ready to start, 1 - In progress, 2 - Paused, 3 - Terminated, 4 - Completed.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Status Task status 0 - Ready to start, 1 - In progress, 2 - Paused, 3 - Terminated, 4 - Completed.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Task status reasons 0 - Normal, 1 - Manually ended, 2 - Ended due to overtime.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StatusReason Task status reasons 0 - Normal, 1 - Manually ended, 2 - Ended due to overtime.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set Task status reasons 0 - Normal, 1 - Manually ended, 2 - Ended due to overtime.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StatusReason Task status reasons 0 - Normal, 1 - Manually ended, 2 - Ended due to overtime.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStatusReason(Long StatusReason) {
        this.StatusReason = StatusReason;
    }

    /**
     * Get Number of called numbers.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CalleeCount Number of called numbers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCalleeCount() {
        return this.CalleeCount;
    }

    /**
     * Set Number of called numbers.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CalleeCount Number of called numbers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCalleeCount(Long CalleeCount) {
        this.CalleeCount = CalleeCount;
    }

    /**
     * Get Number of completed calls.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FinishedCalleeCount Number of completed calls.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getFinishedCalleeCount() {
        return this.FinishedCalleeCount;
    }

    /**
     * Set Number of completed calls.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FinishedCalleeCount Number of completed calls.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFinishedCalleeCount(Long FinishedCalleeCount) {
        this.FinishedCalleeCount = FinishedCalleeCount;
    }

    /**
     * Get Running priority of multiple tasks in the same application, from high to low 1 - 5.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Priority Running priority of multiple tasks in the same application, from high to low 1 - 5.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Running priority of multiple tasks in the same application, from high to low 1 - 5.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Priority Running priority of multiple tasks in the same application, from high to low 1 - 5.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get ID of the used skill group of agents.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SkillGroupId ID of the used skill group of agents.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set ID of the used skill group of agents.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SkillGroupId ID of the used skill group of agents.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    public DescribePredictiveDialingCampaignsElement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePredictiveDialingCampaignsElement(DescribePredictiveDialingCampaignsElement source) {
        if (source.CampaignId != null) {
            this.CampaignId = new Long(source.CampaignId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusReason != null) {
            this.StatusReason = new Long(source.StatusReason);
        }
        if (source.CalleeCount != null) {
            this.CalleeCount = new Long(source.CalleeCount);
        }
        if (source.FinishedCalleeCount != null) {
            this.FinishedCalleeCount = new Long(source.FinishedCalleeCount);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CampaignId", this.CampaignId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusReason", this.StatusReason);
        this.setParamSimple(map, prefix + "CalleeCount", this.CalleeCount);
        this.setParamSimple(map, prefix + "FinishedCalleeCount", this.FinishedCalleeCount);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);

    }
}

