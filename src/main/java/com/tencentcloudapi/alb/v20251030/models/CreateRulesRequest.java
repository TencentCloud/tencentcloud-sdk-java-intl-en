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

public class CreateRulesRequest extends AbstractModel {

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
    * Forwarding rule list.
    */
    @SerializedName("Rules")
    @Expose
    private RuleInput [] Rules;

    /**
    * Client Token, used to ensure the idempotency of requests. Generate a parameter value from your client, ensuring uniqueness of the value for different requests. ClientToken supports only ASCII characters. If not specified, the system automatically uses the RequestId of the API request as the ClientToken flag. The RequestId may not be the same for each API request.
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * Whether it is a pre-check only request.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

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
     * Get Forwarding rule list. 
     * @return Rules Forwarding rule list.
     */
    public RuleInput [] getRules() {
        return this.Rules;
    }

    /**
     * Set Forwarding rule list.
     * @param Rules Forwarding rule list.
     */
    public void setRules(RuleInput [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Client Token, used to ensure the idempotency of requests. Generate a parameter value from your client, ensuring uniqueness of the value for different requests. ClientToken supports only ASCII characters. If not specified, the system automatically uses the RequestId of the API request as the ClientToken flag. The RequestId may not be the same for each API request. 
     * @return ClientToken Client Token, used to ensure the idempotency of requests. Generate a parameter value from your client, ensuring uniqueness of the value for different requests. ClientToken supports only ASCII characters. If not specified, the system automatically uses the RequestId of the API request as the ClientToken flag. The RequestId may not be the same for each API request.
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set Client Token, used to ensure the idempotency of requests. Generate a parameter value from your client, ensuring uniqueness of the value for different requests. ClientToken supports only ASCII characters. If not specified, the system automatically uses the RequestId of the API request as the ClientToken flag. The RequestId may not be the same for each API request.
     * @param ClientToken Client Token, used to ensure the idempotency of requests. Generate a parameter value from your client, ensuring uniqueness of the value for different requests. ClientToken supports only ASCII characters. If not specified, the system automatically uses the RequestId of the API request as the ClientToken flag. The RequestId may not be the same for each API request.
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get Whether it is a pre-check only request. 
     * @return DryRun Whether it is a pre-check only request.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Whether it is a pre-check only request.
     * @param DryRun Whether it is a pre-check only request.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public CreateRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRulesRequest(CreateRulesRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.Rules != null) {
            this.Rules = new RuleInput[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RuleInput(source.Rules[i]);
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
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

