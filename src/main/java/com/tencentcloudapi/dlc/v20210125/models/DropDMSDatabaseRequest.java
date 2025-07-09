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

public class DropDMSDatabaseRequest extends AbstractModel {

    /**
    * Database name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether to delete the data.
    */
    @SerializedName("DeleteData")
    @Expose
    private Boolean DeleteData;

    /**
    * Whether to use cascade delete.
    */
    @SerializedName("Cascade")
    @Expose
    private Boolean Cascade;

    /**
     * Get Database name 
     * @return Name Database name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Database name
     * @param Name Database name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether to delete the data. 
     * @return DeleteData Whether to delete the data.
     */
    public Boolean getDeleteData() {
        return this.DeleteData;
    }

    /**
     * Set Whether to delete the data.
     * @param DeleteData Whether to delete the data.
     */
    public void setDeleteData(Boolean DeleteData) {
        this.DeleteData = DeleteData;
    }

    /**
     * Get Whether to use cascade delete. 
     * @return Cascade Whether to use cascade delete.
     */
    public Boolean getCascade() {
        return this.Cascade;
    }

    /**
     * Set Whether to use cascade delete.
     * @param Cascade Whether to use cascade delete.
     */
    public void setCascade(Boolean Cascade) {
        this.Cascade = Cascade;
    }

    public DropDMSDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DropDMSDatabaseRequest(DropDMSDatabaseRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DeleteData != null) {
            this.DeleteData = new Boolean(source.DeleteData);
        }
        if (source.Cascade != null) {
            this.Cascade = new Boolean(source.Cascade);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DeleteData", this.DeleteData);
        this.setParamSimple(map, prefix + "Cascade", this.Cascade);

    }
}

