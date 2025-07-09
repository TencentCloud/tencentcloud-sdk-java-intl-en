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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InitDCDBInstancesRequest extends AbstractModel {

    /**
    * List of IDs of instances to be initialized. The ID is in the format of `dcdbt-ow728lmc` and can be obtained through the `DescribeDCDBInstances` API.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Parameter list. Valid values: character_set_server (character set; required); lower_case_table_names (table name case sensitivity; required; 0: case-sensitive, 1: case-insensitive); innodb_page_size (InnoDB data page; default size: 16 KB); sync_mode (sync mode; 0: async; 1: strong sync; 2: downgradable strong sync; default value: strong sync).
    */
    @SerializedName("Params")
    @Expose
    private DBParamValue [] Params;

    /**
     * Get List of IDs of instances to be initialized. The ID is in the format of `dcdbt-ow728lmc` and can be obtained through the `DescribeDCDBInstances` API. 
     * @return InstanceIds List of IDs of instances to be initialized. The ID is in the format of `dcdbt-ow728lmc` and can be obtained through the `DescribeDCDBInstances` API.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set List of IDs of instances to be initialized. The ID is in the format of `dcdbt-ow728lmc` and can be obtained through the `DescribeDCDBInstances` API.
     * @param InstanceIds List of IDs of instances to be initialized. The ID is in the format of `dcdbt-ow728lmc` and can be obtained through the `DescribeDCDBInstances` API.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Parameter list. Valid values: character_set_server (character set; required); lower_case_table_names (table name case sensitivity; required; 0: case-sensitive, 1: case-insensitive); innodb_page_size (InnoDB data page; default size: 16 KB); sync_mode (sync mode; 0: async; 1: strong sync; 2: downgradable strong sync; default value: strong sync). 
     * @return Params Parameter list. Valid values: character_set_server (character set; required); lower_case_table_names (table name case sensitivity; required; 0: case-sensitive, 1: case-insensitive); innodb_page_size (InnoDB data page; default size: 16 KB); sync_mode (sync mode; 0: async; 1: strong sync; 2: downgradable strong sync; default value: strong sync).
     */
    public DBParamValue [] getParams() {
        return this.Params;
    }

    /**
     * Set Parameter list. Valid values: character_set_server (character set; required); lower_case_table_names (table name case sensitivity; required; 0: case-sensitive, 1: case-insensitive); innodb_page_size (InnoDB data page; default size: 16 KB); sync_mode (sync mode; 0: async; 1: strong sync; 2: downgradable strong sync; default value: strong sync).
     * @param Params Parameter list. Valid values: character_set_server (character set; required); lower_case_table_names (table name case sensitivity; required; 0: case-sensitive, 1: case-insensitive); innodb_page_size (InnoDB data page; default size: 16 KB); sync_mode (sync mode; 0: async; 1: strong sync; 2: downgradable strong sync; default value: strong sync).
     */
    public void setParams(DBParamValue [] Params) {
        this.Params = Params;
    }

    public InitDCDBInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InitDCDBInstancesRequest(InitDCDBInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Params != null) {
            this.Params = new DBParamValue[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new DBParamValue(source.Params[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);

    }
}

