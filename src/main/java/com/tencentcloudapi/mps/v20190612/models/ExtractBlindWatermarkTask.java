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

public class ExtractBlindWatermarkTask extends AbstractModel {

    /**
    * Media processing task ID.
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Task flow status. valid values:.
<Li>WAITING: waiting.</li>.
<Li>PROCESSING: processing.</li>.
<li>FINISH: completed</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. `0` indicates success. other values indicate failure.
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * Error message.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Target file information for media processing.
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * Specifies the digital watermark type. valid values: <li>blind-basic: basic version copyright digital watermark;</li> <li>blind-ab: ab copyright digital watermark.</li>.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Indicates whether a watermark is detected. if this parameter is true, the Result field will return the watermark extraction Result. if this parameter is false, the Result field will not return.
    */
    @SerializedName("IsDetected")
    @Expose
    private Boolean IsDetected;

    /**
    * Fetched watermark content. this field will not be returned when no detection.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * Extracts the digital watermark configuration.
    */
    @SerializedName("ExtractBlindWatermarkConfig")
    @Expose
    private ExtractBlindWatermarkTaskConfig ExtractBlindWatermarkConfig;

    /**
     * Get Media processing task ID. 
     * @return TaskId Media processing task ID.
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Media processing task ID.
     * @param TaskId Media processing task ID.
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Task flow status. valid values:.
<Li>WAITING: waiting.</li>.
<Li>PROCESSING: processing.</li>.
<li>FINISH: completed</li> 
     * @return Status Task flow status. valid values:.
<Li>WAITING: waiting.</li>.
<Li>PROCESSING: processing.</li>.
<li>FINISH: completed</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task flow status. valid values:.
<Li>WAITING: waiting.</li>.
<Li>PROCESSING: processing.</li>.
<li>FINISH: completed</li>
     * @param Status Task flow status. valid values:.
<Li>WAITING: waiting.</li>.
<Li>PROCESSING: processing.</li>.
<li>FINISH: completed</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. `0` indicates success. other values indicate failure. 
     * @return ErrCode Error code. `0` indicates success. other values indicate failure.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. `0` indicates success. other values indicate failure.
     * @param ErrCode Error code. `0` indicates success. other values indicate failure.
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get Error message. 
     * @return Message Error message.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Error message.
     * @param Message Error message.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Target file information for media processing. 
     * @return InputInfo Target file information for media processing.
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set Target file information for media processing.
     * @param InputInfo Target file information for media processing.
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get Specifies the digital watermark type. valid values: <li>blind-basic: basic version copyright digital watermark;</li> <li>blind-ab: ab copyright digital watermark.</li>. 
     * @return Type Specifies the digital watermark type. valid values: <li>blind-basic: basic version copyright digital watermark;</li> <li>blind-ab: ab copyright digital watermark.</li>.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Specifies the digital watermark type. valid values: <li>blind-basic: basic version copyright digital watermark;</li> <li>blind-ab: ab copyright digital watermark.</li>.
     * @param Type Specifies the digital watermark type. valid values: <li>blind-basic: basic version copyright digital watermark;</li> <li>blind-ab: ab copyright digital watermark.</li>.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Indicates whether a watermark is detected. if this parameter is true, the Result field will return the watermark extraction Result. if this parameter is false, the Result field will not return. 
     * @return IsDetected Indicates whether a watermark is detected. if this parameter is true, the Result field will return the watermark extraction Result. if this parameter is false, the Result field will not return.
     */
    public Boolean getIsDetected() {
        return this.IsDetected;
    }

    /**
     * Set Indicates whether a watermark is detected. if this parameter is true, the Result field will return the watermark extraction Result. if this parameter is false, the Result field will not return.
     * @param IsDetected Indicates whether a watermark is detected. if this parameter is true, the Result field will return the watermark extraction Result. if this parameter is false, the Result field will not return.
     */
    public void setIsDetected(Boolean IsDetected) {
        this.IsDetected = IsDetected;
    }

    /**
     * Get Fetched watermark content. this field will not be returned when no detection. 
     * @return Result Fetched watermark content. this field will not be returned when no detection.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set Fetched watermark content. this field will not be returned when no detection.
     * @param Result Fetched watermark content. this field will not be returned when no detection.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get Extracts the digital watermark configuration. 
     * @return ExtractBlindWatermarkConfig Extracts the digital watermark configuration.
     */
    public ExtractBlindWatermarkTaskConfig getExtractBlindWatermarkConfig() {
        return this.ExtractBlindWatermarkConfig;
    }

    /**
     * Set Extracts the digital watermark configuration.
     * @param ExtractBlindWatermarkConfig Extracts the digital watermark configuration.
     */
    public void setExtractBlindWatermarkConfig(ExtractBlindWatermarkTaskConfig ExtractBlindWatermarkConfig) {
        this.ExtractBlindWatermarkConfig = ExtractBlindWatermarkConfig;
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
            this.InputInfo = new MediaInputInfo(source.InputInfo);
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
        if (source.ExtractBlindWatermarkConfig != null) {
            this.ExtractBlindWatermarkConfig = new ExtractBlindWatermarkTaskConfig(source.ExtractBlindWatermarkConfig);
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
        this.setParamObj(map, prefix + "ExtractBlindWatermarkConfig.", this.ExtractBlindWatermarkConfig);

    }
}

