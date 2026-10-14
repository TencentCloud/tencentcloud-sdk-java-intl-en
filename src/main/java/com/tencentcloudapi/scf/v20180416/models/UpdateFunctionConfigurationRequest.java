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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateFunctionConfigurationRequest extends AbstractModel {

    /**
    * The function name to be modified
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Function description. Supports up to 1,000 English letters, digits, spaces, commas, and periods. Chinese is supported.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Memory size of the function runtime. Default value: 128 MB. Selectable range: 64 MB, or 128 MB to 3072 MB in 128 MB increments.
    */
    @SerializedName("MemorySize")
    @Expose
    private Long MemorySize;

    /**
    * Maximum execution time of the function, in seconds. Value range: 1-900 seconds. Default value: 3 seconds.
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Runtime environment. It is specified upon creation and currently does not support modification.
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * Environment variable of the function
    */
    @SerializedName("Environment")
    @Expose
    private Environment Environment;

    /**
    * Namespace of the function
Default value: default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * VPC configuration of the function
    */
    @SerializedName("VpcConfig")
    @Expose
    private VpcConfig VpcConfig;

    /**
    * Role bound to a function
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * [Install dependency online](https://www.tencentcloud.com/document/product/583/37920?from_cn_redirect=1). TRUE indicates installation. Default value: FALSE. Only supported for Node.js functions.
    */
    @SerializedName("InstallDependency")
    @Expose
    private String InstallDependency;

    /**
    * ID of the cls Log Set for log delivery
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * cls Topic ID for log delivery
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * Whether to release a new version synchronously when updating. Default value: FALSE, which means no new version is released.
    */
    @SerializedName("Publish")
    @Expose
    private String Publish;

    /**
    * Whether L5 access capability is enabled. TRUE to enable, FALSE to shutdown.
    */
    @SerializedName("L5Enable")
    @Expose
    private String L5Enable;

    /**
    * List of layer versions to associate with the function. The layer versions overwrite each other sequentially in the order in the list.
    */
    @SerializedName("Layers")
    @Expose
    private LayerVersionSimple [] Layers;

    /**
    * Dead letter queue information associated with the function
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
    * File system configuration parameters for binding a CFS file system in SCF
    */
    @SerializedName("CfsConfig")
    @Expose
    private CfsConfig CfsConfig;

    /**
    * Function initialization timeout period
    */
    @SerializedName("InitTimeout")
    @Expose
    private Long InitTimeout;

    /**
    * Configure ProtocolType access protocol for an HTTP function. Parameters configurable for the current protocol.
    */
    @SerializedName("ProtocolParams")
    @Expose
    private ProtocolParams ProtocolParams;

    /**
    * Single-instance multi-concurrency configuration. Supports only Web functions.
    */
    @SerializedName("InstanceConcurrencyConfig")
    @Expose
    private InstanceConcurrencyConfig InstanceConcurrencyConfig;

    /**
    * Whether the Dns caching capability is enabled. Supports only the EVENT function. Defaults to FALSE. TRUE to enable, FALSE to shutdown.
    */
    @SerializedName("DnsCache")
    @Expose
    private String DnsCache;

    /**
    * Private network access configuration
    */
    @SerializedName("IntranetConfig")
    @Expose
    private IntranetConfigIn IntranetConfig;

    /**
    * Ignorable system log reporting
    */
    @SerializedName("IgnoreSysLog")
    @Expose
    private Boolean IgnoreSysLog;

    /**
     * Get The function name to be modified 
     * @return FunctionName The function name to be modified
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set The function name to be modified
     * @param FunctionName The function name to be modified
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Function description. Supports up to 1,000 English letters, digits, spaces, commas, and periods. Chinese is supported. 
     * @return Description Function description. Supports up to 1,000 English letters, digits, spaces, commas, and periods. Chinese is supported.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Function description. Supports up to 1,000 English letters, digits, spaces, commas, and periods. Chinese is supported.
     * @param Description Function description. Supports up to 1,000 English letters, digits, spaces, commas, and periods. Chinese is supported.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Memory size of the function runtime. Default value: 128 MB. Selectable range: 64 MB, or 128 MB to 3072 MB in 128 MB increments. 
     * @return MemorySize Memory size of the function runtime. Default value: 128 MB. Selectable range: 64 MB, or 128 MB to 3072 MB in 128 MB increments.
     */
    public Long getMemorySize() {
        return this.MemorySize;
    }

    /**
     * Set Memory size of the function runtime. Default value: 128 MB. Selectable range: 64 MB, or 128 MB to 3072 MB in 128 MB increments.
     * @param MemorySize Memory size of the function runtime. Default value: 128 MB. Selectable range: 64 MB, or 128 MB to 3072 MB in 128 MB increments.
     */
    public void setMemorySize(Long MemorySize) {
        this.MemorySize = MemorySize;
    }

    /**
     * Get Maximum execution time of the function, in seconds. Value range: 1-900 seconds. Default value: 3 seconds. 
     * @return Timeout Maximum execution time of the function, in seconds. Value range: 1-900 seconds. Default value: 3 seconds.
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Maximum execution time of the function, in seconds. Value range: 1-900 seconds. Default value: 3 seconds.
     * @param Timeout Maximum execution time of the function, in seconds. Value range: 1-900 seconds. Default value: 3 seconds.
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Runtime environment. It is specified upon creation and currently does not support modification. 
     * @return Runtime Runtime environment. It is specified upon creation and currently does not support modification.
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set Runtime environment. It is specified upon creation and currently does not support modification.
     * @param Runtime Runtime environment. It is specified upon creation and currently does not support modification.
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get Environment variable of the function 
     * @return Environment Environment variable of the function
     */
    public Environment getEnvironment() {
        return this.Environment;
    }

    /**
     * Set Environment variable of the function
     * @param Environment Environment variable of the function
     */
    public void setEnvironment(Environment Environment) {
        this.Environment = Environment;
    }

    /**
     * Get Namespace of the function
Default value: default 
     * @return Namespace Namespace of the function
Default value: default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace of the function
Default value: default
     * @param Namespace Namespace of the function
Default value: default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get VPC configuration of the function 
     * @return VpcConfig VPC configuration of the function
     */
    public VpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set VPC configuration of the function
     * @param VpcConfig VPC configuration of the function
     */
    public void setVpcConfig(VpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get Role bound to a function 
     * @return Role Role bound to a function
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Role bound to a function
     * @param Role Role bound to a function
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get [Install dependency online](https://www.tencentcloud.com/document/product/583/37920?from_cn_redirect=1). TRUE indicates installation. Default value: FALSE. Only supported for Node.js functions. 
     * @return InstallDependency [Install dependency online](https://www.tencentcloud.com/document/product/583/37920?from_cn_redirect=1). TRUE indicates installation. Default value: FALSE. Only supported for Node.js functions.
     */
    public String getInstallDependency() {
        return this.InstallDependency;
    }

    /**
     * Set [Install dependency online](https://www.tencentcloud.com/document/product/583/37920?from_cn_redirect=1). TRUE indicates installation. Default value: FALSE. Only supported for Node.js functions.
     * @param InstallDependency [Install dependency online](https://www.tencentcloud.com/document/product/583/37920?from_cn_redirect=1). TRUE indicates installation. Default value: FALSE. Only supported for Node.js functions.
     */
    public void setInstallDependency(String InstallDependency) {
        this.InstallDependency = InstallDependency;
    }

    /**
     * Get ID of the cls Log Set for log delivery 
     * @return ClsLogsetId ID of the cls Log Set for log delivery
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set ID of the cls Log Set for log delivery
     * @param ClsLogsetId ID of the cls Log Set for log delivery
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get cls Topic ID for log delivery 
     * @return ClsTopicId cls Topic ID for log delivery
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set cls Topic ID for log delivery
     * @param ClsTopicId cls Topic ID for log delivery
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get Whether to release a new version synchronously when updating. Default value: FALSE, which means no new version is released. 
     * @return Publish Whether to release a new version synchronously when updating. Default value: FALSE, which means no new version is released.
     */
    public String getPublish() {
        return this.Publish;
    }

    /**
     * Set Whether to release a new version synchronously when updating. Default value: FALSE, which means no new version is released.
     * @param Publish Whether to release a new version synchronously when updating. Default value: FALSE, which means no new version is released.
     */
    public void setPublish(String Publish) {
        this.Publish = Publish;
    }

    /**
     * Get Whether L5 access capability is enabled. TRUE to enable, FALSE to shutdown. 
     * @return L5Enable Whether L5 access capability is enabled. TRUE to enable, FALSE to shutdown.
     */
    public String getL5Enable() {
        return this.L5Enable;
    }

    /**
     * Set Whether L5 access capability is enabled. TRUE to enable, FALSE to shutdown.
     * @param L5Enable Whether L5 access capability is enabled. TRUE to enable, FALSE to shutdown.
     */
    public void setL5Enable(String L5Enable) {
        this.L5Enable = L5Enable;
    }

    /**
     * Get List of layer versions to associate with the function. The layer versions overwrite each other sequentially in the order in the list. 
     * @return Layers List of layer versions to associate with the function. The layer versions overwrite each other sequentially in the order in the list.
     */
    public LayerVersionSimple [] getLayers() {
        return this.Layers;
    }

    /**
     * Set List of layer versions to associate with the function. The layer versions overwrite each other sequentially in the order in the list.
     * @param Layers List of layer versions to associate with the function. The layer versions overwrite each other sequentially in the order in the list.
     */
    public void setLayers(LayerVersionSimple [] Layers) {
        this.Layers = Layers;
    }

    /**
     * Get Dead letter queue information associated with the function 
     * @return DeadLetterConfig Dead letter queue information associated with the function
     */
    public DeadLetterConfig getDeadLetterConfig() {
        return this.DeadLetterConfig;
    }

    /**
     * Set Dead letter queue information associated with the function
     * @param DeadLetterConfig Dead letter queue information associated with the function
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
     * Get File system configuration parameters for binding a CFS file system in SCF 
     * @return CfsConfig File system configuration parameters for binding a CFS file system in SCF
     */
    public CfsConfig getCfsConfig() {
        return this.CfsConfig;
    }

    /**
     * Set File system configuration parameters for binding a CFS file system in SCF
     * @param CfsConfig File system configuration parameters for binding a CFS file system in SCF
     */
    public void setCfsConfig(CfsConfig CfsConfig) {
        this.CfsConfig = CfsConfig;
    }

    /**
     * Get Function initialization timeout period 
     * @return InitTimeout Function initialization timeout period
     */
    public Long getInitTimeout() {
        return this.InitTimeout;
    }

    /**
     * Set Function initialization timeout period
     * @param InitTimeout Function initialization timeout period
     */
    public void setInitTimeout(Long InitTimeout) {
        this.InitTimeout = InitTimeout;
    }

    /**
     * Get Configure ProtocolType access protocol for an HTTP function. Parameters configurable for the current protocol. 
     * @return ProtocolParams Configure ProtocolType access protocol for an HTTP function. Parameters configurable for the current protocol.
     */
    public ProtocolParams getProtocolParams() {
        return this.ProtocolParams;
    }

    /**
     * Set Configure ProtocolType access protocol for an HTTP function. Parameters configurable for the current protocol.
     * @param ProtocolParams Configure ProtocolType access protocol for an HTTP function. Parameters configurable for the current protocol.
     */
    public void setProtocolParams(ProtocolParams ProtocolParams) {
        this.ProtocolParams = ProtocolParams;
    }

    /**
     * Get Single-instance multi-concurrency configuration. Supports only Web functions. 
     * @return InstanceConcurrencyConfig Single-instance multi-concurrency configuration. Supports only Web functions.
     */
    public InstanceConcurrencyConfig getInstanceConcurrencyConfig() {
        return this.InstanceConcurrencyConfig;
    }

    /**
     * Set Single-instance multi-concurrency configuration. Supports only Web functions.
     * @param InstanceConcurrencyConfig Single-instance multi-concurrency configuration. Supports only Web functions.
     */
    public void setInstanceConcurrencyConfig(InstanceConcurrencyConfig InstanceConcurrencyConfig) {
        this.InstanceConcurrencyConfig = InstanceConcurrencyConfig;
    }

    /**
     * Get Whether the Dns caching capability is enabled. Supports only the EVENT function. Defaults to FALSE. TRUE to enable, FALSE to shutdown. 
     * @return DnsCache Whether the Dns caching capability is enabled. Supports only the EVENT function. Defaults to FALSE. TRUE to enable, FALSE to shutdown.
     */
    public String getDnsCache() {
        return this.DnsCache;
    }

    /**
     * Set Whether the Dns caching capability is enabled. Supports only the EVENT function. Defaults to FALSE. TRUE to enable, FALSE to shutdown.
     * @param DnsCache Whether the Dns caching capability is enabled. Supports only the EVENT function. Defaults to FALSE. TRUE to enable, FALSE to shutdown.
     */
    public void setDnsCache(String DnsCache) {
        this.DnsCache = DnsCache;
    }

    /**
     * Get Private network access configuration 
     * @return IntranetConfig Private network access configuration
     */
    public IntranetConfigIn getIntranetConfig() {
        return this.IntranetConfig;
    }

    /**
     * Set Private network access configuration
     * @param IntranetConfig Private network access configuration
     */
    public void setIntranetConfig(IntranetConfigIn IntranetConfig) {
        this.IntranetConfig = IntranetConfig;
    }

    /**
     * Get Ignorable system log reporting 
     * @return IgnoreSysLog Ignorable system log reporting
     */
    public Boolean getIgnoreSysLog() {
        return this.IgnoreSysLog;
    }

    /**
     * Set Ignorable system log reporting
     * @param IgnoreSysLog Ignorable system log reporting
     */
    public void setIgnoreSysLog(Boolean IgnoreSysLog) {
        this.IgnoreSysLog = IgnoreSysLog;
    }

    public UpdateFunctionConfigurationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFunctionConfigurationRequest(UpdateFunctionConfigurationRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
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
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.Environment != null) {
            this.Environment = new Environment(source.Environment);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.VpcConfig != null) {
            this.VpcConfig = new VpcConfig(source.VpcConfig);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.InstallDependency != null) {
            this.InstallDependency = new String(source.InstallDependency);
        }
        if (source.ClsLogsetId != null) {
            this.ClsLogsetId = new String(source.ClsLogsetId);
        }
        if (source.ClsTopicId != null) {
            this.ClsTopicId = new String(source.ClsTopicId);
        }
        if (source.Publish != null) {
            this.Publish = new String(source.Publish);
        }
        if (source.L5Enable != null) {
            this.L5Enable = new String(source.L5Enable);
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
        if (source.ProtocolParams != null) {
            this.ProtocolParams = new ProtocolParams(source.ProtocolParams);
        }
        if (source.InstanceConcurrencyConfig != null) {
            this.InstanceConcurrencyConfig = new InstanceConcurrencyConfig(source.InstanceConcurrencyConfig);
        }
        if (source.DnsCache != null) {
            this.DnsCache = new String(source.DnsCache);
        }
        if (source.IntranetConfig != null) {
            this.IntranetConfig = new IntranetConfigIn(source.IntranetConfig);
        }
        if (source.IgnoreSysLog != null) {
            this.IgnoreSysLog = new Boolean(source.IgnoreSysLog);
        }
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
        this.setParamSimple(map, prefix + "InstallDependency", this.InstallDependency);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "Publish", this.Publish);
        this.setParamSimple(map, prefix + "L5Enable", this.L5Enable);
        this.setParamArrayObj(map, prefix + "Layers.", this.Layers);
        this.setParamObj(map, prefix + "DeadLetterConfig.", this.DeadLetterConfig);
        this.setParamObj(map, prefix + "PublicNetConfig.", this.PublicNetConfig);
        this.setParamObj(map, prefix + "CfsConfig.", this.CfsConfig);
        this.setParamSimple(map, prefix + "InitTimeout", this.InitTimeout);
        this.setParamObj(map, prefix + "ProtocolParams.", this.ProtocolParams);
        this.setParamObj(map, prefix + "InstanceConcurrencyConfig.", this.InstanceConcurrencyConfig);
        this.setParamSimple(map, prefix + "DnsCache", this.DnsCache);
        this.setParamObj(map, prefix + "IntranetConfig.", this.IntranetConfig);
        this.setParamSimple(map, prefix + "IgnoreSysLog", this.IgnoreSysLog);

    }
}

