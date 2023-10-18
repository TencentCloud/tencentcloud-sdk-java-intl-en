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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageAccelerationServiceRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * ID of the VPC where the CFS file system to be created resides
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ID of the subnet where the CFS file system to be created resides
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Storage class of the CFS file system to be created. Valid values: SD: Standard; HP: High-Performance.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Permission group ID
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * AZ name, such as `ap-beijing-1`. For more information, see the list of regions and AZs in Overview.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Cloud tag description
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
     * Get Instance ID 
     * @return RegistryId Instance ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set Instance ID
     * @param RegistryId Instance ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get ID of the VPC where the CFS file system to be created resides 
     * @return VpcId ID of the VPC where the CFS file system to be created resides
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the VPC where the CFS file system to be created resides
     * @param VpcId ID of the VPC where the CFS file system to be created resides
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ID of the subnet where the CFS file system to be created resides 
     * @return SubnetId ID of the subnet where the CFS file system to be created resides
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set ID of the subnet where the CFS file system to be created resides
     * @param SubnetId ID of the subnet where the CFS file system to be created resides
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Storage class of the CFS file system to be created. Valid values: SD: Standard; HP: High-Performance. 
     * @return StorageType Storage class of the CFS file system to be created. Valid values: SD: Standard; HP: High-Performance.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage class of the CFS file system to be created. Valid values: SD: Standard; HP: High-Performance.
     * @param StorageType Storage class of the CFS file system to be created. Valid values: SD: Standard; HP: High-Performance.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Permission group ID 
     * @return PGroupId Permission group ID
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set Permission group ID
     * @param PGroupId Permission group ID
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get AZ name, such as `ap-beijing-1`. For more information, see the list of regions and AZs in Overview. 
     * @return Zone AZ name, such as `ap-beijing-1`. For more information, see the list of regions and AZs in Overview.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ name, such as `ap-beijing-1`. For more information, see the list of regions and AZs in Overview.
     * @param Zone AZ name, such as `ap-beijing-1`. For more information, see the list of regions and AZs in Overview.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Cloud tag description 
     * @return TagSpecification Cloud tag description
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set Cloud tag description
     * @param TagSpecification Cloud tag description
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    public CreateImageAccelerationServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageAccelerationServiceRequest(CreateImageAccelerationServiceRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.PGroupId != null) {
            this.PGroupId = new String(source.PGroupId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification(source.TagSpecification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

