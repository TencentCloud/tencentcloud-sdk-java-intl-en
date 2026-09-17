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

public class AiAnalysisTaskCoverOutput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("CoverSet")
    @Expose
    private MediaAiAnalysisCoverItem [] CoverSet;

    /**
    * 
    */
    @SerializedName("CoverSetFileUrl")
    @Expose
    private String CoverSetFileUrl;

    /**
    * 
    */
    @SerializedName("CoverSetFileUrlExpireTime")
    @Expose
    private String CoverSetFileUrlExpireTime;

    /**
     * Get  
     * @return CoverSet 
     */
    public MediaAiAnalysisCoverItem [] getCoverSet() {
        return this.CoverSet;
    }

    /**
     * Set 
     * @param CoverSet 
     */
    public void setCoverSet(MediaAiAnalysisCoverItem [] CoverSet) {
        this.CoverSet = CoverSet;
    }

    /**
     * Get  
     * @return CoverSetFileUrl 
     */
    public String getCoverSetFileUrl() {
        return this.CoverSetFileUrl;
    }

    /**
     * Set 
     * @param CoverSetFileUrl 
     */
    public void setCoverSetFileUrl(String CoverSetFileUrl) {
        this.CoverSetFileUrl = CoverSetFileUrl;
    }

    /**
     * Get  
     * @return CoverSetFileUrlExpireTime 
     */
    public String getCoverSetFileUrlExpireTime() {
        return this.CoverSetFileUrlExpireTime;
    }

    /**
     * Set 
     * @param CoverSetFileUrlExpireTime 
     */
    public void setCoverSetFileUrlExpireTime(String CoverSetFileUrlExpireTime) {
        this.CoverSetFileUrlExpireTime = CoverSetFileUrlExpireTime;
    }

    public AiAnalysisTaskCoverOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskCoverOutput(AiAnalysisTaskCoverOutput source) {
        if (source.CoverSet != null) {
            this.CoverSet = new MediaAiAnalysisCoverItem[source.CoverSet.length];
            for (int i = 0; i < source.CoverSet.length; i++) {
                this.CoverSet[i] = new MediaAiAnalysisCoverItem(source.CoverSet[i]);
            }
        }
        if (source.CoverSetFileUrl != null) {
            this.CoverSetFileUrl = new String(source.CoverSetFileUrl);
        }
        if (source.CoverSetFileUrlExpireTime != null) {
            this.CoverSetFileUrlExpireTime = new String(source.CoverSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CoverSet.", this.CoverSet);
        this.setParamSimple(map, prefix + "CoverSetFileUrl", this.CoverSetFileUrl);
        this.setParamSimple(map, prefix + "CoverSetFileUrlExpireTime", this.CoverSetFileUrlExpireTime);

    }
}

