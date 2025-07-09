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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSqlApisRequest extends AbstractModel {

    /**
    * The IP address of the user link
    */
    @SerializedName("WhiteHost")
    @Expose
    private String WhiteHost;

    /**
    * catalog name
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * Catalog collection
    */
    @SerializedName("Catalogs")
    @Expose
    private String [] Catalogs;

    /**
     * Get The IP address of the user link 
     * @return WhiteHost The IP address of the user link
     */
    public String getWhiteHost() {
        return this.WhiteHost;
    }

    /**
     * Set The IP address of the user link
     * @param WhiteHost The IP address of the user link
     */
    public void setWhiteHost(String WhiteHost) {
        this.WhiteHost = WhiteHost;
    }

    /**
     * Get catalog name 
     * @return Catalog catalog name
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set catalog name
     * @param Catalog catalog name
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get Catalog collection 
     * @return Catalogs Catalog collection
     */
    public String [] getCatalogs() {
        return this.Catalogs;
    }

    /**
     * Set Catalog collection
     * @param Catalogs Catalog collection
     */
    public void setCatalogs(String [] Catalogs) {
        this.Catalogs = Catalogs;
    }

    public DescribeSqlApisRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSqlApisRequest(DescribeSqlApisRequest source) {
        if (source.WhiteHost != null) {
            this.WhiteHost = new String(source.WhiteHost);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Catalogs != null) {
            this.Catalogs = new String[source.Catalogs.length];
            for (int i = 0; i < source.Catalogs.length; i++) {
                this.Catalogs[i] = new String(source.Catalogs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WhiteHost", this.WhiteHost);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamArraySimple(map, prefix + "Catalogs.", this.Catalogs);

    }
}

