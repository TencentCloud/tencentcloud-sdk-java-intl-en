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
    * Instance billing mode. 0 indicates postpaid, i.e., pay-as-you-go.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Instance storage type. Fill in CLOUD_HSSD to represent high-performance cloud storage.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * The disk capacity of a single node of the instance, in GB. The disk capacity of a single node should be greater than or equal to 100 and less than or equal to 250 x the number of CPU cores. The capacity adjustment step is 100.
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Instance node specification. You can fill in 4C16G, 8C32G, 16C64G, or 32C128G, which is case-insensitive.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Detailed configuration of the instance AZ. Currently, multiple availability zones are supported. The number of AZs must be 1 or 3, including the region names, VPC information, and number of nodes. The total number of nodes across all zones must be greater than or equal to 3 and less than or equal to 50.
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
    * The unique random identifier with a time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from creating resources repeatedly. For example: a9a90aa6-****-****-****-fae360632808.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 
    */
    @SerializedName("DeploymentMode")
    @Expose
    private String DeploymentMode;

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
     * Get Instance billing mode. 0 indicates postpaid, i.e., pay-as-you-go. 
     * @return PayMode Instance billing mode. 0 indicates postpaid, i.e., pay-as-you-go.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Instance billing mode. 0 indicates postpaid, i.e., pay-as-you-go.
     * @param PayMode Instance billing mode. 0 indicates postpaid, i.e., pay-as-you-go.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Instance storage type. Fill in CLOUD_HSSD to represent high-performance cloud storage. 
     * @return DiskType Instance storage type. Fill in CLOUD_HSSD to represent high-performance cloud storage.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Instance storage type. Fill in CLOUD_HSSD to represent high-performance cloud storage.
     * @param DiskType Instance storage type. Fill in CLOUD_HSSD to represent high-performance cloud storage.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get The disk capacity of a single node of the instance, in GB. The disk capacity of a single node should be greater than or equal to 100 and less than or equal to 250 x the number of CPU cores. The capacity adjustment step is 100. 
     * @return DiskSize The disk capacity of a single node of the instance, in GB. The disk capacity of a single node should be greater than or equal to 100 and less than or equal to 250 x the number of CPU cores. The capacity adjustment step is 100.
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set The disk capacity of a single node of the instance, in GB. The disk capacity of a single node should be greater than or equal to 100 and less than or equal to 250 x the number of CPU cores. The capacity adjustment step is 100.
     * @param DiskSize The disk capacity of a single node of the instance, in GB. The disk capacity of a single node should be greater than or equal to 100 and less than or equal to 250 x the number of CPU cores. The capacity adjustment step is 100.
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Instance node specification. You can fill in 4C16G, 8C32G, 16C64G, or 32C128G, which is case-insensitive. 
     * @return NodeType Instance node specification. You can fill in 4C16G, 8C32G, 16C64G, or 32C128G, which is case-insensitive.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Instance node specification. You can fill in 4C16G, 8C32G, 16C64G, or 32C128G, which is case-insensitive.
     * @param NodeType Instance node specification. You can fill in 4C16G, 8C32G, 16C64G, or 32C128G, which is case-insensitive.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Detailed configuration of the instance AZ. Currently, multiple availability zones are supported. The number of AZs must be 1 or 3, including the region names, VPC information, and number of nodes. The total number of nodes across all zones must be greater than or equal to 3 and less than or equal to 50. 
     * @return ZoneSettings Detailed configuration of the instance AZ. Currently, multiple availability zones are supported. The number of AZs must be 1 or 3, including the region names, VPC information, and number of nodes. The total number of nodes across all zones must be greater than or equal to 3 and less than or equal to 50.
     */
    public ZoneSetting [] getZoneSettings() {
        return this.ZoneSettings;
    }

    /**
     * Set Detailed configuration of the instance AZ. Currently, multiple availability zones are supported. The number of AZs must be 1 or 3, including the region names, VPC information, and number of nodes. The total number of nodes across all zones must be greater than or equal to 3 and less than or equal to 50.
     * @param ZoneSettings Detailed configuration of the instance AZ. Currently, multiple availability zones are supported. The number of AZs must be 1 or 3, including the region names, VPC information, and number of nodes. The total number of nodes across all zones must be greater than or equal to 3 and less than or equal to 50.
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
     * Get The unique random identifier with a time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from creating resources repeatedly. For example: a9a90aa6-****-****-****-fae360632808. 
     * @return ClientToken The unique random identifier with a time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from creating resources repeatedly. For example: a9a90aa6-****-****-****-fae360632808.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set The unique random identifier with a time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from creating resources repeatedly. For example: a9a90aa6-****-****-****-fae360632808.
     * @param ClientToken The unique random identifier with a time efficiency of 5 minutes, which needs to be specified by the caller to prevent the client from creating resources repeatedly. For example: a9a90aa6-****-****-****-fae360632808.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get  
     * @return DeploymentMode 
     */
    public String getDeploymentMode() {
        return this.DeploymentMode;
    }

    /**
     * Set 
     * @param DeploymentMode 
     */
    public void setDeploymentMode(String DeploymentMode) {
        this.DeploymentMode = DeploymentMode;
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

    }
}

