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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExstraPerformanceInfo extends AbstractModel {

    /**
    * Fixed: final value is fixed.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Additional purchase CFS performance value in MB/s.
    */
    @SerializedName("Performance")
    @Expose
    private Long Performance;

    /**
     * Get Fixed: final value is fixed. 
     * @return Type Fixed: final value is fixed.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Fixed: final value is fixed.
     * @param Type Fixed: final value is fixed.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Additional purchase CFS performance value in MB/s. 
     * @return Performance Additional purchase CFS performance value in MB/s.
     */
    public Long getPerformance() {
        return this.Performance;
    }

    /**
     * Set Additional purchase CFS performance value in MB/s.
     * @param Performance Additional purchase CFS performance value in MB/s.
     */
    public void setPerformance(Long Performance) {
        this.Performance = Performance;
    }

    public ExstraPerformanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExstraPerformanceInfo(ExstraPerformanceInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Performance != null) {
            this.Performance = new Long(source.Performance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Performance", this.Performance);

    }
}

