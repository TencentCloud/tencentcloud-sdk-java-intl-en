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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableType extends AbstractModel {

    /**
    * <p>Protocol and sale details</p>
    */
    @SerializedName("Protocols")
    @Expose
    private AvailableProtoStatus [] Protocols;

    /**
    * <p>Storage type. In the return value, SD indicates General Standard Storage, HP indicates General Performance Storage, TB indicates Standard Turbo, and TP indicates High-Performance Turbo.</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Support for prepaid. In the return value, true means supported and false means unsupported.</p>
    */
    @SerializedName("Prepayment")
    @Expose
    private Boolean Prepayment;

    /**
    * <p>File system version</p><p>Enumeration value:</p><ul><li>v1.5: Universal Series</li><li>v3.1: Universal Series (enhanced)</li><li>v4.0: Turbo series</li></ul>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get <p>Protocol and sale details</p> 
     * @return Protocols <p>Protocol and sale details</p>
     */
    public AvailableProtoStatus [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set <p>Protocol and sale details</p>
     * @param Protocols <p>Protocol and sale details</p>
     */
    public void setProtocols(AvailableProtoStatus [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get <p>Storage type. In the return value, SD indicates General Standard Storage, HP indicates General Performance Storage, TB indicates Standard Turbo, and TP indicates High-Performance Turbo.</p> 
     * @return Type <p>Storage type. In the return value, SD indicates General Standard Storage, HP indicates General Performance Storage, TB indicates Standard Turbo, and TP indicates High-Performance Turbo.</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Storage type. In the return value, SD indicates General Standard Storage, HP indicates General Performance Storage, TB indicates Standard Turbo, and TP indicates High-Performance Turbo.</p>
     * @param Type <p>Storage type. In the return value, SD indicates General Standard Storage, HP indicates General Performance Storage, TB indicates Standard Turbo, and TP indicates High-Performance Turbo.</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Support for prepaid. In the return value, true means supported and false means unsupported.</p> 
     * @return Prepayment <p>Support for prepaid. In the return value, true means supported and false means unsupported.</p>
     */
    public Boolean getPrepayment() {
        return this.Prepayment;
    }

    /**
     * Set <p>Support for prepaid. In the return value, true means supported and false means unsupported.</p>
     * @param Prepayment <p>Support for prepaid. In the return value, true means supported and false means unsupported.</p>
     */
    public void setPrepayment(Boolean Prepayment) {
        this.Prepayment = Prepayment;
    }

    /**
     * Get <p>File system version</p><p>Enumeration value:</p><ul><li>v1.5: Universal Series</li><li>v3.1: Universal Series (enhanced)</li><li>v4.0: Turbo series</li></ul> 
     * @return Version <p>File system version</p><p>Enumeration value:</p><ul><li>v1.5: Universal Series</li><li>v3.1: Universal Series (enhanced)</li><li>v4.0: Turbo series</li></ul>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>File system version</p><p>Enumeration value:</p><ul><li>v1.5: Universal Series</li><li>v3.1: Universal Series (enhanced)</li><li>v4.0: Turbo series</li></ul>
     * @param Version <p>File system version</p><p>Enumeration value:</p><ul><li>v1.5: Universal Series</li><li>v3.1: Universal Series (enhanced)</li><li>v4.0: Turbo series</li></ul>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public AvailableType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvailableType(AvailableType source) {
        if (source.Protocols != null) {
            this.Protocols = new AvailableProtoStatus[source.Protocols.length];
            for (int i = 0; i < source.Protocols.length; i++) {
                this.Protocols[i] = new AvailableProtoStatus(source.Protocols[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Prepayment != null) {
            this.Prepayment = new Boolean(source.Prepayment);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Protocols.", this.Protocols);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Prepayment", this.Prepayment);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

