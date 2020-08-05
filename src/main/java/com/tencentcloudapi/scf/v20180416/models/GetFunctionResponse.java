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

public class GetFunctionResponse extends AbstractModel{

    /**
    * Latest modification time of the function
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * Function code
    */
    @SerializedName("CodeInfo")
    @Expose
    private String CodeInfo;

    /**
    * Function description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Function trigger list
    */
    @SerializedName("Triggers")
    @Expose
    private Trigger [] Triggers;

    /**
    * Function entry
    */
    @SerializedName("Handler")
    @Expose
    private String Handler;

    /**
    * Function code size
    */
    @SerializedName("CodeSize")
    @Expose
    private Long CodeSize;

    /**
    * Function timeout
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Function version
    */
    @SerializedName("FunctionVersion")
    @Expose
    private String FunctionVersion;

    /**
    * Maximum available memory of the function
    */
    @SerializedName("MemorySize")
    @Expose
    private Long MemorySize;

    /**
    * Function running environment
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * Function name
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Function VPC
    */
    @SerializedName("VpcConfig")
    @Expose
    private VpcConfig VpcConfig;

    /**
    * Whether to use GPU
    */
    @SerializedName("UseGpu")
    @Expose
    private String UseGpu;

    /**
    * Function environment variable
    */
    @SerializedName("Environment")
    @Expose
    private Environment Environment;

    /**
    * Whether the code is correct
    */
    @SerializedName("CodeResult")
    @Expose
    private String CodeResult;

    /**
    * Code error information
    */
    @SerializedName("CodeError")
    @Expose
    private String CodeError;

    /**
    * Error code
    */
    @SerializedName("ErrNo")
    @Expose
    private Long ErrNo;

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
    * Whether to install dependencies automatically
    */
    @SerializedName("InstallDependency")
    @Expose
    private String InstallDependency;

    /**
    * Function status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Status description
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * CLS logset to which logs are shipped
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * CLS Topic to which logs are shipped
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * Function ID
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * Function tag list
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * EipConfig configuration
    */
    @SerializedName("EipConfig")
    @Expose
    private EipOutConfig EipConfig;

    /**
    * Domain name information
    */
    @SerializedName("AccessInfo")
    @Expose
    private AccessInfo AccessInfo;

    /**
    * Function type. The value is `HTTP` or `Event`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Whether to enable L5
    */
    @SerializedName("L5Enable")
    @Expose
    private String L5Enable;

    /**
    * Version information of a layer associated with a function
    */
    @SerializedName("Layers")
    @Expose
    private LayerVersionInfo [] Layers;

    /**
    * Information of a dead letter queue associated with a function
    */
    @SerializedName("DeadLetterConfig")
    @Expose
    private DeadLetterConfig DeadLetterConfig;

    /**
    * Function creation time
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Public network access configuration
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicNetConfig")
    @Expose
    private PublicNetConfigOut PublicNetConfig;

    /**
    * Whether Ons is enabled
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("OnsEnable")
    @Expose
    private String OnsEnable;

    /**
    * File system configuration parameter, which is used for the function to mount the file system
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CfsConfig")
    @Expose
    private CfsConfig CfsConfig;

    /**
    * Function billing status
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AvailableStatus")
    @Expose
    private String AvailableStatus;

    /**
    * Function version
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Latest modification time of the function 
     * @return ModTime Latest modification time of the function
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set Latest modification time of the function
     * @param ModTime Latest modification time of the function
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get Function code 
     * @return CodeInfo Function code
     */
    public String getCodeInfo() {
        return this.CodeInfo;
    }

    /**
     * Set Function code
     * @param CodeInfo Function code
     */
    public void setCodeInfo(String CodeInfo) {
        this.CodeInfo = CodeInfo;
    }

    /**
     * Get Function description 
     * @return Description Function description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Function description
     * @param Description Function description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Function trigger list 
     * @return Triggers Function trigger list
     */
    public Trigger [] getTriggers() {
        return this.Triggers;
    }

    /**
     * Set Function trigger list
     * @param Triggers Function trigger list
     */
    public void setTriggers(Trigger [] Triggers) {
        this.Triggers = Triggers;
    }

    /**
     * Get Function entry 
     * @return Handler Function entry
     */
    public String getHandler() {
        return this.Handler;
    }

    /**
     * Set Function entry
     * @param Handler Function entry
     */
    public void setHandler(String Handler) {
        this.Handler = Handler;
    }

    /**
     * Get Function code size 
     * @return CodeSize Function code size
     */
    public Long getCodeSize() {
        return this.CodeSize;
    }

    /**
     * Set Function code size
     * @param CodeSize Function code size
     */
    public void setCodeSize(Long CodeSize) {
        this.CodeSize = CodeSize;
    }

    /**
     * Get Function timeout 
     * @return Timeout Function timeout
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Function timeout
     * @param Timeout Function timeout
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Function version 
     * @return FunctionVersion Function version
     */
    public String getFunctionVersion() {
        return this.FunctionVersion;
    }

    /**
     * Set Function version
     * @param FunctionVersion Function version
     */
    public void setFunctionVersion(String FunctionVersion) {
        this.FunctionVersion = FunctionVersion;
    }

    /**
     * Get Maximum available memory of the function 
     * @return MemorySize Maximum available memory of the function
     */
    public Long getMemorySize() {
        return this.MemorySize;
    }

    /**
     * Set Maximum available memory of the function
     * @param MemorySize Maximum available memory of the function
     */
    public void setMemorySize(Long MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * Get Function running environment 
     * @return Runtime Function running environment
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set Function running environment
     * @param Runtime Function running environment
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get Function name 
     * @return FunctionName Function name
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Function name
     * @param FunctionName Function name
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Function VPC 
     * @return VpcConfig Function VPC
     */
    public VpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set Function VPC
     * @param VpcConfig Function VPC
     */
    public void setVpcConfig(VpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get Whether to use GPU 
     * @return UseGpu Whether to use GPU
     */
    public String getUseGpu() {
        return this.UseGpu;
    }

    /**
     * Set Whether to use GPU
     * @param UseGpu Whether to use GPU
     */
    public void setUseGpu(String UseGpu) {
        this.UseGpu = UseGpu;
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
     * Get Whether the code is correct 
     * @return CodeResult Whether the code is correct
     */
    public String getCodeResult() {
        return this.CodeResult;
    }

    /**
     * Set Whether the code is correct
     * @param CodeResult Whether the code is correct
     */
    public void setCodeResult(String CodeResult) {
        this.CodeResult = CodeResult;
    }

    /**
     * Get Code error information 
     * @return CodeError Code error information
     */
    public String getCodeError() {
        return this.CodeError;
    }

    /**
     * Set Code error information
     * @param CodeError Code error information
     */
    public void setCodeError(String CodeError) {
        this.CodeError = CodeError;
    }

    /**
     * Get Error code 
     * @return ErrNo Error code
     */
    public Long getErrNo() {
        return this.ErrNo;
    }

    /**
     * Set Error code
     * @param ErrNo Error code
     */
    public void setErrNo(Long ErrNo) {
        this.ErrNo = ErrNo;
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
     * Get Whether to install dependencies automatically 
     * @return InstallDependency Whether to install dependencies automatically
     */
    public String getInstallDependency() {
        return this.InstallDependency;
    }

    /**
     * Set Whether to install dependencies automatically
     * @param InstallDependency Whether to install dependencies automatically
     */
    public void setInstallDependency(String InstallDependency) {
        this.InstallDependency = InstallDependency;
    }

    /**
     * Get Function status 
     * @return Status Function status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Function status
     * @param Status Function status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Status description 
     * @return StatusDesc Status description
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Status description
     * @param StatusDesc Status description
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get CLS logset to which logs are shipped 
     * @return ClsLogsetId CLS logset to which logs are shipped
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set CLS logset to which logs are shipped
     * @param ClsLogsetId CLS logset to which logs are shipped
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get CLS Topic to which logs are shipped 
     * @return ClsTopicId CLS Topic to which logs are shipped
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set CLS Topic to which logs are shipped
     * @param ClsTopicId CLS Topic to which logs are shipped
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get Function ID 
     * @return FunctionId Function ID
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set Function ID
     * @param FunctionId Function ID
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get Function tag list 
     * @return Tags Function tag list
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Function tag list
     * @param Tags Function tag list
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get EipConfig configuration 
     * @return EipConfig EipConfig configuration
     */
    public EipOutConfig getEipConfig() {
        return this.EipConfig;
    }

    /**
     * Set EipConfig configuration
     * @param EipConfig EipConfig configuration
     */
    public void setEipConfig(EipOutConfig EipConfig) {
        this.EipConfig = EipConfig;
    }

    /**
     * Get Domain name information 
     * @return AccessInfo Domain name information
     */
    public AccessInfo getAccessInfo() {
        return this.AccessInfo;
    }

    /**
     * Set Domain name information
     * @param AccessInfo Domain name information
     */
    public void setAccessInfo(AccessInfo AccessInfo) {
        this.AccessInfo = AccessInfo;
    }

    /**
     * Get Function type. The value is `HTTP` or `Event`. 
     * @return Type Function type. The value is `HTTP` or `Event`.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Function type. The value is `HTTP` or `Event`.
     * @param Type Function type. The value is `HTTP` or `Event`.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Whether to enable L5 
     * @return L5Enable Whether to enable L5
     */
    public String getL5Enable() {
        return this.L5Enable;
    }

    /**
     * Set Whether to enable L5
     * @param L5Enable Whether to enable L5
     */
    public void setL5Enable(String L5Enable) {
        this.L5Enable = L5Enable;
    }

    /**
     * Get Version information of a layer associated with a function 
     * @return Layers Version information of a layer associated with a function
     */
    public LayerVersionInfo [] getLayers() {
        return this.Layers;
    }

    /**
     * Set Version information of a layer associated with a function
     * @param Layers Version information of a layer associated with a function
     */
    public void setLayers(LayerVersionInfo [] Layers) {
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
     * Get Function creation time 
     * @return AddTime Function creation time
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Function creation time
     * @param AddTime Function creation time
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Public network access configuration
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PublicNetConfig Public network access configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public PublicNetConfigOut getPublicNetConfig() {
        return this.PublicNetConfig;
    }

    /**
     * Set Public network access configuration
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PublicNetConfig Public network access configuration
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPublicNetConfig(PublicNetConfigOut PublicNetConfig) {
        this.PublicNetConfig = PublicNetConfig;
    }

    /**
     * Get Whether Ons is enabled
Note: This field may return null, indicating that no valid value was found. 
     * @return OnsEnable Whether Ons is enabled
Note: This field may return null, indicating that no valid value was found.
     */
    public String getOnsEnable() {
        return this.OnsEnable;
    }

    /**
     * Set Whether Ons is enabled
Note: This field may return null, indicating that no valid value was found.
     * @param OnsEnable Whether Ons is enabled
Note: This field may return null, indicating that no valid value was found.
     */
    public void setOnsEnable(String OnsEnable) {
        this.OnsEnable = OnsEnable;
    }

    /**
     * Get File system configuration parameter, which is used for the function to mount the file system
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CfsConfig File system configuration parameter, which is used for the function to mount the file system
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public CfsConfig getCfsConfig() {
        return this.CfsConfig;
    }

    /**
     * Set File system configuration parameter, which is used for the function to mount the file system
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CfsConfig File system configuration parameter, which is used for the function to mount the file system
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCfsConfig(CfsConfig CfsConfig) {
        this.CfsConfig = CfsConfig;
    }

    /**
     * Get Function billing status
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AvailableStatus Function billing status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAvailableStatus() {
        return this.AvailableStatus;
    }

    /**
     * Set Function billing status
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AvailableStatus Function billing status
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAvailableStatus(String AvailableStatus) {
        this.AvailableStatus = AvailableStatus;
    }

    /**
     * Get Function version
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Qualifier Function version
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Function version
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Qualifier Function version
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "CodeInfo", this.CodeInfo);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Triggers.", this.Triggers);
        this.setParamSimple(map, prefix + "Handler", this.Handler);
        this.setParamSimple(map, prefix + "CodeSize", this.CodeSize);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "FunctionVersion", this.FunctionVersion);
        this.setParamSimple(map, prefix + "MemorySize", this.MemorySize);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "UseGpu", this.UseGpu);
        this.setParamObj(map, prefix + "Environment.", this.Environment);
        this.setParamSimple(map, prefix + "CodeResult", this.CodeResult);
        this.setParamSimple(map, prefix + "CodeError", this.CodeError);
        this.setParamSimple(map, prefix + "ErrNo", this.ErrNo);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "InstallDependency", this.InstallDependency);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "EipConfig.", this.EipConfig);
        this.setParamObj(map, prefix + "AccessInfo.", this.AccessInfo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "L5Enable", this.L5Enable);
        this.setParamArrayObj(map, prefix + "Layers.", this.Layers);
        this.setParamObj(map, prefix + "DeadLetterConfig.", this.DeadLetterConfig);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamObj(map, prefix + "PublicNetConfig.", this.PublicNetConfig);
        this.setParamSimple(map, prefix + "OnsEnable", this.OnsEnable);
        this.setParamObj(map, prefix + "CfsConfig.", this.CfsConfig);
        this.setParamSimple(map, prefix + "AvailableStatus", this.AvailableStatus);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

