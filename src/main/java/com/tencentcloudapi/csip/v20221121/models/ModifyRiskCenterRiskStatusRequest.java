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
    * Data of risk assets
    */
    @SerializedName("RiskStatusKeys")
    @Expose
    private RiskCenterStatusKey [] RiskStatusKeys;

    /**
    * Specify how you want to change the risk status. `1`: Change to Handled, `2`: Change to Ignored; `3`: Remove from Handled; `4`: Remove from Ignored
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Risk type. `0`: Port risk; `1`: Vulnerability; `2`: Weak password; `3`: Website content risk; `4`: Configuration risk; `5`: Risk services
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get Data of risk assets 
     * @return RiskStatusKeys Data of risk assets
     */
    public RiskCenterStatusKey [] getRiskStatusKeys() {
        return this.RiskStatusKeys;
    }

    /**
     * Set Data of risk assets
     * @param RiskStatusKeys Data of risk assets
     */
    public void setRiskStatusKeys(RiskCenterStatusKey [] RiskStatusKeys) {
        this.RiskStatusKeys = RiskStatusKeys;
    }

    /**
     * Get Specify how you want to change the risk status. `1`: Change to Handled, `2`: Change to Ignored; `3`: Remove from Handled; `4`: Remove from Ignored 
     * @return Status Specify how you want to change the risk status. `1`: Change to Handled, `2`: Change to Ignored; `3`: Remove from Handled; `4`: Remove from Ignored
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Specify how you want to change the risk status. `1`: Change to Handled, `2`: Change to Ignored; `3`: Remove from Handled; `4`: Remove from Ignored
     * @param Status Specify how you want to change the risk status. `1`: Change to Handled, `2`: Change to Ignored; `3`: Remove from Handled; `4`: Remove from Ignored
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Risk type. `0`: Port risk; `1`: Vulnerability; `2`: Weak password; `3`: Website content risk; `4`: Configuration risk; `5`: Risk services 
     * @return Type Risk type. `0`: Port risk; `1`: Vulnerability; `2`: Weak password; `3`: Website content risk; `4`: Configuration risk; `5`: Risk services
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Risk type. `0`: Port risk; `1`: Vulnerability; `2`: Weak password; `3`: Website content risk; `4`: Configuration risk; `5`: Risk services
     * @param Type Risk type. `0`: Port risk; `1`: Vulnerability; `2`: Weak password; `3`: Website content risk; `4`: Configuration risk; `5`: Risk services
     */
    public void setType(Long Type) {
        this.Type = Type;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RiskStatusKeys.", this.RiskStatusKeys);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

