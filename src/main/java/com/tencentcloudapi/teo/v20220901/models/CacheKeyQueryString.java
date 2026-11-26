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
    * Switch to reserve or ignore specified parameters in the query string. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Action to reserve or ignore specified parameters in the query string. Valid values:
<li>includeCustom: means to reserve some parameters;</li>
<li>excludeCustom: means to ignore some parameters.</li>Note: This field is required when Switch is on. When Switch is off, this field is not required and does not take effect if filled in.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * List of parameter names to reserve/ignore in the query string.<br>Note: When Switch is on, this field is required; when Switch is off, no need to specify this field, and if specified, it does not take effect.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Switch to reserve or ignore specified parameters in the query string. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch Switch to reserve or ignore specified parameters in the query string. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch to reserve or ignore specified parameters in the query string. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch Switch to reserve or ignore specified parameters in the query string. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Action to reserve or ignore specified parameters in the query string. Valid values:
<li>includeCustom: means to reserve some parameters;</li>
<li>excludeCustom: means to ignore some parameters.</li>Note: This field is required when Switch is on. When Switch is off, this field is not required and does not take effect if filled in. 
     * @return Action Action to reserve or ignore specified parameters in the query string. Valid values:
<li>includeCustom: means to reserve some parameters;</li>
<li>excludeCustom: means to ignore some parameters.</li>Note: This field is required when Switch is on. When Switch is off, this field is not required and does not take effect if filled in.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Action to reserve or ignore specified parameters in the query string. Valid values:
<li>includeCustom: means to reserve some parameters;</li>
<li>excludeCustom: means to ignore some parameters.</li>Note: This field is required when Switch is on. When Switch is off, this field is not required and does not take effect if filled in.
     * @param Action Action to reserve or ignore specified parameters in the query string. Valid values:
<li>includeCustom: means to reserve some parameters;</li>
<li>excludeCustom: means to ignore some parameters.</li>Note: This field is required when Switch is on. When Switch is off, this field is not required and does not take effect if filled in.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get List of parameter names to reserve/ignore in the query string.<br>Note: When Switch is on, this field is required; when Switch is off, no need to specify this field, and if specified, it does not take effect. 
     * @return Values List of parameter names to reserve/ignore in the query string.<br>Note: When Switch is on, this field is required; when Switch is off, no need to specify this field, and if specified, it does not take effect.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set List of parameter names to reserve/ignore in the query string.<br>Note: When Switch is on, this field is required; when Switch is off, no need to specify this field, and if specified, it does not take effect.
     * @param Values List of parameter names to reserve/ignore in the query string.<br>Note: When Switch is on, this field is required; when Switch is off, no need to specify this field, and if specified, it does not take effect.
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

