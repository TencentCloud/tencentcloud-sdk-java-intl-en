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
    * <p>AZ name</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/213/15707??from_cn_redirect=1">Querying the List of AZs</a></p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Network type</p><p>Valid values:</p><ul><li><p>VPC: Virtual Private Cloud</p></li><li><p>CCN: Cloud Connect Network</p></li><li><p>For General-purpose Standard/Performance (including enhanced) and Throughput types, select VPC.</p></li><li><p>For Turbo Standard/Performance types, VPC or CCN can be selected.</p></li><li><p>When Scenario=AgentSandbox, this parameter is not required for creating AgentCFS and will be ignored if passed in.</p></li></ul>
    */
    @SerializedName("NetInterface")
    @Expose
    private String NetInterface;

    /**
    * <p>Permission group ID. A permission group defines a set of allowlisted visitors and operation permissions.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/api/582/38157?from_cn_redirect=1">DescribeCfsPGroups</a></p><ul><li>pgroupbasic is the default permission group, which allows access and read/write permissions for all IP addresses. </li><li>Note: When Scenario=AgentSandbox, that is, when creating AgentCFS, pgroupbasic (the default permission group) must be passed in. Passing in other values will cause an error.</li></ul>
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * <p>File system protocol type</p><p>Valid values:</p><ul><li>NFS: Instances of General-purpose Standard (including enhanced) and General-purpose Performance (including enhanced) types can be created with this protocol.</li><li>CIFS: The SMB protocol. Only General-purpose Standard and Throughput types in certain AZs support this protocol.</li><li>TURBO: Instances of Turbo Standard/Turbo Performance/AgentCFS types can be created with this protocol.</li></ul><p>Default value: NFS</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>File system storage type. SD indicates General-purpose Standard storage, HP indicates General-purpose Performance storage, TB indicates Turbo Standard, and TP indicates Turbo Performance.</p><p>Valid values:</p><ul><li>SD: General-purpose Standard (including enhanced). For General-purpose Standard, version = v1.5; for General-purpose Standard (enhanced), version = v3.1.</li><li>HP: General-purpose Performance (including enhanced). For General-purpose Performance, version = v1.5; for General-purpose Performance (enhanced), version = v3.1.</li><li>TB: Turbo Standard</li><li>TP: Turbo Performance</li><li>THP: Throughput</li></ul><p>Default value: SD</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>VPC ID. This field is required if VPC is selected as the network type.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1">Querying the List of VPCs</a></p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Subnet ID. This field is required if VPC is selected as the network type.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/215/15784?from_cn_redirect=1">Querying the List of Subnets</a></p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Specifies the IP address. Only VPC networks support this. If this parameter is not specified, an IP address will be randomly assigned from the subnet. Turbo series currently does not support specifying an IP address.</p>
    */
    @SerializedName("MountIP")
    @Expose
    private String MountIP;

    /**
    * <p>User-defined file system name</p>
    */
    @SerializedName("FsName")
    @Expose
    private String FsName;

    /**
    * <p>Indicates whether the file system is encrypted. If this parameter is left empty, the file system is not encrypted by default.</p>
    */
    @SerializedName("Encrypted")
    @Expose
    private Boolean Encrypted;

    /**
    * <p>File system tag</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private TagInfo [] ResourceTags;

    /**
    * <p>String used to ensure the idempotency of the request. This string is generated by the customer and must be unique across different requests, with a maximum length of 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. The string used to ensure idempotency expires after 2 hours.</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>CCN ID. This field is required if CCN is selected as the network type.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/215/19199?from_cn_redirect=1">Querying the List of CCNs</a></p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * <p>CIDR block used by CFS in the CCN. This field is required if CCN is selected as the network type, and it cannot conflict with CIDR blocks already bound in the CCN.</p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p>File system capacity. This parameter is required for Turbo series.</p><p>Unit: GiB</p><p>Turbo Standard starts at 20 TiB, that is, 20,480 GiB, with a scale-out step of 10 TiB, that is, 10,240 GiB. Turbo Performance starts at 10 TiB, that is, 10,240 GiB, with a scale-out step of 10 TiB, that is, 10,240 GiB.</p>
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * <p>File system snapshot ID</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/api/582/80206?from_cn_redirect=1">DescribeCfsSnapshots</a></p>
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * <p>Scheduled snapshot policy ID</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/api/582/80208?from_cn_redirect=1">DescribeAutoSnapshotPolicies</a></p>
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * <p>Indicates whether to enable the automatic scale-out policy. Only turbo file storage supports this feature.</p>
    */
    @SerializedName("EnableAutoScaleUp")
    @Expose
    private Boolean EnableAutoScaleUp;

    /**
    * <p>File system version.</p><p>Valid values:</p><ul><li>v1.5: Creates a General Purpose Standard or General Purpose Performance file system.</li><li>v3.1: Creates a General Purpose Standard (Enhanced) or General Purpose Performance (Enhanced) file system. This parameter is required if you want to create an enhanced file system.</li><li>v4.0: Creates a Turbo Standard, Turbo Performance, or Throughput file system. This parameter is optional.</li></ul><p>To create a General Purpose Standard (Enhanced) or General Purpose Performance (Enhanced) file system, the root account must be added to the allowlist. Contact us if needed.</p>
    */
    @SerializedName("CfsVersion")
    @Expose
    private String CfsVersion;

    /**
    * <p>Metadata type of the Turbo file system.</p><p>Valid values:</p><ul><li>basic: Creates standard metadata.</li><li>enhanced: Creates enhanced metadata.</li></ul><p>For details, see <a href="https://www.tencentcloud.com/document/product/582/116836?from_cn_redirect=1">Turbo File System Metadata Types</a></p>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * <p>Business scenario.</p><p>Valid values:</p><ul><li>AgentSandbox: Required when creating AgentCFS.</li></ul>
    */
    @SerializedName("Scenario")
    @Expose
    private String Scenario;

    /**
     * Get <p>AZ name</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/213/15707??from_cn_redirect=1">Querying the List of AZs</a></p> 
     * @return Zone <p>AZ name</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/213/15707??from_cn_redirect=1">Querying the List of AZs</a></p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>AZ name</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/213/15707??from_cn_redirect=1">Querying the List of AZs</a></p>
     * @param Zone <p>AZ name</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/213/15707??from_cn_redirect=1">Querying the List of AZs</a></p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Network type</p><p>Valid values:</p><ul><li><p>VPC: Virtual Private Cloud</p></li><li><p>CCN: Cloud Connect Network</p></li><li><p>For General-purpose Standard/Performance (including enhanced) and Throughput types, select VPC.</p></li><li><p>For Turbo Standard/Performance types, VPC or CCN can be selected.</p></li><li><p>When Scenario=AgentSandbox, this parameter is not required for creating AgentCFS and will be ignored if passed in.</p></li></ul> 
     * @return NetInterface <p>Network type</p><p>Valid values:</p><ul><li><p>VPC: Virtual Private Cloud</p></li><li><p>CCN: Cloud Connect Network</p></li><li><p>For General-purpose Standard/Performance (including enhanced) and Throughput types, select VPC.</p></li><li><p>For Turbo Standard/Performance types, VPC or CCN can be selected.</p></li><li><p>When Scenario=AgentSandbox, this parameter is not required for creating AgentCFS and will be ignored if passed in.</p></li></ul>
     */
    public String getNetInterface() {
        return this.NetInterface;
    }

    /**
     * Set <p>Network type</p><p>Valid values:</p><ul><li><p>VPC: Virtual Private Cloud</p></li><li><p>CCN: Cloud Connect Network</p></li><li><p>For General-purpose Standard/Performance (including enhanced) and Throughput types, select VPC.</p></li><li><p>For Turbo Standard/Performance types, VPC or CCN can be selected.</p></li><li><p>When Scenario=AgentSandbox, this parameter is not required for creating AgentCFS and will be ignored if passed in.</p></li></ul>
     * @param NetInterface <p>Network type</p><p>Valid values:</p><ul><li><p>VPC: Virtual Private Cloud</p></li><li><p>CCN: Cloud Connect Network</p></li><li><p>For General-purpose Standard/Performance (including enhanced) and Throughput types, select VPC.</p></li><li><p>For Turbo Standard/Performance types, VPC or CCN can be selected.</p></li><li><p>When Scenario=AgentSandbox, this parameter is not required for creating AgentCFS and will be ignored if passed in.</p></li></ul>
     */
    public void setNetInterface(String NetInterface) {
        this.NetInterface = NetInterface;
    }

    /**
     * Get <p>Permission group ID. A permission group defines a set of allowlisted visitors and operation permissions.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/api/582/38157?from_cn_redirect=1">DescribeCfsPGroups</a></p><ul><li>pgroupbasic is the default permission group, which allows access and read/write permissions for all IP addresses. </li><li>Note: When Scenario=AgentSandbox, that is, when creating AgentCFS, pgroupbasic (the default permission group) must be passed in. Passing in other values will cause an error.</li></ul> 
     * @return PGroupId <p>Permission group ID. A permission group defines a set of allowlisted visitors and operation permissions.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/api/582/38157?from_cn_redirect=1">DescribeCfsPGroups</a></p><ul><li>pgroupbasic is the default permission group, which allows access and read/write permissions for all IP addresses. </li><li>Note: When Scenario=AgentSandbox, that is, when creating AgentCFS, pgroupbasic (the default permission group) must be passed in. Passing in other values will cause an error.</li></ul>
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set <p>Permission group ID. A permission group defines a set of allowlisted visitors and operation permissions.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/api/582/38157?from_cn_redirect=1">DescribeCfsPGroups</a></p><ul><li>pgroupbasic is the default permission group, which allows access and read/write permissions for all IP addresses. </li><li>Note: When Scenario=AgentSandbox, that is, when creating AgentCFS, pgroupbasic (the default permission group) must be passed in. Passing in other values will cause an error.</li></ul>
     * @param PGroupId <p>Permission group ID. A permission group defines a set of allowlisted visitors and operation permissions.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/api/582/38157?from_cn_redirect=1">DescribeCfsPGroups</a></p><ul><li>pgroupbasic is the default permission group, which allows access and read/write permissions for all IP addresses. </li><li>Note: When Scenario=AgentSandbox, that is, when creating AgentCFS, pgroupbasic (the default permission group) must be passed in. Passing in other values will cause an error.</li></ul>
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get <p>File system protocol type</p><p>Valid values:</p><ul><li>NFS: Instances of General-purpose Standard (including enhanced) and General-purpose Performance (including enhanced) types can be created with this protocol.</li><li>CIFS: The SMB protocol. Only General-purpose Standard and Throughput types in certain AZs support this protocol.</li><li>TURBO: Instances of Turbo Standard/Turbo Performance/AgentCFS types can be created with this protocol.</li></ul><p>Default value: NFS</p> 
     * @return Protocol <p>File system protocol type</p><p>Valid values:</p><ul><li>NFS: Instances of General-purpose Standard (including enhanced) and General-purpose Performance (including enhanced) types can be created with this protocol.</li><li>CIFS: The SMB protocol. Only General-purpose Standard and Throughput types in certain AZs support this protocol.</li><li>TURBO: Instances of Turbo Standard/Turbo Performance/AgentCFS types can be created with this protocol.</li></ul><p>Default value: NFS</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>File system protocol type</p><p>Valid values:</p><ul><li>NFS: Instances of General-purpose Standard (including enhanced) and General-purpose Performance (including enhanced) types can be created with this protocol.</li><li>CIFS: The SMB protocol. Only General-purpose Standard and Throughput types in certain AZs support this protocol.</li><li>TURBO: Instances of Turbo Standard/Turbo Performance/AgentCFS types can be created with this protocol.</li></ul><p>Default value: NFS</p>
     * @param Protocol <p>File system protocol type</p><p>Valid values:</p><ul><li>NFS: Instances of General-purpose Standard (including enhanced) and General-purpose Performance (including enhanced) types can be created with this protocol.</li><li>CIFS: The SMB protocol. Only General-purpose Standard and Throughput types in certain AZs support this protocol.</li><li>TURBO: Instances of Turbo Standard/Turbo Performance/AgentCFS types can be created with this protocol.</li></ul><p>Default value: NFS</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>File system storage type. SD indicates General-purpose Standard storage, HP indicates General-purpose Performance storage, TB indicates Turbo Standard, and TP indicates Turbo Performance.</p><p>Valid values:</p><ul><li>SD: General-purpose Standard (including enhanced). For General-purpose Standard, version = v1.5; for General-purpose Standard (enhanced), version = v3.1.</li><li>HP: General-purpose Performance (including enhanced). For General-purpose Performance, version = v1.5; for General-purpose Performance (enhanced), version = v3.1.</li><li>TB: Turbo Standard</li><li>TP: Turbo Performance</li><li>THP: Throughput</li></ul><p>Default value: SD</p> 
     * @return StorageType <p>File system storage type. SD indicates General-purpose Standard storage, HP indicates General-purpose Performance storage, TB indicates Turbo Standard, and TP indicates Turbo Performance.</p><p>Valid values:</p><ul><li>SD: General-purpose Standard (including enhanced). For General-purpose Standard, version = v1.5; for General-purpose Standard (enhanced), version = v3.1.</li><li>HP: General-purpose Performance (including enhanced). For General-purpose Performance, version = v1.5; for General-purpose Performance (enhanced), version = v3.1.</li><li>TB: Turbo Standard</li><li>TP: Turbo Performance</li><li>THP: Throughput</li></ul><p>Default value: SD</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>File system storage type. SD indicates General-purpose Standard storage, HP indicates General-purpose Performance storage, TB indicates Turbo Standard, and TP indicates Turbo Performance.</p><p>Valid values:</p><ul><li>SD: General-purpose Standard (including enhanced). For General-purpose Standard, version = v1.5; for General-purpose Standard (enhanced), version = v3.1.</li><li>HP: General-purpose Performance (including enhanced). For General-purpose Performance, version = v1.5; for General-purpose Performance (enhanced), version = v3.1.</li><li>TB: Turbo Standard</li><li>TP: Turbo Performance</li><li>THP: Throughput</li></ul><p>Default value: SD</p>
     * @param StorageType <p>File system storage type. SD indicates General-purpose Standard storage, HP indicates General-purpose Performance storage, TB indicates Turbo Standard, and TP indicates Turbo Performance.</p><p>Valid values:</p><ul><li>SD: General-purpose Standard (including enhanced). For General-purpose Standard, version = v1.5; for General-purpose Standard (enhanced), version = v3.1.</li><li>HP: General-purpose Performance (including enhanced). For General-purpose Performance, version = v1.5; for General-purpose Performance (enhanced), version = v3.1.</li><li>TB: Turbo Standard</li><li>TP: Turbo Performance</li><li>THP: Throughput</li></ul><p>Default value: SD</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>VPC ID. This field is required if VPC is selected as the network type.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1">Querying the List of VPCs</a></p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p> 
     * @return VpcId <p>VPC ID. This field is required if VPC is selected as the network type.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1">Querying the List of VPCs</a></p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID. This field is required if VPC is selected as the network type.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1">Querying the List of VPCs</a></p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
     * @param VpcId <p>VPC ID. This field is required if VPC is selected as the network type.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/215/15778?from_cn_redirect=1">Querying the List of VPCs</a></p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet ID. This field is required if VPC is selected as the network type.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/215/15784?from_cn_redirect=1">Querying the List of Subnets</a></p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p> 
     * @return SubnetId <p>Subnet ID. This field is required if VPC is selected as the network type.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/215/15784?from_cn_redirect=1">Querying the List of Subnets</a></p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID. This field is required if VPC is selected as the network type.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/215/15784?from_cn_redirect=1">Querying the List of Subnets</a></p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
     * @param SubnetId <p>Subnet ID. This field is required if VPC is selected as the network type.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/215/15784?from_cn_redirect=1">Querying the List of Subnets</a></p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Specifies the IP address. Only VPC networks support this. If this parameter is not specified, an IP address will be randomly assigned from the subnet. Turbo series currently does not support specifying an IP address.</p> 
     * @return MountIP <p>Specifies the IP address. Only VPC networks support this. If this parameter is not specified, an IP address will be randomly assigned from the subnet. Turbo series currently does not support specifying an IP address.</p>
     */
    public String getMountIP() {
        return this.MountIP;
    }

    /**
     * Set <p>Specifies the IP address. Only VPC networks support this. If this parameter is not specified, an IP address will be randomly assigned from the subnet. Turbo series currently does not support specifying an IP address.</p>
     * @param MountIP <p>Specifies the IP address. Only VPC networks support this. If this parameter is not specified, an IP address will be randomly assigned from the subnet. Turbo series currently does not support specifying an IP address.</p>
     */
    public void setMountIP(String MountIP) {
        this.MountIP = MountIP;
    }

    /**
     * Get <p>User-defined file system name</p> 
     * @return FsName <p>User-defined file system name</p>
     */
    public String getFsName() {
        return this.FsName;
    }

    /**
     * Set <p>User-defined file system name</p>
     * @param FsName <p>User-defined file system name</p>
     */
    public void setFsName(String FsName) {
        this.FsName = FsName;
    }

    /**
     * Get <p>Indicates whether the file system is encrypted. If this parameter is left empty, the file system is not encrypted by default.</p> 
     * @return Encrypted <p>Indicates whether the file system is encrypted. If this parameter is left empty, the file system is not encrypted by default.</p>
     */
    public Boolean getEncrypted() {
        return this.Encrypted;
    }

    /**
     * Set <p>Indicates whether the file system is encrypted. If this parameter is left empty, the file system is not encrypted by default.</p>
     * @param Encrypted <p>Indicates whether the file system is encrypted. If this parameter is left empty, the file system is not encrypted by default.</p>
     */
    public void setEncrypted(Boolean Encrypted) {
        this.Encrypted = Encrypted;
    }

    /**
     * Get <p>File system tag</p> 
     * @return ResourceTags <p>File system tag</p>
     */
    public TagInfo [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>File system tag</p>
     * @param ResourceTags <p>File system tag</p>
     */
    public void setResourceTags(TagInfo [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>String used to ensure the idempotency of the request. This string is generated by the customer and must be unique across different requests, with a maximum length of 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. The string used to ensure idempotency expires after 2 hours.</p> 
     * @return ClientToken <p>String used to ensure the idempotency of the request. This string is generated by the customer and must be unique across different requests, with a maximum length of 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. The string used to ensure idempotency expires after 2 hours.</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>String used to ensure the idempotency of the request. This string is generated by the customer and must be unique across different requests, with a maximum length of 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. The string used to ensure idempotency expires after 2 hours.</p>
     * @param ClientToken <p>String used to ensure the idempotency of the request. This string is generated by the customer and must be unique across different requests, with a maximum length of 64 ASCII characters. If this parameter is not specified, the idempotency of the request cannot be guaranteed. The string used to ensure idempotency expires after 2 hours.</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>CCN ID. This field is required if CCN is selected as the network type.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/215/19199?from_cn_redirect=1">Querying the List of CCNs</a></p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p> 
     * @return CcnId <p>CCN ID. This field is required if CCN is selected as the network type.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/215/19199?from_cn_redirect=1">Querying the List of CCNs</a></p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set <p>CCN ID. This field is required if CCN is selected as the network type.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/215/19199?from_cn_redirect=1">Querying the List of CCNs</a></p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
     * @param CcnId <p>CCN ID. This field is required if CCN is selected as the network type.</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/product/215/19199?from_cn_redirect=1">Querying the List of CCNs</a></p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get <p>CIDR block used by CFS in the CCN. This field is required if CCN is selected as the network type, and it cannot conflict with CIDR blocks already bound in the CCN.</p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p> 
     * @return CidrBlock <p>CIDR block used by CFS in the CCN. This field is required if CCN is selected as the network type, and it cannot conflict with CIDR blocks already bound in the CCN.</p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>CIDR block used by CFS in the CCN. This field is required if CCN is selected as the network type, and it cannot conflict with CIDR blocks already bound in the CCN.</p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
     * @param CidrBlock <p>CIDR block used by CFS in the CCN. This field is required if CCN is selected as the network type, and it cannot conflict with CIDR blocks already bound in the CCN.</p><p>When Scenario=AgentSandbox, that is, when creating AgentCFS, this parameter is not required and will be ignored if passed in.</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get <p>File system capacity. This parameter is required for Turbo series.</p><p>Unit: GiB</p><p>Turbo Standard starts at 20 TiB, that is, 20,480 GiB, with a scale-out step of 10 TiB, that is, 10,240 GiB. Turbo Performance starts at 10 TiB, that is, 10,240 GiB, with a scale-out step of 10 TiB, that is, 10,240 GiB.</p> 
     * @return Capacity <p>File system capacity. This parameter is required for Turbo series.</p><p>Unit: GiB</p><p>Turbo Standard starts at 20 TiB, that is, 20,480 GiB, with a scale-out step of 10 TiB, that is, 10,240 GiB. Turbo Performance starts at 10 TiB, that is, 10,240 GiB, with a scale-out step of 10 TiB, that is, 10,240 GiB.</p>
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set <p>File system capacity. This parameter is required for Turbo series.</p><p>Unit: GiB</p><p>Turbo Standard starts at 20 TiB, that is, 20,480 GiB, with a scale-out step of 10 TiB, that is, 10,240 GiB. Turbo Performance starts at 10 TiB, that is, 10,240 GiB, with a scale-out step of 10 TiB, that is, 10,240 GiB.</p>
     * @param Capacity <p>File system capacity. This parameter is required for Turbo series.</p><p>Unit: GiB</p><p>Turbo Standard starts at 20 TiB, that is, 20,480 GiB, with a scale-out step of 10 TiB, that is, 10,240 GiB. Turbo Performance starts at 10 TiB, that is, 10,240 GiB, with a scale-out step of 10 TiB, that is, 10,240 GiB.</p>
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get <p>File system snapshot ID</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/api/582/80206?from_cn_redirect=1">DescribeCfsSnapshots</a></p> 
     * @return SnapshotId <p>File system snapshot ID</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/api/582/80206?from_cn_redirect=1">DescribeCfsSnapshots</a></p>
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set <p>File system snapshot ID</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/api/582/80206?from_cn_redirect=1">DescribeCfsSnapshots</a></p>
     * @param SnapshotId <p>File system snapshot ID</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/api/582/80206?from_cn_redirect=1">DescribeCfsSnapshots</a></p>
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get <p>Scheduled snapshot policy ID</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/api/582/80208?from_cn_redirect=1">DescribeAutoSnapshotPolicies</a></p> 
     * @return AutoSnapshotPolicyId <p>Scheduled snapshot policy ID</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/api/582/80208?from_cn_redirect=1">DescribeAutoSnapshotPolicies</a></p>
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set <p>Scheduled snapshot policy ID</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/api/582/80208?from_cn_redirect=1">DescribeAutoSnapshotPolicies</a></p>
     * @param AutoSnapshotPolicyId <p>Scheduled snapshot policy ID</p><p>For valid values, see <a href="https://www.tencentcloud.com/document/api/582/80208?from_cn_redirect=1">DescribeAutoSnapshotPolicies</a></p>
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get <p>Indicates whether to enable the automatic scale-out policy. Only turbo file storage supports this feature.</p> 
     * @return EnableAutoScaleUp <p>Indicates whether to enable the automatic scale-out policy. Only turbo file storage supports this feature.</p>
     */
    public Boolean getEnableAutoScaleUp() {
        return this.EnableAutoScaleUp;
    }

    /**
     * Set <p>Indicates whether to enable the automatic scale-out policy. Only turbo file storage supports this feature.</p>
     * @param EnableAutoScaleUp <p>Indicates whether to enable the automatic scale-out policy. Only turbo file storage supports this feature.</p>
     */
    public void setEnableAutoScaleUp(Boolean EnableAutoScaleUp) {
        this.EnableAutoScaleUp = EnableAutoScaleUp;
    }

    /**
     * Get <p>File system version.</p><p>Valid values:</p><ul><li>v1.5: Creates a General Purpose Standard or General Purpose Performance file system.</li><li>v3.1: Creates a General Purpose Standard (Enhanced) or General Purpose Performance (Enhanced) file system. This parameter is required if you want to create an enhanced file system.</li><li>v4.0: Creates a Turbo Standard, Turbo Performance, or Throughput file system. This parameter is optional.</li></ul><p>To create a General Purpose Standard (Enhanced) or General Purpose Performance (Enhanced) file system, the root account must be added to the allowlist. Contact us if needed.</p> 
     * @return CfsVersion <p>File system version.</p><p>Valid values:</p><ul><li>v1.5: Creates a General Purpose Standard or General Purpose Performance file system.</li><li>v3.1: Creates a General Purpose Standard (Enhanced) or General Purpose Performance (Enhanced) file system. This parameter is required if you want to create an enhanced file system.</li><li>v4.0: Creates a Turbo Standard, Turbo Performance, or Throughput file system. This parameter is optional.</li></ul><p>To create a General Purpose Standard (Enhanced) or General Purpose Performance (Enhanced) file system, the root account must be added to the allowlist. Contact us if needed.</p>
     */
    public String getCfsVersion() {
        return this.CfsVersion;
    }

    /**
     * Set <p>File system version.</p><p>Valid values:</p><ul><li>v1.5: Creates a General Purpose Standard or General Purpose Performance file system.</li><li>v3.1: Creates a General Purpose Standard (Enhanced) or General Purpose Performance (Enhanced) file system. This parameter is required if you want to create an enhanced file system.</li><li>v4.0: Creates a Turbo Standard, Turbo Performance, or Throughput file system. This parameter is optional.</li></ul><p>To create a General Purpose Standard (Enhanced) or General Purpose Performance (Enhanced) file system, the root account must be added to the allowlist. Contact us if needed.</p>
     * @param CfsVersion <p>File system version.</p><p>Valid values:</p><ul><li>v1.5: Creates a General Purpose Standard or General Purpose Performance file system.</li><li>v3.1: Creates a General Purpose Standard (Enhanced) or General Purpose Performance (Enhanced) file system. This parameter is required if you want to create an enhanced file system.</li><li>v4.0: Creates a Turbo Standard, Turbo Performance, or Throughput file system. This parameter is optional.</li></ul><p>To create a General Purpose Standard (Enhanced) or General Purpose Performance (Enhanced) file system, the root account must be added to the allowlist. Contact us if needed.</p>
     */
    public void setCfsVersion(String CfsVersion) {
        this.CfsVersion = CfsVersion;
    }

    /**
     * Get <p>Metadata type of the Turbo file system.</p><p>Valid values:</p><ul><li>basic: Creates standard metadata.</li><li>enhanced: Creates enhanced metadata.</li></ul><p>For details, see <a href="https://www.tencentcloud.com/document/product/582/116836?from_cn_redirect=1">Turbo File System Metadata Types</a></p> 
     * @return MetaType <p>Metadata type of the Turbo file system.</p><p>Valid values:</p><ul><li>basic: Creates standard metadata.</li><li>enhanced: Creates enhanced metadata.</li></ul><p>For details, see <a href="https://www.tencentcloud.com/document/product/582/116836?from_cn_redirect=1">Turbo File System Metadata Types</a></p>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set <p>Metadata type of the Turbo file system.</p><p>Valid values:</p><ul><li>basic: Creates standard metadata.</li><li>enhanced: Creates enhanced metadata.</li></ul><p>For details, see <a href="https://www.tencentcloud.com/document/product/582/116836?from_cn_redirect=1">Turbo File System Metadata Types</a></p>
     * @param MetaType <p>Metadata type of the Turbo file system.</p><p>Valid values:</p><ul><li>basic: Creates standard metadata.</li><li>enhanced: Creates enhanced metadata.</li></ul><p>For details, see <a href="https://www.tencentcloud.com/document/product/582/116836?from_cn_redirect=1">Turbo File System Metadata Types</a></p>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get <p>Business scenario.</p><p>Valid values:</p><ul><li>AgentSandbox: Required when creating AgentCFS.</li></ul> 
     * @return Scenario <p>Business scenario.</p><p>Valid values:</p><ul><li>AgentSandbox: Required when creating AgentCFS.</li></ul>
     */
    public String getScenario() {
        return this.Scenario;
    }

    /**
     * Set <p>Business scenario.</p><p>Valid values:</p><ul><li>AgentSandbox: Required when creating AgentCFS.</li></ul>
     * @param Scenario <p>Business scenario.</p><p>Valid values:</p><ul><li>AgentSandbox: Required when creating AgentCFS.</li></ul>
     */
    public void setScenario(String Scenario) {
        this.Scenario = Scenario;
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
        if (source.Encrypted != null) {
            this.Encrypted = new Boolean(source.Encrypted);
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
        if (source.Scenario != null) {
            this.Scenario = new String(source.Scenario);
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
        this.setParamSimple(map, prefix + "Encrypted", this.Encrypted);
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
        this.setParamSimple(map, prefix + "Scenario", this.Scenario);

    }
}

