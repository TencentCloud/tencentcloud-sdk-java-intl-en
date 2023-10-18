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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubnetAttributeRequest extends AbstractModel {

    /**
    * Subnet instance ID, such as `subnet-pxir56ns`.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * ECM region
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * Subnet name, which can contain up to 60 bytes.
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * Whether to enable broadcast for the subnet.
    */
    @SerializedName("EnableBroadcast")
    @Expose
    private String EnableBroadcast;

    /**
    * Tag key value of the subnet
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Subnet instance ID, such as `subnet-pxir56ns`. 
     * @return SubnetId Subnet instance ID, such as `subnet-pxir56ns`.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet instance ID, such as `subnet-pxir56ns`.
     * @param SubnetId Subnet instance ID, such as `subnet-pxir56ns`.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get ECM region 
     * @return EcmRegion ECM region
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM region
     * @param EcmRegion ECM region
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get Subnet name, which can contain up to 60 bytes. 
     * @return SubnetName Subnet name, which can contain up to 60 bytes.
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set Subnet name, which can contain up to 60 bytes.
     * @param SubnetName Subnet name, which can contain up to 60 bytes.
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get Whether to enable broadcast for the subnet. 
     * @return EnableBroadcast Whether to enable broadcast for the subnet.
     */
    public String getEnableBroadcast() {
        return this.EnableBroadcast;
    }

    /**
     * Set Whether to enable broadcast for the subnet.
     * @param EnableBroadcast Whether to enable broadcast for the subnet.
     */
    public void setEnableBroadcast(String EnableBroadcast) {
        this.EnableBroadcast = EnableBroadcast;
    }

    /**
     * Get Tag key value of the subnet 
     * @return Tags Tag key value of the subnet
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag key value of the subnet
     * @param Tags Tag key value of the subnet
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public ModifySubnetAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySubnetAttributeRequest(ModifySubnetAttributeRequest source) {
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.EnableBroadcast != null) {
            this.EnableBroadcast = new String(source.EnableBroadcast);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "EnableBroadcast", this.EnableBroadcast);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

