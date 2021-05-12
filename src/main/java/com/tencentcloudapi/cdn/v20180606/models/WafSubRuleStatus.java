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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WafSubRuleStatus extends AbstractModel{

    /**
    * Sub-rule status. Valid values: `on` and `off`.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * List of rule IDs
    */
    @SerializedName("SubIds")
    @Expose
    private Long [] SubIds;

    /**
     * Get Sub-rule status. Valid values: `on` and `off`. 
     * @return Switch Sub-rule status. Valid values: `on` and `off`.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Sub-rule status. Valid values: `on` and `off`.
     * @param Switch Sub-rule status. Valid values: `on` and `off`.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get List of rule IDs 
     * @return SubIds List of rule IDs
     */
    public Long [] getSubIds() {
        return this.SubIds;
    }

    /**
     * Set List of rule IDs
     * @param SubIds List of rule IDs
     */
    public void setSubIds(Long [] SubIds) {
        this.SubIds = SubIds;
    }

    public WafSubRuleStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafSubRuleStatus(WafSubRuleStatus source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.SubIds != null) {
            this.SubIds = new Long[source.SubIds.length];
            for (int i = 0; i < source.SubIds.length; i++) {
                this.SubIds[i] = new Long(source.SubIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "SubIds.", this.SubIds);

    }
}

