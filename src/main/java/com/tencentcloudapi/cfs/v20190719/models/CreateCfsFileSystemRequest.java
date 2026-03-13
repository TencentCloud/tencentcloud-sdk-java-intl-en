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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCfsFileSystemRequest extends AbstractModel {

    /**
    * AZ name, such as "ap-beijing-1". For the list of regions and AZs, please see [Overview](https://intl.cloud.tencent.com/document/product/582/13225?from_cn_redirect=1)
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Network type. Valid values: `VPC` and `CCN`. Select `VPC` for a Standard or High-Performance file system, and `CCN` for a Standard Turbo or High-Performance Turbo one.
    */
    @SerializedName("NetInterface")
    @Expose
    private String NetInterface;

    /**
    * Permission group ID. pgroupbasic is the default permission group. obtain through the api [DescribeCfsPGroups](https://www.tencentcloud.com/document/product/582/38157?from_cn_redirect=1) to query the permission group list.
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * File system protocol type. valid values: NFS, CIFS, and TURBO. if left blank, NFS by default. the TURBO series must select TURBO. NFS and CIFS are not supported.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Storage type of the file system. Valid values: `SD` (Standard), `HP` (High-Performance), `TB` (Standard Turbo), and `TP` (High-Performance Turbo). Default value: `SD`.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * Private network (VPC) ID. if the network type is VPC, this field must be specified. obtain it by querying the private network interface.
[DescribeVpcs](https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1)
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID. this field must be specified if the network type is VPC. obtain through the api for querying subnets.
[DescribeSubnets](https://www.tencentcloud.com/document/product/215/15784?from_cn_redirect=1)
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * IP address (this parameter supports only the VPC network type, and the Turbo series is not supported). If this parameter is left empty, a random IP in the subnet will be assigned.
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
    * Cloud connect network ID. this field must be specified if the network type is CCN. obtain it by querying the CCN list through the api.
[DescribeCcns](https://www.tencentcloud.com/document/product/215/19199?from_cn_redirect=1)

    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * CCN IP range used by the CFS (required if the network type is CCN), which cannot conflict with other IP ranges bound in CCN
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * File system capacity, required for the turbo series, in GiB. turbo standard type in GB, starting from 20 TiB (20480 GiB); scaling increment 10 TiB (10240 GiB). turbo performance type starts from 10 TiB (10240 GiB); capacity expansion step 10 TiB (10240 GiB).
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * File system snapshot ID. this parameter can be obtained by querying the snapshot list.
[DescribeCfsSnapshots](https://www.tencentcloud.com/document/product/582/80206?from_cn_redirect=1)
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * Scheduled snapshot policy ID, which can be obtained by querying the snapshot policy information.
[DescribeAutoSnapshotPolicies](https://www.tencentcloud.com/document/product/582/38157?from_cn_redirect=1)
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * Whether default expansion is enabled. only turbo file storage supports this feature.
    */
    @SerializedName("EnableAutoScaleUp")
    @Expose
    private Boolean EnableAutoScaleUp;

    /**
    * v1.5: create a standard edition general file system.
v3.1: create an enhanced general file system.
Description: the enhanced universal system requires enabling the allowlist to use. if needed, submit a ticket to contact us.
    */
    @SerializedName("CfsVersion")
    @Expose
    private String CfsVersion;

    /**
    * turbo file system metadata attribute.
basic: creates metadata of the standard type.
Enhanced: creates enhanced metadata.
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

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
     * Get Network type. Valid values: `VPC` and `CCN`. Select `VPC` for a Standard or High-Performance file system, and `CCN` for a Standard Turbo or High-Performance Turbo one. 
     * @return NetInterface Network type. Valid values: `VPC` and `CCN`. Select `VPC` for a Standard or High-Performance file system, and `CCN` for a Standard Turbo or High-Performance Turbo one.
     */
    public String getNetInterface() {
        return this.NetInterface;
    }

    /**
     * Set Network type. Valid values: `VPC` and `CCN`. Select `VPC` for a Standard or High-Performance file system, and `CCN` for a Standard Turbo or High-Performance Turbo one.
     * @param NetInterface Network type. Valid values: `VPC` and `CCN`. Select `VPC` for a Standard or High-Performance file system, and `CCN` for a Standard Turbo or High-Performance Turbo one.
     */
    public void setNetInterface(String NetInterface) {
        this.NetInterface = NetInterface;
    }

    /**
     * Get Permission group ID. pgroupbasic is the default permission group. obtain through the api [DescribeCfsPGroups](https://www.tencentcloud.com/document/product/582/38157?from_cn_redirect=1) to query the permission group list. 
     * @return PGroupId Permission group ID. pgroupbasic is the default permission group. obtain through the api [DescribeCfsPGroups](https://www.tencentcloud.com/document/product/582/38157?from_cn_redirect=1) to query the permission group list.
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set Permission group ID. pgroupbasic is the default permission group. obtain through the api [DescribeCfsPGroups](https://www.tencentcloud.com/document/product/582/38157?from_cn_redirect=1) to query the permission group list.
     * @param PGroupId Permission group ID. pgroupbasic is the default permission group. obtain through the api [DescribeCfsPGroups](https://www.tencentcloud.com/document/product/582/38157?from_cn_redirect=1) to query the permission group list.
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get File system protocol type. valid values: NFS, CIFS, and TURBO. if left blank, NFS by default. the TURBO series must select TURBO. NFS and CIFS are not supported. 
     * @return Protocol File system protocol type. valid values: NFS, CIFS, and TURBO. if left blank, NFS by default. the TURBO series must select TURBO. NFS and CIFS are not supported.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set File system protocol type. valid values: NFS, CIFS, and TURBO. if left blank, NFS by default. the TURBO series must select TURBO. NFS and CIFS are not supported.
     * @param Protocol File system protocol type. valid values: NFS, CIFS, and TURBO. if left blank, NFS by default. the TURBO series must select TURBO. NFS and CIFS are not supported.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Storage type of the file system. Valid values: `SD` (Standard), `HP` (High-Performance), `TB` (Standard Turbo), and `TP` (High-Performance Turbo). Default value: `SD`. 
     * @return StorageType Storage type of the file system. Valid values: `SD` (Standard), `HP` (High-Performance), `TB` (Standard Turbo), and `TP` (High-Performance Turbo). Default value: `SD`.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Storage type of the file system. Valid values: `SD` (Standard), `HP` (High-Performance), `TB` (Standard Turbo), and `TP` (High-Performance Turbo). Default value: `SD`.
     * @param StorageType Storage type of the file system. Valid values: `SD` (Standard), `HP` (High-Performance), `TB` (Standard Turbo), and `TP` (High-Performance Turbo). Default value: `SD`.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get Private network (VPC) ID. if the network type is VPC, this field must be specified. obtain it by querying the private network interface.
[DescribeVpcs](https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1) 
     * @return VpcId Private network (VPC) ID. if the network type is VPC, this field must be specified. obtain it by querying the private network interface.
[DescribeVpcs](https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1)
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Private network (VPC) ID. if the network type is VPC, this field must be specified. obtain it by querying the private network interface.
[DescribeVpcs](https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1)
     * @param VpcId Private network (VPC) ID. if the network type is VPC, this field must be specified. obtain it by querying the private network interface.
[DescribeVpcs](https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1)
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID. this field must be specified if the network type is VPC. obtain through the api for querying subnets.
[DescribeSubnets](https://www.tencentcloud.com/document/product/215/15784?from_cn_redirect=1) 
     * @return SubnetId Subnet ID. this field must be specified if the network type is VPC. obtain through the api for querying subnets.
[DescribeSubnets](https://www.tencentcloud.com/document/product/215/15784?from_cn_redirect=1)
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet ID. this field must be specified if the network type is VPC. obtain through the api for querying subnets.
[DescribeSubnets](https://www.tencentcloud.com/document/product/215/15784?from_cn_redirect=1)
     * @param SubnetId Subnet ID. this field must be specified if the network type is VPC. obtain through the api for querying subnets.
[DescribeSubnets](https://www.tencentcloud.com/document/product/215/15784?from_cn_redirect=1)
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get IP address (this parameter supports only the VPC network type, and the Turbo series is not supported). If this parameter is left empty, a random IP in the subnet will be assigned. 
     * @return MountIP IP address (this parameter supports only the VPC network type, and the Turbo series is not supported). If this parameter is left empty, a random IP in the subnet will be assigned.
     */
    public String getMountIP() {
        return this.MountIP;
    }

    /**
     * Set IP address (this parameter supports only the VPC network type, and the Turbo series is not supported). If this parameter is left empty, a random IP in the subnet will be assigned.
     * @param MountIP IP address (this parameter supports only the VPC network type, and the Turbo series is not supported). If this parameter is left empty, a random IP in the subnet will be assigned.
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

    /**
     * Get Cloud connect network ID. this field must be specified if the network type is CCN. obtain it by querying the CCN list through the api.
[DescribeCcns](https://www.tencentcloud.com/document/product/215/19199?from_cn_redirect=1)
 
     * @return CcnId Cloud connect network ID. this field must be specified if the network type is CCN. obtain it by querying the CCN list through the api.
[DescribeCcns](https://www.tencentcloud.com/document/product/215/19199?from_cn_redirect=1)

     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set Cloud connect network ID. this field must be specified if the network type is CCN. obtain it by querying the CCN list through the api.
[DescribeCcns](https://www.tencentcloud.com/document/product/215/19199?from_cn_redirect=1)

     * @param CcnId Cloud connect network ID. this field must be specified if the network type is CCN. obtain it by querying the CCN list through the api.
[DescribeCcns](https://www.tencentcloud.com/document/product/215/19199?from_cn_redirect=1)

     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get CCN IP range used by the CFS (required if the network type is CCN), which cannot conflict with other IP ranges bound in CCN 
     * @return CidrBlock CCN IP range used by the CFS (required if the network type is CCN), which cannot conflict with other IP ranges bound in CCN
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set CCN IP range used by the CFS (required if the network type is CCN), which cannot conflict with other IP ranges bound in CCN
     * @param CidrBlock CCN IP range used by the CFS (required if the network type is CCN), which cannot conflict with other IP ranges bound in CCN
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get File system capacity, required for the turbo series, in GiB. turbo standard type in GB, starting from 20 TiB (20480 GiB); scaling increment 10 TiB (10240 GiB). turbo performance type starts from 10 TiB (10240 GiB); capacity expansion step 10 TiB (10240 GiB). 
     * @return Capacity File system capacity, required for the turbo series, in GiB. turbo standard type in GB, starting from 20 TiB (20480 GiB); scaling increment 10 TiB (10240 GiB). turbo performance type starts from 10 TiB (10240 GiB); capacity expansion step 10 TiB (10240 GiB).
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set File system capacity, required for the turbo series, in GiB. turbo standard type in GB, starting from 20 TiB (20480 GiB); scaling increment 10 TiB (10240 GiB). turbo performance type starts from 10 TiB (10240 GiB); capacity expansion step 10 TiB (10240 GiB).
     * @param Capacity File system capacity, required for the turbo series, in GiB. turbo standard type in GB, starting from 20 TiB (20480 GiB); scaling increment 10 TiB (10240 GiB). turbo performance type starts from 10 TiB (10240 GiB); capacity expansion step 10 TiB (10240 GiB).
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get File system snapshot ID. this parameter can be obtained by querying the snapshot list.
[DescribeCfsSnapshots](https://www.tencentcloud.com/document/product/582/80206?from_cn_redirect=1) 
     * @return SnapshotId File system snapshot ID. this parameter can be obtained by querying the snapshot list.
[DescribeCfsSnapshots](https://www.tencentcloud.com/document/product/582/80206?from_cn_redirect=1)
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set File system snapshot ID. this parameter can be obtained by querying the snapshot list.
[DescribeCfsSnapshots](https://www.tencentcloud.com/document/product/582/80206?from_cn_redirect=1)
     * @param SnapshotId File system snapshot ID. this parameter can be obtained by querying the snapshot list.
[DescribeCfsSnapshots](https://www.tencentcloud.com/document/product/582/80206?from_cn_redirect=1)
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get Scheduled snapshot policy ID, which can be obtained by querying the snapshot policy information.
[DescribeAutoSnapshotPolicies](https://www.tencentcloud.com/document/product/582/38157?from_cn_redirect=1) 
     * @return AutoSnapshotPolicyId Scheduled snapshot policy ID, which can be obtained by querying the snapshot policy information.
[DescribeAutoSnapshotPolicies](https://www.tencentcloud.com/document/product/582/38157?from_cn_redirect=1)
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set Scheduled snapshot policy ID, which can be obtained by querying the snapshot policy information.
[DescribeAutoSnapshotPolicies](https://www.tencentcloud.com/document/product/582/38157?from_cn_redirect=1)
     * @param AutoSnapshotPolicyId Scheduled snapshot policy ID, which can be obtained by querying the snapshot policy information.
[DescribeAutoSnapshotPolicies](https://www.tencentcloud.com/document/product/582/38157?from_cn_redirect=1)
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get Whether default expansion is enabled. only turbo file storage supports this feature. 
     * @return EnableAutoScaleUp Whether default expansion is enabled. only turbo file storage supports this feature.
     */
    public Boolean getEnableAutoScaleUp() {
        return this.EnableAutoScaleUp;
    }

    /**
     * Set Whether default expansion is enabled. only turbo file storage supports this feature.
     * @param EnableAutoScaleUp Whether default expansion is enabled. only turbo file storage supports this feature.
     */
    public void setEnableAutoScaleUp(Boolean EnableAutoScaleUp) {
        this.EnableAutoScaleUp = EnableAutoScaleUp;
    }

    /**
     * Get v1.5: create a standard edition general file system.
v3.1: create an enhanced general file system.
Description: the enhanced universal system requires enabling the allowlist to use. if needed, submit a ticket to contact us. 
     * @return CfsVersion v1.5: create a standard edition general file system.
v3.1: create an enhanced general file system.
Description: the enhanced universal system requires enabling the allowlist to use. if needed, submit a ticket to contact us.
     */
    public String getCfsVersion() {
        return this.CfsVersion;
    }

    /**
     * Set v1.5: create a standard edition general file system.
v3.1: create an enhanced general file system.
Description: the enhanced universal system requires enabling the allowlist to use. if needed, submit a ticket to contact us.
     * @param CfsVersion v1.5: create a standard edition general file system.
v3.1: create an enhanced general file system.
Description: the enhanced universal system requires enabling the allowlist to use. if needed, submit a ticket to contact us.
     */
    public void setCfsVersion(String CfsVersion) {
        this.CfsVersion = CfsVersion;
    }

    /**
     * Get turbo file system metadata attribute.
basic: creates metadata of the standard type.
Enhanced: creates enhanced metadata. 
     * @return MetaType turbo file system metadata attribute.
basic: creates metadata of the standard type.
Enhanced: creates enhanced metadata.
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set turbo file system metadata attribute.
basic: creates metadata of the standard type.
Enhanced: creates enhanced metadata.
     * @param MetaType turbo file system metadata attribute.
basic: creates metadata of the standard type.
Enhanced: creates enhanced metadata.
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
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
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
        if (source.EnableAutoScaleUp != null) {
            this.EnableAutoScaleUp = new Boolean(source.EnableAutoScaleUp);
        }
        if (source.CfsVersion != null) {
            this.CfsVersion = new String(source.CfsVersion);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
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
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamSimple(map, prefix + "EnableAutoScaleUp", this.EnableAutoScaleUp);
        this.setParamSimple(map, prefix + "CfsVersion", this.CfsVersion);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);

    }
}

