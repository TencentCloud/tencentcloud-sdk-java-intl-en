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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AclConfig extends AbstractModel {

    /**
    * Switch
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * ACL user rule
    */
    @SerializedName("UserRules")
    @Expose
    private ACLUserRule [] UserRules;

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
     * Get ACL user rule 
     * @return UserRules ACL user rule
     */
    public ACLUserRule [] getUserRules() {
        return this.UserRules;
    }

    /**
     * Set ACL user rule
     * @param UserRules ACL user rule
     */
    public void setUserRules(ACLUserRule [] UserRules) {
        this.UserRules = UserRules;
    }

    public AclConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclConfig(AclConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.UserRules != null) {
            this.UserRules = new ACLUserRule[source.UserRules.length];
            for (int i = 0; i < source.UserRules.length; i++) {
                this.UserRules[i] = new ACLUserRule(source.UserRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "UserRules.", this.UserRules);

    }
}

