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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDosAttackSourceEvent extends AbstractModel{

    /**
    * Attack source IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackSourceIp")
    @Expose
    private String AttackSourceIp;

    /**
    * Country/Region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackRegion")
    @Expose
    private String AttackRegion;

    /**
    * Accumulative attack traffic
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackFlow")
    @Expose
    private Long AttackFlow;

    /**
    * Accumulative number of attack packets
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AttackPacketNum")
    @Expose
    private Long AttackPacketNum;

    /**
     * Get Attack source IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackSourceIp Attack source IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAttackSourceIp() {
        return this.AttackSourceIp;
    }

    /**
     * Set Attack source IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackSourceIp Attack source IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackSourceIp(String AttackSourceIp) {
        this.AttackSourceIp = AttackSourceIp;
    }

    /**
     * Get Country/Region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackRegion Country/Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAttackRegion() {
        return this.AttackRegion;
    }

    /**
     * Set Country/Region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackRegion Country/Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackRegion(String AttackRegion) {
        this.AttackRegion = AttackRegion;
    }

    /**
     * Get Accumulative attack traffic
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackFlow Accumulative attack traffic
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackFlow() {
        return this.AttackFlow;
    }

    /**
     * Set Accumulative attack traffic
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackFlow Accumulative attack traffic
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackFlow(Long AttackFlow) {
        this.AttackFlow = AttackFlow;
    }

    /**
     * Get Accumulative number of attack packets
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AttackPacketNum Accumulative number of attack packets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAttackPacketNum() {
        return this.AttackPacketNum;
    }

    /**
     * Set Accumulative number of attack packets
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AttackPacketNum Accumulative number of attack packets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAttackPacketNum(Long AttackPacketNum) {
        this.AttackPacketNum = AttackPacketNum;
    }

    public DDosAttackSourceEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDosAttackSourceEvent(DDosAttackSourceEvent source) {
        if (source.AttackSourceIp != null) {
            this.AttackSourceIp = new String(source.AttackSourceIp);
        }
        if (source.AttackRegion != null) {
            this.AttackRegion = new String(source.AttackRegion);
        }
        if (source.AttackFlow != null) {
            this.AttackFlow = new Long(source.AttackFlow);
        }
        if (source.AttackPacketNum != null) {
            this.AttackPacketNum = new Long(source.AttackPacketNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackSourceIp", this.AttackSourceIp);
        this.setParamSimple(map, prefix + "AttackRegion", this.AttackRegion);
        this.setParamSimple(map, prefix + "AttackFlow", this.AttackFlow);
        this.setParamSimple(map, prefix + "AttackPacketNum", this.AttackPacketNum);

    }
}

