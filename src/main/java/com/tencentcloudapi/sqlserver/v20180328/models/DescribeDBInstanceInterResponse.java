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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceInterResponse extends AbstractModel{

    /**
    * Number of records returned
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Details of instance in the interworking group
    */
    @SerializedName("InterInstanceSet")
    @Expose
    private InterInstance [] InterInstanceSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of records returned 
     * @return TotalCount Number of records returned
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of records returned
     * @param TotalCount Number of records returned
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Details of instance in the interworking group 
     * @return InterInstanceSet Details of instance in the interworking group
     */
    public InterInstance [] getInterInstanceSet() {
        return this.InterInstanceSet;
    }

    /**
     * Set Details of instance in the interworking group
     * @param InterInstanceSet Details of instance in the interworking group
     */
    public void setInterInstanceSet(InterInstance [] InterInstanceSet) {
        this.InterInstanceSet = InterInstanceSet;
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

    public DescribeDBInstanceInterResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceInterResponse(DescribeDBInstanceInterResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InterInstanceSet != null) {
            this.InterInstanceSet = new InterInstance[source.InterInstanceSet.length];
            for (int i = 0; i < source.InterInstanceSet.length; i++) {
                this.InterInstanceSet[i] = new InterInstance(source.InterInstanceSet[i]);
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
        this.setParamArrayObj(map, prefix + "InterInstanceSet.", this.InterInstanceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

