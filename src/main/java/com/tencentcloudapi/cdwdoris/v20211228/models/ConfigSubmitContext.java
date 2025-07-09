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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigSubmitContext extends AbstractModel {

    /**
    * Configuration file's name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * New Base64-encoded content of the configuration file
    */
    @SerializedName("NewConfValue")
    @Expose
    private String NewConfValue;

    /**
    * Original Base64-encoded content of the configuration file
    */
    @SerializedName("OldConfValue")
    @Expose
    private String OldConfValue;

    /**
    * File path
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
     * Get Configuration file's name 
     * @return FileName Configuration file's name
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Configuration file's name
     * @param FileName Configuration file's name
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get New Base64-encoded content of the configuration file 
     * @return NewConfValue New Base64-encoded content of the configuration file
     */
    public String getNewConfValue() {
        return this.NewConfValue;
    }

    /**
     * Set New Base64-encoded content of the configuration file
     * @param NewConfValue New Base64-encoded content of the configuration file
     */
    public void setNewConfValue(String NewConfValue) {
        this.NewConfValue = NewConfValue;
    }

    /**
     * Get Original Base64-encoded content of the configuration file 
     * @return OldConfValue Original Base64-encoded content of the configuration file
     */
    public String getOldConfValue() {
        return this.OldConfValue;
    }

    /**
     * Set Original Base64-encoded content of the configuration file
     * @param OldConfValue Original Base64-encoded content of the configuration file
     */
    public void setOldConfValue(String OldConfValue) {
        this.OldConfValue = OldConfValue;
    }

    /**
     * Get File path 
     * @return FilePath File path
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set File path
     * @param FilePath File path
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    public ConfigSubmitContext() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigSubmitContext(ConfigSubmitContext source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.NewConfValue != null) {
            this.NewConfValue = new String(source.NewConfValue);
        }
        if (source.OldConfValue != null) {
            this.OldConfValue = new String(source.OldConfValue);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "NewConfValue", this.NewConfValue);
        this.setParamSimple(map, prefix + "OldConfValue", this.OldConfValue);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);

    }
}

