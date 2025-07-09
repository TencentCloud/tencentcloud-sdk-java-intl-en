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

public class DescribeInstancesResponse extends AbstractModel {

    /**
    * Number of eligible instances.
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * List of EMR instance details.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterList")
    @Expose
    private ClusterInstancesInfo [] ClusterList;

    /**
    * List of tag keys associated to an instance.
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
     * Get Number of eligible instances. 
     * @return TotalCnt Number of eligible instances.
     */
    public Long getTotalCnt() {
        return this.TotalCnt;
    }

    /**
     * Set Number of eligible instances.
     * @param TotalCnt Number of eligible instances.
     */
    public void setTotalCnt(Long TotalCnt) {
        this.TotalCnt = TotalCnt;
    }

    /**
     * Get List of EMR instance details.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ClusterList List of EMR instance details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ClusterInstancesInfo [] getClusterList() {
        return this.ClusterList;
    }

    /**
     * Set List of EMR instance details.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ClusterList List of EMR instance details.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterList(ClusterInstancesInfo [] ClusterList) {
        this.ClusterList = ClusterList;
    }

    /**
     * Get List of tag keys associated to an instance.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TagKeys List of tag keys associated to an instance.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set List of tag keys associated to an instance.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TagKeys List of tag keys associated to an instance.
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

    public DescribeInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesResponse(DescribeInstancesResponse source) {
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.ClusterList != null) {
            this.ClusterList = new ClusterInstancesInfo[source.ClusterList.length];
            for (int i = 0; i < source.ClusterList.length; i++) {
                this.ClusterList[i] = new ClusterInstancesInfo(source.ClusterList[i]);
            }
        }
        if (source.TagKeys != null) {
            this.TagKeys = new String[source.TagKeys.length];
            for (int i = 0; i < source.TagKeys.length; i++) {
                this.TagKeys[i] = new String(source.TagKeys[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCnt", this.TotalCnt);
        this.setParamArrayObj(map, prefix + "ClusterList.", this.ClusterList);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

