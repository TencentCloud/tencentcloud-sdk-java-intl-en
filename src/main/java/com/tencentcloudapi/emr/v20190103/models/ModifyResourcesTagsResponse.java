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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourcesTagsResponse extends AbstractModel {

    /**
    * List of resource IDs with successful modification
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SuccessList")
    @Expose
    private String [] SuccessList;

    /**
    * List of resource IDs with failed modification
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FailList")
    @Expose
    private String [] FailList;

    /**
    * List of resource IDs with partial successful modification
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PartSuccessList")
    @Expose
    private String [] PartSuccessList;

    /**
    * Mapping list of cluster IDs and process IDs
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterToFlowIdList")
    @Expose
    private ClusterIDToFlowID [] ClusterToFlowIdList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of resource IDs with successful modification
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SuccessList List of resource IDs with successful modification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSuccessList() {
        return this.SuccessList;
    }

    /**
     * Set List of resource IDs with successful modification
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SuccessList List of resource IDs with successful modification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSuccessList(String [] SuccessList) {
        this.SuccessList = SuccessList;
    }

    /**
     * Get List of resource IDs with failed modification
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FailList List of resource IDs with failed modification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getFailList() {
        return this.FailList;
    }

    /**
     * Set List of resource IDs with failed modification
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FailList List of resource IDs with failed modification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFailList(String [] FailList) {
        this.FailList = FailList;
    }

    /**
     * Get List of resource IDs with partial successful modification
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PartSuccessList List of resource IDs with partial successful modification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPartSuccessList() {
        return this.PartSuccessList;
    }

    /**
     * Set List of resource IDs with partial successful modification
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PartSuccessList List of resource IDs with partial successful modification
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartSuccessList(String [] PartSuccessList) {
        this.PartSuccessList = PartSuccessList;
    }

    /**
     * Get Mapping list of cluster IDs and process IDs
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterToFlowIdList Mapping list of cluster IDs and process IDs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ClusterIDToFlowID [] getClusterToFlowIdList() {
        return this.ClusterToFlowIdList;
    }

    /**
     * Set Mapping list of cluster IDs and process IDs
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterToFlowIdList Mapping list of cluster IDs and process IDs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterToFlowIdList(ClusterIDToFlowID [] ClusterToFlowIdList) {
        this.ClusterToFlowIdList = ClusterToFlowIdList;
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

    public ModifyResourcesTagsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourcesTagsResponse(ModifyResourcesTagsResponse source) {
        if (source.SuccessList != null) {
            this.SuccessList = new String[source.SuccessList.length];
            for (int i = 0; i < source.SuccessList.length; i++) {
                this.SuccessList[i] = new String(source.SuccessList[i]);
            }
        }
        if (source.FailList != null) {
            this.FailList = new String[source.FailList.length];
            for (int i = 0; i < source.FailList.length; i++) {
                this.FailList[i] = new String(source.FailList[i]);
            }
        }
        if (source.PartSuccessList != null) {
            this.PartSuccessList = new String[source.PartSuccessList.length];
            for (int i = 0; i < source.PartSuccessList.length; i++) {
                this.PartSuccessList[i] = new String(source.PartSuccessList[i]);
            }
        }
        if (source.ClusterToFlowIdList != null) {
            this.ClusterToFlowIdList = new ClusterIDToFlowID[source.ClusterToFlowIdList.length];
            for (int i = 0; i < source.ClusterToFlowIdList.length; i++) {
                this.ClusterToFlowIdList[i] = new ClusterIDToFlowID(source.ClusterToFlowIdList[i]);
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
        this.setParamArraySimple(map, prefix + "SuccessList.", this.SuccessList);
        this.setParamArraySimple(map, prefix + "FailList.", this.FailList);
        this.setParamArraySimple(map, prefix + "PartSuccessList.", this.PartSuccessList);
        this.setParamArrayObj(map, prefix + "ClusterToFlowIdList.", this.ClusterToFlowIdList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

