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

public class CustomMetaInfo extends AbstractModel {

    /**
    * Custom MetaDB JDBC connection, which starts with jdbc:mysql://.
    */
    @SerializedName("MetaDataJdbcUrl")
    @Expose
    private String MetaDataJdbcUrl;

    /**
    * Custom MetaDB username.
    */
    @SerializedName("MetaDataUser")
    @Expose
    private String MetaDataUser;

    /**
    * Custom MetaDB password.
    */
    @SerializedName("MetaDataPass")
    @Expose
    private String MetaDataPass;

    /**
     * Get Custom MetaDB JDBC connection, which starts with jdbc:mysql://. 
     * @return MetaDataJdbcUrl Custom MetaDB JDBC connection, which starts with jdbc:mysql://.
     */
    public String getMetaDataJdbcUrl() {
        return this.MetaDataJdbcUrl;
    }

    /**
     * Set Custom MetaDB JDBC connection, which starts with jdbc:mysql://.
     * @param MetaDataJdbcUrl Custom MetaDB JDBC connection, which starts with jdbc:mysql://.
     */
    public void setMetaDataJdbcUrl(String MetaDataJdbcUrl) {
        this.MetaDataJdbcUrl = MetaDataJdbcUrl;
    }

    /**
     * Get Custom MetaDB username. 
     * @return MetaDataUser Custom MetaDB username.
     */
    public String getMetaDataUser() {
        return this.MetaDataUser;
    }

    /**
     * Set Custom MetaDB username.
     * @param MetaDataUser Custom MetaDB username.
     */
    public void setMetaDataUser(String MetaDataUser) {
        this.MetaDataUser = MetaDataUser;
    }

    /**
     * Get Custom MetaDB password. 
     * @return MetaDataPass Custom MetaDB password.
     */
    public String getMetaDataPass() {
        return this.MetaDataPass;
    }

    /**
     * Set Custom MetaDB password.
     * @param MetaDataPass Custom MetaDB password.
     */
    public void setMetaDataPass(String MetaDataPass) {
        this.MetaDataPass = MetaDataPass;
    }

    public CustomMetaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomMetaInfo(CustomMetaInfo source) {
        if (source.MetaDataJdbcUrl != null) {
            this.MetaDataJdbcUrl = new String(source.MetaDataJdbcUrl);
        }
        if (source.MetaDataUser != null) {
            this.MetaDataUser = new String(source.MetaDataUser);
        }
        if (source.MetaDataPass != null) {
            this.MetaDataPass = new String(source.MetaDataPass);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetaDataJdbcUrl", this.MetaDataJdbcUrl);
        this.setParamSimple(map, prefix + "MetaDataUser", this.MetaDataUser);
        this.setParamSimple(map, prefix + "MetaDataPass", this.MetaDataPass);

    }
}

