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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRotationHistoryResponse extends AbstractModel{

    /**
    * List of version numbers.
    */
    @SerializedName("VersionIDs")
    @Expose
    private String [] VersionIDs;

    /**
    * Number of version numbers. The maximum number of version numbers that can be shown to users is 10.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of version numbers. 
     * @return VersionIDs List of version numbers.
     */
    public String [] getVersionIDs() {
        return this.VersionIDs;
    }

    /**
     * Set List of version numbers.
     * @param VersionIDs List of version numbers.
     */
    public void setVersionIDs(String [] VersionIDs) {
        this.VersionIDs = VersionIDs;
    }

    /**
     * Get Number of version numbers. The maximum number of version numbers that can be shown to users is 10. 
     * @return TotalCount Number of version numbers. The maximum number of version numbers that can be shown to users is 10.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of version numbers. The maximum number of version numbers that can be shown to users is 10.
     * @param TotalCount Number of version numbers. The maximum number of version numbers that can be shown to users is 10.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeRotationHistoryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRotationHistoryResponse(DescribeRotationHistoryResponse source) {
        if (source.VersionIDs != null) {
            this.VersionIDs = new String[source.VersionIDs.length];
            for (int i = 0; i < source.VersionIDs.length; i++) {
                this.VersionIDs[i] = new String(source.VersionIDs[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VersionIDs.", this.VersionIDs);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

