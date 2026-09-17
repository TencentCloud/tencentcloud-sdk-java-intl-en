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

public class ExtractBlindWatermarkTask extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 
    */
    @SerializedName("InputInfo")
    @Expose
    private ExtractBlindWatermarkInputInfo InputInfo;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("IsDetected")
    @Expose
    private Boolean IsDetected;

    /**
    * 
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 
    */
    @SerializedName("ResultUV")
    @Expose
    private String ResultUV;

    /**
    * 
    */
    @SerializedName("ExtractBlindWatermarkConfig")
    @Expose
    private ExtractBlindWatermarkTaskConfig ExtractBlindWatermarkConfig;

    /**
    * 
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

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
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return ErrCode 
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 
     * @param ErrCode 
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get  
     * @return Message 
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 
     * @param Message 
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get  
     * @return InputInfo 
     */
    public ExtractBlindWatermarkInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 
     * @param InputInfo 
     */
    public void setInputInfo(ExtractBlindWatermarkInputInfo InputInfo) {
        this.InputInfo = InputInfo;
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
     * @return IsDetected 
     */
    public Boolean getIsDetected() {
        return this.IsDetected;
    }

    /**
     * Set 
     * @param IsDetected 
     */
    public void setIsDetected(Boolean IsDetected) {
        this.IsDetected = IsDetected;
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
     * @return ResultUV 
     */
    public String getResultUV() {
        return this.ResultUV;
    }

    /**
     * Set 
     * @param ResultUV 
     */
    public void setResultUV(String ResultUV) {
        this.ResultUV = ResultUV;
    }

    /**
     * Get  
     * @return ExtractBlindWatermarkConfig 
     */
    public ExtractBlindWatermarkTaskConfig getExtractBlindWatermarkConfig() {
        return this.ExtractBlindWatermarkConfig;
    }

    /**
     * Set 
     * @param ExtractBlindWatermarkConfig 
     */
    public void setExtractBlindWatermarkConfig(ExtractBlindWatermarkTaskConfig ExtractBlindWatermarkConfig) {
        this.ExtractBlindWatermarkConfig = ExtractBlindWatermarkConfig;
    }

    /**
     * Get  
     * @return SessionContext 
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set 
     * @param SessionContext 
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get  
     * @return SessionId 
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 
     * @param SessionId 
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public ExtractBlindWatermarkTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractBlindWatermarkTask(ExtractBlindWatermarkTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.InputInfo != null) {
            this.InputInfo = new ExtractBlindWatermarkInputInfo(source.InputInfo);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.IsDetected != null) {
            this.IsDetected = new Boolean(source.IsDetected);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.ResultUV != null) {
            this.ResultUV = new String(source.ResultUV);
        }
        if (source.ExtractBlindWatermarkConfig != null) {
            this.ExtractBlindWatermarkConfig = new ExtractBlindWatermarkTaskConfig(source.ExtractBlindWatermarkConfig);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IsDetected", this.IsDetected);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ResultUV", this.ResultUV);
        this.setParamObj(map, prefix + "ExtractBlindWatermarkConfig.", this.ExtractBlindWatermarkConfig);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

