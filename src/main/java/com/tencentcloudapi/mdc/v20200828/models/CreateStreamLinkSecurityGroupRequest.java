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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStreamLinkSecurityGroupRequest extends AbstractModel {

    /**
    * <p>Security group name, supporting letters, digits, and underscores, unique within a Region.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Allowlist, maximum number: 10.</p>
    */
    @SerializedName("Whitelist")
    @Expose
    private String [] Whitelist;

    /**
     * Get <p>Security group name, supporting letters, digits, and underscores, unique within a Region.</p> 
     * @return Name <p>Security group name, supporting letters, digits, and underscores, unique within a Region.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Security group name, supporting letters, digits, and underscores, unique within a Region.</p>
     * @param Name <p>Security group name, supporting letters, digits, and underscores, unique within a Region.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Allowlist, maximum number: 10.</p> 
     * @return Whitelist <p>Allowlist, maximum number: 10.</p>
     */
    public String [] getWhitelist() {
        return this.Whitelist;
    }

    /**
     * Set <p>Allowlist, maximum number: 10.</p>
     * @param Whitelist <p>Allowlist, maximum number: 10.</p>
     */
    public void setWhitelist(String [] Whitelist) {
        this.Whitelist = Whitelist;
    }

    public CreateStreamLinkSecurityGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamLinkSecurityGroupRequest(CreateStreamLinkSecurityGroupRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Whitelist != null) {
            this.Whitelist = new String[source.Whitelist.length];
            for (int i = 0; i < source.Whitelist.length; i++) {
                this.Whitelist[i] = new String(source.Whitelist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Whitelist.", this.Whitelist);

    }
}

