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
    * <p>A value of true indicates that the video has no audio track.</p>
    */
    @SerializedName("NoAudio")
    @Expose
    private Boolean NoAudio;

    /**
    * <p>A value of true indicates that the video has no video track.</p>
    */
    @SerializedName("NoVideo")
    @Expose
    private Boolean NoVideo;

    /**
    * <p>No-reference quality score of the video, on a scale of 0 to 100.</p>
    */
    @SerializedName("QualityEvaluationScore")
    @Expose
    private Long QualityEvaluationScore;

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
    * <p>Exception items detected in content quality inspection.</p>
    */
    @SerializedName("QualityControlResultSet")
    @Expose
    private QualityControlResult [] QualityControlResultSet;

    /**
    * <p>Exception items detected in format diagnosis.</p>
    */
    @SerializedName("ContainerDiagnoseResultSet")
    @Expose
    private ContainerDiagnoseResultItem [] ContainerDiagnoseResultSet;

    /**
     * Get <p>A value of true indicates that the video has no audio track.</p> 
     * @return NoAudio <p>A value of true indicates that the video has no audio track.</p>
     */
    public Boolean getNoAudio() {
        return this.NoAudio;
    }

    /**
     * Set <p>A value of true indicates that the video has no audio track.</p>
     * @param NoAudio <p>A value of true indicates that the video has no audio track.</p>
     */
    public void setNoAudio(Boolean NoAudio) {
        this.NoAudio = NoAudio;
    }

    /**
     * Get <p>A value of true indicates that the video has no video track.</p> 
     * @return NoVideo <p>A value of true indicates that the video has no video track.</p>
     */
    public Boolean getNoVideo() {
        return this.NoVideo;
    }

    /**
     * Set <p>A value of true indicates that the video has no video track.</p>
     * @param NoVideo <p>A value of true indicates that the video has no video track.</p>
     */
    public void setNoVideo(Boolean NoVideo) {
        this.NoVideo = NoVideo;
    }

    /**
     * Get <p>No-reference quality score of the video, on a scale of 0 to 100.</p> 
     * @return QualityEvaluationScore <p>No-reference quality score of the video, on a scale of 0 to 100.</p>
     */
    public Long getQualityEvaluationScore() {
        return this.QualityEvaluationScore;
    }

    /**
     * Set <p>No-reference quality score of the video, on a scale of 0 to 100.</p>
     * @param QualityEvaluationScore <p>No-reference quality score of the video, on a scale of 0 to 100.</p>
     */
    public void setQualityEvaluationScore(Long QualityEvaluationScore) {
        this.QualityEvaluationScore = QualityEvaluationScore;
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
     * Get <p>Exception items detected in content quality inspection.</p> 
     * @return QualityControlResultSet <p>Exception items detected in content quality inspection.</p>
     */
    public QualityControlResult [] getQualityControlResultSet() {
        return this.QualityControlResultSet;
    }

    /**
     * Set <p>Exception items detected in content quality inspection.</p>
     * @param QualityControlResultSet <p>Exception items detected in content quality inspection.</p>
     */
    public void setQualityControlResultSet(QualityControlResult [] QualityControlResultSet) {
        this.QualityControlResultSet = QualityControlResultSet;
    }

    /**
     * Get <p>Exception items detected in format diagnosis.</p> 
     * @return ContainerDiagnoseResultSet <p>Exception items detected in format diagnosis.</p>
     */
    public ContainerDiagnoseResultItem [] getContainerDiagnoseResultSet() {
        return this.ContainerDiagnoseResultSet;
    }

    /**
     * Set <p>Exception items detected in format diagnosis.</p>
     * @param ContainerDiagnoseResultSet <p>Exception items detected in format diagnosis.</p>
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
        if (source.AestheticEvaluationScore != null) {
            this.AestheticEvaluationScore = new Long(source.AestheticEvaluationScore);
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
        this.setParamSimple(map, prefix + "AestheticEvaluationScore", this.AestheticEvaluationScore);
        this.setParamArrayObj(map, prefix + "QualityControlResultSet.", this.QualityControlResultSet);
        this.setParamArrayObj(map, prefix + "ContainerDiagnoseResultSet.", this.ContainerDiagnoseResultSet);

    }
}

