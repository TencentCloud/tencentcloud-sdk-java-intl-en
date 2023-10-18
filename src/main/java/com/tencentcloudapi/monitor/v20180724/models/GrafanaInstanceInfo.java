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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GrafanaInstanceInfo extends AbstractModel {

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

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
    * Array of subnet IDs
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * Grafana private network address
    */
    @SerializedName("InternetUrl")
    @Expose
    private String InternetUrl;

    /**
    * Grafana public network address
    */
    @SerializedName("InternalUrl")
    @Expose
    private String InternalUrl;

    /**
    * Creation time
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * Status. Valid values: `1` (creating), `2` (running), `3` (abnormal), `4` (restarting), `5` (stopping), `6` (stopped), `7` (deleted).
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
    * Instance tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSpecification")
    @Expose
    private PrometheusTag [] TagSpecification;

    /**
    * Instance AZ
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Billing mode. Valid value: `1` (monthly subscription).
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private Long InstanceChargeType;

    /**
    * VPC name
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * Subnet name
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * Region ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * The full URL used to access this instance
    */
    @SerializedName("RootUrl")
    @Expose
    private String RootUrl;

    /**
    * Whether to enable SSO
    */
    @SerializedName("EnableSSO")
    @Expose
    private Boolean EnableSSO;

    /**
    * Version number
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Whether to enable CAM authentication during SSO
    */
    @SerializedName("EnableSSOCamCheck")
    @Expose
    private Boolean EnableSSOCamCheck;

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
     * Get Array of subnet IDs 
     * @return SubnetIds Array of subnet IDs
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set Array of subnet IDs
     * @param SubnetIds Array of subnet IDs
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get Grafana private network address 
     * @return InternetUrl Grafana private network address
     */
    public String getInternetUrl() {
        return this.InternetUrl;
    }

    /**
     * Set Grafana private network address
     * @param InternetUrl Grafana private network address
     */
    public void setInternetUrl(String InternetUrl) {
        this.InternetUrl = InternetUrl;
    }

    /**
     * Get Grafana public network address 
     * @return InternalUrl Grafana public network address
     */
    public String getInternalUrl() {
        return this.InternalUrl;
    }

    /**
     * Set Grafana public network address
     * @param InternalUrl Grafana public network address
     */
    public void setInternalUrl(String InternalUrl) {
        this.InternalUrl = InternalUrl;
    }

    /**
     * Get Creation time 
     * @return CreatedAt Creation time
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set Creation time
     * @param CreatedAt Creation time
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get Status. Valid values: `1` (creating), `2` (running), `3` (abnormal), `4` (restarting), `5` (stopping), `6` (stopped), `7` (deleted). 
     * @return InstanceStatus Status. Valid values: `1` (creating), `2` (running), `3` (abnormal), `4` (restarting), `5` (stopping), `6` (stopped), `7` (deleted).
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Status. Valid values: `1` (creating), `2` (running), `3` (abnormal), `4` (restarting), `5` (stopping), `6` (stopped), `7` (deleted).
     * @param InstanceStatus Status. Valid values: `1` (creating), `2` (running), `3` (abnormal), `4` (restarting), `5` (stopping), `6` (stopped), `7` (deleted).
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Instance tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagSpecification Instance tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PrometheusTag [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set Instance tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagSpecification Instance tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagSpecification(PrometheusTag [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get Instance AZ 
     * @return Zone Instance AZ
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance AZ
     * @param Zone Instance AZ
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Billing mode. Valid value: `1` (monthly subscription). 
     * @return InstanceChargeType Billing mode. Valid value: `1` (monthly subscription).
     */
    public Long getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Billing mode. Valid value: `1` (monthly subscription).
     * @param InstanceChargeType Billing mode. Valid value: `1` (monthly subscription).
     */
    public void setInstanceChargeType(Long InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get VPC name 
     * @return VpcName VPC name
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name
     * @param VpcName VPC name
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get Subnet name 
     * @return SubnetName Subnet name
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set Subnet name
     * @param SubnetName Subnet name
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * Get Region ID 
     * @return RegionId Region ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
     * @param RegionId Region ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get The full URL used to access this instance 
     * @return RootUrl The full URL used to access this instance
     */
    public String getRootUrl() {
        return this.RootUrl;
    }

    /**
     * Set The full URL used to access this instance
     * @param RootUrl The full URL used to access this instance
     */
    public void setRootUrl(String RootUrl) {
        this.RootUrl = RootUrl;
    }

    /**
     * Get Whether to enable SSO 
     * @return EnableSSO Whether to enable SSO
     */
    public Boolean getEnableSSO() {
        return this.EnableSSO;
    }

    /**
     * Set Whether to enable SSO
     * @param EnableSSO Whether to enable SSO
     */
    public void setEnableSSO(Boolean EnableSSO) {
        this.EnableSSO = EnableSSO;
    }

    /**
     * Get Version number 
     * @return Version Version number
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version number
     * @param Version Version number
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Whether to enable CAM authentication during SSO 
     * @return EnableSSOCamCheck Whether to enable CAM authentication during SSO
     */
    public Boolean getEnableSSOCamCheck() {
        return this.EnableSSOCamCheck;
    }

    /**
     * Set Whether to enable CAM authentication during SSO
     * @param EnableSSOCamCheck Whether to enable CAM authentication during SSO
     */
    public void setEnableSSOCamCheck(Boolean EnableSSOCamCheck) {
        this.EnableSSOCamCheck = EnableSSOCamCheck;
    }

    public GrafanaInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrafanaInstanceInfo(GrafanaInstanceInfo source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.InternetUrl != null) {
            this.InternetUrl = new String(source.InternetUrl);
        }
        if (source.InternalUrl != null) {
            this.InternalUrl = new String(source.InternalUrl);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new PrometheusTag[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new PrometheusTag(source.TagSpecification[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new Long(source.InstanceChargeType);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RootUrl != null) {
            this.RootUrl = new String(source.RootUrl);
        }
        if (source.EnableSSO != null) {
            this.EnableSSO = new Boolean(source.EnableSSO);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.EnableSSOCamCheck != null) {
            this.EnableSSOCamCheck = new Boolean(source.EnableSSOCamCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "InternetUrl", this.InternetUrl);
        this.setParamSimple(map, prefix + "InternalUrl", this.InternalUrl);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RootUrl", this.RootUrl);
        this.setParamSimple(map, prefix + "EnableSSO", this.EnableSSO);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "EnableSSOCamCheck", this.EnableSSOCamCheck);

    }
}

