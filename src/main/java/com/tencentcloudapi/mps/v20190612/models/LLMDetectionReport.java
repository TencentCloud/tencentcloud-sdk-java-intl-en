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

public class LLMDetectionReport extends AbstractModel {

    /**
    * <p>Number of detection results.</p>
    */
    @SerializedName("ResultCount")
    @Expose
    private Long ResultCount;

    /**
    * <p>Detection item result list.</p>
    */
    @SerializedName("ResultSet")
    @Expose
    private LLMDetectionResultItem [] ResultSet;

    /**
     * Get <p>Number of detection results.</p> 
     * @return ResultCount <p>Number of detection results.</p>
     */
    public Long getResultCount() {
        return this.ResultCount;
    }

    /**
     * Set <p>Number of detection results.</p>
     * @param ResultCount <p>Number of detection results.</p>
     */
    public void setResultCount(Long ResultCount) {
        this.ResultCount = ResultCount;
    }

    /**
     * Get <p>Detection item result list.</p> 
     * @return ResultSet <p>Detection item result list.</p>
     */
    public LLMDetectionResultItem [] getResultSet() {
        return this.ResultSet;
    }

    /**
     * Set <p>Detection item result list.</p>
     * @param ResultSet <p>Detection item result list.</p>
     */
    public void setResultSet(LLMDetectionResultItem [] ResultSet) {
        this.ResultSet = ResultSet;
    }

    public LLMDetectionReport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMDetectionReport(LLMDetectionReport source) {
        if (source.ResultCount != null) {
            this.ResultCount = new Long(source.ResultCount);
        }
        if (source.ResultSet != null) {
            this.ResultSet = new LLMDetectionResultItem[source.ResultSet.length];
            for (int i = 0; i < source.ResultSet.length; i++) {
                this.ResultSet[i] = new LLMDetectionResultItem(source.ResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultCount", this.ResultCount);
        this.setParamArrayObj(map, prefix + "ResultSet.", this.ResultSet);

    }
}

