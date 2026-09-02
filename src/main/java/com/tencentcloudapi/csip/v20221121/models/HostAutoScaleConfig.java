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

public class HostAutoScaleConfig extends AbstractModel {

    /**
    * Host auto-scaling switch
Enumeration values:
ON: enable
OFF: disabled.
Supplemental description: If not passed, no modification is made. Map the underlying auto-purchase switch auto_repurchase_switch.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Scale-out version
Enumeration values:
PRO: Professional Edition
ULTIMATE: Flagship edition
Supplementary description: No modification will be made if this parameter is not passed in.
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
     * Get Host auto-scaling switch
Enumeration values:
ON: enable
OFF: disabled.
Supplemental description: If not passed, no modification is made. Map the underlying auto-purchase switch auto_repurchase_switch. 
     * @return Switch Host auto-scaling switch
Enumeration values:
ON: enable
OFF: disabled.
Supplemental description: If not passed, no modification is made. Map the underlying auto-purchase switch auto_repurchase_switch.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Host auto-scaling switch
Enumeration values:
ON: enable
OFF: disabled.
Supplemental description: If not passed, no modification is made. Map the underlying auto-purchase switch auto_repurchase_switch.
     * @param Switch Host auto-scaling switch
Enumeration values:
ON: enable
OFF: disabled.
Supplemental description: If not passed, no modification is made. Map the underlying auto-purchase switch auto_repurchase_switch.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Scale-out version
Enumeration values:
PRO: Professional Edition
ULTIMATE: Flagship edition
Supplementary description: No modification will be made if this parameter is not passed in. 
     * @return ProtectType Scale-out version
Enumeration values:
PRO: Professional Edition
ULTIMATE: Flagship edition
Supplementary description: No modification will be made if this parameter is not passed in.
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set Scale-out version
Enumeration values:
PRO: Professional Edition
ULTIMATE: Flagship edition
Supplementary description: No modification will be made if this parameter is not passed in.
     * @param ProtectType Scale-out version
Enumeration values:
PRO: Professional Edition
ULTIMATE: Flagship edition
Supplementary description: No modification will be made if this parameter is not passed in.
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    public HostAutoScaleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostAutoScaleConfig(HostAutoScaleConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);

    }
}

