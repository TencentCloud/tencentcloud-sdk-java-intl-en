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

public class DescribeClusterInstanceGrpsResponse extends AbstractModel{

    /**
    * Number of instance groups
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Instance group list
    */
    @SerializedName("InstanceGrpInfoList")
    @Expose
    private CynosdbInstanceGrp [] InstanceGrpInfoList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of instance groups 
     * @return TotalCount Number of instance groups
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of instance groups
     * @param TotalCount Number of instance groups
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Instance group list 
     * @return InstanceGrpInfoList Instance group list
     */
    public CynosdbInstanceGrp [] getInstanceGrpInfoList() {
        return this.InstanceGrpInfoList;
    }

    /**
     * Set Instance group list
     * @param InstanceGrpInfoList Instance group list
     */
    public void setInstanceGrpInfoList(CynosdbInstanceGrp [] InstanceGrpInfoList) {
        this.InstanceGrpInfoList = InstanceGrpInfoList;
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

    public DescribeClusterInstanceGrpsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterInstanceGrpsResponse(DescribeClusterInstanceGrpsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InstanceGrpInfoList != null) {
            this.InstanceGrpInfoList = new CynosdbInstanceGrp[source.InstanceGrpInfoList.length];
            for (int i = 0; i < source.InstanceGrpInfoList.length; i++) {
                this.InstanceGrpInfoList[i] = new CynosdbInstanceGrp(source.InstanceGrpInfoList[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "InstanceGrpInfoList.", this.InstanceGrpInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

