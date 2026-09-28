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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListenerCertificatesRequest extends AbstractModel {

    /**
    * Certificate type. Value: CA or SVR (server certificate).
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * Listener ID, in the format of lst- followed by 8 alphanumeric characters.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Maximum number of data records to read this time. Value range: 1-100. Default value: 20.
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Token for the next query. Value:
Not required for the first query or when there is no next query.
If there is a next query, the value is the NextToken value returned from the last API call.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get Certificate type. Value: CA or SVR (server certificate). 
     * @return CertificateType Certificate type. Value: CA or SVR (server certificate).
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set Certificate type. Value: CA or SVR (server certificate).
     * @param CertificateType Certificate type. Value: CA or SVR (server certificate).
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get Listener ID, in the format of lst- followed by 8 alphanumeric characters. 
     * @return ListenerId Listener ID, in the format of lst- followed by 8 alphanumeric characters.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID, in the format of lst- followed by 8 alphanumeric characters.
     * @param ListenerId Listener ID, in the format of lst- followed by 8 alphanumeric characters.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get CLB instance ID. The format is alb- followed by 8 alphanumeric characters. 
     * @return LoadBalancerId CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
     * @param LoadBalancerId CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Maximum number of data records to read this time. Value range: 1-100. Default value: 20. 
     * @return MaxResults Maximum number of data records to read this time. Value range: 1-100. Default value: 20.
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Maximum number of data records to read this time. Value range: 1-100. Default value: 20.
     * @param MaxResults Maximum number of data records to read this time. Value range: 1-100. Default value: 20.
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Token for the next query. Value:
Not required for the first query or when there is no next query.
If there is a next query, the value is the NextToken value returned from the last API call. 
     * @return NextToken Token for the next query. Value:
Not required for the first query or when there is no next query.
If there is a next query, the value is the NextToken value returned from the last API call.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Token for the next query. Value:
Not required for the first query or when there is no next query.
If there is a next query, the value is the NextToken value returned from the last API call.
     * @param NextToken Token for the next query. Value:
Not required for the first query or when there is no next query.
If there is a next query, the value is the NextToken value returned from the last API call.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public DescribeListenerCertificatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListenerCertificatesRequest(DescribeListenerCertificatesRequest source) {
        if (source.CertificateType != null) {
            this.CertificateType = new String(source.CertificateType);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

