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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Origin extends AbstractModel{

    /**
    * 
    */
    @SerializedName("Origins")
    @Expose
    private String [] Origins;

    /**
    * 
    */
    @SerializedName("OriginType")
    @Expose
    private String OriginType;

    /**
    * 
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 
    */
    @SerializedName("OriginPullProtocol")
    @Expose
    private String OriginPullProtocol;

    /**
    * 
    */
    @SerializedName("BackupOrigins")
    @Expose
    private String [] BackupOrigins;

    /**
    * 
    */
    @SerializedName("BackupOriginType")
    @Expose
    private String BackupOriginType;

    /**
    * 
    */
    @SerializedName("BackupServerName")
    @Expose
    private String BackupServerName;

    /**
    * 
    */
    @SerializedName("OriginCompany")
    @Expose
    private String OriginCompany;

    /**
     * Get  
     * @return Origins 
     */
    public String [] getOrigins() {
        return this.Origins;
    }

    /**
     * Set 
     * @param Origins 
     */
    public void setOrigins(String [] Origins) {
        this.Origins = Origins;
    }

    /**
     * Get  
     * @return OriginType 
     */
    public String getOriginType() {
        return this.OriginType;
    }

    /**
     * Set 
     * @param OriginType 
     */
    public void setOriginType(String OriginType) {
        this.OriginType = OriginType;
    }

    /**
     * Get  
     * @return ServerName 
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 
     * @param ServerName 
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get  
     * @return OriginPullProtocol 
     */
    public String getOriginPullProtocol() {
        return this.OriginPullProtocol;
    }

    /**
     * Set 
     * @param OriginPullProtocol 
     */
    public void setOriginPullProtocol(String OriginPullProtocol) {
        this.OriginPullProtocol = OriginPullProtocol;
    }

    /**
     * Get  
     * @return BackupOrigins 
     */
    public String [] getBackupOrigins() {
        return this.BackupOrigins;
    }

    /**
     * Set 
     * @param BackupOrigins 
     */
    public void setBackupOrigins(String [] BackupOrigins) {
        this.BackupOrigins = BackupOrigins;
    }

    /**
     * Get  
     * @return BackupOriginType 
     */
    public String getBackupOriginType() {
        return this.BackupOriginType;
    }

    /**
     * Set 
     * @param BackupOriginType 
     */
    public void setBackupOriginType(String BackupOriginType) {
        this.BackupOriginType = BackupOriginType;
    }

    /**
     * Get  
     * @return BackupServerName 
     */
    public String getBackupServerName() {
        return this.BackupServerName;
    }

    /**
     * Set 
     * @param BackupServerName 
     */
    public void setBackupServerName(String BackupServerName) {
        this.BackupServerName = BackupServerName;
    }

    /**
     * Get  
     * @return OriginCompany 
     */
    public String getOriginCompany() {
        return this.OriginCompany;
    }

    /**
     * Set 
     * @param OriginCompany 
     */
    public void setOriginCompany(String OriginCompany) {
        this.OriginCompany = OriginCompany;
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
        if (source.OriginType != null) {
            this.OriginType = new String(source.OriginType);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.OriginPullProtocol != null) {
            this.OriginPullProtocol = new String(source.OriginPullProtocol);
        }
        if (source.BackupOrigins != null) {
            this.BackupOrigins = new String[source.BackupOrigins.length];
            for (int i = 0; i < source.BackupOrigins.length; i++) {
                this.BackupOrigins[i] = new String(source.BackupOrigins[i]);
            }
        }
        if (source.BackupOriginType != null) {
            this.BackupOriginType = new String(source.BackupOriginType);
        }
        if (source.BackupServerName != null) {
            this.BackupServerName = new String(source.BackupServerName);
        }
        if (source.OriginCompany != null) {
            this.OriginCompany = new String(source.OriginCompany);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Origins.", this.Origins);
        this.setParamSimple(map, prefix + "OriginType", this.OriginType);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "OriginPullProtocol", this.OriginPullProtocol);
        this.setParamArraySimple(map, prefix + "BackupOrigins.", this.BackupOrigins);
        this.setParamSimple(map, prefix + "BackupOriginType", this.BackupOriginType);
        this.setParamSimple(map, prefix + "BackupServerName", this.BackupServerName);
        this.setParamSimple(map, prefix + "OriginCompany", this.OriginCompany);

    }
}

