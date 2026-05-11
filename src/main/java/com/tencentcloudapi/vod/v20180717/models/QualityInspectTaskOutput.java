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

public class QualityInspectTaskOutput extends AbstractModel {

    /**
    * Whether there is no audio track in the media file. Value ranges from...to...
<li>0: No, have audio tracks;</li>
<li>1: Yes, no audio track.</li>
    */
    @SerializedName("NoAudio")
    @Expose
    private Long NoAudio;

    /**
    * Whether there is no video track in the media file. Value ranges from...to...
<li>0: No, meaning there is a video track;</li>
<li>1: Yes, no video track.</li>
    */
    @SerializedName("NoVideo")
    @Expose
    private Long NoVideo;

    /**
    * Video picture quality score, value ranges from 0 to 100.
    */
    @SerializedName("QualityEvaluationScore")
    @Expose
    private Long QualityEvaluationScore;

    /**
    * List of abnormalities detected in audio and video quality.
    */
    @SerializedName("QualityInspectResultSet")
    @Expose
    private QualityInspectResultItem [] QualityInspectResultSet;

    /**
     * Get Whether there is no audio track in the media file. Value ranges from...to...
<li>0: No, have audio tracks;</li>
<li>1: Yes, no audio track.</li> 
     * @return NoAudio Whether there is no audio track in the media file. Value ranges from...to...
<li>0: No, have audio tracks;</li>
<li>1: Yes, no audio track.</li>
     */
    public Long getNoAudio() {
        return this.NoAudio;
    }

    /**
     * Set Whether there is no audio track in the media file. Value ranges from...to...
<li>0: No, have audio tracks;</li>
<li>1: Yes, no audio track.</li>
     * @param NoAudio Whether there is no audio track in the media file. Value ranges from...to...
<li>0: No, have audio tracks;</li>
<li>1: Yes, no audio track.</li>
     */
    public void setNoAudio(Long NoAudio) {
        this.NoAudio = NoAudio;
    }

    /**
     * Get Whether there is no video track in the media file. Value ranges from...to...
<li>0: No, meaning there is a video track;</li>
<li>1: Yes, no video track.</li> 
     * @return NoVideo Whether there is no video track in the media file. Value ranges from...to...
<li>0: No, meaning there is a video track;</li>
<li>1: Yes, no video track.</li>
     */
    public Long getNoVideo() {
        return this.NoVideo;
    }

    /**
     * Set Whether there is no video track in the media file. Value ranges from...to...
<li>0: No, meaning there is a video track;</li>
<li>1: Yes, no video track.</li>
     * @param NoVideo Whether there is no video track in the media file. Value ranges from...to...
<li>0: No, meaning there is a video track;</li>
<li>1: Yes, no video track.</li>
     */
    public void setNoVideo(Long NoVideo) {
        this.NoVideo = NoVideo;
    }

    /**
     * Get Video picture quality score, value ranges from 0 to 100. 
     * @return QualityEvaluationScore Video picture quality score, value ranges from 0 to 100.
     */
    public Long getQualityEvaluationScore() {
        return this.QualityEvaluationScore;
    }

    /**
     * Set Video picture quality score, value ranges from 0 to 100.
     * @param QualityEvaluationScore Video picture quality score, value ranges from 0 to 100.
     */
    public void setQualityEvaluationScore(Long QualityEvaluationScore) {
        this.QualityEvaluationScore = QualityEvaluationScore;
    }

    /**
     * Get List of abnormalities detected in audio and video quality. 
     * @return QualityInspectResultSet List of abnormalities detected in audio and video quality.
     */
    public QualityInspectResultItem [] getQualityInspectResultSet() {
        return this.QualityInspectResultSet;
    }

    /**
     * Set List of abnormalities detected in audio and video quality.
     * @param QualityInspectResultSet List of abnormalities detected in audio and video quality.
     */
    public void setQualityInspectResultSet(QualityInspectResultItem [] QualityInspectResultSet) {
        this.QualityInspectResultSet = QualityInspectResultSet;
    }

    public QualityInspectTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectTaskOutput(QualityInspectTaskOutput source) {
        if (source.NoAudio != null) {
            this.NoAudio = new Long(source.NoAudio);
        }
        if (source.NoVideo != null) {
            this.NoVideo = new Long(source.NoVideo);
        }
        if (source.QualityEvaluationScore != null) {
            this.QualityEvaluationScore = new Long(source.QualityEvaluationScore);
        }
        if (source.QualityInspectResultSet != null) {
            this.QualityInspectResultSet = new QualityInspectResultItem[source.QualityInspectResultSet.length];
            for (int i = 0; i < source.QualityInspectResultSet.length; i++) {
                this.QualityInspectResultSet[i] = new QualityInspectResultItem(source.QualityInspectResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoAudio", this.NoAudio);
        this.setParamSimple(map, prefix + "NoVideo", this.NoVideo);
        this.setParamSimple(map, prefix + "QualityEvaluationScore", this.QualityEvaluationScore);
        this.setParamArrayObj(map, prefix + "QualityInspectResultSet.", this.QualityInspectResultSet);

    }
}

