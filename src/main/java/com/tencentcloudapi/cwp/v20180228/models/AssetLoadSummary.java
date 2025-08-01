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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetLoadSummary extends AbstractModel {

    /**
    * Load amount array, in ascending order:
[
0% or unknown quantity
0%～20%
20%～50%
50%～80%
80%～100%
]
    */
    @SerializedName("Counts")
    @Expose
    private Long [] Counts;

    /**
    * Top 5 Load
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Top5")
    @Expose
    private AssetLoadDetail [] Top5;

    /**
     * Get Load amount array, in ascending order:
[
0% or unknown quantity
0%～20%
20%～50%
50%～80%
80%～100%
] 
     * @return Counts Load amount array, in ascending order:
[
0% or unknown quantity
0%～20%
20%～50%
50%～80%
80%～100%
]
     */
    public Long [] getCounts() {
        return this.Counts;
    }

    /**
     * Set Load amount array, in ascending order:
[
0% or unknown quantity
0%～20%
20%～50%
50%～80%
80%～100%
]
     * @param Counts Load amount array, in ascending order:
[
0% or unknown quantity
0%～20%
20%～50%
50%～80%
80%～100%
]
     */
    public void setCounts(Long [] Counts) {
        this.Counts = Counts;
    }

    /**
     * Get Top 5 Load
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Top5 Top 5 Load
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AssetLoadDetail [] getTop5() {
        return this.Top5;
    }

    /**
     * Set Top 5 Load
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Top5 Top 5 Load
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTop5(AssetLoadDetail [] Top5) {
        this.Top5 = Top5;
    }

    public AssetLoadSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetLoadSummary(AssetLoadSummary source) {
        if (source.Counts != null) {
            this.Counts = new Long[source.Counts.length];
            for (int i = 0; i < source.Counts.length; i++) {
                this.Counts[i] = new Long(source.Counts[i]);
            }
        }
        if (source.Top5 != null) {
            this.Top5 = new AssetLoadDetail[source.Top5.length];
            for (int i = 0; i < source.Top5.length; i++) {
                this.Top5[i] = new AssetLoadDetail(source.Top5[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Counts.", this.Counts);
        this.setParamArrayObj(map, prefix + "Top5.", this.Top5);

    }
}

