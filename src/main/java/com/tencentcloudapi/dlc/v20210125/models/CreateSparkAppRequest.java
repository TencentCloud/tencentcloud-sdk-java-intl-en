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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSparkAppRequest extends AbstractModel{

    /**
    * Spark application name
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 1: Spark JAR application; 2: Spark streaming application
    */
    @SerializedName("AppType")
    @Expose
    private Long AppType;

    /**
    * The data engine executing the Spark job
    */
    @SerializedName("DataEngine")
    @Expose
    private String DataEngine;

    /**
    * Execution entry of the Spark application
    */
    @SerializedName("AppFile")
    @Expose
    private String AppFile;

    /**
    * Execution role ID of the Spark job
    */
    @SerializedName("RoleArn")
    @Expose
    private Long RoleArn;

    /**
    * Driver resource specification of the Spark job. Valid values: `small`, `medium`, `large`, `xlarge`.
    */
    @SerializedName("AppDriverSize")
    @Expose
    private String AppDriverSize;

    /**
    * Executor resource specification of the Spark job. Valid values: `small`, `medium`, `large`, `xlarge`.
    */
    @SerializedName("AppExecutorSize")
    @Expose
    private String AppExecutorSize;

    /**
    * Number of Spark job executors
    */
    @SerializedName("AppExecutorNums")
    @Expose
    private Long AppExecutorNums;

    /**
    * This field has been disused. Use the `Datasource` field instead.
    */
    @SerializedName("Eni")
    @Expose
    private String Eni;

    /**
    * Whether it is upload locally. Valid values: `cos`, `lakefs`.
    */
    @SerializedName("IsLocal")
    @Expose
    private String IsLocal;

    /**
    * Main class of the Spark JAR job during execution
    */
    @SerializedName("MainClass")
    @Expose
    private String MainClass;

    /**
    * Spark configurations separated by line break
    */
    @SerializedName("AppConf")
    @Expose
    private String AppConf;

    /**
    * Whether it is upload locally. Valid values: `cos`, `lakefs`.
    */
    @SerializedName("IsLocalJars")
    @Expose
    private String IsLocalJars;

    /**
    * Dependency JAR packages of the Spark JAR job separated by comma
    */
    @SerializedName("AppJars")
    @Expose
    private String AppJars;

    /**
    * Whether it is upload locally. Valid values: `cos`, `lakefs`.
    */
    @SerializedName("IsLocalFiles")
    @Expose
    private String IsLocalFiles;

    /**
    * Dependency resources of the Spark job separated by comma
    */
    @SerializedName("AppFiles")
    @Expose
    private String AppFiles;

    /**
    * Command line parameters of the Spark job
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
    * This parameter takes effect only for Spark flow tasks.
    */
    @SerializedName("MaxRetries")
    @Expose
    private Long MaxRetries;

    /**
    * Data source name
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * PySpark: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
    */
    @SerializedName("IsLocalPythonFiles")
    @Expose
    private String IsLocalPythonFiles;

    /**
    * PySpark: Python dependency, which can be in .py, .zip, or .egg format. Multiple files should be separated by comma.
    */
    @SerializedName("AppPythonFiles")
    @Expose
    private String AppPythonFiles;

    /**
    * Archives: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
    */
    @SerializedName("IsLocalArchives")
    @Expose
    private String IsLocalArchives;

    /**
    * Archives: Dependency resources
    */
    @SerializedName("AppArchives")
    @Expose
    private String AppArchives;

    /**
    * The Spark image version.
    */
    @SerializedName("SparkImage")
    @Expose
    private String SparkImage;

    /**
    * The Spark image version name.
    */
    @SerializedName("SparkImageVersion")
    @Expose
    private String SparkImageVersion;

    /**
    * The specified executor count (max), which defaults to 1. This parameter applies if the "Dynamic" mode is selected. If the "Dynamic" mode is not selected, the executor count is equal to `AppExecutorNums`.
    */
    @SerializedName("AppExecutorMaxNumbers")
    @Expose
    private Long AppExecutorMaxNumbers;

    /**
    * The ID of the associated Data Lake Compute query script.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get Spark application name 
     * @return AppName Spark application name
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Spark application name
     * @param AppName Spark application name
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 1: Spark JAR application; 2: Spark streaming application 
     * @return AppType 1: Spark JAR application; 2: Spark streaming application
     */
    public Long getAppType() {
        return this.AppType;
    }

    /**
     * Set 1: Spark JAR application; 2: Spark streaming application
     * @param AppType 1: Spark JAR application; 2: Spark streaming application
     */
    public void setAppType(Long AppType) {
        this.AppType = AppType;
    }

    /**
     * Get The data engine executing the Spark job 
     * @return DataEngine The data engine executing the Spark job
     */
    public String getDataEngine() {
        return this.DataEngine;
    }

    /**
     * Set The data engine executing the Spark job
     * @param DataEngine The data engine executing the Spark job
     */
    public void setDataEngine(String DataEngine) {
        this.DataEngine = DataEngine;
    }

    /**
     * Get Execution entry of the Spark application 
     * @return AppFile Execution entry of the Spark application
     */
    public String getAppFile() {
        return this.AppFile;
    }

    /**
     * Set Execution entry of the Spark application
     * @param AppFile Execution entry of the Spark application
     */
    public void setAppFile(String AppFile) {
        this.AppFile = AppFile;
    }

    /**
     * Get Execution role ID of the Spark job 
     * @return RoleArn Execution role ID of the Spark job
     */
    public Long getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set Execution role ID of the Spark job
     * @param RoleArn Execution role ID of the Spark job
     */
    public void setRoleArn(Long RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get Driver resource specification of the Spark job. Valid values: `small`, `medium`, `large`, `xlarge`. 
     * @return AppDriverSize Driver resource specification of the Spark job. Valid values: `small`, `medium`, `large`, `xlarge`.
     */
    public String getAppDriverSize() {
        return this.AppDriverSize;
    }

    /**
     * Set Driver resource specification of the Spark job. Valid values: `small`, `medium`, `large`, `xlarge`.
     * @param AppDriverSize Driver resource specification of the Spark job. Valid values: `small`, `medium`, `large`, `xlarge`.
     */
    public void setAppDriverSize(String AppDriverSize) {
        this.AppDriverSize = AppDriverSize;
    }

    /**
     * Get Executor resource specification of the Spark job. Valid values: `small`, `medium`, `large`, `xlarge`. 
     * @return AppExecutorSize Executor resource specification of the Spark job. Valid values: `small`, `medium`, `large`, `xlarge`.
     */
    public String getAppExecutorSize() {
        return this.AppExecutorSize;
    }

    /**
     * Set Executor resource specification of the Spark job. Valid values: `small`, `medium`, `large`, `xlarge`.
     * @param AppExecutorSize Executor resource specification of the Spark job. Valid values: `small`, `medium`, `large`, `xlarge`.
     */
    public void setAppExecutorSize(String AppExecutorSize) {
        this.AppExecutorSize = AppExecutorSize;
    }

    /**
     * Get Number of Spark job executors 
     * @return AppExecutorNums Number of Spark job executors
     */
    public Long getAppExecutorNums() {
        return this.AppExecutorNums;
    }

    /**
     * Set Number of Spark job executors
     * @param AppExecutorNums Number of Spark job executors
     */
    public void setAppExecutorNums(Long AppExecutorNums) {
        this.AppExecutorNums = AppExecutorNums;
    }

    /**
     * Get This field has been disused. Use the `Datasource` field instead. 
     * @return Eni This field has been disused. Use the `Datasource` field instead.
     */
    public String getEni() {
        return this.Eni;
    }

    /**
     * Set This field has been disused. Use the `Datasource` field instead.
     * @param Eni This field has been disused. Use the `Datasource` field instead.
     */
    public void setEni(String Eni) {
        this.Eni = Eni;
    }

    /**
     * Get Whether it is upload locally. Valid values: `cos`, `lakefs`. 
     * @return IsLocal Whether it is upload locally. Valid values: `cos`, `lakefs`.
     */
    public String getIsLocal() {
        return this.IsLocal;
    }

    /**
     * Set Whether it is upload locally. Valid values: `cos`, `lakefs`.
     * @param IsLocal Whether it is upload locally. Valid values: `cos`, `lakefs`.
     */
    public void setIsLocal(String IsLocal) {
        this.IsLocal = IsLocal;
    }

    /**
     * Get Main class of the Spark JAR job during execution 
     * @return MainClass Main class of the Spark JAR job during execution
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set Main class of the Spark JAR job during execution
     * @param MainClass Main class of the Spark JAR job during execution
     */
    public void setMainClass(String MainClass) {
        this.MainClass = MainClass;
    }

    /**
     * Get Spark configurations separated by line break 
     * @return AppConf Spark configurations separated by line break
     */
    public String getAppConf() {
        return this.AppConf;
    }

    /**
     * Set Spark configurations separated by line break
     * @param AppConf Spark configurations separated by line break
     */
    public void setAppConf(String AppConf) {
        this.AppConf = AppConf;
    }

    /**
     * Get Whether it is upload locally. Valid values: `cos`, `lakefs`. 
     * @return IsLocalJars Whether it is upload locally. Valid values: `cos`, `lakefs`.
     */
    public String getIsLocalJars() {
        return this.IsLocalJars;
    }

    /**
     * Set Whether it is upload locally. Valid values: `cos`, `lakefs`.
     * @param IsLocalJars Whether it is upload locally. Valid values: `cos`, `lakefs`.
     */
    public void setIsLocalJars(String IsLocalJars) {
        this.IsLocalJars = IsLocalJars;
    }

    /**
     * Get Dependency JAR packages of the Spark JAR job separated by comma 
     * @return AppJars Dependency JAR packages of the Spark JAR job separated by comma
     */
    public String getAppJars() {
        return this.AppJars;
    }

    /**
     * Set Dependency JAR packages of the Spark JAR job separated by comma
     * @param AppJars Dependency JAR packages of the Spark JAR job separated by comma
     */
    public void setAppJars(String AppJars) {
        this.AppJars = AppJars;
    }

    /**
     * Get Whether it is upload locally. Valid values: `cos`, `lakefs`. 
     * @return IsLocalFiles Whether it is upload locally. Valid values: `cos`, `lakefs`.
     */
    public String getIsLocalFiles() {
        return this.IsLocalFiles;
    }

    /**
     * Set Whether it is upload locally. Valid values: `cos`, `lakefs`.
     * @param IsLocalFiles Whether it is upload locally. Valid values: `cos`, `lakefs`.
     */
    public void setIsLocalFiles(String IsLocalFiles) {
        this.IsLocalFiles = IsLocalFiles;
    }

    /**
     * Get Dependency resources of the Spark job separated by comma 
     * @return AppFiles Dependency resources of the Spark job separated by comma
     */
    public String getAppFiles() {
        return this.AppFiles;
    }

    /**
     * Set Dependency resources of the Spark job separated by comma
     * @param AppFiles Dependency resources of the Spark job separated by comma
     */
    public void setAppFiles(String AppFiles) {
        this.AppFiles = AppFiles;
    }

    /**
     * Get Command line parameters of the Spark job 
     * @return CmdArgs Command line parameters of the Spark job
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set Command line parameters of the Spark job
     * @param CmdArgs Command line parameters of the Spark job
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    /**
     * Get This parameter takes effect only for Spark flow tasks. 
     * @return MaxRetries This parameter takes effect only for Spark flow tasks.
     */
    public Long getMaxRetries() {
        return this.MaxRetries;
    }

    /**
     * Set This parameter takes effect only for Spark flow tasks.
     * @param MaxRetries This parameter takes effect only for Spark flow tasks.
     */
    public void setMaxRetries(Long MaxRetries) {
        this.MaxRetries = MaxRetries;
    }

    /**
     * Get Data source name 
     * @return DataSource Data source name
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set Data source name
     * @param DataSource Data source name
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get PySpark: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs). 
     * @return IsLocalPythonFiles PySpark: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
     */
    public String getIsLocalPythonFiles() {
        return this.IsLocalPythonFiles;
    }

    /**
     * Set PySpark: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
     * @param IsLocalPythonFiles PySpark: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
     */
    public void setIsLocalPythonFiles(String IsLocalPythonFiles) {
        this.IsLocalPythonFiles = IsLocalPythonFiles;
    }

    /**
     * Get PySpark: Python dependency, which can be in .py, .zip, or .egg format. Multiple files should be separated by comma. 
     * @return AppPythonFiles PySpark: Python dependency, which can be in .py, .zip, or .egg format. Multiple files should be separated by comma.
     */
    public String getAppPythonFiles() {
        return this.AppPythonFiles;
    }

    /**
     * Set PySpark: Python dependency, which can be in .py, .zip, or .egg format. Multiple files should be separated by comma.
     * @param AppPythonFiles PySpark: Python dependency, which can be in .py, .zip, or .egg format. Multiple files should be separated by comma.
     */
    public void setAppPythonFiles(String AppPythonFiles) {
        this.AppPythonFiles = AppPythonFiles;
    }

    /**
     * Get Archives: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs). 
     * @return IsLocalArchives Archives: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
     */
    public String getIsLocalArchives() {
        return this.IsLocalArchives;
    }

    /**
     * Set Archives: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
     * @param IsLocalArchives Archives: Dependency upload method. 1: cos; 2: lakefs (this method needs to be used in the console but cannot be called through APIs).
     */
    public void setIsLocalArchives(String IsLocalArchives) {
        this.IsLocalArchives = IsLocalArchives;
    }

    /**
     * Get Archives: Dependency resources 
     * @return AppArchives Archives: Dependency resources
     */
    public String getAppArchives() {
        return this.AppArchives;
    }

    /**
     * Set Archives: Dependency resources
     * @param AppArchives Archives: Dependency resources
     */
    public void setAppArchives(String AppArchives) {
        this.AppArchives = AppArchives;
    }

    /**
     * Get The Spark image version. 
     * @return SparkImage The Spark image version.
     */
    public String getSparkImage() {
        return this.SparkImage;
    }

    /**
     * Set The Spark image version.
     * @param SparkImage The Spark image version.
     */
    public void setSparkImage(String SparkImage) {
        this.SparkImage = SparkImage;
    }

    /**
     * Get The Spark image version name. 
     * @return SparkImageVersion The Spark image version name.
     */
    public String getSparkImageVersion() {
        return this.SparkImageVersion;
    }

    /**
     * Set The Spark image version name.
     * @param SparkImageVersion The Spark image version name.
     */
    public void setSparkImageVersion(String SparkImageVersion) {
        this.SparkImageVersion = SparkImageVersion;
    }

    /**
     * Get The specified executor count (max), which defaults to 1. This parameter applies if the "Dynamic" mode is selected. If the "Dynamic" mode is not selected, the executor count is equal to `AppExecutorNums`. 
     * @return AppExecutorMaxNumbers The specified executor count (max), which defaults to 1. This parameter applies if the "Dynamic" mode is selected. If the "Dynamic" mode is not selected, the executor count is equal to `AppExecutorNums`.
     */
    public Long getAppExecutorMaxNumbers() {
        return this.AppExecutorMaxNumbers;
    }

    /**
     * Set The specified executor count (max), which defaults to 1. This parameter applies if the "Dynamic" mode is selected. If the "Dynamic" mode is not selected, the executor count is equal to `AppExecutorNums`.
     * @param AppExecutorMaxNumbers The specified executor count (max), which defaults to 1. This parameter applies if the "Dynamic" mode is selected. If the "Dynamic" mode is not selected, the executor count is equal to `AppExecutorNums`.
     */
    public void setAppExecutorMaxNumbers(Long AppExecutorMaxNumbers) {
        this.AppExecutorMaxNumbers = AppExecutorMaxNumbers;
    }

    /**
     * Get The ID of the associated Data Lake Compute query script. 
     * @return SessionId The ID of the associated Data Lake Compute query script.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set The ID of the associated Data Lake Compute query script.
     * @param SessionId The ID of the associated Data Lake Compute query script.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public CreateSparkAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSparkAppRequest(CreateSparkAppRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.AppType != null) {
            this.AppType = new Long(source.AppType);
        }
        if (source.DataEngine != null) {
            this.DataEngine = new String(source.DataEngine);
        }
        if (source.AppFile != null) {
            this.AppFile = new String(source.AppFile);
        }
        if (source.RoleArn != null) {
            this.RoleArn = new Long(source.RoleArn);
        }
        if (source.AppDriverSize != null) {
            this.AppDriverSize = new String(source.AppDriverSize);
        }
        if (source.AppExecutorSize != null) {
            this.AppExecutorSize = new String(source.AppExecutorSize);
        }
        if (source.AppExecutorNums != null) {
            this.AppExecutorNums = new Long(source.AppExecutorNums);
        }
        if (source.Eni != null) {
            this.Eni = new String(source.Eni);
        }
        if (source.IsLocal != null) {
            this.IsLocal = new String(source.IsLocal);
        }
        if (source.MainClass != null) {
            this.MainClass = new String(source.MainClass);
        }
        if (source.AppConf != null) {
            this.AppConf = new String(source.AppConf);
        }
        if (source.IsLocalJars != null) {
            this.IsLocalJars = new String(source.IsLocalJars);
        }
        if (source.AppJars != null) {
            this.AppJars = new String(source.AppJars);
        }
        if (source.IsLocalFiles != null) {
            this.IsLocalFiles = new String(source.IsLocalFiles);
        }
        if (source.AppFiles != null) {
            this.AppFiles = new String(source.AppFiles);
        }
        if (source.CmdArgs != null) {
            this.CmdArgs = new String(source.CmdArgs);
        }
        if (source.MaxRetries != null) {
            this.MaxRetries = new Long(source.MaxRetries);
        }
        if (source.DataSource != null) {
            this.DataSource = new String(source.DataSource);
        }
        if (source.IsLocalPythonFiles != null) {
            this.IsLocalPythonFiles = new String(source.IsLocalPythonFiles);
        }
        if (source.AppPythonFiles != null) {
            this.AppPythonFiles = new String(source.AppPythonFiles);
        }
        if (source.IsLocalArchives != null) {
            this.IsLocalArchives = new String(source.IsLocalArchives);
        }
        if (source.AppArchives != null) {
            this.AppArchives = new String(source.AppArchives);
        }
        if (source.SparkImage != null) {
            this.SparkImage = new String(source.SparkImage);
        }
        if (source.SparkImageVersion != null) {
            this.SparkImageVersion = new String(source.SparkImageVersion);
        }
        if (source.AppExecutorMaxNumbers != null) {
            this.AppExecutorMaxNumbers = new Long(source.AppExecutorMaxNumbers);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "DataEngine", this.DataEngine);
        this.setParamSimple(map, prefix + "AppFile", this.AppFile);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "AppDriverSize", this.AppDriverSize);
        this.setParamSimple(map, prefix + "AppExecutorSize", this.AppExecutorSize);
        this.setParamSimple(map, prefix + "AppExecutorNums", this.AppExecutorNums);
        this.setParamSimple(map, prefix + "Eni", this.Eni);
        this.setParamSimple(map, prefix + "IsLocal", this.IsLocal);
        this.setParamSimple(map, prefix + "MainClass", this.MainClass);
        this.setParamSimple(map, prefix + "AppConf", this.AppConf);
        this.setParamSimple(map, prefix + "IsLocalJars", this.IsLocalJars);
        this.setParamSimple(map, prefix + "AppJars", this.AppJars);
        this.setParamSimple(map, prefix + "IsLocalFiles", this.IsLocalFiles);
        this.setParamSimple(map, prefix + "AppFiles", this.AppFiles);
        this.setParamSimple(map, prefix + "CmdArgs", this.CmdArgs);
        this.setParamSimple(map, prefix + "MaxRetries", this.MaxRetries);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "IsLocalPythonFiles", this.IsLocalPythonFiles);
        this.setParamSimple(map, prefix + "AppPythonFiles", this.AppPythonFiles);
        this.setParamSimple(map, prefix + "IsLocalArchives", this.IsLocalArchives);
        this.setParamSimple(map, prefix + "AppArchives", this.AppArchives);
        this.setParamSimple(map, prefix + "SparkImage", this.SparkImage);
        this.setParamSimple(map, prefix + "SparkImageVersion", this.SparkImageVersion);
        this.setParamSimple(map, prefix + "AppExecutorMaxNumbers", this.AppExecutorMaxNumbers);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

