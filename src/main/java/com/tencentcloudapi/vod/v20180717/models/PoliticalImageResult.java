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

public class PoliticalImageResult extends AbstractModel {

    /**
    * Authentication involves scoring inappropriate information, with a score from 0 to 100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Result suggestions for authentication involving inappropriate information, value ranges from...to...
<li>pass;</li>
<li>review;</li>
<li>block.</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * Involves inappropriate information and violative icon names.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Coordinates of the area where inappropriate information or violation icons appear (pixel level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and bottom-right corner.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
     * Get Authentication involves scoring inappropriate information, with a score from 0 to 100. 
     * @return Confidence Authentication involves scoring inappropriate information, with a score from 0 to 100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Authentication involves scoring inappropriate information, with a score from 0 to 100.
     * @param Confidence Authentication involves scoring inappropriate information, with a score from 0 to 100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Result suggestions for authentication involving inappropriate information, value ranges from...to...
<li>pass;</li>
<li>review;</li>
<li>block.</li> 
     * @return Suggestion Result suggestions for authentication involving inappropriate information, value ranges from...to...
<li>pass;</li>
<li>review;</li>
<li>block.</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set Result suggestions for authentication involving inappropriate information, value ranges from...to...
<li>pass;</li>
<li>review;</li>
<li>block.</li>
     * @param Suggestion Result suggestions for authentication involving inappropriate information, value ranges from...to...
<li>pass;</li>
<li>review;</li>
<li>block.</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get Involves inappropriate information and violative icon names. 
     * @return Name Involves inappropriate information and violative icon names.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Involves inappropriate information and violative icon names.
     * @param Name Involves inappropriate information and violative icon names.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Coordinates of the area where inappropriate information or violation icons appear (pixel level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and bottom-right corner. 
     * @return AreaCoordSet Coordinates of the area where inappropriate information or violation icons appear (pixel level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and bottom-right corner.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set Coordinates of the area where inappropriate information or violation icons appear (pixel level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and bottom-right corner.
     * @param AreaCoordSet Coordinates of the area where inappropriate information or violation icons appear (pixel level), [x1, y1, x2, y2], i.e., coordinates of the top-left corner and bottom-right corner.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    public PoliticalImageResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PoliticalImageResult(PoliticalImageResult source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);

    }
}

