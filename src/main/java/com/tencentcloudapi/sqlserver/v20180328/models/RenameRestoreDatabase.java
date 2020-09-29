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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenameRestoreDatabase extends AbstractModel{

    /**
    * Database name. If the `OldName` database does not exist, a failure will be returned.
It can be left empty in offline migration tasks.
    */
    @SerializedName("OldName")
    @Expose
    private String OldName;

    /**
    * New database name. If this parameter is left empty, the restored database will be renamed in the default format. If this parameter is left empty in offline migration tasks, the restored database will be named `OldName`. `OldName` and `NewName` cannot be both empty.
    */
    @SerializedName("NewName")
    @Expose
    private String NewName;

    /**
     * Get Database name. If the `OldName` database does not exist, a failure will be returned.
It can be left empty in offline migration tasks. 
     * @return OldName Database name. If the `OldName` database does not exist, a failure will be returned.
It can be left empty in offline migration tasks.
     */
    public String getOldName() {
        return this.OldName;
    }

    /**
     * Set Database name. If the `OldName` database does not exist, a failure will be returned.
It can be left empty in offline migration tasks.
     * @param OldName Database name. If the `OldName` database does not exist, a failure will be returned.
It can be left empty in offline migration tasks.
     */
    public void setOldName(String OldName) {
        this.OldName = OldName;
    }

    /**
     * Get New database name. If this parameter is left empty, the restored database will be renamed in the default format. If this parameter is left empty in offline migration tasks, the restored database will be named `OldName`. `OldName` and `NewName` cannot be both empty. 
     * @return NewName New database name. If this parameter is left empty, the restored database will be renamed in the default format. If this parameter is left empty in offline migration tasks, the restored database will be named `OldName`. `OldName` and `NewName` cannot be both empty.
     */
    public String getNewName() {
        return this.NewName;
    }

    /**
     * Set New database name. If this parameter is left empty, the restored database will be renamed in the default format. If this parameter is left empty in offline migration tasks, the restored database will be named `OldName`. `OldName` and `NewName` cannot be both empty.
     * @param NewName New database name. If this parameter is left empty, the restored database will be renamed in the default format. If this parameter is left empty in offline migration tasks, the restored database will be named `OldName`. `OldName` and `NewName` cannot be both empty.
     */
    public void setNewName(String NewName) {
        this.NewName = NewName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldName", this.OldName);
        this.setParamSimple(map, prefix + "NewName", this.NewName);

    }
}

