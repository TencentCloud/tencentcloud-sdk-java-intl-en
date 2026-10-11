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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerCondition extends AbstractModel {

    /**
    * Condition comparison method. Valid values: 1 for greater than, 2 for less than, 3 for greater than or equal to, and 4 for less than or equal to.
    */
    @SerializedName("CompareMethod")
    @Expose
    private Long CompareMethod;

    /**
    * Condition threshold.
    */
    @SerializedName("Threshold")
    @Expose
    private Float Threshold;

    /**
     * Get Condition comparison method. Valid values: 1 for greater than, 2 for less than, 3 for greater than or equal to, and 4 for less than or equal to. 
     * @return CompareMethod Condition comparison method. Valid values: 1 for greater than, 2 for less than, 3 for greater than or equal to, and 4 for less than or equal to.
     */
    public Long getCompareMethod() {
        return this.CompareMethod;
    }

    /**
     * Set Condition comparison method. Valid values: 1 for greater than, 2 for less than, 3 for greater than or equal to, and 4 for less than or equal to.
     * @param CompareMethod Condition comparison method. Valid values: 1 for greater than, 2 for less than, 3 for greater than or equal to, and 4 for less than or equal to.
     */
    public void setCompareMethod(Long CompareMethod) {
        this.CompareMethod = CompareMethod;
    }

    /**
     * Get Condition threshold. 
     * @return Threshold Condition threshold.
     */
    public Float getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Condition threshold.
     * @param Threshold Condition threshold.
     */
    public void setThreshold(Float Threshold) {
        this.Threshold = Threshold;
    }

    public TriggerCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerCondition(TriggerCondition source) {
        if (source.CompareMethod != null) {
            this.CompareMethod = new Long(source.CompareMethod);
        }
        if (source.Threshold != null) {
            this.Threshold = new Float(source.Threshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompareMethod", this.CompareMethod);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);

    }
}

