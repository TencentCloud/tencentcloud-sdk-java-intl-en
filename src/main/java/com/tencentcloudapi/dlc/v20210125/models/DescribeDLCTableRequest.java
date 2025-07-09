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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDLCTableRequest extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Data table name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Catalog name
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * Keyword
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * Match rules
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * Table type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Database name 
     * @return DbName Database name
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name
     * @param DbName Database name
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Data table name 
     * @return Name Data table name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Data table name
     * @param Name Data table name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Catalog name 
     * @return Catalog Catalog name
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set Catalog name
     * @param Catalog Catalog name
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get Keyword 
     * @return Keyword Keyword
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set Keyword
     * @param Keyword Keyword
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get Match rules 
     * @return Pattern Match rules
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set Match rules
     * @param Pattern Match rules
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get Table type 
     * @return Type Table type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Table type
     * @param Type Table type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeDLCTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDLCTableRequest(DescribeDLCTableRequest source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

