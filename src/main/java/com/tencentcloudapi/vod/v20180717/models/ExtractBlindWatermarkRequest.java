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

public class ExtractBlindWatermarkRequest extends AbstractModel {

    /**
    * Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-trace: traceable ab sequence watermark.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * File input information for the Media Processing Service (MPS) task.
    */
    @SerializedName("InputInfo")
    @Expose
    private ExtractBlindWatermarkInputInfo InputInfo;

    /**
    * VOD application ID used for watermarking. Note that whether a FILEID or URL is imported, it must be in line with the SubAppId used for watermarking to extract the watermark.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Configuration of the digital watermark extraction task.
    */
    @SerializedName("ExtractBlindWatermarkConfig")
    @Expose
    private ExtractBlindWatermarkTaskConfig ExtractBlindWatermarkConfig;

    /**
    * Source context identifier used to pass through user request information. This field will be returned in the ExtractBlindWatermarkComplete callback and task flow status change callback. Maximum length: 1000 characters.
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * Identification Code for Task Deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Task Priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
     * Get Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-trace: traceable ab sequence watermark.</li> 
     * @return Type Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-trace: traceable ab sequence watermark.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-trace: traceable ab sequence watermark.</li>
     * @param Type Digital watermark type. Valid values: <li>blind-basic: basic copyright digital watermark;</li> <li>blind-trace: traceable ab sequence watermark.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get File input information for the Media Processing Service (MPS) task. 
     * @return InputInfo File input information for the Media Processing Service (MPS) task.
     */
    public ExtractBlindWatermarkInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set File input information for the Media Processing Service (MPS) task.
     * @param InputInfo File input information for the Media Processing Service (MPS) task.
     */
    public void setInputInfo(ExtractBlindWatermarkInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get VOD application ID used for watermarking. Note that whether a FILEID or URL is imported, it must be in line with the SubAppId used for watermarking to extract the watermark. 
     * @return SubAppId VOD application ID used for watermarking. Note that whether a FILEID or URL is imported, it must be in line with the SubAppId used for watermarking to extract the watermark.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set VOD application ID used for watermarking. Note that whether a FILEID or URL is imported, it must be in line with the SubAppId used for watermarking to extract the watermark.
     * @param SubAppId VOD application ID used for watermarking. Note that whether a FILEID or URL is imported, it must be in line with the SubAppId used for watermarking to extract the watermark.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
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
     * Get Source context identifier used to pass through user request information. This field will be returned in the ExtractBlindWatermarkComplete callback and task flow status change callback. Maximum length: 1000 characters. 
     * @return SessionContext Source context identifier used to pass through user request information. This field will be returned in the ExtractBlindWatermarkComplete callback and task flow status change callback. Maximum length: 1000 characters.
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set Source context identifier used to pass through user request information. This field will be returned in the ExtractBlindWatermarkComplete callback and task flow status change callback. Maximum length: 1000 characters.
     * @param SessionContext Source context identifier used to pass through user request information. This field will be returned in the ExtractBlindWatermarkComplete callback and task flow status change callback. Maximum length: 1000 characters.
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get Identification Code for Task Deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required. 
     * @return SessionId Identification Code for Task Deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Identification Code for Task Deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     * @param SessionId Identification Code for Task Deduplication. If there has been a request with the same identification code within the past 3 days, an error will be returned for the current request. The maximum length is 50 characters. Leaving it blank or using a null string indicates no deduplication is required.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Task Priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0. 
     * @return TasksPriority Task Priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set Task Priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     * @param TasksPriority Task Priority. The higher the value, the higher the priority. The value range is from -10 to 10. If left blank, the default value is 0.
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
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
            this.InputInfo = new ExtractBlindWatermarkInputInfo(source.InputInfo);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "ExtractBlindWatermarkConfig.", this.ExtractBlindWatermarkConfig);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

