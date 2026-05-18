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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreDatabases extends AbstractModel {

    /**
    * DB name.
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * Collection information to be rolled back.
    */
    @SerializedName("Collections")
    @Expose
    private RestoreCollection [] Collections;

    /**
     * Get DB name. 
     * @return Db DB name.
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set DB name.
     * @param Db DB name.
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get Collection information to be rolled back. 
     * @return Collections Collection information to be rolled back.
     */
    public RestoreCollection [] getCollections() {
        return this.Collections;
    }

    /**
     * Set Collection information to be rolled back.
     * @param Collections Collection information to be rolled back.
     */
    public void setCollections(RestoreCollection [] Collections) {
        this.Collections = Collections;
    }

    public RestoreDatabases() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreDatabases(RestoreDatabases source) {
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Collections != null) {
            this.Collections = new RestoreCollection[source.Collections.length];
            for (int i = 0; i < source.Collections.length; i++) {
                this.Collections[i] = new RestoreCollection(source.Collections[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamArrayObj(map, prefix + "Collections.", this.Collections);

    }
}

