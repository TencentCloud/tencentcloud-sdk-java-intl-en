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

public class RateLimitTemplate extends AbstractModel {

    /**
    * The mode. Values:
<li>`sup_loose`: Super loose</li>
<li>`loose`: Loose</li>
<li>`emergency`: Emergency</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`close`: Off</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * The action. Values:
<li>`alg`: JavaScript challenge</li>
<li>`monitor`: Observe</li>If it is left empty, the default value `alg` is used.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The settings of the rate limiting template. It is only used as an output parameter.
    */
    @SerializedName("RateLimitTemplateDetail")
    @Expose
    private RateLimitTemplateDetail RateLimitTemplateDetail;

    /**
     * Get The mode. Values:
<li>`sup_loose`: Super loose</li>
<li>`loose`: Loose</li>
<li>`emergency`: Emergency</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`close`: Off</li> 
     * @return Mode The mode. Values:
<li>`sup_loose`: Super loose</li>
<li>`loose`: Loose</li>
<li>`emergency`: Emergency</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`close`: Off</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set The mode. Values:
<li>`sup_loose`: Super loose</li>
<li>`loose`: Loose</li>
<li>`emergency`: Emergency</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`close`: Off</li>
     * @param Mode The mode. Values:
<li>`sup_loose`: Super loose</li>
<li>`loose`: Loose</li>
<li>`emergency`: Emergency</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`close`: Off</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get The action. Values:
<li>`alg`: JavaScript challenge</li>
<li>`monitor`: Observe</li>If it is left empty, the default value `alg` is used. 
     * @return Action The action. Values:
<li>`alg`: JavaScript challenge</li>
<li>`monitor`: Observe</li>If it is left empty, the default value `alg` is used.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set The action. Values:
<li>`alg`: JavaScript challenge</li>
<li>`monitor`: Observe</li>If it is left empty, the default value `alg` is used.
     * @param Action The action. Values:
<li>`alg`: JavaScript challenge</li>
<li>`monitor`: Observe</li>If it is left empty, the default value `alg` is used.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get The settings of the rate limiting template. It is only used as an output parameter. 
     * @return RateLimitTemplateDetail The settings of the rate limiting template. It is only used as an output parameter.
     */
    public RateLimitTemplateDetail getRateLimitTemplateDetail() {
        return this.RateLimitTemplateDetail;
    }

    /**
     * Set The settings of the rate limiting template. It is only used as an output parameter.
     * @param RateLimitTemplateDetail The settings of the rate limiting template. It is only used as an output parameter.
     */
    public void setRateLimitTemplateDetail(RateLimitTemplateDetail RateLimitTemplateDetail) {
        this.RateLimitTemplateDetail = RateLimitTemplateDetail;
    }

    public RateLimitTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitTemplate(RateLimitTemplate source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RateLimitTemplateDetail != null) {
            this.RateLimitTemplateDetail = new RateLimitTemplateDetail(source.RateLimitTemplateDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamObj(map, prefix + "RateLimitTemplateDetail.", this.RateLimitTemplateDetail);

    }
}

