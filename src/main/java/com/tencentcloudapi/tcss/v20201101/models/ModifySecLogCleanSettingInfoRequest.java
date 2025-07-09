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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecLogCleanSettingInfoRequest extends AbstractModel {

    /**
    * Minimum storage (50-99) for triggering clearing
    */
    @SerializedName("ReservesLimit")
    @Expose
    private Long ReservesLimit;

    /**
    * Storage limit (greater than 0 and smaller than `ReservesLimit`) for stopping clearing
    */
    @SerializedName("ReservesDeadline")
    @Expose
    private Long ReservesDeadline;

    /**
    * Storage period (no less than one day) for triggering clearing
    */
    @SerializedName("DayLimit")
    @Expose
    private Long DayLimit;

    /**
     * Get Minimum storage (50-99) for triggering clearing 
     * @return ReservesLimit Minimum storage (50-99) for triggering clearing
     */
    public Long getReservesLimit() {
        return this.ReservesLimit;
    }

    /**
     * Set Minimum storage (50-99) for triggering clearing
     * @param ReservesLimit Minimum storage (50-99) for triggering clearing
     */
    public void setReservesLimit(Long ReservesLimit) {
        this.ReservesLimit = ReservesLimit;
    }

    /**
     * Get Storage limit (greater than 0 and smaller than `ReservesLimit`) for stopping clearing 
     * @return ReservesDeadline Storage limit (greater than 0 and smaller than `ReservesLimit`) for stopping clearing
     */
    public Long getReservesDeadline() {
        return this.ReservesDeadline;
    }

    /**
     * Set Storage limit (greater than 0 and smaller than `ReservesLimit`) for stopping clearing
     * @param ReservesDeadline Storage limit (greater than 0 and smaller than `ReservesLimit`) for stopping clearing
     */
    public void setReservesDeadline(Long ReservesDeadline) {
        this.ReservesDeadline = ReservesDeadline;
    }

    /**
     * Get Storage period (no less than one day) for triggering clearing 
     * @return DayLimit Storage period (no less than one day) for triggering clearing
     */
    public Long getDayLimit() {
        return this.DayLimit;
    }

    /**
     * Set Storage period (no less than one day) for triggering clearing
     * @param DayLimit Storage period (no less than one day) for triggering clearing
     */
    public void setDayLimit(Long DayLimit) {
        this.DayLimit = DayLimit;
    }

    public ModifySecLogCleanSettingInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecLogCleanSettingInfoRequest(ModifySecLogCleanSettingInfoRequest source) {
        if (source.ReservesLimit != null) {
            this.ReservesLimit = new Long(source.ReservesLimit);
        }
        if (source.ReservesDeadline != null) {
            this.ReservesDeadline = new Long(source.ReservesDeadline);
        }
        if (source.DayLimit != null) {
            this.DayLimit = new Long(source.DayLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReservesLimit", this.ReservesLimit);
        this.setParamSimple(map, prefix + "ReservesDeadline", this.ReservesDeadline);
        this.setParamSimple(map, prefix + "DayLimit", this.DayLimit);

    }
}

