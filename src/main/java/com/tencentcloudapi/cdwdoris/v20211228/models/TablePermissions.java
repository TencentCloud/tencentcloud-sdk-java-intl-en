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

public class TablePermissions extends AbstractModel {

    /**
    * Full name of the table
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Table permission
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Permissions")
    @Expose
    private String [] Permissions;

    /**
     * Get Full name of the table
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableName Full name of the table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Full name of the table
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableName Full name of the table
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Table permission
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Permissions Table permission
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set Table permission
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Permissions Table permission
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPermissions(String [] Permissions) {
        this.Permissions = Permissions;
    }

    public TablePermissions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TablePermissions(TablePermissions source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Permissions != null) {
            this.Permissions = new String[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new String(source.Permissions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamArraySimple(map, prefix + "Permissions.", this.Permissions);

    }
}

