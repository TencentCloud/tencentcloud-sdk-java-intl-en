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

public class ModifyZoneRequest extends AbstractModel{

    /**
    * Site ID, which is used to identify the site.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Specifies how the site is connected to EdgeOne.
- `full`: Connect via the name server.
- `partial`: Connect via the CNAME.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Custom site information
    */
    @SerializedName("VanityNameServers")
    @Expose
    private VanityNameServers VanityNameServers;

    /**
     * Get Site ID, which is used to identify the site. 
     * @return Id Site ID, which is used to identify the site.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Site ID, which is used to identify the site.
     * @param Id Site ID, which is used to identify the site.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Specifies how the site is connected to EdgeOne.
- `full`: Connect via the name server.
- `partial`: Connect via the CNAME. 
     * @return Type Specifies how the site is connected to EdgeOne.
- `full`: Connect via the name server.
- `partial`: Connect via the CNAME.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Specifies how the site is connected to EdgeOne.
- `full`: Connect via the name server.
- `partial`: Connect via the CNAME.
     * @param Type Specifies how the site is connected to EdgeOne.
- `full`: Connect via the name server.
- `partial`: Connect via the CNAME.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Custom site information 
     * @return VanityNameServers Custom site information
     */
    public VanityNameServers getVanityNameServers() {
        return this.VanityNameServers;
    }

    /**
     * Set Custom site information
     * @param VanityNameServers Custom site information
     */
    public void setVanityNameServers(VanityNameServers VanityNameServers) {
        this.VanityNameServers = VanityNameServers;
    }

    public ModifyZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyZoneRequest(ModifyZoneRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.VanityNameServers != null) {
            this.VanityNameServers = new VanityNameServers(source.VanityNameServers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "VanityNameServers.", this.VanityNameServers);

    }
}

