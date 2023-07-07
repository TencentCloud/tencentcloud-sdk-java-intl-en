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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCertificateResponse extends AbstractModel{

    /**
    * List of certificate IDs
    */
    @SerializedName("CertificateIds")
    @Expose
    private String [] CertificateIds;

    /**
    * List of order IDs
    */
    @SerializedName("DealIds")
    @Expose
    private String [] DealIds;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of certificate IDs 
     * @return CertificateIds List of certificate IDs
     */
    public String [] getCertificateIds() {
        return this.CertificateIds;
    }

    /**
     * Set List of certificate IDs
     * @param CertificateIds List of certificate IDs
     */
    public void setCertificateIds(String [] CertificateIds) {
        this.CertificateIds = CertificateIds;
    }

    /**
     * Get List of order IDs 
     * @return DealIds List of order IDs
     */
    public String [] getDealIds() {
        return this.DealIds;
    }

    /**
     * Set List of order IDs
     * @param DealIds List of order IDs
     */
    public void setDealIds(String [] DealIds) {
        this.DealIds = DealIds;
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

    public CreateCertificateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCertificateResponse(CreateCertificateResponse source) {
        if (source.CertificateIds != null) {
            this.CertificateIds = new String[source.CertificateIds.length];
            for (int i = 0; i < source.CertificateIds.length; i++) {
                this.CertificateIds[i] = new String(source.CertificateIds[i]);
            }
        }
        if (source.DealIds != null) {
            this.DealIds = new String[source.DealIds.length];
            for (int i = 0; i < source.DealIds.length; i++) {
                this.DealIds[i] = new String(source.DealIds[i]);
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
        this.setParamArraySimple(map, prefix + "CertificateIds.", this.CertificateIds);
        this.setParamArraySimple(map, prefix + "DealIds.", this.DealIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

