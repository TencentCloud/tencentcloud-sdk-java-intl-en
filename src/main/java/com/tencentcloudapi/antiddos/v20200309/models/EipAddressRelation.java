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

public class EipAddressRelation extends AbstractModel{

    /**
    * Region of the Anti-DDoS instance bound to the EIP. For example, hk indicates Hong Kong.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EipAddressRegion")
    @Expose
    private String EipAddressRegion;

    /**
    * ID of the bound resource. For example, an ID may be bound to an CVM instance.
Note: This is field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EipBoundRscIns")
    @Expose
    private String EipBoundRscIns;

    /**
    * ID of the bound ENI
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EipBoundRscEni")
    @Expose
    private String EipBoundRscEni;

    /**
    * Private IP of the bound resource
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("EipBoundRscVip")
    @Expose
    private String EipBoundRscVip;

    /**
    * Modification time
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get Region of the Anti-DDoS instance bound to the EIP. For example, hk indicates Hong Kong.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EipAddressRegion Region of the Anti-DDoS instance bound to the EIP. For example, hk indicates Hong Kong.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getEipAddressRegion() {
        return this.EipAddressRegion;
    }

    /**
     * Set Region of the Anti-DDoS instance bound to the EIP. For example, hk indicates Hong Kong.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EipAddressRegion Region of the Anti-DDoS instance bound to the EIP. For example, hk indicates Hong Kong.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEipAddressRegion(String EipAddressRegion) {
        this.EipAddressRegion = EipAddressRegion;
    }

    /**
     * Get ID of the bound resource. For example, an ID may be bound to an CVM instance.
Note: This is field may return `null`, indicating that no valid value can be obtained. 
     * @return EipBoundRscIns ID of the bound resource. For example, an ID may be bound to an CVM instance.
Note: This is field may return `null`, indicating that no valid value can be obtained.
     */
    public String getEipBoundRscIns() {
        return this.EipBoundRscIns;
    }

    /**
     * Set ID of the bound resource. For example, an ID may be bound to an CVM instance.
Note: This is field may return `null`, indicating that no valid value can be obtained.
     * @param EipBoundRscIns ID of the bound resource. For example, an ID may be bound to an CVM instance.
Note: This is field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEipBoundRscIns(String EipBoundRscIns) {
        this.EipBoundRscIns = EipBoundRscIns;
    }

    /**
     * Get ID of the bound ENI
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EipBoundRscEni ID of the bound ENI
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getEipBoundRscEni() {
        return this.EipBoundRscEni;
    }

    /**
     * Set ID of the bound ENI
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EipBoundRscEni ID of the bound ENI
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEipBoundRscEni(String EipBoundRscEni) {
        this.EipBoundRscEni = EipBoundRscEni;
    }

    /**
     * Get Private IP of the bound resource
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return EipBoundRscVip Private IP of the bound resource
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getEipBoundRscVip() {
        return this.EipBoundRscVip;
    }

    /**
     * Set Private IP of the bound resource
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param EipBoundRscVip Private IP of the bound resource
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setEipBoundRscVip(String EipBoundRscVip) {
        this.EipBoundRscVip = EipBoundRscVip;
    }

    /**
     * Get Modification time
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ModifyTime Modification time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ModifyTime Modification time
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public EipAddressRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EipAddressRelation(EipAddressRelation source) {
        if (source.EipAddressRegion != null) {
            this.EipAddressRegion = new String(source.EipAddressRegion);
        }
        if (source.EipBoundRscIns != null) {
            this.EipBoundRscIns = new String(source.EipBoundRscIns);
        }
        if (source.EipBoundRscEni != null) {
            this.EipBoundRscEni = new String(source.EipBoundRscEni);
        }
        if (source.EipBoundRscVip != null) {
            this.EipBoundRscVip = new String(source.EipBoundRscVip);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EipAddressRegion", this.EipAddressRegion);
        this.setParamSimple(map, prefix + "EipBoundRscIns", this.EipBoundRscIns);
        this.setParamSimple(map, prefix + "EipBoundRscEni", this.EipBoundRscEni);
        this.setParamSimple(map, prefix + "EipBoundRscVip", this.EipBoundRscVip);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

