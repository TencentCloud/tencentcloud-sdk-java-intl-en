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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Placement extends AbstractModel {

    /**
    * The ID of the [Availability Zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo) to which the cloud disk belongs. This parameter can be obtained from the Zone field in the returned values of [DescribeZones](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1).
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * CageId, which can be obtained via [DescribeDiskStoragePool](https://www.tencentcloud.com/document/api/362/62143?from_cn_redirect=1). as an input parameter, it operates on resources of the specified cage Id and can be empty. as an output parameter, it indicates the cage Id to which the resource belongs and can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CageId")
    @Expose
    private String CageId;

    /**
    * Instance'S project ID, which can be obtained by DescribeProject. by default if left blank, it is 0, indicating the default project.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Project to which instance belongs. search via [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * Dedicated cluster name. When it is an input parameter, it is ignored.  When it is an output parameter, it is the name of the dedicated cluster the cloud disk belongs to, and it can be left blank.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("CdcName")
    @Expose
    private String CdcName;

    /**
    * The exclusive cluster ID of the instance. can be obtained via [DescribeDiskStoragePool](https://www.tencentcloud.com/document/api/362/62143?from_cn_redirect=1). as an input parameter, it indicates operations on resources belonging to the designated CdcId exclusive cluster and can be empty. as an output parameter, it indicates the exclusive cluster ID of the resource and can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * Dedicated cluster ID
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
     * Get The ID of the [Availability Zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo) to which the cloud disk belongs. This parameter can be obtained from the Zone field in the returned values of [DescribeZones](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1). 
     * @return Zone The ID of the [Availability Zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo) to which the cloud disk belongs. This parameter can be obtained from the Zone field in the returned values of [DescribeZones](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1).
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The ID of the [Availability Zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo) to which the cloud disk belongs. This parameter can be obtained from the Zone field in the returned values of [DescribeZones](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1).
     * @param Zone The ID of the [Availability Zone](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#ZoneInfo) to which the cloud disk belongs. This parameter can be obtained from the Zone field in the returned values of [DescribeZones](https://intl.cloud.tencent.com/document/product/213/15707?from_cn_redirect=1).
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get CageId, which can be obtained via [DescribeDiskStoragePool](https://www.tencentcloud.com/document/api/362/62143?from_cn_redirect=1). as an input parameter, it operates on resources of the specified cage Id and can be empty. as an output parameter, it indicates the cage Id to which the resource belongs and can be empty.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CageId CageId, which can be obtained via [DescribeDiskStoragePool](https://www.tencentcloud.com/document/api/362/62143?from_cn_redirect=1). as an input parameter, it operates on resources of the specified cage Id and can be empty. as an output parameter, it indicates the cage Id to which the resource belongs and can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCageId() {
        return this.CageId;
    }

    /**
     * Set CageId, which can be obtained via [DescribeDiskStoragePool](https://www.tencentcloud.com/document/api/362/62143?from_cn_redirect=1). as an input parameter, it operates on resources of the specified cage Id and can be empty. as an output parameter, it indicates the cage Id to which the resource belongs and can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CageId CageId, which can be obtained via [DescribeDiskStoragePool](https://www.tencentcloud.com/document/api/362/62143?from_cn_redirect=1). as an input parameter, it operates on resources of the specified cage Id and can be empty. as an output parameter, it indicates the cage Id to which the resource belongs and can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCageId(String CageId) {
        this.CageId = CageId;
    }

    /**
     * Get Instance'S project ID, which can be obtained by DescribeProject. by default if left blank, it is 0, indicating the default project. 
     * @return ProjectId Instance'S project ID, which can be obtained by DescribeProject. by default if left blank, it is 0, indicating the default project.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Instance'S project ID, which can be obtained by DescribeProject. by default if left blank, it is 0, indicating the default project.
     * @param ProjectId Instance'S project ID, which can be obtained by DescribeProject. by default if left blank, it is 0, indicating the default project.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Project to which instance belongs. search via [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProjectName Project to which instance belongs. search via [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set Project to which instance belongs. search via [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProjectName Project to which instance belongs. search via [DescribeProject](https://www.tencentcloud.com/document/api/651/78725?from_cn_redirect=1).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get Dedicated cluster name. When it is an input parameter, it is ignored.  When it is an output parameter, it is the name of the dedicated cluster the cloud disk belongs to, and it can be left blank.
Note: This field may return null, indicating that no valid value was found. 
     * @return CdcName Dedicated cluster name. When it is an input parameter, it is ignored.  When it is an output parameter, it is the name of the dedicated cluster the cloud disk belongs to, and it can be left blank.
Note: This field may return null, indicating that no valid value was found.
     */
    public String getCdcName() {
        return this.CdcName;
    }

    /**
     * Set Dedicated cluster name. When it is an input parameter, it is ignored.  When it is an output parameter, it is the name of the dedicated cluster the cloud disk belongs to, and it can be left blank.
Note: This field may return null, indicating that no valid value was found.
     * @param CdcName Dedicated cluster name. When it is an input parameter, it is ignored.  When it is an output parameter, it is the name of the dedicated cluster the cloud disk belongs to, and it can be left blank.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setCdcName(String CdcName) {
        this.CdcName = CdcName;
    }

    /**
     * Get The exclusive cluster ID of the instance. can be obtained via [DescribeDiskStoragePool](https://www.tencentcloud.com/document/api/362/62143?from_cn_redirect=1). as an input parameter, it indicates operations on resources belonging to the designated CdcId exclusive cluster and can be empty. as an output parameter, it indicates the exclusive cluster ID of the resource and can be empty.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CdcId The exclusive cluster ID of the instance. can be obtained via [DescribeDiskStoragePool](https://www.tencentcloud.com/document/api/362/62143?from_cn_redirect=1). as an input parameter, it indicates operations on resources belonging to the designated CdcId exclusive cluster and can be empty. as an output parameter, it indicates the exclusive cluster ID of the resource and can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set The exclusive cluster ID of the instance. can be obtained via [DescribeDiskStoragePool](https://www.tencentcloud.com/document/api/362/62143?from_cn_redirect=1). as an input parameter, it indicates operations on resources belonging to the designated CdcId exclusive cluster and can be empty. as an output parameter, it indicates the exclusive cluster ID of the resource and can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CdcId The exclusive cluster ID of the instance. can be obtained via [DescribeDiskStoragePool](https://www.tencentcloud.com/document/api/362/62143?from_cn_redirect=1). as an input parameter, it indicates operations on resources belonging to the designated CdcId exclusive cluster and can be empty. as an output parameter, it indicates the exclusive cluster ID of the resource and can be empty.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get Dedicated cluster ID 
     * @return DedicatedClusterId Dedicated cluster ID
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set Dedicated cluster ID
     * @param DedicatedClusterId Dedicated cluster ID
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    public Placement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Placement(Placement source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CageId != null) {
            this.CageId = new String(source.CageId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.CdcName != null) {
            this.CdcName = new String(source.CdcName);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CageId", this.CageId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "CdcName", this.CdcName);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);

    }
}

