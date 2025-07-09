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

public class MediaAiAnalysisCoverItem extends AbstractModel {

    /**
    * Storage path of intelligently generated cover.
    */
    @SerializedName("CoverPath")
    @Expose
    private String CoverPath;

    /**
    * Confidence of intelligently generated cover between 0 and 100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get Storage path of intelligently generated cover. 
     * @return CoverPath Storage path of intelligently generated cover.
     */
    public String getCoverPath() {
        return this.CoverPath;
    }

    /**
     * Set Storage path of intelligently generated cover.
     * @param CoverPath Storage path of intelligently generated cover.
     */
    public void setCoverPath(String CoverPath) {
        this.CoverPath = CoverPath;
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
        if (source.CoverPath != null) {
            this.CoverPath = new String(source.CoverPath);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CoverPath", this.CoverPath);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

