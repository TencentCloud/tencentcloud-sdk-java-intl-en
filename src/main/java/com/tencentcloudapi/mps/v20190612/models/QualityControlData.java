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

public class QualityControlData extends AbstractModel {

    /**
    * When this field is set to true, it indicates that the video has no audio track.
    */
    @SerializedName("NoAudio")
    @Expose
    private Boolean NoAudio;

    /**
    * When this field is set to true, it indicates that the video has no video track.
    */
    @SerializedName("NoVideo")
    @Expose
    private Boolean NoVideo;

    /**
    * No-reference quality score of the video (100 points in total).
    */
    @SerializedName("QualityEvaluationScore")
    @Expose
    private Long QualityEvaluationScore;

    /**
    * No-reference quality score of the video (MOS).
    */
    @SerializedName("QualityEvaluationMeanOpinionScore")
    @Expose
    private Float QualityEvaluationMeanOpinionScore;

    /**
    * Exception items identified in content quality inspection.
    */
    @SerializedName("QualityControlResultSet")
    @Expose
    private QualityControlResult [] QualityControlResultSet;

    /**
    * Exception items identified in format diagnosis.
    */
    @SerializedName("ContainerDiagnoseResultSet")
    @Expose
    private ContainerDiagnoseResultItem [] ContainerDiagnoseResultSet;

    /**
     * Get When this field is set to true, it indicates that the video has no audio track. 
     * @return NoAudio When this field is set to true, it indicates that the video has no audio track.
     */
    public Boolean getNoAudio() {
        return this.NoAudio;
    }

    /**
     * Set When this field is set to true, it indicates that the video has no audio track.
     * @param NoAudio When this field is set to true, it indicates that the video has no audio track.
     */
    public void setNoAudio(Boolean NoAudio) {
        this.NoAudio = NoAudio;
    }

    /**
     * Get When this field is set to true, it indicates that the video has no video track. 
     * @return NoVideo When this field is set to true, it indicates that the video has no video track.
     */
    public Boolean getNoVideo() {
        return this.NoVideo;
    }

    /**
     * Set When this field is set to true, it indicates that the video has no video track.
     * @param NoVideo When this field is set to true, it indicates that the video has no video track.
     */
    public void setNoVideo(Boolean NoVideo) {
        this.NoVideo = NoVideo;
    }

    /**
     * Get No-reference quality score of the video (100 points in total). 
     * @return QualityEvaluationScore No-reference quality score of the video (100 points in total).
     */
    public Long getQualityEvaluationScore() {
        return this.QualityEvaluationScore;
    }

    /**
     * Set No-reference quality score of the video (100 points in total).
     * @param QualityEvaluationScore No-reference quality score of the video (100 points in total).
     */
    public void setQualityEvaluationScore(Long QualityEvaluationScore) {
        this.QualityEvaluationScore = QualityEvaluationScore;
    }

    /**
     * Get No-reference quality score of the video (MOS). 
     * @return QualityEvaluationMeanOpinionScore No-reference quality score of the video (MOS).
     */
    public Float getQualityEvaluationMeanOpinionScore() {
        return this.QualityEvaluationMeanOpinionScore;
    }

    /**
     * Set No-reference quality score of the video (MOS).
     * @param QualityEvaluationMeanOpinionScore No-reference quality score of the video (MOS).
     */
    public void setQualityEvaluationMeanOpinionScore(Float QualityEvaluationMeanOpinionScore) {
        this.QualityEvaluationMeanOpinionScore = QualityEvaluationMeanOpinionScore;
    }

    /**
     * Get Exception items identified in content quality inspection. 
     * @return QualityControlResultSet Exception items identified in content quality inspection.
     */
    public QualityControlResult [] getQualityControlResultSet() {
        return this.QualityControlResultSet;
    }

    /**
     * Set Exception items identified in content quality inspection.
     * @param QualityControlResultSet Exception items identified in content quality inspection.
     */
    public void setQualityControlResultSet(QualityControlResult [] QualityControlResultSet) {
        this.QualityControlResultSet = QualityControlResultSet;
    }

    /**
     * Get Exception items identified in format diagnosis. 
     * @return ContainerDiagnoseResultSet Exception items identified in format diagnosis.
     */
    public ContainerDiagnoseResultItem [] getContainerDiagnoseResultSet() {
        return this.ContainerDiagnoseResultSet;
    }

    /**
     * Set Exception items identified in format diagnosis.
     * @param ContainerDiagnoseResultSet Exception items identified in format diagnosis.
     */
    public void setContainerDiagnoseResultSet(ContainerDiagnoseResultItem [] ContainerDiagnoseResultSet) {
        this.ContainerDiagnoseResultSet = ContainerDiagnoseResultSet;
    }

    public QualityControlData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlData(QualityControlData source) {
        if (source.NoAudio != null) {
            this.NoAudio = new Boolean(source.NoAudio);
        }
        if (source.NoVideo != null) {
            this.NoVideo = new Boolean(source.NoVideo);
        }
        if (source.QualityEvaluationScore != null) {
            this.QualityEvaluationScore = new Long(source.QualityEvaluationScore);
        }
        if (source.QualityEvaluationMeanOpinionScore != null) {
            this.QualityEvaluationMeanOpinionScore = new Float(source.QualityEvaluationMeanOpinionScore);
        }
        if (source.QualityControlResultSet != null) {
            this.QualityControlResultSet = new QualityControlResult[source.QualityControlResultSet.length];
            for (int i = 0; i < source.QualityControlResultSet.length; i++) {
                this.QualityControlResultSet[i] = new QualityControlResult(source.QualityControlResultSet[i]);
            }
        }
        if (source.ContainerDiagnoseResultSet != null) {
            this.ContainerDiagnoseResultSet = new ContainerDiagnoseResultItem[source.ContainerDiagnoseResultSet.length];
            for (int i = 0; i < source.ContainerDiagnoseResultSet.length; i++) {
                this.ContainerDiagnoseResultSet[i] = new ContainerDiagnoseResultItem(source.ContainerDiagnoseResultSet[i]);
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
        this.setParamSimple(map, prefix + "QualityEvaluationMeanOpinionScore", this.QualityEvaluationMeanOpinionScore);
        this.setParamArrayObj(map, prefix + "QualityControlResultSet.", this.QualityControlResultSet);
        this.setParamArrayObj(map, prefix + "ContainerDiagnoseResultSet.", this.ContainerDiagnoseResultSet);

    }
}

