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

public class DropDLCTableRequest extends AbstractModel {

    /**
    * Engine name
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * Database name
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Data table name
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
    * Resource group name
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
     * Get Engine name 
     * @return DataEngineName Engine name
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set Engine name
     * @param DataEngineName Engine name
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

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
     * Get Data table name 
     * @return Name Data table name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Data table name
     * @param Name Data table name
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
     * Get Resource group name 
     * @return ResourceGroupName Resource group name
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set Resource group name
     * @param ResourceGroupName Resource group name
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    public DropDLCTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DropDLCTableRequest(DropDLCTableRequest source) {
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DeleteData != null) {
            this.DeleteData = new Boolean(source.DeleteData);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DeleteData", this.DeleteData);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);

    }
}

