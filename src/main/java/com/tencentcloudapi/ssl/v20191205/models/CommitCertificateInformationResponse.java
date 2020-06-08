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

public class CommitCertificateInformationResponse extends AbstractModel{

    /**
    * TrustAsia order ID
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * Certificate status. 0: being reviewed; 1: approved; 2: not approved; 3: expired; 4: DNS record added; 5: OV certificate, to be submitted; 6: order being canceled; 7: cancelled; 8: information submitted, confirmation letter to be uploaded; 9: certificate being revoked; 10: revoked; 11: reissuing; 12: revocation confirmation letter to be uploaded.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get TrustAsia order ID 
     * @return OrderId TrustAsia order ID
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set TrustAsia order ID
     * @param OrderId TrustAsia order ID
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get Certificate status. 0: being reviewed; 1: approved; 2: not approved; 3: expired; 4: DNS record added; 5: OV certificate, to be submitted; 6: order being canceled; 7: cancelled; 8: information submitted, confirmation letter to be uploaded; 9: certificate being revoked; 10: revoked; 11: reissuing; 12: revocation confirmation letter to be uploaded. 
     * @return Status Certificate status. 0: being reviewed; 1: approved; 2: not approved; 3: expired; 4: DNS record added; 5: OV certificate, to be submitted; 6: order being canceled; 7: cancelled; 8: information submitted, confirmation letter to be uploaded; 9: certificate being revoked; 10: revoked; 11: reissuing; 12: revocation confirmation letter to be uploaded.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Certificate status. 0: being reviewed; 1: approved; 2: not approved; 3: expired; 4: DNS record added; 5: OV certificate, to be submitted; 6: order being canceled; 7: cancelled; 8: information submitted, confirmation letter to be uploaded; 9: certificate being revoked; 10: revoked; 11: reissuing; 12: revocation confirmation letter to be uploaded.
     * @param Status Certificate status. 0: being reviewed; 1: approved; 2: not approved; 3: expired; 4: DNS record added; 5: OV certificate, to be submitted; 6: order being canceled; 7: cancelled; 8: information submitted, confirmation letter to be uploaded; 9: certificate being revoked; 10: revoked; 11: reissuing; 12: revocation confirmation letter to be uploaded.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

