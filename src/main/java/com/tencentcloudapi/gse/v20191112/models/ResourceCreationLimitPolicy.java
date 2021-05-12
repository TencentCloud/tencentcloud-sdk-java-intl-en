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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceCreationLimitPolicy extends AbstractModel{

    /**
    * Creation quantity. Minimum value: 1. Default value: 2.
    */
    @SerializedName("NewGameServerSessionsPerCreator")
    @Expose
    private Long NewGameServerSessionsPerCreator;

    /**
    * Unit time. Minimum value: 1. Default value: 3. Unit: minute.
    */
    @SerializedName("PolicyPeriodInMinutes")
    @Expose
    private Long PolicyPeriodInMinutes;

    /**
     * Get Creation quantity. Minimum value: 1. Default value: 2. 
     * @return NewGameServerSessionsPerCreator Creation quantity. Minimum value: 1. Default value: 2.
     */
    public Long getNewGameServerSessionsPerCreator() {
        return this.NewGameServerSessionsPerCreator;
    }

    /**
     * Set Creation quantity. Minimum value: 1. Default value: 2.
     * @param NewGameServerSessionsPerCreator Creation quantity. Minimum value: 1. Default value: 2.
     */
    public void setNewGameServerSessionsPerCreator(Long NewGameServerSessionsPerCreator) {
        this.NewGameServerSessionsPerCreator = NewGameServerSessionsPerCreator;
    }

    /**
     * Get Unit time. Minimum value: 1. Default value: 3. Unit: minute. 
     * @return PolicyPeriodInMinutes Unit time. Minimum value: 1. Default value: 3. Unit: minute.
     */
    public Long getPolicyPeriodInMinutes() {
        return this.PolicyPeriodInMinutes;
    }

    /**
     * Set Unit time. Minimum value: 1. Default value: 3. Unit: minute.
     * @param PolicyPeriodInMinutes Unit time. Minimum value: 1. Default value: 3. Unit: minute.
     */
    public void setPolicyPeriodInMinutes(Long PolicyPeriodInMinutes) {
        this.PolicyPeriodInMinutes = PolicyPeriodInMinutes;
    }

    public ResourceCreationLimitPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceCreationLimitPolicy(ResourceCreationLimitPolicy source) {
        if (source.NewGameServerSessionsPerCreator != null) {
            this.NewGameServerSessionsPerCreator = new Long(source.NewGameServerSessionsPerCreator);
        }
        if (source.PolicyPeriodInMinutes != null) {
            this.PolicyPeriodInMinutes = new Long(source.PolicyPeriodInMinutes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NewGameServerSessionsPerCreator", this.NewGameServerSessionsPerCreator);
        this.setParamSimple(map, prefix + "PolicyPeriodInMinutes", this.PolicyPeriodInMinutes);

    }
}

