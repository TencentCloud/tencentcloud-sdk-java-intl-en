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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SchemaDetail extends AbstractModel {

    /**
    * Column
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnKey")
    @Expose
    private String ColumnKey;

    /**
    * DescriptionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * NameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * TypeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Column
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnKey Column
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getColumnKey() {
        return this.ColumnKey;
    }

    /**
     * Set Column
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnKey Column
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnKey(String ColumnKey) {
        this.ColumnKey = ColumnKey;
    }

    /**
     * Get DescriptionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Description DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     * @param Description DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get NameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Name NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set NameNote: This field may return null, indicating that no valid value can be obtained.
     * @param Name NameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get TypeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Type TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set TypeNote: This field may return null, indicating that no valid value can be obtained.
     * @param Type TypeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public SchemaDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchemaDetail(SchemaDetail source) {
        if (source.ColumnKey != null) {
            this.ColumnKey = new String(source.ColumnKey);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ColumnKey", this.ColumnKey);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

