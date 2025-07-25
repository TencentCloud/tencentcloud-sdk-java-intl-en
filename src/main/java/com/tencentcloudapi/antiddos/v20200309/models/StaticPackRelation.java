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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaticPackRelation extends AbstractModel {

    /**
    * Base protection bandwidth
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ProtectBandwidth")
    @Expose
    private Long ProtectBandwidth;

    /**
    * Application bandwidth
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("NormalBandwidth")
    @Expose
    private Long NormalBandwidth;

    /**
    * Forwarding rules
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ForwardRulesLimit")
    @Expose
    private Long ForwardRulesLimit;

    /**
    * Auto-renewal flag
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Expiration time
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("CurDeadline")
    @Expose
    private String CurDeadline;

    /**
     * Get Base protection bandwidth
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ProtectBandwidth Base protection bandwidth
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getProtectBandwidth() {
        return this.ProtectBandwidth;
    }

    /**
     * Set Base protection bandwidth
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ProtectBandwidth Base protection bandwidth
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setProtectBandwidth(Long ProtectBandwidth) {
        this.ProtectBandwidth = ProtectBandwidth;
    }

    /**
     * Get Application bandwidth
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return NormalBandwidth Application bandwidth
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getNormalBandwidth() {
        return this.NormalBandwidth;
    }

    /**
     * Set Application bandwidth
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param NormalBandwidth Application bandwidth
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setNormalBandwidth(Long NormalBandwidth) {
        this.NormalBandwidth = NormalBandwidth;
    }

    /**
     * Get Forwarding rules
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ForwardRulesLimit Forwarding rules
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getForwardRulesLimit() {
        return this.ForwardRulesLimit;
    }

    /**
     * Set Forwarding rules
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ForwardRulesLimit Forwarding rules
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setForwardRulesLimit(Long ForwardRulesLimit) {
        this.ForwardRulesLimit = ForwardRulesLimit;
    }

    /**
     * Get Auto-renewal flag
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AutoRenewFlag Auto-renewal flag
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AutoRenewFlag Auto-renewal flag
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Expiration time
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return CurDeadline Expiration time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getCurDeadline() {
        return this.CurDeadline;
    }

    /**
     * Set Expiration time
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param CurDeadline Expiration time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setCurDeadline(String CurDeadline) {
        this.CurDeadline = CurDeadline;
    }

    public StaticPackRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaticPackRelation(StaticPackRelation source) {
        if (source.ProtectBandwidth != null) {
            this.ProtectBandwidth = new Long(source.ProtectBandwidth);
        }
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
        this.setParamSimple(map, prefix + "ProtectBandwidth", this.ProtectBandwidth);
        this.setParamSimple(map, prefix + "NormalBandwidth", this.NormalBandwidth);
        this.setParamSimple(map, prefix + "ForwardRulesLimit", this.ForwardRulesLimit);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "CurDeadline", this.CurDeadline);

    }
}

