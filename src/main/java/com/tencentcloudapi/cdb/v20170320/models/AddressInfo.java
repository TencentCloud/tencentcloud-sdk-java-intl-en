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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddressInfo extends AbstractModel {

    /**
    * Resource ID identifier of the address.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * The vpc where the address resides.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * The subnet where the address resides.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * vip address.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * The port of the address.
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * Public network address domain name.
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * Public network address port.
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
     * Get Resource ID identifier of the address. 
     * @return ResourceId Resource ID identifier of the address.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID identifier of the address.
     * @param ResourceId Resource ID identifier of the address.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get The vpc where the address resides. 
     * @return UniqVpcId The vpc where the address resides.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set The vpc where the address resides.
     * @param UniqVpcId The vpc where the address resides.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get The subnet where the address resides. 
     * @return UniqSubnetId The subnet where the address resides.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set The subnet where the address resides.
     * @param UniqSubnetId The subnet where the address resides.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get vip address. 
     * @return Vip vip address.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set vip address.
     * @param Vip vip address.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get The port of the address. 
     * @return VPort The port of the address.
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set The port of the address.
     * @param VPort The port of the address.
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get Public network address domain name. 
     * @return WanDomain Public network address domain name.
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set Public network address domain name.
     * @param WanDomain Public network address domain name.
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get Public network address port. 
     * @return WanPort Public network address port.
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set Public network address port.
     * @param WanPort Public network address port.
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    public AddressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddressInfo(AddressInfo source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);

    }
}

