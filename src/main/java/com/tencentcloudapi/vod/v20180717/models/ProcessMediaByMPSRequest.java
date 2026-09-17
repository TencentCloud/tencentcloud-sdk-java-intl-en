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

public class ProcessMediaByMPSRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("MPSProcessMediaParams")
    @Expose
    private String MPSProcessMediaParams;

    /**
    * 
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private MPSAiAnalysisTaskInput AiAnalysisTask;

    /**
    * 
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private MPSSmartSubtitlesTaskInput SmartSubtitlesTask;

    /**
    * 
    */
    @SerializedName("SmartEraseTask")
    @Expose
    private MPSSmartEraseTaskInput SmartEraseTask;

    /**
    * 
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get  
     * @return FileId 
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 
     * @param FileId 
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return MPSProcessMediaParams 
     */
    public String getMPSProcessMediaParams() {
        return this.MPSProcessMediaParams;
    }

    /**
     * Set 
     * @param MPSProcessMediaParams 
     */
    public void setMPSProcessMediaParams(String MPSProcessMediaParams) {
        this.MPSProcessMediaParams = MPSProcessMediaParams;
    }

    /**
     * Get  
     * @return AiAnalysisTask 
     */
    public MPSAiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set 
     * @param AiAnalysisTask 
     */
    public void setAiAnalysisTask(MPSAiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get  
     * @return SmartSubtitlesTask 
     */
    public MPSSmartSubtitlesTaskInput getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set 
     * @param SmartSubtitlesTask 
     */
    public void setSmartSubtitlesTask(MPSSmartSubtitlesTaskInput SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
    }

    /**
     * Get  
     * @return SmartEraseTask 
     */
    public MPSSmartEraseTaskInput getSmartEraseTask() {
        return this.SmartEraseTask;
    }

    /**
     * Set 
     * @param SmartEraseTask 
     */
    public void setSmartEraseTask(MPSSmartEraseTaskInput SmartEraseTask) {
        this.SmartEraseTask = SmartEraseTask;
    }

    /**
     * Get  
     * @return ExtInfo 
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 
     * @param ExtInfo 
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public ProcessMediaByMPSRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessMediaByMPSRequest(ProcessMediaByMPSRequest source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.MPSProcessMediaParams != null) {
            this.MPSProcessMediaParams = new String(source.MPSProcessMediaParams);
        }
        if (source.AiAnalysisTask != null) {
            this.AiAnalysisTask = new MPSAiAnalysisTaskInput(source.AiAnalysisTask);
        }
        if (source.SmartSubtitlesTask != null) {
            this.SmartSubtitlesTask = new MPSSmartSubtitlesTaskInput(source.SmartSubtitlesTask);
        }
        if (source.SmartEraseTask != null) {
            this.SmartEraseTask = new MPSSmartEraseTaskInput(source.SmartEraseTask);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "MPSProcessMediaParams", this.MPSProcessMediaParams);
        this.setParamObj(map, prefix + "AiAnalysisTask.", this.AiAnalysisTask);
        this.setParamObj(map, prefix + "SmartSubtitlesTask.", this.SmartSubtitlesTask);
        this.setParamObj(map, prefix + "SmartEraseTask.", this.SmartEraseTask);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

