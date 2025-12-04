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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtractBlindWatermarkRequest extends AbstractModel {

    /**
    * Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-abseq: ab sequence copyright digital watermark.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * File input information for the Media Processing Service (MPS) task.
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * Event notification information of the task. If it is left unspecified, it indicates that no event notification is obtained.
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * Configuration of the digital watermark extraction task.
    */
    @SerializedName("ExtractBlindWatermarkConfig")
    @Expose
    private ExtractBlindWatermarkTaskConfig ExtractBlindWatermarkConfig;

    /**
    * Resource ID. Ensure that the corresponding resource is enabled. The default value is the primary resource ID of the account.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-abseq: ab sequence copyright digital watermark.</li> 
     * @return Type Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-abseq: ab sequence copyright digital watermark.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-abseq: ab sequence copyright digital watermark.</li>
     * @param Type Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-abseq: ab sequence copyright digital watermark.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get File input information for the Media Processing Service (MPS) task. 
     * @return InputInfo File input information for the Media Processing Service (MPS) task.
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set File input information for the Media Processing Service (MPS) task.
     * @param InputInfo File input information for the Media Processing Service (MPS) task.
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get Event notification information of the task. If it is left unspecified, it indicates that no event notification is obtained. 
     * @return TaskNotifyConfig Event notification information of the task. If it is left unspecified, it indicates that no event notification is obtained.
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set Event notification information of the task. If it is left unspecified, it indicates that no event notification is obtained.
     * @param TaskNotifyConfig Event notification information of the task. If it is left unspecified, it indicates that no event notification is obtained.
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get Configuration of the digital watermark extraction task. 
     * @return ExtractBlindWatermarkConfig Configuration of the digital watermark extraction task.
     */
    public ExtractBlindWatermarkTaskConfig getExtractBlindWatermarkConfig() {
        return this.ExtractBlindWatermarkConfig;
    }

    /**
     * Set Configuration of the digital watermark extraction task.
     * @param ExtractBlindWatermarkConfig Configuration of the digital watermark extraction task.
     */
    public void setExtractBlindWatermarkConfig(ExtractBlindWatermarkTaskConfig ExtractBlindWatermarkConfig) {
        this.ExtractBlindWatermarkConfig = ExtractBlindWatermarkConfig;
    }

    /**
     * Get Resource ID. Ensure that the corresponding resource is enabled. The default value is the primary resource ID of the account. 
     * @return ResourceId Resource ID. Ensure that the corresponding resource is enabled. The default value is the primary resource ID of the account.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID. Ensure that the corresponding resource is enabled. The default value is the primary resource ID of the account.
     * @param ResourceId Resource ID. Ensure that the corresponding resource is enabled. The default value is the primary resource ID of the account.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public ExtractBlindWatermarkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractBlindWatermarkRequest(ExtractBlindWatermarkRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InputInfo != null) {
            this.InputInfo = new MediaInputInfo(source.InputInfo);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new TaskNotifyConfig(source.TaskNotifyConfig);
        }
        if (source.ExtractBlindWatermarkConfig != null) {
            this.ExtractBlindWatermarkConfig = new ExtractBlindWatermarkTaskConfig(source.ExtractBlindWatermarkConfig);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamObj(map, prefix + "ExtractBlindWatermarkConfig.", this.ExtractBlindWatermarkConfig);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

