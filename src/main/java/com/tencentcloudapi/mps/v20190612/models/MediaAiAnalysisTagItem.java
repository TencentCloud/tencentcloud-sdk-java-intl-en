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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaAiAnalysisTagItem extends AbstractModel {

    /**
    * Tag name.
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * Confidence of tag between 0 and 100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get Tag name. 
     * @return Tag Tag name.
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Tag name.
     * @param Tag Tag name.
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Confidence of tag between 0 and 100. 
     * @return Confidence Confidence of tag between 0 and 100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence of tag between 0 and 100.
     * @param Confidence Confidence of tag between 0 and 100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    public MediaAiAnalysisTagItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaAiAnalysisTagItem(MediaAiAnalysisTagItem source) {
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

