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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchCreateTaskVersionAsyncRequest extends AbstractModel {

    /**
    * Task information
    */
    @SerializedName("Tasks")
    @Expose
    private BatchCreateTaskVersionDTO [] Tasks;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Specifies whether to run automatically
    */
    @SerializedName("AutoRun")
    @Expose
    private Boolean AutoRun;

    /**
    * Alert method: email-email; sms-sms; wecom-wecom
    */
    @SerializedName("AlarmWays")
    @Expose
    private String AlarmWays;

    /**
    * Alarm object: 1. Project Administrator. 2. Task Owner
    */
    @SerializedName("AlarmRecipientTypes")
    @Expose
    private String AlarmRecipientTypes;

    /**
    * Whether validation is required to check if the parent task has been submitted to scheduling
    */
    @SerializedName("NeedCheckParentSubmitted")
    @Expose
    private Boolean NeedCheckParentSubmitted;

    /**
     * Get Task information 
     * @return Tasks Task information
     */
    public BatchCreateTaskVersionDTO [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set Task information
     * @param Tasks Task information
     */
    public void setTasks(BatchCreateTaskVersionDTO [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Specifies whether to run automatically 
     * @return AutoRun Specifies whether to run automatically
     */
    public Boolean getAutoRun() {
        return this.AutoRun;
    }

    /**
     * Set Specifies whether to run automatically
     * @param AutoRun Specifies whether to run automatically
     */
    public void setAutoRun(Boolean AutoRun) {
        this.AutoRun = AutoRun;
    }

    /**
     * Get Alert method: email-email; sms-sms; wecom-wecom 
     * @return AlarmWays Alert method: email-email; sms-sms; wecom-wecom
     */
    public String getAlarmWays() {
        return this.AlarmWays;
    }

    /**
     * Set Alert method: email-email; sms-sms; wecom-wecom
     * @param AlarmWays Alert method: email-email; sms-sms; wecom-wecom
     */
    public void setAlarmWays(String AlarmWays) {
        this.AlarmWays = AlarmWays;
    }

    /**
     * Get Alarm object: 1. Project Administrator. 2. Task Owner 
     * @return AlarmRecipientTypes Alarm object: 1. Project Administrator. 2. Task Owner
     */
    public String getAlarmRecipientTypes() {
        return this.AlarmRecipientTypes;
    }

    /**
     * Set Alarm object: 1. Project Administrator. 2. Task Owner
     * @param AlarmRecipientTypes Alarm object: 1. Project Administrator. 2. Task Owner
     */
    public void setAlarmRecipientTypes(String AlarmRecipientTypes) {
        this.AlarmRecipientTypes = AlarmRecipientTypes;
    }

    /**
     * Get Whether validation is required to check if the parent task has been submitted to scheduling 
     * @return NeedCheckParentSubmitted Whether validation is required to check if the parent task has been submitted to scheduling
     */
    public Boolean getNeedCheckParentSubmitted() {
        return this.NeedCheckParentSubmitted;
    }

    /**
     * Set Whether validation is required to check if the parent task has been submitted to scheduling
     * @param NeedCheckParentSubmitted Whether validation is required to check if the parent task has been submitted to scheduling
     */
    public void setNeedCheckParentSubmitted(Boolean NeedCheckParentSubmitted) {
        this.NeedCheckParentSubmitted = NeedCheckParentSubmitted;
    }

    public BatchCreateTaskVersionAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCreateTaskVersionAsyncRequest(BatchCreateTaskVersionAsyncRequest source) {
        if (source.Tasks != null) {
            this.Tasks = new BatchCreateTaskVersionDTO[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new BatchCreateTaskVersionDTO(source.Tasks[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AutoRun != null) {
            this.AutoRun = new Boolean(source.AutoRun);
        }
        if (source.AlarmWays != null) {
            this.AlarmWays = new String(source.AlarmWays);
        }
        if (source.AlarmRecipientTypes != null) {
            this.AlarmRecipientTypes = new String(source.AlarmRecipientTypes);
        }
        if (source.NeedCheckParentSubmitted != null) {
            this.NeedCheckParentSubmitted = new Boolean(source.NeedCheckParentSubmitted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AutoRun", this.AutoRun);
        this.setParamSimple(map, prefix + "AlarmWays", this.AlarmWays);
        this.setParamSimple(map, prefix + "AlarmRecipientTypes", this.AlarmRecipientTypes);
        this.setParamSimple(map, prefix + "NeedCheckParentSubmitted", this.NeedCheckParentSubmitted);

    }
}

