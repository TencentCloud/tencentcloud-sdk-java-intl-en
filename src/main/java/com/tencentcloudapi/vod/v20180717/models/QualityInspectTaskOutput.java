/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * Whether the media files have no audio track, range: <li>0: No, that is, there is an audio track;</li> <li>1: Yes, that is, there is no audio track.</li>
    */
    @SerializedName("NoAudio")
    @Expose
    private Long NoAudio;

    /**
    * Whether the media files have no video track, range: <li>0: No, that is, there is a video track;</li> <li>1: Yes, that is, there is no video track.</li>
    */
    @SerializedName("NoVideo")
    @Expose
    private Long NoVideo;

    /**
    * Quality score, value range: [0, 100].
    */
    @SerializedName("QualityEvaluationScore")
    @Expose
    private Long QualityEvaluationScore;

    /**
    * Abnormal items list detected of media quality inspection task
    */
    @SerializedName("QualityInspectResultSet")
    @Expose
    private QualityInspectResultItem [] QualityInspectResultSet;

    /**
     * Get Whether the media files have no audio track, range: <li>0: No, that is, there is an audio track;</li> <li>1: Yes, that is, there is no audio track.</li> 
     * @return NoAudio Whether the media files have no audio track, range: <li>0: No, that is, there is an audio track;</li> <li>1: Yes, that is, there is no audio track.</li>
     */
    public Long getNoAudio() {
        return this.NoAudio;
    }

    /**
     * Set Whether the media files have no audio track, range: <li>0: No, that is, there is an audio track;</li> <li>1: Yes, that is, there is no audio track.</li>
     * @param NoAudio Whether the media files have no audio track, range: <li>0: No, that is, there is an audio track;</li> <li>1: Yes, that is, there is no audio track.</li>
     */
    public void setNoAudio(Long NoAudio) {
        this.NoAudio = NoAudio;
    }

    /**
     * Get Whether the media files have no video track, range: <li>0: No, that is, there is a video track;</li> <li>1: Yes, that is, there is no video track.</li> 
     * @return NoVideo Whether the media files have no video track, range: <li>0: No, that is, there is a video track;</li> <li>1: Yes, that is, there is no video track.</li>
     */
    public Long getNoVideo() {
        return this.NoVideo;
    }

    /**
     * Set Whether the media files have no video track, range: <li>0: No, that is, there is a video track;</li> <li>1: Yes, that is, there is no video track.</li>
     * @param NoVideo Whether the media files have no video track, range: <li>0: No, that is, there is a video track;</li> <li>1: Yes, that is, there is no video track.</li>
     */
    public void setNoVideo(Long NoVideo) {
        this.NoVideo = NoVideo;
    }

    /**
     * Get Quality score, value range: [0, 100]. 
     * @return QualityEvaluationScore Quality score, value range: [0, 100].
     */
    public Long getQualityEvaluationScore() {
        return this.QualityEvaluationScore;
    }

    /**
     * Set Quality score, value range: [0, 100].
     * @param QualityEvaluationScore Quality score, value range: [0, 100].
     */
    public void setQualityEvaluationScore(Long QualityEvaluationScore) {
        this.QualityEvaluationScore = QualityEvaluationScore;
    }

    /**
     * Get Abnormal items list detected of media quality inspection task 
     * @return QualityInspectResultSet Abnormal items list detected of media quality inspection task
     */
    public QualityInspectResultItem [] getQualityInspectResultSet() {
        return this.QualityInspectResultSet;
    }

    /**
     * Set Abnormal items list detected of media quality inspection task
     * @param QualityInspectResultSet Abnormal items list detected of media quality inspection task
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

