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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterNodesResponse extends AbstractModel{

    /**
    * Total number of queried nodes
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * List of node details
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeList")
    @Expose
    private NodeHardwareInfo [] NodeList;

    /**
    * List of tag keys owned by user
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of queried nodes 
     * @return TotalCnt Total number of queried nodes
     */
    public Long getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set Total number of queried nodes
     * @param TotalCnt Total number of queried nodes
     */
    public void setTotalCnt(Long TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * Get List of node details
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NodeList List of node details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public NodeHardwareInfo [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set List of node details
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NodeList List of node details
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeList(NodeHardwareInfo [] NodeList) {
        this.NodeList = NodeList;
    }

    /**
     * Get List of tag keys owned by user
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TagKeys List of tag keys owned by user
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set List of tag keys owned by user
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TagKeys List of tag keys owned by user
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamArrayObj(map, prefix + "NodeList.", this.NodeList);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

