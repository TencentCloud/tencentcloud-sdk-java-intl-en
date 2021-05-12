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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowlogDetail extends AbstractModel{

    /**
    * Total time consumed
    */
    @SerializedName("TotalTime")
    @Expose
    private Float TotalTime;

    /**
    * Total number of calls
    */
    @SerializedName("TotalCalls")
    @Expose
    private Long TotalCalls;

    /**
    * List of slow SQL statements after desensitization
    */
    @SerializedName("NormalQueries")
    @Expose
    private NormalQueryItem [] NormalQueries;

    /**
     * Get Total time consumed 
     * @return TotalTime Total time consumed
     */
    public Float getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set Total time consumed
     * @param TotalTime Total time consumed
     */
    public void setTotalTime(Float TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * Get Total number of calls 
     * @return TotalCalls Total number of calls
     */
    public Long getTotalCalls() {
        return this.TotalCalls;
    }

    /**
     * Set Total number of calls
     * @param TotalCalls Total number of calls
     */
    public void setTotalCalls(Long TotalCalls) {
        this.TotalCalls = TotalCalls;
    }

    /**
     * Get List of slow SQL statements after desensitization 
     * @return NormalQueries List of slow SQL statements after desensitization
     */
    public NormalQueryItem [] getNormalQueries() {
        return this.NormalQueries;
    }

    /**
     * Set List of slow SQL statements after desensitization
     * @param NormalQueries List of slow SQL statements after desensitization
     */
    public void setNormalQueries(NormalQueryItem [] NormalQueries) {
        this.NormalQueries = NormalQueries;
    }

    public SlowlogDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowlogDetail(SlowlogDetail source) {
        if (source.TotalTime != null) {
            this.TotalTime = new Float(source.TotalTime);
        }
        if (source.TotalCalls != null) {
            this.TotalCalls = new Long(source.TotalCalls);
        }
        if (source.NormalQueries != null) {
            this.NormalQueries = new NormalQueryItem[source.NormalQueries.length];
            for (int i = 0; i < source.NormalQueries.length; i++) {
                this.NormalQueries[i] = new NormalQueryItem(source.NormalQueries[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamSimple(map, prefix + "TotalCalls", this.TotalCalls);
        this.setParamArrayObj(map, prefix + "NormalQueries.", this.NormalQueries);

    }
}

