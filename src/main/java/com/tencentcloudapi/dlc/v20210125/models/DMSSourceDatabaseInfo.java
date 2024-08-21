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

public class DMSSourceDatabaseInfo extends AbstractModel {

    /**
    * Source database name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceDatabaseName")
    @Expose
    private String SourceDatabaseName;

    /**
    * Array of table names in the source database
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceTableNameList")
    @Expose
    private String [] SourceTableNameList;

    /**
     * Get Source database name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceDatabaseName Source database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceDatabaseName() {
        return this.SourceDatabaseName;
    }

    /**
     * Set Source database name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceDatabaseName Source database name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceDatabaseName(String SourceDatabaseName) {
        this.SourceDatabaseName = SourceDatabaseName;
    }

    /**
     * Get Array of table names in the source database
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceTableNameList Array of table names in the source database
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSourceTableNameList() {
        return this.SourceTableNameList;
    }

    /**
     * Set Array of table names in the source database
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceTableNameList Array of table names in the source database
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceTableNameList(String [] SourceTableNameList) {
        this.SourceTableNameList = SourceTableNameList;
    }

    public DMSSourceDatabaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DMSSourceDatabaseInfo(DMSSourceDatabaseInfo source) {
        if (source.SourceDatabaseName != null) {
            this.SourceDatabaseName = new String(source.SourceDatabaseName);
        }
        if (source.SourceTableNameList != null) {
            this.SourceTableNameList = new String[source.SourceTableNameList.length];
            for (int i = 0; i < source.SourceTableNameList.length; i++) {
                this.SourceTableNameList[i] = new String(source.SourceTableNameList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceDatabaseName", this.SourceDatabaseName);
        this.setParamArraySimple(map, prefix + "SourceTableNameList.", this.SourceTableNameList);

    }
}

