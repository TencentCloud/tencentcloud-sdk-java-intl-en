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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCertificatesResponse extends AbstractModel {

    /**
    * Server certificate list, which includes certificate ID and certificate name.
    */
    @SerializedName("CertificateSet")
    @Expose
    private Certificate [] CertificateSet;

    /**
    * Total quantity of server certificates that match the query conditions.
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
     * Get Server certificate list, which includes certificate ID and certificate name. 
     * @return CertificateSet Server certificate list, which includes certificate ID and certificate name.
     */
    public Certificate [] getCertificateSet() {
        return this.CertificateSet;
    }

    /**
     * Set Server certificate list, which includes certificate ID and certificate name.
     * @param CertificateSet Server certificate list, which includes certificate ID and certificate name.
     */
    public void setCertificateSet(Certificate [] CertificateSet) {
        this.CertificateSet = CertificateSet;
    }

    /**
     * Get Total quantity of server certificates that match the query conditions. 
     * @return TotalCount Total quantity of server certificates that match the query conditions.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total quantity of server certificates that match the query conditions.
     * @param TotalCount Total quantity of server certificates that match the query conditions.
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

    public DescribeCertificatesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCertificatesResponse(DescribeCertificatesResponse source) {
        if (source.CertificateSet != null) {
            this.CertificateSet = new Certificate[source.CertificateSet.length];
            for (int i = 0; i < source.CertificateSet.length; i++) {
                this.CertificateSet[i] = new Certificate(source.CertificateSet[i]);
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
        this.setParamArrayObj(map, prefix + "CertificateSet.", this.CertificateSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

