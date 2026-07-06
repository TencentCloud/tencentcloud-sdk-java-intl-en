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

public class AiRecognitionTaskOcrFullTextSegmentTextItem extends AbstractModel {

    /**
    * <p>Confidence of the recognized segment. Value range: 0–100.</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * <p>Area coordinates of the recognition result. The array contains 4 elements [x1,y1,x2,y2], representing the horizontal and vertical coordinates of the top-left corner and bottom-right corner.</p>
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * <p>Recognized text.</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get <p>Confidence of the recognized segment. Value range: 0–100.</p> 
     * @return Confidence <p>Confidence of the recognized segment. Value range: 0–100.</p>
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>Confidence of the recognized segment. Value range: 0–100.</p>
     * @param Confidence <p>Confidence of the recognized segment. Value range: 0–100.</p>
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>Area coordinates of the recognition result. The array contains 4 elements [x1,y1,x2,y2], representing the horizontal and vertical coordinates of the top-left corner and bottom-right corner.</p> 
     * @return AreaCoordSet <p>Area coordinates of the recognition result. The array contains 4 elements [x1,y1,x2,y2], representing the horizontal and vertical coordinates of the top-left corner and bottom-right corner.</p>
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set <p>Area coordinates of the recognition result. The array contains 4 elements [x1,y1,x2,y2], representing the horizontal and vertical coordinates of the top-left corner and bottom-right corner.</p>
     * @param AreaCoordSet <p>Area coordinates of the recognition result. The array contains 4 elements [x1,y1,x2,y2], representing the horizontal and vertical coordinates of the top-left corner and bottom-right corner.</p>
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get <p>Recognized text.</p> 
     * @return Text <p>Recognized text.</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>Recognized text.</p>
     * @param Text <p>Recognized text.</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    public AiRecognitionTaskOcrFullTextSegmentTextItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskOcrFullTextSegmentTextItem(AiRecognitionTaskOcrFullTextSegmentTextItem source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.AreaCoordSet != null) {
            this.AreaCoordSet = new Long[source.AreaCoordSet.length];
            for (int i = 0; i < source.AreaCoordSet.length; i++) {
                this.AreaCoordSet[i] = new Long(source.AreaCoordSet[i]);
            }
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamSimple(map, prefix + "Text", this.Text);

    }
}

