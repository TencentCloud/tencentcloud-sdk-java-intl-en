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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Address extends AbstractModel{

    /**
    * Address
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Port
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * VPC ID
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * VPC subnet ID
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("UniqSubnet")
    @Expose
    private String UniqSubnet;

    /**
    * Description
Note: this field may return `null`, indicating that no valid value can be found.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get Address
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Vip Address
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Address
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Vip Address
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Port
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return VPort Port
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set Port
Note: this field may return `null`, indicating that no valid value can be found.
     * @param VPort Port
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get VPC ID
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return UniqVpcId VPC ID
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID
Note: this field may return `null`, indicating that no valid value can be found.
     * @param UniqVpcId VPC ID
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get VPC subnet ID
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return UniqSubnet VPC subnet ID
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getUniqSubnet() {
        return this.UniqSubnet;
    }

    /**
     * Set VPC subnet ID
Note: this field may return `null`, indicating that no valid value can be found.
     * @param UniqSubnet VPC subnet ID
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setUniqSubnet(String UniqSubnet) {
        this.UniqSubnet = UniqSubnet;
    }

    /**
     * Get Description
Note: this field may return `null`, indicating that no valid value can be found. 
     * @return Desc Description
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description
Note: this field may return `null`, indicating that no valid value can be found.
     * @param Desc Description
Note: this field may return `null`, indicating that no valid value can be found.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public Address() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Address(Address source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnet != null) {
            this.UniqSubnet = new String(source.UniqSubnet);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnet", this.UniqSubnet);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

