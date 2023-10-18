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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskTemplateView extends AbstractModel {

    /**
    * Task template ID
    */
    @SerializedName("TaskTemplateId")
    @Expose
    private String TaskTemplateId;

    /**
    * Task template name
    */
    @SerializedName("TaskTemplateName")
    @Expose
    private String TaskTemplateName;

    /**
    * Task template description
    */
    @SerializedName("TaskTemplateDescription")
    @Expose
    private String TaskTemplateDescription;

    /**
    * Task template information
    */
    @SerializedName("TaskTemplateInfo")
    @Expose
    private Task TaskTemplateInfo;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Tag list bound to the task template.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Task template ID 
     * @return TaskTemplateId Task template ID
     */
    public String getTaskTemplateId() {
        return this.TaskTemplateId;
    }

    /**
     * Set Task template ID
     * @param TaskTemplateId Task template ID
     */
    public void setTaskTemplateId(String TaskTemplateId) {
        this.TaskTemplateId = TaskTemplateId;
    }

    /**
     * Get Task template name 
     * @return TaskTemplateName Task template name
     */
    public String getTaskTemplateName() {
        return this.TaskTemplateName;
    }

    /**
     * Set Task template name
     * @param TaskTemplateName Task template name
     */
    public void setTaskTemplateName(String TaskTemplateName) {
        this.TaskTemplateName = TaskTemplateName;
    }

    /**
     * Get Task template description 
     * @return TaskTemplateDescription Task template description
     */
    public String getTaskTemplateDescription() {
        return this.TaskTemplateDescription;
    }

    /**
     * Set Task template description
     * @param TaskTemplateDescription Task template description
     */
    public void setTaskTemplateDescription(String TaskTemplateDescription) {
        this.TaskTemplateDescription = TaskTemplateDescription;
    }

    /**
     * Get Task template information 
     * @return TaskTemplateInfo Task template information
     */
    public Task getTaskTemplateInfo() {
        return this.TaskTemplateInfo;
    }

    /**
     * Set Task template information
     * @param TaskTemplateInfo Task template information
     */
    public void setTaskTemplateInfo(Task TaskTemplateInfo) {
        this.TaskTemplateInfo = TaskTemplateInfo;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Tag list bound to the task template.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Tags Tag list bound to the task template.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list bound to the task template.
Note: This field may return `null`, indicating that no valid value was found.
     * @param Tags Tag list bound to the task template.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public TaskTemplateView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskTemplateView(TaskTemplateView source) {
        if (source.TaskTemplateId != null) {
            this.TaskTemplateId = new String(source.TaskTemplateId);
        }
        if (source.TaskTemplateName != null) {
            this.TaskTemplateName = new String(source.TaskTemplateName);
        }
        if (source.TaskTemplateDescription != null) {
            this.TaskTemplateDescription = new String(source.TaskTemplateDescription);
        }
        if (source.TaskTemplateInfo != null) {
            this.TaskTemplateInfo = new Task(source.TaskTemplateInfo);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskTemplateId", this.TaskTemplateId);
        this.setParamSimple(map, prefix + "TaskTemplateName", this.TaskTemplateName);
        this.setParamSimple(map, prefix + "TaskTemplateDescription", this.TaskTemplateDescription);
        this.setParamObj(map, prefix + "TaskTemplateInfo.", this.TaskTemplateInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

