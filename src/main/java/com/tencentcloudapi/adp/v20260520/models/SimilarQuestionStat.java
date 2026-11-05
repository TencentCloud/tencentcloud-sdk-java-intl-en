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

public class SimilarQuestionStat extends AbstractModel {

    /**
    * <p>Number of similar questions</p>
    */
    @SerializedName("SimilarQuestionCount")
    @Expose
    private Long SimilarQuestionCount;

    /**
    * <p>Similar question prompt (show a similar question example)</p>
    */
    @SerializedName("SimilarQuestionTips")
    @Expose
    private String SimilarQuestionTips;

    /**
     * Get <p>Number of similar questions</p> 
     * @return SimilarQuestionCount <p>Number of similar questions</p>
     */
    public Long getSimilarQuestionCount() {
        return this.SimilarQuestionCount;
    }

    /**
     * Set <p>Number of similar questions</p>
     * @param SimilarQuestionCount <p>Number of similar questions</p>
     */
    public void setSimilarQuestionCount(Long SimilarQuestionCount) {
        this.SimilarQuestionCount = SimilarQuestionCount;
    }

    /**
     * Get <p>Similar question prompt (show a similar question example)</p> 
     * @return SimilarQuestionTips <p>Similar question prompt (show a similar question example)</p>
     */
    public String getSimilarQuestionTips() {
        return this.SimilarQuestionTips;
    }

    /**
     * Set <p>Similar question prompt (show a similar question example)</p>
     * @param SimilarQuestionTips <p>Similar question prompt (show a similar question example)</p>
     */
    public void setSimilarQuestionTips(String SimilarQuestionTips) {
        this.SimilarQuestionTips = SimilarQuestionTips;
    }

    public SimilarQuestionStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimilarQuestionStat(SimilarQuestionStat source) {
        if (source.SimilarQuestionCount != null) {
            this.SimilarQuestionCount = new Long(source.SimilarQuestionCount);
        }
        if (source.SimilarQuestionTips != null) {
            this.SimilarQuestionTips = new String(source.SimilarQuestionTips);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SimilarQuestionCount", this.SimilarQuestionCount);
        this.setParamSimple(map, prefix + "SimilarQuestionTips", this.SimilarQuestionTips);

    }
}

