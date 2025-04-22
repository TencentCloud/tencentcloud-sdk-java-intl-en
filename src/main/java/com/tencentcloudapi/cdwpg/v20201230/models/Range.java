/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Range extends AbstractModel {

    /**
    * Minimum value.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * Maximum value.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
     * Get Minimum value.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Min Minimum value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set Minimum value.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Min Minimum value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get Maximum value.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Max Maximum value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set Maximum value.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Max Maximum value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    public Range() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Range(Range source) {
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

