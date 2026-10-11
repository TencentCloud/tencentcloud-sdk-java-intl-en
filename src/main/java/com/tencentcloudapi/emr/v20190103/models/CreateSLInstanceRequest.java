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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSLInstanceRequest extends AbstractModel {

    /**
    * Instance name.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Instance billing mode. Valid values: 0 (postpaid, that is, pay-as-you-go) and 1 (prepaid, that is, yearly/monthly subscription).
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Instance storage type. Valid values: CLOUD_HSSD (Enhanced SSD) and CLOUD_BSSD (Balanced SSD).
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Disk capacity of a single node of the instance (GB). The disk capacity of a single node should be greater than or equal to 100 and less than or equal to 250 x the number of CPU cores. The capacity adjustment step is 100.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Instance node specifications. Valid values: 4C16G, 8C32G, 16C64G, and 32C128G. The value is case-insensitive.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Detailed configuration of the instance AZ, including the region name, VPC information, and number of nodes. Currently, multiple AZs are supported. The number of AZs must be 1 or 3, and the total number of nodes across all AZs must be greater than or equal to 3 and less than or equal to 50.
    */
    @SerializedName("ZoneSettings")
    @Expose
    private ZoneSetting [] ZoneSettings;

    /**
    * List of tags to be bound to the instance.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Prepaid parameter.
    */
    @SerializedName("PrePaySetting")
    @Expose
    private PrePaySetting PrePaySetting;

    /**
    * Unique random identifier with a time-to-live of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-****-****-****-fae360632808.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Deployment mode.
    */
    @SerializedName("DeploymentMode")
    @Expose
    private String DeploymentMode;

    /**
    * Service username, which is optional for services without the need to set usernames. The value can contain 8 to 16 characters, including uppercase letters, lowercase letters, and digits.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
     * Get Instance name. 
     * @return InstanceName Instance name.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name.
     * @param InstanceName Instance name.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Instance billing mode. Valid values: 0 (postpaid, that is, pay-as-you-go) and 1 (prepaid, that is, yearly/monthly subscription). 
     * @return PayMode Instance billing mode. Valid values: 0 (postpaid, that is, pay-as-you-go) and 1 (prepaid, that is, yearly/monthly subscription).
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Instance billing mode. Valid values: 0 (postpaid, that is, pay-as-you-go) and 1 (prepaid, that is, yearly/monthly subscription).
     * @param PayMode Instance billing mode. Valid values: 0 (postpaid, that is, pay-as-you-go) and 1 (prepaid, that is, yearly/monthly subscription).
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Instance storage type. Valid values: CLOUD_HSSD (Enhanced SSD) and CLOUD_BSSD (Balanced SSD). 
     * @return DiskType Instance storage type. Valid values: CLOUD_HSSD (Enhanced SSD) and CLOUD_BSSD (Balanced SSD).
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Instance storage type. Valid values: CLOUD_HSSD (Enhanced SSD) and CLOUD_BSSD (Balanced SSD).
     * @param DiskType Instance storage type. Valid values: CLOUD_HSSD (Enhanced SSD) and CLOUD_BSSD (Balanced SSD).
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Disk capacity of a single node of the instance (GB). The disk capacity of a single node should be greater than or equal to 100 and less than or equal to 250 x the number of CPU cores. The capacity adjustment step is 100. 
     * @return DiskSize Disk capacity of a single node of the instance (GB). The disk capacity of a single node should be greater than or equal to 100 and less than or equal to 250 x the number of CPU cores. The capacity adjustment step is 100.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk capacity of a single node of the instance (GB). The disk capacity of a single node should be greater than or equal to 100 and less than or equal to 250 x the number of CPU cores. The capacity adjustment step is 100.
     * @param DiskSize Disk capacity of a single node of the instance (GB). The disk capacity of a single node should be greater than or equal to 100 and less than or equal to 250 x the number of CPU cores. The capacity adjustment step is 100.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Instance node specifications. Valid values: 4C16G, 8C32G, 16C64G, and 32C128G. The value is case-insensitive. 
     * @return NodeType Instance node specifications. Valid values: 4C16G, 8C32G, 16C64G, and 32C128G. The value is case-insensitive.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Instance node specifications. Valid values: 4C16G, 8C32G, 16C64G, and 32C128G. The value is case-insensitive.
     * @param NodeType Instance node specifications. Valid values: 4C16G, 8C32G, 16C64G, and 32C128G. The value is case-insensitive.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Detailed configuration of the instance AZ, including the region name, VPC information, and number of nodes. Currently, multiple AZs are supported. The number of AZs must be 1 or 3, and the total number of nodes across all AZs must be greater than or equal to 3 and less than or equal to 50. 
     * @return ZoneSettings Detailed configuration of the instance AZ, including the region name, VPC information, and number of nodes. Currently, multiple AZs are supported. The number of AZs must be 1 or 3, and the total number of nodes across all AZs must be greater than or equal to 3 and less than or equal to 50.
     */
    public ZoneSetting [] getZoneSettings() {
        return this.ZoneSettings;
    }

    /**
     * Set Detailed configuration of the instance AZ, including the region name, VPC information, and number of nodes. Currently, multiple AZs are supported. The number of AZs must be 1 or 3, and the total number of nodes across all AZs must be greater than or equal to 3 and less than or equal to 50.
     * @param ZoneSettings Detailed configuration of the instance AZ, including the region name, VPC information, and number of nodes. Currently, multiple AZs are supported. The number of AZs must be 1 or 3, and the total number of nodes across all AZs must be greater than or equal to 3 and less than or equal to 50.
     */
    public void setZoneSettings(ZoneSetting [] ZoneSettings) {
        this.ZoneSettings = ZoneSettings;
    }

    /**
     * Get List of tags to be bound to the instance. 
     * @return Tags List of tags to be bound to the instance.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set List of tags to be bound to the instance.
     * @param Tags List of tags to be bound to the instance.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Prepaid parameter. 
     * @return PrePaySetting Prepaid parameter.
     */
    public PrePaySetting getPrePaySetting() {
        return this.PrePaySetting;
    }

    /**
     * Set Prepaid parameter.
     * @param PrePaySetting Prepaid parameter.
     */
    public void setPrePaySetting(PrePaySetting PrePaySetting) {
        this.PrePaySetting = PrePaySetting;
    }

    /**
     * Get Unique random identifier with a time-to-live of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-****-****-****-fae360632808. 
     * @return ClientToken Unique random identifier with a time-to-live of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-****-****-****-fae360632808.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set Unique random identifier with a time-to-live of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-****-****-****-fae360632808.
     * @param ClientToken Unique random identifier with a time-to-live of 5 minutes, which needs to be specified by the caller to prevent the client from repeatedly creating resources, for example, a9a90aa6-****-****-****-fae360632808.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Deployment mode. 
     * @return DeploymentMode Deployment mode.
     */
    public String getDeploymentMode() {
        return this.DeploymentMode;
    }

    /**
     * Set Deployment mode.
     * @param DeploymentMode Deployment mode.
     */
    public void setDeploymentMode(String DeploymentMode) {
        this.DeploymentMode = DeploymentMode;
    }

    /**
     * Get Service username, which is optional for services without the need to set usernames. The value can contain 8 to 16 characters, including uppercase letters, lowercase letters, and digits. 
     * @return UserName Service username, which is optional for services without the need to set usernames. The value can contain 8 to 16 characters, including uppercase letters, lowercase letters, and digits.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Service username, which is optional for services without the need to set usernames. The value can contain 8 to 16 characters, including uppercase letters, lowercase letters, and digits.
     * @param UserName Service username, which is optional for services without the need to set usernames. The value can contain 8 to 16 characters, including uppercase letters, lowercase letters, and digits.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public CreateSLInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSLInstanceRequest(CreateSLInstanceRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.ZoneSettings != null) {
            this.ZoneSettings = new ZoneSetting[source.ZoneSettings.length];
            for (int i = 0; i < source.ZoneSettings.length; i++) {
                this.ZoneSettings[i] = new ZoneSetting(source.ZoneSettings[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.PrePaySetting != null) {
            this.PrePaySetting = new PrePaySetting(source.PrePaySetting);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DeploymentMode != null) {
            this.DeploymentMode = new String(source.DeploymentMode);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArrayObj(map, prefix + "ZoneSettings.", this.ZoneSettings);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "PrePaySetting.", this.PrePaySetting);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DeploymentMode", this.DeploymentMode);
        this.setParamSimple(map, prefix + "UserName", this.UserName);

    }
}

