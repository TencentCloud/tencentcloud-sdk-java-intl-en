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

public class DeleteLoadBalancersRequest extends AbstractModel {

    /**
    * List of Cloud Load Balancer instance IDs. The format is alb- followed by 8 alphanumeric characters.
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * Client Token, used for ensuring the idempotency of requests.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.


    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Whether to only precheck this request. Parameter value:

- **true**: Send a check request. The CLB instance will not be deleted. Check items include whether required parameters are filled in, request format, and service limits. If a check fails, return the corresponding error. If all checks pass, return the error code `DryRunOperation`.

- **false** (default value): Send a normal request, return `HTTP 2xx` status code after check, and directly perform the operation.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get List of Cloud Load Balancer instance IDs. The format is alb- followed by 8 alphanumeric characters. 
     * @return LoadBalancerIds List of Cloud Load Balancer instance IDs. The format is alb- followed by 8 alphanumeric characters.
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set List of Cloud Load Balancer instance IDs. The format is alb- followed by 8 alphanumeric characters.
     * @param LoadBalancerIds List of Cloud Load Balancer instance IDs. The format is alb- followed by 8 alphanumeric characters.
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get Client Token, used for ensuring the idempotency of requests.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.

 
     * @return ClientToken Client Token, used for ensuring the idempotency of requests.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.


     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set Client Token, used for ensuring the idempotency of requests.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.


     * @param ClientToken Client Token, used for ensuring the idempotency of requests.

Generate a parameter value from your client to underwrite the uniqueness of the value for different requests. ClientToken supports only ASCII characters.


     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Whether to only precheck this request. Parameter value:

- **true**: Send a check request. The CLB instance will not be deleted. Check items include whether required parameters are filled in, request format, and service limits. If a check fails, return the corresponding error. If all checks pass, return the error code `DryRunOperation`.

- **false** (default value): Send a normal request, return `HTTP 2xx` status code after check, and directly perform the operation. 
     * @return DryRun Whether to only precheck this request. Parameter value:

- **true**: Send a check request. The CLB instance will not be deleted. Check items include whether required parameters are filled in, request format, and service limits. If a check fails, return the corresponding error. If all checks pass, return the error code `DryRunOperation`.

- **false** (default value): Send a normal request, return `HTTP 2xx` status code after check, and directly perform the operation.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether to only precheck this request. Parameter value:

- **true**: Send a check request. The CLB instance will not be deleted. Check items include whether required parameters are filled in, request format, and service limits. If a check fails, return the corresponding error. If all checks pass, return the error code `DryRunOperation`.

- **false** (default value): Send a normal request, return `HTTP 2xx` status code after check, and directly perform the operation.
     * @param DryRun Whether to only precheck this request. Parameter value:

- **true**: Send a check request. The CLB instance will not be deleted. Check items include whether required parameters are filled in, request format, and service limits. If a check fails, return the corresponding error. If all checks pass, return the error code `DryRunOperation`.

- **false** (default value): Send a normal request, return `HTTP 2xx` status code after check, and directly perform the operation.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public DeleteLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLoadBalancersRequest(DeleteLoadBalancersRequest source) {
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

