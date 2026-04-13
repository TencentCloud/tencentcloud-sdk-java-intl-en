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

public class DefaultDenySecurityActionParameters extends AbstractModel {

    /**
    * The managed rule uses the default disposition action configuration. DenyActionParameters supported configuration parameters: <li>ReturnCustomPage: Whether to use a custom page.</li><li>ResponseCode: Status code of the custom page.</li><li>ErrorPageId: PageId of the custom page.</li>
    */
    @SerializedName("ManagedRules")
    @Expose
    private DenyActionParameters ManagedRules;

    /**
    * Security protection rules other than managed rules (custom rule, rate limit, and Bot management function) default to disposition action configuration. DenyActionParameters supported configuration parameters: <li>ReturnCustomPage: Whether to use custom page.</li> <li>ResponseCode: Status code of custom pages.</li> <li>ErrorPageId: PageId of custom pages.</li>
    */
    @SerializedName("OtherModules")
    @Expose
    private DenyActionParameters OtherModules;

    /**
     * Get The managed rule uses the default disposition action configuration. DenyActionParameters supported configuration parameters: <li>ReturnCustomPage: Whether to use a custom page.</li><li>ResponseCode: Status code of the custom page.</li><li>ErrorPageId: PageId of the custom page.</li> 
     * @return ManagedRules The managed rule uses the default disposition action configuration. DenyActionParameters supported configuration parameters: <li>ReturnCustomPage: Whether to use a custom page.</li><li>ResponseCode: Status code of the custom page.</li><li>ErrorPageId: PageId of the custom page.</li>
     */
    public DenyActionParameters getManagedRules() {
        return this.ManagedRules;
    }

    /**
     * Set The managed rule uses the default disposition action configuration. DenyActionParameters supported configuration parameters: <li>ReturnCustomPage: Whether to use a custom page.</li><li>ResponseCode: Status code of the custom page.</li><li>ErrorPageId: PageId of the custom page.</li>
     * @param ManagedRules The managed rule uses the default disposition action configuration. DenyActionParameters supported configuration parameters: <li>ReturnCustomPage: Whether to use a custom page.</li><li>ResponseCode: Status code of the custom page.</li><li>ErrorPageId: PageId of the custom page.</li>
     */
    public void setManagedRules(DenyActionParameters ManagedRules) {
        this.ManagedRules = ManagedRules;
    }

    /**
     * Get Security protection rules other than managed rules (custom rule, rate limit, and Bot management function) default to disposition action configuration. DenyActionParameters supported configuration parameters: <li>ReturnCustomPage: Whether to use custom page.</li> <li>ResponseCode: Status code of custom pages.</li> <li>ErrorPageId: PageId of custom pages.</li> 
     * @return OtherModules Security protection rules other than managed rules (custom rule, rate limit, and Bot management function) default to disposition action configuration. DenyActionParameters supported configuration parameters: <li>ReturnCustomPage: Whether to use custom page.</li> <li>ResponseCode: Status code of custom pages.</li> <li>ErrorPageId: PageId of custom pages.</li>
     */
    public DenyActionParameters getOtherModules() {
        return this.OtherModules;
    }

    /**
     * Set Security protection rules other than managed rules (custom rule, rate limit, and Bot management function) default to disposition action configuration. DenyActionParameters supported configuration parameters: <li>ReturnCustomPage: Whether to use custom page.</li> <li>ResponseCode: Status code of custom pages.</li> <li>ErrorPageId: PageId of custom pages.</li>
     * @param OtherModules Security protection rules other than managed rules (custom rule, rate limit, and Bot management function) default to disposition action configuration. DenyActionParameters supported configuration parameters: <li>ReturnCustomPage: Whether to use custom page.</li> <li>ResponseCode: Status code of custom pages.</li> <li>ErrorPageId: PageId of custom pages.</li>
     */
    public void setOtherModules(DenyActionParameters OtherModules) {
        this.OtherModules = OtherModules;
    }

    public DefaultDenySecurityActionParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DefaultDenySecurityActionParameters(DefaultDenySecurityActionParameters source) {
        if (source.ManagedRules != null) {
            this.ManagedRules = new DenyActionParameters(source.ManagedRules);
        }
        if (source.OtherModules != null) {
            this.OtherModules = new DenyActionParameters(source.OtherModules);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ManagedRules.", this.ManagedRules);
        this.setParamObj(map, prefix + "OtherModules.", this.OtherModules);

    }
}

