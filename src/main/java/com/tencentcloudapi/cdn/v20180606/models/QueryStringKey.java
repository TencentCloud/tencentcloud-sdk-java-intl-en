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

public class QueryStringKey extends AbstractModel{

    /**
    * Whether to use `QueryString` as part of `CacheKey`. Valid values: on, off
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Whether to sort again
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Reorder")
    @Expose
    private String Reorder;

    /**
    * Include/exclude query parameters. Valid values: `includeAll`, `excludeAll`, `includeCustom`, `excludeAll`
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Array of included/excluded URL parameters (separated by ';')
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Whether to use `QueryString` as part of `CacheKey`. Valid values: on, off
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Switch Whether to use `QueryString` as part of `CacheKey`. Valid values: on, off
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to use `QueryString` as part of `CacheKey`. Valid values: on, off
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Switch Whether to use `QueryString` as part of `CacheKey`. Valid values: on, off
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Whether to sort again
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Reorder Whether to sort again
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getReorder() {
        return this.Reorder;
    }

    /**
     * Set Whether to sort again
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Reorder Whether to sort again
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReorder(String Reorder) {
        this.Reorder = Reorder;
    }

    /**
     * Get Include/exclude query parameters. Valid values: `includeAll`, `excludeAll`, `includeCustom`, `excludeAll`
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Action Include/exclude query parameters. Valid values: `includeAll`, `excludeAll`, `includeCustom`, `excludeAll`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Include/exclude query parameters. Valid values: `includeAll`, `excludeAll`, `includeCustom`, `excludeAll`
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Action Include/exclude query parameters. Valid values: `includeAll`, `excludeAll`, `includeCustom`, `excludeAll`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Array of included/excluded URL parameters (separated by ';')
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Value Array of included/excluded URL parameters (separated by ';')
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Array of included/excluded URL parameters (separated by ';')
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Value Array of included/excluded URL parameters (separated by ';')
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Reorder", this.Reorder);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

