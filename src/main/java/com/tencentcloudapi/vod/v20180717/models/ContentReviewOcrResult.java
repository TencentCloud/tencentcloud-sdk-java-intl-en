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

public class ContentReviewOcrResult extends AbstractModel {

    /**
    * <p>Score of Ocr text identification result. Value range: 0-100.</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * <p>Result suggestions for Ocr text identification. Value range:</p><li>pass;</li><li>review;</li><li>block.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * <p>List of suspicious keywords for Ocr text identification.</p>
    */
    @SerializedName("KeywordSet")
    @Expose
    private String [] KeywordSet;

    /**
    * <p>Area coordinates (pixel level) where the suspected text appears in Ocr text identification, [x1, y1, x2, y2], which are the coordinates of the top-left corner and the bottom-right corner.</p>
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
     * Get <p>Score of Ocr text identification result. Value range: 0-100.</p> 
     * @return Confidence <p>Score of Ocr text identification result. Value range: 0-100.</p>
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>Score of Ocr text identification result. Value range: 0-100.</p>
     * @param Confidence <p>Score of Ocr text identification result. Value range: 0-100.</p>
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>Result suggestions for Ocr text identification. Value range:</p><li>pass;</li><li>review;</li><li>block.</li> 
     * @return Suggestion <p>Result suggestions for Ocr text identification. Value range:</p><li>pass;</li><li>review;</li><li>block.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set <p>Result suggestions for Ocr text identification. Value range:</p><li>pass;</li><li>review;</li><li>block.</li>
     * @param Suggestion <p>Result suggestions for Ocr text identification. Value range:</p><li>pass;</li><li>review;</li><li>block.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get <p>List of suspicious keywords for Ocr text identification.</p> 
     * @return KeywordSet <p>List of suspicious keywords for Ocr text identification.</p>
     */
    public String [] getKeywordSet() {
        return this.KeywordSet;
    }

    /**
     * Set <p>List of suspicious keywords for Ocr text identification.</p>
     * @param KeywordSet <p>List of suspicious keywords for Ocr text identification.</p>
     */
    public void setKeywordSet(String [] KeywordSet) {
        this.KeywordSet = KeywordSet;
    }

    /**
     * Get <p>Area coordinates (pixel level) where the suspected text appears in Ocr text identification, [x1, y1, x2, y2], which are the coordinates of the top-left corner and the bottom-right corner.</p> 
     * @return AreaCoordSet <p>Area coordinates (pixel level) where the suspected text appears in Ocr text identification, [x1, y1, x2, y2], which are the coordinates of the top-left corner and the bottom-right corner.</p>
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set <p>Area coordinates (pixel level) where the suspected text appears in Ocr text identification, [x1, y1, x2, y2], which are the coordinates of the top-left corner and the bottom-right corner.</p>
     * @param AreaCoordSet <p>Area coordinates (pixel level) where the suspected text appears in Ocr text identification, [x1, y1, x2, y2], which are the coordinates of the top-left corner and the bottom-right corner.</p>
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    public ContentReviewOcrResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentReviewOcrResult(ContentReviewOcrResult source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.KeywordSet != null) {
            this.KeywordSet = new String[source.KeywordSet.length];
            for (int i = 0; i < source.KeywordSet.length; i++) {
                this.KeywordSet[i] = new String(source.KeywordSet[i]);
            }
        }
        if (source.AreaCoordSet != null) {
            this.AreaCoordSet = new Long[source.AreaCoordSet.length];
            for (int i = 0; i < source.AreaCoordSet.length; i++) {
                this.AreaCoordSet[i] = new Long(source.AreaCoordSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamArraySimple(map, prefix + "KeywordSet.", this.KeywordSet);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);

    }
}

