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

public class QualitySqlExpression extends AbstractModel {

    /**
    * sql expression table name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableExpressions")
    @Expose
    private QualitySqlExpressionTable [] TableExpressions;

    /**
    * sql expression field name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ParamExpressions")
    @Expose
    private String [] ParamExpressions;

    /**
    * Add model detection class system template sql placeholder collection.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SystemTemplateExpressions")
    @Expose
    private String [] SystemTemplateExpressions;

    /**
     * Get sql expression table name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableExpressions sql expression table name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public QualitySqlExpressionTable [] getTableExpressions() {
        return this.TableExpressions;
    }

    /**
     * Set sql expression table name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableExpressions sql expression table name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableExpressions(QualitySqlExpressionTable [] TableExpressions) {
        this.TableExpressions = TableExpressions;
    }

    /**
     * Get sql expression field name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ParamExpressions sql expression field name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getParamExpressions() {
        return this.ParamExpressions;
    }

    /**
     * Set sql expression field name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ParamExpressions sql expression field name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParamExpressions(String [] ParamExpressions) {
        this.ParamExpressions = ParamExpressions;
    }

    /**
     * Get Add model detection class system template sql placeholder collection.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SystemTemplateExpressions Add model detection class system template sql placeholder collection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getSystemTemplateExpressions() {
        return this.SystemTemplateExpressions;
    }

    /**
     * Set Add model detection class system template sql placeholder collection.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SystemTemplateExpressions Add model detection class system template sql placeholder collection.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSystemTemplateExpressions(String [] SystemTemplateExpressions) {
        this.SystemTemplateExpressions = SystemTemplateExpressions;
    }

    public QualitySqlExpression() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualitySqlExpression(QualitySqlExpression source) {
        if (source.TableExpressions != null) {
            this.TableExpressions = new QualitySqlExpressionTable[source.TableExpressions.length];
            for (int i = 0; i < source.TableExpressions.length; i++) {
                this.TableExpressions[i] = new QualitySqlExpressionTable(source.TableExpressions[i]);
            }
        }
        if (source.ParamExpressions != null) {
            this.ParamExpressions = new String[source.ParamExpressions.length];
            for (int i = 0; i < source.ParamExpressions.length; i++) {
                this.ParamExpressions[i] = new String(source.ParamExpressions[i]);
            }
        }
        if (source.SystemTemplateExpressions != null) {
            this.SystemTemplateExpressions = new String[source.SystemTemplateExpressions.length];
            for (int i = 0; i < source.SystemTemplateExpressions.length; i++) {
                this.SystemTemplateExpressions[i] = new String(source.SystemTemplateExpressions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TableExpressions.", this.TableExpressions);
        this.setParamArraySimple(map, prefix + "ParamExpressions.", this.ParamExpressions);
        this.setParamArraySimple(map, prefix + "SystemTemplateExpressions.", this.SystemTemplateExpressions);

    }
}

