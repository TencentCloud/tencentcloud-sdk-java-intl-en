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

public class ModifyDataBaseTuple extends AbstractModel {

    /**
    * 
    */
    @SerializedName("DatabaseTuple")
    @Expose
    private DatabaseTuple DatabaseTuple;

    /**
    * 
    */
    @SerializedName("NewDatabaseTuple")
    @Expose
    private DatabaseTuple NewDatabaseTuple;

    /**
    * 
    */
    @SerializedName("DeleteDataBasesTuple")
    @Expose
    private Boolean DeleteDataBasesTuple;

    /**
     * Get  
     * @return DatabaseTuple 
     */
    public DatabaseTuple getDatabaseTuple() {
        return this.DatabaseTuple;
    }

    /**
     * Set 
     * @param DatabaseTuple 
     */
    public void setDatabaseTuple(DatabaseTuple DatabaseTuple) {
        this.DatabaseTuple = DatabaseTuple;
    }

    /**
     * Get  
     * @return NewDatabaseTuple 
     */
    public DatabaseTuple getNewDatabaseTuple() {
        return this.NewDatabaseTuple;
    }

    /**
     * Set 
     * @param NewDatabaseTuple 
     */
    public void setNewDatabaseTuple(DatabaseTuple NewDatabaseTuple) {
        this.NewDatabaseTuple = NewDatabaseTuple;
    }

    /**
     * Get  
     * @return DeleteDataBasesTuple 
     */
    public Boolean getDeleteDataBasesTuple() {
        return this.DeleteDataBasesTuple;
    }

    /**
     * Set 
     * @param DeleteDataBasesTuple 
     */
    public void setDeleteDataBasesTuple(Boolean DeleteDataBasesTuple) {
        this.DeleteDataBasesTuple = DeleteDataBasesTuple;
    }

    public ModifyDataBaseTuple() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDataBaseTuple(ModifyDataBaseTuple source) {
        if (source.DatabaseTuple != null) {
            this.DatabaseTuple = new DatabaseTuple(source.DatabaseTuple);
        }
        if (source.NewDatabaseTuple != null) {
            this.NewDatabaseTuple = new DatabaseTuple(source.NewDatabaseTuple);
        }
        if (source.DeleteDataBasesTuple != null) {
            this.DeleteDataBasesTuple = new Boolean(source.DeleteDataBasesTuple);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DatabaseTuple.", this.DatabaseTuple);
        this.setParamObj(map, prefix + "NewDatabaseTuple.", this.NewDatabaseTuple);
        this.setParamSimple(map, prefix + "DeleteDataBasesTuple", this.DeleteDataBasesTuple);

    }
}

