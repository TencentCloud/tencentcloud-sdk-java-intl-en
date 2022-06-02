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

public class DescribeInstancesListResponse extends AbstractModel{

    /**
    * Number of eligible instances.
    */
    @SerializedName("TotalCnt")
    @Expose
    private Long TotalCnt;

    /**
    * Cluster instance list.
    */
    @SerializedName("InstancesList")
    @Expose
    private EmrListInstance [] InstancesList;

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
     * Get Cluster instance list. 
     * @return InstancesList Cluster instance list.
     */
    public EmrListInstance [] getInstancesList() {
        return this.InstancesList;
    }

    /**
     * Set Cluster instance list.
     * @param InstancesList Cluster instance list.
     */
    public void setInstancesList(EmrListInstance [] InstancesList) {
        this.InstancesList = InstancesList;
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

    public DescribeInstancesListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesListResponse(DescribeInstancesListResponse source) {
        if (source.TotalCnt != null) {
            this.TotalCnt = new Long(source.TotalCnt);
        }
        if (source.InstancesList != null) {
            this.InstancesList = new EmrListInstance[source.InstancesList.length];
            for (int i = 0; i < source.InstancesList.length; i++) {
                this.InstancesList[i] = new EmrListInstance(source.InstancesList[i]);
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
        this.setParamArrayObj(map, prefix + "InstancesList.", this.InstancesList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

