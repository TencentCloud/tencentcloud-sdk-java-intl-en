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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeedTestingQuota extends AbstractModel{

    /**
    * The total number of site tests.
    */
    @SerializedName("TotalTestRuns")
    @Expose
    private Long TotalTestRuns;

    /**
    * The number of available site tests.
    */
    @SerializedName("AvailableTestRuns")
    @Expose
    private Long AvailableTestRuns;

    /**
     * Get The total number of site tests. 
     * @return TotalTestRuns The total number of site tests.
     */
    public Long getTotalTestRuns() {
        return this.TotalTestRuns;
    }

    /**
     * Set The total number of site tests.
     * @param TotalTestRuns The total number of site tests.
     */
    public void setTotalTestRuns(Long TotalTestRuns) {
        this.TotalTestRuns = TotalTestRuns;
    }

    /**
     * Get The number of available site tests. 
     * @return AvailableTestRuns The number of available site tests.
     */
    public Long getAvailableTestRuns() {
        return this.AvailableTestRuns;
    }

    /**
     * Set The number of available site tests.
     * @param AvailableTestRuns The number of available site tests.
     */
    public void setAvailableTestRuns(Long AvailableTestRuns) {
        this.AvailableTestRuns = AvailableTestRuns;
    }

    public SpeedTestingQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeedTestingQuota(SpeedTestingQuota source) {
        if (source.TotalTestRuns != null) {
            this.TotalTestRuns = new Long(source.TotalTestRuns);
        }
        if (source.AvailableTestRuns != null) {
            this.AvailableTestRuns = new Long(source.AvailableTestRuns);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalTestRuns", this.TotalTestRuns);
        this.setParamSimple(map, prefix + "AvailableTestRuns", this.AvailableTestRuns);

    }
}

