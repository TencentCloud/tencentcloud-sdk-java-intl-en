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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableRow extends AbstractModel {

    /**
    * Table row UUID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableRowUuid")
    @Expose
    private String TableRowUuid;

    /**
    * Table row content
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Content")
    @Expose
    private String [] Content;

    /**
     * Get Table row UUID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableRowUuid Table row UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableRowUuid() {
        return this.TableRowUuid;
    }

    /**
     * Set Table row UUID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableRowUuid Table row UUID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableRowUuid(String TableRowUuid) {
        this.TableRowUuid = TableRowUuid;
    }

    /**
     * Get Table row content
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Content Table row content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getContent() {
        return this.Content;
    }

    /**
     * Set Table row content
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Content Table row content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContent(String [] Content) {
        this.Content = Content;
    }

    public TableRow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableRow(TableRow source) {
        if (source.TableRowUuid != null) {
            this.TableRowUuid = new String(source.TableRowUuid);
        }
        if (source.Content != null) {
            this.Content = new String[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new String(source.Content[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableRowUuid", this.TableRowUuid);
        this.setParamArraySimple(map, prefix + "Content.", this.Content);

    }
}

