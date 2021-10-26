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
    * Function code. Note: `COS`, `ZipFile`, and `DemoId` cannot be specified at the same time.
    */
    @SerializedName("Code")
    @Expose
    private Code Code;

    /**
    * Function handler name. It supports the format of "file name.handler name" where the file name and handler name are separated with a "." (for Java, it is in the format of "package name.class name::handler name"). File and handler names can contain 2–60 letters, digits, underscores, and dashes and must start and end with letters
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
    * Function runtime environment. Valid values: Python2.7, Python3.6, Nodejs6.10, Nodejs8.9, Nodejs10.15, Nodejs12.16, Php5, Php7, Go1, Java8, CustomRuntime. Default value: Python2.7
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
    * Code source. Valid values: ZipFile, Cos, Demo
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
    * The function initialization timeout period. It defaults to 65s for general cases and 90s for image deployment functions.
    */
    @SerializedName("InitTimeout")
    @Expose
    private Long InitTimeout;

    /**
    * Tag parameter of the function. It is an array of key-value pairs.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Whether to enable the async attribute. TRUE: yes; FALSE: no
    */
    @SerializedName("AsyncRunEnable")
    @Expose
    private String AsyncRunEnable;

    /**
    * Whether to enable event tracking. TRUE: yes; FALSE: no
    */
    @SerializedName("TraceEnable")
    @Expose
    private String TraceEnable;

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
     * Get Function code. Note: `COS`, `ZipFile`, and `DemoId` cannot be specified at the same time. 
     * @return Code Function code. Note: `COS`, `ZipFile`, and `DemoId` cannot be specified at the same time.
     */
    public Code getCode() {
        return this.Code;
    }

    /**
     * Set Function code. Note: `COS`, `ZipFile`, and `DemoId` cannot be specified at the same time.
     * @param Code Function code. Note: `COS`, `ZipFile`, and `DemoId` cannot be specified at the same time.
     */
    public void setCode(Code Code) {
        this.Code = Code;
    }

    /**
     * Get Function handler name. It supports the format of "file name.handler name" where the file name and handler name are separated with a "." (for Java, it is in the format of "package name.class name::handler name"). File and handler names can contain 2–60 letters, digits, underscores, and dashes and must start and end with letters 
     * @return Handler Function handler name. It supports the format of "file name.handler name" where the file name and handler name are separated with a "." (for Java, it is in the format of "package name.class name::handler name"). File and handler names can contain 2–60 letters, digits, underscores, and dashes and must start and end with letters
     */
    public String getHandler() {
        return this.Handler;
    }

    /**
     * Set Function handler name. It supports the format of "file name.handler name" where the file name and handler name are separated with a "." (for Java, it is in the format of "package name.class name::handler name"). File and handler names can contain 2–60 letters, digits, underscores, and dashes and must start and end with letters
     * @param Handler Function handler name. It supports the format of "file name.handler name" where the file name and handler name are separated with a "." (for Java, it is in the format of "package name.class name::handler name"). File and handler names can contain 2–60 letters, digits, underscores, and dashes and must start and end with letters
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
     * Get Function runtime environment. Valid values: Python2.7, Python3.6, Nodejs6.10, Nodejs8.9, Nodejs10.15, Nodejs12.16, Php5, Php7, Go1, Java8, CustomRuntime. Default value: Python2.7 
     * @return Runtime Function runtime environment. Valid values: Python2.7, Python3.6, Nodejs6.10, Nodejs8.9, Nodejs10.15, Nodejs12.16, Php5, Php7, Go1, Java8, CustomRuntime. Default value: Python2.7
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set Function runtime environment. Valid values: Python2.7, Python3.6, Nodejs6.10, Nodejs8.9, Nodejs10.15, Nodejs12.16, Php5, Php7, Go1, Java8, CustomRuntime. Default value: Python2.7
     * @param Runtime Function runtime environment. Valid values: Python2.7, Python3.6, Nodejs6.10, Nodejs8.9, Nodejs10.15, Nodejs12.16, Php5, Php7, Go1, Java8, CustomRuntime. Default value: Python2.7
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
     * Get Code source. Valid values: ZipFile, Cos, Demo 
     * @return CodeSource Code source. Valid values: ZipFile, Cos, Demo
     */
    public String getCodeSource() {
        return this.CodeSource;
    }

    /**
     * Set Code source. Valid values: ZipFile, Cos, Demo
     * @param CodeSource Code source. Valid values: ZipFile, Cos, Demo
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
     * Get The function initialization timeout period. It defaults to 65s for general cases and 90s for image deployment functions. 
     * @return InitTimeout The function initialization timeout period. It defaults to 65s for general cases and 90s for image deployment functions.
     */
    public Long getInitTimeout() {
        return this.InitTimeout;
    }

    /**
     * Set The function initialization timeout period. It defaults to 65s for general cases and 90s for image deployment functions.
     * @param InitTimeout The function initialization timeout period. It defaults to 65s for general cases and 90s for image deployment functions.
     */
    public void setInitTimeout(Long InitTimeout) {
        this.InitTimeout = InitTimeout;
    }

    /**
     * Get Tag parameter of the function. It is an array of key-value pairs. 
     * @return Tags Tag parameter of the function. It is an array of key-value pairs.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag parameter of the function. It is an array of key-value pairs.
     * @param Tags Tag parameter of the function. It is an array of key-value pairs.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Whether to enable the async attribute. TRUE: yes; FALSE: no 
     * @return AsyncRunEnable Whether to enable the async attribute. TRUE: yes; FALSE: no
     */
    public String getAsyncRunEnable() {
        return this.AsyncRunEnable;
    }

    /**
     * Set Whether to enable the async attribute. TRUE: yes; FALSE: no
     * @param AsyncRunEnable Whether to enable the async attribute. TRUE: yes; FALSE: no
     */
    public void setAsyncRunEnable(String AsyncRunEnable) {
        this.AsyncRunEnable = AsyncRunEnable;
    }

    /**
     * Get Whether to enable event tracking. TRUE: yes; FALSE: no 
     * @return TraceEnable Whether to enable event tracking. TRUE: yes; FALSE: no
     */
    public String getTraceEnable() {
        return this.TraceEnable;
    }

    /**
     * Set Whether to enable event tracking. TRUE: yes; FALSE: no
     * @param TraceEnable Whether to enable event tracking. TRUE: yes; FALSE: no
     */
    public void setTraceEnable(String TraceEnable) {
        this.TraceEnable = TraceEnable;
    }

    public CreateFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFunctionRequest(CreateFunctionRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Code != null) {
            this.Code = new Code(source.Code);
        }
        if (source.Handler != null) {
            this.Handler = new String(source.Handler);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.MemorySize != null) {
            this.MemorySize = new Long(source.MemorySize);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Environment != null) {
            this.Environment = new Environment(source.Environment);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.VpcConfig != null) {
            this.VpcConfig = new VpcConfig(source.VpcConfig);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.ClsLogsetId != null) {
            this.ClsLogsetId = new String(source.ClsLogsetId);
        }
        if (source.ClsTopicId != null) {
            this.ClsTopicId = new String(source.ClsTopicId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CodeSource != null) {
            this.CodeSource = new String(source.CodeSource);
        }
        if (source.Layers != null) {
            this.Layers = new LayerVersionSimple[source.Layers.length];
            for (int i = 0; i < source.Layers.length; i++) {
                this.Layers[i] = new LayerVersionSimple(source.Layers[i]);
            }
        }
        if (source.DeadLetterConfig != null) {
            this.DeadLetterConfig = new DeadLetterConfig(source.DeadLetterConfig);
        }
        if (source.PublicNetConfig != null) {
            this.PublicNetConfig = new PublicNetConfigIn(source.PublicNetConfig);
        }
        if (source.CfsConfig != null) {
            this.CfsConfig = new CfsConfig(source.CfsConfig);
        }
        if (source.InitTimeout != null) {
            this.InitTimeout = new Long(source.InitTimeout);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AsyncRunEnable != null) {
            this.AsyncRunEnable = new String(source.AsyncRunEnable);
        }
        if (source.TraceEnable != null) {
            this.TraceEnable = new String(source.TraceEnable);
        }
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
        this.setParamSimple(map, prefix + "InitTimeout", this.InitTimeout);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AsyncRunEnable", this.AsyncRunEnable);
        this.setParamSimple(map, prefix + "TraceEnable", this.TraceEnable);

    }
}

