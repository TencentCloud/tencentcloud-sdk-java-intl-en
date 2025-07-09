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

public class AiRecognitionTaskObjectResultItem extends AbstractModel {

    /**
    * Name of recognized object.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * List of segments that contain an object.
    */
    @SerializedName("SegmentSet")
    @Expose
    private AiRecognitionTaskObjectSeqmentItem [] SegmentSet;

    /**
    * List of fragments in which the object appears.
    */
    @SerializedName("RecognitionSegmentSet")
    @Expose
    private AiRecognitionTaskObjectSegmentItem [] RecognitionSegmentSet;

    /**
     * Get Name of recognized object. 
     * @return Name Name of recognized object.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of recognized object.
     * @param Name Name of recognized object.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get List of segments that contain an object. 
     * @return SegmentSet List of segments that contain an object.
     * @deprecated
     */
    @Deprecated
    public AiRecognitionTaskObjectSeqmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set List of segments that contain an object.
     * @param SegmentSet List of segments that contain an object.
     * @deprecated
     */
    @Deprecated
    public void setSegmentSet(AiRecognitionTaskObjectSeqmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get List of fragments in which the object appears. 
     * @return RecognitionSegmentSet List of fragments in which the object appears.
     */
    public AiRecognitionTaskObjectSegmentItem [] getRecognitionSegmentSet() {
        return this.RecognitionSegmentSet;
    }

    /**
     * Set List of fragments in which the object appears.
     * @param RecognitionSegmentSet List of fragments in which the object appears.
     */
    public void setRecognitionSegmentSet(AiRecognitionTaskObjectSegmentItem [] RecognitionSegmentSet) {
        this.RecognitionSegmentSet = RecognitionSegmentSet;
    }

    public AiRecognitionTaskObjectResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskObjectResultItem(AiRecognitionTaskObjectResultItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new AiRecognitionTaskObjectSeqmentItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new AiRecognitionTaskObjectSeqmentItem(source.SegmentSet[i]);
            }
        }
        if (source.RecognitionSegmentSet != null) {
            this.RecognitionSegmentSet = new AiRecognitionTaskObjectSegmentItem[source.RecognitionSegmentSet.length];
            for (int i = 0; i < source.RecognitionSegmentSet.length; i++) {
                this.RecognitionSegmentSet[i] = new AiRecognitionTaskObjectSegmentItem(source.RecognitionSegmentSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamArrayObj(map, prefix + "RecognitionSegmentSet.", this.RecognitionSegmentSet);

    }
}

