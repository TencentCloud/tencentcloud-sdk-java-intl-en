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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccelerationDomainRequest extends AbstractModel {

    /**
    * ID of the site related with the accelerated domain name.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Accelerated domain name
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Details of the origin.
    */
    @SerializedName("OriginInfo")
    @Expose
    private OriginInfo OriginInfo;

    /**
     * Get ID of the site related with the accelerated domain name. 
     * @return ZoneId ID of the site related with the accelerated domain name.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site related with the accelerated domain name.
     * @param ZoneId ID of the site related with the accelerated domain name.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Accelerated domain name 
     * @return DomainName Accelerated domain name
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Accelerated domain name
     * @param DomainName Accelerated domain name
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Details of the origin. 
     * @return OriginInfo Details of the origin.
     */
    public OriginInfo getOriginInfo() {
        return this.OriginInfo;
    }

    /**
     * Set Details of the origin.
     * @param OriginInfo Details of the origin.
     */
    public void setOriginInfo(OriginInfo OriginInfo) {
        this.OriginInfo = OriginInfo;
    }

    public ModifyAccelerationDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccelerationDomainRequest(ModifyAccelerationDomainRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.OriginInfo != null) {
            this.OriginInfo = new OriginInfo(source.OriginInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamObj(map, prefix + "OriginInfo.", this.OriginInfo);

    }
}

