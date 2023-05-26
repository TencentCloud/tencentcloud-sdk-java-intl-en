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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlgDetectResult extends AbstractModel{

    /**
    * The validation result. Values:
<li>`invalid`: Invalid Cookie</li>
<li>`cookie_empty`: No Cookie/Cookie expired</li>
<li>`js_empty`: Client JS disabled</li>
<li>`low`: Low-risk session</li>
<li>`middle`: Medium-risk session</li>
<li>`high`: High-risk session</li>
<li>`timeout`: JS validation timed out</li>
<li>`not_browser`: Invalid browser</li>
<li>`is_bot`: Bot client</li>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * The action. Values:
<li>`drop`: Block</li>
<li>`monitor`: Observe</li>
<li>`silence`: Drop w/o response</li>
<li>`shortdelay`: Add short latency</li>
<li>`longdelay`: Add long latency</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get The validation result. Values:
<li>`invalid`: Invalid Cookie</li>
<li>`cookie_empty`: No Cookie/Cookie expired</li>
<li>`js_empty`: Client JS disabled</li>
<li>`low`: Low-risk session</li>
<li>`middle`: Medium-risk session</li>
<li>`high`: High-risk session</li>
<li>`timeout`: JS validation timed out</li>
<li>`not_browser`: Invalid browser</li>
<li>`is_bot`: Bot client</li> 
     * @return Result The validation result. Values:
<li>`invalid`: Invalid Cookie</li>
<li>`cookie_empty`: No Cookie/Cookie expired</li>
<li>`js_empty`: Client JS disabled</li>
<li>`low`: Low-risk session</li>
<li>`middle`: Medium-risk session</li>
<li>`high`: High-risk session</li>
<li>`timeout`: JS validation timed out</li>
<li>`not_browser`: Invalid browser</li>
<li>`is_bot`: Bot client</li>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set The validation result. Values:
<li>`invalid`: Invalid Cookie</li>
<li>`cookie_empty`: No Cookie/Cookie expired</li>
<li>`js_empty`: Client JS disabled</li>
<li>`low`: Low-risk session</li>
<li>`middle`: Medium-risk session</li>
<li>`high`: High-risk session</li>
<li>`timeout`: JS validation timed out</li>
<li>`not_browser`: Invalid browser</li>
<li>`is_bot`: Bot client</li>
     * @param Result The validation result. Values:
<li>`invalid`: Invalid Cookie</li>
<li>`cookie_empty`: No Cookie/Cookie expired</li>
<li>`js_empty`: Client JS disabled</li>
<li>`low`: Low-risk session</li>
<li>`middle`: Medium-risk session</li>
<li>`high`: High-risk session</li>
<li>`timeout`: JS validation timed out</li>
<li>`not_browser`: Invalid browser</li>
<li>`is_bot`: Bot client</li>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get The action. Values:
<li>`drop`: Block</li>
<li>`monitor`: Observe</li>
<li>`silence`: Drop w/o response</li>
<li>`shortdelay`: Add short latency</li>
<li>`longdelay`: Add long latency</li> 
     * @return Action The action. Values:
<li>`drop`: Block</li>
<li>`monitor`: Observe</li>
<li>`silence`: Drop w/o response</li>
<li>`shortdelay`: Add short latency</li>
<li>`longdelay`: Add long latency</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set The action. Values:
<li>`drop`: Block</li>
<li>`monitor`: Observe</li>
<li>`silence`: Drop w/o response</li>
<li>`shortdelay`: Add short latency</li>
<li>`longdelay`: Add long latency</li>
     * @param Action The action. Values:
<li>`drop`: Block</li>
<li>`monitor`: Observe</li>
<li>`silence`: Drop w/o response</li>
<li>`shortdelay`: Add short latency</li>
<li>`longdelay`: Add long latency</li>
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

