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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitConfig extends AbstractModel{

    /**
    * Switch
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Rate limit rule
    */
    @SerializedName("UserRules")
    @Expose
    private RateLimitUserRule [] UserRules;

    /**
    * Default template
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("Template")
    @Expose
    private RateLimitTemplate Template;

    /**
    * Client filtering
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Intelligence")
    @Expose
    private RateLimitIntelligence Intelligence;

    /**
     * Get Switch 
     * @return Switch Switch
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch
     * @param Switch Switch
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Rate limit rule 
     * @return UserRules Rate limit rule
     */
    public RateLimitUserRule [] getUserRules() {
        return this.UserRules;
    }

    /**
     * Set Rate limit rule
     * @param UserRules Rate limit rule
     */
    public void setUserRules(RateLimitUserRule [] UserRules) {
        this.UserRules = UserRules;
    }

    /**
     * Get Default template
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return Template Default template
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public RateLimitTemplate getTemplate() {
        return this.Template;
    }

    /**
     * Set Default template
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param Template Default template
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setTemplate(RateLimitTemplate Template) {
        this.Template = Template;
    }

    /**
     * Get Client filtering
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Intelligence Client filtering
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public RateLimitIntelligence getIntelligence() {
        return this.Intelligence;
    }

    /**
     * Set Client filtering
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Intelligence Client filtering
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIntelligence(RateLimitIntelligence Intelligence) {
        this.Intelligence = Intelligence;
    }

    public RateLimitConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitConfig(RateLimitConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.UserRules != null) {
            this.UserRules = new RateLimitUserRule[source.UserRules.length];
            for (int i = 0; i < source.UserRules.length; i++) {
                this.UserRules[i] = new RateLimitUserRule(source.UserRules[i]);
            }
        }
        if (source.Template != null) {
            this.Template = new RateLimitTemplate(source.Template);
        }
        if (source.Intelligence != null) {
            this.Intelligence = new RateLimitIntelligence(source.Intelligence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "UserRules.", this.UserRules);
        this.setParamObj(map, prefix + "Template.", this.Template);
        this.setParamObj(map, prefix + "Intelligence.", this.Intelligence);

    }
}

