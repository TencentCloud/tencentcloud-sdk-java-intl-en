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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BigKeyInfo extends AbstractModel{

    /**
    * Database
    */
    @SerializedName("DB")
    @Expose
    private Long DB;

    /**
    * Big key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Size
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Data timestamp
    */
    @SerializedName("Updatetime")
    @Expose
    private Long Updatetime;

    /**
     * Get Database 
     * @return DB Database
     */
    public Long getDB() {
        return this.DB;
    }

    /**
     * Set Database
     * @param DB Database
     */
    public void setDB(Long DB) {
        this.DB = DB;
    }

    /**
     * Get Big key 
     * @return Key Big key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Big key
     * @param Key Big key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Type 
     * @return Type Type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type
     * @param Type Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Size 
     * @return Size Size
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Size
     * @param Size Size
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Data timestamp 
     * @return Updatetime Data timestamp
     */
    public Long getUpdatetime() {
        return this.Updatetime;
    }

    /**
     * Set Data timestamp
     * @param Updatetime Data timestamp
     */
    public void setUpdatetime(Long Updatetime) {
        this.Updatetime = Updatetime;
    }

    public BigKeyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BigKeyInfo(BigKeyInfo source) {
        if (source.DB != null) {
            this.DB = new Long(source.DB);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Updatetime != null) {
            this.Updatetime = new Long(source.Updatetime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DB", this.DB);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Updatetime", this.Updatetime);

    }
}

