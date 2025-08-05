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
    * Whether to use `QueryString` as part of `CacheKey`. Values:
<li>`on`: Yes</li>
<li>`off`: No</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * CacheKey usage via QueryString, valid values:.
<li>includeCustom: use partial url parameter;</li>.
<li>excludeCustom: exclude partial url parameters.</li>.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Specifies the url parameter array for usage/exclusion.
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get Whether to use `QueryString` as part of `CacheKey`. Values:
<li>`on`: Yes</li>
<li>`off`: No</li> 
     * @return Switch Whether to use `QueryString` as part of `CacheKey`. Values:
<li>`on`: Yes</li>
<li>`off`: No</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to use `QueryString` as part of `CacheKey`. Values:
<li>`on`: Yes</li>
<li>`off`: No</li>
     * @param Switch Whether to use `QueryString` as part of `CacheKey`. Values:
<li>`on`: Yes</li>
<li>`off`: No</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get CacheKey usage via QueryString, valid values:.
<li>includeCustom: use partial url parameter;</li>.
<li>excludeCustom: exclude partial url parameters.</li>. 
     * @return Action CacheKey usage via QueryString, valid values:.
<li>includeCustom: use partial url parameter;</li>.
<li>excludeCustom: exclude partial url parameters.</li>.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set CacheKey usage via QueryString, valid values:.
<li>includeCustom: use partial url parameter;</li>.
<li>excludeCustom: exclude partial url parameters.</li>.
     * @param Action CacheKey usage via QueryString, valid values:.
<li>includeCustom: use partial url parameter;</li>.
<li>excludeCustom: exclude partial url parameters.</li>.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Specifies the url parameter array for usage/exclusion. 
     * @return Value Specifies the url parameter array for usage/exclusion.
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set Specifies the url parameter array for usage/exclusion.
     * @param Value Specifies the url parameter array for usage/exclusion.
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

