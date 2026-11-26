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

public class IntelligenceRuleItem extends AbstractModel {

    /**
    * Intelligent analysis tag. Valid values:
<li>evil_bot: malicious bot;</li>
<li>suspect_bot: suspected bot;</li>
<li>good_bot: good bot;</li>
<li>normal: Normal request.</li>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * Trigger the handling method corresponding to the Intelligent Analysis tag. Valid values:
<li>drop: block;</li>
<li>trans: pass;</li>
<li>alg: Javascript challenge;</li>
<li>captcha: digit verification code;</li>
<li>monitor: observation.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get Intelligent analysis tag. Valid values:
<li>evil_bot: malicious bot;</li>
<li>suspect_bot: suspected bot;</li>
<li>good_bot: good bot;</li>
<li>normal: Normal request.</li> 
     * @return Label Intelligent analysis tag. Valid values:
<li>evil_bot: malicious bot;</li>
<li>suspect_bot: suspected bot;</li>
<li>good_bot: good bot;</li>
<li>normal: Normal request.</li>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set Intelligent analysis tag. Valid values:
<li>evil_bot: malicious bot;</li>
<li>suspect_bot: suspected bot;</li>
<li>good_bot: good bot;</li>
<li>normal: Normal request.</li>
     * @param Label Intelligent analysis tag. Valid values:
<li>evil_bot: malicious bot;</li>
<li>suspect_bot: suspected bot;</li>
<li>good_bot: good bot;</li>
<li>normal: Normal request.</li>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get Trigger the handling method corresponding to the Intelligent Analysis tag. Valid values:
<li>drop: block;</li>
<li>trans: pass;</li>
<li>alg: Javascript challenge;</li>
<li>captcha: digit verification code;</li>
<li>monitor: observation.</li> 
     * @return Action Trigger the handling method corresponding to the Intelligent Analysis tag. Valid values:
<li>drop: block;</li>
<li>trans: pass;</li>
<li>alg: Javascript challenge;</li>
<li>captcha: digit verification code;</li>
<li>monitor: observation.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Trigger the handling method corresponding to the Intelligent Analysis tag. Valid values:
<li>drop: block;</li>
<li>trans: pass;</li>
<li>alg: Javascript challenge;</li>
<li>captcha: digit verification code;</li>
<li>monitor: observation.</li>
     * @param Action Trigger the handling method corresponding to the Intelligent Analysis tag. Valid values:
<li>drop: block;</li>
<li>trans: pass;</li>
<li>alg: Javascript challenge;</li>
<li>captcha: digit verification code;</li>
<li>monitor: observation.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public IntelligenceRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntelligenceRuleItem(IntelligenceRuleItem source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

