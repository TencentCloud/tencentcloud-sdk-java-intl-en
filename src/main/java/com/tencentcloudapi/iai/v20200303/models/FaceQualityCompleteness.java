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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceQualityCompleteness extends AbstractModel {

    /**
    * Eyebrow completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,80], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Eyebrow")
    @Expose
    private Long Eyebrow;

    /**
    * Eye completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,80], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Eye")
    @Expose
    private Long Eye;

    /**
    * Nose completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,60], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nose")
    @Expose
    private Long Nose;

    /**
    * Cheek completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,70], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cheek")
    @Expose
    private Long Cheek;

    /**
    * Mouth completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,50], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Mouth")
    @Expose
    private Long Mouth;

    /**
    * Chin completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,70], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Chin")
    @Expose
    private Long Chin;

    /**
     * Get Eyebrow completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,80], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Eyebrow Eyebrow completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,80], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getEyebrow() {
        return this.Eyebrow;
    }

    /**
     * Set Eyebrow completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,80], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Eyebrow Eyebrow completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,80], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEyebrow(Long Eyebrow) {
        this.Eyebrow = Eyebrow;
    }

    /**
     * Get Eye completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,80], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Eye Eye completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,80], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getEye() {
        return this.Eye;
    }

    /**
     * Set Eye completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,80], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Eye Eye completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,80], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEye(Long Eye) {
        this.Eye = Eye;
    }

    /**
     * Get Nose completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,60], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Nose Nose completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,60], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getNose() {
        return this.Nose;
    }

    /**
     * Set Nose completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,60], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Nose Nose completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,60], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNose(Long Nose) {
        this.Nose = Nose;
    }

    /**
     * Get Cheek completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,70], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Cheek Cheek completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,70], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCheek() {
        return this.Cheek;
    }

    /**
     * Set Cheek completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,70], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Cheek Cheek completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,70], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCheek(Long Cheek) {
        this.Cheek = Cheek;
    }

    /**
     * Get Mouth completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,50], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Mouth Mouth completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,50], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getMouth() {
        return this.Mouth;
    }

    /**
     * Set Mouth completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,50], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Mouth Mouth completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,50], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMouth(Long Mouth) {
        this.Mouth = Mouth;
    }

    /**
     * Get Chin completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,70], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Chin Chin completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,70], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getChin() {
        return this.Chin;
    }

    /**
     * Set Chin completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,70], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Chin Chin completeness. Value range: [0,100]. The higher the score, the higher the completeness. 
Reference range: [0,70], which means incomplete.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setChin(Long Chin) {
        this.Chin = Chin;
    }

    public FaceQualityCompleteness() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceQualityCompleteness(FaceQualityCompleteness source) {
        if (source.Eyebrow != null) {
            this.Eyebrow = new Long(source.Eyebrow);
        }
        if (source.Eye != null) {
            this.Eye = new Long(source.Eye);
        }
        if (source.Nose != null) {
            this.Nose = new Long(source.Nose);
        }
        if (source.Cheek != null) {
            this.Cheek = new Long(source.Cheek);
        }
        if (source.Mouth != null) {
            this.Mouth = new Long(source.Mouth);
        }
        if (source.Chin != null) {
            this.Chin = new Long(source.Chin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Eyebrow", this.Eyebrow);
        this.setParamSimple(map, prefix + "Eye", this.Eye);
        this.setParamSimple(map, prefix + "Nose", this.Nose);
        this.setParamSimple(map, prefix + "Cheek", this.Cheek);
        this.setParamSimple(map, prefix + "Mouth", this.Mouth);
        this.setParamSimple(map, prefix + "Chin", this.Chin);

    }
}

