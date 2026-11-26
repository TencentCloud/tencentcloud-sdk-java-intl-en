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

public class CacheKeyHeader extends AbstractModel {

    /**
    * Function switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * List of custom Cache Key HTTP request headers.<br>Note: This field is required when Switch is on. It is not required when Switch is off, and will not take effect if specified.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Function switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch Function switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Function switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch Function switch. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get List of custom Cache Key HTTP request headers.<br>Note: This field is required when Switch is on. It is not required when Switch is off, and will not take effect if specified. 
     * @return Values List of custom Cache Key HTTP request headers.<br>Note: This field is required when Switch is on. It is not required when Switch is off, and will not take effect if specified.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set List of custom Cache Key HTTP request headers.<br>Note: This field is required when Switch is on. It is not required when Switch is off, and will not take effect if specified.
     * @param Values List of custom Cache Key HTTP request headers.<br>Note: This field is required when Switch is on. It is not required when Switch is off, and will not take effect if specified.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public CacheKeyHeader() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheKeyHeader(CacheKeyHeader source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
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
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

