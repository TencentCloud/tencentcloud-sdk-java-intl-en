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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPIntelInfo extends AbstractModel {

    /**
    * <p>Intelligence tag (such as Common Trojan, vulnerability software, Stealer Trojan)</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>Analysis basis</p>
    */
    @SerializedName("Basis")
    @Expose
    private String Basis;

    /**
    * <p>Associated operator</p>
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
    * <p>Location</p>
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * <p>Family gang</p>
    */
    @SerializedName("Characteristic")
    @Expose
    private String Characteristic;

    /**
    * <p>IP profiling</p>
    */
    @SerializedName("Purpose")
    @Expose
    private String Purpose;

    /**
    * <p>Reverse-check domain name list</p>
    */
    @SerializedName("Referer")
    @Expose
    private DomainInfo [] Referer;

    /**
     * Get <p>Intelligence tag (such as Common Trojan, vulnerability software, Stealer Trojan)</p> 
     * @return Tags <p>Intelligence tag (such as Common Trojan, vulnerability software, Stealer Trojan)</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Intelligence tag (such as Common Trojan, vulnerability software, Stealer Trojan)</p>
     * @param Tags <p>Intelligence tag (such as Common Trojan, vulnerability software, Stealer Trojan)</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Analysis basis</p> 
     * @return Basis <p>Analysis basis</p>
     */
    public String getBasis() {
        return this.Basis;
    }

    /**
     * Set <p>Analysis basis</p>
     * @param Basis <p>Analysis basis</p>
     */
    public void setBasis(String Basis) {
        this.Basis = Basis;
    }

    /**
     * Get <p>Associated operator</p> 
     * @return ISP <p>Associated operator</p>
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set <p>Associated operator</p>
     * @param ISP <p>Associated operator</p>
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    /**
     * Get <p>Location</p> 
     * @return Location <p>Location</p>
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set <p>Location</p>
     * @param Location <p>Location</p>
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get <p>Family gang</p> 
     * @return Characteristic <p>Family gang</p>
     */
    public String getCharacteristic() {
        return this.Characteristic;
    }

    /**
     * Set <p>Family gang</p>
     * @param Characteristic <p>Family gang</p>
     */
    public void setCharacteristic(String Characteristic) {
        this.Characteristic = Characteristic;
    }

    /**
     * Get <p>IP profiling</p> 
     * @return Purpose <p>IP profiling</p>
     */
    public String getPurpose() {
        return this.Purpose;
    }

    /**
     * Set <p>IP profiling</p>
     * @param Purpose <p>IP profiling</p>
     */
    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
    }

    /**
     * Get <p>Reverse-check domain name list</p> 
     * @return Referer <p>Reverse-check domain name list</p>
     */
    public DomainInfo [] getReferer() {
        return this.Referer;
    }

    /**
     * Set <p>Reverse-check domain name list</p>
     * @param Referer <p>Reverse-check domain name list</p>
     */
    public void setReferer(DomainInfo [] Referer) {
        this.Referer = Referer;
    }

    public IPIntelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPIntelInfo(IPIntelInfo source) {
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Basis != null) {
            this.Basis = new String(source.Basis);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Characteristic != null) {
            this.Characteristic = new String(source.Characteristic);
        }
        if (source.Purpose != null) {
            this.Purpose = new String(source.Purpose);
        }
        if (source.Referer != null) {
            this.Referer = new DomainInfo[source.Referer.length];
            for (int i = 0; i < source.Referer.length; i++) {
                this.Referer[i] = new DomainInfo(source.Referer[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Basis", this.Basis);
        this.setParamSimple(map, prefix + "ISP", this.ISP);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Characteristic", this.Characteristic);
        this.setParamSimple(map, prefix + "Purpose", this.Purpose);
        this.setParamArrayObj(map, prefix + "Referer.", this.Referer);

    }
}

