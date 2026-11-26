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
    * Template level name. Valid values:
<li>sup_loose: super loose;</li>
<li>loose: loose;</li>
<li>emergency: emergency;</li>
<li>normal: moderate;</li>
<li>strict: strict;</li>
<li>close: disabled, effective only for precise rate limiting.</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Template action. Valid values:
<li>alg: JavaScript challenge;</li>
<li>monitor: observe.</li>Default value: alg if not specified.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Description of the template value. Returned only as an output parameter.
    */
    @SerializedName("RateLimitTemplateDetail")
    @Expose
    private RateLimitTemplateDetail RateLimitTemplateDetail;

    /**
     * Get Template level name. Valid values:
<li>sup_loose: super loose;</li>
<li>loose: loose;</li>
<li>emergency: emergency;</li>
<li>normal: moderate;</li>
<li>strict: strict;</li>
<li>close: disabled, effective only for precise rate limiting.</li> 
     * @return Mode Template level name. Valid values:
<li>sup_loose: super loose;</li>
<li>loose: loose;</li>
<li>emergency: emergency;</li>
<li>normal: moderate;</li>
<li>strict: strict;</li>
<li>close: disabled, effective only for precise rate limiting.</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Template level name. Valid values:
<li>sup_loose: super loose;</li>
<li>loose: loose;</li>
<li>emergency: emergency;</li>
<li>normal: moderate;</li>
<li>strict: strict;</li>
<li>close: disabled, effective only for precise rate limiting.</li>
     * @param Mode Template level name. Valid values:
<li>sup_loose: super loose;</li>
<li>loose: loose;</li>
<li>emergency: emergency;</li>
<li>normal: moderate;</li>
<li>strict: strict;</li>
<li>close: disabled, effective only for precise rate limiting.</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Template action. Valid values:
<li>alg: JavaScript challenge;</li>
<li>monitor: observe.</li>Default value: alg if not specified. 
     * @return Action Template action. Valid values:
<li>alg: JavaScript challenge;</li>
<li>monitor: observe.</li>Default value: alg if not specified.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Template action. Valid values:
<li>alg: JavaScript challenge;</li>
<li>monitor: observe.</li>Default value: alg if not specified.
     * @param Action Template action. Valid values:
<li>alg: JavaScript challenge;</li>
<li>monitor: observe.</li>Default value: alg if not specified.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Description of the template value. Returned only as an output parameter. 
     * @return RateLimitTemplateDetail Description of the template value. Returned only as an output parameter.
     */
    public RateLimitTemplateDetail getRateLimitTemplateDetail() {
        return this.RateLimitTemplateDetail;
    }

    /**
     * Set Description of the template value. Returned only as an output parameter.
     * @param RateLimitTemplateDetail Description of the template value. Returned only as an output parameter.
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

