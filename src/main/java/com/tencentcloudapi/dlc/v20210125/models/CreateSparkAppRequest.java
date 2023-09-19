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
    * The Spark job name.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * The Spark job type. Valid values: `1` for Spark JAR job and `2` for Spark streaming job.
    */
    @SerializedName("AppType")
    @Expose
    private Long AppType;

    /**
    * The data engine executing the Spark job.
    */
    @SerializedName("DataEngine")
    @Expose
    private String DataEngine;

    /**
    * The path of the Spark job package.
    */
    @SerializedName("AppFile")
    @Expose
    private String AppFile;

    /**
    * The data access policy (CAM role arn).
    */
    @SerializedName("RoleArn")
    @Expose
    private Long RoleArn;

    /**
    * The driver size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
    */
    @SerializedName("AppDriverSize")
    @Expose
    private String AppDriverSize;

    /**
    * The executor size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
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
    * The source of the Spark job package. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
    */
    @SerializedName("IsLocal")
    @Expose
    private String IsLocal;

    /**
    * The main class of the Spark job.
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
    * The source of the dependency JAR packages of the Spark job. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
    */
    @SerializedName("IsLocalJars")
    @Expose
    private String IsLocalJars;

    /**
    * The dependency JAR packages of the Spark JAR job (JAR packages), separated by comma.
    */
    @SerializedName("AppJars")
    @Expose
    private String AppJars;

    /**
    * The source of the dependency files of the Spark job. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
    */
    @SerializedName("IsLocalFiles")
    @Expose
    private String IsLocalFiles;

    /**
    * The dependency files of the Spark job (files other than JAR and ZIP packages) separated by comma.
    */
    @SerializedName("AppFiles")
    @Expose
    private String AppFiles;

    /**
    * The input parameters of the Spark job, separated by comma.
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
    * The maximum number of retries, valid for Spark streaming tasks only.
    */
    @SerializedName("MaxRetries")
    @Expose
    private Long MaxRetries;

    /**
    * The data source name.
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * The source of the PySpark dependencies. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
    */
    @SerializedName("IsLocalPythonFiles")
    @Expose
    private String IsLocalPythonFiles;

    /**
    * The PySpark dependencies (Python files), separated by comma, with .py, .zip, and .egg formats supported.
    */
    @SerializedName("AppPythonFiles")
    @Expose
    private String AppPythonFiles;

    /**
    * The source of the dependency archives of the Spark job. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
    */
    @SerializedName("IsLocalArchives")
    @Expose
    private String IsLocalArchives;

    /**
    * The dependency archives of the Spark job, separated by comma, with tar.gz, .tgz, and .tar formats supported.
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
    * Whether to inherit the task resource configuration from the cluster template. Valid values: `0` (default): No; `1`: Yes.
    */
    @SerializedName("IsInherit")
    @Expose
    private Long IsInherit;

    /**
    * Whether to run the task with the session SQLs. Valid values: `false` for no and `true` for yes.
    */
    @SerializedName("IsSessionStarted")
    @Expose
    private Boolean IsSessionStarted;

    /**
     * Get The Spark job name. 
     * @return AppName The Spark job name.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set The Spark job name.
     * @param AppName The Spark job name.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get The Spark job type. Valid values: `1` for Spark JAR job and `2` for Spark streaming job. 
     * @return AppType The Spark job type. Valid values: `1` for Spark JAR job and `2` for Spark streaming job.
     */
    public Long getAppType() {
        return this.AppType;
    }

    /**
     * Set The Spark job type. Valid values: `1` for Spark JAR job and `2` for Spark streaming job.
     * @param AppType The Spark job type. Valid values: `1` for Spark JAR job and `2` for Spark streaming job.
     */
    public void setAppType(Long AppType) {
        this.AppType = AppType;
    }

    /**
     * Get The data engine executing the Spark job. 
     * @return DataEngine The data engine executing the Spark job.
     */
    public String getDataEngine() {
        return this.DataEngine;
    }

    /**
     * Set The data engine executing the Spark job.
     * @param DataEngine The data engine executing the Spark job.
     */
    public void setDataEngine(String DataEngine) {
        this.DataEngine = DataEngine;
    }

    /**
     * Get The path of the Spark job package. 
     * @return AppFile The path of the Spark job package.
     */
    public String getAppFile() {
        return this.AppFile;
    }

    /**
     * Set The path of the Spark job package.
     * @param AppFile The path of the Spark job package.
     */
    public void setAppFile(String AppFile) {
        this.AppFile = AppFile;
    }

    /**
     * Get The data access policy (CAM role arn). 
     * @return RoleArn The data access policy (CAM role arn).
     */
    public Long getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set The data access policy (CAM role arn).
     * @param RoleArn The data access policy (CAM role arn).
     */
    public void setRoleArn(Long RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get The driver size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs). 
     * @return AppDriverSize The driver size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
     */
    public String getAppDriverSize() {
        return this.AppDriverSize;
    }

    /**
     * Set The driver size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
     * @param AppDriverSize The driver size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
     */
    public void setAppDriverSize(String AppDriverSize) {
        this.AppDriverSize = AppDriverSize;
    }

    /**
     * Get The executor size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs). 
     * @return AppExecutorSize The executor size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
     */
    public String getAppExecutorSize() {
        return this.AppExecutorSize;
    }

    /**
     * Set The executor size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
     * @param AppExecutorSize The executor size. Valid values: `small` (default, 1 CU), `medium` (2 CUs), `large` (4 CUs), and `xlarge` (8 CUs).
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
     * Get The source of the Spark job package. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls). 
     * @return IsLocal The source of the Spark job package. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
     */
    public String getIsLocal() {
        return this.IsLocal;
    }

    /**
     * Set The source of the Spark job package. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
     * @param IsLocal The source of the Spark job package. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
     */
    public void setIsLocal(String IsLocal) {
        this.IsLocal = IsLocal;
    }

    /**
     * Get The main class of the Spark job. 
     * @return MainClass The main class of the Spark job.
     */
    public String getMainClass() {
        return this.MainClass;
    }

    /**
     * Set The main class of the Spark job.
     * @param MainClass The main class of the Spark job.
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
     * Get The source of the dependency JAR packages of the Spark job. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls). 
     * @return IsLocalJars The source of the dependency JAR packages of the Spark job. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
     */
    public String getIsLocalJars() {
        return this.IsLocalJars;
    }

    /**
     * Set The source of the dependency JAR packages of the Spark job. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
     * @param IsLocalJars The source of the dependency JAR packages of the Spark job. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
     */
    public void setIsLocalJars(String IsLocalJars) {
        this.IsLocalJars = IsLocalJars;
    }

    /**
     * Get The dependency JAR packages of the Spark JAR job (JAR packages), separated by comma. 
     * @return AppJars The dependency JAR packages of the Spark JAR job (JAR packages), separated by comma.
     */
    public String getAppJars() {
        return this.AppJars;
    }

    /**
     * Set The dependency JAR packages of the Spark JAR job (JAR packages), separated by comma.
     * @param AppJars The dependency JAR packages of the Spark JAR job (JAR packages), separated by comma.
     */
    public void setAppJars(String AppJars) {
        this.AppJars = AppJars;
    }

    /**
     * Get The source of the dependency files of the Spark job. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls). 
     * @return IsLocalFiles The source of the dependency files of the Spark job. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
     */
    public String getIsLocalFiles() {
        return this.IsLocalFiles;
    }

    /**
     * Set The source of the dependency files of the Spark job. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
     * @param IsLocalFiles The source of the dependency files of the Spark job. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
     */
    public void setIsLocalFiles(String IsLocalFiles) {
        this.IsLocalFiles = IsLocalFiles;
    }

    /**
     * Get The dependency files of the Spark job (files other than JAR and ZIP packages) separated by comma. 
     * @return AppFiles The dependency files of the Spark job (files other than JAR and ZIP packages) separated by comma.
     */
    public String getAppFiles() {
        return this.AppFiles;
    }

    /**
     * Set The dependency files of the Spark job (files other than JAR and ZIP packages) separated by comma.
     * @param AppFiles The dependency files of the Spark job (files other than JAR and ZIP packages) separated by comma.
     */
    public void setAppFiles(String AppFiles) {
        this.AppFiles = AppFiles;
    }

    /**
     * Get The input parameters of the Spark job, separated by comma. 
     * @return CmdArgs The input parameters of the Spark job, separated by comma.
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set The input parameters of the Spark job, separated by comma.
     * @param CmdArgs The input parameters of the Spark job, separated by comma.
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    /**
     * Get The maximum number of retries, valid for Spark streaming tasks only. 
     * @return MaxRetries The maximum number of retries, valid for Spark streaming tasks only.
     */
    public Long getMaxRetries() {
        return this.MaxRetries;
    }

    /**
     * Set The maximum number of retries, valid for Spark streaming tasks only.
     * @param MaxRetries The maximum number of retries, valid for Spark streaming tasks only.
     */
    public void setMaxRetries(Long MaxRetries) {
        this.MaxRetries = MaxRetries;
    }

    /**
     * Get The data source name. 
     * @return DataSource The data source name.
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set The data source name.
     * @param DataSource The data source name.
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get The source of the PySpark dependencies. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls). 
     * @return IsLocalPythonFiles The source of the PySpark dependencies. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
     */
    public String getIsLocalPythonFiles() {
        return this.IsLocalPythonFiles;
    }

    /**
     * Set The source of the PySpark dependencies. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
     * @param IsLocalPythonFiles The source of the PySpark dependencies. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
     */
    public void setIsLocalPythonFiles(String IsLocalPythonFiles) {
        this.IsLocalPythonFiles = IsLocalPythonFiles;
    }

    /**
     * Get The PySpark dependencies (Python files), separated by comma, with .py, .zip, and .egg formats supported. 
     * @return AppPythonFiles The PySpark dependencies (Python files), separated by comma, with .py, .zip, and .egg formats supported.
     */
    public String getAppPythonFiles() {
        return this.AppPythonFiles;
    }

    /**
     * Set The PySpark dependencies (Python files), separated by comma, with .py, .zip, and .egg formats supported.
     * @param AppPythonFiles The PySpark dependencies (Python files), separated by comma, with .py, .zip, and .egg formats supported.
     */
    public void setAppPythonFiles(String AppPythonFiles) {
        this.AppPythonFiles = AppPythonFiles;
    }

    /**
     * Get The source of the dependency archives of the Spark job. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls). 
     * @return IsLocalArchives The source of the dependency archives of the Spark job. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
     */
    public String getIsLocalArchives() {
        return this.IsLocalArchives;
    }

    /**
     * Set The source of the dependency archives of the Spark job. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
     * @param IsLocalArchives The source of the dependency archives of the Spark job. Valid values: `cos` for COS and `lakefs` for the local system (for use in the console, but this method does not support direct API calls).
     */
    public void setIsLocalArchives(String IsLocalArchives) {
        this.IsLocalArchives = IsLocalArchives;
    }

    /**
     * Get The dependency archives of the Spark job, separated by comma, with tar.gz, .tgz, and .tar formats supported. 
     * @return AppArchives The dependency archives of the Spark job, separated by comma, with tar.gz, .tgz, and .tar formats supported.
     */
    public String getAppArchives() {
        return this.AppArchives;
    }

    /**
     * Set The dependency archives of the Spark job, separated by comma, with tar.gz, .tgz, and .tar formats supported.
     * @param AppArchives The dependency archives of the Spark job, separated by comma, with tar.gz, .tgz, and .tar formats supported.
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

    /**
     * Get Whether to inherit the task resource configuration from the cluster template. Valid values: `0` (default): No; `1`: Yes. 
     * @return IsInherit Whether to inherit the task resource configuration from the cluster template. Valid values: `0` (default): No; `1`: Yes.
     */
    public Long getIsInherit() {
        return this.IsInherit;
    }

    /**
     * Set Whether to inherit the task resource configuration from the cluster template. Valid values: `0` (default): No; `1`: Yes.
     * @param IsInherit Whether to inherit the task resource configuration from the cluster template. Valid values: `0` (default): No; `1`: Yes.
     */
    public void setIsInherit(Long IsInherit) {
        this.IsInherit = IsInherit;
    }

    /**
     * Get Whether to run the task with the session SQLs. Valid values: `false` for no and `true` for yes. 
     * @return IsSessionStarted Whether to run the task with the session SQLs. Valid values: `false` for no and `true` for yes.
     */
    public Boolean getIsSessionStarted() {
        return this.IsSessionStarted;
    }

    /**
     * Set Whether to run the task with the session SQLs. Valid values: `false` for no and `true` for yes.
     * @param IsSessionStarted Whether to run the task with the session SQLs. Valid values: `false` for no and `true` for yes.
     */
    public void setIsSessionStarted(Boolean IsSessionStarted) {
        this.IsSessionStarted = IsSessionStarted;
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
        if (source.IsInherit != null) {
            this.IsInherit = new Long(source.IsInherit);
        }
        if (source.IsSessionStarted != null) {
            this.IsSessionStarted = new Boolean(source.IsSessionStarted);
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
        this.setParamSimple(map, prefix + "IsInherit", this.IsInherit);
        this.setParamSimple(map, prefix + "IsSessionStarted", this.IsSessionStarted);

    }
}

