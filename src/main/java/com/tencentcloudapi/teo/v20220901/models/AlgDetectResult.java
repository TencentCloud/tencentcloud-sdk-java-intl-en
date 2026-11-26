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

public class AlgDetectResult extends AbstractModel {

    /**
    * Check results. Valid values:
<li>invalid: invalid Cookie;</li>
<li>cookie_empty: No cookie carried or the cookie has expired;</li>
<li>js_empty: JS is not enabled on the client (test not completed);</li>
<li>low: low risk in session rate and periodic feature verification;</li>
<li>middle: medium-risk in session rate and periodic feature verification;</li>
<li>high: high-risk session rate and periodic feature verification;</li>
<li>timeout: Timeout duration for detection;</li>
<li>not_browser: invalid browser;</li>
<li>is_bot: Bot Client.</li>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * Penalty action. Valid values:
<li>drop: block;</li>
<li>monitor: observation;</li>
<li>silence: silence;</li>
<li>shortdelay: respond after a short time;</li>
<li>longdelay: respond after a long wait.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get Check results. Valid values:
<li>invalid: invalid Cookie;</li>
<li>cookie_empty: No cookie carried or the cookie has expired;</li>
<li>js_empty: JS is not enabled on the client (test not completed);</li>
<li>low: low risk in session rate and periodic feature verification;</li>
<li>middle: medium-risk in session rate and periodic feature verification;</li>
<li>high: high-risk session rate and periodic feature verification;</li>
<li>timeout: Timeout duration for detection;</li>
<li>not_browser: invalid browser;</li>
<li>is_bot: Bot Client.</li> 
     * @return Result Check results. Valid values:
<li>invalid: invalid Cookie;</li>
<li>cookie_empty: No cookie carried or the cookie has expired;</li>
<li>js_empty: JS is not enabled on the client (test not completed);</li>
<li>low: low risk in session rate and periodic feature verification;</li>
<li>middle: medium-risk in session rate and periodic feature verification;</li>
<li>high: high-risk session rate and periodic feature verification;</li>
<li>timeout: Timeout duration for detection;</li>
<li>not_browser: invalid browser;</li>
<li>is_bot: Bot Client.</li>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set Check results. Valid values:
<li>invalid: invalid Cookie;</li>
<li>cookie_empty: No cookie carried or the cookie has expired;</li>
<li>js_empty: JS is not enabled on the client (test not completed);</li>
<li>low: low risk in session rate and periodic feature verification;</li>
<li>middle: medium-risk in session rate and periodic feature verification;</li>
<li>high: high-risk session rate and periodic feature verification;</li>
<li>timeout: Timeout duration for detection;</li>
<li>not_browser: invalid browser;</li>
<li>is_bot: Bot Client.</li>
     * @param Result Check results. Valid values:
<li>invalid: invalid Cookie;</li>
<li>cookie_empty: No cookie carried or the cookie has expired;</li>
<li>js_empty: JS is not enabled on the client (test not completed);</li>
<li>low: low risk in session rate and periodic feature verification;</li>
<li>middle: medium-risk in session rate and periodic feature verification;</li>
<li>high: high-risk session rate and periodic feature verification;</li>
<li>timeout: Timeout duration for detection;</li>
<li>not_browser: invalid browser;</li>
<li>is_bot: Bot Client.</li>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get Penalty action. Valid values:
<li>drop: block;</li>
<li>monitor: observation;</li>
<li>silence: silence;</li>
<li>shortdelay: respond after a short time;</li>
<li>longdelay: respond after a long wait.</li> 
     * @return Action Penalty action. Valid values:
<li>drop: block;</li>
<li>monitor: observation;</li>
<li>silence: silence;</li>
<li>shortdelay: respond after a short time;</li>
<li>longdelay: respond after a long wait.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Penalty action. Valid values:
<li>drop: block;</li>
<li>monitor: observation;</li>
<li>silence: silence;</li>
<li>shortdelay: respond after a short time;</li>
<li>longdelay: respond after a long wait.</li>
     * @param Action Penalty action. Valid values:
<li>drop: block;</li>
<li>monitor: observation;</li>
<li>silence: silence;</li>
<li>shortdelay: respond after a short time;</li>
<li>longdelay: respond after a long wait.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public AlgDetectResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlgDetectResult(AlgDetectResult source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

