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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyHostModeRequest extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Domain ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * Protection status:
10: rule-based observation and AI disabling; 11: rule- and AI-based observation; 12: rule-based observation and AI-based interception
20: rule-based interception and AI disabling; 21: rule-based interception and AI-based observation; 22: rule- and AI-based interception
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 0: Change protection mode, 1: Modify AI
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Instance ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Instance type
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

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
     * Get Domain ID 
     * @return DomainId Domain ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Domain ID
     * @param DomainId Domain ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get Protection status:
10: rule-based observation and AI disabling; 11: rule- and AI-based observation; 12: rule-based observation and AI-based interception
20: rule-based interception and AI disabling; 21: rule-based interception and AI-based observation; 22: rule- and AI-based interception 
     * @return Mode Protection status:
10: rule-based observation and AI disabling; 11: rule- and AI-based observation; 12: rule-based observation and AI-based interception
20: rule-based interception and AI disabling; 21: rule-based interception and AI-based observation; 22: rule- and AI-based interception
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set Protection status:
10: rule-based observation and AI disabling; 11: rule- and AI-based observation; 12: rule-based observation and AI-based interception
20: rule-based interception and AI disabling; 21: rule-based interception and AI-based observation; 22: rule- and AI-based interception
     * @param Mode Protection status:
10: rule-based observation and AI disabling; 11: rule- and AI-based observation; 12: rule-based observation and AI-based interception
20: rule-based interception and AI disabling; 21: rule-based interception and AI-based observation; 22: rule- and AI-based interception
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 0: Change protection mode, 1: Modify AI 
     * @return Type 0: Change protection mode, 1: Modify AI
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0: Change protection mode, 1: Modify AI
     * @param Type 0: Change protection mode, 1: Modify AI
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Instance ID 
     * @return InstanceID Instance ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set Instance ID
     * @param InstanceID Instance ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Instance type 
     * @return Edition Instance type
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set Instance type
     * @param Edition Instance type
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    public ModifyHostModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHostModeRequest(ModifyHostModeRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Edition", this.Edition);

    }
}

