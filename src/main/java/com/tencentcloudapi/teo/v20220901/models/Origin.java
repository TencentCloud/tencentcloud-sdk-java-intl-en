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
    * Origin server list.
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
    * Origin server protocol configuration. valid values:.
<Li>Http: forced http back to source;</li>.
<Li>`Follow`: follow protocol.</li>.
<Li>Https: enforce https origin-pull.</li>.
    */
    @SerializedName("OriginPullProtocol")
    @Expose
    private String OriginPullProtocol;

    /**
    * When the origin is tencent cloud COS, whether it is a private access bucket. valid values:.
<li>`on`: private network access;</li>.
<li>`off`: public access.</li>.
    */
    @SerializedName("CosPrivateAccess")
    @Expose
    private String CosPrivateAccess;

    /**
     * Get Origin server list. 
     * @return Origins Origin server list.
     */
    public String [] getOrigins() {
        return this.Origins;
    }

    /**
     * Set Origin server list.
     * @param Origins Origin server list.
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
     * Get Origin server protocol configuration. valid values:.
<Li>Http: forced http back to source;</li>.
<Li>`Follow`: follow protocol.</li>.
<Li>Https: enforce https origin-pull.</li>. 
     * @return OriginPullProtocol Origin server protocol configuration. valid values:.
<Li>Http: forced http back to source;</li>.
<Li>`Follow`: follow protocol.</li>.
<Li>Https: enforce https origin-pull.</li>.
     */
    public String getOriginPullProtocol() {
        return this.OriginPullProtocol;
    }

    /**
     * Set Origin server protocol configuration. valid values:.
<Li>Http: forced http back to source;</li>.
<Li>`Follow`: follow protocol.</li>.
<Li>Https: enforce https origin-pull.</li>.
     * @param OriginPullProtocol Origin server protocol configuration. valid values:.
<Li>Http: forced http back to source;</li>.
<Li>`Follow`: follow protocol.</li>.
<Li>Https: enforce https origin-pull.</li>.
     */
    public void setOriginPullProtocol(String OriginPullProtocol) {
        this.OriginPullProtocol = OriginPullProtocol;
    }

    /**
     * Get When the origin is tencent cloud COS, whether it is a private access bucket. valid values:.
<li>`on`: private network access;</li>.
<li>`off`: public access.</li>. 
     * @return CosPrivateAccess When the origin is tencent cloud COS, whether it is a private access bucket. valid values:.
<li>`on`: private network access;</li>.
<li>`off`: public access.</li>.
     */
    public String getCosPrivateAccess() {
        return this.CosPrivateAccess;
    }

    /**
     * Set When the origin is tencent cloud COS, whether it is a private access bucket. valid values:.
<li>`on`: private network access;</li>.
<li>`off`: public access.</li>.
     * @param CosPrivateAccess When the origin is tencent cloud COS, whether it is a private access bucket. valid values:.
<li>`on`: private network access;</li>.
<li>`off`: public access.</li>.
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

