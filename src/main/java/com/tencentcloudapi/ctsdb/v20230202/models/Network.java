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
package com.tencentcloudapi.ctsdb.v20230202.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Network extends AbstractModel {

    /**
    * vpc id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc subnet id
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * VPC IP address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VIP")
    @Expose
    private String VIP;

    /**
    * VPC port address.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get vpc id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId vpc id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId vpc id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc subnet id
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubnetId vpc subnet id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set vpc subnet id
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubnetId vpc subnet id
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get VPC IP address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VIP VPC IP address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVIP() {
        return this.VIP;
    }

    /**
     * Set VPC IP address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VIP VPC IP address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVIP(String VIP) {
        this.VIP = VIP;
    }

    /**
     * Get VPC port address.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Port VPC port address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set VPC port address.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Port VPC port address.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public Network() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Network(Network source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VIP != null) {
            this.VIP = new String(source.VIP);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VIP", this.VIP);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

