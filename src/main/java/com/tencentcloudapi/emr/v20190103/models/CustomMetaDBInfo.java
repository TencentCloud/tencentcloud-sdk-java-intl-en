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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomMetaDBInfo extends AbstractModel {

    /**
    * The JDBC URL of the custom metadatabase instance. Example: jdbc:mysql://10.10.10.10:3306/dbname
    */
    @SerializedName("MetaDataJdbcUrl")
    @Expose
    private String MetaDataJdbcUrl;

    /**
    * The custom metadatabase instance username.
    */
    @SerializedName("MetaDataUser")
    @Expose
    private String MetaDataUser;

    /**
    * The custom metadatabase instance password.
    */
    @SerializedName("MetaDataPass")
    @Expose
    private String MetaDataPass;

    /**
    * The Hive-shared metadatabase type. Valid values:
<li>`EMR_DEFAULT_META`: The cluster creates one by default.</li>
<li>`EMR_EXIST_META`: The cluster uses the specified EMR metadatabase instance.</li>
<li>`USER_CUSTOM_META`: The cluster uses a custom metadatabase instance.</li>
    */
    @SerializedName("MetaType")
    @Expose
    private String MetaType;

    /**
    * The EMR-MetaDB instance.
    */
    @SerializedName("UnifyMetaInstanceId")
    @Expose
    private String UnifyMetaInstanceId;

    /**
     * Get The JDBC URL of the custom metadatabase instance. Example: jdbc:mysql://10.10.10.10:3306/dbname 
     * @return MetaDataJdbcUrl The JDBC URL of the custom metadatabase instance. Example: jdbc:mysql://10.10.10.10:3306/dbname
     */
    public String getMetaDataJdbcUrl() {
        return this.MetaDataJdbcUrl;
    }

    /**
     * Set The JDBC URL of the custom metadatabase instance. Example: jdbc:mysql://10.10.10.10:3306/dbname
     * @param MetaDataJdbcUrl The JDBC URL of the custom metadatabase instance. Example: jdbc:mysql://10.10.10.10:3306/dbname
     */
    public void setMetaDataJdbcUrl(String MetaDataJdbcUrl) {
        this.MetaDataJdbcUrl = MetaDataJdbcUrl;
    }

    /**
     * Get The custom metadatabase instance username. 
     * @return MetaDataUser The custom metadatabase instance username.
     */
    public String getMetaDataUser() {
        return this.MetaDataUser;
    }

    /**
     * Set The custom metadatabase instance username.
     * @param MetaDataUser The custom metadatabase instance username.
     */
    public void setMetaDataUser(String MetaDataUser) {
        this.MetaDataUser = MetaDataUser;
    }

    /**
     * Get The custom metadatabase instance password. 
     * @return MetaDataPass The custom metadatabase instance password.
     */
    public String getMetaDataPass() {
        return this.MetaDataPass;
    }

    /**
     * Set The custom metadatabase instance password.
     * @param MetaDataPass The custom metadatabase instance password.
     */
    public void setMetaDataPass(String MetaDataPass) {
        this.MetaDataPass = MetaDataPass;
    }

    /**
     * Get The Hive-shared metadatabase type. Valid values:
<li>`EMR_DEFAULT_META`: The cluster creates one by default.</li>
<li>`EMR_EXIST_META`: The cluster uses the specified EMR metadatabase instance.</li>
<li>`USER_CUSTOM_META`: The cluster uses a custom metadatabase instance.</li> 
     * @return MetaType The Hive-shared metadatabase type. Valid values:
<li>`EMR_DEFAULT_META`: The cluster creates one by default.</li>
<li>`EMR_EXIST_META`: The cluster uses the specified EMR metadatabase instance.</li>
<li>`USER_CUSTOM_META`: The cluster uses a custom metadatabase instance.</li>
     */
    public String getMetaType() {
        return this.MetaType;
    }

    /**
     * Set The Hive-shared metadatabase type. Valid values:
<li>`EMR_DEFAULT_META`: The cluster creates one by default.</li>
<li>`EMR_EXIST_META`: The cluster uses the specified EMR metadatabase instance.</li>
<li>`USER_CUSTOM_META`: The cluster uses a custom metadatabase instance.</li>
     * @param MetaType The Hive-shared metadatabase type. Valid values:
<li>`EMR_DEFAULT_META`: The cluster creates one by default.</li>
<li>`EMR_EXIST_META`: The cluster uses the specified EMR metadatabase instance.</li>
<li>`USER_CUSTOM_META`: The cluster uses a custom metadatabase instance.</li>
     */
    public void setMetaType(String MetaType) {
        this.MetaType = MetaType;
    }

    /**
     * Get The EMR-MetaDB instance. 
     * @return UnifyMetaInstanceId The EMR-MetaDB instance.
     */
    public String getUnifyMetaInstanceId() {
        return this.UnifyMetaInstanceId;
    }

    /**
     * Set The EMR-MetaDB instance.
     * @param UnifyMetaInstanceId The EMR-MetaDB instance.
     */
    public void setUnifyMetaInstanceId(String UnifyMetaInstanceId) {
        this.UnifyMetaInstanceId = UnifyMetaInstanceId;
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

    }
}

