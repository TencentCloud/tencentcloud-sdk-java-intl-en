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
    * Instance type to refer. Valid values:
<li>edge-function: edge function.</li>
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * ID of the referenced instance. Based on the value of ReferenceType, return the corresponding instance ID:
<li>When ReferenceType is edge-function: return the edge function ID in the format of ef-2vc5oe9mzqhm.</li>

    */
    @SerializedName("ReferenceId")
    @Expose
    private String ReferenceId;

    /**
    * Name of the referenced instance. Based on the value of ReferenceType, the corresponding instance name is returned:
<li>When ReferenceType is edge-function: return the edge function name.</li>

    */
    @SerializedName("ReferenceName")
    @Expose
    private String ReferenceName;

    /**
    * Zone ID. Site identifier of the instance that references the namespace.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Site name. The name of the site to which the instances in this namespace belong.
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * Alias of the site that the instance in the namespace belongs to. If no site alias is set, an empty string is returned.
    */
    @SerializedName("AliasZoneName")
    @Expose
    private String AliasZoneName;

    /**
     * Get Instance type to refer. Valid values:
<li>edge-function: edge function.</li> 
     * @return ReferenceType Instance type to refer. Valid values:
<li>edge-function: edge function.</li>
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set Instance type to refer. Valid values:
<li>edge-function: edge function.</li>
     * @param ReferenceType Instance type to refer. Valid values:
<li>edge-function: edge function.</li>
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get ID of the referenced instance. Based on the value of ReferenceType, return the corresponding instance ID:
<li>When ReferenceType is edge-function: return the edge function ID in the format of ef-2vc5oe9mzqhm.</li>
 
     * @return ReferenceId ID of the referenced instance. Based on the value of ReferenceType, return the corresponding instance ID:
<li>When ReferenceType is edge-function: return the edge function ID in the format of ef-2vc5oe9mzqhm.</li>

     */
    public String getReferenceId() {
        return this.ReferenceId;
    }

    /**
     * Set ID of the referenced instance. Based on the value of ReferenceType, return the corresponding instance ID:
<li>When ReferenceType is edge-function: return the edge function ID in the format of ef-2vc5oe9mzqhm.</li>

     * @param ReferenceId ID of the referenced instance. Based on the value of ReferenceType, return the corresponding instance ID:
<li>When ReferenceType is edge-function: return the edge function ID in the format of ef-2vc5oe9mzqhm.</li>

     */
    public void setReferenceId(String ReferenceId) {
        this.ReferenceId = ReferenceId;
    }

    /**
     * Get Name of the referenced instance. Based on the value of ReferenceType, the corresponding instance name is returned:
<li>When ReferenceType is edge-function: return the edge function name.</li>
 
     * @return ReferenceName Name of the referenced instance. Based on the value of ReferenceType, the corresponding instance name is returned:
<li>When ReferenceType is edge-function: return the edge function name.</li>

     */
    public String getReferenceName() {
        return this.ReferenceName;
    }

    /**
     * Set Name of the referenced instance. Based on the value of ReferenceType, the corresponding instance name is returned:
<li>When ReferenceType is edge-function: return the edge function name.</li>

     * @param ReferenceName Name of the referenced instance. Based on the value of ReferenceType, the corresponding instance name is returned:
<li>When ReferenceType is edge-function: return the edge function name.</li>

     */
    public void setReferenceName(String ReferenceName) {
        this.ReferenceName = ReferenceName;
    }

    /**
     * Get Zone ID. Site identifier of the instance that references the namespace. 
     * @return ZoneId Zone ID. Site identifier of the instance that references the namespace.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID. Site identifier of the instance that references the namespace.
     * @param ZoneId Zone ID. Site identifier of the instance that references the namespace.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Site name. The name of the site to which the instances in this namespace belong. 
     * @return ZoneName Site name. The name of the site to which the instances in this namespace belong.
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set Site name. The name of the site to which the instances in this namespace belong.
     * @param ZoneName Site name. The name of the site to which the instances in this namespace belong.
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get Alias of the site that the instance in the namespace belongs to. If no site alias is set, an empty string is returned. 
     * @return AliasZoneName Alias of the site that the instance in the namespace belongs to. If no site alias is set, an empty string is returned.
     */
    public String getAliasZoneName() {
        return this.AliasZoneName;
    }

    /**
     * Set Alias of the site that the instance in the namespace belongs to. If no site alias is set, an empty string is returned.
     * @param AliasZoneName Alias of the site that the instance in the namespace belongs to. If no site alias is set, an empty string is returned.
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

