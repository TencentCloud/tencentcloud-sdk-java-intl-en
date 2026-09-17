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

public class AiAnalysisTaskHighlightOutput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("HighlightSet")
    @Expose
    private MediaAiAnalysisHighlightItem [] HighlightSet;

    /**
    * 
    */
    @SerializedName("HighlightSetFileUrl")
    @Expose
    private String HighlightSetFileUrl;

    /**
    * 
    */
    @SerializedName("HighlightSetFileUrlExpireTime")
    @Expose
    private String HighlightSetFileUrlExpireTime;

    /**
     * Get  
     * @return HighlightSet 
     */
    public MediaAiAnalysisHighlightItem [] getHighlightSet() {
        return this.HighlightSet;
    }

    /**
     * Set 
     * @param HighlightSet 
     */
    public void setHighlightSet(MediaAiAnalysisHighlightItem [] HighlightSet) {
        this.HighlightSet = HighlightSet;
    }

    /**
     * Get  
     * @return HighlightSetFileUrl 
     */
    public String getHighlightSetFileUrl() {
        return this.HighlightSetFileUrl;
    }

    /**
     * Set 
     * @param HighlightSetFileUrl 
     */
    public void setHighlightSetFileUrl(String HighlightSetFileUrl) {
        this.HighlightSetFileUrl = HighlightSetFileUrl;
    }

    /**
     * Get  
     * @return HighlightSetFileUrlExpireTime 
     */
    public String getHighlightSetFileUrlExpireTime() {
        return this.HighlightSetFileUrlExpireTime;
    }

    /**
     * Set 
     * @param HighlightSetFileUrlExpireTime 
     */
    public void setHighlightSetFileUrlExpireTime(String HighlightSetFileUrlExpireTime) {
        this.HighlightSetFileUrlExpireTime = HighlightSetFileUrlExpireTime;
    }

    public AiAnalysisTaskHighlightOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskHighlightOutput(AiAnalysisTaskHighlightOutput source) {
        if (source.HighlightSet != null) {
            this.HighlightSet = new MediaAiAnalysisHighlightItem[source.HighlightSet.length];
            for (int i = 0; i < source.HighlightSet.length; i++) {
                this.HighlightSet[i] = new MediaAiAnalysisHighlightItem(source.HighlightSet[i]);
            }
        }
        if (source.HighlightSetFileUrl != null) {
            this.HighlightSetFileUrl = new String(source.HighlightSetFileUrl);
        }
        if (source.HighlightSetFileUrlExpireTime != null) {
            this.HighlightSetFileUrlExpireTime = new String(source.HighlightSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HighlightSet.", this.HighlightSet);
        this.setParamSimple(map, prefix + "HighlightSetFileUrl", this.HighlightSetFileUrl);
        this.setParamSimple(map, prefix + "HighlightSetFileUrlExpireTime", this.HighlightSetFileUrlExpireTime);

    }
}

