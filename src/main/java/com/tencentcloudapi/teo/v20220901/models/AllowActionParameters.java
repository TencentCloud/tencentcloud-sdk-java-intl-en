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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllowActionParameters extends AbstractModel {

    /**
    * Minimum latency response time. when configured as 0s, it means no delay for direct response. supported units: <li>s: seconds, value ranges from 0 to 5.</li>.
    */
    @SerializedName("MinDelayTime")
    @Expose
    private String MinDelayTime;

    /**
    * Maximum delayed response time. supported units: <li>s: seconds, value ranges from 5 to 10.</li>.
    */
    @SerializedName("MaxDelayTime")
    @Expose
    private String MaxDelayTime;

    /**
     * Get Minimum latency response time. when configured as 0s, it means no delay for direct response. supported units: <li>s: seconds, value ranges from 0 to 5.</li>. 
     * @return MinDelayTime Minimum latency response time. when configured as 0s, it means no delay for direct response. supported units: <li>s: seconds, value ranges from 0 to 5.</li>.
     */
    public String getMinDelayTime() {
        return this.MinDelayTime;
    }

    /**
     * Set Minimum latency response time. when configured as 0s, it means no delay for direct response. supported units: <li>s: seconds, value ranges from 0 to 5.</li>.
     * @param MinDelayTime Minimum latency response time. when configured as 0s, it means no delay for direct response. supported units: <li>s: seconds, value ranges from 0 to 5.</li>.
     */
    public void setMinDelayTime(String MinDelayTime) {
        this.MinDelayTime = MinDelayTime;
    }

    /**
     * Get Maximum delayed response time. supported units: <li>s: seconds, value ranges from 5 to 10.</li>. 
     * @return MaxDelayTime Maximum delayed response time. supported units: <li>s: seconds, value ranges from 5 to 10.</li>.
     */
    public String getMaxDelayTime() {
        return this.MaxDelayTime;
    }

    /**
     * Set Maximum delayed response time. supported units: <li>s: seconds, value ranges from 5 to 10.</li>.
     * @param MaxDelayTime Maximum delayed response time. supported units: <li>s: seconds, value ranges from 5 to 10.</li>.
     */
    public void setMaxDelayTime(String MaxDelayTime) {
        this.MaxDelayTime = MaxDelayTime;
    }

    public AllowActionParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllowActionParameters(AllowActionParameters source) {
        if (source.MinDelayTime != null) {
            this.MinDelayTime = new String(source.MinDelayTime);
        }
        if (source.MaxDelayTime != null) {
            this.MaxDelayTime = new String(source.MaxDelayTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinDelayTime", this.MinDelayTime);
        this.setParamSimple(map, prefix + "MaxDelayTime", this.MaxDelayTime);

    }
}

