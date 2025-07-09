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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigAliasesInfo extends AbstractModel {

    /**
    * parameter name.
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * Alias-value configuration.
    */
    @SerializedName("AliasValueList")
    @Expose
    private AliasValueConf [] AliasValueList;

    /**
     * Get parameter name. 
     * @return ParamName parameter name.
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set parameter name.
     * @param ParamName parameter name.
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get Alias-value configuration. 
     * @return AliasValueList Alias-value configuration.
     */
    public AliasValueConf [] getAliasValueList() {
        return this.AliasValueList;
    }

    /**
     * Set Alias-value configuration.
     * @param AliasValueList Alias-value configuration.
     */
    public void setAliasValueList(AliasValueConf [] AliasValueList) {
        this.AliasValueList = AliasValueList;
    }

    public ConfigAliasesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigAliasesInfo(ConfigAliasesInfo source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.AliasValueList != null) {
            this.AliasValueList = new AliasValueConf[source.AliasValueList.length];
            for (int i = 0; i < source.AliasValueList.length; i++) {
                this.AliasValueList[i] = new AliasValueConf(source.AliasValueList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamArrayObj(map, prefix + "AliasValueList.", this.AliasValueList);

    }
}

