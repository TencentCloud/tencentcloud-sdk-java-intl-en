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

public class UpstreamRequestCookie extends AbstractModel {

    /**
    * Cookie configuration switch for origin-pull request parameters. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Cookie mode for origin-pull requests. This parameter is required when Switch is on. Valid values:
<li>full: retain all;</li>
<li>ignore: ignore all;</li>
<li>includeCustom: means to reserve some parameters;</li>
<li>excludeCustom: means to ignore some parameters.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Specified parameter values. This parameter takes effect only when the query string mode Action is includeCustom or excludeCustom, and is used to specify the parameters to keep or ignore. Supports up to 10 parameters.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Cookie configuration switch for origin-pull request parameters. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch Cookie configuration switch for origin-pull request parameters. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Cookie configuration switch for origin-pull request parameters. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch Cookie configuration switch for origin-pull request parameters. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Cookie mode for origin-pull requests. This parameter is required when Switch is on. Valid values:
<li>full: retain all;</li>
<li>ignore: ignore all;</li>
<li>includeCustom: means to reserve some parameters;</li>
<li>excludeCustom: means to ignore some parameters.</li> 
     * @return Action Cookie mode for origin-pull requests. This parameter is required when Switch is on. Valid values:
<li>full: retain all;</li>
<li>ignore: ignore all;</li>
<li>includeCustom: means to reserve some parameters;</li>
<li>excludeCustom: means to ignore some parameters.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Cookie mode for origin-pull requests. This parameter is required when Switch is on. Valid values:
<li>full: retain all;</li>
<li>ignore: ignore all;</li>
<li>includeCustom: means to reserve some parameters;</li>
<li>excludeCustom: means to ignore some parameters.</li>
     * @param Action Cookie mode for origin-pull requests. This parameter is required when Switch is on. Valid values:
<li>full: retain all;</li>
<li>ignore: ignore all;</li>
<li>includeCustom: means to reserve some parameters;</li>
<li>excludeCustom: means to ignore some parameters.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Specified parameter values. This parameter takes effect only when the query string mode Action is includeCustom or excludeCustom, and is used to specify the parameters to keep or ignore. Supports up to 10 parameters. 
     * @return Values Specified parameter values. This parameter takes effect only when the query string mode Action is includeCustom or excludeCustom, and is used to specify the parameters to keep or ignore. Supports up to 10 parameters.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Specified parameter values. This parameter takes effect only when the query string mode Action is includeCustom or excludeCustom, and is used to specify the parameters to keep or ignore. Supports up to 10 parameters.
     * @param Values Specified parameter values. This parameter takes effect only when the query string mode Action is includeCustom or excludeCustom, and is used to specify the parameters to keep or ignore. Supports up to 10 parameters.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public UpstreamRequestCookie() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamRequestCookie(UpstreamRequestCookie source) {
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

