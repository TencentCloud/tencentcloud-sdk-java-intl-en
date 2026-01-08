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

public class SemanticsSearchResult extends AbstractModel {

    /**
    * Specifies the unique identifier of the media file.
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * Score of the video in this retrieval. higher score indicates greater similarity to the retrieval value. value ranges from 0 to 1.
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
    * Specifies the start time of the video clip, in seconds.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * Specifies the end time of the video clip, in seconds.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get Specifies the unique identifier of the media file. 
     * @return FileId Specifies the unique identifier of the media file.
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set Specifies the unique identifier of the media file.
     * @param FileId Specifies the unique identifier of the media file.
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get Score of the video in this retrieval. higher score indicates greater similarity to the retrieval value. value ranges from 0 to 1. 
     * @return Score Score of the video in this retrieval. higher score indicates greater similarity to the retrieval value. value ranges from 0 to 1.
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set Score of the video in this retrieval. higher score indicates greater similarity to the retrieval value. value ranges from 0 to 1.
     * @param Score Score of the video in this retrieval. higher score indicates greater similarity to the retrieval value. value ranges from 0 to 1.
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Get Specifies the start time of the video clip, in seconds. 
     * @return StartTimeOffset Specifies the start time of the video clip, in seconds.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Specifies the start time of the video clip, in seconds.
     * @param StartTimeOffset Specifies the start time of the video clip, in seconds.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get Specifies the end time of the video clip, in seconds. 
     * @return EndTimeOffset Specifies the end time of the video clip, in seconds.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set Specifies the end time of the video clip, in seconds.
     * @param EndTimeOffset Specifies the end time of the video clip, in seconds.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    public SemanticsSearchResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SemanticsSearchResult(SemanticsSearchResult source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Score != null) {
            this.Score = new Float(source.Score);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

