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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocRetrievalConfig extends AbstractModel {

    /**
    * <p>Confidence threshold</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * <p>Whether to enable</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>Return the top N entries</p>
    */
    @SerializedName("TopN")
    @Expose
    private Long TopN;

    /**
     * Get <p>Confidence threshold</p> 
     * @return Confidence <p>Confidence threshold</p>
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>Confidence threshold</p>
     * @param Confidence <p>Confidence threshold</p>
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>Whether to enable</p> 
     * @return Enabled <p>Whether to enable</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether to enable</p>
     * @param Enabled <p>Whether to enable</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>Return the top N entries</p> 
     * @return TopN <p>Return the top N entries</p>
     */
    public Long getTopN() {
        return this.TopN;
    }

    /**
     * Set <p>Return the top N entries</p>
     * @param TopN <p>Return the top N entries</p>
     */
    public void setTopN(Long TopN) {
        this.TopN = TopN;
    }

    public DocRetrievalConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocRetrievalConfig(DocRetrievalConfig source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.TopN != null) {
            this.TopN = new Long(source.TopN);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "TopN", this.TopN);

    }
}

