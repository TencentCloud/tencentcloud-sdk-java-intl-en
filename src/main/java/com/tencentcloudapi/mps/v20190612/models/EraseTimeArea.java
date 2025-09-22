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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EraseTimeArea extends AbstractModel {

    /**
    * Start time, in ms.
    */
    @SerializedName("BeginMs")
    @Expose
    private Long BeginMs;

    /**
    * End time, unit: ms.
    */
    @SerializedName("EndMs")
    @Expose
    private Long EndMs;

    /**
    * Erases the domain list within the period.
    */
    @SerializedName("Areas")
    @Expose
    private EraseArea [] Areas;

    /**
     * Get Start time, in ms. 
     * @return BeginMs Start time, in ms.
     */
    public Long getBeginMs() {
        return this.BeginMs;
    }

    /**
     * Set Start time, in ms.
     * @param BeginMs Start time, in ms.
     */
    public void setBeginMs(Long BeginMs) {
        this.BeginMs = BeginMs;
    }

    /**
     * Get End time, unit: ms. 
     * @return EndMs End time, unit: ms.
     */
    public Long getEndMs() {
        return this.EndMs;
    }

    /**
     * Set End time, unit: ms.
     * @param EndMs End time, unit: ms.
     */
    public void setEndMs(Long EndMs) {
        this.EndMs = EndMs;
    }

    /**
     * Get Erases the domain list within the period. 
     * @return Areas Erases the domain list within the period.
     */
    public EraseArea [] getAreas() {
        return this.Areas;
    }

    /**
     * Set Erases the domain list within the period.
     * @param Areas Erases the domain list within the period.
     */
    public void setAreas(EraseArea [] Areas) {
        this.Areas = Areas;
    }

    public EraseTimeArea() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EraseTimeArea(EraseTimeArea source) {
        if (source.BeginMs != null) {
            this.BeginMs = new Long(source.BeginMs);
        }
        if (source.EndMs != null) {
            this.EndMs = new Long(source.EndMs);
        }
        if (source.Areas != null) {
            this.Areas = new EraseArea[source.Areas.length];
            for (int i = 0; i < source.Areas.length; i++) {
                this.Areas[i] = new EraseArea(source.Areas[i]);
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

