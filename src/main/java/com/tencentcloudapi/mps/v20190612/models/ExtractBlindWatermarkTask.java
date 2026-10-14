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
    * Task stream status. Valid values:
<li>WAITING: waiting.</li>
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Error code. `0` indicates success. Other values indicate failure.
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
    * Information of the media processing target file.
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-ab: ab copyright digital watermark.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Whether a watermark is detected. If this parameter is true, the Result field will return the watermark extraction Result. If this parameter is false, the Result field will not return.
    */
    @SerializedName("IsDetected")
    @Expose
    private Boolean IsDetected;

    /**
    * Fetched digital watermark content. This field will not be returned if no watermark is detected.
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * Configuration of digital watermark extraction.
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
     * Get Task stream status. Valid values:
<li>WAITING: waiting.</li>
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li> 
     * @return Status Task stream status. Valid values:
<li>WAITING: waiting.</li>
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Task stream status. Valid values:
<li>WAITING: waiting.</li>
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
     * @param Status Task stream status. Valid values:
<li>WAITING: waiting.</li>
<li>PROCESSING: Processing;</li>
<li>FINISH: completed</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Error code. `0` indicates success. Other values indicate failure. 
     * @return ErrCode Error code. `0` indicates success. Other values indicate failure.
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set Error code. `0` indicates success. Other values indicate failure.
     * @param ErrCode Error code. `0` indicates success. Other values indicate failure.
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
     * Get Information of the media processing target file. 
     * @return InputInfo Information of the media processing target file.
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set Information of the media processing target file.
     * @param InputInfo Information of the media processing target file.
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-ab: ab copyright digital watermark.</li> 
     * @return Type Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-ab: ab copyright digital watermark.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-ab: ab copyright digital watermark.</li>
     * @param Type Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-ab: ab copyright digital watermark.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Whether a watermark is detected. If this parameter is true, the Result field will return the watermark extraction Result. If this parameter is false, the Result field will not return. 
     * @return IsDetected Whether a watermark is detected. If this parameter is true, the Result field will return the watermark extraction Result. If this parameter is false, the Result field will not return.
     */
    public Boolean getIsDetected() {
        return this.IsDetected;
    }

    /**
     * Set Whether a watermark is detected. If this parameter is true, the Result field will return the watermark extraction Result. If this parameter is false, the Result field will not return.
     * @param IsDetected Whether a watermark is detected. If this parameter is true, the Result field will return the watermark extraction Result. If this parameter is false, the Result field will not return.
     */
    public void setIsDetected(Boolean IsDetected) {
        this.IsDetected = IsDetected;
    }

    /**
     * Get Fetched digital watermark content. This field will not be returned if no watermark is detected. 
     * @return Result Fetched digital watermark content. This field will not be returned if no watermark is detected.
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set Fetched digital watermark content. This field will not be returned if no watermark is detected.
     * @param Result Fetched digital watermark content. This field will not be returned if no watermark is detected.
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get Configuration of digital watermark extraction. 
     * @return ExtractBlindWatermarkConfig Configuration of digital watermark extraction.
     */
    public ExtractBlindWatermarkTaskConfig getExtractBlindWatermarkConfig() {
        return this.ExtractBlindWatermarkConfig;
    }

    /**
     * Set Configuration of digital watermark extraction.
     * @param ExtractBlindWatermarkConfig Configuration of digital watermark extraction.
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

