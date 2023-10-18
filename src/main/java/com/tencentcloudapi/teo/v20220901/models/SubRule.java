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

public class SubRule extends AbstractModel {

    /**
    * The condition that determines if a feature should run.
Note: If any condition in the array is met, the feature will run.
    */
    @SerializedName("Conditions")
    @Expose
    private RuleAndConditions [] Conditions;

    /**
    * The feature to be executed.
    */
    @SerializedName("Actions")
    @Expose
    private Action [] Actions;

    /**
     * Get The condition that determines if a feature should run.
Note: If any condition in the array is met, the feature will run. 
     * @return Conditions The condition that determines if a feature should run.
Note: If any condition in the array is met, the feature will run.
     */
    public RuleAndConditions [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set The condition that determines if a feature should run.
Note: If any condition in the array is met, the feature will run.
     * @param Conditions The condition that determines if a feature should run.
Note: If any condition in the array is met, the feature will run.
     */
    public void setConditions(RuleAndConditions [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get The feature to be executed. 
     * @return Actions The feature to be executed.
     */
    public Action [] getActions() {
        return this.Actions;
    }

    /**
     * Set The feature to be executed.
     * @param Actions The feature to be executed.
     */
    public void setActions(Action [] Actions) {
        this.Actions = Actions;
    }

    public SubRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubRule(SubRule source) {
        if (source.Conditions != null) {
            this.Conditions = new RuleAndConditions[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new RuleAndConditions(source.Conditions[i]);
            }
        }
        if (source.Actions != null) {
            this.Actions = new Action[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new Action(source.Actions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamArrayObj(map, prefix + "Actions.", this.Actions);

    }
}

