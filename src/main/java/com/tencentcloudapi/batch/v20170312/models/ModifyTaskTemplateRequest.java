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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTaskTemplateRequest extends AbstractModel{

    /**
    * Job template ID
    */
    @SerializedName("TaskTemplateId")
    @Expose
    private String TaskTemplateId;

    /**
    * Job template name
    */
    @SerializedName("TaskTemplateName")
    @Expose
    private String TaskTemplateName;

    /**
    * Job template description
    */
    @SerializedName("TaskTemplateDescription")
    @Expose
    private String TaskTemplateDescription;

    /**
    * Job template information
    */
    @SerializedName("TaskTemplateInfo")
    @Expose
    private Task TaskTemplateInfo;

    /**
     * Get Job template ID 
     * @return TaskTemplateId Job template ID
     */
    public String getTaskTemplateId() {
        return this.TaskTemplateId;
    }

    /**
     * Set Job template ID
     * @param TaskTemplateId Job template ID
     */
    public void setTaskTemplateId(String TaskTemplateId) {
        this.TaskTemplateId = TaskTemplateId;
    }

    /**
     * Get Job template name 
     * @return TaskTemplateName Job template name
     */
    public String getTaskTemplateName() {
        return this.TaskTemplateName;
    }

    /**
     * Set Job template name
     * @param TaskTemplateName Job template name
     */
    public void setTaskTemplateName(String TaskTemplateName) {
        this.TaskTemplateName = TaskTemplateName;
    }

    /**
     * Get Job template description 
     * @return TaskTemplateDescription Job template description
     */
    public String getTaskTemplateDescription() {
        return this.TaskTemplateDescription;
    }

    /**
     * Set Job template description
     * @param TaskTemplateDescription Job template description
     */
    public void setTaskTemplateDescription(String TaskTemplateDescription) {
        this.TaskTemplateDescription = TaskTemplateDescription;
    }

    /**
     * Get Job template information 
     * @return TaskTemplateInfo Job template information
     */
    public Task getTaskTemplateInfo() {
        return this.TaskTemplateInfo;
    }

    /**
     * Set Job template information
     * @param TaskTemplateInfo Job template information
     */
    public void setTaskTemplateInfo(Task TaskTemplateInfo) {
        this.TaskTemplateInfo = TaskTemplateInfo;
    }

    public ModifyTaskTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTaskTemplateRequest(ModifyTaskTemplateRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskTemplateId", this.TaskTemplateId);
        this.setParamSimple(map, prefix + "TaskTemplateName", this.TaskTemplateName);
        this.setParamSimple(map, prefix + "TaskTemplateDescription", this.TaskTemplateDescription);
        this.setParamObj(map, prefix + "TaskTemplateInfo.", this.TaskTemplateInfo);

    }
}

