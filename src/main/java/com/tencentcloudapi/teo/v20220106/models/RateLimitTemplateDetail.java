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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitTemplateDetail extends AbstractModel {

    /**
    * Template name
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Unique ID
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Action
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Time it takes to perform the action
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("PunishTime")
    @Expose
    private Long PunishTime;

    /**
    * Request rate threshold
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * Statistical period
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get Template name
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Mode Template name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Template name
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Mode Template name
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Unique ID
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ID Unique ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Unique ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ID Unique ID
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Action
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Action Action
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Action Action
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Time it takes to perform the action
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return PunishTime Time it takes to perform the action
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getPunishTime() {
        return this.PunishTime;
    }

    /**
     * Set Time it takes to perform the action
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param PunishTime Time it takes to perform the action
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPunishTime(Long PunishTime) {
        this.PunishTime = PunishTime;
    }

    /**
     * Get Request rate threshold
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Threshold Request rate threshold
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Request rate threshold
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Threshold Request rate threshold
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get Statistical period
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Period Statistical period
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Statistical period
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Period Statistical period
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public RateLimitTemplateDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitTemplateDetail(RateLimitTemplateDetail source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.PunishTime != null) {
            this.PunishTime = new Long(source.PunishTime);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "PunishTime", this.PunishTime);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

