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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSTemplate extends AbstractModel {

    /**
    * MPS template type. Valid values:
<li>Transcode: transcoding template.</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * MPS task template detail.
    */
    @SerializedName("MPSTemplateInfo")
    @Expose
    private String MPSTemplateInfo;

    /**
     * Get MPS template type. Valid values:
<li>Transcode: transcoding template.</li> 
     * @return TaskType MPS template type. Valid values:
<li>Transcode: transcoding template.</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set MPS template type. Valid values:
<li>Transcode: transcoding template.</li>
     * @param TaskType MPS template type. Valid values:
<li>Transcode: transcoding template.</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get MPS task template detail. 
     * @return MPSTemplateInfo MPS task template detail.
     */
    public String getMPSTemplateInfo() {
        return this.MPSTemplateInfo;
    }

    /**
     * Set MPS task template detail.
     * @param MPSTemplateInfo MPS task template detail.
     */
    public void setMPSTemplateInfo(String MPSTemplateInfo) {
        this.MPSTemplateInfo = MPSTemplateInfo;
    }

    public MPSTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSTemplate(MPSTemplate source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.MPSTemplateInfo != null) {
            this.MPSTemplateInfo = new String(source.MPSTemplateInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "MPSTemplateInfo", this.MPSTemplateInfo);

    }
}

