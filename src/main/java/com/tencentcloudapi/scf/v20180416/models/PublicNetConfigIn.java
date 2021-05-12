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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublicNetConfigIn extends AbstractModel{

    /**
    * Whether to enable public network access. Valid values: ['DISABLE', 'ENABLE']
    */
    @SerializedName("PublicNetStatus")
    @Expose
    private String PublicNetStatus;

    /**
    * EIP configuration
    */
    @SerializedName("EipConfig")
    @Expose
    private EipConfigIn EipConfig;

    /**
     * Get Whether to enable public network access. Valid values: ['DISABLE', 'ENABLE'] 
     * @return PublicNetStatus Whether to enable public network access. Valid values: ['DISABLE', 'ENABLE']
     */
    public String getPublicNetStatus() {
        return this.PublicNetStatus;
    }

    /**
     * Set Whether to enable public network access. Valid values: ['DISABLE', 'ENABLE']
     * @param PublicNetStatus Whether to enable public network access. Valid values: ['DISABLE', 'ENABLE']
     */
    public void setPublicNetStatus(String PublicNetStatus) {
        this.PublicNetStatus = PublicNetStatus;
    }

    /**
     * Get EIP configuration 
     * @return EipConfig EIP configuration
     */
    public EipConfigIn getEipConfig() {
        return this.EipConfig;
    }

    /**
     * Set EIP configuration
     * @param EipConfig EIP configuration
     */
    public void setEipConfig(EipConfigIn EipConfig) {
        this.EipConfig = EipConfig;
    }

    public PublicNetConfigIn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicNetConfigIn(PublicNetConfigIn source) {
        if (source.PublicNetStatus != null) {
            this.PublicNetStatus = new String(source.PublicNetStatus);
        }
        if (source.EipConfig != null) {
            this.EipConfig = new EipConfigIn(source.EipConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicNetStatus", this.PublicNetStatus);
        this.setParamObj(map, prefix + "EipConfig.", this.EipConfig);

    }
}

