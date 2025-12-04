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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Operation extends AbstractModel {

    /**
    * Name of the shard where the operation is performed. The [DescribeCurrentOp](https://www.tencentcloud.comom/document/product/240/48120?from_cn_redirect=1) API can be called to query the shard name.
    */
    @SerializedName("ReplicaSetName")
    @Expose
    private String ReplicaSetName;

    /**
    * Name of the node where the operation is performed. The [DescribeCurrentOp](https://www.tencentcloud.comom/document/product/240/48120?from_cn_redirect=1) API can be called to query the node name.
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Operation number. The [DescribeCurrentOp](https://www.tencentcloud.comom/document/product/240/48120?from_cn_redirect=1) API can be called to query the operation number.
    */
    @SerializedName("OpId")
    @Expose
    private Long OpId;

    /**
     * Get Name of the shard where the operation is performed. The [DescribeCurrentOp](https://www.tencentcloud.comom/document/product/240/48120?from_cn_redirect=1) API can be called to query the shard name. 
     * @return ReplicaSetName Name of the shard where the operation is performed. The [DescribeCurrentOp](https://www.tencentcloud.comom/document/product/240/48120?from_cn_redirect=1) API can be called to query the shard name.
     */
    public String getReplicaSetName() {
        return this.ReplicaSetName;
    }

    /**
     * Set Name of the shard where the operation is performed. The [DescribeCurrentOp](https://www.tencentcloud.comom/document/product/240/48120?from_cn_redirect=1) API can be called to query the shard name.
     * @param ReplicaSetName Name of the shard where the operation is performed. The [DescribeCurrentOp](https://www.tencentcloud.comom/document/product/240/48120?from_cn_redirect=1) API can be called to query the shard name.
     */
    public void setReplicaSetName(String ReplicaSetName) {
        this.ReplicaSetName = ReplicaSetName;
    }

    /**
     * Get Name of the node where the operation is performed. The [DescribeCurrentOp](https://www.tencentcloud.comom/document/product/240/48120?from_cn_redirect=1) API can be called to query the node name. 
     * @return NodeName Name of the node where the operation is performed. The [DescribeCurrentOp](https://www.tencentcloud.comom/document/product/240/48120?from_cn_redirect=1) API can be called to query the node name.
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Name of the node where the operation is performed. The [DescribeCurrentOp](https://www.tencentcloud.comom/document/product/240/48120?from_cn_redirect=1) API can be called to query the node name.
     * @param NodeName Name of the node where the operation is performed. The [DescribeCurrentOp](https://www.tencentcloud.comom/document/product/240/48120?from_cn_redirect=1) API can be called to query the node name.
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Operation number. The [DescribeCurrentOp](https://www.tencentcloud.comom/document/product/240/48120?from_cn_redirect=1) API can be called to query the operation number. 
     * @return OpId Operation number. The [DescribeCurrentOp](https://www.tencentcloud.comom/document/product/240/48120?from_cn_redirect=1) API can be called to query the operation number.
     */
    public Long getOpId() {
        return this.OpId;
    }

    /**
     * Set Operation number. The [DescribeCurrentOp](https://www.tencentcloud.comom/document/product/240/48120?from_cn_redirect=1) API can be called to query the operation number.
     * @param OpId Operation number. The [DescribeCurrentOp](https://www.tencentcloud.comom/document/product/240/48120?from_cn_redirect=1) API can be called to query the operation number.
     */
    public void setOpId(Long OpId) {
        this.OpId = OpId;
    }

    public Operation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Operation(Operation source) {
        if (source.ReplicaSetName != null) {
            this.ReplicaSetName = new String(source.ReplicaSetName);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.OpId != null) {
            this.OpId = new Long(source.OpId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicaSetName", this.ReplicaSetName);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "OpId", this.OpId);

    }
}

