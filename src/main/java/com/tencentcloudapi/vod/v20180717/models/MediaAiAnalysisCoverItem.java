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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaAiAnalysisCoverItem extends AbstractModel {

    /**
    * Address of intelligently generated cover.
    */
    @SerializedName("CoverUrl")
    @Expose
    private String CoverUrl;

    /**
    * Confidence of intelligently generated cover between 0 and 100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get Address of intelligently generated cover. 
     * @return CoverUrl Address of intelligently generated cover.
     */
    public String getCoverUrl() {
        return this.CoverUrl;
    }

    /**
     * Set Address of intelligently generated cover.
     * @param CoverUrl Address of intelligently generated cover.
     */
    public void setCoverUrl(String CoverUrl) {
        this.CoverUrl = CoverUrl;
    }

    /**
     * Get Confidence of intelligently generated cover between 0 and 100. 
     * @return Confidence Confidence of intelligently generated cover between 0 and 100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence of intelligently generated cover between 0 and 100.
     * @param Confidence Confidence of intelligently generated cover between 0 and 100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    public MediaAiAnalysisCoverItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaAiAnalysisCoverItem(MediaAiAnalysisCoverItem source) {
        if (source.CoverUrl != null) {
            this.CoverUrl = new String(source.CoverUrl);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CoverUrl", this.CoverUrl);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

