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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeInfo extends AbstractModel {

    /**
    * Node name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Availability zone of the node
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Node subnet ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Number of available IPs
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("AvailableIpCount")
    @Expose
    private String AvailableIpCount;

    /**
    * CIDR block
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
     * Get Node name 
     * @return Name Node name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Node name
     * @param Name Node name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Availability zone of the node
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Zone Availability zone of the node
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone of the node
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Zone Availability zone of the node
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Node subnet ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return SubnetId Node subnet ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Node subnet ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param SubnetId Node subnet ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Number of available IPs
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return AvailableIpCount Number of available IPs
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAvailableIpCount() {
        return this.AvailableIpCount;
    }

    /**
     * Set Number of available IPs
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param AvailableIpCount Number of available IPs
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAvailableIpCount(String AvailableIpCount) {
        this.AvailableIpCount = AvailableIpCount;
    }

    /**
     * Get CIDR block
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Cidr CIDR block
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * Set CIDR block
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Cidr CIDR block
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCidr(String Cidr) {
        this.Cidr = Cidr;
    }

    public NodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeInfo(NodeInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.AvailableIpCount != null) {
            this.AvailableIpCount = new String(source.AvailableIpCount);
        }
        if (source.Cidr != null) {
            this.Cidr = new String(source.Cidr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "AvailableIpCount", this.AvailableIpCount);
        this.setParamSimple(map, prefix + "Cidr", this.Cidr);

    }
}

