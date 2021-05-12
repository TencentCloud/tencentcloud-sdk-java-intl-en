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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleQueryString extends AbstractModel{

    /**
    * Whether to use `QueryString` as part of `CacheKey`. Valid values: on, off
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * `includeCustom` will retain partial query strings
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Array of included/excluded query strings (separated by ';')
Note: this field may return null, indicating that no valid value is obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Whether to use `QueryString` as part of `CacheKey`. Valid values: on, off
Note: this field may return null, indicating that no valid value is obtained. 
     * @return Switch Whether to use `QueryString` as part of `CacheKey`. Valid values: on, off
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to use `QueryString` as part of `CacheKey`. Valid values: on, off
Note: this field may return null, indicating that no valid value is obtained.
     * @param Switch Whether to use `QueryString` as part of `CacheKey`. Valid values: on, off
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get `includeCustom` will retain partial query strings
Note: this field may return null, indicating that no valid value is obtained. 
     * @return Action `includeCustom` will retain partial query strings
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set `includeCustom` will retain partial query strings
Note: this field may return null, indicating that no valid value is obtained.
     * @param Action `includeCustom` will retain partial query strings
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Array of included/excluded query strings (separated by ';')
Note: this field may return null, indicating that no valid value is obtained. 
     * @return Value Array of included/excluded query strings (separated by ';')
Note: this field may return null, indicating that no valid value is obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Array of included/excluded query strings (separated by ';')
Note: this field may return null, indicating that no valid value is obtained.
     * @param Value Array of included/excluded query strings (separated by ';')
Note: this field may return null, indicating that no valid value is obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public RuleQueryString() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleQueryString(RuleQueryString source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

