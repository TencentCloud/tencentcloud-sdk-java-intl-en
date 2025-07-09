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

public class CacheKeyCookie extends AbstractModel {

    /**
    * Whether to enable feature. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Cache action. values:.
<Li>`Full`: retain all</li>.
<Li> `ignore`: ignore all;</li>.
<Li> `includecustom`: retain specified parameters;</li>.
<Li> `excludecustom`: ignore specified parameters.</li> **note**: when `switch` is on, this field is required. when `switch` is off, this field is not required and will not take effect if filled.
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Custom cache key cookie name list.<br>note: this field is required when action is includecustom or excludecustom; when action is full or ignore, this field is not required and will not take effect if filled.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Whether to enable feature. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>. 
     * @return Switch Whether to enable feature. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable feature. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     * @param Switch Whether to enable feature. values:.
<Li>`On`: enable;</li>
.
<Li>Off: disable.</li>.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Cache action. values:.
<Li>`Full`: retain all</li>.
<Li> `ignore`: ignore all;</li>.
<Li> `includecustom`: retain specified parameters;</li>.
<Li> `excludecustom`: ignore specified parameters.</li> **note**: when `switch` is on, this field is required. when `switch` is off, this field is not required and will not take effect if filled. 
     * @return Action Cache action. values:.
<Li>`Full`: retain all</li>.
<Li> `ignore`: ignore all;</li>.
<Li> `includecustom`: retain specified parameters;</li>.
<Li> `excludecustom`: ignore specified parameters.</li> **note**: when `switch` is on, this field is required. when `switch` is off, this field is not required and will not take effect if filled.
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Cache action. values:.
<Li>`Full`: retain all</li>.
<Li> `ignore`: ignore all;</li>.
<Li> `includecustom`: retain specified parameters;</li>.
<Li> `excludecustom`: ignore specified parameters.</li> **note**: when `switch` is on, this field is required. when `switch` is off, this field is not required and will not take effect if filled.
     * @param Action Cache action. values:.
<Li>`Full`: retain all</li>.
<Li> `ignore`: ignore all;</li>.
<Li> `includecustom`: retain specified parameters;</li>.
<Li> `excludecustom`: ignore specified parameters.</li> **note**: when `switch` is on, this field is required. when `switch` is off, this field is not required and will not take effect if filled.
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Custom cache key cookie name list.<br>note: this field is required when action is includecustom or excludecustom; when action is full or ignore, this field is not required and will not take effect if filled. 
     * @return Values Custom cache key cookie name list.<br>note: this field is required when action is includecustom or excludecustom; when action is full or ignore, this field is not required and will not take effect if filled.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Custom cache key cookie name list.<br>note: this field is required when action is includecustom or excludecustom; when action is full or ignore, this field is not required and will not take effect if filled.
     * @param Values Custom cache key cookie name list.<br>note: this field is required when action is includecustom or excludecustom; when action is full or ignore, this field is not required and will not take effect if filled.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public CacheKeyCookie() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheKeyCookie(CacheKeyCookie source) {
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

