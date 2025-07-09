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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrganizationIdentityRequest extends AbstractModel {

    /**
    * Identity name.
    */
    @SerializedName("IdentityAliasName")
    @Expose
    private String IdentityAliasName;

    /**
    * Identity policy.
    */
    @SerializedName("IdentityPolicy")
    @Expose
    private IdentityPolicy [] IdentityPolicy;

    /**
    * Identity description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Identity name. 
     * @return IdentityAliasName Identity name.
     */
    public String getIdentityAliasName() {
        return this.IdentityAliasName;
    }

    /**
     * Set Identity name.
     * @param IdentityAliasName Identity name.
     */
    public void setIdentityAliasName(String IdentityAliasName) {
        this.IdentityAliasName = IdentityAliasName;
    }

    /**
     * Get Identity policy. 
     * @return IdentityPolicy Identity policy.
     */
    public IdentityPolicy [] getIdentityPolicy() {
        return this.IdentityPolicy;
    }

    /**
     * Set Identity policy.
     * @param IdentityPolicy Identity policy.
     */
    public void setIdentityPolicy(IdentityPolicy [] IdentityPolicy) {
        this.IdentityPolicy = IdentityPolicy;
    }

    /**
     * Get Identity description. 
     * @return Description Identity description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Identity description.
     * @param Description Identity description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateOrganizationIdentityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationIdentityRequest(CreateOrganizationIdentityRequest source) {
        if (source.IdentityAliasName != null) {
            this.IdentityAliasName = new String(source.IdentityAliasName);
        }
        if (source.IdentityPolicy != null) {
            this.IdentityPolicy = new IdentityPolicy[source.IdentityPolicy.length];
            for (int i = 0; i < source.IdentityPolicy.length; i++) {
                this.IdentityPolicy[i] = new IdentityPolicy(source.IdentityPolicy[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityAliasName", this.IdentityAliasName);
        this.setParamArrayObj(map, prefix + "IdentityPolicy.", this.IdentityPolicy);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

