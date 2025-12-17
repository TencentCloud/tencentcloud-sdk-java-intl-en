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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWatermarkDetectionRequest extends AbstractModel {

    /**
    * Task type, currently supports ExtractVideoABWatermarkId
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Input information
    */
    @SerializedName("InputInfo")
    @Expose
    private AbWatermarkInputInfo InputInfo;

    /**
    * Input file information
    */
    @SerializedName("InputFileInfo")
    @Expose
    private InputFileInfo InputFileInfo;

    /**
    * Input notification configuration
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
     * Get Task type, currently supports ExtractVideoABWatermarkId 
     * @return Type Task type, currently supports ExtractVideoABWatermarkId
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Task type, currently supports ExtractVideoABWatermarkId
     * @param Type Task type, currently supports ExtractVideoABWatermarkId
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Input information 
     * @return InputInfo Input information
     */
    public AbWatermarkInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set Input information
     * @param InputInfo Input information
     */
    public void setInputInfo(AbWatermarkInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get Input file information 
     * @return InputFileInfo Input file information
     */
    public InputFileInfo getInputFileInfo() {
        return this.InputFileInfo;
    }

    /**
     * Set Input file information
     * @param InputFileInfo Input file information
     */
    public void setInputFileInfo(InputFileInfo InputFileInfo) {
        this.InputFileInfo = InputFileInfo;
    }

    /**
     * Get Input notification configuration 
     * @return TaskNotifyConfig Input notification configuration
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set Input notification configuration
     * @param TaskNotifyConfig Input notification configuration
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    public CreateWatermarkDetectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWatermarkDetectionRequest(CreateWatermarkDetectionRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InputInfo != null) {
            this.InputInfo = new AbWatermarkInputInfo(source.InputInfo);
        }
        if (source.InputFileInfo != null) {
            this.InputFileInfo = new InputFileInfo(source.InputFileInfo);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new TaskNotifyConfig(source.TaskNotifyConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "InputFileInfo.", this.InputFileInfo);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);

    }
}

