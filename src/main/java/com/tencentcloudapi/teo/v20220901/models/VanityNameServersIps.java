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

public class VanityNameServersIps extends AbstractModel {

    /**
    * Custom name of the name server
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * IPv4 address of the custom name server
    */
    @SerializedName("IPv4")
    @Expose
    private String IPv4;

    /**
     * Get Custom name of the name server 
     * @return Name Custom name of the name server
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Custom name of the name server
     * @param Name Custom name of the name server
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get IPv4 address of the custom name server 
     * @return IPv4 IPv4 address of the custom name server
     */
    public String getIPv4() {
        return this.IPv4;
    }

    /**
     * Set IPv4 address of the custom name server
     * @param IPv4 IPv4 address of the custom name server
     */
    public void setIPv4(String IPv4) {
        this.IPv4 = IPv4;
    }

    public VanityNameServersIps() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VanityNameServersIps(VanityNameServersIps source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IPv4 != null) {
            this.IPv4 = new String(source.IPv4);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IPv4", this.IPv4);

    }
}

