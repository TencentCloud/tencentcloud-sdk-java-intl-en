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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListenerCcThreholdConfig extends AbstractModel{

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Protocol. Value: `https`.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Status. Valid values: `0` (disabled), `1` (enabled).
    */
    @SerializedName("CCEnable")
    @Expose
    private Long CCEnable;

    /**
    * CC protection threshold
    */
    @SerializedName("CCThreshold")
    @Expose
    private Long CCThreshold;

    /**
     * Get Domain name 
     * @return Domain Domain name
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name
     * @param Domain Domain name
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Protocol. Value: `https`. 
     * @return Protocol Protocol. Value: `https`.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol. Value: `https`.
     * @param Protocol Protocol. Value: `https`.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Status. Valid values: `0` (disabled), `1` (enabled). 
     * @return CCEnable Status. Valid values: `0` (disabled), `1` (enabled).
     */
    public Long getCCEnable() {
        return this.CCEnable;
    }

    /**
     * Set Status. Valid values: `0` (disabled), `1` (enabled).
     * @param CCEnable Status. Valid values: `0` (disabled), `1` (enabled).
     */
    public void setCCEnable(Long CCEnable) {
        this.CCEnable = CCEnable;
    }

    /**
     * Get CC protection threshold 
     * @return CCThreshold CC protection threshold
     */
    public Long getCCThreshold() {
        return this.CCThreshold;
    }

    /**
     * Set CC protection threshold
     * @param CCThreshold CC protection threshold
     */
    public void setCCThreshold(Long CCThreshold) {
        this.CCThreshold = CCThreshold;
    }

    public ListenerCcThreholdConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListenerCcThreholdConfig(ListenerCcThreholdConfig source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.CCEnable != null) {
            this.CCEnable = new Long(source.CCEnable);
        }
        if (source.CCThreshold != null) {
            this.CCThreshold = new Long(source.CCThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "CCEnable", this.CCEnable);
        this.setParamSimple(map, prefix + "CCThreshold", this.CCThreshold);

    }
}

