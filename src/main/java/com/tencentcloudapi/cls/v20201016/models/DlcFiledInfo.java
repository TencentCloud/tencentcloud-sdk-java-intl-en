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

public class DlcFiledInfo extends AbstractModel {

    /**
    * <p>Field name in the cls log</p>
    */
    @SerializedName("ClsField")
    @Expose
    private String ClsField;

    /**
    * <p>Column name of the data lake computing service table</p>
    */
    @SerializedName("DlcField")
    @Expose
    private String DlcField;

    /**
    * <p>Data lake computing service field Type</p><p>Enumeration value:</p><ul><li>int|string|struct: See <a href="https://www.tencentcloud.com/document/product/1342/53778?from_cn_redirect=1#Column">Type definition in DLC Column</a></li></ul>
    */
    @SerializedName("DlcFieldType")
    @Expose
    private String DlcFieldType;

    /**
    * <p>Parsing failure padding field</p>
    */
    @SerializedName("FillField")
    @Expose
    private String FillField;

    /**
    * <p>Whether to disable</p>
    */
    @SerializedName("Disable")
    @Expose
    private Boolean Disable;

    /**
     * Get <p>Field name in the cls log</p> 
     * @return ClsField <p>Field name in the cls log</p>
     */
    public String getClsField() {
        return this.ClsField;
    }

    /**
     * Set <p>Field name in the cls log</p>
     * @param ClsField <p>Field name in the cls log</p>
     */
    public void setClsField(String ClsField) {
        this.ClsField = ClsField;
    }

    /**
     * Get <p>Column name of the data lake computing service table</p> 
     * @return DlcField <p>Column name of the data lake computing service table</p>
     */
    public String getDlcField() {
        return this.DlcField;
    }

    /**
     * Set <p>Column name of the data lake computing service table</p>
     * @param DlcField <p>Column name of the data lake computing service table</p>
     */
    public void setDlcField(String DlcField) {
        this.DlcField = DlcField;
    }

    /**
     * Get <p>Data lake computing service field Type</p><p>Enumeration value:</p><ul><li>int|string|struct: See <a href="https://www.tencentcloud.com/document/product/1342/53778?from_cn_redirect=1#Column">Type definition in DLC Column</a></li></ul> 
     * @return DlcFieldType <p>Data lake computing service field Type</p><p>Enumeration value:</p><ul><li>int|string|struct: See <a href="https://www.tencentcloud.com/document/product/1342/53778?from_cn_redirect=1#Column">Type definition in DLC Column</a></li></ul>
     */
    public String getDlcFieldType() {
        return this.DlcFieldType;
    }

    /**
     * Set <p>Data lake computing service field Type</p><p>Enumeration value:</p><ul><li>int|string|struct: See <a href="https://www.tencentcloud.com/document/product/1342/53778?from_cn_redirect=1#Column">Type definition in DLC Column</a></li></ul>
     * @param DlcFieldType <p>Data lake computing service field Type</p><p>Enumeration value:</p><ul><li>int|string|struct: See <a href="https://www.tencentcloud.com/document/product/1342/53778?from_cn_redirect=1#Column">Type definition in DLC Column</a></li></ul>
     */
    public void setDlcFieldType(String DlcFieldType) {
        this.DlcFieldType = DlcFieldType;
    }

    /**
     * Get <p>Parsing failure padding field</p> 
     * @return FillField <p>Parsing failure padding field</p>
     */
    public String getFillField() {
        return this.FillField;
    }

    /**
     * Set <p>Parsing failure padding field</p>
     * @param FillField <p>Parsing failure padding field</p>
     */
    public void setFillField(String FillField) {
        this.FillField = FillField;
    }

    /**
     * Get <p>Whether to disable</p> 
     * @return Disable <p>Whether to disable</p>
     */
    public Boolean getDisable() {
        return this.Disable;
    }

    /**
     * Set <p>Whether to disable</p>
     * @param Disable <p>Whether to disable</p>
     */
    public void setDisable(Boolean Disable) {
        this.Disable = Disable;
    }

    public DlcFiledInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DlcFiledInfo(DlcFiledInfo source) {
        if (source.ClsField != null) {
            this.ClsField = new String(source.ClsField);
        }
        if (source.DlcField != null) {
            this.DlcField = new String(source.DlcField);
        }
        if (source.DlcFieldType != null) {
            this.DlcFieldType = new String(source.DlcFieldType);
        }
        if (source.FillField != null) {
            this.FillField = new String(source.FillField);
        }
        if (source.Disable != null) {
            this.Disable = new Boolean(source.Disable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClsField", this.ClsField);
        this.setParamSimple(map, prefix + "DlcField", this.DlcField);
        this.setParamSimple(map, prefix + "DlcFieldType", this.DlcFieldType);
        this.setParamSimple(map, prefix + "FillField", this.FillField);
        this.setParamSimple(map, prefix + "Disable", this.Disable);

    }
}

