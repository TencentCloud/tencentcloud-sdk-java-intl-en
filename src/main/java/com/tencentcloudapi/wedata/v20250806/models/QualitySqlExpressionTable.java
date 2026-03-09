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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualitySqlExpressionTable extends AbstractModel {

    /**
    * sql expression table name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableExpression")
    @Expose
    private String TableExpression;

    /**
    * sql expression field name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ColumnExpression")
    @Expose
    private String [] ColumnExpression;

    /**
     * Get sql expression table name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableExpression sql expression table name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTableExpression() {
        return this.TableExpression;
    }

    /**
     * Set sql expression table name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableExpression sql expression table name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableExpression(String TableExpression) {
        this.TableExpression = TableExpression;
    }

    /**
     * Get sql expression field name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ColumnExpression sql expression field name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getColumnExpression() {
        return this.ColumnExpression;
    }

    /**
     * Set sql expression field name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ColumnExpression sql expression field name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setColumnExpression(String [] ColumnExpression) {
        this.ColumnExpression = ColumnExpression;
    }

    public QualitySqlExpressionTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualitySqlExpressionTable(QualitySqlExpressionTable source) {
        if (source.TableExpression != null) {
            this.TableExpression = new String(source.TableExpression);
        }
        if (source.ColumnExpression != null) {
            this.ColumnExpression = new String[source.ColumnExpression.length];
            for (int i = 0; i < source.ColumnExpression.length; i++) {
                this.ColumnExpression[i] = new String(source.ColumnExpression[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableExpression", this.TableExpression);
        this.setParamArraySimple(map, prefix + "ColumnExpression.", this.ColumnExpression);

    }
}

