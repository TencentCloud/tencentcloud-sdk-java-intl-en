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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceInfo extends AbstractModel{

    /**
    * App ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * Region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC name
    */
    @SerializedName("VPCName")
    @Expose
    private String VPCName;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Asset ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Asset name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Asset type
 3: CVM instance; 4: CLB instance; 5: ENI instance; 6: MySQL; 7: Redis; 8: NAT; 9: VPN; 10: ES; 11: MariaDB; 12: Kafka; 13: NATFW
    */
    @SerializedName("InsType")
    @Expose
    private Long InsType;

    /**
    * Public IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Private IP
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Number of ports
    */
    @SerializedName("PortNum")
    @Expose
    private String PortNum;

    /**
    * Number of vulnerabilities
    */
    @SerializedName("LeakNum")
    @Expose
    private String LeakNum;

    /**
    * 1: public network; 2: private network
    */
    @SerializedName("InsSource")
    @Expose
    private String InsSource;

    /**
    * [a,b]
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ResourcePath")
    @Expose
    private String [] ResourcePath;

    /**
     * Get App ID 
     * @return AppId App ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set App ID
     * @param AppId App ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Region 
     * @return Region Region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
     * @param Region Region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC name 
     * @return VPCName VPC name
     */
    public String getVPCName() {
        return this.VPCName;
    }

    /**
     * Set VPC name
     * @param VPCName VPC name
     */
    public void setVPCName(String VPCName) {
        this.VPCName = VPCName;
    }

    /**
     * Get Subnet ID 
     * @return SubnetId Subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID
     * @param SubnetId Subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Asset ID 
     * @return InstanceId Asset ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Asset ID
     * @param InstanceId Asset ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Asset name 
     * @return InstanceName Asset name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Asset name
     * @param InstanceName Asset name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Asset type
 3: CVM instance; 4: CLB instance; 5: ENI instance; 6: MySQL; 7: Redis; 8: NAT; 9: VPN; 10: ES; 11: MariaDB; 12: Kafka; 13: NATFW 
     * @return InsType Asset type
 3: CVM instance; 4: CLB instance; 5: ENI instance; 6: MySQL; 7: Redis; 8: NAT; 9: VPN; 10: ES; 11: MariaDB; 12: Kafka; 13: NATFW
     */
    public Long getInsType() {
        return this.InsType;
    }

    /**
     * Set Asset type
 3: CVM instance; 4: CLB instance; 5: ENI instance; 6: MySQL; 7: Redis; 8: NAT; 9: VPN; 10: ES; 11: MariaDB; 12: Kafka; 13: NATFW
     * @param InsType Asset type
 3: CVM instance; 4: CLB instance; 5: ENI instance; 6: MySQL; 7: Redis; 8: NAT; 9: VPN; 10: ES; 11: MariaDB; 12: Kafka; 13: NATFW
     */
    public void setInsType(Long InsType) {
        this.InsType = InsType;
    }

    /**
     * Get Public IP 
     * @return PublicIp Public IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP
     * @param PublicIp Public IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Private IP 
     * @return PrivateIp Private IP
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private IP
     * @param PrivateIp Private IP
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get Number of ports 
     * @return PortNum Number of ports
     */
    public String getPortNum() {
        return this.PortNum;
    }

    /**
     * Set Number of ports
     * @param PortNum Number of ports
     */
    public void setPortNum(String PortNum) {
        this.PortNum = PortNum;
    }

    /**
     * Get Number of vulnerabilities 
     * @return LeakNum Number of vulnerabilities
     */
    public String getLeakNum() {
        return this.LeakNum;
    }

    /**
     * Set Number of vulnerabilities
     * @param LeakNum Number of vulnerabilities
     */
    public void setLeakNum(String LeakNum) {
        this.LeakNum = LeakNum;
    }

    /**
     * Get 1: public network; 2: private network 
     * @return InsSource 1: public network; 2: private network
     */
    public String getInsSource() {
        return this.InsSource;
    }

    /**
     * Set 1: public network; 2: private network
     * @param InsSource 1: public network; 2: private network
     */
    public void setInsSource(String InsSource) {
        this.InsSource = InsSource;
    }

    /**
     * Get [a,b]
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ResourcePath [a,b]
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String [] getResourcePath() {
        return this.ResourcePath;
    }

    /**
     * Set [a,b]
Note: This field may return `null`, indicating that no valid value was found.
     * @param ResourcePath [a,b]
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setResourcePath(String [] ResourcePath) {
        this.ResourcePath = ResourcePath;
    }

    public InstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceInfo(InstanceInfo source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VPCName != null) {
            this.VPCName = new String(source.VPCName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InsType != null) {
            this.InsType = new Long(source.InsType);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.PortNum != null) {
            this.PortNum = new String(source.PortNum);
        }
        if (source.LeakNum != null) {
            this.LeakNum = new String(source.LeakNum);
        }
        if (source.InsSource != null) {
            this.InsSource = new String(source.InsSource);
        }
        if (source.ResourcePath != null) {
            this.ResourcePath = new String[source.ResourcePath.length];
            for (int i = 0; i < source.ResourcePath.length; i++) {
                this.ResourcePath[i] = new String(source.ResourcePath[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VPCName", this.VPCName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InsType", this.InsType);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "PortNum", this.PortNum);
        this.setParamSimple(map, prefix + "LeakNum", this.LeakNum);
        this.setParamSimple(map, prefix + "InsSource", this.InsSource);
        this.setParamArraySimple(map, prefix + "ResourcePath.", this.ResourcePath);

    }
}

