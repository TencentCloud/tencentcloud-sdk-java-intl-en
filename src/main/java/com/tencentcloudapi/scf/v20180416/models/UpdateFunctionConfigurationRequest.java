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

public class UpdateFunctionConfigurationRequest extends AbstractModel{

    /**
    * Name of the function to be modified
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Function description. It can contain up to 1,000 characters, including letters, digits, spaces, commas (,), periods (.), and Chinese characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Memory size when the function is running. The value ranges from 128 MB (default) to 1,536 MB.
    */
    @SerializedName("MemorySize")
    @Expose
    private Long MemorySize;

    /**
    * The longest function running time. The unit is second (s). The value ranges from 1 to 300 seconds. The default value is 3 seconds.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Function running environment. Currently, only Python 2.7, Python 3.6, Nodejs 6.10, PHP 5, PHP 7, Golang 1, and Java 8 are supported.
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * Function environment variable
    */
    @SerializedName("Environment")
    @Expose
    private Environment Environment;

    /**
    * Function namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Function VPC configuration
    */
    @SerializedName("VpcConfig")
    @Expose
    private VpcConfig VpcConfig;

    /**
    * Role bound to the function
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * CLS logset ID to which logs are shipped
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * CLS Topic ID to which logs are shipped
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * It specifies whether to synchronously release a new version during the update. The default value is `FALSE`, indicating not to release a new version.
    */
    @SerializedName("Publish")
    @Expose
    private String Publish;

    /**
    * Whether to enable L5 access. TRUE: enable; FALSE: not enable
    */
    @SerializedName("L5Enable")
    @Expose
    private String L5Enable;

    /**
    * List of layer versions that bound with the function. Files with the same name will be overridden by the bound layer versions according to the ascending order in the list. 
    */
    @SerializedName("Layers")
    @Expose
    private LayerVersionSimple [] Layers;

    /**
    * Information of a dead letter queue associated with a function
    */
    @SerializedName("DeadLetterConfig")
    @Expose
    private DeadLetterConfig DeadLetterConfig;

    /**
    * Whether to enable Ons access. TRUE: enable; FALSE: not enable
    */
    @SerializedName("OnsEnable")
    @Expose
    private String OnsEnable;

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
     * Get Function description. It can contain up to 1,000 characters, including letters, digits, spaces, commas (,), periods (.), and Chinese characters. 
     * @return Description Function description. It can contain up to 1,000 characters, including letters, digits, spaces, commas (,), periods (.), and Chinese characters.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Function description. It can contain up to 1,000 characters, including letters, digits, spaces, commas (,), periods (.), and Chinese characters.
     * @param Description Function description. It can contain up to 1,000 characters, including letters, digits, spaces, commas (,), periods (.), and Chinese characters.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Memory size when the function is running. The value ranges from 128 MB (default) to 1,536 MB. 
     * @return MemorySize Memory size when the function is running. The value ranges from 128 MB (default) to 1,536 MB.
     */
    public Long getMemorySize() {
        return this.MemorySize;
    }

    /**
     * Set Memory size when the function is running. The value ranges from 128 MB (default) to 1,536 MB.
     * @param MemorySize Memory size when the function is running. The value ranges from 128 MB (default) to 1,536 MB.
     */
    public void setMemorySize(Long MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * Get The longest function running time. The unit is second (s). The value ranges from 1 to 300 seconds. The default value is 3 seconds. 
     * @return Timeout The longest function running time. The unit is second (s). The value ranges from 1 to 300 seconds. The default value is 3 seconds.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set The longest function running time. The unit is second (s). The value ranges from 1 to 300 seconds. The default value is 3 seconds.
     * @param Timeout The longest function running time. The unit is second (s). The value ranges from 1 to 300 seconds. The default value is 3 seconds.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Function running environment. Currently, only Python 2.7, Python 3.6, Nodejs 6.10, PHP 5, PHP 7, Golang 1, and Java 8 are supported. 
     * @return Runtime Function running environment. Currently, only Python 2.7, Python 3.6, Nodejs 6.10, PHP 5, PHP 7, Golang 1, and Java 8 are supported.
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set Function running environment. Currently, only Python 2.7, Python 3.6, Nodejs 6.10, PHP 5, PHP 7, Golang 1, and Java 8 are supported.
     * @param Runtime Function running environment. Currently, only Python 2.7, Python 3.6, Nodejs 6.10, PHP 5, PHP 7, Golang 1, and Java 8 are supported.
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
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
     * Get CLS logset ID to which logs are shipped 
     * @return ClsLogsetId CLS logset ID to which logs are shipped
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set CLS logset ID to which logs are shipped
     * @param ClsLogsetId CLS logset ID to which logs are shipped
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get CLS Topic ID to which logs are shipped 
     * @return ClsTopicId CLS Topic ID to which logs are shipped
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set CLS Topic ID to which logs are shipped
     * @param ClsTopicId CLS Topic ID to which logs are shipped
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
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
     * Get Whether to enable L5 access. TRUE: enable; FALSE: not enable 
     * @return L5Enable Whether to enable L5 access. TRUE: enable; FALSE: not enable
     */
    public String getL5Enable() {
        return this.L5Enable;
    }

    /**
     * Set Whether to enable L5 access. TRUE: enable; FALSE: not enable
     * @param L5Enable Whether to enable L5 access. TRUE: enable; FALSE: not enable
     */
    public void setL5Enable(String L5Enable) {
        this.L5Enable = L5Enable;
    }

    /**
     * Get List of layer versions that bound with the function. Files with the same name will be overridden by the bound layer versions according to the ascending order in the list.  
     * @return Layers List of layer versions that bound with the function. Files with the same name will be overridden by the bound layer versions according to the ascending order in the list. 
     */
    public LayerVersionSimple [] getLayers() {
        return this.Layers;
    }

    /**
     * Set List of layer versions that bound with the function. Files with the same name will be overridden by the bound layer versions according to the ascending order in the list. 
     * @param Layers List of layer versions that bound with the function. Files with the same name will be overridden by the bound layer versions according to the ascending order in the list. 
     */
    public void setLayers(LayerVersionSimple [] Layers) {
        this.Layers = Layers;
    }

    /**
     * Get Information of a dead letter queue associated with a function 
     * @return DeadLetterConfig Information of a dead letter queue associated with a function
     */
    public DeadLetterConfig getDeadLetterConfig() {
        return this.DeadLetterConfig;
    }

    /**
     * Set Information of a dead letter queue associated with a function
     * @param DeadLetterConfig Information of a dead letter queue associated with a function
     */
    public void setDeadLetterConfig(DeadLetterConfig DeadLetterConfig) {
        this.DeadLetterConfig = DeadLetterConfig;
    }

    /**
     * Get Whether to enable Ons access. TRUE: enable; FALSE: not enable 
     * @return OnsEnable Whether to enable Ons access. TRUE: enable; FALSE: not enable
     */
    public String getOnsEnable() {
        return this.OnsEnable;
    }

    /**
     * Set Whether to enable Ons access. TRUE: enable; FALSE: not enable
     * @param OnsEnable Whether to enable Ons access. TRUE: enable; FALSE: not enable
     */
    public void setOnsEnable(String OnsEnable) {
        this.OnsEnable = OnsEnable;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamObj(map, prefix + "Environment.", this.Environment);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "Publish", this.Publish);
        this.setParamSimple(map, prefix + "L5Enable", this.L5Enable);
        this.setParamArrayObj(map, prefix + "Layers.", this.Layers);
        this.setParamObj(map, prefix + "DeadLetterConfig.", this.DeadLetterConfig);
        this.setParamSimple(map, prefix + "OnsEnable", this.OnsEnable);

    }
}

