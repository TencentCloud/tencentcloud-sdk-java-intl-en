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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayConfig extends AbstractModel {

    /**
    * Console type.
    */
    @SerializedName("ConsoleType")
    @Expose
    private String ConsoleType;

    /**
    * HTTP URL.
    */
    @SerializedName("HttpUrl")
    @Expose
    private String HttpUrl;

    /**
    * HTTPS URL.
    */
    @SerializedName("HttpsUrl")
    @Expose
    private String HttpsUrl;

    /**
    * Network type, Open|Internal.
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * Admin username.
    */
    @SerializedName("AdminUser")
    @Expose
    private String AdminUser;

    /**
    * Administrator password.
    */
    @SerializedName("AdminPassword")
    @Expose
    private String AdminPassword;

    /**
    * Network Status, Open|Closed|Updating
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Network access policy
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessControl")
    @Expose
    private NetworkAccessControl AccessControl;

    /**
    * Intranet subnet ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Private network VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Description of load balancing
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Load balancing specification type
    */
    @SerializedName("SlaType")
    @Expose
    private String SlaType;

    /**
    * clb specification name
    */
    @SerializedName("SlaName")
    @Expose
    private String SlaName;

    /**
    * clb vip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Bandwidth
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Whether the multiple-AZ deployment mode is used.
    */
    @SerializedName("MultiZoneFlag")
    @Expose
    private Boolean MultiZoneFlag;

    /**
    * Primary AZ.
    */
    @SerializedName("MasterZoneId")
    @Expose
    private String MasterZoneId;

    /**
    * standby availability zone
    */
    @SerializedName("SlaveZoneId")
    @Expose
    private String SlaveZoneId;

    /**
    * Primary availability zone name
    */
    @SerializedName("MasterZoneName")
    @Expose
    private String MasterZoneName;

    /**
    * Backup availability zone name
    */
    @SerializedName("SlaveZoneName")
    @Expose
    private String SlaveZoneName;

    /**
    * Network id
    */
    @SerializedName("NetworkId")
    @Expose
    private String NetworkId;

    /**
    * Whether the CLB is a new ipv6 CLB
    */
    @SerializedName("IPV6FullChain")
    @Expose
    private Boolean IPV6FullChain;

    /**
    * Load balancing personalized configuration content
    */
    @SerializedName("CustomizedConfigContent")
    @Expose
    private String CustomizedConfigContent;

    /**
     * Get Console type. 
     * @return ConsoleType Console type.
     */
    public String getConsoleType() {
        return this.ConsoleType;
    }

    /**
     * Set Console type.
     * @param ConsoleType Console type.
     */
    public void setConsoleType(String ConsoleType) {
        this.ConsoleType = ConsoleType;
    }

    /**
     * Get HTTP URL. 
     * @return HttpUrl HTTP URL.
     */
    public String getHttpUrl() {
        return this.HttpUrl;
    }

    /**
     * Set HTTP URL.
     * @param HttpUrl HTTP URL.
     */
    public void setHttpUrl(String HttpUrl) {
        this.HttpUrl = HttpUrl;
    }

    /**
     * Get HTTPS URL. 
     * @return HttpsUrl HTTPS URL.
     */
    public String getHttpsUrl() {
        return this.HttpsUrl;
    }

    /**
     * Set HTTPS URL.
     * @param HttpsUrl HTTPS URL.
     */
    public void setHttpsUrl(String HttpsUrl) {
        this.HttpsUrl = HttpsUrl;
    }

    /**
     * Get Network type, Open|Internal. 
     * @return NetType Network type, Open|Internal.
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type, Open|Internal.
     * @param NetType Network type, Open|Internal.
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Admin username. 
     * @return AdminUser Admin username.
     */
    public String getAdminUser() {
        return this.AdminUser;
    }

    /**
     * Set Admin username.
     * @param AdminUser Admin username.
     */
    public void setAdminUser(String AdminUser) {
        this.AdminUser = AdminUser;
    }

    /**
     * Get Administrator password. 
     * @return AdminPassword Administrator password.
     */
    public String getAdminPassword() {
        return this.AdminPassword;
    }

    /**
     * Set Administrator password.
     * @param AdminPassword Administrator password.
     */
    public void setAdminPassword(String AdminPassword) {
        this.AdminPassword = AdminPassword;
    }

    /**
     * Get Network Status, Open|Closed|Updating 
     * @return Status Network Status, Open|Closed|Updating
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Network Status, Open|Closed|Updating
     * @param Status Network Status, Open|Closed|Updating
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Network access policy
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AccessControl Network access policy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public NetworkAccessControl getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set Network access policy
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AccessControl Network access policy
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessControl(NetworkAccessControl AccessControl) {
        this.AccessControl = AccessControl;
    }

    /**
     * Get Intranet subnet ID 
     * @return SubnetId Intranet subnet ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Intranet subnet ID
     * @param SubnetId Intranet subnet ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Private network VPC ID 
     * @return VpcId Private network VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Private network VPC ID
     * @param VpcId Private network VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Description of load balancing 
     * @return Description Description of load balancing
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of load balancing
     * @param Description Description of load balancing
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Load balancing specification type 
     * @return SlaType Load balancing specification type
     */
    public String getSlaType() {
        return this.SlaType;
    }

    /**
     * Set Load balancing specification type
     * @param SlaType Load balancing specification type
     */
    public void setSlaType(String SlaType) {
        this.SlaType = SlaType;
    }

    /**
     * Get clb specification name 
     * @return SlaName clb specification name
     */
    public String getSlaName() {
        return this.SlaName;
    }

    /**
     * Set clb specification name
     * @param SlaName clb specification name
     */
    public void setSlaName(String SlaName) {
        this.SlaName = SlaName;
    }

    /**
     * Get clb vip 
     * @return Vip clb vip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set clb vip
     * @param Vip clb vip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Bandwidth 
     * @return InternetMaxBandwidthOut Bandwidth
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Bandwidth
     * @param InternetMaxBandwidthOut Bandwidth
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Whether the multiple-AZ deployment mode is used. 
     * @return MultiZoneFlag Whether the multiple-AZ deployment mode is used.
     */
    public Boolean getMultiZoneFlag() {
        return this.MultiZoneFlag;
    }

    /**
     * Set Whether the multiple-AZ deployment mode is used.
     * @param MultiZoneFlag Whether the multiple-AZ deployment mode is used.
     */
    public void setMultiZoneFlag(Boolean MultiZoneFlag) {
        this.MultiZoneFlag = MultiZoneFlag;
    }

    /**
     * Get Primary AZ. 
     * @return MasterZoneId Primary AZ.
     */
    public String getMasterZoneId() {
        return this.MasterZoneId;
    }

    /**
     * Set Primary AZ.
     * @param MasterZoneId Primary AZ.
     */
    public void setMasterZoneId(String MasterZoneId) {
        this.MasterZoneId = MasterZoneId;
    }

    /**
     * Get standby availability zone 
     * @return SlaveZoneId standby availability zone
     */
    public String getSlaveZoneId() {
        return this.SlaveZoneId;
    }

    /**
     * Set standby availability zone
     * @param SlaveZoneId standby availability zone
     */
    public void setSlaveZoneId(String SlaveZoneId) {
        this.SlaveZoneId = SlaveZoneId;
    }

    /**
     * Get Primary availability zone name 
     * @return MasterZoneName Primary availability zone name
     */
    public String getMasterZoneName() {
        return this.MasterZoneName;
    }

    /**
     * Set Primary availability zone name
     * @param MasterZoneName Primary availability zone name
     */
    public void setMasterZoneName(String MasterZoneName) {
        this.MasterZoneName = MasterZoneName;
    }

    /**
     * Get Backup availability zone name 
     * @return SlaveZoneName Backup availability zone name
     */
    public String getSlaveZoneName() {
        return this.SlaveZoneName;
    }

    /**
     * Set Backup availability zone name
     * @param SlaveZoneName Backup availability zone name
     */
    public void setSlaveZoneName(String SlaveZoneName) {
        this.SlaveZoneName = SlaveZoneName;
    }

    /**
     * Get Network id 
     * @return NetworkId Network id
     */
    public String getNetworkId() {
        return this.NetworkId;
    }

    /**
     * Set Network id
     * @param NetworkId Network id
     */
    public void setNetworkId(String NetworkId) {
        this.NetworkId = NetworkId;
    }

    /**
     * Get Whether the CLB is a new ipv6 CLB 
     * @return IPV6FullChain Whether the CLB is a new ipv6 CLB
     */
    public Boolean getIPV6FullChain() {
        return this.IPV6FullChain;
    }

    /**
     * Set Whether the CLB is a new ipv6 CLB
     * @param IPV6FullChain Whether the CLB is a new ipv6 CLB
     */
    public void setIPV6FullChain(Boolean IPV6FullChain) {
        this.IPV6FullChain = IPV6FullChain;
    }

    /**
     * Get Load balancing personalized configuration content 
     * @return CustomizedConfigContent Load balancing personalized configuration content
     */
    public String getCustomizedConfigContent() {
        return this.CustomizedConfigContent;
    }

    /**
     * Set Load balancing personalized configuration content
     * @param CustomizedConfigContent Load balancing personalized configuration content
     */
    public void setCustomizedConfigContent(String CustomizedConfigContent) {
        this.CustomizedConfigContent = CustomizedConfigContent;
    }

    public CloudNativeAPIGatewayConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayConfig(CloudNativeAPIGatewayConfig source) {
        if (source.ConsoleType != null) {
            this.ConsoleType = new String(source.ConsoleType);
        }
        if (source.HttpUrl != null) {
            this.HttpUrl = new String(source.HttpUrl);
        }
        if (source.HttpsUrl != null) {
            this.HttpsUrl = new String(source.HttpsUrl);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.AdminUser != null) {
            this.AdminUser = new String(source.AdminUser);
        }
        if (source.AdminPassword != null) {
            this.AdminPassword = new String(source.AdminPassword);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AccessControl != null) {
            this.AccessControl = new NetworkAccessControl(source.AccessControl);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SlaType != null) {
            this.SlaType = new String(source.SlaType);
        }
        if (source.SlaName != null) {
            this.SlaName = new String(source.SlaName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.MultiZoneFlag != null) {
            this.MultiZoneFlag = new Boolean(source.MultiZoneFlag);
        }
        if (source.MasterZoneId != null) {
            this.MasterZoneId = new String(source.MasterZoneId);
        }
        if (source.SlaveZoneId != null) {
            this.SlaveZoneId = new String(source.SlaveZoneId);
        }
        if (source.MasterZoneName != null) {
            this.MasterZoneName = new String(source.MasterZoneName);
        }
        if (source.SlaveZoneName != null) {
            this.SlaveZoneName = new String(source.SlaveZoneName);
        }
        if (source.NetworkId != null) {
            this.NetworkId = new String(source.NetworkId);
        }
        if (source.IPV6FullChain != null) {
            this.IPV6FullChain = new Boolean(source.IPV6FullChain);
        }
        if (source.CustomizedConfigContent != null) {
            this.CustomizedConfigContent = new String(source.CustomizedConfigContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsoleType", this.ConsoleType);
        this.setParamSimple(map, prefix + "HttpUrl", this.HttpUrl);
        this.setParamSimple(map, prefix + "HttpsUrl", this.HttpsUrl);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "AdminUser", this.AdminUser);
        this.setParamSimple(map, prefix + "AdminPassword", this.AdminPassword);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "AccessControl.", this.AccessControl);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SlaType", this.SlaType);
        this.setParamSimple(map, prefix + "SlaName", this.SlaName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "MultiZoneFlag", this.MultiZoneFlag);
        this.setParamSimple(map, prefix + "MasterZoneId", this.MasterZoneId);
        this.setParamSimple(map, prefix + "SlaveZoneId", this.SlaveZoneId);
        this.setParamSimple(map, prefix + "MasterZoneName", this.MasterZoneName);
        this.setParamSimple(map, prefix + "SlaveZoneName", this.SlaveZoneName);
        this.setParamSimple(map, prefix + "NetworkId", this.NetworkId);
        this.setParamSimple(map, prefix + "IPV6FullChain", this.IPV6FullChain);
        this.setParamSimple(map, prefix + "CustomizedConfigContent", this.CustomizedConfigContent);

    }
}

