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

public class QueryString extends AbstractModel {

    /**
    * Whether CacheKey consists of QueryString. Valid values:
<li>on: yes;</li>
<li>off: No.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * CacheKey uses QueryString. Valid values:
<li>includeCustom: use partial url parameters;</li>
<li>excludeCustom: Exclude some url parameters.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * url parameter array for usage or exclusion.
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get Whether CacheKey consists of QueryString. Valid values:
<li>on: yes;</li>
<li>off: No.</li> 
     * @return Switch Whether CacheKey consists of QueryString. Valid values:
<li>on: yes;</li>
<li>off: No.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether CacheKey consists of QueryString. Valid values:
<li>on: yes;</li>
<li>off: No.</li>
     * @param Switch Whether CacheKey consists of QueryString. Valid values:
<li>on: yes;</li>
<li>off: No.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get CacheKey uses QueryString. Valid values:
<li>includeCustom: use partial url parameters;</li>
<li>excludeCustom: Exclude some url parameters.</li> 
     * @return Action CacheKey uses QueryString. Valid values:
<li>includeCustom: use partial url parameters;</li>
<li>excludeCustom: Exclude some url parameters.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set CacheKey uses QueryString. Valid values:
<li>includeCustom: use partial url parameters;</li>
<li>excludeCustom: Exclude some url parameters.</li>
     * @param Action CacheKey uses QueryString. Valid values:
<li>includeCustom: use partial url parameters;</li>
<li>excludeCustom: Exclude some url parameters.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get url parameter array for usage or exclusion. 
     * @return Value url parameter array for usage or exclusion.
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set url parameter array for usage or exclusion.
     * @param Value url parameter array for usage or exclusion.
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    public QueryString() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryString(QueryString source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);

    }
}

