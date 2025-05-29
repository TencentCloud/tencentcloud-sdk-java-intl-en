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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Option extends AbstractModel {

    /**
    * Text.
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * Value.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Number of characters in a file.
    */
    @SerializedName("CharSize")
    @Expose
    private String CharSize;

    /**
    * File type.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
     * Get Text. 
     * @return Text Text.
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set Text.
     * @param Text Text.
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get Value. 
     * @return Value Value.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value.
     * @param Value Value.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Number of characters in a file. 
     * @return CharSize Number of characters in a file.
     */
    public String getCharSize() {
        return this.CharSize;
    }

    /**
     * Set Number of characters in a file.
     * @param CharSize Number of characters in a file.
     */
    public void setCharSize(String CharSize) {
        this.CharSize = CharSize;
    }

    /**
     * Get File type. 
     * @return FileType File type.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type.
     * @param FileType File type.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    public Option() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Option(Option source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.CharSize != null) {
            this.CharSize = new String(source.CharSize);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "CharSize", this.CharSize);
        this.setParamSimple(map, prefix + "FileType", this.FileType);

    }
}

