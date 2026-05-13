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
    * <p>Media file ID, the globally unique ID of the file in VOD, is assigned by the VOD backend after successful upload. You can get this field in <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Optional parameter. This parameter is used for passing through to the media processing service (MPS) to trigger MPS video processing tasks from VOD.
    */
    @SerializedName("MPSProcessMediaParams")
    @Expose
    private String MPSProcessMediaParams;

    /**
    * <p>Parameters for the video content analysis task. Valid when MPSProcessMediaParams is empty.</p>
    */
    @SerializedName("AiAnalysisTask")
    @Expose
    private MPSAiAnalysisTaskInput AiAnalysisTask;

    /**
    * <p>Parameters for the smart subtitle task of type kind. Valid when MPSProcessMediaParams is empty.</p>
    */
    @SerializedName("SmartSubtitlesTask")
    @Expose
    private MPSSmartSubtitlesTaskInput SmartSubtitlesTask;

    /**
    * <p>Parameters for the intelligent erasure task of type kind. Valid when MPSProcessMediaParams is empty.</p>
    */
    @SerializedName("SmartEraseTask")
    @Expose
    private MPSSmartEraseTaskInput SmartEraseTask;

    /**
    * <p>Reserved field. Used for special purpose.</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p>Media file ID, the globally unique ID of the file in VOD, is assigned by the VOD backend after successful upload. You can get this field in <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p> 
     * @return FileId <p>Media file ID, the globally unique ID of the file in VOD, is assigned by the VOD backend after successful upload. You can get this field in <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>Media file ID, the globally unique ID of the file in VOD, is assigned by the VOD backend after successful upload. You can get this field in <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p>
     * @param FileId <p>Media file ID, the globally unique ID of the file in VOD, is assigned by the VOD backend after successful upload. You can get this field in <a href="/document/product/266/7830?from_cn_redirect=1">video upload completion event notification</a> or <a href="https://console.cloud.tencent.com/vod/media">VOD console</a>.</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p> 
     * @return SubAppId <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     * @param SubAppId <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Optional parameter. This parameter is used for passing through to the media processing service (MPS) to trigger MPS video processing tasks from VOD. 
     * @return MPSProcessMediaParams <p>Optional parameter. This parameter is used for passing through to the media processing service (MPS) to trigger MPS video processing tasks from VOD.
     */
    public String getMPSProcessMediaParams() {
        return this.MPSProcessMediaParams;
    }

    /**
     * Set <p>Optional parameter. This parameter is used for passing through to the media processing service (MPS) to trigger MPS video processing tasks from VOD.
     * @param MPSProcessMediaParams <p>Optional parameter. This parameter is used for passing through to the media processing service (MPS) to trigger MPS video processing tasks from VOD.
     */
    public void setMPSProcessMediaParams(String MPSProcessMediaParams) {
        this.MPSProcessMediaParams = MPSProcessMediaParams;
    }

    /**
     * Get <p>Parameters for the video content analysis task. Valid when MPSProcessMediaParams is empty.</p> 
     * @return AiAnalysisTask <p>Parameters for the video content analysis task. Valid when MPSProcessMediaParams is empty.</p>
     */
    public MPSAiAnalysisTaskInput getAiAnalysisTask() {
        return this.AiAnalysisTask;
    }

    /**
     * Set <p>Parameters for the video content analysis task. Valid when MPSProcessMediaParams is empty.</p>
     * @param AiAnalysisTask <p>Parameters for the video content analysis task. Valid when MPSProcessMediaParams is empty.</p>
     */
    public void setAiAnalysisTask(MPSAiAnalysisTaskInput AiAnalysisTask) {
        this.AiAnalysisTask = AiAnalysisTask;
    }

    /**
     * Get <p>Parameters for the smart subtitle task of type kind. Valid when MPSProcessMediaParams is empty.</p> 
     * @return SmartSubtitlesTask <p>Parameters for the smart subtitle task of type kind. Valid when MPSProcessMediaParams is empty.</p>
     */
    public MPSSmartSubtitlesTaskInput getSmartSubtitlesTask() {
        return this.SmartSubtitlesTask;
    }

    /**
     * Set <p>Parameters for the smart subtitle task of type kind. Valid when MPSProcessMediaParams is empty.</p>
     * @param SmartSubtitlesTask <p>Parameters for the smart subtitle task of type kind. Valid when MPSProcessMediaParams is empty.</p>
     */
    public void setSmartSubtitlesTask(MPSSmartSubtitlesTaskInput SmartSubtitlesTask) {
        this.SmartSubtitlesTask = SmartSubtitlesTask;
    }

    /**
     * Get <p>Parameters for the intelligent erasure task of type kind. Valid when MPSProcessMediaParams is empty.</p> 
     * @return SmartEraseTask <p>Parameters for the intelligent erasure task of type kind. Valid when MPSProcessMediaParams is empty.</p>
     */
    public MPSSmartEraseTaskInput getSmartEraseTask() {
        return this.SmartEraseTask;
    }

    /**
     * Set <p>Parameters for the intelligent erasure task of type kind. Valid when MPSProcessMediaParams is empty.</p>
     * @param SmartEraseTask <p>Parameters for the intelligent erasure task of type kind. Valid when MPSProcessMediaParams is empty.</p>
     */
    public void setSmartEraseTask(MPSSmartEraseTaskInput SmartEraseTask) {
        this.SmartEraseTask = SmartEraseTask;
    }

    /**
     * Get <p>Reserved field. Used for special purpose.</p> 
     * @return ExtInfo <p>Reserved field. Used for special purpose.</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>Reserved field. Used for special purpose.</p>
     * @param ExtInfo <p>Reserved field. Used for special purpose.</p>
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

