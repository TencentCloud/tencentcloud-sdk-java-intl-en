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

public class AiAnalysisTaskTagOutput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("TagSet")
    @Expose
    private MediaAiAnalysisTagItem [] TagSet;

    /**
    * 
    */
    @SerializedName("TagSetFileUrl")
    @Expose
    private String TagSetFileUrl;

    /**
    * 
    */
    @SerializedName("TagSetFileUrlExpireTime")
    @Expose
    private String TagSetFileUrlExpireTime;

    /**
     * Get  
     * @return TagSet 
     */
    public MediaAiAnalysisTagItem [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 
     * @param TagSet 
     */
    public void setTagSet(MediaAiAnalysisTagItem [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get  
     * @return TagSetFileUrl 
     */
    public String getTagSetFileUrl() {
        return this.TagSetFileUrl;
    }

    /**
     * Set 
     * @param TagSetFileUrl 
     */
    public void setTagSetFileUrl(String TagSetFileUrl) {
        this.TagSetFileUrl = TagSetFileUrl;
    }

    /**
     * Get  
     * @return TagSetFileUrlExpireTime 
     */
    public String getTagSetFileUrlExpireTime() {
        return this.TagSetFileUrlExpireTime;
    }

    /**
     * Set 
     * @param TagSetFileUrlExpireTime 
     */
    public void setTagSetFileUrlExpireTime(String TagSetFileUrlExpireTime) {
        this.TagSetFileUrlExpireTime = TagSetFileUrlExpireTime;
    }

    public AiAnalysisTaskTagOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskTagOutput(AiAnalysisTaskTagOutput source) {
        if (source.TagSet != null) {
            this.TagSet = new MediaAiAnalysisTagItem[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new MediaAiAnalysisTagItem(source.TagSet[i]);
            }
        }
        if (source.TagSetFileUrl != null) {
            this.TagSetFileUrl = new String(source.TagSetFileUrl);
        }
        if (source.TagSetFileUrlExpireTime != null) {
            this.TagSetFileUrlExpireTime = new String(source.TagSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "TagSetFileUrl", this.TagSetFileUrl);
        this.setParamSimple(map, prefix + "TagSetFileUrlExpireTime", this.TagSetFileUrlExpireTime);

    }
}

