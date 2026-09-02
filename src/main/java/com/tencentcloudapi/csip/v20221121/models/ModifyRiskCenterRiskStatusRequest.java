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

public class ModifyRiskCenterRiskStatusRequest extends AbstractModel {

    /**
    * Risky Asset Related Data
    */
    @SerializedName("RiskStatusKeys")
    @Expose
    private RiskCenterStatusKey [] RiskStatusKeys;

    /**
    * Disposition status. 1: Handled; 2: Ignored; 3: Cancel disposed; 4: Cancel ignored.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Risk Type. 0: Port Risk; 1: Vulnerability Risk; 2: Weak Password Risk; 3: Web Sites Content Risk; 4: Configuration Risk; 5: Exposed Risk Service
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get Risky Asset Related Data 
     * @return RiskStatusKeys Risky Asset Related Data
     */
    public RiskCenterStatusKey [] getRiskStatusKeys() {
        return this.RiskStatusKeys;
    }

    /**
     * Set Risky Asset Related Data
     * @param RiskStatusKeys Risky Asset Related Data
     */
    public void setRiskStatusKeys(RiskCenterStatusKey [] RiskStatusKeys) {
        this.RiskStatusKeys = RiskStatusKeys;
    }

    /**
     * Get Disposition status. 1: Handled; 2: Ignored; 3: Cancel disposed; 4: Cancel ignored. 
     * @return Status Disposition status. 1: Handled; 2: Ignored; 3: Cancel disposed; 4: Cancel ignored.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Disposition status. 1: Handled; 2: Ignored; 3: Cancel disposed; 4: Cancel ignored.
     * @param Status Disposition status. 1: Handled; 2: Ignored; 3: Cancel disposed; 4: Cancel ignored.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Risk Type. 0: Port Risk; 1: Vulnerability Risk; 2: Weak Password Risk; 3: Web Sites Content Risk; 4: Configuration Risk; 5: Exposed Risk Service 
     * @return Type Risk Type. 0: Port Risk; 1: Vulnerability Risk; 2: Weak Password Risk; 3: Web Sites Content Risk; 4: Configuration Risk; 5: Exposed Risk Service
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Risk Type. 0: Port Risk; 1: Vulnerability Risk; 2: Weak Password Risk; 3: Web Sites Content Risk; 4: Configuration Risk; 5: Exposed Risk Service
     * @param Type Risk Type. 0: Port Risk; 1: Vulnerability Risk; 2: Weak Password Risk; 3: Web Sites Content Risk; 4: Configuration Risk; 5: Exposed Risk Service
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public ModifyRiskCenterRiskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRiskCenterRiskStatusRequest(ModifyRiskCenterRiskStatusRequest source) {
        if (source.RiskStatusKeys != null) {
            this.RiskStatusKeys = new RiskCenterStatusKey[source.RiskStatusKeys.length];
            for (int i = 0; i < source.RiskStatusKeys.length; i++) {
                this.RiskStatusKeys[i] = new RiskCenterStatusKey(source.RiskStatusKeys[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RiskStatusKeys.", this.RiskStatusKeys);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

