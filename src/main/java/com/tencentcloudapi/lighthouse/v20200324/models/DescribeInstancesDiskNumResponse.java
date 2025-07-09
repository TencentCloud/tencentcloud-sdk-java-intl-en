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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesDiskNumResponse extends AbstractModel {

    /**
    * Information of all attached disks
    */
    @SerializedName("AttachDetailSet")
    @Expose
    private AttachDetail [] AttachDetailSet;

    /**
    * Number of attached cloud disks
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
     * Get Information of all attached disks 
     * @return AttachDetailSet Information of all attached disks
     */
    public AttachDetail [] getAttachDetailSet() {
        return this.AttachDetailSet;
    }

    /**
     * Set Information of all attached disks
     * @param AttachDetailSet Information of all attached disks
     */
    public void setAttachDetailSet(AttachDetail [] AttachDetailSet) {
        this.AttachDetailSet = AttachDetailSet;
    }

    /**
     * Get Number of attached cloud disks 
     * @return TotalCount Number of attached cloud disks
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of attached cloud disks
     * @param TotalCount Number of attached cloud disks
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

    public DescribeInstancesDiskNumResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesDiskNumResponse(DescribeInstancesDiskNumResponse source) {
        if (source.AttachDetailSet != null) {
            this.AttachDetailSet = new AttachDetail[source.AttachDetailSet.length];
            for (int i = 0; i < source.AttachDetailSet.length; i++) {
                this.AttachDetailSet[i] = new AttachDetail(source.AttachDetailSet[i]);
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
        this.setParamArrayObj(map, prefix + "AttachDetailSet.", this.AttachDetailSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

