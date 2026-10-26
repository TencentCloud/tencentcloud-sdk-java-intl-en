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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordBackupPlanData extends AbstractModel {

    /**
    * Recording cloud migration plan ID
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * Recording cloud migration plan name
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * Video cloud template ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Description of the recording cloud migration plan
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * Cloud file lifecycle
    */
    @SerializedName("LifeCycle")
    @Expose
    private LifeCycleData LifeCycle;

    /**
    * Recording cloud migration plan status. 1: In normal use. 0: Deleting, cannot be used.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Number of channels
    */
    @SerializedName("ChannelCount")
    @Expose
    private Long ChannelCount;

    /**
    * Creation time.
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * Modification time.
    */
    @SerializedName("UpdateAt")
    @Expose
    private String UpdateAt;

    /**
     * Get Recording cloud migration plan ID 
     * @return PlanId Recording cloud migration plan ID
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set Recording cloud migration plan ID
     * @param PlanId Recording cloud migration plan ID
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get Recording cloud migration plan name 
     * @return PlanName Recording cloud migration plan name
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set Recording cloud migration plan name
     * @param PlanName Recording cloud migration plan name
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get Video cloud template ID 
     * @return TemplateId Video cloud template ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Video cloud template ID
     * @param TemplateId Video cloud template ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Description of the recording cloud migration plan 
     * @return Describe Description of the recording cloud migration plan
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set Description of the recording cloud migration plan
     * @param Describe Description of the recording cloud migration plan
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get Cloud file lifecycle 
     * @return LifeCycle Cloud file lifecycle
     */
    public LifeCycleData getLifeCycle() {
        return this.LifeCycle;
    }

    /**
     * Set Cloud file lifecycle
     * @param LifeCycle Cloud file lifecycle
     */
    public void setLifeCycle(LifeCycleData LifeCycle) {
        this.LifeCycle = LifeCycle;
    }

    /**
     * Get Recording cloud migration plan status. 1: In normal use. 0: Deleting, cannot be used. 
     * @return Status Recording cloud migration plan status. 1: In normal use. 0: Deleting, cannot be used.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Recording cloud migration plan status. 1: In normal use. 0: Deleting, cannot be used.
     * @param Status Recording cloud migration plan status. 1: In normal use. 0: Deleting, cannot be used.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Number of channels 
     * @return ChannelCount Number of channels
     */
    public Long getChannelCount() {
        return this.ChannelCount;
    }

    /**
     * Set Number of channels
     * @param ChannelCount Number of channels
     */
    public void setChannelCount(Long ChannelCount) {
        this.ChannelCount = ChannelCount;
    }

    /**
     * Get Creation time. 
     * @return CreateAt Creation time.
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set Creation time.
     * @param CreateAt Creation time.
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get Modification time. 
     * @return UpdateAt Modification time.
     */
    public String getUpdateAt() {
        return this.UpdateAt;
    }

    /**
     * Set Modification time.
     * @param UpdateAt Modification time.
     */
    public void setUpdateAt(String UpdateAt) {
        this.UpdateAt = UpdateAt;
    }

    public DescribeRecordBackupPlanData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordBackupPlanData(DescribeRecordBackupPlanData source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.LifeCycle != null) {
            this.LifeCycle = new LifeCycleData(source.LifeCycle);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ChannelCount != null) {
            this.ChannelCount = new Long(source.ChannelCount);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.UpdateAt != null) {
            this.UpdateAt = new String(source.UpdateAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamObj(map, prefix + "LifeCycle.", this.LifeCycle);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ChannelCount", this.ChannelCount);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "UpdateAt", this.UpdateAt);

    }
}

