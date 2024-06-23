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

public class CreateTaskVersionDsRequest extends AbstractModel {

    /**
    * Task ID
    */
    @SerializedName("Task")
    @Expose
    private BatchCreateTaskVersionDTO Task;

    /**
    * Whether to verify that the parent task has been submitted for scheduling
    */
    @SerializedName("NeedCheckParentSubmitted")
    @Expose
    private Boolean NeedCheckParentSubmitted;

    /**
    * Automatic Execution
    */
    @SerializedName("AutoRun")
    @Expose
    private Boolean AutoRun;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Request Source, WEB frontend; CLIENT client
    */
    @SerializedName("RequestFromSource")
    @Expose
    private String RequestFromSource;

    /**
    * Alert Method: email-Email; sms-SMS; wecom-WeCom
    */
    @SerializedName("AlarmWays")
    @Expose
    private String AlarmWays;

    /**
    * Alert Object: 1-Project Administrator, 2-Task Owner
    */
    @SerializedName("AlarmRecipientTypes")
    @Expose
    private String AlarmRecipientTypes;

    /**
    * Whether to verify circular dependencies, default is true. If false is passed after successful validation using CheckTaskCycleLink and CheckTaskCycleConfiguration interfaces, the back-end server will not perform validation
    */
    @SerializedName("EnableCheckTaskCycleLink")
    @Expose
    private Boolean EnableCheckTaskCycleLink;

    /**
     * Get Task ID 
     * @return Task Task ID
     */
    public BatchCreateTaskVersionDTO getTask() {
        return this.Task;
    }

    /**
     * Set Task ID
     * @param Task Task ID
     */
    public void setTask(BatchCreateTaskVersionDTO Task) {
        this.Task = Task;
    }

    /**
     * Get Whether to verify that the parent task has been submitted for scheduling 
     * @return NeedCheckParentSubmitted Whether to verify that the parent task has been submitted for scheduling
     */
    public Boolean getNeedCheckParentSubmitted() {
        return this.NeedCheckParentSubmitted;
    }

    /**
     * Set Whether to verify that the parent task has been submitted for scheduling
     * @param NeedCheckParentSubmitted Whether to verify that the parent task has been submitted for scheduling
     */
    public void setNeedCheckParentSubmitted(Boolean NeedCheckParentSubmitted) {
        this.NeedCheckParentSubmitted = NeedCheckParentSubmitted;
    }

    /**
     * Get Automatic Execution 
     * @return AutoRun Automatic Execution
     */
    public Boolean getAutoRun() {
        return this.AutoRun;
    }

    /**
     * Set Automatic Execution
     * @param AutoRun Automatic Execution
     */
    public void setAutoRun(Boolean AutoRun) {
        this.AutoRun = AutoRun;
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
     * Get Request Source, WEB frontend; CLIENT client 
     * @return RequestFromSource Request Source, WEB frontend; CLIENT client
     */
    public String getRequestFromSource() {
        return this.RequestFromSource;
    }

    /**
     * Set Request Source, WEB frontend; CLIENT client
     * @param RequestFromSource Request Source, WEB frontend; CLIENT client
     */
    public void setRequestFromSource(String RequestFromSource) {
        this.RequestFromSource = RequestFromSource;
    }

    /**
     * Get Alert Method: email-Email; sms-SMS; wecom-WeCom 
     * @return AlarmWays Alert Method: email-Email; sms-SMS; wecom-WeCom
     */
    public String getAlarmWays() {
        return this.AlarmWays;
    }

    /**
     * Set Alert Method: email-Email; sms-SMS; wecom-WeCom
     * @param AlarmWays Alert Method: email-Email; sms-SMS; wecom-WeCom
     */
    public void setAlarmWays(String AlarmWays) {
        this.AlarmWays = AlarmWays;
    }

    /**
     * Get Alert Object: 1-Project Administrator, 2-Task Owner 
     * @return AlarmRecipientTypes Alert Object: 1-Project Administrator, 2-Task Owner
     */
    public String getAlarmRecipientTypes() {
        return this.AlarmRecipientTypes;
    }

    /**
     * Set Alert Object: 1-Project Administrator, 2-Task Owner
     * @param AlarmRecipientTypes Alert Object: 1-Project Administrator, 2-Task Owner
     */
    public void setAlarmRecipientTypes(String AlarmRecipientTypes) {
        this.AlarmRecipientTypes = AlarmRecipientTypes;
    }

    /**
     * Get Whether to verify circular dependencies, default is true. If false is passed after successful validation using CheckTaskCycleLink and CheckTaskCycleConfiguration interfaces, the back-end server will not perform validation 
     * @return EnableCheckTaskCycleLink Whether to verify circular dependencies, default is true. If false is passed after successful validation using CheckTaskCycleLink and CheckTaskCycleConfiguration interfaces, the back-end server will not perform validation
     */
    public Boolean getEnableCheckTaskCycleLink() {
        return this.EnableCheckTaskCycleLink;
    }

    /**
     * Set Whether to verify circular dependencies, default is true. If false is passed after successful validation using CheckTaskCycleLink and CheckTaskCycleConfiguration interfaces, the back-end server will not perform validation
     * @param EnableCheckTaskCycleLink Whether to verify circular dependencies, default is true. If false is passed after successful validation using CheckTaskCycleLink and CheckTaskCycleConfiguration interfaces, the back-end server will not perform validation
     */
    public void setEnableCheckTaskCycleLink(Boolean EnableCheckTaskCycleLink) {
        this.EnableCheckTaskCycleLink = EnableCheckTaskCycleLink;
    }

    public CreateTaskVersionDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskVersionDsRequest(CreateTaskVersionDsRequest source) {
        if (source.Task != null) {
            this.Task = new BatchCreateTaskVersionDTO(source.Task);
        }
        if (source.NeedCheckParentSubmitted != null) {
            this.NeedCheckParentSubmitted = new Boolean(source.NeedCheckParentSubmitted);
        }
        if (source.AutoRun != null) {
            this.AutoRun = new Boolean(source.AutoRun);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RequestFromSource != null) {
            this.RequestFromSource = new String(source.RequestFromSource);
        }
        if (source.AlarmWays != null) {
            this.AlarmWays = new String(source.AlarmWays);
        }
        if (source.AlarmRecipientTypes != null) {
            this.AlarmRecipientTypes = new String(source.AlarmRecipientTypes);
        }
        if (source.EnableCheckTaskCycleLink != null) {
            this.EnableCheckTaskCycleLink = new Boolean(source.EnableCheckTaskCycleLink);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Task.", this.Task);
        this.setParamSimple(map, prefix + "NeedCheckParentSubmitted", this.NeedCheckParentSubmitted);
        this.setParamSimple(map, prefix + "AutoRun", this.AutoRun);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "RequestFromSource", this.RequestFromSource);
        this.setParamSimple(map, prefix + "AlarmWays", this.AlarmWays);
        this.setParamSimple(map, prefix + "AlarmRecipientTypes", this.AlarmRecipientTypes);
        this.setParamSimple(map, prefix + "EnableCheckTaskCycleLink", this.EnableCheckTaskCycleLink);

    }
}

