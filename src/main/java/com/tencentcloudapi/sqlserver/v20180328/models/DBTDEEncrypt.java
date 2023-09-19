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

public class DBTDEEncrypt extends AbstractModel{

    /**
    * 
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * TDE u200dstatus. Valid values: `enable` (enabled), `disable` (disabled).
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
     * Get  
     * @return DBName 
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set 
     * @param DBName 
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get TDE u200dstatus. Valid values: `enable` (enabled), `disable` (disabled). 
     * @return Encryption TDE u200dstatus. Valid values: `enable` (enabled), `disable` (disabled).
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set TDE u200dstatus. Valid values: `enable` (enabled), `disable` (disabled).
     * @param Encryption TDE u200dstatus. Valid values: `enable` (enabled), `disable` (disabled).
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    public DBTDEEncrypt() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBTDEEncrypt(DBTDEEncrypt source) {
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);

    }
}

