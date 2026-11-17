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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DdlOption extends AbstractModel {

    /**
    * DDL type. For example: database, table, view, and index.
    */
    @SerializedName("DdlObject")
    @Expose
    private String DdlObject;

    /**
    * Specific values of DDL. For Database, it can be [Create, Drop, Alter];<br>for Table, it can be [Create, Drop, Alter, Truncate, Rename];<br>for View, it can be [Create, Drop];<br>for Index, it can be [Create, Drop].
    */
    @SerializedName("DdlValue")
    @Expose
    private String [] DdlValue;

    /**
     * Get DDL type. For example: database, table, view, and index. 
     * @return DdlObject DDL type. For example: database, table, view, and index.
     */
    public String getDdlObject() {
        return this.DdlObject;
    }

    /**
     * Set DDL type. For example: database, table, view, and index.
     * @param DdlObject DDL type. For example: database, table, view, and index.
     */
    public void setDdlObject(String DdlObject) {
        this.DdlObject = DdlObject;
    }

    /**
     * Get Specific values of DDL. For Database, it can be [Create, Drop, Alter];<br>for Table, it can be [Create, Drop, Alter, Truncate, Rename];<br>for View, it can be [Create, Drop];<br>for Index, it can be [Create, Drop]. 
     * @return DdlValue Specific values of DDL. For Database, it can be [Create, Drop, Alter];<br>for Table, it can be [Create, Drop, Alter, Truncate, Rename];<br>for View, it can be [Create, Drop];<br>for Index, it can be [Create, Drop].
     */
    public String [] getDdlValue() {
        return this.DdlValue;
    }

    /**
     * Set Specific values of DDL. For Database, it can be [Create, Drop, Alter];<br>for Table, it can be [Create, Drop, Alter, Truncate, Rename];<br>for View, it can be [Create, Drop];<br>for Index, it can be [Create, Drop].
     * @param DdlValue Specific values of DDL. For Database, it can be [Create, Drop, Alter];<br>for Table, it can be [Create, Drop, Alter, Truncate, Rename];<br>for View, it can be [Create, Drop];<br>for Index, it can be [Create, Drop].
     */
    public void setDdlValue(String [] DdlValue) {
        this.DdlValue = DdlValue;
    }

    public DdlOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DdlOption(DdlOption source) {
        if (source.DdlObject != null) {
            this.DdlObject = new String(source.DdlObject);
        }
        if (source.DdlValue != null) {
            this.DdlValue = new String[source.DdlValue.length];
            for (int i = 0; i < source.DdlValue.length; i++) {
                this.DdlValue[i] = new String(source.DdlValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DdlObject", this.DdlObject);
        this.setParamArraySimple(map, prefix + "DdlValue.", this.DdlValue);

    }
}

