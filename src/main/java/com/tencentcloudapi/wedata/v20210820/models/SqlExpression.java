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

public class SqlExpression extends AbstractModel {

    /**
    * SQL Expression Table Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableExpressions")
    @Expose
    private SqlExpressionTable [] TableExpressions;

    /**
    * SQL Expression Column Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ParamExpressions")
    @Expose
    private String [] ParamExpressions;

    /**
     * Get SQL Expression Table Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableExpressions SQL Expression Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SqlExpressionTable [] getTableExpressions() {
        return this.TableExpressions;
    }

    /**
     * Set SQL Expression Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableExpressions SQL Expression Table Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableExpressions(SqlExpressionTable [] TableExpressions) {
        this.TableExpressions = TableExpressions;
    }

    /**
     * Get SQL Expression Column Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ParamExpressions SQL Expression Column Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String [] getParamExpressions() {
        return this.ParamExpressions;
    }

    /**
     * Set SQL Expression Column Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ParamExpressions SQL Expression Column Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setParamExpressions(String [] ParamExpressions) {
        this.ParamExpressions = ParamExpressions;
    }

    public SqlExpression() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SqlExpression(SqlExpression source) {
        if (source.TableExpressions != null) {
            this.TableExpressions = new SqlExpressionTable[source.TableExpressions.length];
            for (int i = 0; i < source.TableExpressions.length; i++) {
                this.TableExpressions[i] = new SqlExpressionTable(source.TableExpressions[i]);
            }
        }
        if (source.ParamExpressions != null) {
            this.ParamExpressions = new String[source.ParamExpressions.length];
            for (int i = 0; i < source.ParamExpressions.length; i++) {
                this.ParamExpressions[i] = new String(source.ParamExpressions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TableExpressions.", this.TableExpressions);
        this.setParamArraySimple(map, prefix + "ParamExpressions.", this.ParamExpressions);

    }
}

