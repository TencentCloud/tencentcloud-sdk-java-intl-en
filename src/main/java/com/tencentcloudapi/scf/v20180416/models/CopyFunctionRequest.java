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

public class CopyFunctionRequest extends AbstractModel{

    /**
    * Name of the function to be replicated
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Name of the new function
    */
    @SerializedName("NewFunctionName")
    @Expose
    private String NewFunctionName;

    /**
    * Namespace of the function to be replicated. The default value is `default`.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Namespace of the replicated function. The default value is default.
    */
    @SerializedName("TargetNamespace")
    @Expose
    private String TargetNamespace;

    /**
    * Description of the new function
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Region of the target of the function replication. If the value is not set, the current region is used by default.
    */
    @SerializedName("TargetRegion")
    @Expose
    private String TargetRegion;

    /**
    * It specifies whether to replace the function with the same name in the target namespace. The default option is `FALSE`.
(Note: The `TRUE` option results in deletion of the function in the target namespace. Please operate with caution.)
TRUE: Replaces the function.
FALSE: Does not replace the function.
    */
    @SerializedName("Override")
    @Expose
    private Boolean Override;

    /**
    * It specifies whether to replicate the function attributes, including environment variables, memory, timeout, function description, labels, and VPC. The default value is `TRUE`.
TRUE: Replicates the function configuration.
FALSE: Does not replicate the function configuration.
    */
    @SerializedName("CopyConfiguration")
    @Expose
    private Boolean CopyConfiguration;

    /**
     * Get Name of the function to be replicated 
     * @return FunctionName Name of the function to be replicated
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Name of the function to be replicated
     * @param FunctionName Name of the function to be replicated
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Name of the new function 
     * @return NewFunctionName Name of the new function
     */
    public String getNewFunctionName() {
        return this.NewFunctionName;
    }

    /**
     * Set Name of the new function
     * @param NewFunctionName Name of the new function
     */
    public void setNewFunctionName(String NewFunctionName) {
        this.NewFunctionName = NewFunctionName;
    }

    /**
     * Get Namespace of the function to be replicated. The default value is `default`. 
     * @return Namespace Namespace of the function to be replicated. The default value is `default`.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace of the function to be replicated. The default value is `default`.
     * @param Namespace Namespace of the function to be replicated. The default value is `default`.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Namespace of the replicated function. The default value is default. 
     * @return TargetNamespace Namespace of the replicated function. The default value is default.
     */
    public String getTargetNamespace() {
        return this.TargetNamespace;
    }

    /**
     * Set Namespace of the replicated function. The default value is default.
     * @param TargetNamespace Namespace of the replicated function. The default value is default.
     */
    public void setTargetNamespace(String TargetNamespace) {
        this.TargetNamespace = TargetNamespace;
    }

    /**
     * Get Description of the new function 
     * @return Description Description of the new function
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of the new function
     * @param Description Description of the new function
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Region of the target of the function replication. If the value is not set, the current region is used by default. 
     * @return TargetRegion Region of the target of the function replication. If the value is not set, the current region is used by default.
     */
    public String getTargetRegion() {
        return this.TargetRegion;
    }

    /**
     * Set Region of the target of the function replication. If the value is not set, the current region is used by default.
     * @param TargetRegion Region of the target of the function replication. If the value is not set, the current region is used by default.
     */
    public void setTargetRegion(String TargetRegion) {
        this.TargetRegion = TargetRegion;
    }

    /**
     * Get It specifies whether to replace the function with the same name in the target namespace. The default option is `FALSE`.
(Note: The `TRUE` option results in deletion of the function in the target namespace. Please operate with caution.)
TRUE: Replaces the function.
FALSE: Does not replace the function. 
     * @return Override It specifies whether to replace the function with the same name in the target namespace. The default option is `FALSE`.
(Note: The `TRUE` option results in deletion of the function in the target namespace. Please operate with caution.)
TRUE: Replaces the function.
FALSE: Does not replace the function.
     */
    public Boolean getOverride() {
        return this.Override;
    }

    /**
     * Set It specifies whether to replace the function with the same name in the target namespace. The default option is `FALSE`.
(Note: The `TRUE` option results in deletion of the function in the target namespace. Please operate with caution.)
TRUE: Replaces the function.
FALSE: Does not replace the function.
     * @param Override It specifies whether to replace the function with the same name in the target namespace. The default option is `FALSE`.
(Note: The `TRUE` option results in deletion of the function in the target namespace. Please operate with caution.)
TRUE: Replaces the function.
FALSE: Does not replace the function.
     */
    public void setOverride(Boolean Override) {
        this.Override = Override;
    }

    /**
     * Get It specifies whether to replicate the function attributes, including environment variables, memory, timeout, function description, labels, and VPC. The default value is `TRUE`.
TRUE: Replicates the function configuration.
FALSE: Does not replicate the function configuration. 
     * @return CopyConfiguration It specifies whether to replicate the function attributes, including environment variables, memory, timeout, function description, labels, and VPC. The default value is `TRUE`.
TRUE: Replicates the function configuration.
FALSE: Does not replicate the function configuration.
     */
    public Boolean getCopyConfiguration() {
        return this.CopyConfiguration;
    }

    /**
     * Set It specifies whether to replicate the function attributes, including environment variables, memory, timeout, function description, labels, and VPC. The default value is `TRUE`.
TRUE: Replicates the function configuration.
FALSE: Does not replicate the function configuration.
     * @param CopyConfiguration It specifies whether to replicate the function attributes, including environment variables, memory, timeout, function description, labels, and VPC. The default value is `TRUE`.
TRUE: Replicates the function configuration.
FALSE: Does not replicate the function configuration.
     */
    public void setCopyConfiguration(Boolean CopyConfiguration) {
        this.CopyConfiguration = CopyConfiguration;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "NewFunctionName", this.NewFunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "TargetNamespace", this.TargetNamespace);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TargetRegion", this.TargetRegion);
        this.setParamSimple(map, prefix + "Override", this.Override);
        this.setParamSimple(map, prefix + "CopyConfiguration", this.CopyConfiguration);

    }
}

