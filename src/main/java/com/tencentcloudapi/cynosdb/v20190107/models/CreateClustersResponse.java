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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClustersResponse extends AbstractModel{

    /**
    * Freezing transaction ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
    * Order ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * List of resource IDs (This field has been deprecated. You need to use `dealNames` in the `DescribeResourcesByDealName` API to get resource IDs.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * List of cluster IDs (This field has been deprecated. You need to use `dealNames` in the `DescribeResourcesByDealName` API to get cluster IDs.)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterIds")
    @Expose
    private String [] ClusterIds;

    /**
    * Big order ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BigDealIds")
    @Expose
    private String [] BigDealIds;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Freezing transaction ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TranId Freezing transaction ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set Freezing transaction ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TranId Freezing transaction ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    /**
     * Get Order ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DealNames Order ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set Order ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DealNames Order ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get List of resource IDs (This field has been deprecated. You need to use `dealNames` in the `DescribeResourcesByDealName` API to get resource IDs.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceIds List of resource IDs (This field has been deprecated. You need to use `dealNames` in the `DescribeResourcesByDealName` API to get resource IDs.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set List of resource IDs (This field has been deprecated. You need to use `dealNames` in the `DescribeResourcesByDealName` API to get resource IDs.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceIds List of resource IDs (This field has been deprecated. You need to use `dealNames` in the `DescribeResourcesByDealName` API to get resource IDs.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get List of cluster IDs (This field has been deprecated. You need to use `dealNames` in the `DescribeResourcesByDealName` API to get cluster IDs.)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterIds List of cluster IDs (This field has been deprecated. You need to use `dealNames` in the `DescribeResourcesByDealName` API to get cluster IDs.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getClusterIds() {
        return this.ClusterIds;
    }

    /**
     * Set List of cluster IDs (This field has been deprecated. You need to use `dealNames` in the `DescribeResourcesByDealName` API to get cluster IDs.)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterIds List of cluster IDs (This field has been deprecated. You need to use `dealNames` in the `DescribeResourcesByDealName` API to get cluster IDs.)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterIds(String [] ClusterIds) {
        this.ClusterIds = ClusterIds;
    }

    /**
     * Get Big order ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BigDealIds Big order ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBigDealIds() {
        return this.BigDealIds;
    }

    /**
     * Set Big order ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BigDealIds Big order ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBigDealIds(String [] BigDealIds) {
        this.BigDealIds = BigDealIds;
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

    public CreateClustersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClustersResponse(CreateClustersResponse source) {
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
            }
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.ClusterIds != null) {
            this.ClusterIds = new String[source.ClusterIds.length];
            for (int i = 0; i < source.ClusterIds.length; i++) {
                this.ClusterIds[i] = new String(source.ClusterIds[i]);
            }
        }
        if (source.BigDealIds != null) {
            this.BigDealIds = new String[source.BigDealIds.length];
            for (int i = 0; i < source.BigDealIds.length; i++) {
                this.BigDealIds[i] = new String(source.BigDealIds[i]);
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
        this.setParamSimple(map, prefix + "TranId", this.TranId);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamArraySimple(map, prefix + "ClusterIds.", this.ClusterIds);
        this.setParamArraySimple(map, prefix + "BigDealIds.", this.BigDealIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

