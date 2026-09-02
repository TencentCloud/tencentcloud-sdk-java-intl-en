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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperateRiskRequest extends AbstractModel {

    /**
    * <p>Risk rule ID</p>
    */
    @SerializedName("RiskRuleId")
    @Expose
    private String RiskRuleId;

    /**
    * <p>Risk ID set</p>
    */
    @SerializedName("RiskIdList")
    @Expose
    private Long [] RiskIdList;

    /**
    * <p>Operation type</p>
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Reason for ignoring the risk</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get <p>Risk rule ID</p> 
     * @return RiskRuleId <p>Risk rule ID</p>
     */
    public String getRiskRuleId() {
        return this.RiskRuleId;
    }

    /**
     * Set <p>Risk rule ID</p>
     * @param RiskRuleId <p>Risk rule ID</p>
     */
    public void setRiskRuleId(String RiskRuleId) {
        this.RiskRuleId = RiskRuleId;
    }

    /**
     * Get <p>Risk ID set</p> 
     * @return RiskIdList <p>Risk ID set</p>
     */
    public Long [] getRiskIdList() {
        return this.RiskIdList;
    }

    /**
     * Set <p>Risk ID set</p>
     * @param RiskIdList <p>Risk ID set</p>
     */
    public void setRiskIdList(Long [] RiskIdList) {
        this.RiskIdList = RiskIdList;
    }

    /**
     * Get <p>Operation type</p> 
     * @return OperationType <p>Operation type</p>
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set <p>Operation type</p>
     * @param OperationType <p>Operation type</p>
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Reason for ignoring the risk</p> 
     * @return Reason <p>Reason for ignoring the risk</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>Reason for ignoring the risk</p>
     * @param Reason <p>Reason for ignoring the risk</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public OperateRiskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateRiskRequest(OperateRiskRequest source) {
        if (source.RiskRuleId != null) {
            this.RiskRuleId = new String(source.RiskRuleId);
        }
        if (source.RiskIdList != null) {
            this.RiskIdList = new Long[source.RiskIdList.length];
            for (int i = 0; i < source.RiskIdList.length; i++) {
                this.RiskIdList[i] = new Long(source.RiskIdList[i]);
            }
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskRuleId", this.RiskRuleId);
        this.setParamArraySimple(map, prefix + "RiskIdList.", this.RiskIdList);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

