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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenWafProtectionRequest extends AbstractModel {

    /**
    * Gateway ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Type of protection resource.
-Global instance
-Service
-Route
-Object (not currently supported)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * When resource type Type is Service or Route, list of passed in services or routes
    */
    @SerializedName("List")
    @Expose
    private String [] List;

    /**
     * Get Gateway ID 
     * @return GatewayId Gateway ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway ID
     * @param GatewayId Gateway ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Type of protection resource.
-Global instance
-Service
-Route
-Object (not currently supported) 
     * @return Type Type of protection resource.
-Global instance
-Service
-Route
-Object (not currently supported)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of protection resource.
-Global instance
-Service
-Route
-Object (not currently supported)
     * @param Type Type of protection resource.
-Global instance
-Service
-Route
-Object (not currently supported)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get When resource type Type is Service or Route, list of passed in services or routes 
     * @return List When resource type Type is Service or Route, list of passed in services or routes
     */
    public String [] getList() {
        return this.List;
    }

    /**
     * Set When resource type Type is Service or Route, list of passed in services or routes
     * @param List When resource type Type is Service or Route, list of passed in services or routes
     */
    public void setList(String [] List) {
        this.List = List;
    }

    public OpenWafProtectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenWafProtectionRequest(OpenWafProtectionRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.List != null) {
            this.List = new String[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new String(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "List.", this.List);

    }
}

