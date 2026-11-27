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

public class DescribeCfsFileSystemsRequest extends AbstractModel {

    /**
    * <p>File system ID.</p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>Virtual Private Cloud (VPC) ID.</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Subnet ID.</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Offset for pagination. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Limit for page size. Default value: 10.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>User-defined name.</p>
    */
    @SerializedName("CreationToken")
    @Expose
    private String CreationToken;

    /**
    * <p>Filter conditions.<br><br><li>Protocol - Array of String - optional - (Filter condition) Filters by protocol. (NFS | CIFS | TURBO) </li><br><br><li>StorageType - Array of String - optional - (Filter condition) Filters by storage type. (SD | HP | TB | TP | THP) </li><br><br><li>LifeCycleState - Array of String - optional - (Filter condition) Filters by lifecycle state. (creating | create_failed | available | deleting | delete_failed | upgrading | unserviced | expanding) </li><br><br><li>Zone - Array of String - optional - (Filter condition) Filters by AZ. (For example: ap-guangzhou-3) </li><br><br><li>IpAddress - Array of String - optional - (Filter condition) Filters by export point IP address. (For example: 10.0.0.3) </li><br><br><li>PGroupId - Array of String - optional - (Filter condition) Filters by permission group ID. (For example: pgroup-xxxxxrxt) </li><br><br><li>PGroupName - Array of String - optional - (Filter condition) Filters by permission group name. (For example: default permission group) </li><br><br><li>Scenario- Array of String - optional - (Filter condition) Filters by permission group name. (For example: AgentSandbox) </li></p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>Tag.</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get <p>File system ID.</p> 
     * @return FileSystemId <p>File system ID.</p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>File system ID.</p>
     * @param FileSystemId <p>File system ID.</p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>Virtual Private Cloud (VPC) ID.</p> 
     * @return VpcId <p>Virtual Private Cloud (VPC) ID.</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>Virtual Private Cloud (VPC) ID.</p>
     * @param VpcId <p>Virtual Private Cloud (VPC) ID.</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Subnet ID.</p> 
     * @return SubnetId <p>Subnet ID.</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Subnet ID.</p>
     * @param SubnetId <p>Subnet ID.</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Offset for pagination. Default value: 0.</p> 
     * @return Offset <p>Offset for pagination. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset for pagination. Default value: 0.</p>
     * @param Offset <p>Offset for pagination. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Limit for page size. Default value: 10.</p> 
     * @return Limit <p>Limit for page size. Default value: 10.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Limit for page size. Default value: 10.</p>
     * @param Limit <p>Limit for page size. Default value: 10.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>User-defined name.</p> 
     * @return CreationToken <p>User-defined name.</p>
     */
    public String getCreationToken() {
        return this.CreationToken;
    }

    /**
     * Set <p>User-defined name.</p>
     * @param CreationToken <p>User-defined name.</p>
     */
    public void setCreationToken(String CreationToken) {
        this.CreationToken = CreationToken;
    }

    /**
     * Get <p>Filter conditions.<br><br><li>Protocol - Array of String - optional - (Filter condition) Filters by protocol. (NFS | CIFS | TURBO) </li><br><br><li>StorageType - Array of String - optional - (Filter condition) Filters by storage type. (SD | HP | TB | TP | THP) </li><br><br><li>LifeCycleState - Array of String - optional - (Filter condition) Filters by lifecycle state. (creating | create_failed | available | deleting | delete_failed | upgrading | unserviced | expanding) </li><br><br><li>Zone - Array of String - optional - (Filter condition) Filters by AZ. (For example: ap-guangzhou-3) </li><br><br><li>IpAddress - Array of String - optional - (Filter condition) Filters by export point IP address. (For example: 10.0.0.3) </li><br><br><li>PGroupId - Array of String - optional - (Filter condition) Filters by permission group ID. (For example: pgroup-xxxxxrxt) </li><br><br><li>PGroupName - Array of String - optional - (Filter condition) Filters by permission group name. (For example: default permission group) </li><br><br><li>Scenario- Array of String - optional - (Filter condition) Filters by permission group name. (For example: AgentSandbox) </li></p> 
     * @return Filters <p>Filter conditions.<br><br><li>Protocol - Array of String - optional - (Filter condition) Filters by protocol. (NFS | CIFS | TURBO) </li><br><br><li>StorageType - Array of String - optional - (Filter condition) Filters by storage type. (SD | HP | TB | TP | THP) </li><br><br><li>LifeCycleState - Array of String - optional - (Filter condition) Filters by lifecycle state. (creating | create_failed | available | deleting | delete_failed | upgrading | unserviced | expanding) </li><br><br><li>Zone - Array of String - optional - (Filter condition) Filters by AZ. (For example: ap-guangzhou-3) </li><br><br><li>IpAddress - Array of String - optional - (Filter condition) Filters by export point IP address. (For example: 10.0.0.3) </li><br><br><li>PGroupId - Array of String - optional - (Filter condition) Filters by permission group ID. (For example: pgroup-xxxxxrxt) </li><br><br><li>PGroupName - Array of String - optional - (Filter condition) Filters by permission group name. (For example: default permission group) </li><br><br><li>Scenario- Array of String - optional - (Filter condition) Filters by permission group name. (For example: AgentSandbox) </li></p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter conditions.<br><br><li>Protocol - Array of String - optional - (Filter condition) Filters by protocol. (NFS | CIFS | TURBO) </li><br><br><li>StorageType - Array of String - optional - (Filter condition) Filters by storage type. (SD | HP | TB | TP | THP) </li><br><br><li>LifeCycleState - Array of String - optional - (Filter condition) Filters by lifecycle state. (creating | create_failed | available | deleting | delete_failed | upgrading | unserviced | expanding) </li><br><br><li>Zone - Array of String - optional - (Filter condition) Filters by AZ. (For example: ap-guangzhou-3) </li><br><br><li>IpAddress - Array of String - optional - (Filter condition) Filters by export point IP address. (For example: 10.0.0.3) </li><br><br><li>PGroupId - Array of String - optional - (Filter condition) Filters by permission group ID. (For example: pgroup-xxxxxrxt) </li><br><br><li>PGroupName - Array of String - optional - (Filter condition) Filters by permission group name. (For example: default permission group) </li><br><br><li>Scenario- Array of String - optional - (Filter condition) Filters by permission group name. (For example: AgentSandbox) </li></p>
     * @param Filters <p>Filter conditions.<br><br><li>Protocol - Array of String - optional - (Filter condition) Filters by protocol. (NFS | CIFS | TURBO) </li><br><br><li>StorageType - Array of String - optional - (Filter condition) Filters by storage type. (SD | HP | TB | TP | THP) </li><br><br><li>LifeCycleState - Array of String - optional - (Filter condition) Filters by lifecycle state. (creating | create_failed | available | deleting | delete_failed | upgrading | unserviced | expanding) </li><br><br><li>Zone - Array of String - optional - (Filter condition) Filters by AZ. (For example: ap-guangzhou-3) </li><br><br><li>IpAddress - Array of String - optional - (Filter condition) Filters by export point IP address. (For example: 10.0.0.3) </li><br><br><li>PGroupId - Array of String - optional - (Filter condition) Filters by permission group ID. (For example: pgroup-xxxxxrxt) </li><br><br><li>PGroupName - Array of String - optional - (Filter condition) Filters by permission group name. (For example: default permission group) </li><br><br><li>Scenario- Array of String - optional - (Filter condition) Filters by permission group name. (For example: AgentSandbox) </li></p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Tag.</p> 
     * @return Tags <p>Tag.</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag.</p>
     * @param Tags <p>Tag.</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public DescribeCfsFileSystemsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfsFileSystemsRequest(DescribeCfsFileSystemsRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CreationToken != null) {
            this.CreationToken = new String(source.CreationToken);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CreationToken", this.CreationToken);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

