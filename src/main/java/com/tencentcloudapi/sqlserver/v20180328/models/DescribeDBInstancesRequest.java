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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesRequest extends AbstractModel {

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Instance status. Valid values:
<li>1: applying</li>
<li>2: running</li>
<li>3: running restrictedly (primary/secondary switching)</li>
<li>4: isolated</li>
<li>5: repossessing</li>
<li>6: repossessed</li>
<li>7: executing task (e.g., backing up or rolling back instance)</li>
<li>8: deactivated</li>
<li>9: scaling out instance</li>
<li>10: migrating instance</li>
<li>11: read-only</li>
<li>12: restarting</li>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Page number. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results per page. Value range: 1-100. Default value: 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * One or more instance IDs in the format of mssql-si2823jyl
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * Retrieves billing type. 0: pay-as-you-go
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Unique string-type ID of instance VPC in the format of `vpc-xxx`. If an empty string ("") is passed in, filtering will be made by basic network.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Unique string-type ID of instance subnet in the format of `subnet-xxx`. If an empty string ("") is passed in, filtering will be made by basic network.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The list of instance private IPs, such as 172.1.0.12
    */
    @SerializedName("VipSet")
    @Expose
    private String [] VipSet;

    /**
    * The list of instance names used for fuzzy match
    */
    @SerializedName("InstanceNameSet")
    @Expose
    private String [] InstanceNameSet;

    /**
    * The list of instance version numbers, such as 2008R2, 2012SP3
    */
    @SerializedName("VersionSet")
    @Expose
    private String [] VersionSet;

    /**
    * Instance availability zone, such as ap-guangzhou-3
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * The list of instance tags
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * Keyword used for fuzzy match, including instance ID, instance name, and instance private IP
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Unique Uid of an instance
    */
    @SerializedName("UidSet")
    @Expose
    private String [] UidSet;

    /**
    * Instance type. HA: high-availability instance; RO: read-only instance; SI: basic edition instance; BI: business intelligence service instance; cvmHA: dual-server high-availability instance with cloud disk; cvmRO: read-only instance with cloud disk; MultiHA: multi-node instance; cvmMultiHA: multi-node instance with cloud disk.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Pagination query method. offset - pagination query by offset; pageNumber - pagination query by number of pages. The default value is pageNumber.
    */
    @SerializedName("PaginationType")
    @Expose
    private String PaginationType;

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Instance status. Valid values:
<li>1: applying</li>
<li>2: running</li>
<li>3: running restrictedly (primary/secondary switching)</li>
<li>4: isolated</li>
<li>5: repossessing</li>
<li>6: repossessed</li>
<li>7: executing task (e.g., backing up or rolling back instance)</li>
<li>8: deactivated</li>
<li>9: scaling out instance</li>
<li>10: migrating instance</li>
<li>11: read-only</li>
<li>12: restarting</li> 
     * @return Status Instance status. Valid values:
<li>1: applying</li>
<li>2: running</li>
<li>3: running restrictedly (primary/secondary switching)</li>
<li>4: isolated</li>
<li>5: repossessing</li>
<li>6: repossessed</li>
<li>7: executing task (e.g., backing up or rolling back instance)</li>
<li>8: deactivated</li>
<li>9: scaling out instance</li>
<li>10: migrating instance</li>
<li>11: read-only</li>
<li>12: restarting</li>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status. Valid values:
<li>1: applying</li>
<li>2: running</li>
<li>3: running restrictedly (primary/secondary switching)</li>
<li>4: isolated</li>
<li>5: repossessing</li>
<li>6: repossessed</li>
<li>7: executing task (e.g., backing up or rolling back instance)</li>
<li>8: deactivated</li>
<li>9: scaling out instance</li>
<li>10: migrating instance</li>
<li>11: read-only</li>
<li>12: restarting</li>
     * @param Status Instance status. Valid values:
<li>1: applying</li>
<li>2: running</li>
<li>3: running restrictedly (primary/secondary switching)</li>
<li>4: isolated</li>
<li>5: repossessing</li>
<li>6: repossessed</li>
<li>7: executing task (e.g., backing up or rolling back instance)</li>
<li>8: deactivated</li>
<li>9: scaling out instance</li>
<li>10: migrating instance</li>
<li>11: read-only</li>
<li>12: restarting</li>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Page number. Default value: 0 
     * @return Offset Page number. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number. Default value: 0
     * @param Offset Page number. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results per page. Value range: 1-100. Default value: 100 
     * @return Limit Number of results per page. Value range: 1-100. Default value: 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results per page. Value range: 1-100. Default value: 100
     * @param Limit Number of results per page. Value range: 1-100. Default value: 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get One or more instance IDs in the format of mssql-si2823jyl 
     * @return InstanceIdSet One or more instance IDs in the format of mssql-si2823jyl
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set One or more instance IDs in the format of mssql-si2823jyl
     * @param InstanceIdSet One or more instance IDs in the format of mssql-si2823jyl
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get Retrieves billing type. 0: pay-as-you-go 
     * @return PayMode Retrieves billing type. 0: pay-as-you-go
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Retrieves billing type. 0: pay-as-you-go
     * @param PayMode Retrieves billing type. 0: pay-as-you-go
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Unique string-type ID of instance VPC in the format of `vpc-xxx`. If an empty string ("") is passed in, filtering will be made by basic network. 
     * @return VpcId Unique string-type ID of instance VPC in the format of `vpc-xxx`. If an empty string ("") is passed in, filtering will be made by basic network.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unique string-type ID of instance VPC in the format of `vpc-xxx`. If an empty string ("") is passed in, filtering will be made by basic network.
     * @param VpcId Unique string-type ID of instance VPC in the format of `vpc-xxx`. If an empty string ("") is passed in, filtering will be made by basic network.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Unique string-type ID of instance subnet in the format of `subnet-xxx`. If an empty string ("") is passed in, filtering will be made by basic network. 
     * @return SubnetId Unique string-type ID of instance subnet in the format of `subnet-xxx`. If an empty string ("") is passed in, filtering will be made by basic network.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Unique string-type ID of instance subnet in the format of `subnet-xxx`. If an empty string ("") is passed in, filtering will be made by basic network.
     * @param SubnetId Unique string-type ID of instance subnet in the format of `subnet-xxx`. If an empty string ("") is passed in, filtering will be made by basic network.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get The list of instance private IPs, such as 172.1.0.12 
     * @return VipSet The list of instance private IPs, such as 172.1.0.12
     */
    public String [] getVipSet() {
        return this.VipSet;
    }

    /**
     * Set The list of instance private IPs, such as 172.1.0.12
     * @param VipSet The list of instance private IPs, such as 172.1.0.12
     */
    public void setVipSet(String [] VipSet) {
        this.VipSet = VipSet;
    }

    /**
     * Get The list of instance names used for fuzzy match 
     * @return InstanceNameSet The list of instance names used for fuzzy match
     */
    public String [] getInstanceNameSet() {
        return this.InstanceNameSet;
    }

    /**
     * Set The list of instance names used for fuzzy match
     * @param InstanceNameSet The list of instance names used for fuzzy match
     */
    public void setInstanceNameSet(String [] InstanceNameSet) {
        this.InstanceNameSet = InstanceNameSet;
    }

    /**
     * Get The list of instance version numbers, such as 2008R2, 2012SP3 
     * @return VersionSet The list of instance version numbers, such as 2008R2, 2012SP3
     */
    public String [] getVersionSet() {
        return this.VersionSet;
    }

    /**
     * Set The list of instance version numbers, such as 2008R2, 2012SP3
     * @param VersionSet The list of instance version numbers, such as 2008R2, 2012SP3
     */
    public void setVersionSet(String [] VersionSet) {
        this.VersionSet = VersionSet;
    }

    /**
     * Get Instance availability zone, such as ap-guangzhou-3 
     * @return Zone Instance availability zone, such as ap-guangzhou-3
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Instance availability zone, such as ap-guangzhou-3
     * @param Zone Instance availability zone, such as ap-guangzhou-3
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get The list of instance tags 
     * @return TagKeys The list of instance tags
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set The list of instance tags
     * @param TagKeys The list of instance tags
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get Keyword used for fuzzy match, including instance ID, instance name, and instance private IP 
     * @return SearchKey Keyword used for fuzzy match, including instance ID, instance name, and instance private IP
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Keyword used for fuzzy match, including instance ID, instance name, and instance private IP
     * @param SearchKey Keyword used for fuzzy match, including instance ID, instance name, and instance private IP
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Unique Uid of an instance 
     * @return UidSet Unique Uid of an instance
     */
    public String [] getUidSet() {
        return this.UidSet;
    }

    /**
     * Set Unique Uid of an instance
     * @param UidSet Unique Uid of an instance
     */
    public void setUidSet(String [] UidSet) {
        this.UidSet = UidSet;
    }

    /**
     * Get Instance type. HA: high-availability instance; RO: read-only instance; SI: basic edition instance; BI: business intelligence service instance; cvmHA: dual-server high-availability instance with cloud disk; cvmRO: read-only instance with cloud disk; MultiHA: multi-node instance; cvmMultiHA: multi-node instance with cloud disk. 
     * @return InstanceType Instance type. HA: high-availability instance; RO: read-only instance; SI: basic edition instance; BI: business intelligence service instance; cvmHA: dual-server high-availability instance with cloud disk; cvmRO: read-only instance with cloud disk; MultiHA: multi-node instance; cvmMultiHA: multi-node instance with cloud disk.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. HA: high-availability instance; RO: read-only instance; SI: basic edition instance; BI: business intelligence service instance; cvmHA: dual-server high-availability instance with cloud disk; cvmRO: read-only instance with cloud disk; MultiHA: multi-node instance; cvmMultiHA: multi-node instance with cloud disk.
     * @param InstanceType Instance type. HA: high-availability instance; RO: read-only instance; SI: basic edition instance; BI: business intelligence service instance; cvmHA: dual-server high-availability instance with cloud disk; cvmRO: read-only instance with cloud disk; MultiHA: multi-node instance; cvmMultiHA: multi-node instance with cloud disk.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Pagination query method. offset - pagination query by offset; pageNumber - pagination query by number of pages. The default value is pageNumber. 
     * @return PaginationType Pagination query method. offset - pagination query by offset; pageNumber - pagination query by number of pages. The default value is pageNumber.
     */
    public String getPaginationType() {
        return this.PaginationType;
    }

    /**
     * Set Pagination query method. offset - pagination query by offset; pageNumber - pagination query by number of pages. The default value is pageNumber.
     * @param PaginationType Pagination query method. offset - pagination query by offset; pageNumber - pagination query by number of pages. The default value is pageNumber.
     */
    public void setPaginationType(String PaginationType) {
        this.PaginationType = PaginationType;
    }

    public DescribeDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstancesRequest(DescribeDBInstancesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VipSet != null) {
            this.VipSet = new String[source.VipSet.length];
            for (int i = 0; i < source.VipSet.length; i++) {
                this.VipSet[i] = new String(source.VipSet[i]);
            }
        }
        if (source.InstanceNameSet != null) {
            this.InstanceNameSet = new String[source.InstanceNameSet.length];
            for (int i = 0; i < source.InstanceNameSet.length; i++) {
                this.InstanceNameSet[i] = new String(source.InstanceNameSet[i]);
            }
        }
        if (source.VersionSet != null) {
            this.VersionSet = new String[source.VersionSet.length];
            for (int i = 0; i < source.VersionSet.length; i++) {
                this.VersionSet[i] = new String(source.VersionSet[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.TagKeys != null) {
            this.TagKeys = new String[source.TagKeys.length];
            for (int i = 0; i < source.TagKeys.length; i++) {
                this.TagKeys[i] = new String(source.TagKeys[i]);
            }
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.UidSet != null) {
            this.UidSet = new String[source.UidSet.length];
            for (int i = 0; i < source.UidSet.length; i++) {
                this.UidSet[i] = new String(source.UidSet[i]);
            }
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.PaginationType != null) {
            this.PaginationType = new String(source.PaginationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArraySimple(map, prefix + "VipSet.", this.VipSet);
        this.setParamArraySimple(map, prefix + "InstanceNameSet.", this.InstanceNameSet);
        this.setParamArraySimple(map, prefix + "VersionSet.", this.VersionSet);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamArraySimple(map, prefix + "UidSet.", this.UidSet);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "PaginationType", this.PaginationType);

    }
}

