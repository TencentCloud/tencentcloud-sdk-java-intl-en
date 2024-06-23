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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopTableStatItem extends AbstractModel {

    /**
    * Table Id
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Table nameNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * Number
    */
    @SerializedName("Cnt")
    @Expose
    private Long Cnt;

    /**
     * Get Table Id 
     * @return TableId Table Id
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Table Id
     * @param TableId Table Id
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Table nameNote: This field may return null, indicating that no valid value can be obtained. 
     * @return TableName Table nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set Table nameNote: This field may return null, indicating that no valid value can be obtained.
     * @param TableName Table nameNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get Number 
     * @return Cnt Number
     */
    public Long getCnt() {
        return this.Cnt;
    }

    /**
     * Set Number
     * @param Cnt Number
     */
    public void setCnt(Long Cnt) {
        this.Cnt = Cnt;
    }

    public TopTableStatItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopTableStatItem(TopTableStatItem source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Cnt != null) {
            this.Cnt = new Long(source.Cnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Cnt", this.Cnt);

    }
}

