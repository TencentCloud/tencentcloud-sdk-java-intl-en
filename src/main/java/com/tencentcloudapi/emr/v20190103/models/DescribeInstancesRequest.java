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

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * Cluster filtering policy. Valid values:
<li>clusterList: Queries the list of clusters except for those that have been terminated.</li>
<li>monitorManage: Queries the list of clusters except for those that have been terminated, are being created, or fail to be created.</li><li>cloudHardwareManage/componentManage: Currently these two values are reserved and temporarily have the same meaning as monitorManage.</li>
    */
    @SerializedName("DisplayStrategy")
    @Expose
    private String DisplayStrategy;

    /**
    * Query by one or more instance IDs. The instance ID is in the format of emr-xxxxxxxx. (For the specific format of this parameter, see the section Ids.N in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688?from_cn_redirect=1)). If the instance ID is not specified, the list of all the instances for the APPID is returned.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of items returned per page. Default value: 100. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * It is recommended to set this parameter to -1, indicating all clusters under all projects are pulled.
If not specified, the default value is 0, indicating the clusters under the default project are pulled.
ID of the project to which the instance belongs. This parameter can be obtained from the projectId field in the return value of [DescribeProjects](https://www.tencentcloud.com/document/product/651/78725?from_cn_redirect=1).
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Sorting field. Valid values:
<li>clusterId: sort by instance ID.</li>
<li>addTime: sort by instance creation time.</li>
<li>status: sort by instance status code.</li>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Sorts by OrderField in ascending or descending order. Valid values:<li>0: descending order</li>
<li>1: ascending order</li>The default value is 0.
    */
    @SerializedName("Asc")
    @Expose
    private Long Asc;

    /**
     * Get Cluster filtering policy. Valid values:
<li>clusterList: Queries the list of clusters except for those that have been terminated.</li>
<li>monitorManage: Queries the list of clusters except for those that have been terminated, are being created, or fail to be created.</li><li>cloudHardwareManage/componentManage: Currently these two values are reserved and temporarily have the same meaning as monitorManage.</li> 
     * @return DisplayStrategy Cluster filtering policy. Valid values:
<li>clusterList: Queries the list of clusters except for those that have been terminated.</li>
<li>monitorManage: Queries the list of clusters except for those that have been terminated, are being created, or fail to be created.</li><li>cloudHardwareManage/componentManage: Currently these two values are reserved and temporarily have the same meaning as monitorManage.</li>
     */
    public String getDisplayStrategy() {
        return this.DisplayStrategy;
    }

    /**
     * Set Cluster filtering policy. Valid values:
<li>clusterList: Queries the list of clusters except for those that have been terminated.</li>
<li>monitorManage: Queries the list of clusters except for those that have been terminated, are being created, or fail to be created.</li><li>cloudHardwareManage/componentManage: Currently these two values are reserved and temporarily have the same meaning as monitorManage.</li>
     * @param DisplayStrategy Cluster filtering policy. Valid values:
<li>clusterList: Queries the list of clusters except for those that have been terminated.</li>
<li>monitorManage: Queries the list of clusters except for those that have been terminated, are being created, or fail to be created.</li><li>cloudHardwareManage/componentManage: Currently these two values are reserved and temporarily have the same meaning as monitorManage.</li>
     */
    public void setDisplayStrategy(String DisplayStrategy) {
        this.DisplayStrategy = DisplayStrategy;
    }

    /**
     * Get Query by one or more instance IDs. The instance ID is in the format of emr-xxxxxxxx. (For the specific format of this parameter, see the section Ids.N in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688?from_cn_redirect=1)). If the instance ID is not specified, the list of all the instances for the APPID is returned. 
     * @return InstanceIds Query by one or more instance IDs. The instance ID is in the format of emr-xxxxxxxx. (For the specific format of this parameter, see the section Ids.N in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688?from_cn_redirect=1)). If the instance ID is not specified, the list of all the instances for the APPID is returned.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Query by one or more instance IDs. The instance ID is in the format of emr-xxxxxxxx. (For the specific format of this parameter, see the section Ids.N in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688?from_cn_redirect=1)). If the instance ID is not specified, the list of all the instances for the APPID is returned.
     * @param InstanceIds Query by one or more instance IDs. The instance ID is in the format of emr-xxxxxxxx. (For the specific format of this parameter, see the section Ids.N in the API [Introduction](https://www.tencentcloud.com/document/api/213/15688?from_cn_redirect=1)). If the instance ID is not specified, the list of all the instances for the APPID is returned.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get  
     * @return Offset 
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 
     * @param Offset 
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of items returned per page. Default value: 100. Maximum value: 100. 
     * @return Limit Number of items returned per page. Default value: 100. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of items returned per page. Default value: 100. Maximum value: 100.
     * @param Limit Number of items returned per page. Default value: 100. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get It is recommended to set this parameter to -1, indicating all clusters under all projects are pulled.
If not specified, the default value is 0, indicating the clusters under the default project are pulled.
ID of the project to which the instance belongs. This parameter can be obtained from the projectId field in the return value of [DescribeProjects](https://www.tencentcloud.com/document/product/651/78725?from_cn_redirect=1). 
     * @return ProjectId It is recommended to set this parameter to -1, indicating all clusters under all projects are pulled.
If not specified, the default value is 0, indicating the clusters under the default project are pulled.
ID of the project to which the instance belongs. This parameter can be obtained from the projectId field in the return value of [DescribeProjects](https://www.tencentcloud.com/document/product/651/78725?from_cn_redirect=1).
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set It is recommended to set this parameter to -1, indicating all clusters under all projects are pulled.
If not specified, the default value is 0, indicating the clusters under the default project are pulled.
ID of the project to which the instance belongs. This parameter can be obtained from the projectId field in the return value of [DescribeProjects](https://www.tencentcloud.com/document/product/651/78725?from_cn_redirect=1).
     * @param ProjectId It is recommended to set this parameter to -1, indicating all clusters under all projects are pulled.
If not specified, the default value is 0, indicating the clusters under the default project are pulled.
ID of the project to which the instance belongs. This parameter can be obtained from the projectId field in the return value of [DescribeProjects](https://www.tencentcloud.com/document/product/651/78725?from_cn_redirect=1).
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Sorting field. Valid values:
<li>clusterId: sort by instance ID.</li>
<li>addTime: sort by instance creation time.</li>
<li>status: sort by instance status code.</li> 
     * @return OrderField Sorting field. Valid values:
<li>clusterId: sort by instance ID.</li>
<li>addTime: sort by instance creation time.</li>
<li>status: sort by instance status code.</li>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Sorting field. Valid values:
<li>clusterId: sort by instance ID.</li>
<li>addTime: sort by instance creation time.</li>
<li>status: sort by instance status code.</li>
     * @param OrderField Sorting field. Valid values:
<li>clusterId: sort by instance ID.</li>
<li>addTime: sort by instance creation time.</li>
<li>status: sort by instance status code.</li>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Sorts by OrderField in ascending or descending order. Valid values:<li>0: descending order</li>
<li>1: ascending order</li>The default value is 0. 
     * @return Asc Sorts by OrderField in ascending or descending order. Valid values:<li>0: descending order</li>
<li>1: ascending order</li>The default value is 0.
     */
    public Long getAsc() {
        return this.Asc;
    }

    /**
     * Set Sorts by OrderField in ascending or descending order. Valid values:<li>0: descending order</li>
<li>1: ascending order</li>The default value is 0.
     * @param Asc Sorts by OrderField in ascending or descending order. Valid values:<li>0: descending order</li>
<li>1: ascending order</li>The default value is 0.
     */
    public void setAsc(Long Asc) {
        this.Asc = Asc;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.DisplayStrategy != null) {
            this.DisplayStrategy = new String(source.DisplayStrategy);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Asc != null) {
            this.Asc = new Long(source.Asc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayStrategy", this.DisplayStrategy);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Asc", this.Asc);

    }
}

