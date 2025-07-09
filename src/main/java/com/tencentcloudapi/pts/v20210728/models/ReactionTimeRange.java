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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReactionTimeRange extends AbstractModel {

    /**
    * Minimum response time (ms).
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * Maximum response time (ms).
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
     * Get Minimum response time (ms). 
     * @return Min Minimum response time (ms).
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set Minimum response time (ms).
     * @param Min Minimum response time (ms).
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get Maximum response time (ms). 
     * @return Max Maximum response time (ms).
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set Maximum response time (ms).
     * @param Max Maximum response time (ms).
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    public ReactionTimeRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReactionTimeRange(ReactionTimeRange source) {
        if (source.Min != null) {
            this.Min = new String(source.Min);
        }
        if (source.Max != null) {
            this.Max = new String(source.Max);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);

    }
}

