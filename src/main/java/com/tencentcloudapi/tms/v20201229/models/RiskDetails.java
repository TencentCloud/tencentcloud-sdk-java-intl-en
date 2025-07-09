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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskDetails extends AbstractModel {

    /**
    * This field returns the risk categories after account information detection. Valid values: **RiskAccount** (the account is at risk), **RiskIP** (the IP address is at risk), and **RiskIMEI** (the mobile device identifier is at risk).
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * This field returns the risk levels after account information detection. Valid values: **1** (suspected to be at risk) and **2** (malicious risk).
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
     * Get This field returns the risk categories after account information detection. Valid values: **RiskAccount** (the account is at risk), **RiskIP** (the IP address is at risk), and **RiskIMEI** (the mobile device identifier is at risk). 
     * @return Label This field returns the risk categories after account information detection. Valid values: **RiskAccount** (the account is at risk), **RiskIP** (the IP address is at risk), and **RiskIMEI** (the mobile device identifier is at risk).
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set This field returns the risk categories after account information detection. Valid values: **RiskAccount** (the account is at risk), **RiskIP** (the IP address is at risk), and **RiskIMEI** (the mobile device identifier is at risk).
     * @param Label This field returns the risk categories after account information detection. Valid values: **RiskAccount** (the account is at risk), **RiskIP** (the IP address is at risk), and **RiskIMEI** (the mobile device identifier is at risk).
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get This field returns the risk levels after account information detection. Valid values: **1** (suspected to be at risk) and **2** (malicious risk). 
     * @return Level This field returns the risk levels after account information detection. Valid values: **1** (suspected to be at risk) and **2** (malicious risk).
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set This field returns the risk levels after account information detection. Valid values: **1** (suspected to be at risk) and **2** (malicious risk).
     * @param Level This field returns the risk levels after account information detection. Valid values: **1** (suspected to be at risk) and **2** (malicious risk).
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    public RiskDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskDetails(RiskDetails source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

