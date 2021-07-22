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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BGPIPInstanceUsages extends AbstractModel{

    /**
    * Number of used port rules
    */
    @SerializedName("PortRulesUsage")
    @Expose
    private Long PortRulesUsage;

    /**
    * Number of used domain name rules
    */
    @SerializedName("DomainRulesUsage")
    @Expose
    private Long DomainRulesUsage;

    /**
    * Number of attack times in the last 7 days
    */
    @SerializedName("Last7DayAttackCount")
    @Expose
    private Long Last7DayAttackCount;

    /**
     * Get Number of used port rules 
     * @return PortRulesUsage Number of used port rules
     */
    public Long getPortRulesUsage() {
        return this.PortRulesUsage;
    }

    /**
     * Set Number of used port rules
     * @param PortRulesUsage Number of used port rules
     */
    public void setPortRulesUsage(Long PortRulesUsage) {
        this.PortRulesUsage = PortRulesUsage;
    }

    /**
     * Get Number of used domain name rules 
     * @return DomainRulesUsage Number of used domain name rules
     */
    public Long getDomainRulesUsage() {
        return this.DomainRulesUsage;
    }

    /**
     * Set Number of used domain name rules
     * @param DomainRulesUsage Number of used domain name rules
     */
    public void setDomainRulesUsage(Long DomainRulesUsage) {
        this.DomainRulesUsage = DomainRulesUsage;
    }

    /**
     * Get Number of attack times in the last 7 days 
     * @return Last7DayAttackCount Number of attack times in the last 7 days
     */
    public Long getLast7DayAttackCount() {
        return this.Last7DayAttackCount;
    }

    /**
     * Set Number of attack times in the last 7 days
     * @param Last7DayAttackCount Number of attack times in the last 7 days
     */
    public void setLast7DayAttackCount(Long Last7DayAttackCount) {
        this.Last7DayAttackCount = Last7DayAttackCount;
    }

    public BGPIPInstanceUsages() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BGPIPInstanceUsages(BGPIPInstanceUsages source) {
        if (source.PortRulesUsage != null) {
            this.PortRulesUsage = new Long(source.PortRulesUsage);
        }
        if (source.DomainRulesUsage != null) {
            this.DomainRulesUsage = new Long(source.DomainRulesUsage);
        }
        if (source.Last7DayAttackCount != null) {
            this.Last7DayAttackCount = new Long(source.Last7DayAttackCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PortRulesUsage", this.PortRulesUsage);
        this.setParamSimple(map, prefix + "DomainRulesUsage", this.DomainRulesUsage);
        this.setParamSimple(map, prefix + "Last7DayAttackCount", this.Last7DayAttackCount);

    }
}

