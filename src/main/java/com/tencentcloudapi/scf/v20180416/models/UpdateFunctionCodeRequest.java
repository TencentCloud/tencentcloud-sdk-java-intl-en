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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateFunctionCodeRequest extends AbstractModel{

    /**
    * Function handler name, which is in the `file name.function name` form. Use a period (.) to separate a file name and function name. The file name and function name must start and end with letters and contain 2-60 characters, including letters, digits, underscores (_), and hyphens (-).
    */
    @SerializedName("Handler")
    @Expose
    private String Handler;

    /**
    * Name of the function to be modified
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * COS bucket name
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * COS object path
    */
    @SerializedName("CosObjectName")
    @Expose
    private String CosObjectName;

    /**
    * It contains a function code file and its dependencies in the ZIP format. When you use this API, the ZIP file needs to be encoded with Base64. Up to 20 MB is supported.
    */
    @SerializedName("ZipFile")
    @Expose
    private String ZipFile;

    /**
    * Function namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * COS region. Note: Beijing includes ap-beijing and ap-beijing-1.
    */
    @SerializedName("CosBucketRegion")
    @Expose
    private String CosBucketRegion;

    /**
    * Function environment
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * It specifies whether to synchronously release a new version during the update. The default value is `FALSE`, indicating not to release a new version.
    */
    @SerializedName("Publish")
    @Expose
    private String Publish;

    /**
    * Function code
    */
    @SerializedName("Code")
    @Expose
    private Code Code;

    /**
    * Source mode of code. Valid values: `ZipFile`, `Cos`, `Inline`, `TempCos` and `Git`. This field must be specified if the source is Git
    */
    @SerializedName("CodeSource")
    @Expose
    private String CodeSource;

    /**
     * Get Function handler name, which is in the `file name.function name` form. Use a period (.) to separate a file name and function name. The file name and function name must start and end with letters and contain 2-60 characters, including letters, digits, underscores (_), and hyphens (-). 
     * @return Handler Function handler name, which is in the `file name.function name` form. Use a period (.) to separate a file name and function name. The file name and function name must start and end with letters and contain 2-60 characters, including letters, digits, underscores (_), and hyphens (-).
     */
    public String getHandler() {
        return this.Handler;
    }

    /**
     * Set Function handler name, which is in the `file name.function name` form. Use a period (.) to separate a file name and function name. The file name and function name must start and end with letters and contain 2-60 characters, including letters, digits, underscores (_), and hyphens (-).
     * @param Handler Function handler name, which is in the `file name.function name` form. Use a period (.) to separate a file name and function name. The file name and function name must start and end with letters and contain 2-60 characters, including letters, digits, underscores (_), and hyphens (-).
     */
    public void setHandler(String Handler) {
        this.Handler = Handler;
    }

    /**
     * Get Name of the function to be modified 
     * @return FunctionName Name of the function to be modified
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Name of the function to be modified
     * @param FunctionName Name of the function to be modified
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get COS bucket name 
     * @return CosBucketName COS bucket name
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set COS bucket name
     * @param CosBucketName COS bucket name
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get COS object path 
     * @return CosObjectName COS object path
     */
    public String getCosObjectName() {
        return this.CosObjectName;
    }

    /**
     * Set COS object path
     * @param CosObjectName COS object path
     */
    public void setCosObjectName(String CosObjectName) {
        this.CosObjectName = CosObjectName;
    }

    /**
     * Get It contains a function code file and its dependencies in the ZIP format. When you use this API, the ZIP file needs to be encoded with Base64. Up to 20 MB is supported. 
     * @return ZipFile It contains a function code file and its dependencies in the ZIP format. When you use this API, the ZIP file needs to be encoded with Base64. Up to 20 MB is supported.
     */
    public String getZipFile() {
        return this.ZipFile;
    }

    /**
     * Set It contains a function code file and its dependencies in the ZIP format. When you use this API, the ZIP file needs to be encoded with Base64. Up to 20 MB is supported.
     * @param ZipFile It contains a function code file and its dependencies in the ZIP format. When you use this API, the ZIP file needs to be encoded with Base64. Up to 20 MB is supported.
     */
    public void setZipFile(String ZipFile) {
        this.ZipFile = ZipFile;
    }

    /**
     * Get Function namespace 
     * @return Namespace Function namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Function namespace
     * @param Namespace Function namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get COS region. Note: Beijing includes ap-beijing and ap-beijing-1. 
     * @return CosBucketRegion COS region. Note: Beijing includes ap-beijing and ap-beijing-1.
     */
    public String getCosBucketRegion() {
        return this.CosBucketRegion;
    }

    /**
     * Set COS region. Note: Beijing includes ap-beijing and ap-beijing-1.
     * @param CosBucketRegion COS region. Note: Beijing includes ap-beijing and ap-beijing-1.
     */
    public void setCosBucketRegion(String CosBucketRegion) {
        this.CosBucketRegion = CosBucketRegion;
    }

    /**
     * Get Function environment 
     * @return EnvId Function environment
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set Function environment
     * @param EnvId Function environment
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get It specifies whether to synchronously release a new version during the update. The default value is `FALSE`, indicating not to release a new version. 
     * @return Publish It specifies whether to synchronously release a new version during the update. The default value is `FALSE`, indicating not to release a new version.
     */
    public String getPublish() {
        return this.Publish;
    }

    /**
     * Set It specifies whether to synchronously release a new version during the update. The default value is `FALSE`, indicating not to release a new version.
     * @param Publish It specifies whether to synchronously release a new version during the update. The default value is `FALSE`, indicating not to release a new version.
     */
    public void setPublish(String Publish) {
        this.Publish = Publish;
    }

    /**
     * Get Function code 
     * @return Code Function code
     */
    public Code getCode() {
        return this.Code;
    }

    /**
     * Set Function code
     * @param Code Function code
     */
    public void setCode(Code Code) {
        this.Code = Code;
    }

    /**
     * Get Source mode of code. Valid values: `ZipFile`, `Cos`, `Inline`, `TempCos` and `Git`. This field must be specified if the source is Git 
     * @return CodeSource Source mode of code. Valid values: `ZipFile`, `Cos`, `Inline`, `TempCos` and `Git`. This field must be specified if the source is Git
     */
    public String getCodeSource() {
        return this.CodeSource;
    }

    /**
     * Set Source mode of code. Valid values: `ZipFile`, `Cos`, `Inline`, `TempCos` and `Git`. This field must be specified if the source is Git
     * @param CodeSource Source mode of code. Valid values: `ZipFile`, `Cos`, `Inline`, `TempCos` and `Git`. This field must be specified if the source is Git
     */
    public void setCodeSource(String CodeSource) {
        this.CodeSource = CodeSource;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Handler", this.Handler);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosObjectName", this.CosObjectName);
        this.setParamSimple(map, prefix + "ZipFile", this.ZipFile);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "CosBucketRegion", this.CosBucketRegion);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Publish", this.Publish);
        this.setParamObj(map, prefix + "Code.", this.Code);
        this.setParamSimple(map, prefix + "CodeSource", this.CodeSource);

    }
}

