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
    * Log filter conditions. Detailed filter conditions are as follows:
<li>EdgeResponseStatusCode: Filter by status code returned to the client by the EdgeOne node.<br>      Supported operators: equal, great, less, great_equal, less_equal<br>      Value range: Any integer greater than or equal to 0</li>
<li>OriginResponseStatusCode: Filter by response status code of the origin server.<br>      Supported operators: equal, great, less, great_equal, less_equal<br>      Value range: Any integer greater than or equal to -1</li>
<li>SecurityAction: Filter by final action after the request hits the security rule.<br>      Supported operators: equal<br>      Options are as follows:<br>      -: Unknown/unhit<br>      Monitor: Log only<br>      JSChallenge: JavaScript challenge<br>      Deny: Interception<br>      Allow: Allow<br>      BlockIP: IP ban<br>      Redirect: Redirect<br>      ReturnCustomPage: Return to custom page<br>      ManagedChallenge: Managed challenge<br>      Silence: Silence<br>      LongDelay: Response after a long wait<br>      ShortDelay: Response after a short wait</li>
<li>SecurityModule: Filter according to the name of the security module that ultimately handles the request. <br>      Supported operators: equal<br>      Options are as follows:<br>      -: Unknown/miss<br>      CustomRule: Web protection - custom rules<br>      RateLimitingCustomRule: Web protection - rate limiting rule<br>      ManagedRule: Web Protection - Managed Rules<br>      L7DDoS: Web Protection - CC Attack Protection<br>      BotManagement: Bot Management - Bot Basic Management<br>      BotClientReputation: Bot Management - Client Reputation Analysis<br>      BotBehaviorAnalysis: Bot Management - Bot Intelligence Analysis<br>      BotCustomRule: Bot Management - Custom Bot Rules<br>      BotActiveDetection: Bot Management - Active Detection</li>
    */
    @SerializedName("Conditions")
    @Expose
    private QueryCondition [] Conditions;

    /**
     * Get Log filter conditions. Detailed filter conditions are as follows:
<li>EdgeResponseStatusCode: Filter by status code returned to the client by the EdgeOne node.<br>      Supported operators: equal, great, less, great_equal, less_equal<br>      Value range: Any integer greater than or equal to 0</li>
<li>OriginResponseStatusCode: Filter by response status code of the origin server.<br>      Supported operators: equal, great, less, great_equal, less_equal<br>      Value range: Any integer greater than or equal to -1</li>
<li>SecurityAction: Filter by final action after the request hits the security rule.<br>      Supported operators: equal<br>      Options are as follows:<br>      -: Unknown/unhit<br>      Monitor: Log only<br>      JSChallenge: JavaScript challenge<br>      Deny: Interception<br>      Allow: Allow<br>      BlockIP: IP ban<br>      Redirect: Redirect<br>      ReturnCustomPage: Return to custom page<br>      ManagedChallenge: Managed challenge<br>      Silence: Silence<br>      LongDelay: Response after a long wait<br>      ShortDelay: Response after a short wait</li>
<li>SecurityModule: Filter according to the name of the security module that ultimately handles the request. <br>      Supported operators: equal<br>      Options are as follows:<br>      -: Unknown/miss<br>      CustomRule: Web protection - custom rules<br>      RateLimitingCustomRule: Web protection - rate limiting rule<br>      ManagedRule: Web Protection - Managed Rules<br>      L7DDoS: Web Protection - CC Attack Protection<br>      BotManagement: Bot Management - Bot Basic Management<br>      BotClientReputation: Bot Management - Client Reputation Analysis<br>      BotBehaviorAnalysis: Bot Management - Bot Intelligence Analysis<br>      BotCustomRule: Bot Management - Custom Bot Rules<br>      BotActiveDetection: Bot Management - Active Detection</li> 
     * @return Conditions Log filter conditions. Detailed filter conditions are as follows:
<li>EdgeResponseStatusCode: Filter by status code returned to the client by the EdgeOne node.<br>      Supported operators: equal, great, less, great_equal, less_equal<br>      Value range: Any integer greater than or equal to 0</li>
<li>OriginResponseStatusCode: Filter by response status code of the origin server.<br>      Supported operators: equal, great, less, great_equal, less_equal<br>      Value range: Any integer greater than or equal to -1</li>
<li>SecurityAction: Filter by final action after the request hits the security rule.<br>      Supported operators: equal<br>      Options are as follows:<br>      -: Unknown/unhit<br>      Monitor: Log only<br>      JSChallenge: JavaScript challenge<br>      Deny: Interception<br>      Allow: Allow<br>      BlockIP: IP ban<br>      Redirect: Redirect<br>      ReturnCustomPage: Return to custom page<br>      ManagedChallenge: Managed challenge<br>      Silence: Silence<br>      LongDelay: Response after a long wait<br>      ShortDelay: Response after a short wait</li>
<li>SecurityModule: Filter according to the name of the security module that ultimately handles the request. <br>      Supported operators: equal<br>      Options are as follows:<br>      -: Unknown/miss<br>      CustomRule: Web protection - custom rules<br>      RateLimitingCustomRule: Web protection - rate limiting rule<br>      ManagedRule: Web Protection - Managed Rules<br>      L7DDoS: Web Protection - CC Attack Protection<br>      BotManagement: Bot Management - Bot Basic Management<br>      BotClientReputation: Bot Management - Client Reputation Analysis<br>      BotBehaviorAnalysis: Bot Management - Bot Intelligence Analysis<br>      BotCustomRule: Bot Management - Custom Bot Rules<br>      BotActiveDetection: Bot Management - Active Detection</li>
     */
    public QueryCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set Log filter conditions. Detailed filter conditions are as follows:
<li>EdgeResponseStatusCode: Filter by status code returned to the client by the EdgeOne node.<br>      Supported operators: equal, great, less, great_equal, less_equal<br>      Value range: Any integer greater than or equal to 0</li>
<li>OriginResponseStatusCode: Filter by response status code of the origin server.<br>      Supported operators: equal, great, less, great_equal, less_equal<br>      Value range: Any integer greater than or equal to -1</li>
<li>SecurityAction: Filter by final action after the request hits the security rule.<br>      Supported operators: equal<br>      Options are as follows:<br>      -: Unknown/unhit<br>      Monitor: Log only<br>      JSChallenge: JavaScript challenge<br>      Deny: Interception<br>      Allow: Allow<br>      BlockIP: IP ban<br>      Redirect: Redirect<br>      ReturnCustomPage: Return to custom page<br>      ManagedChallenge: Managed challenge<br>      Silence: Silence<br>      LongDelay: Response after a long wait<br>      ShortDelay: Response after a short wait</li>
<li>SecurityModule: Filter according to the name of the security module that ultimately handles the request. <br>      Supported operators: equal<br>      Options are as follows:<br>      -: Unknown/miss<br>      CustomRule: Web protection - custom rules<br>      RateLimitingCustomRule: Web protection - rate limiting rule<br>      ManagedRule: Web Protection - Managed Rules<br>      L7DDoS: Web Protection - CC Attack Protection<br>      BotManagement: Bot Management - Bot Basic Management<br>      BotClientReputation: Bot Management - Client Reputation Analysis<br>      BotBehaviorAnalysis: Bot Management - Bot Intelligence Analysis<br>      BotCustomRule: Bot Management - Custom Bot Rules<br>      BotActiveDetection: Bot Management - Active Detection</li>
     * @param Conditions Log filter conditions. Detailed filter conditions are as follows:
<li>EdgeResponseStatusCode: Filter by status code returned to the client by the EdgeOne node.<br>      Supported operators: equal, great, less, great_equal, less_equal<br>      Value range: Any integer greater than or equal to 0</li>
<li>OriginResponseStatusCode: Filter by response status code of the origin server.<br>      Supported operators: equal, great, less, great_equal, less_equal<br>      Value range: Any integer greater than or equal to -1</li>
<li>SecurityAction: Filter by final action after the request hits the security rule.<br>      Supported operators: equal<br>      Options are as follows:<br>      -: Unknown/unhit<br>      Monitor: Log only<br>      JSChallenge: JavaScript challenge<br>      Deny: Interception<br>      Allow: Allow<br>      BlockIP: IP ban<br>      Redirect: Redirect<br>      ReturnCustomPage: Return to custom page<br>      ManagedChallenge: Managed challenge<br>      Silence: Silence<br>      LongDelay: Response after a long wait<br>      ShortDelay: Response after a short wait</li>
<li>SecurityModule: Filter according to the name of the security module that ultimately handles the request. <br>      Supported operators: equal<br>      Options are as follows:<br>      -: Unknown/miss<br>      CustomRule: Web protection - custom rules<br>      RateLimitingCustomRule: Web protection - rate limiting rule<br>      ManagedRule: Web Protection - Managed Rules<br>      L7DDoS: Web Protection - CC Attack Protection<br>      BotManagement: Bot Management - Bot Basic Management<br>      BotClientReputation: Bot Management - Client Reputation Analysis<br>      BotBehaviorAnalysis: Bot Management - Bot Intelligence Analysis<br>      BotCustomRule: Bot Management - Custom Bot Rules<br>      BotActiveDetection: Bot Management - Active Detection</li>
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

