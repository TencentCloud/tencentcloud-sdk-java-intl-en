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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRedisClustersRequest extends AbstractModel {

    /**
    * Dedicated Redis cluster ID. Log in to the [CDC console](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1),
switch to the **Cloud Service Management** page, select **TencentDB for Redis** from the drop-down list, and obtain the dedicated cluster ID.
    */
    @SerializedName("RedisClusterIds")
    @Expose
    private String [] RedisClusterIds;

    /**
    * Cluster status.
- 1: in process.
- 2: running.
- 3: isolated.
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * Project ID array. Log in to the [project management](https://console.tencentcloud.com/project) page and copy the project ID in **Project Name**.
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * Renewal mode.
- 0: default status (manual renewal).
- 1: automatic renewal.
- 2: no automatic renewal.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long [] AutoRenewFlag;

    /**
    * Dedicated Redis cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Search keyword. Valid values: cluster ID and cluster name.
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * Limit on the number of records returned in pagination mode. If this parameter is not specified, the value 20 will be used by default.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset, which is an integer multiple of Limit.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * CDC ID. Log in to the [CDC console](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1)
and obtain the cluster ID in the instance list.
    */
    @SerializedName("DedicatedClusterId")
    @Expose
    private String DedicatedClusterId;

    /**
     * Get Dedicated Redis cluster ID. Log in to the [CDC console](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1),
switch to the **Cloud Service Management** page, select **TencentDB for Redis** from the drop-down list, and obtain the dedicated cluster ID. 
     * @return RedisClusterIds Dedicated Redis cluster ID. Log in to the [CDC console](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1),
switch to the **Cloud Service Management** page, select **TencentDB for Redis** from the drop-down list, and obtain the dedicated cluster ID.
     */
    public String [] getRedisClusterIds() {
        return this.RedisClusterIds;
    }

    /**
     * Set Dedicated Redis cluster ID. Log in to the [CDC console](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1),
switch to the **Cloud Service Management** page, select **TencentDB for Redis** from the drop-down list, and obtain the dedicated cluster ID.
     * @param RedisClusterIds Dedicated Redis cluster ID. Log in to the [CDC console](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1),
switch to the **Cloud Service Management** page, select **TencentDB for Redis** from the drop-down list, and obtain the dedicated cluster ID.
     */
    public void setRedisClusterIds(String [] RedisClusterIds) {
        this.RedisClusterIds = RedisClusterIds;
    }

    /**
     * Get Cluster status.
- 1: in process.
- 2: running.
- 3: isolated. 
     * @return Status Cluster status.
- 1: in process.
- 2: running.
- 3: isolated.
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set Cluster status.
- 1: in process.
- 2: running.
- 3: isolated.
     * @param Status Cluster status.
- 1: in process.
- 2: running.
- 3: isolated.
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get Project ID array. Log in to the [project management](https://console.tencentcloud.com/project) page and copy the project ID in **Project Name**. 
     * @return ProjectIds Project ID array. Log in to the [project management](https://console.tencentcloud.com/project) page and copy the project ID in **Project Name**.
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Project ID array. Log in to the [project management](https://console.tencentcloud.com/project) page and copy the project ID in **Project Name**.
     * @param ProjectIds Project ID array. Log in to the [project management](https://console.tencentcloud.com/project) page and copy the project ID in **Project Name**.
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Renewal mode.
- 0: default status (manual renewal).
- 1: automatic renewal.
- 2: no automatic renewal. 
     * @return AutoRenewFlag Renewal mode.
- 0: default status (manual renewal).
- 1: automatic renewal.
- 2: no automatic renewal.
     */
    public Long [] getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Renewal mode.
- 0: default status (manual renewal).
- 1: automatic renewal.
- 2: no automatic renewal.
     * @param AutoRenewFlag Renewal mode.
- 0: default status (manual renewal).
- 1: automatic renewal.
- 2: no automatic renewal.
     */
    public void setAutoRenewFlag(Long [] AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Dedicated Redis cluster name. 
     * @return ClusterName Dedicated Redis cluster name.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Dedicated Redis cluster name.
     * @param ClusterName Dedicated Redis cluster name.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Search keyword. Valid values: cluster ID and cluster name. 
     * @return SearchKey Search keyword. Valid values: cluster ID and cluster name.
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set Search keyword. Valid values: cluster ID and cluster name.
     * @param SearchKey Search keyword. Valid values: cluster ID and cluster name.
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get Limit on the number of records returned in pagination mode. If this parameter is not specified, the value 20 will be used by default. 
     * @return Limit Limit on the number of records returned in pagination mode. If this parameter is not specified, the value 20 will be used by default.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit on the number of records returned in pagination mode. If this parameter is not specified, the value 20 will be used by default.
     * @param Limit Limit on the number of records returned in pagination mode. If this parameter is not specified, the value 20 will be used by default.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset, which is an integer multiple of Limit. 
     * @return Offset Offset, which is an integer multiple of Limit.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, which is an integer multiple of Limit.
     * @param Offset Offset, which is an integer multiple of Limit.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get CDC ID. Log in to the [CDC console](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1)
and obtain the cluster ID in the instance list. 
     * @return DedicatedClusterId CDC ID. Log in to the [CDC console](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1)
and obtain the cluster ID in the instance list.
     */
    public String getDedicatedClusterId() {
        return this.DedicatedClusterId;
    }

    /**
     * Set CDC ID. Log in to the [CDC console](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1)
and obtain the cluster ID in the instance list.
     * @param DedicatedClusterId CDC ID. Log in to the [CDC console](https://console.cloud.tencent.com/cdc/dedicatedcluster/index?rid=1)
and obtain the cluster ID in the instance list.
     */
    public void setDedicatedClusterId(String DedicatedClusterId) {
        this.DedicatedClusterId = DedicatedClusterId;
    }

    public DescribeRedisClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRedisClustersRequest(DescribeRedisClustersRequest source) {
        if (source.RedisClusterIds != null) {
            this.RedisClusterIds = new String[source.RedisClusterIds.length];
            for (int i = 0; i < source.RedisClusterIds.length; i++) {
                this.RedisClusterIds[i] = new String(source.RedisClusterIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long[source.AutoRenewFlag.length];
            for (int i = 0; i < source.AutoRenewFlag.length; i++) {
                this.AutoRenewFlag[i] = new Long(source.AutoRenewFlag[i]);
            }
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.DedicatedClusterId != null) {
            this.DedicatedClusterId = new String(source.DedicatedClusterId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RedisClusterIds.", this.RedisClusterIds);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "AutoRenewFlag.", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "DedicatedClusterId", this.DedicatedClusterId);

    }
}

