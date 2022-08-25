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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClientUploadAccelerationUsageDataResponse extends AbstractModel{

    /**
    * The usage of client upload acceleration.
    */
    @SerializedName("ClientUploadAccelerationUsageDataSet")
    @Expose
    private StatDataItem [] ClientUploadAccelerationUsageDataSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The usage of client upload acceleration. 
     * @return ClientUploadAccelerationUsageDataSet The usage of client upload acceleration.
     */
    public StatDataItem [] getClientUploadAccelerationUsageDataSet() {
        return this.ClientUploadAccelerationUsageDataSet;
    }

    /**
     * Set The usage of client upload acceleration.
     * @param ClientUploadAccelerationUsageDataSet The usage of client upload acceleration.
     */
    public void setClientUploadAccelerationUsageDataSet(StatDataItem [] ClientUploadAccelerationUsageDataSet) {
        this.ClientUploadAccelerationUsageDataSet = ClientUploadAccelerationUsageDataSet;
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

    public DescribeClientUploadAccelerationUsageDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClientUploadAccelerationUsageDataResponse(DescribeClientUploadAccelerationUsageDataResponse source) {
        if (source.ClientUploadAccelerationUsageDataSet != null) {
            this.ClientUploadAccelerationUsageDataSet = new StatDataItem[source.ClientUploadAccelerationUsageDataSet.length];
            for (int i = 0; i < source.ClientUploadAccelerationUsageDataSet.length; i++) {
                this.ClientUploadAccelerationUsageDataSet[i] = new StatDataItem(source.ClientUploadAccelerationUsageDataSet[i]);
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
        this.setParamArrayObj(map, prefix + "ClientUploadAccelerationUsageDataSet.", this.ClientUploadAccelerationUsageDataSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

