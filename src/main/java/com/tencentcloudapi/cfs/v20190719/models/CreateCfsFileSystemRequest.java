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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCfsFileSystemRequest extends AbstractModel{

    /**
    * AZ name, such as "ap-beijing-1". For the list of regions and AZs, please see [Overview](https://intl.cloud.tencent.com/document/product/582/13225?from_cn_redirect=1)
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Network type. Valid values: VPC (VPC), BASIC (basic network)
    */
    @SerializedName("NetInterface")
    @Expose
    private String NetInterface;

    /**
    * Permission group ID
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * File system protocol type. Valid values: NFS, CIFS. If this parameter is left empty, NFS will be used by default
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * File system storage class. Valid values: SD (standard), HP (high-performance)
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * VPC ID. This field is required if network type is VPC.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID. This field is required if network type is VPC.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Specifies an IP address, which is supported only for VPC. If this parameter is left empty, a random IP will be assigned in the subnet
    */
    @SerializedName("MountIP")
    @Expose
    private String MountIP;

    /**
    * Custom file system name
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * File system tag
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfo [] ResourceTags;

    /**
    * A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. This string is valid for 2 hours.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get AZ name, such as "ap-beijing-1". For the list of regions and AZs, please see [Overview](https://intl.cloud.tencent.com/document/product/582/13225?from_cn_redirect=1) 
     * @return Zone AZ name, such as "ap-beijing-1". For the list of regions and AZs, please see [Overview](https://intl.cloud.tencent.com/document/product/582/13225?from_cn_redirect=1)
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ name, such as "ap-beijing-1". For the list of regions and AZs, please see [Overview](https://intl.cloud.tencent.com/document/product/582/13225?from_cn_redirect=1)
     * @param Zone AZ name, such as "ap-beijing-1". For the list of regions and AZs, please see [Overview](https://intl.cloud.tencent.com/document/product/582/13225?from_cn_redirect=1)
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Network type. Valid values: VPC (VPC), BASIC (basic network) 
     * @return NetInterface Network type. Valid values: VPC (VPC), BASIC (basic network)
     */
    public String getNetInterface() {
        return this.NetInterface;
    }

    /**
     * Set Network type. Valid values: VPC (VPC), BASIC (basic network)
     * @param NetInterface Network type. Valid values: VPC (VPC), BASIC (basic network)
     */
    public void setNetInterface(String NetInterface) {
        this.NetInterface = NetInterface;
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
     * Get File system protocol type. Valid values: NFS, CIFS. If this parameter is left empty, NFS will be used by default 
     * @return Protocol File system protocol type. Valid values: NFS, CIFS. If this parameter is left empty, NFS will be used by default
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set File system protocol type. Valid values: NFS, CIFS. If this parameter is left empty, NFS will be used by default
     * @param Protocol File system protocol type. Valid values: NFS, CIFS. If this parameter is left empty, NFS will be used by default
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get File system storage class. Valid values: SD (standard), HP (high-performance) 
     * @return StorageType File system storage class. Valid values: SD (standard), HP (high-performance)
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set File system storage class. Valid values: SD (standard), HP (high-performance)
     * @param StorageType File system storage class. Valid values: SD (standard), HP (high-performance)
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get VPC ID. This field is required if network type is VPC. 
     * @return VpcId VPC ID. This field is required if network type is VPC.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID. This field is required if network type is VPC.
     * @param VpcId VPC ID. This field is required if network type is VPC.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID. This field is required if network type is VPC. 
     * @return SubnetId Subnet ID. This field is required if network type is VPC.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID. This field is required if network type is VPC.
     * @param SubnetId Subnet ID. This field is required if network type is VPC.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Specifies an IP address, which is supported only for VPC. If this parameter is left empty, a random IP will be assigned in the subnet 
     * @return MountIP Specifies an IP address, which is supported only for VPC. If this parameter is left empty, a random IP will be assigned in the subnet
     */
    public String getMountIP() {
        return this.MountIP;
    }

    /**
     * Set Specifies an IP address, which is supported only for VPC. If this parameter is left empty, a random IP will be assigned in the subnet
     * @param MountIP Specifies an IP address, which is supported only for VPC. If this parameter is left empty, a random IP will be assigned in the subnet
     */
    public void setMountIP(String MountIP) {
        this.MountIP = MountIP;
    }

    /**
     * Get Custom file system name 
     * @return FsName Custom file system name
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set Custom file system name
     * @param FsName Custom file system name
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get File system tag 
     * @return ResourceTags File system tag
     */
    public TagInfo [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set File system tag
     * @param ResourceTags File system tag
     */
    public void setResourceTags(TagInfo [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. This string is valid for 2 hours. 
     * @return ClientToken A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. This string is valid for 2 hours.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. This string is valid for 2 hours.
     * @param ClientToken A unique string supplied by the client to ensure that the request is idempotent. Its maximum length is 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. This string is valid for 2 hours.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public CreateCfsFileSystemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCfsFileSystemRequest(CreateCfsFileSystemRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NetInterface != null) {
            this.NetInterface = new String(source.NetInterface);
        }
        if (source.PGroupId != null) {
            this.PGroupId = new String(source.PGroupId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.MountIP != null) {
            this.MountIP = new String(source.MountIP);
        }
        if (source.FsName != null) {
            this.FsName = new String(source.FsName);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new TagInfo[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new TagInfo(source.ResourceTags[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NetInterface", this.NetInterface);
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "MountIP", this.MountIP);
        this.setParamSimple(map, prefix + "FsName", this.FsName);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

