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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficSandboxDLPFileSizeRange extends AbstractModel {

    /**
    * Lower limit in bytes. 0 means no lower limit.
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
    * Capacity limit in bytes. 0 means unlimited.
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
     * Get Lower limit in bytes. 0 means no lower limit. 
     * @return Min Lower limit in bytes. 0 means no lower limit.
     */
    public Long getMin() {
        return this.Min;
    }

    /**
     * Set Lower limit in bytes. 0 means no lower limit.
     * @param Min Lower limit in bytes. 0 means no lower limit.
     */
    public void setMin(Long Min) {
        this.Min = Min;
    }

    /**
     * Get Capacity limit in bytes. 0 means unlimited. 
     * @return Max Capacity limit in bytes. 0 means unlimited.
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set Capacity limit in bytes. 0 means unlimited.
     * @param Max Capacity limit in bytes. 0 means unlimited.
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    public TrafficSandboxDLPFileSizeRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxDLPFileSizeRange(TrafficSandboxDLPFileSizeRange source) {
        if (source.Min != null) {
            this.Min = new Long(source.Min);
        }
        if (source.Max != null) {
            this.Max = new Long(source.Max);
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

