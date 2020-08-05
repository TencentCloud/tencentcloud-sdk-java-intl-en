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

public class CreateFunctionRequest extends AbstractModel{

    /**
    * Name of the new function. The name can contain 2 to 60 characters, including English letters, digits, hyphens (-), and underscores (_). The name must start with a letter and cannot end with a hyphen or underscore.
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Function code. Note: You cannot specify `Cos` and `ZipFile` at the same time.
    */
    @SerializedName("Code")
    @Expose
    private Code Code;

    /**
    * Name of the handler, which is in the 'file name.handler name' form. Use periods (.) to separate a file name and function name. The file name and function name must start and end with a letter and can contain 2 to 60 characters, including letters, digits, hyphens (-), and underscores (_).
    */
    @SerializedName("Handler")
    @Expose
    private String Handler;

    /**
    * Function description. It can contain up to 1,000 characters including letters, digits, spaces, commas (,), periods (.), and Chinese characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Memory size available for function during execution. Default value: 128 MB. Value range: 64 or 128-3072 MB in increments of 128 MB
    */
    @SerializedName("MemorySize")
    @Expose
    private Long MemorySize;

    /**
    * Maximum execution duration of function in seconds. Value range: 1-900 seconds. Default value: 3 seconds
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Function environment variable
    */
    @SerializedName("Environment")
    @Expose
    private Environment Environment;

    /**
    * Function runtime environment. Valid values: Python2.7, Python3.6, Nodejs6.10, Nodejs8.9, Nodejs10.15, Nodejs12.16, PHP5, PHP7, Golang1 and Java8. Default value: Python2.7
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * Function VPC configuration
    */
    @SerializedName("VpcConfig")
    @Expose
    private VpcConfig VpcConfig;

    /**
    * Function namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Role bound to the function
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * CLS Logset ID to which the function logs are shipped
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * CLS Topic ID to which the function logs are shipped
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * Function type. The default value is `Event`. Enter `Event` if you need to create a trigger function. Enter `HTTP` if you need to create an HTTP function service.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Code source, including ZipFile, Cos, Demo, TempCos, and Git. This field is required if the source is Git.
    */
    @SerializedName("CodeSource")
    @Expose
    private String CodeSource;

    /**
    * List of layer versions to be associate with the function. Layers will be overwritten sequentially in the order in the list.
    */
    @SerializedName("Layers")
    @Expose
    private LayerVersionSimple [] Layers;

    /**
    * Dead letter queue parameter
    */
    @SerializedName("DeadLetterConfig")
    @Expose
    private DeadLetterConfig DeadLetterConfig;

    /**
    * Public network access configuration
    */
    @SerializedName("PublicNetConfig")
    @Expose
    private PublicNetConfigIn PublicNetConfig;

    /**
    * File system configuration parameter, which is used for the function to mount the file system
    */
    @SerializedName("CfsConfig")
    @Expose
    private CfsConfig CfsConfig;

    /**
     * Get Name of the new function. The name can contain 2 to 60 characters, including English letters, digits, hyphens (-), and underscores (_). The name must start with a letter and cannot end with a hyphen or underscore. 
     * @return FunctionName Name of the new function. The name can contain 2 to 60 characters, including English letters, digits, hyphens (-), and underscores (_). The name must start with a letter and cannot end with a hyphen or underscore.
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Name of the new function. The name can contain 2 to 60 characters, including English letters, digits, hyphens (-), and underscores (_). The name must start with a letter and cannot end with a hyphen or underscore.
     * @param FunctionName Name of the new function. The name can contain 2 to 60 characters, including English letters, digits, hyphens (-), and underscores (_). The name must start with a letter and cannot end with a hyphen or underscore.
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Function code. Note: You cannot specify `Cos` and `ZipFile` at the same time. 
     * @return Code Function code. Note: You cannot specify `Cos` and `ZipFile` at the same time.
     */
    public Code getCode() {
        return this.Code;
    }

    /**
     * Set Function code. Note: You cannot specify `Cos` and `ZipFile` at the same time.
     * @param Code Function code. Note: You cannot specify `Cos` and `ZipFile` at the same time.
     */
    public void setCode(Code Code) {
        this.Code = Code;
    }

    /**
     * Get Name of the handler, which is in the 'file name.handler name' form. Use periods (.) to separate a file name and function name. The file name and function name must start and end with a letter and can contain 2 to 60 characters, including letters, digits, hyphens (-), and underscores (_). 
     * @return Handler Name of the handler, which is in the 'file name.handler name' form. Use periods (.) to separate a file name and function name. The file name and function name must start and end with a letter and can contain 2 to 60 characters, including letters, digits, hyphens (-), and underscores (_).
     */
    public String getHandler() {
        return this.Handler;
    }

    /**
     * Set Name of the handler, which is in the 'file name.handler name' form. Use periods (.) to separate a file name and function name. The file name and function name must start and end with a letter and can contain 2 to 60 characters, including letters, digits, hyphens (-), and underscores (_).
     * @param Handler Name of the handler, which is in the 'file name.handler name' form. Use periods (.) to separate a file name and function name. The file name and function name must start and end with a letter and can contain 2 to 60 characters, including letters, digits, hyphens (-), and underscores (_).
     */
    public void setHandler(String Handler) {
        this.Handler = Handler;
    }

    /**
     * Get Function description. It can contain up to 1,000 characters including letters, digits, spaces, commas (,), periods (.), and Chinese characters. 
     * @return Description Function description. It can contain up to 1,000 characters including letters, digits, spaces, commas (,), periods (.), and Chinese characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Function description. It can contain up to 1,000 characters including letters, digits, spaces, commas (,), periods (.), and Chinese characters.
     * @param Description Function description. It can contain up to 1,000 characters including letters, digits, spaces, commas (,), periods (.), and Chinese characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Memory size available for function during execution. Default value: 128 MB. Value range: 64 or 128-3072 MB in increments of 128 MB 
     * @return MemorySize Memory size available for function during execution. Default value: 128 MB. Value range: 64 or 128-3072 MB in increments of 128 MB
     */
    public Long getMemorySize() {
        return this.MemorySize;
    }

    /**
     * Set Memory size available for function during execution. Default value: 128 MB. Value range: 64 or 128-3072 MB in increments of 128 MB
     * @param MemorySize Memory size available for function during execution. Default value: 128 MB. Value range: 64 or 128-3072 MB in increments of 128 MB
     */
    public void setMemorySize(Long MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * Get Maximum execution duration of function in seconds. Value range: 1-900 seconds. Default value: 3 seconds 
     * @return Timeout Maximum execution duration of function in seconds. Value range: 1-900 seconds. Default value: 3 seconds
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Maximum execution duration of function in seconds. Value range: 1-900 seconds. Default value: 3 seconds
     * @param Timeout Maximum execution duration of function in seconds. Value range: 1-900 seconds. Default value: 3 seconds
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Function environment variable 
     * @return Environment Function environment variable
     */
    public Environment getEnvironment() {
        return this.Environment;
    }

    /**
     * Set Function environment variable
     * @param Environment Function environment variable
     */
    public void setEnvironment(Environment Environment) {
        this.Environment = Environment;
    }

    /**
     * Get Function runtime environment. Valid values: Python2.7, Python3.6, Nodejs6.10, Nodejs8.9, Nodejs10.15, Nodejs12.16, PHP5, PHP7, Golang1 and Java8. Default value: Python2.7 
     * @return Runtime Function runtime environment. Valid values: Python2.7, Python3.6, Nodejs6.10, Nodejs8.9, Nodejs10.15, Nodejs12.16, PHP5, PHP7, Golang1 and Java8. Default value: Python2.7
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set Function runtime environment. Valid values: Python2.7, Python3.6, Nodejs6.10, Nodejs8.9, Nodejs10.15, Nodejs12.16, PHP5, PHP7, Golang1 and Java8. Default value: Python2.7
     * @param Runtime Function runtime environment. Valid values: Python2.7, Python3.6, Nodejs6.10, Nodejs8.9, Nodejs10.15, Nodejs12.16, PHP5, PHP7, Golang1 and Java8. Default value: Python2.7
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get Function VPC configuration 
     * @return VpcConfig Function VPC configuration
     */
    public VpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set Function VPC configuration
     * @param VpcConfig Function VPC configuration
     */
    public void setVpcConfig(VpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
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
     * Get Role bound to the function 
     * @return Role Role bound to the function
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Role bound to the function
     * @param Role Role bound to the function
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get CLS Logset ID to which the function logs are shipped 
     * @return ClsLogsetId CLS Logset ID to which the function logs are shipped
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set CLS Logset ID to which the function logs are shipped
     * @param ClsLogsetId CLS Logset ID to which the function logs are shipped
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get CLS Topic ID to which the function logs are shipped 
     * @return ClsTopicId CLS Topic ID to which the function logs are shipped
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set CLS Topic ID to which the function logs are shipped
     * @param ClsTopicId CLS Topic ID to which the function logs are shipped
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get Function type. The default value is `Event`. Enter `Event` if you need to create a trigger function. Enter `HTTP` if you need to create an HTTP function service. 
     * @return Type Function type. The default value is `Event`. Enter `Event` if you need to create a trigger function. Enter `HTTP` if you need to create an HTTP function service.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Function type. The default value is `Event`. Enter `Event` if you need to create a trigger function. Enter `HTTP` if you need to create an HTTP function service.
     * @param Type Function type. The default value is `Event`. Enter `Event` if you need to create a trigger function. Enter `HTTP` if you need to create an HTTP function service.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Code source, including ZipFile, Cos, Demo, TempCos, and Git. This field is required if the source is Git. 
     * @return CodeSource Code source, including ZipFile, Cos, Demo, TempCos, and Git. This field is required if the source is Git.
     */
    public String getCodeSource() {
        return this.CodeSource;
    }

    /**
     * Set Code source, including ZipFile, Cos, Demo, TempCos, and Git. This field is required if the source is Git.
     * @param CodeSource Code source, including ZipFile, Cos, Demo, TempCos, and Git. This field is required if the source is Git.
     */
    public void setCodeSource(String CodeSource) {
        this.CodeSource = CodeSource;
    }

    /**
     * Get List of layer versions to be associate with the function. Layers will be overwritten sequentially in the order in the list. 
     * @return Layers List of layer versions to be associate with the function. Layers will be overwritten sequentially in the order in the list.
     */
    public LayerVersionSimple [] getLayers() {
        return this.Layers;
    }

    /**
     * Set List of layer versions to be associate with the function. Layers will be overwritten sequentially in the order in the list.
     * @param Layers List of layer versions to be associate with the function. Layers will be overwritten sequentially in the order in the list.
     */
    public void setLayers(LayerVersionSimple [] Layers) {
        this.Layers = Layers;
    }

    /**
     * Get Dead letter queue parameter 
     * @return DeadLetterConfig Dead letter queue parameter
     */
    public DeadLetterConfig getDeadLetterConfig() {
        return this.DeadLetterConfig;
    }

    /**
     * Set Dead letter queue parameter
     * @param DeadLetterConfig Dead letter queue parameter
     */
    public void setDeadLetterConfig(DeadLetterConfig DeadLetterConfig) {
        this.DeadLetterConfig = DeadLetterConfig;
    }

    /**
     * Get Public network access configuration 
     * @return PublicNetConfig Public network access configuration
     */
    public PublicNetConfigIn getPublicNetConfig() {
        return this.PublicNetConfig;
    }

    /**
     * Set Public network access configuration
     * @param PublicNetConfig Public network access configuration
     */
    public void setPublicNetConfig(PublicNetConfigIn PublicNetConfig) {
        this.PublicNetConfig = PublicNetConfig;
    }

    /**
     * Get File system configuration parameter, which is used for the function to mount the file system 
     * @return CfsConfig File system configuration parameter, which is used for the function to mount the file system
     */
    public CfsConfig getCfsConfig() {
        return this.CfsConfig;
    }

    /**
     * Set File system configuration parameter, which is used for the function to mount the file system
     * @param CfsConfig File system configuration parameter, which is used for the function to mount the file system
     */
    public void setCfsConfig(CfsConfig CfsConfig) {
        this.CfsConfig = CfsConfig;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamObj(map, prefix + "Code.", this.Code);
        this.setParamSimple(map, prefix + "Handler", this.Handler);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamObj(map, prefix + "Environment.", this.Environment);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CodeSource", this.CodeSource);
        this.setParamArrayObj(map, prefix + "Layers.", this.Layers);
        this.setParamObj(map, prefix + "DeadLetterConfig.", this.DeadLetterConfig);
        this.setParamObj(map, prefix + "PublicNetConfig.", this.PublicNetConfig);
        this.setParamObj(map, prefix + "CfsConfig.", this.CfsConfig);

    }
}

