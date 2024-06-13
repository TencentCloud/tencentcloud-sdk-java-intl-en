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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitTemplateDetail extends AbstractModel {

    /**
    * Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * The unique ID.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Note: This field may return null, which indicates a failure to obtain a valid value.
    */
    @SerializedName("PunishTime")
    @Expose
    private Long PunishTime;

    /**
    * The request threshold. Value range: 0-4294967294.
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * The statistical period. Value range: 0-120 seconds.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return Mode Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param Mode Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get The unique ID. 
     * @return ID The unique ID.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set The unique ID.
     * @param ID The unique ID.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return Action Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param Action Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Note: This field may return null, which indicates a failure to obtain a valid value. 
     * @return PunishTime Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public Long getPunishTime() {
        return this.PunishTime;
    }

    /**
     * Set Note: This field may return null, which indicates a failure to obtain a valid value.
     * @param PunishTime Note: This field may return null, which indicates a failure to obtain a valid value.
     */
    public void setPunishTime(Long PunishTime) {
        this.PunishTime = PunishTime;
    }

    /**
     * Get The request threshold. Value range: 0-4294967294. 
     * @return Threshold The request threshold. Value range: 0-4294967294.
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set The request threshold. Value range: 0-4294967294.
     * @param Threshold The request threshold. Value range: 0-4294967294.
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get The statistical period. Value range: 0-120 seconds. 
     * @return Period The statistical period. Value range: 0-120 seconds.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set The statistical period. Value range: 0-120 seconds.
     * @param Period The statistical period. Value range: 0-120 seconds.
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

