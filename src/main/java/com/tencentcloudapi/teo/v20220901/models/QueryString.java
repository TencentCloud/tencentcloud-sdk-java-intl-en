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
    * Specifies how to use query strings in the cache key. Values:
<li>`includeCustom`: `Include partial query strings.</li>
<li>`excludeCustom`: Exclude partial query strings.</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Array of query strings used/excluded
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Specifies how to use query strings in the cache key. Values:
<li>`includeCustom`: `Include partial query strings.</li>
<li>`excludeCustom`: Exclude partial query strings.</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Action Specifies how to use query strings in the cache key. Values:
<li>`includeCustom`: `Include partial query strings.</li>
<li>`excludeCustom`: Exclude partial query strings.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Specifies how to use query strings in the cache key. Values:
<li>`includeCustom`: `Include partial query strings.</li>
<li>`excludeCustom`: Exclude partial query strings.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Action Specifies how to use query strings in the cache key. Values:
<li>`includeCustom`: `Include partial query strings.</li>
<li>`excludeCustom`: Exclude partial query strings.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Array of query strings used/excluded
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value Array of query strings used/excluded
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set Array of query strings used/excluded
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value Array of query strings used/excluded
Note: This field may return null, indicating that no valid values can be obtained.
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

