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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveCertsResponse extends AbstractModel{

    /**
    * Certificate information list.
    */
    @SerializedName("CertInfoSet")
    @Expose
    private CertInfo [] CertInfoSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Certificate information list. 
     * @return CertInfoSet Certificate information list.
     */
    public CertInfo [] getCertInfoSet() {
        return this.CertInfoSet;
    }

    /**
     * Set Certificate information list.
     * @param CertInfoSet Certificate information list.
     */
    public void setCertInfoSet(CertInfo [] CertInfoSet) {
        this.CertInfoSet = CertInfoSet;
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

    public DescribeLiveCertsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveCertsResponse(DescribeLiveCertsResponse source) {
        if (source.CertInfoSet != null) {
            this.CertInfoSet = new CertInfo[source.CertInfoSet.length];
            for (int i = 0; i < source.CertInfoSet.length; i++) {
                this.CertInfoSet[i] = new CertInfo(source.CertInfoSet[i]);
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
        this.setParamArrayObj(map, prefix + "CertInfoSet.", this.CertInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

