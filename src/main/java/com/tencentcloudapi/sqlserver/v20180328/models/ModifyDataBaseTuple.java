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
    * Subscription Relationship to be Modified
    */
    @SerializedName("DatabaseTuple")
    @Expose
    private DatabaseTuple DatabaseTuple;

    /**
    * Modified subscription relationship. Takes effect when DeleteDataBasesTuple is false
    */
    @SerializedName("NewDatabaseTuple")
    @Expose
    private DatabaseTuple NewDatabaseTuple;

    /**
    * Whether to delete the subscription relationship. When this option is true, NewDatabaseTuple is invalid
    */
    @SerializedName("DeleteDataBasesTuple")
    @Expose
    private Boolean DeleteDataBasesTuple;

    /**
     * Get Subscription Relationship to be Modified 
     * @return DatabaseTuple Subscription Relationship to be Modified
     */
    public DatabaseTuple getDatabaseTuple() {
        return this.DatabaseTuple;
    }

    /**
     * Set Subscription Relationship to be Modified
     * @param DatabaseTuple Subscription Relationship to be Modified
     */
    public void setDatabaseTuple(DatabaseTuple DatabaseTuple) {
        this.DatabaseTuple = DatabaseTuple;
    }

    /**
     * Get Modified subscription relationship. Takes effect when DeleteDataBasesTuple is false 
     * @return NewDatabaseTuple Modified subscription relationship. Takes effect when DeleteDataBasesTuple is false
     */
    public DatabaseTuple getNewDatabaseTuple() {
        return this.NewDatabaseTuple;
    }

    /**
     * Set Modified subscription relationship. Takes effect when DeleteDataBasesTuple is false
     * @param NewDatabaseTuple Modified subscription relationship. Takes effect when DeleteDataBasesTuple is false
     */
    public void setNewDatabaseTuple(DatabaseTuple NewDatabaseTuple) {
        this.NewDatabaseTuple = NewDatabaseTuple;
    }

    /**
     * Get Whether to delete the subscription relationship. When this option is true, NewDatabaseTuple is invalid 
     * @return DeleteDataBasesTuple Whether to delete the subscription relationship. When this option is true, NewDatabaseTuple is invalid
     */
    public Boolean getDeleteDataBasesTuple() {
        return this.DeleteDataBasesTuple;
    }

    /**
     * Set Whether to delete the subscription relationship. When this option is true, NewDatabaseTuple is invalid
     * @param DeleteDataBasesTuple Whether to delete the subscription relationship. When this option is true, NewDatabaseTuple is invalid
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

