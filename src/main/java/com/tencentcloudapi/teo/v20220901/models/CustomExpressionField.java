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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomExpressionField extends AbstractModel {

    /**
    * <p>Custom log field name. Enter 1-100 characters. Allowed characters are letters, digits, and _. It must start with a letter. This name must be unique.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>The value expression of a custom log field. The maximum length of the expression is 4KB. For syntax explanation, see <a href="">Custom Log Field Expression</a>.</p>
    */
    @SerializedName("Expression")
    @Expose
    private String Expression;

    /**
    * <p>Whether to deliver this field. If left blank, it means not to deliver this field.</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>Custom log field name. Enter 1-100 characters. Allowed characters are letters, digits, and _. It must start with a letter. This name must be unique.</p> 
     * @return Name <p>Custom log field name. Enter 1-100 characters. Allowed characters are letters, digits, and _. It must start with a letter. This name must be unique.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Custom log field name. Enter 1-100 characters. Allowed characters are letters, digits, and _. It must start with a letter. This name must be unique.</p>
     * @param Name <p>Custom log field name. Enter 1-100 characters. Allowed characters are letters, digits, and _. It must start with a letter. This name must be unique.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>The value expression of a custom log field. The maximum length of the expression is 4KB. For syntax explanation, see <a href="">Custom Log Field Expression</a>.</p> 
     * @return Expression <p>The value expression of a custom log field. The maximum length of the expression is 4KB. For syntax explanation, see <a href="">Custom Log Field Expression</a>.</p>
     */
    public String getExpression() {
        return this.Expression;
    }

    /**
     * Set <p>The value expression of a custom log field. The maximum length of the expression is 4KB. For syntax explanation, see <a href="">Custom Log Field Expression</a>.</p>
     * @param Expression <p>The value expression of a custom log field. The maximum length of the expression is 4KB. For syntax explanation, see <a href="">Custom Log Field Expression</a>.</p>
     */
    public void setExpression(String Expression) {
        this.Expression = Expression;
    }

    /**
     * Get <p>Whether to deliver this field. If left blank, it means not to deliver this field.</p> 
     * @return Enabled <p>Whether to deliver this field. If left blank, it means not to deliver this field.</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether to deliver this field. If left blank, it means not to deliver this field.</p>
     * @param Enabled <p>Whether to deliver this field. If left blank, it means not to deliver this field.</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public CustomExpressionField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomExpressionField(CustomExpressionField source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Expression != null) {
            this.Expression = new String(source.Expression);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Expression", this.Expression);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

