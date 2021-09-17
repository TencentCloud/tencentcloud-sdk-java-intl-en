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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccessRulesRequest extends AbstractModel{

    /**
    * Multiple permission rules (up to 10)
    */
    @SerializedName("AccessRules")
    @Expose
    private AccessRule [] AccessRules;

    /**
    * Permission group ID
    */
    @SerializedName("AccessGroupId")
    @Expose
    private String AccessGroupId;

    /**
     * Get Multiple permission rules (up to 10) 
     * @return AccessRules Multiple permission rules (up to 10)
     */
    public AccessRule [] getAccessRules() {
        return this.AccessRules;
    }

    /**
     * Set Multiple permission rules (up to 10)
     * @param AccessRules Multiple permission rules (up to 10)
     */
    public void setAccessRules(AccessRule [] AccessRules) {
        this.AccessRules = AccessRules;
    }

    /**
     * Get Permission group ID 
     * @return AccessGroupId Permission group ID
     */
    public String getAccessGroupId() {
        return this.AccessGroupId;
    }

    /**
     * Set Permission group ID
     * @param AccessGroupId Permission group ID
     */
    public void setAccessGroupId(String AccessGroupId) {
        this.AccessGroupId = AccessGroupId;
    }

    public CreateAccessRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccessRulesRequest(CreateAccessRulesRequest source) {
        if (source.AccessRules != null) {
            this.AccessRules = new AccessRule[source.AccessRules.length];
            for (int i = 0; i < source.AccessRules.length; i++) {
                this.AccessRules[i] = new AccessRule(source.AccessRules[i]);
            }
        }
        if (source.AccessGroupId != null) {
            this.AccessGroupId = new String(source.AccessGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AccessRules.", this.AccessRules);
        this.setParamSimple(map, prefix + "AccessGroupId", this.AccessGroupId);

    }
}

