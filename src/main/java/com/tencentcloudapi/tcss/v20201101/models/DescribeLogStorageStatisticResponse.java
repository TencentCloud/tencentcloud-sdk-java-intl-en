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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogStorageStatisticResponse extends AbstractModel{

    /**
    * Total capacity in GB
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
    * Used capacity in GB
    */
    @SerializedName("UsedSize")
    @Expose
    private Long UsedSize;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total capacity in GB 
     * @return TotalSize Total capacity in GB
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set Total capacity in GB
     * @param TotalSize Total capacity in GB
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get Used capacity in GB 
     * @return UsedSize Used capacity in GB
     */
    public Long getUsedSize() {
        return this.UsedSize;
    }

    /**
     * Set Used capacity in GB
     * @param UsedSize Used capacity in GB
     */
    public void setUsedSize(Long UsedSize) {
        this.UsedSize = UsedSize;
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

    public DescribeLogStorageStatisticResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogStorageStatisticResponse(DescribeLogStorageStatisticResponse source) {
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
        if (source.UsedSize != null) {
            this.UsedSize = new Long(source.UsedSize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamSimple(map, prefix + "UsedSize", this.UsedSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

