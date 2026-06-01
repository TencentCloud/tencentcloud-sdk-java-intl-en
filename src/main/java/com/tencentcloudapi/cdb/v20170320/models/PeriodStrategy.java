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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PeriodStrategy extends AbstractModel {

    /**
    * Scale-out period
    */
    @SerializedName("TimeCycle")
    @Expose
    private TImeCycle TimeCycle;

    /**
    * Time interval
    */
    @SerializedName("TimeInterval")
    @Expose
    private TimeInterval TimeInterval;

    /**
     * Get Scale-out period 
     * @return TimeCycle Scale-out period
     */
    public TImeCycle getTimeCycle() {
        return this.TimeCycle;
    }

    /**
     * Set Scale-out period
     * @param TimeCycle Scale-out period
     */
    public void setTimeCycle(TImeCycle TimeCycle) {
        this.TimeCycle = TimeCycle;
    }

    /**
     * Get Time interval 
     * @return TimeInterval Time interval
     */
    public TimeInterval getTimeInterval() {
        return this.TimeInterval;
    }

    /**
     * Set Time interval
     * @param TimeInterval Time interval
     */
    public void setTimeInterval(TimeInterval TimeInterval) {
        this.TimeInterval = TimeInterval;
    }

    public PeriodStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PeriodStrategy(PeriodStrategy source) {
        if (source.TimeCycle != null) {
            this.TimeCycle = new TImeCycle(source.TimeCycle);
        }
        if (source.TimeInterval != null) {
            this.TimeInterval = new TimeInterval(source.TimeInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TimeCycle.", this.TimeCycle);
        this.setParamObj(map, prefix + "TimeInterval.", this.TimeInterval);

    }
}

