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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHaVipsResponse extends AbstractModel {

    /**
    * Number of eligible objects.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Array of HAVIP objects.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HaVipSet")
    @Expose
    private HaVip [] HaVipSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of eligible objects. 
     * @return TotalCount Number of eligible objects.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible objects.
     * @param TotalCount Number of eligible objects.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Array of HAVIP objects.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HaVipSet Array of HAVIP objects.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public HaVip [] getHaVipSet() {
        return this.HaVipSet;
    }

    /**
     * Set Array of HAVIP objects.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HaVipSet Array of HAVIP objects.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHaVipSet(HaVip [] HaVipSet) {
        this.HaVipSet = HaVipSet;
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

    public DescribeHaVipsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHaVipsResponse(DescribeHaVipsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.HaVipSet != null) {
            this.HaVipSet = new HaVip[source.HaVipSet.length];
            for (int i = 0; i < source.HaVipSet.length; i++) {
                this.HaVipSet[i] = new HaVip(source.HaVipSet[i]);
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
        this.setParamArrayObj(map, prefix + "HaVipSet.", this.HaVipSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

