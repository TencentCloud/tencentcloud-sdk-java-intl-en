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

public class ClusterConfigsInfoFromEMR extends AbstractModel {

    /**
    * Configuration file's name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Related attribute information corresponding to the configuration files
    */
    @SerializedName("FileConf")
    @Expose
    private String FileConf;

    /**
    * Other attribute information corresponding to the configuration files
    */
    @SerializedName("KeyConf")
    @Expose
    private String KeyConf;

    /**
    * Contents of the configuration files, base64 encoded
    */
    @SerializedName("OriParam")
    @Expose
    private String OriParam;

    /**
    * This is used to indicate whether the current configuration file has been modified without a restart, and reminds the user that a restart is needed.
    */
    @SerializedName("NeedRestart")
    @Expose
    private Long NeedRestart;

    /**
    * Configuration file path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * kv value of a configuration file
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileKeyValues")
    @Expose
    private String FileKeyValues;

    /**
    * kv value of a configuration file
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileKeyValuesNew")
    @Expose
    private ConfigKeyValue [] FileKeyValuesNew;

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
     * Get Related attribute information corresponding to the configuration files 
     * @return FileConf Related attribute information corresponding to the configuration files
     */
    public String getFileConf() {
        return this.FileConf;
    }

    /**
     * Set Related attribute information corresponding to the configuration files
     * @param FileConf Related attribute information corresponding to the configuration files
     */
    public void setFileConf(String FileConf) {
        this.FileConf = FileConf;
    }

    /**
     * Get Other attribute information corresponding to the configuration files 
     * @return KeyConf Other attribute information corresponding to the configuration files
     */
    public String getKeyConf() {
        return this.KeyConf;
    }

    /**
     * Set Other attribute information corresponding to the configuration files
     * @param KeyConf Other attribute information corresponding to the configuration files
     */
    public void setKeyConf(String KeyConf) {
        this.KeyConf = KeyConf;
    }

    /**
     * Get Contents of the configuration files, base64 encoded 
     * @return OriParam Contents of the configuration files, base64 encoded
     */
    public String getOriParam() {
        return this.OriParam;
    }

    /**
     * Set Contents of the configuration files, base64 encoded
     * @param OriParam Contents of the configuration files, base64 encoded
     */
    public void setOriParam(String OriParam) {
        this.OriParam = OriParam;
    }

    /**
     * Get This is used to indicate whether the current configuration file has been modified without a restart, and reminds the user that a restart is needed. 
     * @return NeedRestart This is used to indicate whether the current configuration file has been modified without a restart, and reminds the user that a restart is needed.
     */
    public Long getNeedRestart() {
        return this.NeedRestart;
    }

    /**
     * Set This is used to indicate whether the current configuration file has been modified without a restart, and reminds the user that a restart is needed.
     * @param NeedRestart This is used to indicate whether the current configuration file has been modified without a restart, and reminds the user that a restart is needed.
     */
    public void setNeedRestart(Long NeedRestart) {
        this.NeedRestart = NeedRestart;
    }

    /**
     * Get Configuration file path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FilePath Configuration file path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set Configuration file path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FilePath Configuration file path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get kv value of a configuration file
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileKeyValues kv value of a configuration file
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getFileKeyValues() {
        return this.FileKeyValues;
    }

    /**
     * Set kv value of a configuration file
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileKeyValues kv value of a configuration file
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setFileKeyValues(String FileKeyValues) {
        this.FileKeyValues = FileKeyValues;
    }

    /**
     * Get kv value of a configuration file
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileKeyValuesNew kv value of a configuration file
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ConfigKeyValue [] getFileKeyValuesNew() {
        return this.FileKeyValuesNew;
    }

    /**
     * Set kv value of a configuration file
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileKeyValuesNew kv value of a configuration file
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileKeyValuesNew(ConfigKeyValue [] FileKeyValuesNew) {
        this.FileKeyValuesNew = FileKeyValuesNew;
    }

    public ClusterConfigsInfoFromEMR() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterConfigsInfoFromEMR(ClusterConfigsInfoFromEMR source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileConf != null) {
            this.FileConf = new String(source.FileConf);
        }
        if (source.KeyConf != null) {
            this.KeyConf = new String(source.KeyConf);
        }
        if (source.OriParam != null) {
            this.OriParam = new String(source.OriParam);
        }
        if (source.NeedRestart != null) {
            this.NeedRestart = new Long(source.NeedRestart);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileKeyValues != null) {
            this.FileKeyValues = new String(source.FileKeyValues);
        }
        if (source.FileKeyValuesNew != null) {
            this.FileKeyValuesNew = new ConfigKeyValue[source.FileKeyValuesNew.length];
            for (int i = 0; i < source.FileKeyValuesNew.length; i++) {
                this.FileKeyValuesNew[i] = new ConfigKeyValue(source.FileKeyValuesNew[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileConf", this.FileConf);
        this.setParamSimple(map, prefix + "KeyConf", this.KeyConf);
        this.setParamSimple(map, prefix + "OriParam", this.OriParam);
        this.setParamSimple(map, prefix + "NeedRestart", this.NeedRestart);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileKeyValues", this.FileKeyValues);
        this.setParamArrayObj(map, prefix + "FileKeyValuesNew.", this.FileKeyValuesNew);

    }
}

