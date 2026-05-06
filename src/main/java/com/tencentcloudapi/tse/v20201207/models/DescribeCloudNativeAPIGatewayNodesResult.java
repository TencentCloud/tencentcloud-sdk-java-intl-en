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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudNativeAPIGatewayNodesResult extends AbstractModel {

    /**
    * Retrieve the cloud native API gateway node list response result.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Cloud native API gateway node list.
    */
    @SerializedName("NodeList")
    @Expose
    private CloudNativeAPIGatewayNode [] NodeList;

    /**
     * Get Retrieve the cloud native API gateway node list response result. 
     * @return TotalCount Retrieve the cloud native API gateway node list response result.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Retrieve the cloud native API gateway node list response result.
     * @param TotalCount Retrieve the cloud native API gateway node list response result.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Cloud native API gateway node list. 
     * @return NodeList Cloud native API gateway node list.
     */
    public CloudNativeAPIGatewayNode [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set Cloud native API gateway node list.
     * @param NodeList Cloud native API gateway node list.
     */
    public void setNodeList(CloudNativeAPIGatewayNode [] NodeList) {
        this.NodeList = NodeList;
    }

    public DescribeCloudNativeAPIGatewayNodesResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudNativeAPIGatewayNodesResult(DescribeCloudNativeAPIGatewayNodesResult source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.NodeList != null) {
            this.NodeList = new CloudNativeAPIGatewayNode[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new CloudNativeAPIGatewayNode(source.NodeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "NodeList.", this.NodeList);

    }
}

