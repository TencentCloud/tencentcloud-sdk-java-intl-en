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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceNetworkAddressRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Old IP retention period in minutes. The old IP will be released after the specified time, and both the old and new IPs can be accessed before the release. The value `0` indicates that the old IP will be reclaimed immediately.
    */
    @SerializedName("OldIpExpiredTime")
    @Expose
    private Long OldIpExpiredTime;

    /**
    * ID of the VPC to which the new IP belongs after the switch. When it is classic network, this field will be empty.
    */
    @SerializedName("NewUniqVpcId")
    @Expose
    private String NewUniqVpcId;

    /**
    * ID of the subnet to which the new IP belongs after the switch. When it is classic network, this field will be empty.
    */
    @SerializedName("NewUniqSubnetId")
    @Expose
    private String NewUniqSubnetId;

    /**
    * IP information to be modified
    */
    @SerializedName("NetworkAddresses")
    @Expose
    private ModifyNetworkAddress [] NetworkAddresses;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Old IP retention period in minutes. The old IP will be released after the specified time, and both the old and new IPs can be accessed before the release. The value `0` indicates that the old IP will be reclaimed immediately. 
     * @return OldIpExpiredTime Old IP retention period in minutes. The old IP will be released after the specified time, and both the old and new IPs can be accessed before the release. The value `0` indicates that the old IP will be reclaimed immediately.
     */
    public Long getOldIpExpiredTime() {
        return this.OldIpExpiredTime;
    }

    /**
     * Set Old IP retention period in minutes. The old IP will be released after the specified time, and both the old and new IPs can be accessed before the release. The value `0` indicates that the old IP will be reclaimed immediately.
     * @param OldIpExpiredTime Old IP retention period in minutes. The old IP will be released after the specified time, and both the old and new IPs can be accessed before the release. The value `0` indicates that the old IP will be reclaimed immediately.
     */
    public void setOldIpExpiredTime(Long OldIpExpiredTime) {
        this.OldIpExpiredTime = OldIpExpiredTime;
    }

    /**
     * Get ID of the VPC to which the new IP belongs after the switch. When it is classic network, this field will be empty. 
     * @return NewUniqVpcId ID of the VPC to which the new IP belongs after the switch. When it is classic network, this field will be empty.
     */
    public String getNewUniqVpcId() {
        return this.NewUniqVpcId;
    }

    /**
     * Set ID of the VPC to which the new IP belongs after the switch. When it is classic network, this field will be empty.
     * @param NewUniqVpcId ID of the VPC to which the new IP belongs after the switch. When it is classic network, this field will be empty.
     */
    public void setNewUniqVpcId(String NewUniqVpcId) {
        this.NewUniqVpcId = NewUniqVpcId;
    }

    /**
     * Get ID of the subnet to which the new IP belongs after the switch. When it is classic network, this field will be empty. 
     * @return NewUniqSubnetId ID of the subnet to which the new IP belongs after the switch. When it is classic network, this field will be empty.
     */
    public String getNewUniqSubnetId() {
        return this.NewUniqSubnetId;
    }

    /**
     * Set ID of the subnet to which the new IP belongs after the switch. When it is classic network, this field will be empty.
     * @param NewUniqSubnetId ID of the subnet to which the new IP belongs after the switch. When it is classic network, this field will be empty.
     */
    public void setNewUniqSubnetId(String NewUniqSubnetId) {
        this.NewUniqSubnetId = NewUniqSubnetId;
    }

    /**
     * Get IP information to be modified 
     * @return NetworkAddresses IP information to be modified
     */
    public ModifyNetworkAddress [] getNetworkAddresses() {
        return this.NetworkAddresses;
    }

    /**
     * Set IP information to be modified
     * @param NetworkAddresses IP information to be modified
     */
    public void setNetworkAddresses(ModifyNetworkAddress [] NetworkAddresses) {
        this.NetworkAddresses = NetworkAddresses;
    }

    public ModifyDBInstanceNetworkAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceNetworkAddressRequest(ModifyDBInstanceNetworkAddressRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OldIpExpiredTime != null) {
            this.OldIpExpiredTime = new Long(source.OldIpExpiredTime);
        }
        if (source.NewUniqVpcId != null) {
            this.NewUniqVpcId = new String(source.NewUniqVpcId);
        }
        if (source.NewUniqSubnetId != null) {
            this.NewUniqSubnetId = new String(source.NewUniqSubnetId);
        }
        if (source.NetworkAddresses != null) {
            this.NetworkAddresses = new ModifyNetworkAddress[source.NetworkAddresses.length];
            for (int i = 0; i < source.NetworkAddresses.length; i++) {
                this.NetworkAddresses[i] = new ModifyNetworkAddress(source.NetworkAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OldIpExpiredTime", this.OldIpExpiredTime);
        this.setParamSimple(map, prefix + "NewUniqVpcId", this.NewUniqVpcId);
        this.setParamSimple(map, prefix + "NewUniqSubnetId", this.NewUniqSubnetId);
        this.setParamArrayObj(map, prefix + "NetworkAddresses.", this.NetworkAddresses);

    }
}

