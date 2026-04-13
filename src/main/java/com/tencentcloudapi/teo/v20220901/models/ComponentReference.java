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

public class ComponentReference extends AbstractModel {

    /**
    * Refer to the instance type. Valid values:
<li>edge-function: Edge function.</li>
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * Referenced instance ID. According to the value of ReferenceType, return the corresponding instance ID.
<li>When ReferenceType is edge-function: Return the edge function ID in the format of ef-2vc5oe9mzqhm.</li>

    */
    @SerializedName("ReferenceId")
    @Expose
    private String ReferenceId;

    /**
    * Referenced instance name. According to the value of ReferenceType, return the corresponding instance name.
<li>When ReferenceType is edge-function: Returns the edge function name.</li>

    */
    @SerializedName("ReferenceName")
    @Expose
    private String ReferenceName;

    /**
    * Site ID. Site identifier of the instance ownership that refers to the namespace.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Site name. Refer to the site name of the instance ownership in namespace.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Refer to the site alias of the namespace instance. If the site alias is not set, return an empty string.
    */
    @SerializedName("AliasZoneName")
    @Expose
    private String AliasZoneName;

    /**
     * Get Refer to the instance type. Valid values:
<li>edge-function: Edge function.</li> 
     * @return ReferenceType Refer to the instance type. Valid values:
<li>edge-function: Edge function.</li>
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set Refer to the instance type. Valid values:
<li>edge-function: Edge function.</li>
     * @param ReferenceType Refer to the instance type. Valid values:
<li>edge-function: Edge function.</li>
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get Referenced instance ID. According to the value of ReferenceType, return the corresponding instance ID.
<li>When ReferenceType is edge-function: Return the edge function ID in the format of ef-2vc5oe9mzqhm.</li>
 
     * @return ReferenceId Referenced instance ID. According to the value of ReferenceType, return the corresponding instance ID.
<li>When ReferenceType is edge-function: Return the edge function ID in the format of ef-2vc5oe9mzqhm.</li>

     */
    public String getReferenceId() {
        return this.ReferenceId;
    }

    /**
     * Set Referenced instance ID. According to the value of ReferenceType, return the corresponding instance ID.
<li>When ReferenceType is edge-function: Return the edge function ID in the format of ef-2vc5oe9mzqhm.</li>

     * @param ReferenceId Referenced instance ID. According to the value of ReferenceType, return the corresponding instance ID.
<li>When ReferenceType is edge-function: Return the edge function ID in the format of ef-2vc5oe9mzqhm.</li>

     */
    public void setReferenceId(String ReferenceId) {
        this.ReferenceId = ReferenceId;
    }

    /**
     * Get Referenced instance name. According to the value of ReferenceType, return the corresponding instance name.
<li>When ReferenceType is edge-function: Returns the edge function name.</li>
 
     * @return ReferenceName Referenced instance name. According to the value of ReferenceType, return the corresponding instance name.
<li>When ReferenceType is edge-function: Returns the edge function name.</li>

     */
    public String getReferenceName() {
        return this.ReferenceName;
    }

    /**
     * Set Referenced instance name. According to the value of ReferenceType, return the corresponding instance name.
<li>When ReferenceType is edge-function: Returns the edge function name.</li>

     * @param ReferenceName Referenced instance name. According to the value of ReferenceType, return the corresponding instance name.
<li>When ReferenceType is edge-function: Returns the edge function name.</li>

     */
    public void setReferenceName(String ReferenceName) {
        this.ReferenceName = ReferenceName;
    }

    /**
     * Get Site ID. Site identifier of the instance ownership that refers to the namespace. 
     * @return ZoneId Site ID. Site identifier of the instance ownership that refers to the namespace.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID. Site identifier of the instance ownership that refers to the namespace.
     * @param ZoneId Site ID. Site identifier of the instance ownership that refers to the namespace.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Site name. Refer to the site name of the instance ownership in namespace. 
     * @return ZoneName Site name. Refer to the site name of the instance ownership in namespace.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Site name. Refer to the site name of the instance ownership in namespace.
     * @param ZoneName Site name. Refer to the site name of the instance ownership in namespace.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Refer to the site alias of the namespace instance. If the site alias is not set, return an empty string. 
     * @return AliasZoneName Refer to the site alias of the namespace instance. If the site alias is not set, return an empty string.
     */
    public String getAliasZoneName() {
        return this.AliasZoneName;
    }

    /**
     * Set Refer to the site alias of the namespace instance. If the site alias is not set, return an empty string.
     * @param AliasZoneName Refer to the site alias of the namespace instance. If the site alias is not set, return an empty string.
     */
    public void setAliasZoneName(String AliasZoneName) {
        this.AliasZoneName = AliasZoneName;
    }

    public ComponentReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentReference(ComponentReference source) {
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
        if (source.ReferenceId != null) {
            this.ReferenceId = new String(source.ReferenceId);
        }
        if (source.ReferenceName != null) {
            this.ReferenceName = new String(source.ReferenceName);
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
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "ReferenceId", this.ReferenceId);
        this.setParamSimple(map, prefix + "ReferenceName", this.ReferenceName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "AliasZoneName", this.AliasZoneName);

    }
}

