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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainCLSTargetInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 
    */
    @SerializedName("ChineseMainlandCLSTargetInfo")
    @Expose
    private AreaCLSTargetInfo ChineseMainlandCLSTargetInfo;

    /**
    * 
    */
    @SerializedName("OutsideChineseMainlandCLSTargetInfo")
    @Expose
    private AreaCLSTargetInfo OutsideChineseMainlandCLSTargetInfo;

    /**
     * Get  
     * @return Domain 
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 
     * @param Domain 
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get  
     * @return ChineseMainlandCLSTargetInfo 
     */
    public AreaCLSTargetInfo getChineseMainlandCLSTargetInfo() {
        return this.ChineseMainlandCLSTargetInfo;
    }

    /**
     * Set 
     * @param ChineseMainlandCLSTargetInfo 
     */
    public void setChineseMainlandCLSTargetInfo(AreaCLSTargetInfo ChineseMainlandCLSTargetInfo) {
        this.ChineseMainlandCLSTargetInfo = ChineseMainlandCLSTargetInfo;
    }

    /**
     * Get  
     * @return OutsideChineseMainlandCLSTargetInfo 
     */
    public AreaCLSTargetInfo getOutsideChineseMainlandCLSTargetInfo() {
        return this.OutsideChineseMainlandCLSTargetInfo;
    }

    /**
     * Set 
     * @param OutsideChineseMainlandCLSTargetInfo 
     */
    public void setOutsideChineseMainlandCLSTargetInfo(AreaCLSTargetInfo OutsideChineseMainlandCLSTargetInfo) {
        this.OutsideChineseMainlandCLSTargetInfo = OutsideChineseMainlandCLSTargetInfo;
    }

    public DomainCLSTargetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainCLSTargetInfo(DomainCLSTargetInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ChineseMainlandCLSTargetInfo != null) {
            this.ChineseMainlandCLSTargetInfo = new AreaCLSTargetInfo(source.ChineseMainlandCLSTargetInfo);
        }
        if (source.OutsideChineseMainlandCLSTargetInfo != null) {
            this.OutsideChineseMainlandCLSTargetInfo = new AreaCLSTargetInfo(source.OutsideChineseMainlandCLSTargetInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "ChineseMainlandCLSTargetInfo.", this.ChineseMainlandCLSTargetInfo);
        this.setParamObj(map, prefix + "OutsideChineseMainlandCLSTargetInfo.", this.OutsideChineseMainlandCLSTargetInfo);

    }
}

