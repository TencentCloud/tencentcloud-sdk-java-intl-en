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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SentimentDetail extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Positive")
    @Expose
    private Long Positive;

    /**
    * 
    */
    @SerializedName("Negative")
    @Expose
    private Long Negative;

    /**
     * Get  
     * @return Positive 
     */
    public Long getPositive() {
        return this.Positive;
    }

    /**
     * Set 
     * @param Positive 
     */
    public void setPositive(Long Positive) {
        this.Positive = Positive;
    }

    /**
     * Get  
     * @return Negative 
     */
    public Long getNegative() {
        return this.Negative;
    }

    /**
     * Set 
     * @param Negative 
     */
    public void setNegative(Long Negative) {
        this.Negative = Negative;
    }

    public SentimentDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SentimentDetail(SentimentDetail source) {
        if (source.Positive != null) {
            this.Positive = new Long(source.Positive);
        }
        if (source.Negative != null) {
            this.Negative = new Long(source.Negative);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Positive", this.Positive);
        this.setParamSimple(map, prefix + "Negative", this.Negative);

    }
}

