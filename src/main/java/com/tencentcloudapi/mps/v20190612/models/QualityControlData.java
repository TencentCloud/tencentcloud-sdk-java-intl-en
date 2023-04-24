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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityControlData extends AbstractModel{

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
    * The no-reference video quality score. Value range: 0-100.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QualityEvaluationScore")
    @Expose
    private Long QualityEvaluationScore;

    /**
    * The issues detected by quality control.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QualityControlResultSet")
    @Expose
    private QualityControlResult [] QualityControlResultSet;

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
     * Get The no-reference video quality score. Value range: 0-100.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QualityEvaluationScore The no-reference video quality score. Value range: 0-100.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getQualityEvaluationScore() {
        return this.QualityEvaluationScore;
    }

    /**
     * Set The no-reference video quality score. Value range: 0-100.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QualityEvaluationScore The no-reference video quality score. Value range: 0-100.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQualityEvaluationScore(Long QualityEvaluationScore) {
        this.QualityEvaluationScore = QualityEvaluationScore;
    }

    /**
     * Get The issues detected by quality control.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QualityControlResultSet The issues detected by quality control.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public QualityControlResult [] getQualityControlResultSet() {
        return this.QualityControlResultSet;
    }

    /**
     * Set The issues detected by quality control.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QualityControlResultSet The issues detected by quality control.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQualityControlResultSet(QualityControlResult [] QualityControlResultSet) {
        this.QualityControlResultSet = QualityControlResultSet;
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
        if (source.QualityControlResultSet != null) {
            this.QualityControlResultSet = new QualityControlResult[source.QualityControlResultSet.length];
            for (int i = 0; i < source.QualityControlResultSet.length; i++) {
                this.QualityControlResultSet[i] = new QualityControlResult(source.QualityControlResultSet[i]);
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
        this.setParamArrayObj(map, prefix + "QualityControlResultSet.", this.QualityControlResultSet);

    }
}

