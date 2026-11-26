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

public class Origin extends AbstractModel {

    /**
    * Primary origin server list.
    */
    @SerializedName("Origins")
    @Expose
    private String [] Origins;

    /**
    * Backup origin list.
    */
    @SerializedName("BackupOrigins")
    @Expose
    private String [] BackupOrigins;

    /**
    * Origin-pull protocol configuration, with values:
<li>http: Force HTTP origin-pull.</li>
<li>follow: follow protocol for origin-pull;</li>
<li>https: Force HTTPS origin-pull.</li>
    */
    @SerializedName("OriginPullProtocol")
    @Expose
    private String OriginPullProtocol;

    /**
    * Whether the origin server is a private access bucket when it is Tencent Cloud COS. Valid values:
<li>on: Private access;</li>
<li>off: Public Access.</li>
    */
    @SerializedName("CosPrivateAccess")
    @Expose
    private String CosPrivateAccess;

    /**
     * Get Primary origin server list. 
     * @return Origins Primary origin server list.
     */
    public String [] getOrigins() {
        return this.Origins;
    }

    /**
     * Set Primary origin server list.
     * @param Origins Primary origin server list.
     */
    public void setOrigins(String [] Origins) {
        this.Origins = Origins;
    }

    /**
     * Get Backup origin list. 
     * @return BackupOrigins Backup origin list.
     */
    public String [] getBackupOrigins() {
        return this.BackupOrigins;
    }

    /**
     * Set Backup origin list.
     * @param BackupOrigins Backup origin list.
     */
    public void setBackupOrigins(String [] BackupOrigins) {
        this.BackupOrigins = BackupOrigins;
    }

    /**
     * Get Origin-pull protocol configuration, with values:
<li>http: Force HTTP origin-pull.</li>
<li>follow: follow protocol for origin-pull;</li>
<li>https: Force HTTPS origin-pull.</li> 
     * @return OriginPullProtocol Origin-pull protocol configuration, with values:
<li>http: Force HTTP origin-pull.</li>
<li>follow: follow protocol for origin-pull;</li>
<li>https: Force HTTPS origin-pull.</li>
     */
    public String getOriginPullProtocol() {
        return this.OriginPullProtocol;
    }

    /**
     * Set Origin-pull protocol configuration, with values:
<li>http: Force HTTP origin-pull.</li>
<li>follow: follow protocol for origin-pull;</li>
<li>https: Force HTTPS origin-pull.</li>
     * @param OriginPullProtocol Origin-pull protocol configuration, with values:
<li>http: Force HTTP origin-pull.</li>
<li>follow: follow protocol for origin-pull;</li>
<li>https: Force HTTPS origin-pull.</li>
     */
    public void setOriginPullProtocol(String OriginPullProtocol) {
        this.OriginPullProtocol = OriginPullProtocol;
    }

    /**
     * Get Whether the origin server is a private access bucket when it is Tencent Cloud COS. Valid values:
<li>on: Private access;</li>
<li>off: Public Access.</li> 
     * @return CosPrivateAccess Whether the origin server is a private access bucket when it is Tencent Cloud COS. Valid values:
<li>on: Private access;</li>
<li>off: Public Access.</li>
     */
    public String getCosPrivateAccess() {
        return this.CosPrivateAccess;
    }

    /**
     * Set Whether the origin server is a private access bucket when it is Tencent Cloud COS. Valid values:
<li>on: Private access;</li>
<li>off: Public Access.</li>
     * @param CosPrivateAccess Whether the origin server is a private access bucket when it is Tencent Cloud COS. Valid values:
<li>on: Private access;</li>
<li>off: Public Access.</li>
     */
    public void setCosPrivateAccess(String CosPrivateAccess) {
        this.CosPrivateAccess = CosPrivateAccess;
    }

    public Origin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Origin(Origin source) {
        if (source.Origins != null) {
            this.Origins = new String[source.Origins.length];
            for (int i = 0; i < source.Origins.length; i++) {
                this.Origins[i] = new String(source.Origins[i]);
            }
        }
        if (source.BackupOrigins != null) {
            this.BackupOrigins = new String[source.BackupOrigins.length];
            for (int i = 0; i < source.BackupOrigins.length; i++) {
                this.BackupOrigins[i] = new String(source.BackupOrigins[i]);
            }
        }
        if (source.OriginPullProtocol != null) {
            this.OriginPullProtocol = new String(source.OriginPullProtocol);
        }
        if (source.CosPrivateAccess != null) {
            this.CosPrivateAccess = new String(source.CosPrivateAccess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Origins.", this.Origins);
        this.setParamArraySimple(map, prefix + "BackupOrigins.", this.BackupOrigins);
        this.setParamSimple(map, prefix + "OriginPullProtocol", this.OriginPullProtocol);
        this.setParamSimple(map, prefix + "CosPrivateAccess", this.CosPrivateAccess);

    }
}

