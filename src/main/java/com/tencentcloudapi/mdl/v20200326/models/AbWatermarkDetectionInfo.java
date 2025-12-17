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

public class AbWatermarkDetectionInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 
    */
    @SerializedName("InputInfo")
    @Expose
    private AbWatermarkInputInfo InputInfo;

    /**
    * 
    */
    @SerializedName("TaskNotifyConfig")
    @Expose
    private TaskNotifyConfig TaskNotifyConfig;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 
    */
    @SerializedName("InputFileInfo")
    @Expose
    private InputFileInfo InputFileInfo;

    /**
     * Get  
     * @return TaskId 
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 
     * @param TaskId 
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return State 
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 
     * @param State 
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get  
     * @return Result 
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 
     * @param Result 
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get  
     * @return ErrorCode 
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 
     * @param ErrorCode 
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get  
     * @return ErrorMsg 
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 
     * @param ErrorMsg 
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get  
     * @return InputInfo 
     */
    public AbWatermarkInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 
     * @param InputInfo 
     */
    public void setInputInfo(AbWatermarkInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get  
     * @return TaskNotifyConfig 
     */
    public TaskNotifyConfig getTaskNotifyConfig() {
        return this.TaskNotifyConfig;
    }

    /**
     * Set 
     * @param TaskNotifyConfig 
     */
    public void setTaskNotifyConfig(TaskNotifyConfig TaskNotifyConfig) {
        this.TaskNotifyConfig = TaskNotifyConfig;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return UpdateTime 
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 
     * @param UpdateTime 
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get  
     * @return InputFileInfo 
     */
    public InputFileInfo getInputFileInfo() {
        return this.InputFileInfo;
    }

    /**
     * Set 
     * @param InputFileInfo 
     */
    public void setInputFileInfo(InputFileInfo InputFileInfo) {
        this.InputFileInfo = InputFileInfo;
    }

    public AbWatermarkDetectionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbWatermarkDetectionInfo(AbWatermarkDetectionInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.InputInfo != null) {
            this.InputInfo = new AbWatermarkInputInfo(source.InputInfo);
        }
        if (source.TaskNotifyConfig != null) {
            this.TaskNotifyConfig = new TaskNotifyConfig(source.TaskNotifyConfig);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.InputFileInfo != null) {
            this.InputFileInfo = new InputFileInfo(source.InputFileInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "TaskNotifyConfig.", this.TaskNotifyConfig);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "InputFileInfo.", this.InputFileInfo);

    }
}

