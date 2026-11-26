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

public class UpstreamRequestQueryString extends AbstractModel {

    /**
    * Configuration switch for the origin-pull request parameter query string. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Query string mode. This parameter is required when Switch is on. Valid values:
<li>full: retain all;</li>
<li>ignore: Ignore all;</li>
<li>includeCustom: reserve some parameters;</li>
<li>excludeCustom: ignore some parameters.</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * Specified parameter values. This parameter takes effect only when the string mode Action is includeCustom or excludeCustom. It is used to specify parameters to keep or ignore. Supports up to 10 parameters.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Configuration switch for the origin-pull request parameter query string. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li> 
     * @return Switch Configuration switch for the origin-pull request parameter query string. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Configuration switch for the origin-pull request parameter query string. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     * @param Switch Configuration switch for the origin-pull request parameter query string. Valid values:
<li>`on`: Enable;</li>
<li>off: Disable.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Query string mode. This parameter is required when Switch is on. Valid values:
<li>full: retain all;</li>
<li>ignore: Ignore all;</li>
<li>includeCustom: reserve some parameters;</li>
<li>excludeCustom: ignore some parameters.</li> 
     * @return Action Query string mode. This parameter is required when Switch is on. Valid values:
<li>full: retain all;</li>
<li>ignore: Ignore all;</li>
<li>includeCustom: reserve some parameters;</li>
<li>excludeCustom: ignore some parameters.</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Query string mode. This parameter is required when Switch is on. Valid values:
<li>full: retain all;</li>
<li>ignore: Ignore all;</li>
<li>includeCustom: reserve some parameters;</li>
<li>excludeCustom: ignore some parameters.</li>
     * @param Action Query string mode. This parameter is required when Switch is on. Valid values:
<li>full: retain all;</li>
<li>ignore: Ignore all;</li>
<li>includeCustom: reserve some parameters;</li>
<li>excludeCustom: ignore some parameters.</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get Specified parameter values. This parameter takes effect only when the string mode Action is includeCustom or excludeCustom. It is used to specify parameters to keep or ignore. Supports up to 10 parameters. 
     * @return Values Specified parameter values. This parameter takes effect only when the string mode Action is includeCustom or excludeCustom. It is used to specify parameters to keep or ignore. Supports up to 10 parameters.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Specified parameter values. This parameter takes effect only when the string mode Action is includeCustom or excludeCustom. It is used to specify parameters to keep or ignore. Supports up to 10 parameters.
     * @param Values Specified parameter values. This parameter takes effect only when the string mode Action is includeCustom or excludeCustom. It is used to specify parameters to keep or ignore. Supports up to 10 parameters.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public UpstreamRequestQueryString() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamRequestQueryString(UpstreamRequestQueryString source) {
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

