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

public class AnycastOutPackRelation extends AbstractModel{

    /**
    * 
    */
    @SerializedName("NormalBandwidth")
    @Expose
    private Long NormalBandwidth;

    /**
    * 
    */
    @SerializedName("ForwardRulesLimit")
    @Expose
    private Long ForwardRulesLimit;

    /**
    * 
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 
    */
    @SerializedName("CurDeadline")
    @Expose
    private String CurDeadline;

    /**
     * Get  
     * @return NormalBandwidth 
     */
    public Long getNormalBandwidth() {
        return this.NormalBandwidth;
    }

    /**
     * Set 
     * @param NormalBandwidth 
     */
    public void setNormalBandwidth(Long NormalBandwidth) {
        this.NormalBandwidth = NormalBandwidth;
    }

    /**
     * Get  
     * @return ForwardRulesLimit 
     */
    public Long getForwardRulesLimit() {
        return this.ForwardRulesLimit;
    }

    /**
     * Set 
     * @param ForwardRulesLimit 
     */
    public void setForwardRulesLimit(Long ForwardRulesLimit) {
        this.ForwardRulesLimit = ForwardRulesLimit;
    }

    /**
     * Get  
     * @return AutoRenewFlag 
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 
     * @param AutoRenewFlag 
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get  
     * @return CurDeadline 
     */
    public String getCurDeadline() {
        return this.CurDeadline;
    }

    /**
     * Set 
     * @param CurDeadline 
     */
    public void setCurDeadline(String CurDeadline) {
        this.CurDeadline = CurDeadline;
    }

    public AnycastOutPackRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnycastOutPackRelation(AnycastOutPackRelation source) {
        if (source.NormalBandwidth != null) {
            this.NormalBandwidth = new Long(source.NormalBandwidth);
        }
        if (source.ForwardRulesLimit != null) {
            this.ForwardRulesLimit = new Long(source.ForwardRulesLimit);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.CurDeadline != null) {
            this.CurDeadline = new String(source.CurDeadline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NormalBandwidth", this.NormalBandwidth);
        this.setParamSimple(map, prefix + "ForwardRulesLimit", this.ForwardRulesLimit);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "CurDeadline", this.CurDeadline);

    }
}

