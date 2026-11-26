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

public class HeaderAction extends AbstractModel {

    /**
    * HTTP header setting method. Valid values:
<li>set: Set. Change the value of the specified header parameter to the value after setting;</li>
<li>del: delete. Delete the specified header parameter;</li>
<li>add: Add. Add the specified header parameter.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * HTTP header name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * HTTP header value. This parameter is required when Action is set or add, and not required when Action is del.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get HTTP header setting method. Valid values:
<li>set: Set. Change the value of the specified header parameter to the value after setting;</li>
<li>del: delete. Delete the specified header parameter;</li>
<li>add: Add. Add the specified header parameter.</li> 
     * @return Action HTTP header setting method. Valid values:
<li>set: Set. Change the value of the specified header parameter to the value after setting;</li>
<li>del: delete. Delete the specified header parameter;</li>
<li>add: Add. Add the specified header parameter.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set HTTP header setting method. Valid values:
<li>set: Set. Change the value of the specified header parameter to the value after setting;</li>
<li>del: delete. Delete the specified header parameter;</li>
<li>add: Add. Add the specified header parameter.</li>
     * @param Action HTTP header setting method. Valid values:
<li>set: Set. Change the value of the specified header parameter to the value after setting;</li>
<li>del: delete. Delete the specified header parameter;</li>
<li>add: Add. Add the specified header parameter.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get HTTP header name. 
     * @return Name HTTP header name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set HTTP header name.
     * @param Name HTTP header name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get HTTP header value. This parameter is required when Action is set or add, and not required when Action is del. 
     * @return Value HTTP header value. This parameter is required when Action is set or add, and not required when Action is del.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set HTTP header value. This parameter is required when Action is set or add, and not required when Action is del.
     * @param Value HTTP header value. This parameter is required when Action is set or add, and not required when Action is del.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public HeaderAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HeaderAction(HeaderAction source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

