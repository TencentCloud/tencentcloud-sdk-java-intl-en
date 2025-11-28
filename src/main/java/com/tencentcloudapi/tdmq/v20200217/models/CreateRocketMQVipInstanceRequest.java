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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRocketMQVipInstanceRequest extends AbstractModel {

    /**
    * Instance name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Cluster specification. Supported specifications: 1. 	General: rocket-vip-basic-0; 2. Basic: rocket-vip-basic-1; 3. Standard: rocket-vip-basic-2; 4. Advanced I: rocket-vip-basic-3; 5. Advanced II: rocket-vip-basic-4.
    */
    @SerializedName("Spec")
    @Expose
    private String Spec;

    /**
    * Number of nodes. Value range: 2–20.
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Single-node storage space, in GB. The minimum space is 200 GB.
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * The zone ID list for node deployment. For example, the ID of Guangzhou Zone 1 is 100001. For details, see the official website of the cloud platform.
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * Describes the VPC information.
    */
    @SerializedName("VpcInfo")
    @Expose
    private VpcInfo VpcInfo;

    /**
    * Purchase duration, in months.
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * Whether it is used for cloud migration. The default value is false.
    */
    @SerializedName("SupportsMigrateToCloud")
    @Expose
    private Boolean SupportsMigrateToCloud;

    /**
    * Specifies whether public network access is enabled.
    */
    @SerializedName("EnablePublic")
    @Expose
    private Boolean EnablePublic;

    /**
    * Public network bandwidth, a required field when the public network is enabled.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Public network allowlist.
    */
    @SerializedName("IpRules")
    @Expose
    private PublicAccessRule [] IpRules;

    /**
    * Tag.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Instance name 
     * @return Name Instance name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Instance name
     * @param Name Instance name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Cluster specification. Supported specifications: 1. 	General: rocket-vip-basic-0; 2. Basic: rocket-vip-basic-1; 3. Standard: rocket-vip-basic-2; 4. Advanced I: rocket-vip-basic-3; 5. Advanced II: rocket-vip-basic-4. 
     * @return Spec Cluster specification. Supported specifications: 1. 	General: rocket-vip-basic-0; 2. Basic: rocket-vip-basic-1; 3. Standard: rocket-vip-basic-2; 4. Advanced I: rocket-vip-basic-3; 5. Advanced II: rocket-vip-basic-4.
     */
    public String getSpec() {
        return this.Spec;
    }

    /**
     * Set Cluster specification. Supported specifications: 1. 	General: rocket-vip-basic-0; 2. Basic: rocket-vip-basic-1; 3. Standard: rocket-vip-basic-2; 4. Advanced I: rocket-vip-basic-3; 5. Advanced II: rocket-vip-basic-4.
     * @param Spec Cluster specification. Supported specifications: 1. 	General: rocket-vip-basic-0; 2. Basic: rocket-vip-basic-1; 3. Standard: rocket-vip-basic-2; 4. Advanced I: rocket-vip-basic-3; 5. Advanced II: rocket-vip-basic-4.
     */
    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    /**
     * Get Number of nodes. Value range: 2–20. 
     * @return NodeCount Number of nodes. Value range: 2–20.
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of nodes. Value range: 2–20.
     * @param NodeCount Number of nodes. Value range: 2–20.
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Single-node storage space, in GB. The minimum space is 200 GB. 
     * @return StorageSize Single-node storage space, in GB. The minimum space is 200 GB.
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set Single-node storage space, in GB. The minimum space is 200 GB.
     * @param StorageSize Single-node storage space, in GB. The minimum space is 200 GB.
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get The zone ID list for node deployment. For example, the ID of Guangzhou Zone 1 is 100001. For details, see the official website of the cloud platform. 
     * @return ZoneIds The zone ID list for node deployment. For example, the ID of Guangzhou Zone 1 is 100001. For details, see the official website of the cloud platform.
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set The zone ID list for node deployment. For example, the ID of Guangzhou Zone 1 is 100001. For details, see the official website of the cloud platform.
     * @param ZoneIds The zone ID list for node deployment. For example, the ID of Guangzhou Zone 1 is 100001. For details, see the official website of the cloud platform.
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Describes the VPC information. 
     * @return VpcInfo Describes the VPC information.
     */
    public VpcInfo getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set Describes the VPC information.
     * @param VpcInfo Describes the VPC information.
     */
    public void setVpcInfo(VpcInfo VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    /**
     * Get Purchase duration, in months. 
     * @return TimeSpan Purchase duration, in months.
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set Purchase duration, in months.
     * @param TimeSpan Purchase duration, in months.
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get Whether it is used for cloud migration. The default value is false. 
     * @return SupportsMigrateToCloud Whether it is used for cloud migration. The default value is false.
     */
    public Boolean getSupportsMigrateToCloud() {
        return this.SupportsMigrateToCloud;
    }

    /**
     * Set Whether it is used for cloud migration. The default value is false.
     * @param SupportsMigrateToCloud Whether it is used for cloud migration. The default value is false.
     */
    public void setSupportsMigrateToCloud(Boolean SupportsMigrateToCloud) {
        this.SupportsMigrateToCloud = SupportsMigrateToCloud;
    }

    /**
     * Get Specifies whether public network access is enabled. 
     * @return EnablePublic Specifies whether public network access is enabled.
     */
    public Boolean getEnablePublic() {
        return this.EnablePublic;
    }

    /**
     * Set Specifies whether public network access is enabled.
     * @param EnablePublic Specifies whether public network access is enabled.
     */
    public void setEnablePublic(Boolean EnablePublic) {
        this.EnablePublic = EnablePublic;
    }

    /**
     * Get Public network bandwidth, a required field when the public network is enabled. 
     * @return Bandwidth Public network bandwidth, a required field when the public network is enabled.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Public network bandwidth, a required field when the public network is enabled.
     * @param Bandwidth Public network bandwidth, a required field when the public network is enabled.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Public network allowlist. 
     * @return IpRules Public network allowlist.
     */
    public PublicAccessRule [] getIpRules() {
        return this.IpRules;
    }

    /**
     * Set Public network allowlist.
     * @param IpRules Public network allowlist.
     */
    public void setIpRules(PublicAccessRule [] IpRules) {
        this.IpRules = IpRules;
    }

    /**
     * Get Tag. 
     * @return Tags Tag.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
     * @param Tags Tag.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateRocketMQVipInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQVipInstanceRequest(CreateRocketMQVipInstanceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Spec != null) {
            this.Spec = new String(source.Spec);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.VpcInfo != null) {
            this.VpcInfo = new VpcInfo(source.VpcInfo);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.SupportsMigrateToCloud != null) {
            this.SupportsMigrateToCloud = new Boolean(source.SupportsMigrateToCloud);
        }
        if (source.EnablePublic != null) {
            this.EnablePublic = new Boolean(source.EnablePublic);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.IpRules != null) {
            this.IpRules = new PublicAccessRule[source.IpRules.length];
            for (int i = 0; i < source.IpRules.length; i++) {
                this.IpRules[i] = new PublicAccessRule(source.IpRules[i]);
            }
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Spec", this.Spec);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamObj(map, prefix + "VpcInfo.", this.VpcInfo);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "SupportsMigrateToCloud", this.SupportsMigrateToCloud);
        this.setParamSimple(map, prefix + "EnablePublic", this.EnablePublic);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArrayObj(map, prefix + "IpRules.", this.IpRules);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

