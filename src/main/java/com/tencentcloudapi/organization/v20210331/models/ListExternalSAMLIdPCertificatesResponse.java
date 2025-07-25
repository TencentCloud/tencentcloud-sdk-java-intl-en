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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListExternalSAMLIdPCertificatesResponse extends AbstractModel {

    /**
    * Total number of data entries that meet the request parameter conditions.
    */
    @SerializedName("TotalCounts")
    @Expose
    private Long TotalCounts;

    /**
    * SAML signing certificate list.
    */
    @SerializedName("SAMLIdPCertificates")
    @Expose
    private SAMLIdPCertificate [] SAMLIdPCertificates;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of data entries that meet the request parameter conditions. 
     * @return TotalCounts Total number of data entries that meet the request parameter conditions.
     */
    public Long getTotalCounts() {
        return this.TotalCounts;
    }

    /**
     * Set Total number of data entries that meet the request parameter conditions.
     * @param TotalCounts Total number of data entries that meet the request parameter conditions.
     */
    public void setTotalCounts(Long TotalCounts) {
        this.TotalCounts = TotalCounts;
    }

    /**
     * Get SAML signing certificate list. 
     * @return SAMLIdPCertificates SAML signing certificate list.
     */
    public SAMLIdPCertificate [] getSAMLIdPCertificates() {
        return this.SAMLIdPCertificates;
    }

    /**
     * Set SAML signing certificate list.
     * @param SAMLIdPCertificates SAML signing certificate list.
     */
    public void setSAMLIdPCertificates(SAMLIdPCertificate [] SAMLIdPCertificates) {
        this.SAMLIdPCertificates = SAMLIdPCertificates;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ListExternalSAMLIdPCertificatesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListExternalSAMLIdPCertificatesResponse(ListExternalSAMLIdPCertificatesResponse source) {
        if (source.TotalCounts != null) {
            this.TotalCounts = new Long(source.TotalCounts);
        }
        if (source.SAMLIdPCertificates != null) {
            this.SAMLIdPCertificates = new SAMLIdPCertificate[source.SAMLIdPCertificates.length];
            for (int i = 0; i < source.SAMLIdPCertificates.length; i++) {
                this.SAMLIdPCertificates[i] = new SAMLIdPCertificate(source.SAMLIdPCertificates[i]);
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
        this.setParamSimple(map, prefix + "TotalCounts", this.TotalCounts);
        this.setParamArrayObj(map, prefix + "SAMLIdPCertificates.", this.SAMLIdPCertificates);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

