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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ValueInfo extends AbstractModel {

    /**
    * Field type. Supported types: long, text, double, json.
Note: The json data type is currently supported by partial users or log topics. If needed, contact us to enable the allowlist.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Separator of fields. Each character represents a separator.
Only symbols, \n\t\r, and escape character \ are supported.
`long` and `double` fields need to be null.
Note: \n\t\r can be directly enclosed in double quotes as the input parameter without escaping. When debugging with API Explorer, use the JSON parameter input method to avoid repeated escaping of \n\t\r.
    */
    @SerializedName("Tokenizer")
    @Expose
    private String Tokenizer;

    /**
    * Whether the analysis feature is enabled for the field
    */
    @SerializedName("SqlFlag")
    @Expose
    private Boolean SqlFlag;

    /**
    * Whether to include node data. Set this parameter to false for the long and double fields.
    */
    @SerializedName("ContainZH")
    @Expose
    private Boolean ContainZH;

    /**
    * field alias
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Enable index only for sub-node. This field is not enabled.
Note: Only json type fields can configure this parameter.
    */
    @SerializedName("OpenIndexForChildOnly")
    @Expose
    private Boolean OpenIndexForChildOnly;

    /**
    * subnode list
Note: Only json type fields can configure this parameter.
    */
    @SerializedName("ChildNode")
    @Expose
    private KeyValueInfo [] ChildNode;

    /**
     * Get Field type. Supported types: long, text, double, json.
Note: The json data type is currently supported by partial users or log topics. If needed, contact us to enable the allowlist. 
     * @return Type Field type. Supported types: long, text, double, json.
Note: The json data type is currently supported by partial users or log topics. If needed, contact us to enable the allowlist.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Field type. Supported types: long, text, double, json.
Note: The json data type is currently supported by partial users or log topics. If needed, contact us to enable the allowlist.
     * @param Type Field type. Supported types: long, text, double, json.
Note: The json data type is currently supported by partial users or log topics. If needed, contact us to enable the allowlist.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Separator of fields. Each character represents a separator.
Only symbols, \n\t\r, and escape character \ are supported.
`long` and `double` fields need to be null.
Note: \n\t\r can be directly enclosed in double quotes as the input parameter without escaping. When debugging with API Explorer, use the JSON parameter input method to avoid repeated escaping of \n\t\r. 
     * @return Tokenizer Separator of fields. Each character represents a separator.
Only symbols, \n\t\r, and escape character \ are supported.
`long` and `double` fields need to be null.
Note: \n\t\r can be directly enclosed in double quotes as the input parameter without escaping. When debugging with API Explorer, use the JSON parameter input method to avoid repeated escaping of \n\t\r.
     */
    public String getTokenizer() {
        return this.Tokenizer;
    }

    /**
     * Set Separator of fields. Each character represents a separator.
Only symbols, \n\t\r, and escape character \ are supported.
`long` and `double` fields need to be null.
Note: \n\t\r can be directly enclosed in double quotes as the input parameter without escaping. When debugging with API Explorer, use the JSON parameter input method to avoid repeated escaping of \n\t\r.
     * @param Tokenizer Separator of fields. Each character represents a separator.
Only symbols, \n\t\r, and escape character \ are supported.
`long` and `double` fields need to be null.
Note: \n\t\r can be directly enclosed in double quotes as the input parameter without escaping. When debugging with API Explorer, use the JSON parameter input method to avoid repeated escaping of \n\t\r.
     */
    public void setTokenizer(String Tokenizer) {
        this.Tokenizer = Tokenizer;
    }

    /**
     * Get Whether the analysis feature is enabled for the field 
     * @return SqlFlag Whether the analysis feature is enabled for the field
     */
    public Boolean getSqlFlag() {
        return this.SqlFlag;
    }

    /**
     * Set Whether the analysis feature is enabled for the field
     * @param SqlFlag Whether the analysis feature is enabled for the field
     */
    public void setSqlFlag(Boolean SqlFlag) {
        this.SqlFlag = SqlFlag;
    }

    /**
     * Get Whether to include node data. Set this parameter to false for the long and double fields. 
     * @return ContainZH Whether to include node data. Set this parameter to false for the long and double fields.
     */
    public Boolean getContainZH() {
        return this.ContainZH;
    }

    /**
     * Set Whether to include node data. Set this parameter to false for the long and double fields.
     * @param ContainZH Whether to include node data. Set this parameter to false for the long and double fields.
     */
    public void setContainZH(Boolean ContainZH) {
        this.ContainZH = ContainZH;
    }

    /**
     * Get field alias 
     * @return Alias field alias
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set field alias
     * @param Alias field alias
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Enable index only for sub-node. This field is not enabled.
Note: Only json type fields can configure this parameter. 
     * @return OpenIndexForChildOnly Enable index only for sub-node. This field is not enabled.
Note: Only json type fields can configure this parameter.
     */
    public Boolean getOpenIndexForChildOnly() {
        return this.OpenIndexForChildOnly;
    }

    /**
     * Set Enable index only for sub-node. This field is not enabled.
Note: Only json type fields can configure this parameter.
     * @param OpenIndexForChildOnly Enable index only for sub-node. This field is not enabled.
Note: Only json type fields can configure this parameter.
     */
    public void setOpenIndexForChildOnly(Boolean OpenIndexForChildOnly) {
        this.OpenIndexForChildOnly = OpenIndexForChildOnly;
    }

    /**
     * Get subnode list
Note: Only json type fields can configure this parameter. 
     * @return ChildNode subnode list
Note: Only json type fields can configure this parameter.
     */
    public KeyValueInfo [] getChildNode() {
        return this.ChildNode;
    }

    /**
     * Set subnode list
Note: Only json type fields can configure this parameter.
     * @param ChildNode subnode list
Note: Only json type fields can configure this parameter.
     */
    public void setChildNode(KeyValueInfo [] ChildNode) {
        this.ChildNode = ChildNode;
    }

    public ValueInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ValueInfo(ValueInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Tokenizer != null) {
            this.Tokenizer = new String(source.Tokenizer);
        }
        if (source.SqlFlag != null) {
            this.SqlFlag = new Boolean(source.SqlFlag);
        }
        if (source.ContainZH != null) {
            this.ContainZH = new Boolean(source.ContainZH);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.OpenIndexForChildOnly != null) {
            this.OpenIndexForChildOnly = new Boolean(source.OpenIndexForChildOnly);
        }
        if (source.ChildNode != null) {
            this.ChildNode = new KeyValueInfo[source.ChildNode.length];
            for (int i = 0; i < source.ChildNode.length; i++) {
                this.ChildNode[i] = new KeyValueInfo(source.ChildNode[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Tokenizer", this.Tokenizer);
        this.setParamSimple(map, prefix + "SqlFlag", this.SqlFlag);
        this.setParamSimple(map, prefix + "ContainZH", this.ContainZH);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "OpenIndexForChildOnly", this.OpenIndexForChildOnly);
        this.setParamArrayObj(map, prefix + "ChildNode.", this.ChildNode);

    }
}

