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

public class BotExtendAction extends AbstractModel {

    /**
    * Disposal actions. Valid values:
<li>monitor: observation;</li>
<li>alg: JavaScript challenge;</li>
<li>captcha: hosted challenge;</li>
<li>random: random, allocate handling actions and proportions according to ExtendActions;</li>
<li>silence: silence;</li>
<li>shortdelay: short-term response;</li>
<li>longdelay: long-time response.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Probability for triggering the handling method. Value range: 0-100.
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
     * Get Disposal actions. Valid values:
<li>monitor: observation;</li>
<li>alg: JavaScript challenge;</li>
<li>captcha: hosted challenge;</li>
<li>random: random, allocate handling actions and proportions according to ExtendActions;</li>
<li>silence: silence;</li>
<li>shortdelay: short-term response;</li>
<li>longdelay: long-time response.</li> 
     * @return Action Disposal actions. Valid values:
<li>monitor: observation;</li>
<li>alg: JavaScript challenge;</li>
<li>captcha: hosted challenge;</li>
<li>random: random, allocate handling actions and proportions according to ExtendActions;</li>
<li>silence: silence;</li>
<li>shortdelay: short-term response;</li>
<li>longdelay: long-time response.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Disposal actions. Valid values:
<li>monitor: observation;</li>
<li>alg: JavaScript challenge;</li>
<li>captcha: hosted challenge;</li>
<li>random: random, allocate handling actions and proportions according to ExtendActions;</li>
<li>silence: silence;</li>
<li>shortdelay: short-term response;</li>
<li>longdelay: long-time response.</li>
     * @param Action Disposal actions. Valid values:
<li>monitor: observation;</li>
<li>alg: JavaScript challenge;</li>
<li>captcha: hosted challenge;</li>
<li>random: random, allocate handling actions and proportions according to ExtendActions;</li>
<li>silence: silence;</li>
<li>shortdelay: short-term response;</li>
<li>longdelay: long-time response.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Probability for triggering the handling method. Value range: 0-100. 
     * @return Percent Probability for triggering the handling method. Value range: 0-100.
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set Probability for triggering the handling method. Value range: 0-100.
     * @param Percent Probability for triggering the handling method. Value range: 0-100.
     */
    public void setPercent(Long Percent) {
        this.Percent = Percent;
    }

    public BotExtendAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotExtendAction(BotExtendAction source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Percent != null) {
            this.Percent = new Long(source.Percent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Percent", this.Percent);

    }
}

