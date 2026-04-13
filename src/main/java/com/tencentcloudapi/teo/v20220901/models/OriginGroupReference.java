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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginGroupReference extends AbstractModel {

    /**
    * Reference service type. valid values:.
<Li>Acceleration-Domain: specifies the acceleration domain name.</li>.
<Li>Rule-Engine: specifies the rule engine.</li>.
<Li>Load-Balancer: specifies the cloud load balancer.</li>.
<li>application-proxy: layer 4 proxy.</li>.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * ID of the instances referencing the origin group
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the instance name of the reference type.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Referer ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Refers to the site name.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Refers to the site alias.
    */
    @SerializedName("AliasZoneName")
    @Expose
    private String AliasZoneName;

    /**
     * Get Reference service type. valid values:.
<Li>Acceleration-Domain: specifies the acceleration domain name.</li>.
<Li>Rule-Engine: specifies the rule engine.</li>.
<Li>Load-Balancer: specifies the cloud load balancer.</li>.
<li>application-proxy: layer 4 proxy.</li>. 
     * @return InstanceType Reference service type. valid values:.
<Li>Acceleration-Domain: specifies the acceleration domain name.</li>.
<Li>Rule-Engine: specifies the rule engine.</li>.
<Li>Load-Balancer: specifies the cloud load balancer.</li>.
<li>application-proxy: layer 4 proxy.</li>.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Reference service type. valid values:.
<Li>Acceleration-Domain: specifies the acceleration domain name.</li>.
<Li>Rule-Engine: specifies the rule engine.</li>.
<Li>Load-Balancer: specifies the cloud load balancer.</li>.
<li>application-proxy: layer 4 proxy.</li>.
     * @param InstanceType Reference service type. valid values:.
<Li>Acceleration-Domain: specifies the acceleration domain name.</li>.
<Li>Rule-Engine: specifies the rule engine.</li>.
<Li>Load-Balancer: specifies the cloud load balancer.</li>.
<li>application-proxy: layer 4 proxy.</li>.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get ID of the instances referencing the origin group 
     * @return InstanceId ID of the instances referencing the origin group
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instances referencing the origin group
     * @param InstanceId ID of the instances referencing the origin group
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the instance name of the reference type. 
     * @return InstanceName Specifies the instance name of the reference type.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Specifies the instance name of the reference type.
     * @param InstanceName Specifies the instance name of the reference type.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Referer ID. 
     * @return ZoneId Referer ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Referer ID.
     * @param ZoneId Referer ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Refers to the site name. 
     * @return ZoneName Refers to the site name.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Refers to the site name.
     * @param ZoneName Refers to the site name.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Refers to the site alias. 
     * @return AliasZoneName Refers to the site alias.
     */
    public String getAliasZoneName() {
        return this.AliasZoneName;
    }

    /**
     * Set Refers to the site alias.
     * @param AliasZoneName Refers to the site alias.
     */
    public void setAliasZoneName(String AliasZoneName) {
        this.AliasZoneName = AliasZoneName;
    }

    public OriginGroupReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroupReference(OriginGroupReference source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.AliasZoneName != null) {
            this.AliasZoneName = new String(source.AliasZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "AliasZoneName", this.AliasZoneName);

    }
}

