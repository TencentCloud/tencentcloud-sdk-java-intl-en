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

public class AiAnalysisTaskClassificationOutput extends AbstractModel {

    /**
    * 
    */
    @SerializedName("ClassificationSet")
    @Expose
    private MediaAiAnalysisClassificationItem [] ClassificationSet;

    /**
    * 
    */
    @SerializedName("ClassificationSetFileUrl")
    @Expose
    private String ClassificationSetFileUrl;

    /**
    * 
    */
    @SerializedName("ClassificationSetFileUrlExpireTime")
    @Expose
    private String ClassificationSetFileUrlExpireTime;

    /**
     * Get  
     * @return ClassificationSet 
     */
    public MediaAiAnalysisClassificationItem [] getClassificationSet() {
        return this.ClassificationSet;
    }

    /**
     * Set 
     * @param ClassificationSet 
     */
    public void setClassificationSet(MediaAiAnalysisClassificationItem [] ClassificationSet) {
        this.ClassificationSet = ClassificationSet;
    }

    /**
     * Get  
     * @return ClassificationSetFileUrl 
     */
    public String getClassificationSetFileUrl() {
        return this.ClassificationSetFileUrl;
    }

    /**
     * Set 
     * @param ClassificationSetFileUrl 
     */
    public void setClassificationSetFileUrl(String ClassificationSetFileUrl) {
        this.ClassificationSetFileUrl = ClassificationSetFileUrl;
    }

    /**
     * Get  
     * @return ClassificationSetFileUrlExpireTime 
     */
    public String getClassificationSetFileUrlExpireTime() {
        return this.ClassificationSetFileUrlExpireTime;
    }

    /**
     * Set 
     * @param ClassificationSetFileUrlExpireTime 
     */
    public void setClassificationSetFileUrlExpireTime(String ClassificationSetFileUrlExpireTime) {
        this.ClassificationSetFileUrlExpireTime = ClassificationSetFileUrlExpireTime;
    }

    public AiAnalysisTaskClassificationOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskClassificationOutput(AiAnalysisTaskClassificationOutput source) {
        if (source.ClassificationSet != null) {
            this.ClassificationSet = new MediaAiAnalysisClassificationItem[source.ClassificationSet.length];
            for (int i = 0; i < source.ClassificationSet.length; i++) {
                this.ClassificationSet[i] = new MediaAiAnalysisClassificationItem(source.ClassificationSet[i]);
            }
        }
        if (source.ClassificationSetFileUrl != null) {
            this.ClassificationSetFileUrl = new String(source.ClassificationSetFileUrl);
        }
        if (source.ClassificationSetFileUrlExpireTime != null) {
            this.ClassificationSetFileUrlExpireTime = new String(source.ClassificationSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ClassificationSet.", this.ClassificationSet);
        this.setParamSimple(map, prefix + "ClassificationSetFileUrl", this.ClassificationSetFileUrl);
        this.setParamSimple(map, prefix + "ClassificationSetFileUrlExpireTime", this.ClassificationSetFileUrlExpireTime);

    }
}

