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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CKafkaInstanceInfo extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Version No.
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * Topic list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicList")
    @Expose
    private CKafkaTopicInfo [] TopicList;

    /**
    * Routing List
    */
    @SerializedName("RouteList")
    @Expose
    private CKafkaRouteInfo [] RouteList;

    /**
    * Disk capacity (unit: GB)
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * vpcId. Leaving it blank indicates a basic network.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Status: 1 - healthy; 2 - alarm; 3 - abnormal instance status
    */
    @SerializedName("Healthy")
    @Expose
    private Long Healthy;

    /**
    * Availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Region
    */
    @SerializedName("Az")
    @Expose
    private String Az;

    /**
    * Instance bandwidth (unit: Mbps)
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
     * Get Instance ID 
     * @return InstanceID Instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID
     * @param InstanceID Instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Version No. 
     * @return KafkaVersion Version No.
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set Version No.
     * @param KafkaVersion Version No.
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get Topic list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicList Topic list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CKafkaTopicInfo [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set Topic list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicList Topic list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicList(CKafkaTopicInfo [] TopicList) {
        this.TopicList = TopicList;
    }

    /**
     * Get Routing List 
     * @return RouteList Routing List
     */
    public CKafkaRouteInfo [] getRouteList() {
        return this.RouteList;
    }

    /**
     * Set Routing List
     * @param RouteList Routing List
     */
    public void setRouteList(CKafkaRouteInfo [] RouteList) {
        this.RouteList = RouteList;
    }

    /**
     * Get Disk capacity (unit: GB) 
     * @return DiskSize Disk capacity (unit: GB)
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk capacity (unit: GB)
     * @param DiskSize Disk capacity (unit: GB)
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get vpcId. Leaving it blank indicates a basic network. 
     * @return VpcId vpcId. Leaving it blank indicates a basic network.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcId. Leaving it blank indicates a basic network.
     * @param VpcId vpcId. Leaving it blank indicates a basic network.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
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
     * Get Status: 1 - healthy; 2 - alarm; 3 - abnormal instance status 
     * @return Healthy Status: 1 - healthy; 2 - alarm; 3 - abnormal instance status
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set Status: 1 - healthy; 2 - alarm; 3 - abnormal instance status
     * @param Healthy Status: 1 - healthy; 2 - alarm; 3 - abnormal instance status
     */
    public void setHealthy(Long Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get Availability zone 
     * @return Zone Availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
     * @param Zone Availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Region 
     * @return Az Region
     */
    public String getAz() {
        return this.Az;
    }

    /**
     * Set Region
     * @param Az Region
     */
    public void setAz(String Az) {
        this.Az = Az;
    }

    /**
     * Get Instance bandwidth (unit: Mbps) 
     * @return Bandwidth Instance bandwidth (unit: Mbps)
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Instance bandwidth (unit: Mbps)
     * @param Bandwidth Instance bandwidth (unit: Mbps)
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public CKafkaInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CKafkaInstanceInfo(CKafkaInstanceInfo source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.TopicList != null) {
            this.TopicList = new CKafkaTopicInfo[source.TopicList.length];
            for (int i = 0; i < source.TopicList.length; i++) {
                this.TopicList[i] = new CKafkaTopicInfo(source.TopicList[i]);
            }
        }
        if (source.RouteList != null) {
            this.RouteList = new CKafkaRouteInfo[source.RouteList.length];
            for (int i = 0; i < source.RouteList.length; i++) {
                this.RouteList[i] = new CKafkaRouteInfo(source.RouteList[i]);
            }
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Healthy != null) {
            this.Healthy = new Long(source.Healthy);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Az != null) {
            this.Az = new String(source.Az);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamArrayObj(map, prefix + "TopicList.", this.TopicList);
        this.setParamArrayObj(map, prefix + "RouteList.", this.RouteList);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Az", this.Az);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

