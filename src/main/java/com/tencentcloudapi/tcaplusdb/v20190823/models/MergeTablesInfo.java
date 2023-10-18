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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MergeTablesInfo extends AbstractModel {

    /**
    * Information of tables to be merged
    */
    @SerializedName("MergeTables")
    @Expose
    private CompareTablesInfo MergeTables;

    /**
    * Whether to check indexes
    */
    @SerializedName("CheckIndex")
    @Expose
    private Boolean CheckIndex;

    /**
     * Get Information of tables to be merged 
     * @return MergeTables Information of tables to be merged
     */
    public CompareTablesInfo getMergeTables() {
        return this.MergeTables;
    }

    /**
     * Set Information of tables to be merged
     * @param MergeTables Information of tables to be merged
     */
    public void setMergeTables(CompareTablesInfo MergeTables) {
        this.MergeTables = MergeTables;
    }

    /**
     * Get Whether to check indexes 
     * @return CheckIndex Whether to check indexes
     */
    public Boolean getCheckIndex() {
        return this.CheckIndex;
    }

    /**
     * Set Whether to check indexes
     * @param CheckIndex Whether to check indexes
     */
    public void setCheckIndex(Boolean CheckIndex) {
        this.CheckIndex = CheckIndex;
    }

    public MergeTablesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MergeTablesInfo(MergeTablesInfo source) {
        if (source.MergeTables != null) {
            this.MergeTables = new CompareTablesInfo(source.MergeTables);
        }
        if (source.CheckIndex != null) {
            this.CheckIndex = new Boolean(source.CheckIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MergeTables.", this.MergeTables);
        this.setParamSimple(map, prefix + "CheckIndex", this.CheckIndex);

    }
}

