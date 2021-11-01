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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContentInfo extends AbstractModel{

    /**
    * Content format. Valid values: `json`, `csv`
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * CSV format content description
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Csv")
    @Expose
    private CsvInfo Csv;

    /**
    * JSON format content description
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Json")
    @Expose
    private JsonInfo Json;

    /**
     * Get Content format. Valid values: `json`, `csv` 
     * @return Format Content format. Valid values: `json`, `csv`
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Content format. Valid values: `json`, `csv`
     * @param Format Content format. Valid values: `json`, `csv`
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get CSV format content description
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Csv CSV format content description
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public CsvInfo getCsv() {
        return this.Csv;
    }

    /**
     * Set CSV format content description
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Csv CSV format content description
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setCsv(CsvInfo Csv) {
        this.Csv = Csv;
    }

    /**
     * Get JSON format content description
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Json JSON format content description
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public JsonInfo getJson() {
        return this.Json;
    }

    /**
     * Set JSON format content description
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Json JSON format content description
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setJson(JsonInfo Json) {
        this.Json = Json;
    }

    public ContentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentInfo(ContentInfo source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Csv != null) {
            this.Csv = new CsvInfo(source.Csv);
        }
        if (source.Json != null) {
            this.Json = new JsonInfo(source.Json);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamObj(map, prefix + "Csv.", this.Csv);
        this.setParamObj(map, prefix + "Json.", this.Json);

    }
}

