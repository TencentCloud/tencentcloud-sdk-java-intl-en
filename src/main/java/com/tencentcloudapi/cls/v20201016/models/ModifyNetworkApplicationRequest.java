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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkApplicationRequest extends AbstractModel {

    /**
    * <p>Web application id</p>
    */
    @SerializedName("NetworkAppId")
    @Expose
    private String NetworkAppId;

    /**
    * <p>Network application name: Length not exceeding 64 characters, name must be unique.</p><ul><li>Can only contain the following characters:<ul><li>Letters (a-z and A-Z)</li><li>Numbers</li><li>Underscore</li><li>Hyphen (minus sign)</li><li>Chinese characters</li></ul></li><li>At least one character</li><li>Cannot contain spaces</li><li>Cannot contain other special characters (such as @, #, $, % etc.)</li></ul>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get <p>Web application id</p> 
     * @return NetworkAppId <p>Web application id</p>
     */
    public String getNetworkAppId() {
        return this.NetworkAppId;
    }

    /**
     * Set <p>Web application id</p>
     * @param NetworkAppId <p>Web application id</p>
     */
    public void setNetworkAppId(String NetworkAppId) {
        this.NetworkAppId = NetworkAppId;
    }

    /**
     * Get <p>Network application name: Length not exceeding 64 characters, name must be unique.</p><ul><li>Can only contain the following characters:<ul><li>Letters (a-z and A-Z)</li><li>Numbers</li><li>Underscore</li><li>Hyphen (minus sign)</li><li>Chinese characters</li></ul></li><li>At least one character</li><li>Cannot contain spaces</li><li>Cannot contain other special characters (such as @, #, $, % etc.)</li></ul> 
     * @return Name <p>Network application name: Length not exceeding 64 characters, name must be unique.</p><ul><li>Can only contain the following characters:<ul><li>Letters (a-z and A-Z)</li><li>Numbers</li><li>Underscore</li><li>Hyphen (minus sign)</li><li>Chinese characters</li></ul></li><li>At least one character</li><li>Cannot contain spaces</li><li>Cannot contain other special characters (such as @, #, $, % etc.)</li></ul>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Network application name: Length not exceeding 64 characters, name must be unique.</p><ul><li>Can only contain the following characters:<ul><li>Letters (a-z and A-Z)</li><li>Numbers</li><li>Underscore</li><li>Hyphen (minus sign)</li><li>Chinese characters</li></ul></li><li>At least one character</li><li>Cannot contain spaces</li><li>Cannot contain other special characters (such as @, #, $, % etc.)</li></ul>
     * @param Name <p>Network application name: Length not exceeding 64 characters, name must be unique.</p><ul><li>Can only contain the following characters:<ul><li>Letters (a-z and A-Z)</li><li>Numbers</li><li>Underscore</li><li>Hyphen (minus sign)</li><li>Chinese characters</li></ul></li><li>At least one character</li><li>Cannot contain spaces</li><li>Cannot contain other special characters (such as @, #, $, % etc.)</li></ul>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ModifyNetworkApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkApplicationRequest(ModifyNetworkApplicationRequest source) {
        if (source.NetworkAppId != null) {
            this.NetworkAppId = new String(source.NetworkAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkAppId", this.NetworkAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

