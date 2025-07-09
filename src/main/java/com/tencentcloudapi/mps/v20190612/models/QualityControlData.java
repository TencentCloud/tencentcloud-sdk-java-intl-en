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
    * Whether there is an audio track. `true` indicates that there isn't.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NoAudio")
    @Expose
    private Boolean NoAudio;

    /**
    * Whether there is a video track. `true` indicates that there isn't.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NoVideo")
    @Expose
    private Boolean NoVideo;

    /**
    * No-reference quality score of the video (100 points in total).
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QualityEvaluationScore")
    @Expose
    private Long QualityEvaluationScore;

    /**
    * No-reference quality score of the video (MOS).
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("QualityEvaluationMeanOpinionScore")
    @Expose
    private Float QualityEvaluationMeanOpinionScore;

    /**
    * Exception items detected in content quality inspection.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QualityControlResultSet")
    @Expose
    private QualityControlResult [] QualityControlResultSet;

    /**
    * Exception items detected in format diagnosis.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerDiagnoseResultSet")
    @Expose
    private ContainerDiagnoseResultItem [] ContainerDiagnoseResultSet;

    /**
     * Get Whether there is an audio track. `true` indicates that there isn't.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NoAudio Whether there is an audio track. `true` indicates that there isn't.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getNoAudio() {
        return this.NoAudio;
    }

    /**
     * Set Whether there is an audio track. `true` indicates that there isn't.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NoAudio Whether there is an audio track. `true` indicates that there isn't.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNoAudio(Boolean NoAudio) {
        this.NoAudio = NoAudio;
    }

    /**
     * Get Whether there is a video track. `true` indicates that there isn't.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NoVideo Whether there is a video track. `true` indicates that there isn't.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getNoVideo() {
        return this.NoVideo;
    }

    /**
     * Set Whether there is a video track. `true` indicates that there isn't.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NoVideo Whether there is a video track. `true` indicates that there isn't.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNoVideo(Boolean NoVideo) {
        this.NoVideo = NoVideo;
    }

    /**
     * Get No-reference quality score of the video (100 points in total).
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QualityEvaluationScore No-reference quality score of the video (100 points in total).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getQualityEvaluationScore() {
        return this.QualityEvaluationScore;
    }

    /**
     * Set No-reference quality score of the video (100 points in total).
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QualityEvaluationScore No-reference quality score of the video (100 points in total).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQualityEvaluationScore(Long QualityEvaluationScore) {
        this.QualityEvaluationScore = QualityEvaluationScore;
    }

    /**
     * Get No-reference quality score of the video (MOS).
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return QualityEvaluationMeanOpinionScore No-reference quality score of the video (MOS).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Float getQualityEvaluationMeanOpinionScore() {
        return this.QualityEvaluationMeanOpinionScore;
    }

    /**
     * Set No-reference quality score of the video (MOS).
Note: This field may return null, indicating that no valid value can be obtained.
     * @param QualityEvaluationMeanOpinionScore No-reference quality score of the video (MOS).
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setQualityEvaluationMeanOpinionScore(Float QualityEvaluationMeanOpinionScore) {
        this.QualityEvaluationMeanOpinionScore = QualityEvaluationMeanOpinionScore;
    }

    /**
     * Get Exception items detected in content quality inspection.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QualityControlResultSet Exception items detected in content quality inspection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public QualityControlResult [] getQualityControlResultSet() {
        return this.QualityControlResultSet;
    }

    /**
     * Set Exception items detected in content quality inspection.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QualityControlResultSet Exception items detected in content quality inspection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQualityControlResultSet(QualityControlResult [] QualityControlResultSet) {
        this.QualityControlResultSet = QualityControlResultSet;
    }

    /**
     * Get Exception items detected in format diagnosis.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerDiagnoseResultSet Exception items detected in format diagnosis.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ContainerDiagnoseResultItem [] getContainerDiagnoseResultSet() {
        return this.ContainerDiagnoseResultSet;
    }

    /**
     * Set Exception items detected in format diagnosis.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerDiagnoseResultSet Exception items detected in format diagnosis.
Note: This field may return null, indicating that no valid values can be obtained.
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

