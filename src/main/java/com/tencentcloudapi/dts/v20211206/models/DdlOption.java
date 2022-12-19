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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DdlOption extends AbstractModel{

    /**
    * DDL type, such as database, table, view, and index.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DdlObject")
    @Expose
    private String DdlObject;

    /**
    * DDL value. Valid values: [Create,Drop,Alter] for database <br>[Create,Drop,Alter,Truncate,Rename] for table <br/>[Create,Drop] for view <br/>[Create,Drop] for index
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DdlValue")
    @Expose
    private String [] DdlValue;

    /**
     * Get DDL type, such as database, table, view, and index.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DdlObject DDL type, such as database, table, view, and index.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDdlObject() {
        return this.DdlObject;
    }

    /**
     * Set DDL type, such as database, table, view, and index.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DdlObject DDL type, such as database, table, view, and index.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDdlObject(String DdlObject) {
        this.DdlObject = DdlObject;
    }

    /**
     * Get DDL value. Valid values: [Create,Drop,Alter] for database <br>[Create,Drop,Alter,Truncate,Rename] for table <br/>[Create,Drop] for view <br/>[Create,Drop] for index
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DdlValue DDL value. Valid values: [Create,Drop,Alter] for database <br>[Create,Drop,Alter,Truncate,Rename] for table <br/>[Create,Drop] for view <br/>[Create,Drop] for index
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getDdlValue() {
        return this.DdlValue;
    }

    /**
     * Set DDL value. Valid values: [Create,Drop,Alter] for database <br>[Create,Drop,Alter,Truncate,Rename] for table <br/>[Create,Drop] for view <br/>[Create,Drop] for index
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DdlValue DDL value. Valid values: [Create,Drop,Alter] for database <br>[Create,Drop,Alter,Truncate,Rename] for table <br/>[Create,Drop] for view <br/>[Create,Drop] for index
Note: This field may return null, indicating that no valid values can be obtained.
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

