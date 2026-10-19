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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessPointInfo extends AbstractModel {

    /**
    * <p>Access point operator.</p>
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * <p>Endpoint address.</p>
    */
    @SerializedName("PublicAddr")
    @Expose
    private String PublicAddr;

    /**
    * <p>Access point region.</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>Access point region.</p>
    */
    @SerializedName("BigArea")
    @Expose
    private String BigArea;

    /**
    * <p>Whether the access point is available.</p><p>Enumeration value:</p><ul><li>true: The access point is available.</li><li>false: The access point is unavailable.</li></ul>
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("GwGroupId")
    @Expose
    private String GwGroupId;

    /**
     * Get <p>Access point operator.</p> 
     * @return Vendor <p>Access point operator.</p>
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set <p>Access point operator.</p>
     * @param Vendor <p>Access point operator.</p>
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get <p>Endpoint address.</p> 
     * @return PublicAddr <p>Endpoint address.</p>
     */
    public String getPublicAddr() {
        return this.PublicAddr;
    }

    /**
     * Set <p>Endpoint address.</p>
     * @param PublicAddr <p>Endpoint address.</p>
     */
    public void setPublicAddr(String PublicAddr) {
        this.PublicAddr = PublicAddr;
    }

    /**
     * Get <p>Access point region.</p> 
     * @return Region <p>Access point region.</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>Access point region.</p>
     * @param Region <p>Access point region.</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>Access point region.</p> 
     * @return BigArea <p>Access point region.</p>
     */
    public String getBigArea() {
        return this.BigArea;
    }

    /**
     * Set <p>Access point region.</p>
     * @param BigArea <p>Access point region.</p>
     */
    public void setBigArea(String BigArea) {
        this.BigArea = BigArea;
    }

    /**
     * Get <p>Whether the access point is available.</p><p>Enumeration value:</p><ul><li>true: The access point is available.</li><li>false: The access point is unavailable.</li></ul> 
     * @return Available <p>Whether the access point is available.</p><p>Enumeration value:</p><ul><li>true: The access point is available.</li><li>false: The access point is unavailable.</li></ul>
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>Whether the access point is available.</p><p>Enumeration value:</p><ul><li>true: The access point is available.</li><li>false: The access point is unavailable.</li></ul>
     * @param Available <p>Whether the access point is available.</p><p>Enumeration value:</p><ul><li>true: The access point is available.</li><li>false: The access point is unavailable.</li></ul>
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get <p>Cluster ID.</p> 
     * @return GwGroupId <p>Cluster ID.</p>
     */
    public String getGwGroupId() {
        return this.GwGroupId;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param GwGroupId <p>Cluster ID.</p>
     */
    public void setGwGroupId(String GwGroupId) {
        this.GwGroupId = GwGroupId;
    }

    public AccessPointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessPointInfo(AccessPointInfo source) {
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
        if (source.PublicAddr != null) {
            this.PublicAddr = new String(source.PublicAddr);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.BigArea != null) {
            this.BigArea = new String(source.BigArea);
        }
        if (source.Available != null) {
            this.Available = new Boolean(source.Available);
        }
        if (source.GwGroupId != null) {
            this.GwGroupId = new String(source.GwGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "PublicAddr", this.PublicAddr);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BigArea", this.BigArea);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "GwGroupId", this.GwGroupId);

    }
}

