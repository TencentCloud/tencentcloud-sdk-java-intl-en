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

public class RedisNodeInfo extends AbstractModel {

    /**
    * Node type. <ul><li>`0`: Master node.</li><li>`1`: Replica node.</li></ul>
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * ID of the master or replica node <ul><li>This parameter is optional when the [CreateInstances](https://intl.cloud.tencent.com/document/product/239/20026?from_cn_redirect=1) API is used to create a TencentDB for Redis instance, but it is required when the [UpgradeInstance](https://intl.cloud.tencent.com/document/product/239/20013?from_cn_redirect=1) API is used to adjust the configuration of an instance by deleting a replica.  </li><li>You can use the [DescribeInstances](https://intl.cloud.tencent.com/document/product/239/20018?from_cn_redirect=1) API to get the node ID of integer type. </li></ul> </li></ul>
    */
    @SerializedName("NodeId")
    @Expose
    private Long NodeId;

    /**
    * ID of the AZ of the master or replica node
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * Name of the AZ of the master or replica node
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
     * Get Node type. <ul><li>`0`: Master node.</li><li>`1`: Replica node.</li></ul> 
     * @return NodeType Node type. <ul><li>`0`: Master node.</li><li>`1`: Replica node.</li></ul>
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type. <ul><li>`0`: Master node.</li><li>`1`: Replica node.</li></ul>
     * @param NodeType Node type. <ul><li>`0`: Master node.</li><li>`1`: Replica node.</li></ul>
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get ID of the master or replica node <ul><li>This parameter is optional when the [CreateInstances](https://intl.cloud.tencent.com/document/product/239/20026?from_cn_redirect=1) API is used to create a TencentDB for Redis instance, but it is required when the [UpgradeInstance](https://intl.cloud.tencent.com/document/product/239/20013?from_cn_redirect=1) API is used to adjust the configuration of an instance by deleting a replica.  </li><li>You can use the [DescribeInstances](https://intl.cloud.tencent.com/document/product/239/20018?from_cn_redirect=1) API to get the node ID of integer type. </li></ul> </li></ul> 
     * @return NodeId ID of the master or replica node <ul><li>This parameter is optional when the [CreateInstances](https://intl.cloud.tencent.com/document/product/239/20026?from_cn_redirect=1) API is used to create a TencentDB for Redis instance, but it is required when the [UpgradeInstance](https://intl.cloud.tencent.com/document/product/239/20013?from_cn_redirect=1) API is used to adjust the configuration of an instance by deleting a replica.  </li><li>You can use the [DescribeInstances](https://intl.cloud.tencent.com/document/product/239/20018?from_cn_redirect=1) API to get the node ID of integer type. </li></ul> </li></ul>
     */
    public Long getNodeId() {
        return this.NodeId;
    }

    /**
     * Set ID of the master or replica node <ul><li>This parameter is optional when the [CreateInstances](https://intl.cloud.tencent.com/document/product/239/20026?from_cn_redirect=1) API is used to create a TencentDB for Redis instance, but it is required when the [UpgradeInstance](https://intl.cloud.tencent.com/document/product/239/20013?from_cn_redirect=1) API is used to adjust the configuration of an instance by deleting a replica.  </li><li>You can use the [DescribeInstances](https://intl.cloud.tencent.com/document/product/239/20018?from_cn_redirect=1) API to get the node ID of integer type. </li></ul> </li></ul>
     * @param NodeId ID of the master or replica node <ul><li>This parameter is optional when the [CreateInstances](https://intl.cloud.tencent.com/document/product/239/20026?from_cn_redirect=1) API is used to create a TencentDB for Redis instance, but it is required when the [UpgradeInstance](https://intl.cloud.tencent.com/document/product/239/20013?from_cn_redirect=1) API is used to adjust the configuration of an instance by deleting a replica.  </li><li>You can use the [DescribeInstances](https://intl.cloud.tencent.com/document/product/239/20018?from_cn_redirect=1) API to get the node ID of integer type. </li></ul> </li></ul>
     */
    public void setNodeId(Long NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get ID of the AZ of the master or replica node 
     * @return ZoneId ID of the AZ of the master or replica node
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the AZ of the master or replica node
     * @param ZoneId ID of the AZ of the master or replica node
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Name of the AZ of the master or replica node 
     * @return ZoneName Name of the AZ of the master or replica node
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Name of the AZ of the master or replica node
     * @param ZoneName Name of the AZ of the master or replica node
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    public RedisNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RedisNodeInfo(RedisNodeInfo source) {
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.NodeId != null) {
            this.NodeId = new Long(source.NodeId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);

    }
}

