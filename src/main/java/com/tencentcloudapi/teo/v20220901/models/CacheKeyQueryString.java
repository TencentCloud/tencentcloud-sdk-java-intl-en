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

public class CacheKeyQueryString extends AbstractModel {

    /**
    * Query string retain/ignore specified parameter switch. valid values are:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Actions to retain/ignore specified parameters in the query string. values:.
<Li>`IncludeCustom`: retain partial parameters.</li>.
<Li>`ExcludeCustom`: ignore partial parameters.</li> note: this field is required when `switch` is on. when `switch` is off, this field is not required and will not take effect if filled.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * List of parameter names to be retained/ignored in the query string. <br>note: this field is required when `switch` is on. when `switch` is off, this field is not required and will not take effect if filled.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Query string retain/ignore specified parameter switch. valid values are:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>. 
     * @return Switch Query string retain/ignore specified parameter switch. valid values are:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Query string retain/ignore specified parameter switch. valid values are:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     * @param Switch Query string retain/ignore specified parameter switch. valid values are:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Actions to retain/ignore specified parameters in the query string. values:.
<Li>`IncludeCustom`: retain partial parameters.</li>.
<Li>`ExcludeCustom`: ignore partial parameters.</li> note: this field is required when `switch` is on. when `switch` is off, this field is not required and will not take effect if filled. 
     * @return Action Actions to retain/ignore specified parameters in the query string. values:.
<Li>`IncludeCustom`: retain partial parameters.</li>.
<Li>`ExcludeCustom`: ignore partial parameters.</li> note: this field is required when `switch` is on. when `switch` is off, this field is not required and will not take effect if filled.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Actions to retain/ignore specified parameters in the query string. values:.
<Li>`IncludeCustom`: retain partial parameters.</li>.
<Li>`ExcludeCustom`: ignore partial parameters.</li> note: this field is required when `switch` is on. when `switch` is off, this field is not required and will not take effect if filled.
     * @param Action Actions to retain/ignore specified parameters in the query string. values:.
<Li>`IncludeCustom`: retain partial parameters.</li>.
<Li>`ExcludeCustom`: ignore partial parameters.</li> note: this field is required when `switch` is on. when `switch` is off, this field is not required and will not take effect if filled.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get List of parameter names to be retained/ignored in the query string. <br>note: this field is required when `switch` is on. when `switch` is off, this field is not required and will not take effect if filled. 
     * @return Values List of parameter names to be retained/ignored in the query string. <br>note: this field is required when `switch` is on. when `switch` is off, this field is not required and will not take effect if filled.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set List of parameter names to be retained/ignored in the query string. <br>note: this field is required when `switch` is on. when `switch` is off, this field is not required and will not take effect if filled.
     * @param Values List of parameter names to be retained/ignored in the query string. <br>note: this field is required when `switch` is on. when `switch` is off, this field is not required and will not take effect if filled.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public CacheKeyQueryString() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheKeyQueryString(CacheKeyQueryString source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

