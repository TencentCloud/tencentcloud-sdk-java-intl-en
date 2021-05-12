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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceQualityInfo extends AbstractModel{

    /**
    * Quality score. Value range: [0,100]. It comprehensively evaluates whether the image quality is suitable for face recognition; the higher the score, the higher the quality. 
In normal cases, you only need to use `Score` as the overall quality standard score. Specific item scores such as `Sharpness`, `Brightness`, `Completeness` are for reference only.
Reference range: [0,40]: poor; [40,60]: fine; [60,80]: good; [80,100]: excellent. 
We recommend selecting images with a score above 70 for adding faces.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * Sharpness. Value range: [0,100]. It evaluates the sharpness of the image. The higher the score, the sharper the image. 
Reference range: [0,40]: very blurry; [40,60]: blurry; [60,80]: fine; [80,100]: sharp. 
We recommend selecting images with a score above 80 for adding faces.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sharpness")
    @Expose
    private Long Sharpness;

    /**
    * Brightness. Value range: [0,100]. The brighter the image, the higher the score. 
Reference range: [0,30]: dark; [30,70]: normal; [70,100]: bright. 
We recommend selecting images in the [30,70] range for adding faces.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Brightness")
    @Expose
    private Long Brightness;

    /**
    * Completeness of facial features, which assesses the completeness of the eyebrows, eyes, nose, cheeks, mouth, and chin.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Completeness")
    @Expose
    private FaceQualityCompleteness Completeness;

    /**
     * Get Quality score. Value range: [0,100]. It comprehensively evaluates whether the image quality is suitable for face recognition; the higher the score, the higher the quality. 
In normal cases, you only need to use `Score` as the overall quality standard score. Specific item scores such as `Sharpness`, `Brightness`, `Completeness` are for reference only.
Reference range: [0,40]: poor; [40,60]: fine; [60,80]: good; [80,100]: excellent. 
We recommend selecting images with a score above 70 for adding faces.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Score Quality score. Value range: [0,100]. It comprehensively evaluates whether the image quality is suitable for face recognition; the higher the score, the higher the quality. 
In normal cases, you only need to use `Score` as the overall quality standard score. Specific item scores such as `Sharpness`, `Brightness`, `Completeness` are for reference only.
Reference range: [0,40]: poor; [40,60]: fine; [60,80]: good; [80,100]: excellent. 
We recommend selecting images with a score above 70 for adding faces.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set Quality score. Value range: [0,100]. It comprehensively evaluates whether the image quality is suitable for face recognition; the higher the score, the higher the quality. 
In normal cases, you only need to use `Score` as the overall quality standard score. Specific item scores such as `Sharpness`, `Brightness`, `Completeness` are for reference only.
Reference range: [0,40]: poor; [40,60]: fine; [60,80]: good; [80,100]: excellent. 
We recommend selecting images with a score above 70 for adding faces.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Score Quality score. Value range: [0,100]. It comprehensively evaluates whether the image quality is suitable for face recognition; the higher the score, the higher the quality. 
In normal cases, you only need to use `Score` as the overall quality standard score. Specific item scores such as `Sharpness`, `Brightness`, `Completeness` are for reference only.
Reference range: [0,40]: poor; [40,60]: fine; [60,80]: good; [80,100]: excellent. 
We recommend selecting images with a score above 70 for adding faces.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get Sharpness. Value range: [0,100]. It evaluates the sharpness of the image. The higher the score, the sharper the image. 
Reference range: [0,40]: very blurry; [40,60]: blurry; [60,80]: fine; [80,100]: sharp. 
We recommend selecting images with a score above 80 for adding faces.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Sharpness Sharpness. Value range: [0,100]. It evaluates the sharpness of the image. The higher the score, the sharper the image. 
Reference range: [0,40]: very blurry; [40,60]: blurry; [60,80]: fine; [80,100]: sharp. 
We recommend selecting images with a score above 80 for adding faces.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getSharpness() {
        return this.Sharpness;
    }

    /**
     * Set Sharpness. Value range: [0,100]. It evaluates the sharpness of the image. The higher the score, the sharper the image. 
Reference range: [0,40]: very blurry; [40,60]: blurry; [60,80]: fine; [80,100]: sharp. 
We recommend selecting images with a score above 80 for adding faces.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Sharpness Sharpness. Value range: [0,100]. It evaluates the sharpness of the image. The higher the score, the sharper the image. 
Reference range: [0,40]: very blurry; [40,60]: blurry; [60,80]: fine; [80,100]: sharp. 
We recommend selecting images with a score above 80 for adding faces.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSharpness(Long Sharpness) {
        this.Sharpness = Sharpness;
    }

    /**
     * Get Brightness. Value range: [0,100]. The brighter the image, the higher the score. 
Reference range: [0,30]: dark; [30,70]: normal; [70,100]: bright. 
We recommend selecting images in the [30,70] range for adding faces.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Brightness Brightness. Value range: [0,100]. The brighter the image, the higher the score. 
Reference range: [0,30]: dark; [30,70]: normal; [70,100]: bright. 
We recommend selecting images in the [30,70] range for adding faces.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getBrightness() {
        return this.Brightness;
    }

    /**
     * Set Brightness. Value range: [0,100]. The brighter the image, the higher the score. 
Reference range: [0,30]: dark; [30,70]: normal; [70,100]: bright. 
We recommend selecting images in the [30,70] range for adding faces.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Brightness Brightness. Value range: [0,100]. The brighter the image, the higher the score. 
Reference range: [0,30]: dark; [30,70]: normal; [70,100]: bright. 
We recommend selecting images in the [30,70] range for adding faces.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBrightness(Long Brightness) {
        this.Brightness = Brightness;
    }

    /**
     * Get Completeness of facial features, which assesses the completeness of the eyebrows, eyes, nose, cheeks, mouth, and chin.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Completeness Completeness of facial features, which assesses the completeness of the eyebrows, eyes, nose, cheeks, mouth, and chin.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public FaceQualityCompleteness getCompleteness() {
        return this.Completeness;
    }

    /**
     * Set Completeness of facial features, which assesses the completeness of the eyebrows, eyes, nose, cheeks, mouth, and chin.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Completeness Completeness of facial features, which assesses the completeness of the eyebrows, eyes, nose, cheeks, mouth, and chin.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCompleteness(FaceQualityCompleteness Completeness) {
        this.Completeness = Completeness;
    }

    public FaceQualityInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceQualityInfo(FaceQualityInfo source) {
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Sharpness != null) {
            this.Sharpness = new Long(source.Sharpness);
        }
        if (source.Brightness != null) {
            this.Brightness = new Long(source.Brightness);
        }
        if (source.Completeness != null) {
            this.Completeness = new FaceQualityCompleteness(source.Completeness);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Sharpness", this.Sharpness);
        this.setParamSimple(map, prefix + "Brightness", this.Brightness);
        this.setParamObj(map, prefix + "Completeness.", this.Completeness);

    }
}

