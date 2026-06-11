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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulEmergentMsgInfo extends AbstractModel {

    /**
    * Vulnerability ID
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * Vulnerability disclosure time
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * Vulnerability name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Vulnerability name, English description
    */
    @SerializedName("NameEn")
    @Expose
    private String NameEn;

    /**
    * Is auto-repair supported 0: not supported >0: supported
    */
    @SerializedName("SupportFix")
    @Expose
    private Long SupportFix;

    /**
    * Whether automatic defense is supported 0: no support 1: support
    */
    @SerializedName("SupportDefense")
    @Expose
    private Long SupportDefense;

    /**
    * KB ID
    */
    @SerializedName("KbId")
    @Expose
    private Long KbId;

    /**
    * KB number
    */
    @SerializedName("KbNumber")
    @Expose
    private String KbNumber;

    /**
     * Get Vulnerability ID 
     * @return VulId Vulnerability ID
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set Vulnerability ID
     * @param VulId Vulnerability ID
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get Vulnerability disclosure time 
     * @return PublishTime Vulnerability disclosure time
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set Vulnerability disclosure time
     * @param PublishTime Vulnerability disclosure time
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get Vulnerability name 
     * @return Name Vulnerability name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Vulnerability name
     * @param Name Vulnerability name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Vulnerability name, English description 
     * @return NameEn Vulnerability name, English description
     */
    public String getNameEn() {
        return this.NameEn;
    }

    /**
     * Set Vulnerability name, English description
     * @param NameEn Vulnerability name, English description
     */
    public void setNameEn(String NameEn) {
        this.NameEn = NameEn;
    }

    /**
     * Get Is auto-repair supported 0: not supported >0: supported 
     * @return SupportFix Is auto-repair supported 0: not supported >0: supported
     */
    public Long getSupportFix() {
        return this.SupportFix;
    }

    /**
     * Set Is auto-repair supported 0: not supported >0: supported
     * @param SupportFix Is auto-repair supported 0: not supported >0: supported
     */
    public void setSupportFix(Long SupportFix) {
        this.SupportFix = SupportFix;
    }

    /**
     * Get Whether automatic defense is supported 0: no support 1: support 
     * @return SupportDefense Whether automatic defense is supported 0: no support 1: support
     */
    public Long getSupportDefense() {
        return this.SupportDefense;
    }

    /**
     * Set Whether automatic defense is supported 0: no support 1: support
     * @param SupportDefense Whether automatic defense is supported 0: no support 1: support
     */
    public void setSupportDefense(Long SupportDefense) {
        this.SupportDefense = SupportDefense;
    }

    /**
     * Get KB ID 
     * @return KbId KB ID
     */
    public Long getKbId() {
        return this.KbId;
    }

    /**
     * Set KB ID
     * @param KbId KB ID
     */
    public void setKbId(Long KbId) {
        this.KbId = KbId;
    }

    /**
     * Get KB number 
     * @return KbNumber KB number
     */
    public String getKbNumber() {
        return this.KbNumber;
    }

    /**
     * Set KB number
     * @param KbNumber KB number
     */
    public void setKbNumber(String KbNumber) {
        this.KbNumber = KbNumber;
    }

    public VulEmergentMsgInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulEmergentMsgInfo(VulEmergentMsgInfo source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NameEn != null) {
            this.NameEn = new String(source.NameEn);
        }
        if (source.SupportFix != null) {
            this.SupportFix = new Long(source.SupportFix);
        }
        if (source.SupportDefense != null) {
            this.SupportDefense = new Long(source.SupportDefense);
        }
        if (source.KbId != null) {
            this.KbId = new Long(source.KbId);
        }
        if (source.KbNumber != null) {
            this.KbNumber = new String(source.KbNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NameEn", this.NameEn);
        this.setParamSimple(map, prefix + "SupportFix", this.SupportFix);
        this.setParamSimple(map, prefix + "SupportDefense", this.SupportDefense);
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "KbNumber", this.KbNumber);

    }
}

