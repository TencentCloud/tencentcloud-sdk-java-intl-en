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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEdrLessAlertExportJobRequest extends AbstractModel {

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>MachineName  Host nameInstanceID  Instance ID  IP   Private IP address or public IP address - Required: No - Filter by host IP or aliasHostId - String - Required: No - Host IdAgentId - String - Required: No - Client IdPolicyType - String - Required: No - Policy type, 0: system policy 1: user-defined policyDomain - String - Required: No - Domain name (URL-encode the Domain name first, then base64-encode it)HandleStatus - String - Required: No - Status filtering 0: pending; 2: trust; 3: untrustedBeginTime - String - Required: No - Start time of last accessEndTime - String - Required: No - End time of last access</p>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilter [] Filters;

    /**
    * <p>Sorting method: [ASC: ascending order|DESC: descending order]</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting field: [LatestDetectTime: Latest request time]</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>MachineName  Host nameInstanceID  Instance ID  IP   Private IP address or public IP address - Required: No - Filter by host IP or aliasHostId - String - Required: No - Host IdAgentId - String - Required: No - Client IdPolicyType - String - Required: No - Policy type, 0: system policy 1: user-defined policyDomain - String - Required: No - Domain name (URL-encode the Domain name first, then base64-encode it)HandleStatus - String - Required: No - Status filtering 0: pending; 2: trust; 3: untrustedBeginTime - String - Required: No - Start time of last accessEndTime - String - Required: No - End time of last access</p> 
     * @return Filters <p>MachineName  Host nameInstanceID  Instance ID  IP   Private IP address or public IP address - Required: No - Filter by host IP or aliasHostId - String - Required: No - Host IdAgentId - String - Required: No - Client IdPolicyType - String - Required: No - Policy type, 0: system policy 1: user-defined policyDomain - String - Required: No - Domain name (URL-encode the Domain name first, then base64-encode it)HandleStatus - String - Required: No - Status filtering 0: pending; 2: trust; 3: untrustedBeginTime - String - Required: No - Start time of last accessEndTime - String - Required: No - End time of last access</p>
     */
    public EDRFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>MachineName  Host nameInstanceID  Instance ID  IP   Private IP address or public IP address - Required: No - Filter by host IP or aliasHostId - String - Required: No - Host IdAgentId - String - Required: No - Client IdPolicyType - String - Required: No - Policy type, 0: system policy 1: user-defined policyDomain - String - Required: No - Domain name (URL-encode the Domain name first, then base64-encode it)HandleStatus - String - Required: No - Status filtering 0: pending; 2: trust; 3: untrustedBeginTime - String - Required: No - Start time of last accessEndTime - String - Required: No - End time of last access</p>
     * @param Filters <p>MachineName  Host nameInstanceID  Instance ID  IP   Private IP address or public IP address - Required: No - Filter by host IP or aliasHostId - String - Required: No - Host IdAgentId - String - Required: No - Client IdPolicyType - String - Required: No - Policy type, 0: system policy 1: user-defined policyDomain - String - Required: No - Domain name (URL-encode the Domain name first, then base64-encode it)HandleStatus - String - Required: No - Status filtering 0: pending; 2: trust; 3: untrustedBeginTime - String - Required: No - Start time of last accessEndTime - String - Required: No - End time of last access</p>
     */
    public void setFilters(EDRFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Sorting method: [ASC: ascending order|DESC: descending order]</p> 
     * @return Order <p>Sorting method: [ASC: ascending order|DESC: descending order]</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting method: [ASC: ascending order|DESC: descending order]</p>
     * @param Order <p>Sorting method: [ASC: ascending order|DESC: descending order]</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting field: [LatestDetectTime: Latest request time]</p> 
     * @return By <p>Sorting field: [LatestDetectTime: Latest request time]</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sorting field: [LatestDetectTime: Latest request time]</p>
     * @param By <p>Sorting field: [LatestDetectTime: Latest request time]</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public CreateEdrLessAlertExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEdrLessAlertExportJobRequest(CreateEdrLessAlertExportJobRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilter(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

