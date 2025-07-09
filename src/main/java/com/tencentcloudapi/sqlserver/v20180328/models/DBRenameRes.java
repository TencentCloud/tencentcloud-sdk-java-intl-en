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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBRenameRes extends AbstractModel {

    /**
    * Name of the new database
    */
    @SerializedName("NewName")
    @Expose
    private String NewName;

    /**
    * Name of the old database
    */
    @SerializedName("OldName")
    @Expose
    private String OldName;

    /**
     * Get Name of the new database 
     * @return NewName Name of the new database
     */
    public String getNewName() {
        return this.NewName;
    }

    /**
     * Set Name of the new database
     * @param NewName Name of the new database
     */
    public void setNewName(String NewName) {
        this.NewName = NewName;
    }

    /**
     * Get Name of the old database 
     * @return OldName Name of the old database
     */
    public String getOldName() {
        return this.OldName;
    }

    /**
     * Set Name of the old database
     * @param OldName Name of the old database
     */
    public void setOldName(String OldName) {
        this.OldName = OldName;
    }

    public DBRenameRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBRenameRes(DBRenameRes source) {
        if (source.NewName != null) {
            this.NewName = new String(source.NewName);
        }
        if (source.OldName != null) {
            this.OldName = new String(source.OldName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NewName", this.NewName);
        this.setParamSimple(map, prefix + "OldName", this.OldName);

    }
}

