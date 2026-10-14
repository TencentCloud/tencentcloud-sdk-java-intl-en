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

public class AiAnalysisTaskVideoComprehensionOutput extends AbstractModel {

    /**
    * Details of the video (audio) recognition output content.
    */
    @SerializedName("VideoComprehensionAnalysisResult")
    @Expose
    private String VideoComprehensionAnalysisResult;

    /**
    * Extended information for video (audio) understanding.
    */
    @SerializedName("VideoComprehensionExtInfo")
    @Expose
    private String VideoComprehensionExtInfo;

    /**
    * Video storyboard understanding result
    */
    @SerializedName("VideoComprehensionResultList")
    @Expose
    private VideoComprehensionResultItem [] VideoComprehensionResultList;

    /**
     * Get Details of the video (audio) recognition output content. 
     * @return VideoComprehensionAnalysisResult Details of the video (audio) recognition output content.
     */
    public String getVideoComprehensionAnalysisResult() {
        return this.VideoComprehensionAnalysisResult;
    }

    /**
     * Set Details of the video (audio) recognition output content.
     * @param VideoComprehensionAnalysisResult Details of the video (audio) recognition output content.
     */
    public void setVideoComprehensionAnalysisResult(String VideoComprehensionAnalysisResult) {
        this.VideoComprehensionAnalysisResult = VideoComprehensionAnalysisResult;
    }

    /**
     * Get Extended information for video (audio) understanding. 
     * @return VideoComprehensionExtInfo Extended information for video (audio) understanding.
     */
    public String getVideoComprehensionExtInfo() {
        return this.VideoComprehensionExtInfo;
    }

    /**
     * Set Extended information for video (audio) understanding.
     * @param VideoComprehensionExtInfo Extended information for video (audio) understanding.
     */
    public void setVideoComprehensionExtInfo(String VideoComprehensionExtInfo) {
        this.VideoComprehensionExtInfo = VideoComprehensionExtInfo;
    }

    /**
     * Get Video storyboard understanding result 
     * @return VideoComprehensionResultList Video storyboard understanding result
     */
    public VideoComprehensionResultItem [] getVideoComprehensionResultList() {
        return this.VideoComprehensionResultList;
    }

    /**
     * Set Video storyboard understanding result
     * @param VideoComprehensionResultList Video storyboard understanding result
     */
    public void setVideoComprehensionResultList(VideoComprehensionResultItem [] VideoComprehensionResultList) {
        this.VideoComprehensionResultList = VideoComprehensionResultList;
    }

    public AiAnalysisTaskVideoComprehensionOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskVideoComprehensionOutput(AiAnalysisTaskVideoComprehensionOutput source) {
        if (source.VideoComprehensionAnalysisResult != null) {
            this.VideoComprehensionAnalysisResult = new String(source.VideoComprehensionAnalysisResult);
        }
        if (source.VideoComprehensionExtInfo != null) {
            this.VideoComprehensionExtInfo = new String(source.VideoComprehensionExtInfo);
        }
        if (source.VideoComprehensionResultList != null) {
            this.VideoComprehensionResultList = new VideoComprehensionResultItem[source.VideoComprehensionResultList.length];
            for (int i = 0; i < source.VideoComprehensionResultList.length; i++) {
                this.VideoComprehensionResultList[i] = new VideoComprehensionResultItem(source.VideoComprehensionResultList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoComprehensionAnalysisResult", this.VideoComprehensionAnalysisResult);
        this.setParamSimple(map, prefix + "VideoComprehensionExtInfo", this.VideoComprehensionExtInfo);
        this.setParamArrayObj(map, prefix + "VideoComprehensionResultList.", this.VideoComprehensionResultList);

    }
}

