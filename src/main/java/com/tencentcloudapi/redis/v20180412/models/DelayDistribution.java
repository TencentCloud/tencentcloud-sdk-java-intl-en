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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DelayDistribution extends AbstractModel {

    /**
    * The delay distribution. The mapping between delay range and `Ladder` value is as follows:  - `1`: [0ms,1ms]. - `5`: [1ms,5ms]. - `10`: [5ms,10ms]. - `50`: [10ms,50ms]. - `200`:  [50ms,200ms]. - `-1`: [200ms,∞].
    */
    @SerializedName("Ladder")
    @Expose
    private Long Ladder;

    /**
    * The number of commands with delay falling within the current delay range -
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Modification time
    */
    @SerializedName("Updatetime")
    @Expose
    private Long Updatetime;

    /**
     * Get The delay distribution. The mapping between delay range and `Ladder` value is as follows:  - `1`: [0ms,1ms]. - `5`: [1ms,5ms]. - `10`: [5ms,10ms]. - `50`: [10ms,50ms]. - `200`:  [50ms,200ms]. - `-1`: [200ms,∞]. 
     * @return Ladder The delay distribution. The mapping between delay range and `Ladder` value is as follows:  - `1`: [0ms,1ms]. - `5`: [1ms,5ms]. - `10`: [5ms,10ms]. - `50`: [10ms,50ms]. - `200`:  [50ms,200ms]. - `-1`: [200ms,∞].
     */
    public Long getLadder() {
        return this.Ladder;
    }

    /**
     * Set The delay distribution. The mapping between delay range and `Ladder` value is as follows:  - `1`: [0ms,1ms]. - `5`: [1ms,5ms]. - `10`: [5ms,10ms]. - `50`: [10ms,50ms]. - `200`:  [50ms,200ms]. - `-1`: [200ms,∞].
     * @param Ladder The delay distribution. The mapping between delay range and `Ladder` value is as follows:  - `1`: [0ms,1ms]. - `5`: [1ms,5ms]. - `10`: [5ms,10ms]. - `50`: [10ms,50ms]. - `200`:  [50ms,200ms]. - `-1`: [200ms,∞].
     */
    public void setLadder(Long Ladder) {
        this.Ladder = Ladder;
    }

    /**
     * Get The number of commands with delay falling within the current delay range - 
     * @return Size The number of commands with delay falling within the current delay range -
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set The number of commands with delay falling within the current delay range -
     * @param Size The number of commands with delay falling within the current delay range -
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Modification time 
     * @return Updatetime Modification time
     */
    public Long getUpdatetime() {
        return this.Updatetime;
    }

    /**
     * Set Modification time
     * @param Updatetime Modification time
     */
    public void setUpdatetime(Long Updatetime) {
        this.Updatetime = Updatetime;
    }

    public DelayDistribution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DelayDistribution(DelayDistribution source) {
        if (source.Ladder != null) {
            this.Ladder = new Long(source.Ladder);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Updatetime != null) {
            this.Updatetime = new Long(source.Updatetime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ladder", this.Ladder);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Updatetime", this.Updatetime);

    }
}

