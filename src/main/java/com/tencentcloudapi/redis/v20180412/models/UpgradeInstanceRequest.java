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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceRequest extends AbstractModel {

    /**
    * ID of the instance whose configuration is to be modified. Log in to the [TencentDB for Redis® console](https://console.cloud.tencent.com/Redis/instance/list) and copy the instance ID from the instance list.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Refers to the size of memory in each shard after the change.
-Unit: MB.
-You can only modify one of the parameters MemSize, RedisShardNum, and RedisReplicasNum each time, and cannot include both. When modifying one parameter, you need to manually input the original instance configuration specification for the other two parameters.
-When scaling down, the new specifications must be equal to or greater than 1.3 times the used capacity, otherwise execution will fail.
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Specifies the number of shards after the instance specification modification.
-Standard architecture does not require this parameter, while cluster architecture is mandatory.
-Cluster architecture. Every time, you can only modify one of the parameters RedisShardNum, MemSize, and RedisReplicasNum. You cannot modify them simultaneously. When modifying one parameter, you need to manually input the original instance configuration specification for the other two parameters.
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * Specifies the number of replicas after the instance specification modification.
-Only one of the parameters RedisReplicasNum, MemSize, and RedisShardNum can be modified each time. You cannot include both. When modifying one parameter, the other two parameters require the original instance configuration specification.
-When modifying a replica of a multi-AZ instance, you must input NodeSet.
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * Node information set when you add a replica for multi-AZ instances, including the ID and AZ information of the replica. This parameter is not required for non-multi-AZ instances.
    */
    @SerializedName("NodeSet")
    @Expose
    private RedisNodeInfo [] NodeSet;

    /**
    * Switch time.
 - 1: Perform the operation within the maintenance window: Specification upgrade is executed within the set maintenance window. Use the API [DescribeMaintenanceWindow](https://intl.cloud.tencent.com/document/product/239/46336?from_cn_redirect=1) to query the time period of the set maintenance window. Replica addition/removal, shard addition/removal, and memory capacity expansion/shrinkage are supported within the maintenance window. Specification upgrade within the maintenance window is being gradually tested and published by region. It is already supported in some regions. For urgent integration in regions that do not support it, [submit a ticket](https://console.cloud.tencent.com/workorder/category) to apply for an allowlist.
 -2: Perform the operation immediately: The operation will be performed immediately, without the need to wait for the maintenance window. Operations will be performed immediately by default for the system.
    */
    @SerializedName("SwitchOption")
    @Expose
    private Long SwitchOption;

    /**
     * Get ID of the instance whose configuration is to be modified. Log in to the [TencentDB for Redis® console](https://console.cloud.tencent.com/Redis/instance/list) and copy the instance ID from the instance list. 
     * @return InstanceId ID of the instance whose configuration is to be modified. Log in to the [TencentDB for Redis® console](https://console.cloud.tencent.com/Redis/instance/list) and copy the instance ID from the instance list.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance whose configuration is to be modified. Log in to the [TencentDB for Redis® console](https://console.cloud.tencent.com/Redis/instance/list) and copy the instance ID from the instance list.
     * @param InstanceId ID of the instance whose configuration is to be modified. Log in to the [TencentDB for Redis® console](https://console.cloud.tencent.com/Redis/instance/list) and copy the instance ID from the instance list.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Refers to the size of memory in each shard after the change.
-Unit: MB.
-You can only modify one of the parameters MemSize, RedisShardNum, and RedisReplicasNum each time, and cannot include both. When modifying one parameter, you need to manually input the original instance configuration specification for the other two parameters.
-When scaling down, the new specifications must be equal to or greater than 1.3 times the used capacity, otherwise execution will fail. 
     * @return MemSize Refers to the size of memory in each shard after the change.
-Unit: MB.
-You can only modify one of the parameters MemSize, RedisShardNum, and RedisReplicasNum each time, and cannot include both. When modifying one parameter, you need to manually input the original instance configuration specification for the other two parameters.
-When scaling down, the new specifications must be equal to or greater than 1.3 times the used capacity, otherwise execution will fail.
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Refers to the size of memory in each shard after the change.
-Unit: MB.
-You can only modify one of the parameters MemSize, RedisShardNum, and RedisReplicasNum each time, and cannot include both. When modifying one parameter, you need to manually input the original instance configuration specification for the other two parameters.
-When scaling down, the new specifications must be equal to or greater than 1.3 times the used capacity, otherwise execution will fail.
     * @param MemSize Refers to the size of memory in each shard after the change.
-Unit: MB.
-You can only modify one of the parameters MemSize, RedisShardNum, and RedisReplicasNum each time, and cannot include both. When modifying one parameter, you need to manually input the original instance configuration specification for the other two parameters.
-When scaling down, the new specifications must be equal to or greater than 1.3 times the used capacity, otherwise execution will fail.
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Specifies the number of shards after the instance specification modification.
-Standard architecture does not require this parameter, while cluster architecture is mandatory.
-Cluster architecture. Every time, you can only modify one of the parameters RedisShardNum, MemSize, and RedisReplicasNum. You cannot modify them simultaneously. When modifying one parameter, you need to manually input the original instance configuration specification for the other two parameters. 
     * @return RedisShardNum Specifies the number of shards after the instance specification modification.
-Standard architecture does not require this parameter, while cluster architecture is mandatory.
-Cluster architecture. Every time, you can only modify one of the parameters RedisShardNum, MemSize, and RedisReplicasNum. You cannot modify them simultaneously. When modifying one parameter, you need to manually input the original instance configuration specification for the other two parameters.
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set Specifies the number of shards after the instance specification modification.
-Standard architecture does not require this parameter, while cluster architecture is mandatory.
-Cluster architecture. Every time, you can only modify one of the parameters RedisShardNum, MemSize, and RedisReplicasNum. You cannot modify them simultaneously. When modifying one parameter, you need to manually input the original instance configuration specification for the other two parameters.
     * @param RedisShardNum Specifies the number of shards after the instance specification modification.
-Standard architecture does not require this parameter, while cluster architecture is mandatory.
-Cluster architecture. Every time, you can only modify one of the parameters RedisShardNum, MemSize, and RedisReplicasNum. You cannot modify them simultaneously. When modifying one parameter, you need to manually input the original instance configuration specification for the other two parameters.
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get Specifies the number of replicas after the instance specification modification.
-Only one of the parameters RedisReplicasNum, MemSize, and RedisShardNum can be modified each time. You cannot include both. When modifying one parameter, the other two parameters require the original instance configuration specification.
-When modifying a replica of a multi-AZ instance, you must input NodeSet. 
     * @return RedisReplicasNum Specifies the number of replicas after the instance specification modification.
-Only one of the parameters RedisReplicasNum, MemSize, and RedisShardNum can be modified each time. You cannot include both. When modifying one parameter, the other two parameters require the original instance configuration specification.
-When modifying a replica of a multi-AZ instance, you must input NodeSet.
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set Specifies the number of replicas after the instance specification modification.
-Only one of the parameters RedisReplicasNum, MemSize, and RedisShardNum can be modified each time. You cannot include both. When modifying one parameter, the other two parameters require the original instance configuration specification.
-When modifying a replica of a multi-AZ instance, you must input NodeSet.
     * @param RedisReplicasNum Specifies the number of replicas after the instance specification modification.
-Only one of the parameters RedisReplicasNum, MemSize, and RedisShardNum can be modified each time. You cannot include both. When modifying one parameter, the other two parameters require the original instance configuration specification.
-When modifying a replica of a multi-AZ instance, you must input NodeSet.
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get Node information set when you add a replica for multi-AZ instances, including the ID and AZ information of the replica. This parameter is not required for non-multi-AZ instances. 
     * @return NodeSet Node information set when you add a replica for multi-AZ instances, including the ID and AZ information of the replica. This parameter is not required for non-multi-AZ instances.
     */
    public RedisNodeInfo [] getNodeSet() {
        return this.NodeSet;
    }

    /**
     * Set Node information set when you add a replica for multi-AZ instances, including the ID and AZ information of the replica. This parameter is not required for non-multi-AZ instances.
     * @param NodeSet Node information set when you add a replica for multi-AZ instances, including the ID and AZ information of the replica. This parameter is not required for non-multi-AZ instances.
     */
    public void setNodeSet(RedisNodeInfo [] NodeSet) {
        this.NodeSet = NodeSet;
    }

    /**
     * Get Switch time.
 - 1: Perform the operation within the maintenance window: Specification upgrade is executed within the set maintenance window. Use the API [DescribeMaintenanceWindow](https://intl.cloud.tencent.com/document/product/239/46336?from_cn_redirect=1) to query the time period of the set maintenance window. Replica addition/removal, shard addition/removal, and memory capacity expansion/shrinkage are supported within the maintenance window. Specification upgrade within the maintenance window is being gradually tested and published by region. It is already supported in some regions. For urgent integration in regions that do not support it, [submit a ticket](https://console.cloud.tencent.com/workorder/category) to apply for an allowlist.
 -2: Perform the operation immediately: The operation will be performed immediately, without the need to wait for the maintenance window. Operations will be performed immediately by default for the system. 
     * @return SwitchOption Switch time.
 - 1: Perform the operation within the maintenance window: Specification upgrade is executed within the set maintenance window. Use the API [DescribeMaintenanceWindow](https://intl.cloud.tencent.com/document/product/239/46336?from_cn_redirect=1) to query the time period of the set maintenance window. Replica addition/removal, shard addition/removal, and memory capacity expansion/shrinkage are supported within the maintenance window. Specification upgrade within the maintenance window is being gradually tested and published by region. It is already supported in some regions. For urgent integration in regions that do not support it, [submit a ticket](https://console.cloud.tencent.com/workorder/category) to apply for an allowlist.
 -2: Perform the operation immediately: The operation will be performed immediately, without the need to wait for the maintenance window. Operations will be performed immediately by default for the system.
     */
    public Long getSwitchOption() {
        return this.SwitchOption;
    }

    /**
     * Set Switch time.
 - 1: Perform the operation within the maintenance window: Specification upgrade is executed within the set maintenance window. Use the API [DescribeMaintenanceWindow](https://intl.cloud.tencent.com/document/product/239/46336?from_cn_redirect=1) to query the time period of the set maintenance window. Replica addition/removal, shard addition/removal, and memory capacity expansion/shrinkage are supported within the maintenance window. Specification upgrade within the maintenance window is being gradually tested and published by region. It is already supported in some regions. For urgent integration in regions that do not support it, [submit a ticket](https://console.cloud.tencent.com/workorder/category) to apply for an allowlist.
 -2: Perform the operation immediately: The operation will be performed immediately, without the need to wait for the maintenance window. Operations will be performed immediately by default for the system.
     * @param SwitchOption Switch time.
 - 1: Perform the operation within the maintenance window: Specification upgrade is executed within the set maintenance window. Use the API [DescribeMaintenanceWindow](https://intl.cloud.tencent.com/document/product/239/46336?from_cn_redirect=1) to query the time period of the set maintenance window. Replica addition/removal, shard addition/removal, and memory capacity expansion/shrinkage are supported within the maintenance window. Specification upgrade within the maintenance window is being gradually tested and published by region. It is already supported in some regions. For urgent integration in regions that do not support it, [submit a ticket](https://console.cloud.tencent.com/workorder/category) to apply for an allowlist.
 -2: Perform the operation immediately: The operation will be performed immediately, without the need to wait for the maintenance window. Operations will be performed immediately by default for the system.
     */
    public void setSwitchOption(Long SwitchOption) {
        this.SwitchOption = SwitchOption;
    }

    public UpgradeInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeInstanceRequest(UpgradeInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.RedisShardNum != null) {
            this.RedisShardNum = new Long(source.RedisShardNum);
        }
        if (source.RedisReplicasNum != null) {
            this.RedisReplicasNum = new Long(source.RedisReplicasNum);
        }
        if (source.NodeSet != null) {
            this.NodeSet = new RedisNodeInfo[source.NodeSet.length];
            for (int i = 0; i < source.NodeSet.length; i++) {
                this.NodeSet[i] = new RedisNodeInfo(source.NodeSet[i]);
            }
        }
        if (source.SwitchOption != null) {
            this.SwitchOption = new Long(source.SwitchOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);
        this.setParamArrayObj(map, prefix + "NodeSet.", this.NodeSet);
        this.setParamSimple(map, prefix + "SwitchOption", this.SwitchOption);

    }
}

