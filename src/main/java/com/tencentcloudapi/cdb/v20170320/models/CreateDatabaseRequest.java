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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDatabaseRequest extends AbstractModel {

    /**
    * Instance ID in the format of `cdb-c1nl9rpv`,  which is the same as the one displayed in the TencentDB console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * Character set. Valid values:  `utf8`, `gbk`, `latin1`, `utf8mb4`.
    */
    @SerializedName("CharacterSetName")
    @Expose
    private String CharacterSetName;

    /**
     * Get Instance ID in the format of `cdb-c1nl9rpv`,  which is the same as the one displayed in the TencentDB console. 
     * @return InstanceId Instance ID in the format of `cdb-c1nl9rpv`,  which is the same as the one displayed in the TencentDB console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of `cdb-c1nl9rpv`,  which is the same as the one displayed in the TencentDB console.
     * @param InstanceId Instance ID in the format of `cdb-c1nl9rpv`,  which is the same as the one displayed in the TencentDB console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

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
     * Get Character set. Valid values:  `utf8`, `gbk`, `latin1`, `utf8mb4`. 
     * @return CharacterSetName Character set. Valid values:  `utf8`, `gbk`, `latin1`, `utf8mb4`.
     */
    public String getCharacterSetName() {
        return this.CharacterSetName;
    }

    /**
     * Set Character set. Valid values:  `utf8`, `gbk`, `latin1`, `utf8mb4`.
     * @param CharacterSetName Character set. Valid values:  `utf8`, `gbk`, `latin1`, `utf8mb4`.
     */
    public void setCharacterSetName(String CharacterSetName) {
        this.CharacterSetName = CharacterSetName;
    }

    public CreateDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDatabaseRequest(CreateDatabaseRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DBName != null) {
            this.DBName = new String(source.DBName);
        }
        if (source.CharacterSetName != null) {
            this.CharacterSetName = new String(source.CharacterSetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "CharacterSetName", this.CharacterSetName);

    }
}

