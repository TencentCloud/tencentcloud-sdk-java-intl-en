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

public class CreateComplexAdaptiveDynamicStreamingTaskRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 
    */
    @SerializedName("StreamParaSet")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskStreamPara [] StreamParaSet;

    /**
    * 
    */
    @SerializedName("HeadTailSet")
    @Expose
    private HeadTailTaskInput [] HeadTailSet;

    /**
    * 
    */
    @SerializedName("AudioSet")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskAudioInput [] AudioSet;

    /**
    * 
    */
    @SerializedName("SubtitleSet")
    @Expose
    private ComplexAdaptiveDynamicStreamingTaskSubtitleInput [] SubtitleSet;

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
     * @return StreamParaSet 
     */
    public ComplexAdaptiveDynamicStreamingTaskStreamPara [] getStreamParaSet() {
        return this.StreamParaSet;
    }

    /**
     * Set 
     * @param StreamParaSet 
     */
    public void setStreamParaSet(ComplexAdaptiveDynamicStreamingTaskStreamPara [] StreamParaSet) {
        this.StreamParaSet = StreamParaSet;
    }

    /**
     * Get  
     * @return HeadTailSet 
     */
    public HeadTailTaskInput [] getHeadTailSet() {
        return this.HeadTailSet;
    }

    /**
     * Set 
     * @param HeadTailSet 
     */
    public void setHeadTailSet(HeadTailTaskInput [] HeadTailSet) {
        this.HeadTailSet = HeadTailSet;
    }

    /**
     * Get  
     * @return AudioSet 
     */
    public ComplexAdaptiveDynamicStreamingTaskAudioInput [] getAudioSet() {
        return this.AudioSet;
    }

    /**
     * Set 
     * @param AudioSet 
     */
    public void setAudioSet(ComplexAdaptiveDynamicStreamingTaskAudioInput [] AudioSet) {
        this.AudioSet = AudioSet;
    }

    /**
     * Get  
     * @return SubtitleSet 
     */
    public ComplexAdaptiveDynamicStreamingTaskSubtitleInput [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set 
     * @param SubtitleSet 
     */
    public void setSubtitleSet(ComplexAdaptiveDynamicStreamingTaskSubtitleInput [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
    }

    public CreateComplexAdaptiveDynamicStreamingTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateComplexAdaptiveDynamicStreamingTaskRequest(CreateComplexAdaptiveDynamicStreamingTaskRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.StreamParaSet != null) {
            this.StreamParaSet = new ComplexAdaptiveDynamicStreamingTaskStreamPara[source.StreamParaSet.length];
            for (int i = 0; i < source.StreamParaSet.length; i++) {
                this.StreamParaSet[i] = new ComplexAdaptiveDynamicStreamingTaskStreamPara(source.StreamParaSet[i]);
            }
        }
        if (source.HeadTailSet != null) {
            this.HeadTailSet = new HeadTailTaskInput[source.HeadTailSet.length];
            for (int i = 0; i < source.HeadTailSet.length; i++) {
                this.HeadTailSet[i] = new HeadTailTaskInput(source.HeadTailSet[i]);
            }
        }
        if (source.AudioSet != null) {
            this.AudioSet = new ComplexAdaptiveDynamicStreamingTaskAudioInput[source.AudioSet.length];
            for (int i = 0; i < source.AudioSet.length; i++) {
                this.AudioSet[i] = new ComplexAdaptiveDynamicStreamingTaskAudioInput(source.AudioSet[i]);
            }
        }
        if (source.SubtitleSet != null) {
            this.SubtitleSet = new ComplexAdaptiveDynamicStreamingTaskSubtitleInput[source.SubtitleSet.length];
            for (int i = 0; i < source.SubtitleSet.length; i++) {
                this.SubtitleSet[i] = new ComplexAdaptiveDynamicStreamingTaskSubtitleInput(source.SubtitleSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamArrayObj(map, prefix + "StreamParaSet.", this.StreamParaSet);
        this.setParamArrayObj(map, prefix + "HeadTailSet.", this.HeadTailSet);
        this.setParamArrayObj(map, prefix + "AudioSet.", this.AudioSet);
        this.setParamArrayObj(map, prefix + "SubtitleSet.", this.SubtitleSet);

    }
}

