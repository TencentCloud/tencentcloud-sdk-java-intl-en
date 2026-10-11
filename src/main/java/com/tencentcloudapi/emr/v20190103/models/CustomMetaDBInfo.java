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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomMetaDBInfo extends AbstractModel {

    /**
    * <p>Custom MetaDB JDBC connection, for example: jdbc:mysql://10.10.10.10:3306/dbname.</p>
    */
    @SerializedName("MetaDataJdbcUrl")
    @Expose
    private String MetaDataJdbcUrl;

    /**
    * <p>Custom MetaDB username.</p>
    */
    @SerializedName("MetaDataUser")
    @Expose
    private String MetaDataUser;

    /**
    * <p>Custom MetaDB password.</p>
    */
    @SerializedName("MetaDataPass")
    @Expose
    private String MetaDataPass;

    /**
    * <p>Hive shared metadata database type. Valid values:</p><li>EMR_DEFAULT_META: created by the cluster by default</li><li>EMR_EXIST_META: EMR-MetaDB specified by the cluster</li><li>USER_CUSTOM_META: custom MetaDB used by the cluster</li>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * <p>EMR-MetaDB instance.</p>
    */
    @SerializedName("UnifyMetaInstanceId")
    @Expose
    private String UnifyMetaInstanceId;

    /**
    * <p>Component.</p>
    */
    @SerializedName("Components")
    @Expose
    private String [] Components;

    /**
    * <p>MetaDB version.</p>
    */
    @SerializedName("DefaultMetaVersion")
    @Expose
    private String DefaultMetaVersion;

    /**
    * <p>CDBId</p>
    */
    @SerializedName("LinkInstanceId")
    @Expose
    private String LinkInstanceId;

    /**
     * Get <p>Custom MetaDB JDBC connection, for example: jdbc:mysql://10.10.10.10:3306/dbname.</p> 
     * @return MetaDataJdbcUrl <p>Custom MetaDB JDBC connection, for example: jdbc:mysql://10.10.10.10:3306/dbname.</p>
     */
    public String getMetaDataJdbcUrl() {
        return this.MetaDataJdbcUrl;
    }

    /**
     * Set <p>Custom MetaDB JDBC connection, for example: jdbc:mysql://10.10.10.10:3306/dbname.</p>
     * @param MetaDataJdbcUrl <p>Custom MetaDB JDBC connection, for example: jdbc:mysql://10.10.10.10:3306/dbname.</p>
     */
    public void setMetaDataJdbcUrl(String MetaDataJdbcUrl) {
        this.MetaDataJdbcUrl = MetaDataJdbcUrl;
    }

    /**
     * Get <p>Custom MetaDB username.</p> 
     * @return MetaDataUser <p>Custom MetaDB username.</p>
     */
    public String getMetaDataUser() {
        return this.MetaDataUser;
    }

    /**
     * Set <p>Custom MetaDB username.</p>
     * @param MetaDataUser <p>Custom MetaDB username.</p>
     */
    public void setMetaDataUser(String MetaDataUser) {
        this.MetaDataUser = MetaDataUser;
    }

    /**
     * Get <p>Custom MetaDB password.</p> 
     * @return MetaDataPass <p>Custom MetaDB password.</p>
     */
    public String getMetaDataPass() {
        return this.MetaDataPass;
    }

    /**
     * Set <p>Custom MetaDB password.</p>
     * @param MetaDataPass <p>Custom MetaDB password.</p>
     */
    public void setMetaDataPass(String MetaDataPass) {
        this.MetaDataPass = MetaDataPass;
    }

    /**
     * Get <p>Hive shared metadata database type. Valid values:</p><li>EMR_DEFAULT_META: created by the cluster by default</li><li>EMR_EXIST_META: EMR-MetaDB specified by the cluster</li><li>USER_CUSTOM_META: custom MetaDB used by the cluster</li> 
     * @return MetaType <p>Hive shared metadata database type. Valid values:</p><li>EMR_DEFAULT_META: created by the cluster by default</li><li>EMR_EXIST_META: EMR-MetaDB specified by the cluster</li><li>USER_CUSTOM_META: custom MetaDB used by the cluster</li>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set <p>Hive shared metadata database type. Valid values:</p><li>EMR_DEFAULT_META: created by the cluster by default</li><li>EMR_EXIST_META: EMR-MetaDB specified by the cluster</li><li>USER_CUSTOM_META: custom MetaDB used by the cluster</li>
     * @param MetaType <p>Hive shared metadata database type. Valid values:</p><li>EMR_DEFAULT_META: created by the cluster by default</li><li>EMR_EXIST_META: EMR-MetaDB specified by the cluster</li><li>USER_CUSTOM_META: custom MetaDB used by the cluster</li>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get <p>EMR-MetaDB instance.</p> 
     * @return UnifyMetaInstanceId <p>EMR-MetaDB instance.</p>
     */
    public String getUnifyMetaInstanceId() {
        return this.UnifyMetaInstanceId;
    }

    /**
     * Set <p>EMR-MetaDB instance.</p>
     * @param UnifyMetaInstanceId <p>EMR-MetaDB instance.</p>
     */
    public void setUnifyMetaInstanceId(String UnifyMetaInstanceId) {
        this.UnifyMetaInstanceId = UnifyMetaInstanceId;
    }

    /**
     * Get <p>Component.</p> 
     * @return Components <p>Component.</p>
     */
    public String [] getComponents() {
        return this.Components;
    }

    /**
     * Set <p>Component.</p>
     * @param Components <p>Component.</p>
     */
    public void setComponents(String [] Components) {
        this.Components = Components;
    }

    /**
     * Get <p>MetaDB version.</p> 
     * @return DefaultMetaVersion <p>MetaDB version.</p>
     */
    public String getDefaultMetaVersion() {
        return this.DefaultMetaVersion;
    }

    /**
     * Set <p>MetaDB version.</p>
     * @param DefaultMetaVersion <p>MetaDB version.</p>
     */
    public void setDefaultMetaVersion(String DefaultMetaVersion) {
        this.DefaultMetaVersion = DefaultMetaVersion;
    }

    /**
     * Get <p>CDBId</p> 
     * @return LinkInstanceId <p>CDBId</p>
     */
    public String getLinkInstanceId() {
        return this.LinkInstanceId;
    }

    /**
     * Set <p>CDBId</p>
     * @param LinkInstanceId <p>CDBId</p>
     */
    public void setLinkInstanceId(String LinkInstanceId) {
        this.LinkInstanceId = LinkInstanceId;
    }

    public CustomMetaDBInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomMetaDBInfo(CustomMetaDBInfo source) {
        if (source.MetaDataJdbcUrl != null) {
            this.MetaDataJdbcUrl = new String(source.MetaDataJdbcUrl);
        }
        if (source.MetaDataUser != null) {
            this.MetaDataUser = new String(source.MetaDataUser);
        }
        if (source.MetaDataPass != null) {
            this.MetaDataPass = new String(source.MetaDataPass);
        }
        if (source.MetaType != null) {
            this.MetaType = new String(source.MetaType);
        }
        if (source.UnifyMetaInstanceId != null) {
            this.UnifyMetaInstanceId = new String(source.UnifyMetaInstanceId);
        }
        if (source.Components != null) {
            this.Components = new String[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new String(source.Components[i]);
            }
        }
        if (source.DefaultMetaVersion != null) {
            this.DefaultMetaVersion = new String(source.DefaultMetaVersion);
        }
        if (source.LinkInstanceId != null) {
            this.LinkInstanceId = new String(source.LinkInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetaDataJdbcUrl", this.MetaDataJdbcUrl);
        this.setParamSimple(map, prefix + "MetaDataUser", this.MetaDataUser);
        this.setParamSimple(map, prefix + "MetaDataPass", this.MetaDataPass);
        this.setParamSimple(map, prefix + "MetaType", this.MetaType);
        this.setParamSimple(map, prefix + "UnifyMetaInstanceId", this.UnifyMetaInstanceId);
        this.setParamArraySimple(map, prefix + "Components.", this.Components);
        this.setParamSimple(map, prefix + "DefaultMetaVersion", this.DefaultMetaVersion);
        this.setParamSimple(map, prefix + "LinkInstanceId", this.LinkInstanceId);

    }
}

