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
    * <Task id>.
    */
    @SerializedName("CampaignId")
    @Expose
    private Long CampaignId;

    /**
    * Task name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Task status 0 - ready to start, 1 - in progress, 2 - paused, 3 - terminated, 4 - completed.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Task status reasons 0 - normal, 1 - manually ended, 2 - ended due to overtime.
    */
    @SerializedName("StatusReason")
    @Expose
    private Long StatusReason;

    /**
    * Number of called numbers.
    */
    @SerializedName("CalleeCount")
    @Expose
    private Long CalleeCount;

    /**
    * Number of completed calls.
    */
    @SerializedName("FinishedCalleeCount")
    @Expose
    private Long FinishedCalleeCount;

    /**
    * Running priority of multiple tasks in the same application, from high to low 1 - 5.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * ID of the used skill group of agents.
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
     * Get <Task id>. 
     * @return CampaignId <Task id>.
     */
    public Long getCampaignId() {
        return this.CampaignId;
    }

    /**
     * Set <Task id>.
     * @param CampaignId <Task id>.
     */
    public void setCampaignId(Long CampaignId) {
        this.CampaignId = CampaignId;
    }

    /**
     * Get Task name. 
     * @return Name Task name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Task name.
     * @param Name Task name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Task status 0 - ready to start, 1 - in progress, 2 - paused, 3 - terminated, 4 - completed. 
     * @return Status Task status 0 - ready to start, 1 - in progress, 2 - paused, 3 - terminated, 4 - completed.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status 0 - ready to start, 1 - in progress, 2 - paused, 3 - terminated, 4 - completed.
     * @param Status Task status 0 - ready to start, 1 - in progress, 2 - paused, 3 - terminated, 4 - completed.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Task status reasons 0 - normal, 1 - manually ended, 2 - ended due to overtime. 
     * @return StatusReason Task status reasons 0 - normal, 1 - manually ended, 2 - ended due to overtime.
     */
    public Long getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set Task status reasons 0 - normal, 1 - manually ended, 2 - ended due to overtime.
     * @param StatusReason Task status reasons 0 - normal, 1 - manually ended, 2 - ended due to overtime.
     */
    public void setStatusReason(Long StatusReason) {
        this.StatusReason = StatusReason;
    }

    /**
     * Get Number of called numbers. 
     * @return CalleeCount Number of called numbers.
     */
    public Long getCalleeCount() {
        return this.CalleeCount;
    }

    /**
     * Set Number of called numbers.
     * @param CalleeCount Number of called numbers.
     */
    public void setCalleeCount(Long CalleeCount) {
        this.CalleeCount = CalleeCount;
    }

    /**
     * Get Number of completed calls. 
     * @return FinishedCalleeCount Number of completed calls.
     */
    public Long getFinishedCalleeCount() {
        return this.FinishedCalleeCount;
    }

    /**
     * Set Number of completed calls.
     * @param FinishedCalleeCount Number of completed calls.
     */
    public void setFinishedCalleeCount(Long FinishedCalleeCount) {
        this.FinishedCalleeCount = FinishedCalleeCount;
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

