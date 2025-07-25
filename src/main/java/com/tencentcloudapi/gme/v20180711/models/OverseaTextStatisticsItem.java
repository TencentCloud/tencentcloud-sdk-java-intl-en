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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverseaTextStatisticsItem extends AbstractModel {

    /**
    * Statistical value (in seconds)
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Data")
    @Expose
    private Float Data;

    /**
     * Get Statistical value (in seconds)
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Data Statistical value (in seconds)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Float getData() {
        return this.Data;
    }

    /**
     * Set Statistical value (in seconds)
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Data Statistical value (in seconds)
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setData(Float Data) {
        this.Data = Data;
    }

    public OverseaTextStatisticsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverseaTextStatisticsItem(OverseaTextStatisticsItem source) {
        if (source.Data != null) {
            this.Data = new Float(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

