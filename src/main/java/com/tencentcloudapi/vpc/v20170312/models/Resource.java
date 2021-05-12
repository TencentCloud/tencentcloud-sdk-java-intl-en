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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resource extends AbstractModel{

    /**
    * The bandwidth package resource type, including `Address`, and `LoadBalance`
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * The bandwidth package ID, such as `eip-xxxx` and `lb-xxxx`.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * The bandwidth package resource IP.
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
     * Get The bandwidth package resource type, including `Address`, and `LoadBalance` 
     * @return ResourceType The bandwidth package resource type, including `Address`, and `LoadBalance`
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set The bandwidth package resource type, including `Address`, and `LoadBalance`
     * @param ResourceType The bandwidth package resource type, including `Address`, and `LoadBalance`
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get The bandwidth package ID, such as `eip-xxxx` and `lb-xxxx`. 
     * @return ResourceId The bandwidth package ID, such as `eip-xxxx` and `lb-xxxx`.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set The bandwidth package ID, such as `eip-xxxx` and `lb-xxxx`.
     * @param ResourceId The bandwidth package ID, such as `eip-xxxx` and `lb-xxxx`.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get The bandwidth package resource IP. 
     * @return AddressIp The bandwidth package resource IP.
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set The bandwidth package resource IP.
     * @param AddressIp The bandwidth package resource IP.
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    public Resource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resource(Resource source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AddressIp != null) {
            this.AddressIp = new String(source.AddressIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AddressIp", this.AddressIp);

    }
}

