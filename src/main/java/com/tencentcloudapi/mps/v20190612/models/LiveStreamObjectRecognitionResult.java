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

public class LiveStreamObjectRecognitionResult extends AbstractModel {

    /**
    * Name of a recognized object.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Start PTS time of a recognized segment, in seconds.
    */
    @SerializedName("StartPtsOffset")
    @Expose
    private Float StartPtsOffset;

    /**
    * End PTS time of a recognized segment, in seconds.
    */
    @SerializedName("EndPtsOffset")
    @Expose
    private Float EndPtsOffset;

    /**
    * Confidence of a recognized segment. Value range: 0-100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * Zone coordinates of the recognition result. An array contains four elements: [x1, y1, x2, y2], representing the horizontal and vertical coordinates of the top-left and bottom-right corners, respectively.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * Screenshot link.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Name of a recognized object. 
     * @return Name Name of a recognized object.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a recognized object.
     * @param Name Name of a recognized object.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Start PTS time of a recognized segment, in seconds. 
     * @return StartPtsOffset Start PTS time of a recognized segment, in seconds.
     */
    public Float getStartPtsOffset() {
        return this.StartPtsOffset;
    }

    /**
     * Set Start PTS time of a recognized segment, in seconds.
     * @param StartPtsOffset Start PTS time of a recognized segment, in seconds.
     */
    public void setStartPtsOffset(Float StartPtsOffset) {
        this.StartPtsOffset = StartPtsOffset;
    }

    /**
     * Get End PTS time of a recognized segment, in seconds. 
     * @return EndPtsOffset End PTS time of a recognized segment, in seconds.
     */
    public Float getEndPtsOffset() {
        return this.EndPtsOffset;
    }

    /**
     * Set End PTS time of a recognized segment, in seconds.
     * @param EndPtsOffset End PTS time of a recognized segment, in seconds.
     */
    public void setEndPtsOffset(Float EndPtsOffset) {
        this.EndPtsOffset = EndPtsOffset;
    }

    /**
     * Get Confidence of a recognized segment. Value range: 0-100. 
     * @return Confidence Confidence of a recognized segment. Value range: 0-100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence of a recognized segment. Value range: 0-100.
     * @param Confidence Confidence of a recognized segment. Value range: 0-100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Zone coordinates of the recognition result. An array contains four elements: [x1, y1, x2, y2], representing the horizontal and vertical coordinates of the top-left and bottom-right corners, respectively. 
     * @return AreaCoordSet Zone coordinates of the recognition result. An array contains four elements: [x1, y1, x2, y2], representing the horizontal and vertical coordinates of the top-left and bottom-right corners, respectively.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set Zone coordinates of the recognition result. An array contains four elements: [x1, y1, x2, y2], representing the horizontal and vertical coordinates of the top-left and bottom-right corners, respectively.
     * @param AreaCoordSet Zone coordinates of the recognition result. An array contains four elements: [x1, y1, x2, y2], representing the horizontal and vertical coordinates of the top-left and bottom-right corners, respectively.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get Screenshot link.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Url Screenshot link.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Screenshot link.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Url Screenshot link.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public LiveStreamObjectRecognitionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveStreamObjectRecognitionResult(LiveStreamObjectRecognitionResult source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StartPtsOffset != null) {
            this.StartPtsOffset = new Float(source.StartPtsOffset);
        }
        if (source.EndPtsOffset != null) {
            this.EndPtsOffset = new Float(source.EndPtsOffset);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.AreaCoordSet != null) {
            this.AreaCoordSet = new Long[source.AreaCoordSet.length];
            for (int i = 0; i < source.AreaCoordSet.length; i++) {
                this.AreaCoordSet[i] = new Long(source.AreaCoordSet[i]);
            }
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StartPtsOffset", this.StartPtsOffset);
        this.setParamSimple(map, prefix + "EndPtsOffset", this.EndPtsOffset);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

