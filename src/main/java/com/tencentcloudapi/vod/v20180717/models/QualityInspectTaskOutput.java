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
    * <p>Whether the media file has no audio track. Value range:</p><li>0: No, it has audio tracks;</li><li>1: Yes, it has no audio track.</li>
    */
    @SerializedName("NoAudio")
    @Expose
    private Long NoAudio;

    /**
    * <p>Whether the media file has no video track. Value range:</p><li>0: No, it has a video track;</li><li>1: Yes, it has no video track.</li>
    */
    @SerializedName("NoVideo")
    @Expose
    private Long NoVideo;

    /**
    * <p>Video picture quality score. Value range: [0, 100].</p>
    */
    @SerializedName("QualityEvaluationScore")
    @Expose
    private Long QualityEvaluationScore;

    /**
    * <p>List of abnormalities detected in audio and video quality.</p>
    */
    @SerializedName("QualityInspectResultSet")
    @Expose
    private QualityInspectResultItem [] QualityInspectResultSet;

    /**
    * <p>No-reference quality score of the video (MOS).</p>
    */
    @SerializedName("QualityEvaluationMeanOpinionScore")
    @Expose
    private Float QualityEvaluationMeanOpinionScore;

    /**
    * <p>Video aesthetic score. Value range: [0, 100].</p>
    */
    @SerializedName("AestheticEvaluationScore")
    @Expose
    private Long AestheticEvaluationScore;

    /**
    * <p>Exception items detected in format diagnosis.</p>
    */
    @SerializedName("ContainerDiagnoseResultSet")
    @Expose
    private QualityInspectContainerDiagnoseResultItem [] ContainerDiagnoseResultSet;

    /**
    * <p>LLM AIGC quality detection result.</p>
    */
    @SerializedName("LLMDetectionReport")
    @Expose
    private QualityInspectLLMDetectionReport LLMDetectionReport;

    /**
     * Get <p>Whether the media file has no audio track. Value range:</p><li>0: No, it has audio tracks;</li><li>1: Yes, it has no audio track.</li> 
     * @return NoAudio <p>Whether the media file has no audio track. Value range:</p><li>0: No, it has audio tracks;</li><li>1: Yes, it has no audio track.</li>
     */
    public Long getNoAudio() {
        return this.NoAudio;
    }

    /**
     * Set <p>Whether the media file has no audio track. Value range:</p><li>0: No, it has audio tracks;</li><li>1: Yes, it has no audio track.</li>
     * @param NoAudio <p>Whether the media file has no audio track. Value range:</p><li>0: No, it has audio tracks;</li><li>1: Yes, it has no audio track.</li>
     */
    public void setNoAudio(Long NoAudio) {
        this.NoAudio = NoAudio;
    }

    /**
     * Get <p>Whether the media file has no video track. Value range:</p><li>0: No, it has a video track;</li><li>1: Yes, it has no video track.</li> 
     * @return NoVideo <p>Whether the media file has no video track. Value range:</p><li>0: No, it has a video track;</li><li>1: Yes, it has no video track.</li>
     */
    public Long getNoVideo() {
        return this.NoVideo;
    }

    /**
     * Set <p>Whether the media file has no video track. Value range:</p><li>0: No, it has a video track;</li><li>1: Yes, it has no video track.</li>
     * @param NoVideo <p>Whether the media file has no video track. Value range:</p><li>0: No, it has a video track;</li><li>1: Yes, it has no video track.</li>
     */
    public void setNoVideo(Long NoVideo) {
        this.NoVideo = NoVideo;
    }

    /**
     * Get <p>Video picture quality score. Value range: [0, 100].</p> 
     * @return QualityEvaluationScore <p>Video picture quality score. Value range: [0, 100].</p>
     */
    public Long getQualityEvaluationScore() {
        return this.QualityEvaluationScore;
    }

    /**
     * Set <p>Video picture quality score. Value range: [0, 100].</p>
     * @param QualityEvaluationScore <p>Video picture quality score. Value range: [0, 100].</p>
     */
    public void setQualityEvaluationScore(Long QualityEvaluationScore) {
        this.QualityEvaluationScore = QualityEvaluationScore;
    }

    /**
     * Get <p>List of abnormalities detected in audio and video quality.</p> 
     * @return QualityInspectResultSet <p>List of abnormalities detected in audio and video quality.</p>
     */
    public QualityInspectResultItem [] getQualityInspectResultSet() {
        return this.QualityInspectResultSet;
    }

    /**
     * Set <p>List of abnormalities detected in audio and video quality.</p>
     * @param QualityInspectResultSet <p>List of abnormalities detected in audio and video quality.</p>
     */
    public void setQualityInspectResultSet(QualityInspectResultItem [] QualityInspectResultSet) {
        this.QualityInspectResultSet = QualityInspectResultSet;
    }

    /**
     * Get <p>No-reference quality score of the video (MOS).</p> 
     * @return QualityEvaluationMeanOpinionScore <p>No-reference quality score of the video (MOS).</p>
     */
    public Float getQualityEvaluationMeanOpinionScore() {
        return this.QualityEvaluationMeanOpinionScore;
    }

    /**
     * Set <p>No-reference quality score of the video (MOS).</p>
     * @param QualityEvaluationMeanOpinionScore <p>No-reference quality score of the video (MOS).</p>
     */
    public void setQualityEvaluationMeanOpinionScore(Float QualityEvaluationMeanOpinionScore) {
        this.QualityEvaluationMeanOpinionScore = QualityEvaluationMeanOpinionScore;
    }

    /**
     * Get <p>Video aesthetic score. Value range: [0, 100].</p> 
     * @return AestheticEvaluationScore <p>Video aesthetic score. Value range: [0, 100].</p>
     */
    public Long getAestheticEvaluationScore() {
        return this.AestheticEvaluationScore;
    }

    /**
     * Set <p>Video aesthetic score. Value range: [0, 100].</p>
     * @param AestheticEvaluationScore <p>Video aesthetic score. Value range: [0, 100].</p>
     */
    public void setAestheticEvaluationScore(Long AestheticEvaluationScore) {
        this.AestheticEvaluationScore = AestheticEvaluationScore;
    }

    /**
     * Get <p>Exception items detected in format diagnosis.</p> 
     * @return ContainerDiagnoseResultSet <p>Exception items detected in format diagnosis.</p>
     */
    public QualityInspectContainerDiagnoseResultItem [] getContainerDiagnoseResultSet() {
        return this.ContainerDiagnoseResultSet;
    }

    /**
     * Set <p>Exception items detected in format diagnosis.</p>
     * @param ContainerDiagnoseResultSet <p>Exception items detected in format diagnosis.</p>
     */
    public void setContainerDiagnoseResultSet(QualityInspectContainerDiagnoseResultItem [] ContainerDiagnoseResultSet) {
        this.ContainerDiagnoseResultSet = ContainerDiagnoseResultSet;
    }

    /**
     * Get <p>LLM AIGC quality detection result.</p> 
     * @return LLMDetectionReport <p>LLM AIGC quality detection result.</p>
     */
    public QualityInspectLLMDetectionReport getLLMDetectionReport() {
        return this.LLMDetectionReport;
    }

    /**
     * Set <p>LLM AIGC quality detection result.</p>
     * @param LLMDetectionReport <p>LLM AIGC quality detection result.</p>
     */
    public void setLLMDetectionReport(QualityInspectLLMDetectionReport LLMDetectionReport) {
        this.LLMDetectionReport = LLMDetectionReport;
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
        if (source.QualityEvaluationMeanOpinionScore != null) {
            this.QualityEvaluationMeanOpinionScore = new Float(source.QualityEvaluationMeanOpinionScore);
        }
        if (source.AestheticEvaluationScore != null) {
            this.AestheticEvaluationScore = new Long(source.AestheticEvaluationScore);
        }
        if (source.ContainerDiagnoseResultSet != null) {
            this.ContainerDiagnoseResultSet = new QualityInspectContainerDiagnoseResultItem[source.ContainerDiagnoseResultSet.length];
            for (int i = 0; i < source.ContainerDiagnoseResultSet.length; i++) {
                this.ContainerDiagnoseResultSet[i] = new QualityInspectContainerDiagnoseResultItem(source.ContainerDiagnoseResultSet[i]);
            }
        }
        if (source.LLMDetectionReport != null) {
            this.LLMDetectionReport = new QualityInspectLLMDetectionReport(source.LLMDetectionReport);
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
        this.setParamSimple(map, prefix + "QualityEvaluationMeanOpinionScore", this.QualityEvaluationMeanOpinionScore);
        this.setParamSimple(map, prefix + "AestheticEvaluationScore", this.AestheticEvaluationScore);
        this.setParamArrayObj(map, prefix + "ContainerDiagnoseResultSet.", this.ContainerDiagnoseResultSet);
        this.setParamObj(map, prefix + "LLMDetectionReport.", this.LLMDetectionReport);

    }
}

