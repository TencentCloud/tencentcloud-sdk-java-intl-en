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

public class SQLTask extends AbstractModel {

    /**
    * Base64-encrypted SQL statement
    */
    @SerializedName("SQL")
    @Expose
    private String SQL;

    /**
    * Task configuration information
    */
    @SerializedName("Config")
    @Expose
    private KVPair [] Config;

    /**
     * Get Base64-encrypted SQL statement 
     * @return SQL Base64-encrypted SQL statement
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * Set Base64-encrypted SQL statement
     * @param SQL Base64-encrypted SQL statement
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    /**
     * Get Task configuration information 
     * @return Config Task configuration information
     */
    public KVPair [] getConfig() {
        return this.Config;
    }

    /**
     * Set Task configuration information
     * @param Config Task configuration information
     */
    public void setConfig(KVPair [] Config) {
        this.Config = Config;
    }

    public SQLTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SQLTask(SQLTask source) {
        if (source.SQL != null) {
            this.SQL = new String(source.SQL);
        }
        if (source.Config != null) {
            this.Config = new KVPair[source.Config.length];
            for (int i = 0; i < source.Config.length; i++) {
                this.Config[i] = new KVPair(source.Config[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SQL", this.SQL);
        this.setParamArrayObj(map, prefix + "Config.", this.Config);

    }
}

