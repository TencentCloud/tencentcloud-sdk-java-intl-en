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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DNSAttributes extends AbstractModel{

    /**
    * Record types: CNAME, A, TXT, and MX.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Domain name.
    */
    @SerializedName("SendDomain")
    @Expose
    private String SendDomain;

    /**
    * Expected value.
    */
    @SerializedName("ExpectedValue")
    @Expose
    private String ExpectedValue;

    /**
    * Currently configured value.
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * Approved or not. The default value is `false`.
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
     * Get Record types: CNAME, A, TXT, and MX. 
     * @return Type Record types: CNAME, A, TXT, and MX.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Record types: CNAME, A, TXT, and MX.
     * @param Type Record types: CNAME, A, TXT, and MX.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Domain name. 
     * @return SendDomain Domain name.
     */
    public String getSendDomain() {
        return this.SendDomain;
    }

    /**
     * Set Domain name.
     * @param SendDomain Domain name.
     */
    public void setSendDomain(String SendDomain) {
        this.SendDomain = SendDomain;
    }

    /**
     * Get Expected value. 
     * @return ExpectedValue Expected value.
     */
    public String getExpectedValue() {
        return this.ExpectedValue;
    }

    /**
     * Set Expected value.
     * @param ExpectedValue Expected value.
     */
    public void setExpectedValue(String ExpectedValue) {
        this.ExpectedValue = ExpectedValue;
    }

    /**
     * Get Currently configured value. 
     * @return CurrentValue Currently configured value.
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set Currently configured value.
     * @param CurrentValue Currently configured value.
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get Approved or not. The default value is `false`. 
     * @return Status Approved or not. The default value is `false`.
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set Approved or not. The default value is `false`.
     * @param Status Approved or not. The default value is `false`.
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    public DNSAttributes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DNSAttributes(DNSAttributes source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SendDomain != null) {
            this.SendDomain = new String(source.SendDomain);
        }
        if (source.ExpectedValue != null) {
            this.ExpectedValue = new String(source.ExpectedValue);
        }
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SendDomain", this.SendDomain);
        this.setParamSimple(map, prefix + "ExpectedValue", this.ExpectedValue);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

