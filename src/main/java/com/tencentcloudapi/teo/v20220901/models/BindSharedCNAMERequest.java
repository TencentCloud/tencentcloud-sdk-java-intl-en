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

public class BindSharedCNAMERequest extends AbstractModel {

    /**
    * ID of the site related with the acceleration domain name.	
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Action type. Values:
<li>`bind`: To bind</li>
<li>`unbind`: To unbind</li>
    */
    @SerializedName("BindType")
    @Expose
    private String BindType;

    /**
    * Bindings between domain names and a shared CNAME
    */
    @SerializedName("BindSharedCNAMEMaps")
    @Expose
    private BindSharedCNAMEMap [] BindSharedCNAMEMaps;

    /**
     * Get ID of the site related with the acceleration domain name.	 
     * @return ZoneId ID of the site related with the acceleration domain name.	
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set ID of the site related with the acceleration domain name.	
     * @param ZoneId ID of the site related with the acceleration domain name.	
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Action type. Values:
<li>`bind`: To bind</li>
<li>`unbind`: To unbind</li> 
     * @return BindType Action type. Values:
<li>`bind`: To bind</li>
<li>`unbind`: To unbind</li>
     */
    public String getBindType() {
        return this.BindType;
    }

    /**
     * Set Action type. Values:
<li>`bind`: To bind</li>
<li>`unbind`: To unbind</li>
     * @param BindType Action type. Values:
<li>`bind`: To bind</li>
<li>`unbind`: To unbind</li>
     */
    public void setBindType(String BindType) {
        this.BindType = BindType;
    }

    /**
     * Get Bindings between domain names and a shared CNAME 
     * @return BindSharedCNAMEMaps Bindings between domain names and a shared CNAME
     */
    public BindSharedCNAMEMap [] getBindSharedCNAMEMaps() {
        return this.BindSharedCNAMEMaps;
    }

    /**
     * Set Bindings between domain names and a shared CNAME
     * @param BindSharedCNAMEMaps Bindings between domain names and a shared CNAME
     */
    public void setBindSharedCNAMEMaps(BindSharedCNAMEMap [] BindSharedCNAMEMaps) {
        this.BindSharedCNAMEMaps = BindSharedCNAMEMaps;
    }

    public BindSharedCNAMERequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindSharedCNAMERequest(BindSharedCNAMERequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.BindType != null) {
            this.BindType = new String(source.BindType);
        }
        if (source.BindSharedCNAMEMaps != null) {
            this.BindSharedCNAMEMaps = new BindSharedCNAMEMap[source.BindSharedCNAMEMaps.length];
            for (int i = 0; i < source.BindSharedCNAMEMaps.length; i++) {
                this.BindSharedCNAMEMaps[i] = new BindSharedCNAMEMap(source.BindSharedCNAMEMaps[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamArrayObj(map, prefix + "BindSharedCNAMEMaps.", this.BindSharedCNAMEMaps);

    }
}

