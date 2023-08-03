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

public class BotExtendAction extends AbstractModel{

    /**
    * Action. Valid values: 
<li>`monitor`: Observe;</li>
<li>`alg`: JavaScript challenge;</li>
<li>`captcha`: Managed challenge;</li>
<li>`random`: Actions are executed based on the percentage specified in `ExtendActions`;</li>
<li>`silence`: Silence;</li>
<li>`shortdelay`: Add short latency;</li>
<li>`longdelay`: Add long latency.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * The probability for triggering the action. Value range: 0-100.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Percent")
    @Expose
    private Long Percent;

    /**
     * Get Action. Valid values: 
<li>`monitor`: Observe;</li>
<li>`alg`: JavaScript challenge;</li>
<li>`captcha`: Managed challenge;</li>
<li>`random`: Actions are executed based on the percentage specified in `ExtendActions`;</li>
<li>`silence`: Silence;</li>
<li>`shortdelay`: Add short latency;</li>
<li>`longdelay`: Add long latency.</li> 
     * @return Action Action. Valid values: 
<li>`monitor`: Observe;</li>
<li>`alg`: JavaScript challenge;</li>
<li>`captcha`: Managed challenge;</li>
<li>`random`: Actions are executed based on the percentage specified in `ExtendActions`;</li>
<li>`silence`: Silence;</li>
<li>`shortdelay`: Add short latency;</li>
<li>`longdelay`: Add long latency.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action. Valid values: 
<li>`monitor`: Observe;</li>
<li>`alg`: JavaScript challenge;</li>
<li>`captcha`: Managed challenge;</li>
<li>`random`: Actions are executed based on the percentage specified in `ExtendActions`;</li>
<li>`silence`: Silence;</li>
<li>`shortdelay`: Add short latency;</li>
<li>`longdelay`: Add long latency.</li>
     * @param Action Action. Valid values: 
<li>`monitor`: Observe;</li>
<li>`alg`: JavaScript challenge;</li>
<li>`captcha`: Managed challenge;</li>
<li>`random`: Actions are executed based on the percentage specified in `ExtendActions`;</li>
<li>`silence`: Silence;</li>
<li>`shortdelay`: Add short latency;</li>
<li>`longdelay`: Add long latency.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get The probability for triggering the action. Value range: 0-100.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Percent The probability for triggering the action. Value range: 0-100.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getPercent() {
        return this.Percent;
    }

    /**
     * Set The probability for triggering the action. Value range: 0-100.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Percent The probability for triggering the action. Value range: 0-100.
Note: This field may return `null`, indicating that no valid values can be obtained.
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

