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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FieldInfo extends AbstractModel{

    /**
    * Table field name
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * Whether it is a primary key field
    */
    @SerializedName("IsPrimaryKey")
    @Expose
    private String IsPrimaryKey;

    /**
    * Field type
    */
    @SerializedName("FieldType")
    @Expose
    private String FieldType;

    /**
    * Field length
    */
    @SerializedName("FieldSize")
    @Expose
    private Long FieldSize;

    /**
     * Get Table field name 
     * @return FieldName Table field name
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set Table field name
     * @param FieldName Table field name
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get Whether it is a primary key field 
     * @return IsPrimaryKey Whether it is a primary key field
     */
    public String getIsPrimaryKey() {
        return this.IsPrimaryKey;
    }

    /**
     * Set Whether it is a primary key field
     * @param IsPrimaryKey Whether it is a primary key field
     */
    public void setIsPrimaryKey(String IsPrimaryKey) {
        this.IsPrimaryKey = IsPrimaryKey;
    }

    /**
     * Get Field type 
     * @return FieldType Field type
     */
    public String getFieldType() {
        return this.FieldType;
    }

    /**
     * Set Field type
     * @param FieldType Field type
     */
    public void setFieldType(String FieldType) {
        this.FieldType = FieldType;
    }

    /**
     * Get Field length 
     * @return FieldSize Field length
     */
    public Long getFieldSize() {
        return this.FieldSize;
    }

    /**
     * Set Field length
     * @param FieldSize Field length
     */
    public void setFieldSize(Long FieldSize) {
        this.FieldSize = FieldSize;
    }

    public FieldInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FieldInfo(FieldInfo source) {
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.IsPrimaryKey != null) {
            this.IsPrimaryKey = new String(source.IsPrimaryKey);
        }
        if (source.FieldType != null) {
            this.FieldType = new String(source.FieldType);
        }
        if (source.FieldSize != null) {
            this.FieldSize = new Long(source.FieldSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "IsPrimaryKey", this.IsPrimaryKey);
        this.setParamSimple(map, prefix + "FieldType", this.FieldType);
        this.setParamSimple(map, prefix + "FieldSize", this.FieldSize);

    }
}

