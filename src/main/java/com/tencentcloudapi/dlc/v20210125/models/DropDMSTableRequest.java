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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DropDMSTableRequest extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Table name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether to delete the data
    */
    @SerializedName("DeleteData")
    @Expose
    private Boolean DeleteData;

    /**
    * Environment properties
    */
    @SerializedName("EnvProps")
    @Expose
    private KVPair EnvProps;

    /**
     * Get Database name 
     * @return DbName Database name
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set Database name
     * @param DbName Database name
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Table name 
     * @return Name Table name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Table name
     * @param Name Table name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether to delete the data 
     * @return DeleteData Whether to delete the data
     */
    public Boolean getDeleteData() {
        return this.DeleteData;
    }

    /**
     * Set Whether to delete the data
     * @param DeleteData Whether to delete the data
     */
    public void setDeleteData(Boolean DeleteData) {
        this.DeleteData = DeleteData;
    }

    /**
     * Get Environment properties 
     * @return EnvProps Environment properties
     */
    public KVPair getEnvProps() {
        return this.EnvProps;
    }

    /**
     * Set Environment properties
     * @param EnvProps Environment properties
     */
    public void setEnvProps(KVPair EnvProps) {
        this.EnvProps = EnvProps;
    }

    public DropDMSTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DropDMSTableRequest(DropDMSTableRequest source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DeleteData != null) {
            this.DeleteData = new Boolean(source.DeleteData);
        }
        if (source.EnvProps != null) {
            this.EnvProps = new KVPair(source.EnvProps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DeleteData", this.DeleteData);
        this.setParamObj(map, prefix + "EnvProps.", this.EnvProps);

    }
}

