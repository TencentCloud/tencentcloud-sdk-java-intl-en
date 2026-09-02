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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterSuperNodeInfoRequest extends AbstractModel {

    /**
    * <p>Unique ID of the super node (corresponds to unique_id in the cluster node table).<br>Value reference: obtained from the UniqueID field returned by the DescribeClusterNodeList API (nodes with node type SUPER)</p>
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Unique ID of the super node (corresponds to unique_id in the cluster node table).<br>Value reference: obtained from the UniqueID field returned by the DescribeClusterNodeList API (nodes with node type SUPER)</p> 
     * @return NodeUniqueID <p>Unique ID of the super node (corresponds to unique_id in the cluster node table).<br>Value reference: obtained from the UniqueID field returned by the DescribeClusterNodeList API (nodes with node type SUPER)</p>
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set <p>Unique ID of the super node (corresponds to unique_id in the cluster node table).<br>Value reference: obtained from the UniqueID field returned by the DescribeClusterNodeList API (nodes with node type SUPER)</p>
     * @param NodeUniqueID <p>Unique ID of the super node (corresponds to unique_id in the cluster node table).<br>Value reference: obtained from the UniqueID field returned by the DescribeClusterNodeList API (nodes with node type SUPER)</p>
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeClusterSuperNodeInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterSuperNodeInfoRequest(DescribeClusterSuperNodeInfoRequest source) {
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

