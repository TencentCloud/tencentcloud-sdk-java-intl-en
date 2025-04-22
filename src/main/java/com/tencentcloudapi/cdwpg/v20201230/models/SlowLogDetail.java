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

public class SlowLogDetail extends AbstractModel {

    /**
    * Total consumption time.
    */
    @SerializedName("TotalTime")
    @Expose
    private Float TotalTime;

    /**
    * Total number of calls.
    */
    @SerializedName("TotalCallTimes")
    @Expose
    private Long TotalCallTimes;

    /**
    * Slow SQL.
    */
    @SerializedName("NormalQuerys")
    @Expose
    private NormQueryItem [] NormalQuerys;

    /**
     * Get Total consumption time. 
     * @return TotalTime Total consumption time.
     */
    public Float getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set Total consumption time.
     * @param TotalTime Total consumption time.
     */
    public void setTotalTime(Float TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * Get Total number of calls. 
     * @return TotalCallTimes Total number of calls.
     */
    public Long getTotalCallTimes() {
        return this.TotalCallTimes;
    }

    /**
     * Set Total number of calls.
     * @param TotalCallTimes Total number of calls.
     */
    public void setTotalCallTimes(Long TotalCallTimes) {
        this.TotalCallTimes = TotalCallTimes;
    }

    /**
     * Get Slow SQL. 
     * @return NormalQuerys Slow SQL.
     */
    public NormQueryItem [] getNormalQuerys() {
        return this.NormalQuerys;
    }

    /**
     * Set Slow SQL.
     * @param NormalQuerys Slow SQL.
     */
    public void setNormalQuerys(NormQueryItem [] NormalQuerys) {
        this.NormalQuerys = NormalQuerys;
    }

    public SlowLogDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogDetail(SlowLogDetail source) {
        if (source.TotalTime != null) {
            this.TotalTime = new Float(source.TotalTime);
        }
        if (source.TotalCallTimes != null) {
            this.TotalCallTimes = new Long(source.TotalCallTimes);
        }
        if (source.NormalQuerys != null) {
            this.NormalQuerys = new NormQueryItem[source.NormalQuerys.length];
            for (int i = 0; i < source.NormalQuerys.length; i++) {
                this.NormalQuerys[i] = new NormQueryItem(source.NormalQuerys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamSimple(map, prefix + "TotalCallTimes", this.TotalCallTimes);
        this.setParamArrayObj(map, prefix + "NormalQuerys.", this.NormalQuerys);

    }
}

