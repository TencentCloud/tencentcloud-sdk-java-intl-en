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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsistencyParams extends AbstractModel{

    /**
    * Data content check parameter, which refers to the proportion of the rows selected for data comparison in all the rows of the table. Value: an integer between 1 and 100.
    */
    @SerializedName("SelectRowsPerTable")
    @Expose
    private Long SelectRowsPerTable;

    /**
    * Data content check parameter, which refers to the proportion of the tables selected for data detection in all the tables. Value: an integer between 1 and 100.
    */
    @SerializedName("TablesSelectAll")
    @Expose
    private Long TablesSelectAll;

    /**
    * Data quantity check parameter, which checks whether the numbers of rows are identical. It refers to the proportion of the tables selected for quantity check in all the tables. Value: an integer between 1 and 100.
    */
    @SerializedName("TablesSelectCount")
    @Expose
    private Long TablesSelectCount;

    /**
     * Get Data content check parameter, which refers to the proportion of the rows selected for data comparison in all the rows of the table. Value: an integer between 1 and 100. 
     * @return SelectRowsPerTable Data content check parameter, which refers to the proportion of the rows selected for data comparison in all the rows of the table. Value: an integer between 1 and 100.
     */
    public Long getSelectRowsPerTable() {
        return this.SelectRowsPerTable;
    }

    /**
     * Set Data content check parameter, which refers to the proportion of the rows selected for data comparison in all the rows of the table. Value: an integer between 1 and 100.
     * @param SelectRowsPerTable Data content check parameter, which refers to the proportion of the rows selected for data comparison in all the rows of the table. Value: an integer between 1 and 100.
     */
    public void setSelectRowsPerTable(Long SelectRowsPerTable) {
        this.SelectRowsPerTable = SelectRowsPerTable;
    }

    /**
     * Get Data content check parameter, which refers to the proportion of the tables selected for data detection in all the tables. Value: an integer between 1 and 100. 
     * @return TablesSelectAll Data content check parameter, which refers to the proportion of the tables selected for data detection in all the tables. Value: an integer between 1 and 100.
     */
    public Long getTablesSelectAll() {
        return this.TablesSelectAll;
    }

    /**
     * Set Data content check parameter, which refers to the proportion of the tables selected for data detection in all the tables. Value: an integer between 1 and 100.
     * @param TablesSelectAll Data content check parameter, which refers to the proportion of the tables selected for data detection in all the tables. Value: an integer between 1 and 100.
     */
    public void setTablesSelectAll(Long TablesSelectAll) {
        this.TablesSelectAll = TablesSelectAll;
    }

    /**
     * Get Data quantity check parameter, which checks whether the numbers of rows are identical. It refers to the proportion of the tables selected for quantity check in all the tables. Value: an integer between 1 and 100. 
     * @return TablesSelectCount Data quantity check parameter, which checks whether the numbers of rows are identical. It refers to the proportion of the tables selected for quantity check in all the tables. Value: an integer between 1 and 100.
     */
    public Long getTablesSelectCount() {
        return this.TablesSelectCount;
    }

    /**
     * Set Data quantity check parameter, which checks whether the numbers of rows are identical. It refers to the proportion of the tables selected for quantity check in all the tables. Value: an integer between 1 and 100.
     * @param TablesSelectCount Data quantity check parameter, which checks whether the numbers of rows are identical. It refers to the proportion of the tables selected for quantity check in all the tables. Value: an integer between 1 and 100.
     */
    public void setTablesSelectCount(Long TablesSelectCount) {
        this.TablesSelectCount = TablesSelectCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SelectRowsPerTable", this.SelectRowsPerTable);
        this.setParamSimple(map, prefix + "TablesSelectAll", this.TablesSelectAll);
        this.setParamSimple(map, prefix + "TablesSelectCount", this.TablesSelectCount);

    }
}

