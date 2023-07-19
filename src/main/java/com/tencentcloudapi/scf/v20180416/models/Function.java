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

public class Function extends AbstractModel{

    /**
    * Modification time
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * Creation time
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * Runtime 
Note: This parameter may return null, indicating that no valid values can be obtained.
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
    * Function ID
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Function status. For valid values and status change process, please see [here](https://intl.cloud.tencent.com/document/product/583/47175?from_cn_redirect=1)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Function status details
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Function description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Function tag
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Function type. The value is `HTTP` or `Event`.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Cause of function failure
    */
    @SerializedName("StatusReasons")
    @Expose
    private StatusReason [] StatusReasons;

    /**
    * Sum of provisioned concurrence memory for all function versions
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalProvisionedConcurrencyMem")
    @Expose
    private Long TotalProvisionedConcurrencyMem;

    /**
    * Reserved memory for function concurrence
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReservedConcurrencyMem")
    @Expose
    private Long ReservedConcurrencyMem;

    /**
    * Asynchronization attribute of the function. Values: `TRUE` and `FALSE`.
    */
    @SerializedName("AsyncRunEnable")
    @Expose
    private String AsyncRunEnable;

    /**
    * Whether to enable call tracing for ansynchronized functions. Values: `TRUE` and `FALSE`.
    */
    @SerializedName("TraceEnable")
    @Expose
    private String TraceEnable;

    /**
     * Get Modification time 
     * @return ModTime Modification time
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set Modification time
     * @param ModTime Modification time
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get Creation time 
     * @return AddTime Creation time
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set Creation time
     * @param AddTime Creation time
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get Runtime 
Note: This parameter may return null, indicating that no valid values can be obtained. 
     * @return Runtime Runtime 
Note: This parameter may return null, indicating that no valid values can be obtained.
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set Runtime 
Note: This parameter may return null, indicating that no valid values can be obtained.
     * @param Runtime Runtime 
Note: This parameter may return null, indicating that no valid values can be obtained.
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
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Function status. For valid values and status change process, please see [here](https://intl.cloud.tencent.com/document/product/583/47175?from_cn_redirect=1) 
     * @return Status Function status. For valid values and status change process, please see [here](https://intl.cloud.tencent.com/document/product/583/47175?from_cn_redirect=1)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Function status. For valid values and status change process, please see [here](https://intl.cloud.tencent.com/document/product/583/47175?from_cn_redirect=1)
     * @param Status Function status. For valid values and status change process, please see [here](https://intl.cloud.tencent.com/document/product/583/47175?from_cn_redirect=1)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Function status details 
     * @return StatusDesc Function status details
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Function status details
     * @param StatusDesc Function status details
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
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
     * Get Function tag 
     * @return Tags Function tag
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Function tag
     * @param Tags Function tag
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
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
     * Get Cause of function failure 
     * @return StatusReasons Cause of function failure
     */
    public StatusReason [] getStatusReasons() {
        return this.StatusReasons;
    }

    /**
     * Set Cause of function failure
     * @param StatusReasons Cause of function failure
     */
    public void setStatusReasons(StatusReason [] StatusReasons) {
        this.StatusReasons = StatusReasons;
    }

    /**
     * Get Sum of provisioned concurrence memory for all function versions
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalProvisionedConcurrencyMem Sum of provisioned concurrence memory for all function versions
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalProvisionedConcurrencyMem() {
        return this.TotalProvisionedConcurrencyMem;
    }

    /**
     * Set Sum of provisioned concurrence memory for all function versions
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalProvisionedConcurrencyMem Sum of provisioned concurrence memory for all function versions
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalProvisionedConcurrencyMem(Long TotalProvisionedConcurrencyMem) {
        this.TotalProvisionedConcurrencyMem = TotalProvisionedConcurrencyMem;
    }

    /**
     * Get Reserved memory for function concurrence
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ReservedConcurrencyMem Reserved memory for function concurrence
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getReservedConcurrencyMem() {
        return this.ReservedConcurrencyMem;
    }

    /**
     * Set Reserved memory for function concurrence
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ReservedConcurrencyMem Reserved memory for function concurrence
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReservedConcurrencyMem(Long ReservedConcurrencyMem) {
        this.ReservedConcurrencyMem = ReservedConcurrencyMem;
    }

    /**
     * Get Asynchronization attribute of the function. Values: `TRUE` and `FALSE`. 
     * @return AsyncRunEnable Asynchronization attribute of the function. Values: `TRUE` and `FALSE`.
     */
    public String getAsyncRunEnable() {
        return this.AsyncRunEnable;
    }

    /**
     * Set Asynchronization attribute of the function. Values: `TRUE` and `FALSE`.
     * @param AsyncRunEnable Asynchronization attribute of the function. Values: `TRUE` and `FALSE`.
     */
    public void setAsyncRunEnable(String AsyncRunEnable) {
        this.AsyncRunEnable = AsyncRunEnable;
    }

    /**
     * Get Whether to enable call tracing for ansynchronized functions. Values: `TRUE` and `FALSE`. 
     * @return TraceEnable Whether to enable call tracing for ansynchronized functions. Values: `TRUE` and `FALSE`.
     */
    public String getTraceEnable() {
        return this.TraceEnable;
    }

    /**
     * Set Whether to enable call tracing for ansynchronized functions. Values: `TRUE` and `FALSE`.
     * @param TraceEnable Whether to enable call tracing for ansynchronized functions. Values: `TRUE` and `FALSE`.
     */
    public void setTraceEnable(String TraceEnable) {
        this.TraceEnable = TraceEnable;
    }

    public Function() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Function(Function source) {
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.StatusReasons != null) {
            this.StatusReasons = new StatusReason[source.StatusReasons.length];
            for (int i = 0; i < source.StatusReasons.length; i++) {
                this.StatusReasons[i] = new StatusReason(source.StatusReasons[i]);
            }
        }
        if (source.TotalProvisionedConcurrencyMem != null) {
            this.TotalProvisionedConcurrencyMem = new Long(source.TotalProvisionedConcurrencyMem);
        }
        if (source.ReservedConcurrencyMem != null) {
            this.ReservedConcurrencyMem = new Long(source.ReservedConcurrencyMem);
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
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "StatusReasons.", this.StatusReasons);
        this.setParamSimple(map, prefix + "TotalProvisionedConcurrencyMem", this.TotalProvisionedConcurrencyMem);
        this.setParamSimple(map, prefix + "ReservedConcurrencyMem", this.ReservedConcurrencyMem);
        this.setParamSimple(map, prefix + "AsyncRunEnable", this.AsyncRunEnable);
        this.setParamSimple(map, prefix + "TraceEnable", this.TraceEnable);

    }
}

