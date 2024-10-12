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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeliveryCondition extends AbstractModel {

    /**
    * Log filter criteria. The detailed filter criteria are as follows:
<li>EdgeResponseStatusCode: Filter by response status code returned from the EdgeOne node to the client.<br>?? Supported operators: equal, great, less, great_equal, less_equal<br>?? Valid values: any integer greater than or equal to 0</li>
<li>OriginResponseStatusCode: Filter by response status code of the origin server.<br>?? Supported operators: equal, great, less, great_equal, less_equal.<br>?? Valid values: any integer greater than or equal to -1</li>
<li>SecurityAction: Filter by final action after the request matches a security rule.<br>?? Supported operator: equal<br>?? Options:<br>?? -: unknown/not matched<br>?? Monitor: observation<br>?? JSChallenge: JavaScript challenge<br>?? Deny: blocking<br>?? Allow: allowing<br>?? BlockIP: IP blocking<br>?? Redirect: redirection<br>?? ReturnCustomPage: returning to a custom page<br>?? ManagedChallenge: managed challenge<br>?? Silence: silence<br>?? LongDelay: response after a long delay<br>?? ShortDelay: response after a short delay</li>
<li>SecurityModule: Filter by name of the security module finally handling the request.<br>??Supported operator: equal<br>??Options:<br>?? -: unknown/not matched<br>?? CustomRule: Custom Rules in Web Protection<br>?? RateLimitingCustomRule: Rate Limiting Rules in Web Protection<br>?? ManagedRule: Managed Rules in Web Protection<br>?? L7DDoS: CC Attack Defense in Web Protection<br>?? BotManagement: Bot Basic Management in Bot Management<br>?? BotClientReputation: Client Reputation Analysis in Bot Management<br>?? BotBehaviorAnalysis: Bot Intelligent Analysis in Bot Management<br>?? BotCustomRule: Custom Bot Rules in Bot Management<br>?? BotActiveDetection: Active Detection in Bot Management</li>
    */
    @SerializedName("Conditions")
    @Expose
    private QueryCondition [] Conditions;

    /**
     * Get Log filter criteria. The detailed filter criteria are as follows:
<li>EdgeResponseStatusCode: Filter by response status code returned from the EdgeOne node to the client.<br>?? Supported operators: equal, great, less, great_equal, less_equal<br>?? Valid values: any integer greater than or equal to 0</li>
<li>OriginResponseStatusCode: Filter by response status code of the origin server.<br>?? Supported operators: equal, great, less, great_equal, less_equal.<br>?? Valid values: any integer greater than or equal to -1</li>
<li>SecurityAction: Filter by final action after the request matches a security rule.<br>?? Supported operator: equal<br>?? Options:<br>?? -: unknown/not matched<br>?? Monitor: observation<br>?? JSChallenge: JavaScript challenge<br>?? Deny: blocking<br>?? Allow: allowing<br>?? BlockIP: IP blocking<br>?? Redirect: redirection<br>?? ReturnCustomPage: returning to a custom page<br>?? ManagedChallenge: managed challenge<br>?? Silence: silence<br>?? LongDelay: response after a long delay<br>?? ShortDelay: response after a short delay</li>
<li>SecurityModule: Filter by name of the security module finally handling the request.<br>??Supported operator: equal<br>??Options:<br>?? -: unknown/not matched<br>?? CustomRule: Custom Rules in Web Protection<br>?? RateLimitingCustomRule: Rate Limiting Rules in Web Protection<br>?? ManagedRule: Managed Rules in Web Protection<br>?? L7DDoS: CC Attack Defense in Web Protection<br>?? BotManagement: Bot Basic Management in Bot Management<br>?? BotClientReputation: Client Reputation Analysis in Bot Management<br>?? BotBehaviorAnalysis: Bot Intelligent Analysis in Bot Management<br>?? BotCustomRule: Custom Bot Rules in Bot Management<br>?? BotActiveDetection: Active Detection in Bot Management</li> 
     * @return Conditions Log filter criteria. The detailed filter criteria are as follows:
<li>EdgeResponseStatusCode: Filter by response status code returned from the EdgeOne node to the client.<br>?? Supported operators: equal, great, less, great_equal, less_equal<br>?? Valid values: any integer greater than or equal to 0</li>
<li>OriginResponseStatusCode: Filter by response status code of the origin server.<br>?? Supported operators: equal, great, less, great_equal, less_equal.<br>?? Valid values: any integer greater than or equal to -1</li>
<li>SecurityAction: Filter by final action after the request matches a security rule.<br>?? Supported operator: equal<br>?? Options:<br>?? -: unknown/not matched<br>?? Monitor: observation<br>?? JSChallenge: JavaScript challenge<br>?? Deny: blocking<br>?? Allow: allowing<br>?? BlockIP: IP blocking<br>?? Redirect: redirection<br>?? ReturnCustomPage: returning to a custom page<br>?? ManagedChallenge: managed challenge<br>?? Silence: silence<br>?? LongDelay: response after a long delay<br>?? ShortDelay: response after a short delay</li>
<li>SecurityModule: Filter by name of the security module finally handling the request.<br>??Supported operator: equal<br>??Options:<br>?? -: unknown/not matched<br>?? CustomRule: Custom Rules in Web Protection<br>?? RateLimitingCustomRule: Rate Limiting Rules in Web Protection<br>?? ManagedRule: Managed Rules in Web Protection<br>?? L7DDoS: CC Attack Defense in Web Protection<br>?? BotManagement: Bot Basic Management in Bot Management<br>?? BotClientReputation: Client Reputation Analysis in Bot Management<br>?? BotBehaviorAnalysis: Bot Intelligent Analysis in Bot Management<br>?? BotCustomRule: Custom Bot Rules in Bot Management<br>?? BotActiveDetection: Active Detection in Bot Management</li>
     */
    public QueryCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Log filter criteria. The detailed filter criteria are as follows:
<li>EdgeResponseStatusCode: Filter by response status code returned from the EdgeOne node to the client.<br>?? Supported operators: equal, great, less, great_equal, less_equal<br>?? Valid values: any integer greater than or equal to 0</li>
<li>OriginResponseStatusCode: Filter by response status code of the origin server.<br>?? Supported operators: equal, great, less, great_equal, less_equal.<br>?? Valid values: any integer greater than or equal to -1</li>
<li>SecurityAction: Filter by final action after the request matches a security rule.<br>?? Supported operator: equal<br>?? Options:<br>?? -: unknown/not matched<br>?? Monitor: observation<br>?? JSChallenge: JavaScript challenge<br>?? Deny: blocking<br>?? Allow: allowing<br>?? BlockIP: IP blocking<br>?? Redirect: redirection<br>?? ReturnCustomPage: returning to a custom page<br>?? ManagedChallenge: managed challenge<br>?? Silence: silence<br>?? LongDelay: response after a long delay<br>?? ShortDelay: response after a short delay</li>
<li>SecurityModule: Filter by name of the security module finally handling the request.<br>??Supported operator: equal<br>??Options:<br>?? -: unknown/not matched<br>?? CustomRule: Custom Rules in Web Protection<br>?? RateLimitingCustomRule: Rate Limiting Rules in Web Protection<br>?? ManagedRule: Managed Rules in Web Protection<br>?? L7DDoS: CC Attack Defense in Web Protection<br>?? BotManagement: Bot Basic Management in Bot Management<br>?? BotClientReputation: Client Reputation Analysis in Bot Management<br>?? BotBehaviorAnalysis: Bot Intelligent Analysis in Bot Management<br>?? BotCustomRule: Custom Bot Rules in Bot Management<br>?? BotActiveDetection: Active Detection in Bot Management</li>
     * @param Conditions Log filter criteria. The detailed filter criteria are as follows:
<li>EdgeResponseStatusCode: Filter by response status code returned from the EdgeOne node to the client.<br>?? Supported operators: equal, great, less, great_equal, less_equal<br>?? Valid values: any integer greater than or equal to 0</li>
<li>OriginResponseStatusCode: Filter by response status code of the origin server.<br>?? Supported operators: equal, great, less, great_equal, less_equal.<br>?? Valid values: any integer greater than or equal to -1</li>
<li>SecurityAction: Filter by final action after the request matches a security rule.<br>?? Supported operator: equal<br>?? Options:<br>?? -: unknown/not matched<br>?? Monitor: observation<br>?? JSChallenge: JavaScript challenge<br>?? Deny: blocking<br>?? Allow: allowing<br>?? BlockIP: IP blocking<br>?? Redirect: redirection<br>?? ReturnCustomPage: returning to a custom page<br>?? ManagedChallenge: managed challenge<br>?? Silence: silence<br>?? LongDelay: response after a long delay<br>?? ShortDelay: response after a short delay</li>
<li>SecurityModule: Filter by name of the security module finally handling the request.<br>??Supported operator: equal<br>??Options:<br>?? -: unknown/not matched<br>?? CustomRule: Custom Rules in Web Protection<br>?? RateLimitingCustomRule: Rate Limiting Rules in Web Protection<br>?? ManagedRule: Managed Rules in Web Protection<br>?? L7DDoS: CC Attack Defense in Web Protection<br>?? BotManagement: Bot Basic Management in Bot Management<br>?? BotClientReputation: Client Reputation Analysis in Bot Management<br>?? BotBehaviorAnalysis: Bot Intelligent Analysis in Bot Management<br>?? BotCustomRule: Custom Bot Rules in Bot Management<br>?? BotActiveDetection: Active Detection in Bot Management</li>
     */
    public void setConditions(QueryCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    public DeliveryCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliveryCondition(DeliveryCondition source) {
        if (source.Conditions != null) {
            this.Conditions = new QueryCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new QueryCondition(source.Conditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);

    }
}

