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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CLBSetting extends AbstractModel {

    /**
    * CLB type. Valid values: PUBLIC_IP (supports public network CLB) and INTERNAL_IP (supports private network CLB).
    */
    @SerializedName("CLBType")
    @Expose
    private String CLBType;

    /**
    * Settings for VPC and subnet information.
    */
    @SerializedName("VPCSettings")
    @Expose
    private VPCSettings VPCSettings;

    /**
     * Get CLB type. Valid values: PUBLIC_IP (supports public network CLB) and INTERNAL_IP (supports private network CLB). 
     * @return CLBType CLB type. Valid values: PUBLIC_IP (supports public network CLB) and INTERNAL_IP (supports private network CLB).
     */
    public String getCLBType() {
        return this.CLBType;
    }

    /**
     * Set CLB type. Valid values: PUBLIC_IP (supports public network CLB) and INTERNAL_IP (supports private network CLB).
     * @param CLBType CLB type. Valid values: PUBLIC_IP (supports public network CLB) and INTERNAL_IP (supports private network CLB).
     */
    public void setCLBType(String CLBType) {
        this.CLBType = CLBType;
    }

    /**
     * Get Settings for VPC and subnet information. 
     * @return VPCSettings Settings for VPC and subnet information.
     */
    public VPCSettings getVPCSettings() {
        return this.VPCSettings;
    }

    /**
     * Set Settings for VPC and subnet information.
     * @param VPCSettings Settings for VPC and subnet information.
     */
    public void setVPCSettings(VPCSettings VPCSettings) {
        this.VPCSettings = VPCSettings;
    }

    public CLBSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CLBSetting(CLBSetting source) {
        if (source.CLBType != null) {
            this.CLBType = new String(source.CLBType);
        }
        if (source.VPCSettings != null) {
            this.VPCSettings = new VPCSettings(source.VPCSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CLBType", this.CLBType);
        this.setParamObj(map, prefix + "VPCSettings.", this.VPCSettings);

    }
}

