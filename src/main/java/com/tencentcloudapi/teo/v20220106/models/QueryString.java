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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryString extends AbstractModel {

    /**
    * Whether to use `QueryString` as part of `CacheKey`. Valid values: `on` and `off`.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * `includeCustom`: Include the specified query strings.
`excludeCustom`: Exclude the specified query strings.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Array of query strings used/excluded
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get Whether to use `QueryString` as part of `CacheKey`. Valid values: `on` and `off`.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Switch Whether to use `QueryString` as part of `CacheKey`. Valid values: `on` and `off`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to use `QueryString` as part of `CacheKey`. Valid values: `on` and `off`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Switch Whether to use `QueryString` as part of `CacheKey`. Valid values: `on` and `off`.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get `includeCustom`: Include the specified query strings.
`excludeCustom`: Exclude the specified query strings.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Action `includeCustom`: Include the specified query strings.
`excludeCustom`: Exclude the specified query strings.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set `includeCustom`: Include the specified query strings.
`excludeCustom`: Exclude the specified query strings.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Action `includeCustom`: Include the specified query strings.
`excludeCustom`: Exclude the specified query strings.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Array of query strings used/excluded
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Value Array of query strings used/excluded
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set Array of query strings used/excluded
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Value Array of query strings used/excluded
Note: This field may return `null`, indicating that no valid value can be obtained.
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

