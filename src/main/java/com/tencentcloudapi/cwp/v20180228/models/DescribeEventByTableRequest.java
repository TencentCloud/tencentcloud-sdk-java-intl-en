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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEventByTableRequest extends AbstractModel {

    /**
    * Event table name
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Event table ID
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
     * Get Event table name 
     * @return TableName Event table name
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Event table name
     * @param TableName Event table name
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Event table ID 
     * @return Ids Event table ID
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set Event table ID
     * @param Ids Event table ID
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    public DescribeEventByTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventByTableRequest(DescribeEventByTableRequest source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);

    }
}

