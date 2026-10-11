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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationLog extends AbstractModel {

    /**
    * <p>EMR instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * <p>Operation name.</p>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * <p>Operation type.</p>
    */
    @SerializedName("OperationType")
    @Expose
    private Long OperationType;

    /**
    * <p>User type.</p>
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
    * <p>Operator.</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>Operation time.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Operation object.</p>
    */
    @SerializedName("Operand")
    @Expose
    private String Operand;

    /**
    * <p>Operation details.</p>
    */
    @SerializedName("OperationDesc")
    @Expose
    private String OperationDesc;

    /**
    * <p>Security level.</p>
    */
    @SerializedName("SecurityLevel")
    @Expose
    private String SecurityLevel;

    /**
    * <p>Operator name.</p>
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
     * Get <p>EMR instance ID.</p> 
     * @return InstanceId <p>EMR instance ID.</p>
     */
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>EMR instance ID.</p>
     * @param InstanceId <p>EMR instance ID.</p>
     */
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Operation name.</p> 
     * @return Operation <p>Operation name.</p>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set <p>Operation name.</p>
     * @param Operation <p>Operation name.</p>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get <p>Operation type.</p> 
     * @return OperationType <p>Operation type.</p>
     */
    public Long getOperationType() {
        return this.OperationType;
    }

    /**
     * Set <p>Operation type.</p>
     * @param OperationType <p>Operation type.</p>
     */
    public void setOperationType(Long OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get <p>User type.</p> 
     * @return UserType <p>User type.</p>
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set <p>User type.</p>
     * @param UserType <p>User type.</p>
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    /**
     * Get <p>Operator.</p> 
     * @return Operator <p>Operator.</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>Operator.</p>
     * @param Operator <p>Operator.</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>Operation time.</p> 
     * @return CreateTime <p>Operation time.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Operation time.</p>
     * @param CreateTime <p>Operation time.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Operation object.</p> 
     * @return Operand <p>Operation object.</p>
     */
    public String getOperand() {
        return this.Operand;
    }

    /**
     * Set <p>Operation object.</p>
     * @param Operand <p>Operation object.</p>
     */
    public void setOperand(String Operand) {
        this.Operand = Operand;
    }

    /**
     * Get <p>Operation details.</p> 
     * @return OperationDesc <p>Operation details.</p>
     */
    public String getOperationDesc() {
        return this.OperationDesc;
    }

    /**
     * Set <p>Operation details.</p>
     * @param OperationDesc <p>Operation details.</p>
     */
    public void setOperationDesc(String OperationDesc) {
        this.OperationDesc = OperationDesc;
    }

    /**
     * Get <p>Security level.</p> 
     * @return SecurityLevel <p>Security level.</p>
     */
    public String getSecurityLevel() {
        return this.SecurityLevel;
    }

    /**
     * Set <p>Security level.</p>
     * @param SecurityLevel <p>Security level.</p>
     */
    public void setSecurityLevel(String SecurityLevel) {
        this.SecurityLevel = SecurityLevel;
    }

    /**
     * Get <p>Operator name.</p> 
     * @return OperatorName <p>Operator name.</p>
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set <p>Operator name.</p>
     * @param OperatorName <p>Operator name.</p>
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    public OperationLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperationLog(OperationLog source) {
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.OperationType != null) {
            this.OperationType = new Long(source.OperationType);
        }
        if (source.UserType != null) {
            this.UserType = new Long(source.UserType);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Operand != null) {
            this.Operand = new String(source.Operand);
        }
        if (source.OperationDesc != null) {
            this.OperationDesc = new String(source.OperationDesc);
        }
        if (source.SecurityLevel != null) {
            this.SecurityLevel = new String(source.SecurityLevel);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Operand", this.Operand);
        this.setParamSimple(map, prefix + "OperationDesc", this.OperationDesc);
        this.setParamSimple(map, prefix + "SecurityLevel", this.SecurityLevel);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);

    }
}

