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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Extraction extends AbstractModel {

    /**
    * JsonPath, which will be `$.` by default if not specified
    */
    @SerializedName("ExtractionInputPath")
    @Expose
    private String ExtractionInputPath;

    /**
    * Valid values: TEXT/JSON
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Only required for `Text`
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TextParams")
    @Expose
    private TextParams TextParams;

    /**
     * Get JsonPath, which will be `$.` by default if not specified 
     * @return ExtractionInputPath JsonPath, which will be `$.` by default if not specified
     */
    public String getExtractionInputPath() {
        return this.ExtractionInputPath;
    }

    /**
     * Set JsonPath, which will be `$.` by default if not specified
     * @param ExtractionInputPath JsonPath, which will be `$.` by default if not specified
     */
    public void setExtractionInputPath(String ExtractionInputPath) {
        this.ExtractionInputPath = ExtractionInputPath;
    }

    /**
     * Get Valid values: TEXT/JSON 
     * @return Format Valid values: TEXT/JSON
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Valid values: TEXT/JSON
     * @param Format Valid values: TEXT/JSON
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Only required for `Text`
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TextParams Only required for `Text`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TextParams getTextParams() {
        return this.TextParams;
    }

    /**
     * Set Only required for `Text`
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TextParams Only required for `Text`
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTextParams(TextParams TextParams) {
        this.TextParams = TextParams;
    }

    public Extraction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Extraction(Extraction source) {
        if (source.ExtractionInputPath != null) {
            this.ExtractionInputPath = new String(source.ExtractionInputPath);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.TextParams != null) {
            this.TextParams = new TextParams(source.TextParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExtractionInputPath", this.ExtractionInputPath);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamObj(map, prefix + "TextParams.", this.TextParams);

    }
}

