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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomAction extends AbstractModel {

    /**
    * <p>ID of the custom configuration item.</p><p>You can obtain it through the returned value CustomActionSet[].ActionId of the DescribeAvailableCustomActionsForRuleEngine API.</p>
    */
    @SerializedName("ActionId")
    @Expose
    private String ActionId;

    /**
    * <p>Parameter values of each parameter field under this custom configuration.</p><p>You can obtain them through the API return value CustomActionSet[].Parameters of DescribeAvailableCustomActionsForRuleEngine.</p>
    */
    @SerializedName("Parameters")
    @Expose
    private CustomActionParameter [] Parameters;

    /**
     * Get <p>ID of the custom configuration item.</p><p>You can obtain it through the returned value CustomActionSet[].ActionId of the DescribeAvailableCustomActionsForRuleEngine API.</p> 
     * @return ActionId <p>ID of the custom configuration item.</p><p>You can obtain it through the returned value CustomActionSet[].ActionId of the DescribeAvailableCustomActionsForRuleEngine API.</p>
     */
    public String getActionId() {
        return this.ActionId;
    }

    /**
     * Set <p>ID of the custom configuration item.</p><p>You can obtain it through the returned value CustomActionSet[].ActionId of the DescribeAvailableCustomActionsForRuleEngine API.</p>
     * @param ActionId <p>ID of the custom configuration item.</p><p>You can obtain it through the returned value CustomActionSet[].ActionId of the DescribeAvailableCustomActionsForRuleEngine API.</p>
     */
    public void setActionId(String ActionId) {
        this.ActionId = ActionId;
    }

    /**
     * Get <p>Parameter values of each parameter field under this custom configuration.</p><p>You can obtain them through the API return value CustomActionSet[].Parameters of DescribeAvailableCustomActionsForRuleEngine.</p> 
     * @return Parameters <p>Parameter values of each parameter field under this custom configuration.</p><p>You can obtain them through the API return value CustomActionSet[].Parameters of DescribeAvailableCustomActionsForRuleEngine.</p>
     */
    public CustomActionParameter [] getParameters() {
        return this.Parameters;
    }

    /**
     * Set <p>Parameter values of each parameter field under this custom configuration.</p><p>You can obtain them through the API return value CustomActionSet[].Parameters of DescribeAvailableCustomActionsForRuleEngine.</p>
     * @param Parameters <p>Parameter values of each parameter field under this custom configuration.</p><p>You can obtain them through the API return value CustomActionSet[].Parameters of DescribeAvailableCustomActionsForRuleEngine.</p>
     */
    public void setParameters(CustomActionParameter [] Parameters) {
        this.Parameters = Parameters;
    }

    public CustomAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomAction(CustomAction source) {
        if (source.ActionId != null) {
            this.ActionId = new String(source.ActionId);
        }
        if (source.Parameters != null) {
            this.Parameters = new CustomActionParameter[source.Parameters.length];
            for (int i = 0; i < source.Parameters.length; i++) {
                this.Parameters[i] = new CustomActionParameter(source.Parameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamArrayObj(map, prefix + "Parameters.", this.Parameters);

    }
}

