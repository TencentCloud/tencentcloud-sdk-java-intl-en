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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitTemplateDetail extends AbstractModel {

    /**
    * Template level name. valid values:.
<Li>Sup_loose: specifies super loose.</li>.
<Li>`Loose`: loose</li>.
<Li>`Emergency`: emergency</li>.
<li>`normal`: moderate</li>.
<li>strict</li>.
<li>`close`: off, precise rate limiting effective.</li>.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Unique ID.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Template action. valid values:.
<li>alg: JavaScript challenge;</li>.
<li>`monitor`: observe</li>.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Penalty time, value range 0-2 days, unit second.
    */
    @SerializedName("PunishTime")
    @Expose
    private Long PunishTime;

    /**
    * Statistical threshold, in times. Value range: 0-4294967294.
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * Statistical cycle. Value range: 0-120 seconds.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get Template level name. valid values:.
<Li>Sup_loose: specifies super loose.</li>.
<Li>`Loose`: loose</li>.
<Li>`Emergency`: emergency</li>.
<li>`normal`: moderate</li>.
<li>strict</li>.
<li>`close`: off, precise rate limiting effective.</li>. 
     * @return Mode Template level name. valid values:.
<Li>Sup_loose: specifies super loose.</li>.
<Li>`Loose`: loose</li>.
<Li>`Emergency`: emergency</li>.
<li>`normal`: moderate</li>.
<li>strict</li>.
<li>`close`: off, precise rate limiting effective.</li>.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Template level name. valid values:.
<Li>Sup_loose: specifies super loose.</li>.
<Li>`Loose`: loose</li>.
<Li>`Emergency`: emergency</li>.
<li>`normal`: moderate</li>.
<li>strict</li>.
<li>`close`: off, precise rate limiting effective.</li>.
     * @param Mode Template level name. valid values:.
<Li>Sup_loose: specifies super loose.</li>.
<Li>`Loose`: loose</li>.
<Li>`Emergency`: emergency</li>.
<li>`normal`: moderate</li>.
<li>strict</li>.
<li>`close`: off, precise rate limiting effective.</li>.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Unique ID. 
     * @return ID Unique ID.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Unique ID.
     * @param ID Unique ID.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Template action. valid values:.
<li>alg: JavaScript challenge;</li>.
<li>`monitor`: observe</li>. 
     * @return Action Template action. valid values:.
<li>alg: JavaScript challenge;</li>.
<li>`monitor`: observe</li>.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Template action. valid values:.
<li>alg: JavaScript challenge;</li>.
<li>`monitor`: observe</li>.
     * @param Action Template action. valid values:.
<li>alg: JavaScript challenge;</li>.
<li>`monitor`: observe</li>.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Penalty time, value range 0-2 days, unit second. 
     * @return PunishTime Penalty time, value range 0-2 days, unit second.
     */
    public Long getPunishTime() {
        return this.PunishTime;
    }

    /**
     * Set Penalty time, value range 0-2 days, unit second.
     * @param PunishTime Penalty time, value range 0-2 days, unit second.
     */
    public void setPunishTime(Long PunishTime) {
        this.PunishTime = PunishTime;
    }

    /**
     * Get Statistical threshold, in times. Value range: 0-4294967294. 
     * @return Threshold Statistical threshold, in times. Value range: 0-4294967294.
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set Statistical threshold, in times. Value range: 0-4294967294.
     * @param Threshold Statistical threshold, in times. Value range: 0-4294967294.
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get Statistical cycle. Value range: 0-120 seconds. 
     * @return Period Statistical cycle. Value range: 0-120 seconds.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Statistical cycle. Value range: 0-120 seconds.
     * @param Period Statistical cycle. Value range: 0-120 seconds.
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

