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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSEraseTimeArea extends AbstractModel {

    /**
    * <p>Start time, unit: ms</p>
    */
    @SerializedName("BeginMs")
    @Expose
    private Long BeginMs;

    /**
    * <p>End time, unit: ms</p>
    */
    @SerializedName("EndMs")
    @Expose
    private Long EndMs;

    /**
    * <p>Domain list for erasure within the period</p>
    */
    @SerializedName("Areas")
    @Expose
    private MPSEraseArea [] Areas;

    /**
     * Get <p>Start time, unit: ms</p> 
     * @return BeginMs <p>Start time, unit: ms</p>
     */
    public Long getBeginMs() {
        return this.BeginMs;
    }

    /**
     * Set <p>Start time, unit: ms</p>
     * @param BeginMs <p>Start time, unit: ms</p>
     */
    public void setBeginMs(Long BeginMs) {
        this.BeginMs = BeginMs;
    }

    /**
     * Get <p>End time, unit: ms</p> 
     * @return EndMs <p>End time, unit: ms</p>
     */
    public Long getEndMs() {
        return this.EndMs;
    }

    /**
     * Set <p>End time, unit: ms</p>
     * @param EndMs <p>End time, unit: ms</p>
     */
    public void setEndMs(Long EndMs) {
        this.EndMs = EndMs;
    }

    /**
     * Get <p>Domain list for erasure within the period</p> 
     * @return Areas <p>Domain list for erasure within the period</p>
     */
    public MPSEraseArea [] getAreas() {
        return this.Areas;
    }

    /**
     * Set <p>Domain list for erasure within the period</p>
     * @param Areas <p>Domain list for erasure within the period</p>
     */
    public void setAreas(MPSEraseArea [] Areas) {
        this.Areas = Areas;
    }

    public MPSEraseTimeArea() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSEraseTimeArea(MPSEraseTimeArea source) {
        if (source.BeginMs != null) {
            this.BeginMs = new Long(source.BeginMs);
        }
        if (source.EndMs != null) {
            this.EndMs = new Long(source.EndMs);
        }
        if (source.Areas != null) {
            this.Areas = new MPSEraseArea[source.Areas.length];
            for (int i = 0; i < source.Areas.length; i++) {
                this.Areas[i] = new MPSEraseArea(source.Areas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginMs", this.BeginMs);
        this.setParamSimple(map, prefix + "EndMs", this.EndMs);
        this.setParamArrayObj(map, prefix + "Areas.", this.Areas);

    }
}

