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
    * 
    */
    @SerializedName("NoAudio")
    @Expose
    private Long NoAudio;

    /**
    * 
    */
    @SerializedName("NoVideo")
    @Expose
    private Long NoVideo;

    /**
    * 
    */
    @SerializedName("QualityEvaluationScore")
    @Expose
    private Long QualityEvaluationScore;

    /**
    * 
    */
    @SerializedName("QualityInspectResultSet")
    @Expose
    private QualityInspectResultItem [] QualityInspectResultSet;

    /**
    * 
    */
    @SerializedName("QualityEvaluationMeanOpinionScore")
    @Expose
    private Float QualityEvaluationMeanOpinionScore;

    /**
    * 
    */
    @SerializedName("AestheticEvaluationScore")
    @Expose
    private Long AestheticEvaluationScore;

    /**
    * 
    */
    @SerializedName("ContainerDiagnoseResultSet")
    @Expose
    private QualityInspectContainerDiagnoseResultItem [] ContainerDiagnoseResultSet;

    /**
    * 
    */
    @SerializedName("LLMDetectionReport")
    @Expose
    private QualityInspectLLMDetectionReport LLMDetectionReport;

    /**
     * Get  
     * @return NoAudio 
     */
    public Long getNoAudio() {
        return this.NoAudio;
    }

    /**
     * Set 
     * @param NoAudio 
     */
    public void setNoAudio(Long NoAudio) {
        this.NoAudio = NoAudio;
    }

    /**
     * Get  
     * @return NoVideo 
     */
    public Long getNoVideo() {
        return this.NoVideo;
    }

    /**
     * Set 
     * @param NoVideo 
     */
    public void setNoVideo(Long NoVideo) {
        this.NoVideo = NoVideo;
    }

    /**
     * Get  
     * @return QualityEvaluationScore 
     */
    public Long getQualityEvaluationScore() {
        return this.QualityEvaluationScore;
    }

    /**
     * Set 
     * @param QualityEvaluationScore 
     */
    public void setQualityEvaluationScore(Long QualityEvaluationScore) {
        this.QualityEvaluationScore = QualityEvaluationScore;
    }

    /**
     * Get  
     * @return QualityInspectResultSet 
     */
    public QualityInspectResultItem [] getQualityInspectResultSet() {
        return this.QualityInspectResultSet;
    }

    /**
     * Set 
     * @param QualityInspectResultSet 
     */
    public void setQualityInspectResultSet(QualityInspectResultItem [] QualityInspectResultSet) {
        this.QualityInspectResultSet = QualityInspectResultSet;
    }

    /**
     * Get  
     * @return QualityEvaluationMeanOpinionScore 
     */
    public Float getQualityEvaluationMeanOpinionScore() {
        return this.QualityEvaluationMeanOpinionScore;
    }

    /**
     * Set 
     * @param QualityEvaluationMeanOpinionScore 
     */
    public void setQualityEvaluationMeanOpinionScore(Float QualityEvaluationMeanOpinionScore) {
        this.QualityEvaluationMeanOpinionScore = QualityEvaluationMeanOpinionScore;
    }

    /**
     * Get  
     * @return AestheticEvaluationScore 
     */
    public Long getAestheticEvaluationScore() {
        return this.AestheticEvaluationScore;
    }

    /**
     * Set 
     * @param AestheticEvaluationScore 
     */
    public void setAestheticEvaluationScore(Long AestheticEvaluationScore) {
        this.AestheticEvaluationScore = AestheticEvaluationScore;
    }

    /**
     * Get  
     * @return ContainerDiagnoseResultSet 
     */
    public QualityInspectContainerDiagnoseResultItem [] getContainerDiagnoseResultSet() {
        return this.ContainerDiagnoseResultSet;
    }

    /**
     * Set 
     * @param ContainerDiagnoseResultSet 
     */
    public void setContainerDiagnoseResultSet(QualityInspectContainerDiagnoseResultItem [] ContainerDiagnoseResultSet) {
        this.ContainerDiagnoseResultSet = ContainerDiagnoseResultSet;
    }

    /**
     * Get  
     * @return LLMDetectionReport 
     */
    public QualityInspectLLMDetectionReport getLLMDetectionReport() {
        return this.LLMDetectionReport;
    }

    /**
     * Set 
     * @param LLMDetectionReport 
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

