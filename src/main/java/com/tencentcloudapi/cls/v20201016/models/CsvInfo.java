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

public class CsvInfo extends AbstractModel {

    /**
    * Whether to print `key` on the first row of the CSV file
    */
    @SerializedName("PrintKey")
    @Expose
    private Boolean PrintKey;

    /**
    * Names of keys
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Keys")
    @Expose
    private String [] Keys;

    /**
    * Field delimiter
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * Escape character used to enclose any field delimiter in field content. You can enter only a single quotation mark, double quotation mark, or an empty string.
    */
    @SerializedName("EscapeChar")
    @Expose
    private String EscapeChar;

    /**
    * Content used to populate non-existing fields
    */
    @SerializedName("NonExistingField")
    @Expose
    private String NonExistingField;

    /**
     * Get Whether to print `key` on the first row of the CSV file 
     * @return PrintKey Whether to print `key` on the first row of the CSV file
     */
    public Boolean getPrintKey() {
        return this.PrintKey;
    }

    /**
     * Set Whether to print `key` on the first row of the CSV file
     * @param PrintKey Whether to print `key` on the first row of the CSV file
     */
    public void setPrintKey(Boolean PrintKey) {
        this.PrintKey = PrintKey;
    }

    /**
     * Get Names of keys
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Keys Names of keys
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String [] getKeys() {
        return this.Keys;
    }

    /**
     * Set Names of keys
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Keys Names of keys
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setKeys(String [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get Field delimiter 
     * @return Delimiter Field delimiter
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set Field delimiter
     * @param Delimiter Field delimiter
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get Escape character used to enclose any field delimiter in field content. You can enter only a single quotation mark, double quotation mark, or an empty string. 
     * @return EscapeChar Escape character used to enclose any field delimiter in field content. You can enter only a single quotation mark, double quotation mark, or an empty string.
     */
    public String getEscapeChar() {
        return this.EscapeChar;
    }

    /**
     * Set Escape character used to enclose any field delimiter in field content. You can enter only a single quotation mark, double quotation mark, or an empty string.
     * @param EscapeChar Escape character used to enclose any field delimiter in field content. You can enter only a single quotation mark, double quotation mark, or an empty string.
     */
    public void setEscapeChar(String EscapeChar) {
        this.EscapeChar = EscapeChar;
    }

    /**
     * Get Content used to populate non-existing fields 
     * @return NonExistingField Content used to populate non-existing fields
     */
    public String getNonExistingField() {
        return this.NonExistingField;
    }

    /**
     * Set Content used to populate non-existing fields
     * @param NonExistingField Content used to populate non-existing fields
     */
    public void setNonExistingField(String NonExistingField) {
        this.NonExistingField = NonExistingField;
    }

    public CsvInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CsvInfo(CsvInfo source) {
        if (source.PrintKey != null) {
            this.PrintKey = new Boolean(source.PrintKey);
        }
        if (source.Keys != null) {
            this.Keys = new String[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new String(source.Keys[i]);
            }
        }
        if (source.Delimiter != null) {
            this.Delimiter = new String(source.Delimiter);
        }
        if (source.EscapeChar != null) {
            this.EscapeChar = new String(source.EscapeChar);
        }
        if (source.NonExistingField != null) {
            this.NonExistingField = new String(source.NonExistingField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrintKey", this.PrintKey);
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "Delimiter", this.Delimiter);
        this.setParamSimple(map, prefix + "EscapeChar", this.EscapeChar);
        this.setParamSimple(map, prefix + "NonExistingField", this.NonExistingField);

    }
}

